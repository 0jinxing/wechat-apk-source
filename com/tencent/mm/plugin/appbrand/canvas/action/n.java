package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.RotateActionArg;
import org.json.JSONArray;

public final class n
  implements d
{
  private static boolean a(Canvas paramCanvas, float paramFloat)
  {
    AppMethodBeat.i(103222);
    paramCanvas.rotate((float)(paramFloat / 3.141592653589793D * 180.0D));
    AppMethodBeat.o(103222);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103223);
    paramd = (RotateActionArg)paramDrawActionArg;
    boolean bool;
    if (paramd == null)
    {
      bool = false;
      AppMethodBeat.o(103223);
    }
    while (true)
    {
      return bool;
      bool = a(paramCanvas, paramd.hde);
      AppMethodBeat.o(103223);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103221);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103221);
    while (true)
    {
      return bool;
      bool = a(paramCanvas, (float)paramJSONArray.optDouble(0));
      AppMethodBeat.o(103221);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103220);
    RotateActionArg localRotateActionArg = new RotateActionArg();
    AppMethodBeat.o(103220);
    return localRotateActionArg;
  }

  public final String getMethod()
  {
    return "rotate";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.n
 * JD-Core Version:    0.6.2
 */