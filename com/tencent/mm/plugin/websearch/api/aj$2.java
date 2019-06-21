package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.Map;

final class aj$2
  implements Runnable
{
  aj$2(aj paramaj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124178);
    Object localObject1 = a.b.eGM;
    localObject1 = a.ll("100344");
    if (localObject1 == null)
    {
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "openSearchPreload item is null");
      AppMethodBeat.o(124178);
      return;
    }
    Object localObject2 = this.uaI;
    if ((((c)localObject1).isValid()) && ("1".equals(((c)localObject1).dru().get("isOpen"))));
    for (boolean bool = true; ; bool = false)
    {
      aj.a((aj)localObject2, bool);
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "openSearchPreload :%b", new Object[] { Boolean.valueOf(aj.a(this.uaI)) });
      localObject1 = a.b.eGM;
      localObject2 = a.ll("100346");
      if (localObject2 != null)
        break label129;
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "openSearchPreload item is null");
      AppMethodBeat.o(124178);
      break;
    }
    label129: localObject1 = this.uaI;
    if ((((c)localObject2).isValid()) && ("1".equals(((c)localObject2).dru().get("isOpen"))));
    for (bool = true; ; bool = false)
    {
      aj.b((aj)localObject1, bool);
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "openRecommendPreload :%b", new Object[] { Boolean.valueOf(aj.b(this.uaI)) });
      AppMethodBeat.o(124178);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.aj.2
 * JD-Core Version:    0.6.2
 */