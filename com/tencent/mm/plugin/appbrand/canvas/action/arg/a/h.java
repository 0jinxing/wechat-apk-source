package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionNormalArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg;

public final class h extends a<BaseDrawActionArg>
{
  private static h hdF;

  static
  {
    AppMethodBeat.i(103646);
    hdF = new h();
    AppMethodBeat.o(103646);
  }

  public static h ayo()
  {
    return hdF;
  }

  public final <T> T yA(String paramString)
  {
    AppMethodBeat.i(103645);
    Object localObject = null;
    if ("linear".equalsIgnoreCase(paramString))
      localObject = new RealSetStrokeStyleActionLinearArg();
    while (true)
    {
      ((BaseDrawActionArg)localObject).method = paramString;
      AppMethodBeat.o(103645);
      return localObject;
      if ("radial".equalsIgnoreCase(paramString))
        localObject = new RealSetStrokeStyleActionRadialArg();
      else if ("normal".equalsIgnoreCase(paramString))
        localObject = new RealSetStrokeStyleActionNormalArg();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.h
 * JD-Core Version:    0.6.2
 */