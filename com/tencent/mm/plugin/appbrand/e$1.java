package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements n.a
{
  e$1(e parame, g paramg, String paramString)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(86648);
    ab.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s), contextId(%d), appScriptPath(%s), appScript inject failed", new Object[] { this.gMS.gMN.getAppId(), Integer.valueOf(this.gMQ.aGT()), this.gMR });
    this.gMS.dt(false);
    AppMethodBeat.o(86648);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(86647);
    ab.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s), contextId(%d), appScriptPath(%s), appScript inject succeed", new Object[] { this.gMS.gMN.getAppId(), Integer.valueOf(this.gMQ.aGT()), this.gMR });
    this.gMS.dt(true);
    AppMethodBeat.o(86647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.e.1
 * JD-Core Version:    0.6.2
 */