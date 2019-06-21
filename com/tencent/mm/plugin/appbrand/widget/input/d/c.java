package com.tencent.mm.plugin.appbrand.widget.input.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c
{
  public final int style;

  static
  {
    AppMethodBeat.i(77452);
    jjf = new c("NORMAL", 0, 0);
    jjg = new c("BOLD", 1, 1);
    jjh = new c[] { jjf, jjg };
    AppMethodBeat.o(77452);
  }

  private c(int paramInt)
  {
    this.style = paramInt;
  }

  public static c EJ(String paramString)
  {
    AppMethodBeat.i(77451);
    Enum localEnum = d.f(paramString, c.class);
    paramString = jjf;
    if (localEnum == null);
    while (true)
    {
      paramString = (c)paramString;
      AppMethodBeat.o(77451);
      return paramString;
      paramString = localEnum;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.d.c
 * JD-Core Version:    0.6.2
 */