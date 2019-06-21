package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements n.a
{
  f$1(f paramf, String paramString1, String paramString2, long paramLong, n.a parama)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(128929);
    if (this.gMW != null)
      this.gMW.lo(paramString);
    AppMethodBeat.o(128929);
  }

  public final void onSuccess(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(128928);
    i locali;
    if ((this.gMX.gMN.atU()) || (this.gMX.gMN.isRunning()))
    {
      locali = this.gMX.gMN.getRuntime();
      if (locali == null)
        break label152;
    }
    label152: for (int j = locali.hashCode(); ; j = -1)
    {
      ab.i("MicroMsg.AppBrandJSContextInterfaceWC", "[QualitySystem] app-service.js runtime.hashCode = [%d]", new Object[] { Integer.valueOf(j) });
      String str1 = this.gMX.gMN.getAppId();
      String str2 = this.gMR;
      String str3 = this.gMU;
      long l = this.gMV;
      j = i;
      if (locali != null)
        j = locali.hashCode();
      a.a(str1, str2, str3, l, j);
      if (this.gMW != null)
        this.gMW.onSuccess(paramString);
      AppMethodBeat.o(128928);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.1
 * JD-Core Version:    0.6.2
 */