package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import android.graphics.Path.Direction;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class j
  implements a
{
  private static boolean a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(103697);
    paramPath.addRect(paramFloat1, paramFloat2, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4, Path.Direction.CW);
    AppMethodBeat.o(103697);
    return true;
  }

  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103698);
    paramBasePathActionArg = (PathRectActionArg)paramBasePathActionArg;
    boolean bool;
    if (paramBasePathActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103698);
    }
    while (true)
    {
      return bool;
      bool = a(paramPath, paramBasePathActionArg.x, paramBasePathActionArg.y, paramBasePathActionArg.width, paramBasePathActionArg.height);
      AppMethodBeat.o(103698);
    }
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103696);
    if (paramJSONArray.length() < 4)
      AppMethodBeat.o(103696);
    while (true)
    {
      return bool;
      bool = a(paramPath, g.d(paramJSONArray, 0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), g.d(paramJSONArray, 3));
      AppMethodBeat.o(103696);
    }
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103699);
    PathRectActionArg localPathRectActionArg = new PathRectActionArg();
    AppMethodBeat.o(103699);
    return localPathRectActionArg;
  }

  public final String getMethod()
  {
    return "rect";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.j
 * JD-Core Version:    0.6.2
 */