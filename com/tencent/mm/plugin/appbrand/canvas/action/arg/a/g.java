package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionNormalArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg;

public final class g extends a<BaseDrawActionArg>
{
  private static g hdE;

  static
  {
    AppMethodBeat.i(103644);
    hdE = new g();
    AppMethodBeat.o(103644);
  }

  public static g ayn()
  {
    return hdE;
  }

  public final <T> T yA(String paramString)
  {
    AppMethodBeat.i(103643);
    Object localObject = null;
    if ("linear".equalsIgnoreCase(paramString))
      localObject = new RealSetFillStyleActionLinearArg();
    while (true)
    {
      ((BaseDrawActionArg)localObject).method = paramString;
      AppMethodBeat.o(103643);
      return localObject;
      if ("radial".equalsIgnoreCase(paramString))
        localObject = new RealSetFillStyleActionRadialArg();
      else if ("normal".equalsIgnoreCase(paramString))
        localObject = new RealSetFillStyleActionNormalArg();
      else if ("pattern".equalsIgnoreCase(paramString))
        localObject = new RealSetFillStyleActionPatternArg();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.g
 * JD-Core Version:    0.6.2
 */