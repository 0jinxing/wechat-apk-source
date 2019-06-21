package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2
  implements n.a
{
  e$2(e parame, String paramString)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(86650);
    ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), sdkScript inject failed", new Object[] { this.gMS.gMN.getAppId(), this.gMT });
    this.gMS.ds(false);
    AppMethodBeat.o(86650);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(86649);
    ab.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), scriptPath(%s), sdkScript inject succeed", new Object[] { this.gMS.gMN.getAppId(), this.gMT });
    this.gMS.ds(true);
    AppMethodBeat.o(86649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.e.2
 * JD-Core Version:    0.6.2
 */