package com.tencent.mm.plugin.luckymoney.ui;

import android.os.CountDownTimer;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyAutoScrollItem$1$1 extends CountDownTimer
{
  LuckyMoneyAutoScrollItem$1$1(LuckyMoneyAutoScrollItem.1 param1, long paramLong)
  {
    super(paramLong, 50L);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(42560);
    if (LuckyMoneyAutoScrollItem.b(this.oce.ocd) != null)
      LuckyMoneyAutoScrollItem.b(this.oce.ocd).aQe();
    AppMethodBeat.o(42560);
  }

  public final void onTick(long paramLong)
  {
    AppMethodBeat.i(42559);
    this.oce.ocd.smoothScrollToPosition(LuckyMoneyAutoScrollItem.a(this.oce.ocd));
    AppMethodBeat.o(42559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem.1.1
 * JD-Core Version:    0.6.2
 */