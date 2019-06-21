package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class s$3$1
  implements n.a
{
  s$3$1(s.3 param3)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(129068);
    ab.e("MicroMsg.AppBrandService", "inject module(%s) script failed: %s", new Object[] { this.gQa.gPZ, paramString });
    h.pYm.a(370L, 32L, 1L, false);
    AppMethodBeat.o(129068);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(129067);
    h.pYm.a(370L, 31L, 1L, false);
    AppMethodBeat.o(129067);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.3.1
 * JD-Core Version:    0.6.2
 */