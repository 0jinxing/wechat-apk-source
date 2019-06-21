package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

final class FindMoreFriendsUI$2
  implements o
{
  FindMoreFriendsUI$2(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(29208);
    if ((bo.nullAsNil(paramString).equals("lifeappreddot")) && (paramMap != null))
    {
      boolean bool = "1".equals(paramMap.get(".sysmsg.lifeappreddot"));
      ab.d("MicroMsg.FindMoreFriendsUI", "life around xml msg content, showRedDot: %s.", new Object[] { Boolean.valueOf(bool) });
      g.RP().Ry().set(ac.a.xVY, Boolean.valueOf(bool));
      if (bool)
      {
        paramString = (String)paramMap.get(".sysmsg.lifeappreddot.$type");
        parama = (String)paramMap.get(".sysmsg.lifeappreddot.$text");
        paramMap = (String)paramMap.get(".sysmsg.lifeappreddot.$imageurl");
        ab.d("MicroMsg.FindMoreFriendsUI", "life around xml msg content, type: %s, text: %s, imgUrl: %s.", new Object[] { paramString, parama, paramMap });
        if (FindMoreFriendsUI.a(this.yhB, parama, paramMap))
        {
          g.RP().Ry().set(ac.a.xWb, paramString);
          g.RP().Ry().set(ac.a.xWc, parama);
          g.RP().Ry().set(ac.a.xWd, paramMap);
        }
        AppMethodBeat.o(29208);
      }
    }
    while (true)
    {
      return;
      FindMoreFriendsUI.a(this.yhB, FindMoreFriendsUI.a.yhP);
      g.RP().Ry().set(ac.a.xWb, "0");
      g.RP().Ry().set(ac.a.xWc, "");
      g.RP().Ry().set(ac.a.xWd, "");
      AppMethodBeat.o(29208);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.2
 * JD-Core Version:    0.6.2
 */