import { EthVMServer, SocketEvent, SocketEventValidationResult } from '@app/server/ethvm-server'
import { Block,mappers} from '@app/server/modules/blocks'
import { logger } from 'logger';
import BigNumber from '../../../node_modules/bignumber.js';


const pastBlocksEvent: SocketEvent = {
  id: 'pastBlocks', // new_name: past_blocks

  onValidate: (server: EthVMServer, socket: SocketIO.Socket, payload: any): SocketEventValidationResult => {
    return {
      valid: true
    }
  },

  // TODO: Remove fliping blocks from here (blocks should be ordered properly from db)
  onEvent: (server: EthVMServer, socket: SocketIO.Socket, payload: any): Promise<Block[]> =>



      server.blockService.getBlocks(payload.limit, payload.page).then(
      (_blocks: Block[]): Block[] => {


        const blocks: Block[] = []
        _blocks.forEach(
          (block: Block): void => {
            const bstats = mappers.toBlockStats(block.transactions, new BigNumber(0))
            block.blockStats = { ...bstats, ...block.blockStats }
            blocks.unshift(mappers.toSmallBlock(block))
          }
        )

        return blocks
      }
    )

}

export default pastBlocksEvent
