package com.tencent.mm.plugin.brandservice.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.o;

final class BizSearchDetailPageUI$4
  implements View.OnTouchListener
{
  BizSearchDetailPageUI$4(BizSearchDetailPageUI paramBizSearchDetailPageUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(13878);
    if (BizSearchDetailPageUI.f(this.jKZ) != null)
      BizSearchDetailPageUI.f(this.jKZ).clearFocus();
    this.jKZ.aqX();
    AppMethodBeat.o(13878);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI.4
 * JD-Core Version:    0.6.2
 */