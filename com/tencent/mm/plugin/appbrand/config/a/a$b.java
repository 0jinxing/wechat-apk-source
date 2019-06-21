package com.tencent.mm.plugin.appbrand.config.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$b
{
  public final int hiQ;

  static
  {
    AppMethodBeat.i(86909);
    hiK = new b("PORTRAIT", 0, 1);
    hiL = new b("UNSPECIFIED", 1, -1);
    hiM = new b("LANDSCAPE_SENSOR", 2, 6);
    hiN = new b("LANDSCAPE_LOCKED", 3, 0);
    hiO = new b("LANDSCAPE_LEFT", 4, 8);
    hiP = new b("LANDSCAPE_RIGHT", 5, 0);
    hiR = new b[] { hiK, hiL, hiM, hiN, hiO, hiP };
    AppMethodBeat.o(86909);
  }

  private a$b(int paramInt)
  {
    this.hiQ = paramInt;
  }

  public final boolean c(b paramb)
  {
    if ((this == paramb) || ((this == hiM) && (paramb == hiN)) || ((this == hiN) && (paramb == hiM)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.a.b
 * JD-Core Version:    0.6.2
 */