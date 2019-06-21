package com.tencent.mm.plugin.appbrand.debugger;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$3
  implements View.OnClickListener
{
  u$3(u paramu)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(101918);
    u localu = this.hkS;
    if (paramView.getId() == 2131821355)
    {
      localu.hkP = true;
      localu.show();
      paramView = localu.hkD;
      paramView.postDelayed(new RemoteDebugMoveView.3(paramView), 50L);
      AppMethodBeat.o(101918);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131821364)
      {
        localu.hkP = false;
        localu.show();
        AppMethodBeat.o(101918);
      }
      else
      {
        if (paramView.getId() == 2131821363)
          localu.azu();
        AppMethodBeat.o(101918);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u.3
 * JD-Core Version:    0.6.2
 */