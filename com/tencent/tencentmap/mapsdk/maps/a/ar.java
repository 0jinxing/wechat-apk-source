package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class ar
{
  public String a;
  public boolean b;
  public long c;
  public long d;
  public Map<String, String> e;
  boolean f;

  public ar(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    AppMethodBeat.i(98501);
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramLong1;
    this.d = paramLong2;
    if (paramMap != null)
    {
      this.e = new HashMap();
      this.e.putAll(paramMap);
    }
    this.f = paramBoolean2;
    AppMethodBeat.o(98501);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ar
 * JD-Core Version:    0.6.2
 */