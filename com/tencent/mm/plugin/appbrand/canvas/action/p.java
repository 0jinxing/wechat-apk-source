package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.ScaleActionArg;
import org.json.JSONArray;

public final class p
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103230);
    paramd = (ScaleActionArg)paramDrawActionArg;
    boolean bool;
    if (paramd == null)
    {
      bool = false;
      AppMethodBeat.o(103230);
    }
    while (true)
    {
      return bool;
      paramCanvas.scale(paramd.hcX, paramd.hcY);
      bool = true;
      AppMethodBeat.o(103230);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103229);
    if (paramJSONArray.length() < 2)
      AppMethodBeat.o(103229);
    while (true)
    {
      return bool;
      paramCanvas.scale((float)paramJSONArray.optDouble(0), (float)paramJSONArray.optDouble(1));
      AppMethodBeat.o(103229);
      bool = true;
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103228);
    ScaleActionArg localScaleActionArg = new ScaleActionArg();
    AppMethodBeat.o(103228);
    return localScaleActionArg;
  }

  public final String getMethod()
  {
    return "scale";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.p
 * JD-Core Version:    0.6.2
 */