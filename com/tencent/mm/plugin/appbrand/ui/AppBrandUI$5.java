package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.i;
import com.tencent.mm.plugin.appbrand.task.i.a;

final class AppBrandUI$5
  implements i
{
  AppBrandUI$5(AppBrandUI paramAppBrandUI)
  {
  }

  public final void a(i.a parama)
  {
    AppMethodBeat.i(138141);
    h localh = h.iJc;
    h.a(this.iIZ, parama);
    AppMethodBeat.o(138141);
  }

  public final FrameLayout aLY()
  {
    AppMethodBeat.i(138139);
    FrameLayout localFrameLayout = (FrameLayout)AppBrandUI.d(this.iIZ);
    AppMethodBeat.o(138139);
    return localFrameLayout;
  }

  public final boolean aLZ()
  {
    AppMethodBeat.i(138142);
    boolean bool = this.iIZ.aLZ();
    AppMethodBeat.o(138142);
    return bool;
  }

  public final void finish()
  {
    AppMethodBeat.i(138140);
    this.iIZ.finish();
    AppMethodBeat.o(138140);
  }

  public final Activity getContext()
  {
    return this.iIZ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandUI.5
 * JD-Core Version:    0.6.2
 */