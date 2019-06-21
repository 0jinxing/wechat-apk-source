package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.a.a;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class o$7
  implements a.a
{
  o$7(o paramo, i.b paramb)
  {
  }

  public final void a(a.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(128992);
    ab.i("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntime.onOrientationChanged");
    if (!paramBoolean)
      if (paramb != null)
        break label51;
    label51: for (paramb = "null"; ; paramb = paramb.name())
    {
      ab.f("MicroMsg.AppBrandRuntimeWC", "OnOrientationChanged failure  ret:[%s]", new Object[] { paramb });
      this.gPA.wL();
      AppMethodBeat.o(128992);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.7
 * JD-Core Version:    0.6.2
 */