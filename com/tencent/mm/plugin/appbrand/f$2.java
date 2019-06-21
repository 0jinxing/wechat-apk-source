package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.report.quality.b;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2
  implements n.a
{
  f$2(f paramf, boolean paramBoolean, long paramLong, String paramString1, String paramString2)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(128931);
    ab.e("MicroMsg.AppBrandJSContextInterfaceWC", "create with appID(%s), scriptPath(%s), sdkScript inject failed", new Object[] { this.gMX.gMN.getAppId(), this.gMT });
    this.gMX.ds(false);
    AppMethodBeat.o(128931);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(128930);
    if ((this.gMX.gMN.atU()) || (this.gMX.gMN.isRunning()))
    {
      a.aLz();
      b.a(this.gMY, this.gMX.gMN.getAppId(), this.gMV, this.gMT, this.gMZ.length());
    }
    ab.i("MicroMsg.AppBrandJSContextInterfaceWC", "create with appID(%s), scriptPath(%s), sdkScript inject succeed", new Object[] { this.gMX.gMN.getAppId(), this.gMT });
    this.gMX.ds(true);
    AppMethodBeat.o(128930);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.2
 * JD-Core Version:    0.6.2
 */