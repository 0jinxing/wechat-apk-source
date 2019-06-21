package com.tencent.mm.plugin.appbrand.widget.input.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b
{
  public final int jjd;

  static
  {
    AppMethodBeat.i(77448);
    jiY = new b("DONE", 0, 6);
    jiZ = new b("SEARCH", 1, 3);
    jja = new b("NEXT", 2, 5);
    jjb = new b("GO", 3, 2);
    jjc = new b("SEND", 4, 4);
    jje = new b[] { jiY, jiZ, jja, jjb, jjc };
    AppMethodBeat.o(77448);
  }

  private b(int paramInt)
  {
    this.jjd = paramInt;
  }

  public static b EI(String paramString)
  {
    AppMethodBeat.i(77447);
    paramString = (b)d.f(paramString, b.class);
    AppMethodBeat.o(77447);
    return paramString;
  }

  public static b aRI()
  {
    return jiY;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.d.b
 * JD-Core Version:    0.6.2
 */