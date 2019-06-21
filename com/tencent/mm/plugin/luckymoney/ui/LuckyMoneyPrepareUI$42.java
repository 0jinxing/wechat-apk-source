package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyPrepareUI$42
  implements View.OnTouchListener
{
  LuckyMoneyPrepareUI$42(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42992);
    if (paramMotionEvent.getAction() == 0)
    {
      this.ohI.aoB();
      this.ohI.aqX();
    }
    AppMethodBeat.o(42992);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.42
 * JD-Core Version:    0.6.2
 */