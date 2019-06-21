package com.tencent.mm.plugin.luckymoney.sns;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsLuckyMoneyPrepareUI$18
  implements View.OnTouchListener
{
  SnsLuckyMoneyPrepareUI$18(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42528);
    if (paramMotionEvent.getAction() == 0)
    {
      this.obN.aoB();
      this.obN.aqX();
    }
    AppMethodBeat.o(42528);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.18
 * JD-Core Version:    0.6.2
 */