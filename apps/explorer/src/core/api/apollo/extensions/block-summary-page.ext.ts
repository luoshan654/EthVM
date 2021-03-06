import { BlockSummaryPage, BlockSummaryPage_items } from '@app/core/api/apollo/types/BlockSummaryPage'
import BN from 'bignumber.js'
import { FormattedNumber, NumberFormatHelper } from '@app/core/helper/number-format-helper'

export class BlockSummaryPageExt_items implements BlockSummaryPage_items {
  __typename!: 'BlockSummary'
  author!: string
  difficulty: any
  hash!: string
  numFailedTxs: any
  numSuccessfulTxs: any
  numTxs: any
  number: any
  reward: any
  timestamp!: any
  transactionHashes!: string[]
  uncleHashes!: string[]

  constructor(proto: any) {
    Object.assign(this, proto)
  }

  get numberBN(): BN {
    return new BN(this.number)
  }

  get numberFormatted(): string {
    return NumberFormatHelper.formatIntegerValue(this.numberBN).value
  }

  get numTxsBN(): BN {
    return new BN(this.numTxs)
  }

  get numTxsFromatted(): FormattedNumber {
    return NumberFormatHelper.formatIntegerValue(this.numTxsBN)
  }

  get numFailedTxsBN(): BN {
    return new BN(this.numFailedTxs)
  }

  get numFailedTxsFormatted(): FormattedNumber {
    return NumberFormatHelper.formatIntegerValue(this.numFailedTxsBN)
  }

  get numSuccessfulTxsBN(): BN {
    return new BN(this.numSuccessfulTxs)
  }

  get numSuccessfulTxsFormatted(): FormattedNumber {
    return NumberFormatHelper.formatIntegerValue(this.numSuccessfulTxsBN)
  }

  get rewardBN(): BN {
    return new BN(this.reward)
  }

  get rewardFormatted(): FormattedNumber {
    return NumberFormatHelper.formatNonVariableEthValue(this.rewardBN)
  }

  get difficultyBN(): BN {
    return new BN(this.difficulty)
  }

  get timestampDate(): Date {
    return new Date(this.timestamp)
  }
}

export class BlockSummaryPageExt implements BlockSummaryPage {
  __typename!: 'BlockSummaryPage'
  items: BlockSummaryPageExt_items[]
  totalCount: number

  constructor(proto: BlockSummaryPage) {
    this.items = proto.items!.map(s => new BlockSummaryPageExt_items(s))
    this.totalCount = proto.totalCount
  }

  get totalCountBN(): BN {
    return new BN(this.totalCount)
  }
}
