package com.tencent.mm.plugin.remittance.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceResultNewUI$4
  implements View.OnTouchListener
{
  RemittanceResultNewUI$4(RemittanceResultNewUI paramRemittanceResultNewUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(45118);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(45118);
      return false;
      RemittanceResultNewUI.a(this.pWO, (int)paramMotionEvent.getRawX());
      RemittanceResultNewUI.b(this.pWO, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.4
 * JD-Core Version:    0.6.2
 */