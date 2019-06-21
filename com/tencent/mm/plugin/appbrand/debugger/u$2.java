package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class u$2
  implements Runnable
{
  u$2(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101917);
    if (u.b(this.hkS) == null)
    {
      ab.w("MicroMsg.RemoteDebugView", "showDebugView mContentView is null");
      AppMethodBeat.o(101917);
    }
    while (true)
    {
      return;
      if (u.c(this.hkS))
      {
        this.hkS.setVisibility(0);
        if (u.b(this.hkS).indexOfChild(this.hkS) == -1)
          u.b(this.hkS).addView(this.hkS);
        u.b(this.hkS).bringChildToFront(this.hkS);
        this.hkS.setBackgroundColor(this.hkS.getContext().getResources().getColor(2131690155));
        AppMethodBeat.o(101917);
      }
      else
      {
        this.hkS.setBackgroundColor(this.hkS.getContext().getResources().getColor(2131690597));
        AppMethodBeat.o(101917);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u.2
 * JD-Core Version:    0.6.2
 */