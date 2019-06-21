package com.tencent.mm.plugin.appbrand.dynamic.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c$a
{
  static
  {
    AppMethodBeat.i(10926);
    hoq = new a("Ok", 0);
    hor = new a("Fail", 1);
    hos = new a("Timeout", 2);
    hot = new a("CgiFail", 3);
    hou = new a("ResponseInvalid", 4);
    hov = new a("AwaitFail", 5);
    how = new a[] { hoq, hor, hos, hot, hou, hov };
    AppMethodBeat.o(10926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.launching.c.a
 * JD-Core Version:    0.6.2
 */