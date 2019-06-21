package com.tencent.mm.plugin.fav;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

public final class a
  implements n
{
  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(5281);
    ab.i("MicroMsg.Fav.FavNewXmlConsumer", "consumeNewXml subtype: %s values: %s", new Object[] { paramString, paramMap.toString() });
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case -1648140403:
    case -1938535405:
    }
    while (true)
    {
      AppMethodBeat.o(5281);
      return null;
      if (!paramString.equals("uploadfavitem"))
        break;
      i = 0;
      break;
      if (!paramString.equals("resendfavitem"))
        break;
      i = 1;
      break;
      paramString = new gh();
      paramString.cAH.type = 38;
      paramString.cAH.cAQ = ((String)paramMap.get(".sysmsg.favids"));
      com.tencent.mm.sdk.b.a.xxA.a(paramString, Looper.getMainLooper());
      h.vv(1);
      continue;
      paramString = new gh();
      paramString.cAH.type = 39;
      paramString.cAH.cAQ = ((String)paramMap.get(".sysmsg.favitem.favid"));
      paramString.cAH.cAR = ((String)paramMap.get(".sysmsg.favitem.dataidlist"));
      com.tencent.mm.sdk.b.a.xxA.a(paramString, Looper.getMainLooper());
      h.vv(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a
 * JD-Core Version:    0.6.2
 */