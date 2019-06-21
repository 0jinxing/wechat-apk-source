package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.j.a;

public final class n$d
{
  static n b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(131818);
    if (j.a.np(paramInt1))
    {
      paramString1 = new v(paramString1, paramString2, paramInt2, paramInt3);
      AppMethodBeat.o(131818);
    }
    while (true)
    {
      return paramString1;
      paramString1 = new w(paramString1, paramString2, paramInt1, paramInt3);
      AppMethodBeat.o(131818);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.n.d
 * JD-Core Version:    0.6.2
 */