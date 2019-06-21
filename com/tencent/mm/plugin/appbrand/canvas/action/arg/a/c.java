package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.d;
import java.util.Map;

public final class c extends a<BaseDrawActionArg>
{
  private static com.tencent.mm.plugin.appbrand.canvas.c hdx;
  private static c hdy;

  static
  {
    AppMethodBeat.i(103635);
    hdx = new com.tencent.mm.plugin.appbrand.canvas.c();
    hdy = new c();
    AppMethodBeat.o(103635);
  }

  public static c ayj()
  {
    return hdy;
  }

  public final <T> T yA(String paramString)
  {
    AppMethodBeat.i(103634);
    paramString = (d)hdx.hcD.get(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(103634);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.ayf();
      AppMethodBeat.o(103634);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.c
 * JD-Core Version:    0.6.2
 */