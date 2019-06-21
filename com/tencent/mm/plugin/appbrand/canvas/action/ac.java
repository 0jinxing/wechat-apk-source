package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg;
import org.json.JSONArray;

public final class ac
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, float paramFloat)
  {
    AppMethodBeat.i(103277);
    paramd.hcF.setStrokeMiter(paramFloat);
    paramd.hcE.setStrokeMiter(paramFloat);
    AppMethodBeat.o(103277);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103278);
    paramCanvas = (SeMiterLimitActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103278);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas.hdf);
      AppMethodBeat.o(103278);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103276);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103276);
    while (true)
    {
      return bool;
      bool = a(paramd, (float)paramJSONArray.optDouble(0));
      AppMethodBeat.o(103276);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103275);
    SeMiterLimitActionArg localSeMiterLimitActionArg = new SeMiterLimitActionArg();
    AppMethodBeat.o(103275);
    return localSeMiterLimitActionArg;
  }

  public final String getMethod()
  {
    return "setMiterLimit";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.ac
 * JD-Core Version:    0.6.2
 */