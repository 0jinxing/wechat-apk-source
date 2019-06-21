package com.tencent.mm.plugin.account.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;

final class RegByMobileRegAIOUI$3
  implements View.OnTouchListener
{
  RegByMobileRegAIOUI$3(RegByMobileRegAIOUI paramRegByMobileRegAIOUI, boolean[] paramArrayOfBoolean)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(125337);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    case 3:
    case 4:
    default:
    case 0:
    case 5:
    case 1:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(125337);
      return false;
      this.gEb[0] = true;
      b.oTO.fu("ce_reg", "<Reg>");
      continue;
      b.oTO.a("ce_reg", paramMotionEvent);
      b.oTO.TN("ce_reg");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.3
 * JD-Core Version:    0.6.2
 */