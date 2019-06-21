package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;

final class ModularizingPkgRetrieverWC$a$1 extends n.c
{
  ModularizingPkgRetrieverWC$a$1(ModularizingPkgRetrieverWC.a parama)
  {
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131928);
    if (ModularizingPkgRetrieverWC.a.a(this.iie) != null)
    {
      ModularizingPkgRetrieverWC.a.a(this.iie).ao(new ModularizingPkgRetrieverWC.WxaPkgResultProgressPair(paramWxaPkgWrappingInfo));
      ModularizingPkgRetrieverWC.a.b(this.iie);
    }
    AppMethodBeat.o(131928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverWC.a.1
 * JD-Core Version:    0.6.2
 */