package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import a.v;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class RadarMemberView$k
  implements Runnable
{
  RadarMemberView$k(RadarMemberView paramRadarMemberView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102961);
    Object localObject1;
    Activity localActivity;
    Object localObject2;
    if ((this.pCy.getContext() instanceof Activity))
    {
      localObject1 = RadarMemberView.pCx;
      localObject1 = this.pCy.getContext();
      if (localObject1 == null)
      {
        localObject1 = new v("null cannot be cast to non-null type android.app.Activity");
        AppMethodBeat.o(102961);
        throw ((Throwable)localObject1);
      }
      localActivity = (Activity)localObject1;
      j.p(localActivity, "ac");
      localObject2 = localActivity.getSystemService("input_method");
      localObject1 = localObject2;
      if (!(localObject2 instanceof InputMethodManager))
        localObject1 = null;
      localObject1 = (InputMethodManager)localObject1;
      if (localObject1 == null)
        AppMethodBeat.o(102961);
    }
    while (true)
    {
      return;
      localObject2 = localActivity.getCurrentFocus();
      if (localObject2 == null)
      {
        AppMethodBeat.o(102961);
      }
      else if (((View)localObject2).getWindowToken() == null)
      {
        AppMethodBeat.o(102961);
      }
      else
      {
        ((InputMethodManager)localObject1).toggleSoftInput(0, 2);
        AppMethodBeat.o(102961);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.k
 * JD-Core Version:    0.6.2
 */