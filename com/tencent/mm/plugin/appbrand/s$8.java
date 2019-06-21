package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.jsapi.bo;
import com.tencent.mm.plugin.appbrand.report.quality.f;
import com.tencent.mm.plugin.appbrand.s.l;
import com.tencent.mm.sdk.platformtools.ab;

final class s$8
  implements h
{
  s$8(s params)
  {
  }

  public final void C(String paramString1, String paramString2)
  {
    AppMethodBeat.i(129076);
    ab.e("MicroMsg.AppBrandService", "hy: wxa main context exception %s %s", new Object[] { paramString1, paramString2 });
    String str = String.format("{'message':'%s', 'stack': '%s'}", new Object[] { l.Ej(paramString1), l.Ej(paramString2) });
    bo.a(this.gPV.aBx(), "onError", str, 0);
    ab.e("MicroMsg.AppBrand.JsRuntimeException", str);
    try
    {
      f.a(this.gPV, paramString1, paramString2);
      AppMethodBeat.o(129076);
      return;
    }
    catch (Throwable paramString1)
    {
      while (true)
        AppMethodBeat.o(129076);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.8
 * JD-Core Version:    0.6.2
 */