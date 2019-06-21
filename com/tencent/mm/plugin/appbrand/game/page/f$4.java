package com.tencent.mm.plugin.appbrand.game.page;

import android.app.Activity;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.ui.n;

final class f$4
  implements Runnable
{
  f$4(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130243);
    if ((this.hsW.mContext instanceof Activity))
    {
      Window localWindow = ((Activity)this.hsW.mContext).getWindow();
      if (localWindow != null)
        n.a(localWindow, f.c(this.hsW));
    }
    AppMethodBeat.o(130243);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f.4
 * JD-Core Version:    0.6.2
 */