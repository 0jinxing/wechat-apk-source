package com.tencent.mm.plugin.appbrand.appusage.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic$Companion;", "", "()V", "RESULT_FAIL", "", "RESULT_FROM_DB", "RESULT_FROM_MEMORY_CACHE", "RESULT_SUCCESS", "TAG", "", "instance", "Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic;", "getInstance", "()Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic;", "setInstance", "(Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic;)V", "get", "plugin-appbrand-integration_release"})
public final class d$a
{
  public final d aya()
  {
    try
    {
      AppMethodBeat.i(134568);
      if (d.axZ() == null)
      {
        locald = new com/tencent/mm/plugin/appbrand/appusage/a/d;
        locald.<init>((byte)0);
        d.h(locald);
      }
      d locald = d.axZ();
      if (locald == null)
        j.dWJ();
      AppMethodBeat.o(134568);
      return locald;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.d.a
 * JD-Core Version:    0.6.2
 */