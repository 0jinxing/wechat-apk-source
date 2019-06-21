package com.tencent.mm.plugin.appbrand.game.page;

import android.app.Activity;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.a.d.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.ui.n;

final class f$3
  implements Runnable
{
  f$3(f paramf, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130242);
    Object localObject = this.hsW;
    if (d.a.Dk(this.hsX) == d.a.ivj);
    for (boolean bool = true; ; bool = false)
    {
      f.a((f)localObject, bool);
      if ((this.hsW.mContext instanceof Activity))
      {
        localObject = ((Activity)this.hsW.mContext).getWindow();
        if (localObject != null)
          n.a((Window)localObject, f.c(this.hsW));
      }
      AppMethodBeat.o(130242);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f.3
 * JD-Core Version:    0.6.2
 */