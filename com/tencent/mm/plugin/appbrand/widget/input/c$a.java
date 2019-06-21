package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;

public enum c$a
{
  public static c a(String paramString, u paramu, e parame)
  {
    AppMethodBeat.i(123581);
    if (("digit".equalsIgnoreCase(paramString)) || ("idcard".equalsIgnoreCase(paramString)) || ("number".equalsIgnoreCase(paramString)))
    {
      paramString = new d(paramString, paramu, parame);
      AppMethodBeat.o(123581);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(123581);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.c.a
 * JD-Core Version:    0.6.2
 */