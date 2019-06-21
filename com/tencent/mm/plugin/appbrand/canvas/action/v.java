package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg;
import org.json.JSONArray;
import org.json.JSONException;

public final class v
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, int paramInt)
  {
    AppMethodBeat.i(103252);
    paramd.hcE.ai(paramInt / 255.0F);
    paramd.hcF.ai(paramInt / 255.0F);
    AppMethodBeat.o(103252);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103253);
    paramCanvas = (SetGlobalAlphaActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103253);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas.alpha);
      AppMethodBeat.o(103253);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103251);
    try
    {
      int i = paramJSONArray.getInt(0);
      bool = a(paramd, i);
      AppMethodBeat.o(103251);
      return bool;
    }
    catch (JSONException paramd)
    {
      while (true)
      {
        com.tencent.luggage.g.d.e("MicroMsg.SetGlobalAlphaAction", "getGlobalAlpha value error. exception : %s", new Object[] { paramd });
        AppMethodBeat.o(103251);
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103250);
    SetGlobalAlphaActionArg localSetGlobalAlphaActionArg = new SetGlobalAlphaActionArg();
    AppMethodBeat.o(103250);
    return localSetGlobalAlphaActionArg;
  }

  public final String getMethod()
  {
    return "setGlobalAlpha";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.v
 * JD-Core Version:    0.6.2
 */