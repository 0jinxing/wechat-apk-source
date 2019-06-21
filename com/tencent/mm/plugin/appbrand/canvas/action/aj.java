package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;
import org.json.JSONException;

public final class aj
  implements d
{
  private static boolean a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    AppMethodBeat.i(103304);
    Matrix localMatrix = new Matrix();
    localMatrix.reset();
    localMatrix.setValues(new float[] { paramFloat1, paramFloat3, paramFloat5, paramFloat2, paramFloat4, paramFloat6, 0.0F, 0.0F, 1.0F });
    paramCanvas.concat(localMatrix);
    AppMethodBeat.o(103304);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103305);
    paramd = (SetTransformActionArg)paramDrawActionArg;
    boolean bool;
    if (paramd == null)
    {
      bool = false;
      AppMethodBeat.o(103305);
    }
    while (true)
    {
      return bool;
      bool = a(paramCanvas, paramd.scaleX, paramd.hdr, paramd.hds, paramd.scaleY, paramd.translateX, paramd.translateY);
      AppMethodBeat.o(103305);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103303);
    boolean bool;
    if (paramJSONArray.length() < 6)
    {
      AppMethodBeat.o(103303);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        bool = a(paramCanvas, (float)paramJSONArray.getDouble(0), (float)paramJSONArray.getDouble(1), (float)paramJSONArray.getDouble(2), (float)paramJSONArray.getDouble(3), g.c(paramJSONArray, 4), g.c(paramJSONArray, 5));
        AppMethodBeat.o(103303);
      }
      catch (JSONException paramd)
      {
        AppMethodBeat.o(103303);
        bool = false;
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103302);
    SetTransformActionArg localSetTransformActionArg = new SetTransformActionArg();
    AppMethodBeat.o(103302);
    return localSetTransformActionArg;
  }

  public final String getMethod()
  {
    return "transform";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.aj
 * JD-Core Version:    0.6.2
 */