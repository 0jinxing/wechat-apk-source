package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.a.px;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.websearch.api.am;
import com.tencent.mm.plugin.websearch.api.am.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class PluginWebSearch$6
  implements o
{
  PluginWebSearch$6(PluginWebSearch paramPluginWebSearch)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(91314);
    long l2;
    am localam;
    if ((paramMap != null) && (paramString != null) && (paramString.equals("mmsearch_reddot_new")))
    {
      int i = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.entry"));
      if (i == 1)
      {
        ab.i("MicroMsg.WebSearch.PluginWebSearch", "recv %s, %s", new Object[] { "mmsearch_reddot_new", paramMap.toString() });
        int j = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.clear"));
        String str1 = bo.t((String)paramMap.get(".sysmsg.mmsearch_reddot_new.msgid"), new Object[0]);
        int k = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.discovery"));
        int m = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.android_cli_version"));
        long l1 = bo.anl((String)paramMap.get(".sysmsg.mmsearch_reddot_new.expire_time"));
        int n = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.h5_version"));
        int i1 = bo.ank((String)paramMap.get(".sysmsg.mmsearch_reddot_new.reddot_type"));
        String str2 = (String)paramMap.get(".sysmsg.mmsearch_reddot_new.reddot_text");
        parama = (String)paramMap.get(".sysmsg.mmsearch_reddot_new.reddot_icon");
        l2 = bo.anl((String)paramMap.get(".sysmsg.mmsearch_reddot_new.timestamp"));
        localam = am.cVt();
        paramString = null;
        switch (i)
        {
        default:
          paramMap = paramString;
          if (paramString == null)
            paramMap = new am.a();
          if (paramMap.timestamp < l2)
          {
            paramMap.id = str1;
            paramMap.uaW = k;
            paramMap.uaU = i;
            paramMap.uaV = m;
            paramMap.oak = l1;
            paramMap.tZU = n;
            paramMap.type = i1;
            paramMap.text = str2;
            paramMap.cIY = parama;
            paramMap.timestamp = l2;
            paramMap.clear = j;
            paramMap.fJB = System.currentTimeMillis();
          }
          break;
        case 1:
        }
      }
    }
    while (true)
    {
      localam.save();
      paramString = new px();
      a.xxA.m(paramString);
      AppMethodBeat.o(91314);
      return;
      paramString = localam.uaS;
      break;
      ab.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "timestamp %d not big than last msg %d", new Object[] { Long.valueOf(l2), Long.valueOf(paramMap.timestamp) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.PluginWebSearch.6
 * JD-Core Version:    0.6.2
 */