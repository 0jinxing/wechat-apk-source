package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.m.a.d;
import java.util.HashMap;
import java.util.Map;

public final class c extends d
{
  public final int aIT()
  {
    return 6;
  }

  public final String b(i parami, com.tencent.mm.plugin.appbrand.m.a.c paramc)
  {
    AppMethodBeat.i(102194);
    parami = (String)j.CP(parami.optString("url")).get("host");
    HashMap localHashMap = new HashMap();
    if (j.CR(parami) == 2);
    for (boolean bool = true; ; bool = false)
    {
      localHashMap.put("isLANIp", Boolean.valueOf(bool));
      parami = paramc.B(localHashMap);
      AppMethodBeat.o(102194);
      return parami;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.c
 * JD-Core Version:    0.6.2
 */