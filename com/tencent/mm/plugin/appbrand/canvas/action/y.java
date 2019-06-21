package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;
import org.json.JSONException;

public final class y
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, float[] paramArrayOfFloat, float paramFloat)
  {
    AppMethodBeat.i(103264);
    if ((paramArrayOfFloat != null) && (paramFloat != 1.4E-45F))
      paramd.hcE.setPathEffect(new DashPathEffect(paramArrayOfFloat, paramFloat));
    AppMethodBeat.o(103264);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103265);
    paramCanvas = (SetLineDashActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103265);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas.hdk, paramCanvas.hdl);
      AppMethodBeat.o(103265);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103263);
    if (paramJSONArray.length() < 2)
      AppMethodBeat.o(103263);
    while (true)
    {
      return bool;
      try
      {
        JSONArray localJSONArray = paramJSONArray.getJSONArray(0);
        if (localJSONArray == null)
        {
          AppMethodBeat.o(103263);
        }
        else
        {
          paramCanvas = new float[localJSONArray.length()];
          for (int i = 0; i < paramCanvas.length; i++)
            paramCanvas[i] = g.d(localJSONArray, i);
          float f = g.d(paramJSONArray, 1);
          bool = a(paramd, paramCanvas, f);
          AppMethodBeat.o(103263);
        }
      }
      catch (JSONException paramd)
      {
        AppMethodBeat.o(103263);
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103262);
    SetLineDashActionArg localSetLineDashActionArg = new SetLineDashActionArg();
    AppMethodBeat.o(103262);
    return localSetLineDashActionArg;
  }

  public final String getMethod()
  {
    return "setLineDash";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.y
 * JD-Core Version:    0.6.2
 */