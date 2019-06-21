package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class i
  implements a
{
  private static boolean a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(103693);
    paramPath.quadTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    AppMethodBeat.o(103693);
    return true;
  }

  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103694);
    PathQuadraticCurveToActionArg localPathQuadraticCurveToActionArg = (PathQuadraticCurveToActionArg)paramBasePathActionArg;
    boolean bool;
    if (paramBasePathActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103694);
    }
    while (true)
    {
      return bool;
      bool = a(paramPath, localPathQuadraticCurveToActionArg.x1, localPathQuadraticCurveToActionArg.y1, localPathQuadraticCurveToActionArg.x2, localPathQuadraticCurveToActionArg.y2);
      AppMethodBeat.o(103694);
    }
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103692);
    if (paramJSONArray.length() < 4)
      AppMethodBeat.o(103692);
    while (true)
    {
      return bool;
      bool = a(paramPath, g.d(paramJSONArray, 0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), g.d(paramJSONArray, 3));
      AppMethodBeat.o(103692);
    }
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103695);
    PathQuadraticCurveToActionArg localPathQuadraticCurveToActionArg = new PathQuadraticCurveToActionArg();
    AppMethodBeat.o(103695);
    return localPathQuadraticCurveToActionArg;
  }

  public final String getMethod()
  {
    return "quadraticCurveTo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.i
 * JD-Core Version:    0.6.2
 */