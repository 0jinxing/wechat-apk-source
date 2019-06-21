package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$5
  implements n.a
{
  d$5(d paramd, String paramString1, String paramString2, long paramLong, n.a parama)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130045);
    if (this.gMW != null)
      this.gMW.lo(paramString);
    AppMethodBeat.o(130045);
  }

  public final void onSuccess(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(130044);
    i locali;
    if ((this.hqw.gMN.atU()) || (this.hqw.gMN.isRunning()))
    {
      locali = this.hqw.gMN.getRuntime();
      if (locali == null)
        break label152;
    }
    label152: for (int j = locali.hashCode(); ; j = -1)
    {
      ab.i("MicroMsg.WAGameJsContextInterface", "[QualitySystem] app-service.js runtime.hashCode = [%d]", new Object[] { Integer.valueOf(j) });
      String str1 = this.hqw.gMN.getAppId();
      String str2 = this.gMR;
      String str3 = this.gMU;
      long l = this.fEG;
      j = i;
      if (locali != null)
        j = locali.hashCode();
      a.a(str1, str2, str3, l, j);
      if (this.gMW != null)
        this.gMW.onSuccess(paramString);
      AppMethodBeat.o(130044);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.5
 * JD-Core Version:    0.6.2
 */