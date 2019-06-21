package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.modelappbrand.e;

final class PluginAppBrand$4
  implements com.tencent.mm.kernel.api.g
{
  PluginAppBrand$4(PluginAppBrand paramPluginAppBrand)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(129217);
    ((e)com.tencent.mm.kernel.g.K(e.class)).initialize();
    AppMethodBeat.o(129217);
  }

  public final void bi(boolean paramBoolean)
  {
    AppMethodBeat.i(129218);
    ((e)com.tencent.mm.kernel.g.K(e.class)).shutdown();
    ((e)com.tencent.mm.kernel.g.K(e.class)).aby().exit();
    AppMethodBeat.o(129218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.PluginAppBrand.4
 * JD-Core Version:    0.6.2
 */