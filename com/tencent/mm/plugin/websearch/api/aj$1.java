package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class aj$1
  implements Runnable
{
  aj$1(aj paramaj, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124177);
    aj localaj = this.uaI;
    int i = this.uaH;
    boolean bool;
    switch (i)
    {
    case 3:
    default:
      ab.w("MicroMsg.WebSearch.WebSearchPreloadExport", "unknown preload biz %d", new Object[] { Integer.valueOf(i) });
      bool = false;
      if (!bool)
      {
        ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "preload switch close , biz %d, url %s", new Object[] { Integer.valueOf(this.uaH), this.val$url });
        AppMethodBeat.o(124177);
      }
      break;
    case 2:
    case 1:
    case 4:
    case 5:
    }
    while (true)
    {
      return;
      bool = localaj.cVs();
      break;
      bool = localaj.cVr();
      break;
      bool = localaj.cVr();
      break;
      bool = true;
      break;
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "sending broadcast");
      aj.J("com.tencent.mm.intent.ACTION_PRELOAD_SEARCH", this.val$url, this.uaH);
      AppMethodBeat.o(124177);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.aj.1
 * JD-Core Version:    0.6.2
 */