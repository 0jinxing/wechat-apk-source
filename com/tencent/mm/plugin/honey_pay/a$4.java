package com.tencent.mm.plugin.honey_pay;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLDecoder;
import java.util.Map;

final class a$4
  implements o
{
  a$4(a parama)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(41710);
    if (bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), 0) == 35)
    {
      ab.i("MicroMsg.SubCoreHoneyPay", "receive honey pay newxml");
      String str1 = (String)paramMap.get(".sysmsg.paymsg.appmsgcontent");
      parama = (String)paramMap.get(".sysmsg.paymsg.fromusername");
      paramString = (String)paramMap.get(".sysmsg.paymsg.tousername");
      String str2 = (String)paramMap.get(".sysmsg.paymsg.paymsgid");
      paramMap = (String)paramMap.get(".sysmsg.paymsg.systip");
      if (!bo.isNullOrNil(str1))
      {
        str1 = URLDecoder.decode(str1);
        ab.d("MicroMsg.SubCoreHoneyPay", "appmsg: %s", new Object[] { str1 });
        c.o(str2, str1, paramString, parama);
      }
      if (!bo.isNullOrNil(paramMap))
      {
        paramMap = URLDecoder.decode(paramMap);
        ab.d("MicroMsg.SubCoreHoneyPay", "systip: %s", new Object[] { paramMap });
        c.V(paramString, paramMap, parama);
      }
    }
    AppMethodBeat.o(41710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.4
 * JD-Core Version:    0.6.2
 */