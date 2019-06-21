package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class h
  implements a
{
  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103690);
    paramBasePathActionArg = (PathMoveToActionArg)paramBasePathActionArg;
    boolean bool;
    if (paramBasePathActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103690);
    }
    while (true)
    {
      return bool;
      paramPath.moveTo(paramBasePathActionArg.x, paramBasePathActionArg.y);
      bool = true;
      AppMethodBeat.o(103690);
    }
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103689);
    if (paramJSONArray.length() < 2)
      AppMethodBeat.o(103689);
    while (true)
    {
      return bool;
      paramPath.moveTo(g.d(paramJSONArray, 0), g.d(paramJSONArray, 1));
      AppMethodBeat.o(103689);
      bool = true;
    }
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103691);
    PathMoveToActionArg localPathMoveToActionArg = new PathMoveToActionArg();
    AppMethodBeat.o(103691);
    return localPathMoveToActionArg;
  }

  public final String getMethod()
  {
    return "moveTo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.h
 * JD-Core Version:    0.6.2
 */