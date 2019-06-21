package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class s$9
  implements n.a
{
  s$9(s params)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(129078);
    ab.e("MicroMsg.AppBrandService", "Inject android.js Script Failed");
    AppMethodBeat.o(129078);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(129077);
    ab.i("MicroMsg.AppBrandService", "Inject android.js Script Success");
    AppMethodBeat.o(129077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.9
 * JD-Core Version:    0.6.2
 */