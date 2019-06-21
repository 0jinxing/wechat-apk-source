package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLauncherRecentsList$c extends RecyclerView.c
  implements RecyclerView.f.a
{
  private AppBrandLauncherRecentsList$c(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  private void eI(boolean paramBoolean)
  {
    AppMethodBeat.i(133372);
    this.iMV.N(new AppBrandLauncherRecentsList.c.1(this, paramBoolean));
    AppMethodBeat.o(133372);
  }

  public final void aw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133368);
    eI(false);
    AppMethodBeat.o(133368);
  }

  public final void ax(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133369);
    eI(true);
    AppMethodBeat.o(133369);
  }

  public final void ay(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133370);
    eI(false);
    AppMethodBeat.o(133370);
  }

  public final void jT()
  {
    AppMethodBeat.i(133371);
    eI(false);
    AppMethodBeat.o(133371);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.c
 * JD-Core Version:    0.6.2
 */