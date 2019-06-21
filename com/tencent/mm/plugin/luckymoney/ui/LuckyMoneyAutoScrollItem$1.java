package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyAutoScrollItem$1
  implements Runnable
{
  LuckyMoneyAutoScrollItem$1(LuckyMoneyAutoScrollItem paramLuckyMoneyAutoScrollItem, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42561);
    LuckyMoneyAutoScrollItem.a(this.ocd, new LuckyMoneyAutoScrollItem.1.1(this, this.occ).start());
    AppMethodBeat.o(42561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem.1
 * JD-Core Version:    0.6.2
 */