package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.game.d.d.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$4
  implements n.a
{
  d$4(d paramd, String paramString1, String paramString2, long paramLong)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130043);
    d.a(d.a.hrR, "codeLib " + this.gSk + " inject fail!");
    d.dM(false);
    AppMethodBeat.o(130043);
  }

  public final void onSuccess(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(130042);
    String str1;
    if ((this.hqw.gMN.atU()) || (this.hqw.gMN.isRunning()))
    {
      paramString = this.hqw.gMN.getRuntime();
      str1 = this.gSk;
      if (paramString == null)
        break label176;
    }
    label176: for (int j = paramString.hashCode(); ; j = -1)
    {
      ab.i("MicroMsg.WAGameJsContextInterface", "[QualitySystem] %s runtime.hashCode = [%d]", new Object[] { str1, Integer.valueOf(j) });
      str1 = this.hqw.gMN.getAppId();
      String str2 = this.gSk;
      String str3 = this.hqx;
      long l = this.hqy;
      j = i;
      if (paramString != null)
        j = paramString.hashCode();
      a.a(str1, str2, str3, l, j);
      d.a(d.a.hrP, "codeLib " + this.gSk + " inject success!");
      d.dM(true);
      AppMethodBeat.o(130042);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.4
 * JD-Core Version:    0.6.2
 */