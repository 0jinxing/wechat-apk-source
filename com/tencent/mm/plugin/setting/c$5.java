package com.tencent.mm.plugin.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.util.Map;

final class c$5
  implements o
{
  c$5(c paramc)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(126829);
    if (paramMap != null)
    {
      paramString = (String)paramMap.get(".sysmsg.security");
      if (bo.isNullOrNil(paramString));
    }
    while (true)
    {
      try
      {
        int i = bo.getInt(paramString, 0);
        g.RP().Ry().set(ac.a.xUR, Integer.valueOf(i));
        if (i != 0)
        {
          com.tencent.mm.x.c.PK().b(ac.a.xUP, true);
          AppMethodBeat.o(126829);
          return;
        }
        com.tencent.mm.x.c.PK().b(ac.a.xUP, false);
        AppMethodBeat.o(126829);
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreSetting", paramString, "device protect security value is not number!", new Object[0]);
      }
      AppMethodBeat.o(126829);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.c.5
 * JD-Core Version:    0.6.2
 */