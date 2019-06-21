package com.tencent.mm.plugin.expt.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class a$2
  implements n
{
  a$2(a parama)
  {
  }

  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(73487);
    if (!"expt".equals(paramString))
    {
      ab.w("MicroMsg.ExptService", "receive expt xml but subtype[%s] is error", new Object[] { paramString });
      AppMethodBeat.o(73487);
    }
    while (true)
    {
      return null;
      if ((paramMap == null) || (paramMap.size() <= 0))
      {
        ab.w("MicroMsg.ExptService", "receive expt xml but map is null");
        AppMethodBeat.o(73487);
      }
      else
      {
        paramString = (String)paramMap.get(".sysmsg.content");
        this.lNO.KY(paramString);
        AppMethodBeat.o(73487);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.b.a.2
 * JD-Core Version:    0.6.2
 */