package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.jsapi.version.a;
import com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.b;
import com.tencent.mm.plugin.appbrand.task.e.b;
import com.tencent.mm.sdk.platformtools.ab;

final class o$6
  implements AppBrandPrepareTask.b<AppBrandSysConfigWC>
{
  o$6(o paramo, long paramLong, i.b paramb)
  {
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(128990);
    this.gPy.A(new o.6.3(this, parama));
    AppMethodBeat.o(128990);
  }

  public final void atT()
  {
    AppMethodBeat.i(128987);
    if (this.gPy.mFinished)
      AppMethodBeat.o(128987);
    while (true)
    {
      return;
      j localj = o.h(this.gPy);
      if (localj != null)
        localj.a(e.b.iEC);
      AppMethodBeat.o(128987);
    }
  }

  public final void gf(long paramLong)
  {
    AppMethodBeat.i(128988);
    if (this.gPy.mFinished)
      AppMethodBeat.o(128988);
    while (true)
    {
      return;
      this.gPy.gPs = true;
      if (o.j(this.gPy) != null)
        o.j(this.gPy).iCc = true;
      o.dv(this.gPy.gPs);
      j localj = o.h(this.gPy);
      if (localj != null)
        localj.a(e.b.iED);
      AppMethodBeat.o(128988);
    }
  }

  public final void nm(int paramInt)
  {
    AppMethodBeat.i(128986);
    this.gPy.nm(paramInt);
    AppMethodBeat.o(128986);
  }

  public final void nn(int paramInt)
  {
    AppMethodBeat.i(128989);
    ab.i("MicroMsg.AppBrandRuntimeWC", "appId[%s] onDownloadProgress %d", new Object[] { this.gPy.mAppId, Integer.valueOf(paramInt) });
    o localo = this.gPy;
    localo.getContext().runOnUiThread(new i.10(localo, paramInt));
    AppMethodBeat.o(128989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.6
 * JD-Core Version:    0.6.2
 */