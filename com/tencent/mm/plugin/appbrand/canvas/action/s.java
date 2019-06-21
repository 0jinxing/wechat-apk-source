package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class s
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, int paramInt)
  {
    AppMethodBeat.i(103240);
    paramd.hcF.setTextSize(paramInt);
    paramd.hcE.setTextSize(paramInt);
    AppMethodBeat.o(103240);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103241);
    paramCanvas = (SetFontSizeActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103241);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas.size);
      AppMethodBeat.o(103241);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103239);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103239);
    while (true)
    {
      return bool;
      bool = a(paramd, g.a(paramJSONArray, 0));
      AppMethodBeat.o(103239);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103238);
    SetFontSizeActionArg localSetFontSizeActionArg = new SetFontSizeActionArg();
    AppMethodBeat.o(103238);
    return localSetFontSizeActionArg;
  }

  public final String getMethod()
  {
    return "setFontSize";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.s
 * JD-Core Version:    0.6.2
 */