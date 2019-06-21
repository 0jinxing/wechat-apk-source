package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class af
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103289);
    paramDrawActionArg = (SetStrokeStyleActionArg)paramDrawActionArg;
    boolean bool;
    if (paramDrawActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103289);
    }
    while (true)
    {
      return bool;
      bool = paramDrawActionArg.a(paramd, paramCanvas);
      AppMethodBeat.o(103289);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103288);
    boolean bool;
    if (paramJSONArray.length() < 2)
    {
      bool = false;
      AppMethodBeat.o(103288);
    }
    float f1;
    float f2;
    float f3;
    float f4;
    while (true)
    {
      return bool;
      paramCanvas = paramJSONArray.optString(0);
      if (!"linear".equalsIgnoreCase(paramCanvas))
        break label260;
      if (paramJSONArray.length() < 3)
      {
        bool = false;
        AppMethodBeat.o(103288);
      }
      else
      {
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 4))
        {
          bool = false;
          AppMethodBeat.o(103288);
        }
        else
        {
          f1 = g.d(paramCanvas, 0);
          f2 = g.d(paramCanvas, 1);
          f3 = g.d(paramCanvas, 2);
          f4 = g.d(paramCanvas, 3);
          paramCanvas = paramJSONArray.optJSONArray(2);
          if ((paramCanvas != null) && (paramCanvas.length() != 0))
            break;
          bool = false;
          AppMethodBeat.o(103288);
        }
      }
    }
    Object localObject1 = new int[paramCanvas.length()];
    paramJSONArray = new float[paramCanvas.length()];
    Object localObject2;
    for (int i = 0; i < paramCanvas.length(); i++)
    {
      localObject2 = paramCanvas.optJSONArray(i);
      if (((JSONArray)localObject2).length() >= 2)
      {
        paramJSONArray[i] = ((float)((JSONArray)localObject2).optDouble(0));
        localObject1[i] = g.n(((JSONArray)localObject2).optJSONArray(1));
      }
    }
    paramCanvas = new LinearGradient(f1, f2, f3, f4, (int[])localObject1, paramJSONArray, Shader.TileMode.CLAMP);
    paramd.hcE.setShader(paramCanvas);
    while (true)
    {
      bool = true;
      AppMethodBeat.o(103288);
      break;
      label260: if ("radial".equalsIgnoreCase(paramCanvas))
      {
        if (paramJSONArray.length() < 3)
        {
          bool = false;
          AppMethodBeat.o(103288);
          break;
        }
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 3))
        {
          bool = false;
          AppMethodBeat.o(103288);
          break;
        }
        f1 = g.d(paramCanvas, 1);
        f3 = g.d(paramCanvas, 2);
        f4 = g.d(paramCanvas, 3);
        localObject1 = paramJSONArray.optJSONArray(2);
        localObject2 = new int[((JSONArray)localObject1).length()];
        paramJSONArray = new float[((JSONArray)localObject1).length()];
        for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        {
          paramCanvas = ((JSONArray)localObject1).optJSONArray(i);
          if (paramCanvas.length() >= 2)
          {
            paramJSONArray[i] = ((float)paramCanvas.optDouble(0));
            localObject2[i] = g.n(paramCanvas.optJSONArray(1));
          }
        }
        paramCanvas = new RadialGradient(f1, f3, f4, (int[])localObject2, paramJSONArray, Shader.TileMode.CLAMP);
        paramd.hcE.setShader(paramCanvas);
        continue;
      }
      if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 4))
        {
          bool = false;
          AppMethodBeat.o(103288);
          break;
        }
        paramd.hcE.setColor(g.n(paramCanvas));
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103287);
    SetStrokeStyleActionArg localSetStrokeStyleActionArg = new SetStrokeStyleActionArg();
    AppMethodBeat.o(103287);
    return localSetStrokeStyleActionArg;
  }

  public final String getMethod()
  {
    return "setStrokeStyle";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.af
 * JD-Core Version:    0.6.2
 */