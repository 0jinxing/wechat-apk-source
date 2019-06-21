package com.tencent.mm.plugin.appbrand.m.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  public final q gMN;
  private final b.a ipY;
  private final int ipZ;

  public c(q paramq)
  {
    this.gMN = paramq;
    this.ipZ = -1;
    this.ipY = null;
  }

  public c(q paramq, int paramInt, b.a parama)
  {
    this.ipY = parama;
    this.gMN = paramq;
    this.ipZ = paramInt;
  }

  private static String C(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(102188);
    com.tencent.luggage.g.i.d(paramMap);
    paramMap = new com.tencent.mm.aa.i(paramMap).toString();
    AppMethodBeat.o(102188);
    return paramMap;
  }

  private String CV(String paramString)
  {
    AppMethodBeat.i(102187);
    if (this.ipY == null)
      AppMethodBeat.o(102187);
    while (true)
    {
      return paramString;
      this.ipY.Y(this.ipZ, paramString);
      paramString = null;
      AppMethodBeat.o(102187);
    }
  }

  public final String B(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(102185);
    paramMap.put("ret", Integer.valueOf(0));
    paramMap = CV(C(paramMap));
    AppMethodBeat.o(102185);
    return paramMap;
  }

  public final String aIU()
  {
    AppMethodBeat.i(102186);
    Object localObject = new HashMap();
    ((Map)localObject).put("ret", Integer.valueOf(2));
    localObject = CV(C((Map)localObject));
    AppMethodBeat.o(102186);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.a.c
 * JD-Core Version:    0.6.2
 */