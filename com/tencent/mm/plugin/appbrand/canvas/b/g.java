package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg;
import org.json.JSONArray;

public final class g
  implements a
{
  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103687);
    paramBasePathActionArg = (PathLineToActionArg)paramBasePathActionArg;
    boolean bool;
    if (paramBasePathActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103687);
    }
    while (true)
    {
      return bool;
      paramPath.lineTo(paramBasePathActionArg.x, paramBasePathActionArg.y);
      bool = true;
      AppMethodBeat.o(103687);
    }
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103686);
    if (paramJSONArray.length() < 2)
      AppMethodBeat.o(103686);
    while (true)
    {
      return bool;
      paramPath.lineTo(com.tencent.mm.plugin.appbrand.r.g.d(paramJSONArray, 0), com.tencent.mm.plugin.appbrand.r.g.d(paramJSONArray, 1));
      AppMethodBeat.o(103686);
      bool = true;
    }
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103688);
    PathLineToActionArg localPathLineToActionArg = new PathLineToActionArg();
    AppMethodBeat.o(103688);
    return localPathLineToActionArg;
  }

  public final String getMethod()
  {
    return "lineTo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.g
 * JD-Core Version:    0.6.2
 */