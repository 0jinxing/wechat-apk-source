package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class ab
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, float paramFloat)
  {
    AppMethodBeat.i(103273);
    paramd.hcF.setStrokeWidth(paramFloat);
    paramd.hcE.setStrokeWidth(paramFloat);
    AppMethodBeat.o(103273);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103274);
    paramCanvas = (SetLineWidthActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103274);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas.hdn);
      AppMethodBeat.o(103274);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103272);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103272);
    while (true)
    {
      return bool;
      bool = a(paramd, g.d(paramJSONArray, 0));
      AppMethodBeat.o(103272);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103271);
    SetLineWidthActionArg localSetLineWidthActionArg = new SetLineWidthActionArg();
    AppMethodBeat.o(103271);
    return localSetLineWidthActionArg;
  }

  public final String getMethod()
  {
    return "setLineWidth";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.ab
 * JD-Core Version:    0.6.2
 */