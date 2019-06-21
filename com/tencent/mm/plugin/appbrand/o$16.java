package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.a.a;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class o$16
  implements a.a
{
  o$16(o paramo)
  {
  }

  public final void a(a.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(129002);
    ab.i("MicroMsg.AppBrandRuntimeWC", "resume OnOrientationChanged orientation = [%s] success = [%b]", new Object[] { paramb, Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(129002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.16
 * JD-Core Version:    0.6.2
 */