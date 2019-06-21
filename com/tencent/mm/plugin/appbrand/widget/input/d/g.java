package com.tencent.mm.plugin.appbrand.widget.input.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum g
{
  static
  {
    AppMethodBeat.i(123957);
    jjP = new g("LEFT", 0);
    jjQ = new g("RIGHT", 1);
    jjR = new g("CENTER", 2);
    jjS = new g[] { jjP, jjQ, jjR };
    AppMethodBeat.o(123957);
  }

  public static g EK(String paramString)
  {
    AppMethodBeat.i(123956);
    Enum localEnum = d.f(paramString, g.class);
    paramString = jjP;
    if (localEnum == null);
    while (true)
    {
      paramString = (g)paramString;
      AppMethodBeat.o(123956);
      return paramString;
      paramString = localEnum;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.d.g
 * JD-Core Version:    0.6.2
 */