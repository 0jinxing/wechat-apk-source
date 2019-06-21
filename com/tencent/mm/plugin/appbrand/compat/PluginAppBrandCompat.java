package com.tencent.mm.plugin.appbrand.compat;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.appbrand.jsapi.t.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.t.d;

@Deprecated
@Keep
public final class PluginAppBrandCompat extends f
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.appbrand.compat.a.c
{
  public final void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(17022);
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.compat.a.b.class, new com.tencent.mm.kernel.c.e(new b()));
    while (true)
    {
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.compat.a.a.class, new com.tencent.mm.kernel.c.e(new a()));
      AppMethodBeat.o(17022);
      return;
      com.tencent.luggage.a.e.a(c.a.class, new d());
    }
  }

  public final void installed()
  {
    AppMethodBeat.i(17021);
    super.installed();
    alias(com.tencent.mm.plugin.appbrand.compat.a.c.class);
    AppMethodBeat.o(17021);
  }

  public final void onAccountInitialized(e.c paramc)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.compat.PluginAppBrandCompat
 * JD-Core Version:    0.6.2
 */