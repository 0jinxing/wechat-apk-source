package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class k
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(103210);
    paramCanvas.drawRect(paramFloat1, paramFloat2, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4, paramd.hcF);
    AppMethodBeat.o(103210);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103211);
    paramDrawActionArg = (FillRectActionArg)paramDrawActionArg;
    boolean bool;
    if (paramDrawActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103211);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas, paramDrawActionArg.x, paramDrawActionArg.y, paramDrawActionArg.width, paramDrawActionArg.height);
      AppMethodBeat.o(103211);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103209);
    if (paramJSONArray.length() < 4)
      AppMethodBeat.o(103209);
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas, g.d(paramJSONArray, 0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), g.d(paramJSONArray, 3));
      AppMethodBeat.o(103209);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103208);
    FillRectActionArg localFillRectActionArg = new FillRectActionArg();
    AppMethodBeat.o(103208);
    return localFillRectActionArg;
  }

  public final String getMethod()
  {
    return "fillRect";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.k
 * JD-Core Version:    0.6.2
 */