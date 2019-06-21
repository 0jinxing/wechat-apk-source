package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class d
  implements a
{
  private static boolean a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    AppMethodBeat.i(103673);
    paramPath.cubicTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    AppMethodBeat.o(103673);
    return true;
  }

  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103674);
    paramBasePathActionArg = (PathBezierCurveToActionArg)paramBasePathActionArg;
    boolean bool;
    if (paramBasePathActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103674);
    }
    while (true)
    {
      return bool;
      bool = a(paramPath, paramBasePathActionArg.x1, paramBasePathActionArg.y1, paramBasePathActionArg.x2, paramBasePathActionArg.y2, paramBasePathActionArg.x3, paramBasePathActionArg.y3);
      AppMethodBeat.o(103674);
    }
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103672);
    if (paramJSONArray.length() < 6)
      AppMethodBeat.o(103672);
    while (true)
    {
      return bool;
      bool = a(paramPath, g.d(paramJSONArray, 0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), g.d(paramJSONArray, 3), g.d(paramJSONArray, 4), g.d(paramJSONArray, 5));
      AppMethodBeat.o(103672);
    }
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103675);
    PathBezierCurveToActionArg localPathBezierCurveToActionArg = new PathBezierCurveToActionArg();
    AppMethodBeat.o(103675);
    return localPathBezierCurveToActionArg;
  }

  public final String getMethod()
  {
    return "bezierCurveTo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.d
 * JD-Core Version:    0.6.2
 */