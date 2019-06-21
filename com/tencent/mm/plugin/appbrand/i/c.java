package com.tencent.mm.plugin.appbrand.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class c
  implements e.a
{
  public final String g(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(132274);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      ab.w("MicroMsg.WxaSysTemplateMsgDigestHandler", "values map is null or nil");
      paramMap = "";
      AppMethodBeat.o(132274);
    }
    while (true)
    {
      return paramMap;
      paramMap = bo.nullAsNil((String)paramMap.get(paramString + ".title"));
      AppMethodBeat.o(132274);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.c
 * JD-Core Version:    0.6.2
 */