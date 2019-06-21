package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class cb
{
  private String a;
  private Map<String, cc> b;

  public cb(String paramString)
  {
    AppMethodBeat.i(98614);
    this.a = paramString;
    this.b = new HashMap();
    AppMethodBeat.o(98614);
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(cc paramcc)
  {
    AppMethodBeat.i(98615);
    this.b.put(paramcc.a, paramcc);
    AppMethodBeat.o(98615);
  }

  public final Map<String, cc> b()
  {
    return this.b;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cb
 * JD-Core Version:    0.6.2
 */