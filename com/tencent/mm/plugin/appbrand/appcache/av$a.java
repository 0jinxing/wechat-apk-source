package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.l;
import com.tencent.mm.protocal.protobuf.cnp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

final class av$a
  implements av.c
{
  public final void u(Map<String, String> paramMap)
  {
    AppMethodBeat.i(129431);
    if (paramMap.get(".sysmsg.mmbizwxaconfig") == null)
      AppMethodBeat.o(129431);
    while (true)
    {
      return;
      int i = bo.getInt((String)paramMap.get(".sysmsg.mmbizwxaconfig.command"), -1);
      int j = bo.getInt((String)paramMap.get(".sysmsg.mmbizwxaconfig.type"), 0);
      String str = (String)paramMap.get(".sysmsg.mmbizwxaconfig.appid");
      int k = bo.getInt((String)paramMap.get(".sysmsg.mmbizwxaconfig.configversion"), 0);
      ab.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle common config, command = %d, type = %d, appid = %s, configversion = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), str, Integer.valueOf(k) });
      LinkedList localLinkedList = new LinkedList();
      paramMap = new cnp();
      paramMap.version = k;
      paramMap.type = j;
      localLinkedList.add(paramMap);
      l.a(str, localLinkedList, false);
      l.a(str, j, i, new av.a.1(this, str, j), true);
      AppMethodBeat.o(129431);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.av.a
 * JD-Core Version:    0.6.2
 */