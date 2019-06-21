package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.report.quality.b;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$6
  implements n.a
{
  d$6(d paramd, String paramString1, boolean paramBoolean, long paramLong, String paramString2)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130047);
    ab.e("MicroMsg.WAGameJsContextInterface", "create with appID(%s), scriptPath(%s), sdkScript inject failed", new Object[] { this.hqw.gMN.getAppId(), this.gMT });
    this.hqw.ds(false);
    AppMethodBeat.o(130047);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130046);
    ab.i("MicroMsg.WAGameJsContextInterface", "create with appID(%s), scriptPath(%s), sdkScript inject succeed", new Object[] { this.hqw.gMN.getAppId(), this.gMT });
    if ((this.hqw.gMN.atU()) || (this.hqw.gMN.isRunning()))
    {
      a.aLz();
      b.a(this.gMY, this.hqw.gMN.getAppId(), this.gMV, this.gMT, this.gMZ.length());
    }
    this.hqw.ds(true);
    AppMethodBeat.o(130046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.6
 * JD-Core Version:    0.6.2
 */