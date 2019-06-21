package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.TranslateActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class ak
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103308);
    paramd = (TranslateActionArg)paramDrawActionArg;
    boolean bool;
    if (paramd == null)
    {
      bool = false;
      AppMethodBeat.o(103308);
    }
    while (true)
    {
      return bool;
      paramCanvas.translate(paramd.x, paramd.y);
      bool = true;
      AppMethodBeat.o(103308);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103307);
    if (paramJSONArray.length() < 2)
      AppMethodBeat.o(103307);
    while (true)
    {
      return bool;
      paramCanvas.translate(g.d(paramJSONArray, 0), g.d(paramJSONArray, 1));
      AppMethodBeat.o(103307);
      bool = true;
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103306);
    TranslateActionArg localTranslateActionArg = new TranslateActionArg();
    AppMethodBeat.o(103306);
    return localTranslateActionArg;
  }

  public final String getMethod()
  {
    return "translate";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.ak
 * JD-Core Version:    0.6.2
 */