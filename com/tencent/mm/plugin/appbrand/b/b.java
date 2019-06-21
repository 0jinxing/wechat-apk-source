package com.tencent.mm.plugin.appbrand.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b
{
  static
  {
    AppMethodBeat.i(90974);
    gWt = new b("FOREGROUND", 0);
    gWu = new b("BACKGROUND", 1);
    gWv = new b("SUSPEND", 2);
    gWw = new b("DESTROYED", 3);
    gWx = new b[] { gWt, gWu, gWv, gWw };
    AppMethodBeat.o(90974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.b
 * JD-Core Version:    0.6.2
 */