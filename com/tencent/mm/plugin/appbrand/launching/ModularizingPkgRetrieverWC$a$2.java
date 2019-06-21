package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.sdk.platformtools.ab;

final class ModularizingPkgRetrieverWC$a$2
  implements n.b
{
  ModularizingPkgRetrieverWC$a$2(ModularizingPkgRetrieverWC.a parama)
  {
  }

  public final void a(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    AppMethodBeat.i(131929);
    ab.i("MicroMsg.AppBrand.ModularizingPkgRetrieverWC[modularizing]", "hy: prepare job progress callback, %s", new Object[] { paramWxaPkgLoadProgress.toString() });
    if (ModularizingPkgRetrieverWC.a.a(this.iie) != null)
      ModularizingPkgRetrieverWC.a.a(this.iie).ao(new ModularizingPkgRetrieverWC.WxaPkgResultProgressPair(paramWxaPkgLoadProgress));
    AppMethodBeat.o(131929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverWC.a.2
 * JD-Core Version:    0.6.2
 */