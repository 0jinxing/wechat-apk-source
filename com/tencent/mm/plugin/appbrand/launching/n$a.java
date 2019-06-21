package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.j.a;

public final class n$a
{
  static n f(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131817);
    if (j.a.np(paramInt1))
    {
      paramString1 = new v(paramString1, paramString2, paramInt2);
      AppMethodBeat.o(131817);
    }
    while (true)
    {
      return paramString1;
      paramString1 = new w(paramString1, paramString2, paramInt1);
      AppMethodBeat.o(131817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.n.a
 * JD-Core Version:    0.6.2
 */