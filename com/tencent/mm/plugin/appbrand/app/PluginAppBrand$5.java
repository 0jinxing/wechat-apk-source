package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ao.c;
import com.tencent.mm.sdk.platformtools.bo;

final class PluginAppBrand$5
  implements ao.c
{
  PluginAppBrand$5(PluginAppBrand paramPluginAppBrand)
  {
  }

  public final void b(String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(129219);
    if (bo.nullAsNil(paramString).contains(".plugin.appbrand"))
    {
      h.pYm.a(365L, 3L, 1L, false);
      KVCommCrossProcessReceiver.cgo();
    }
    AppMethodBeat.o(129219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.PluginAppBrand.5
 * JD-Core Version:    0.6.2
 */