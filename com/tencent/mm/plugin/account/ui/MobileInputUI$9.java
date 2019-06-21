package com.tencent.mm.plugin.account.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;

final class MobileInputUI$9
  implements View.OnTouchListener
{
  MobileInputUI$9(MobileInputUI paramMobileInputUI, boolean[] paramArrayOfBoolean)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(125169);
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
      AppMethodBeat.o(125169);
      return false;
      this.gEb[0] = true;
      b.oTO.fu("ce_reg_eu", "<Reg>");
      continue;
      b.oTO.a("ce_reg_eu", paramMotionEvent);
      b.oTO.TN("ce_reg_eu");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.9
 * JD-Core Version:    0.6.2
 */