package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyPrepareUI$12
  implements View.OnTouchListener
{
  WxaLuckyMoneyPrepareUI$12(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42067);
    if (paramMotionEvent.getAction() == 0)
    {
      this.nTo.aoB();
      this.nTo.aqX();
    }
    AppMethodBeat.o(42067);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.12
 * JD-Core Version:    0.6.2
 */