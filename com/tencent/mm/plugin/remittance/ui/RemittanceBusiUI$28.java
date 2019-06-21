package com.tencent.mm.plugin.remittance.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBusiUI$28
  implements View.OnTouchListener
{
  RemittanceBusiUI$28(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(44927);
    if (RemittanceBusiUI.q(this.pUd))
      this.pUd.aoB();
    AppMethodBeat.o(44927);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.28
 * JD-Core Version:    0.6.2
 */