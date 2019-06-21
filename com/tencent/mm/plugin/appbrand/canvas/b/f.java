package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathClosePathActionArg;
import org.json.JSONArray;

public final class f
  implements a
{
  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103684);
    paramPath.close();
    AppMethodBeat.o(103684);
    return true;
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103683);
    paramPath.close();
    AppMethodBeat.o(103683);
    return true;
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103685);
    PathClosePathActionArg localPathClosePathActionArg = new PathClosePathActionArg();
    AppMethodBeat.o(103685);
    return localPathClosePathActionArg;
  }

  public final String getMethod()
  {
    return "closePath";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.f
 * JD-Core Version:    0.6.2
 */