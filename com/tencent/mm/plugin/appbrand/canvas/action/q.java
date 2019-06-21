package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;

public final class q
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103233);
    paramDrawActionArg = (SetFillStyleActionArg)paramDrawActionArg;
    boolean bool;
    if (paramDrawActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103233);
    }
    while (true)
    {
      return bool;
      bool = paramDrawActionArg.a(paramd, paramCanvas);
      AppMethodBeat.o(103233);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103232);
    boolean bool;
    if (paramJSONArray.length() < 2)
    {
      bool = false;
      AppMethodBeat.o(103232);
    }
    Object localObject1;
    float f1;
    float f2;
    float f3;
    float f4;
    while (true)
    {
      return bool;
      localObject1 = paramJSONArray.optString(0);
      paramCanvas = paramd.hcF;
      if (!"linear".equalsIgnoreCase((String)localObject1))
        break label262;
      if (paramJSONArray.length() < 3)
      {
        bool = false;
        AppMethodBeat.o(103232);
      }
      else
      {
        paramd = paramJSONArray.optJSONArray(1);
        if ((paramd == null) || (paramd.length() < 4))
        {
          bool = false;
          AppMethodBeat.o(103232);
        }
        else
        {
          f1 = g.d(paramd, 0);
          f2 = g.d(paramd, 1);
          f3 = g.d(paramd, 2);
          f4 = g.d(paramd, 3);
          paramd = paramJSONArray.optJSONArray(2);
          if ((paramd != null) && (paramd.length() != 0))
            break;
          bool = false;
          AppMethodBeat.o(103232);
        }
      }
    }
    paramJSONArray = new int[paramd.length()];
    Object localObject2 = new float[paramd.length()];
    for (int i = 0; i < paramd.length(); i++)
    {
      localObject1 = paramd.optJSONArray(i);
      if (((JSONArray)localObject1).length() >= 2)
      {
        localObject2[i] = ((float)((JSONArray)localObject1).optDouble(0));
        paramJSONArray[i] = g.n(((JSONArray)localObject1).optJSONArray(1));
      }
    }
    paramCanvas.setShader(new LinearGradient(f1, f2, f3, f4, paramJSONArray, (float[])localObject2, Shader.TileMode.CLAMP));
    label262: label544: 
    do
    {
      do
        while (true)
        {
          bool = true;
          AppMethodBeat.o(103232);
          break;
          if ("radial".equalsIgnoreCase((String)localObject1))
          {
            if (paramJSONArray.length() < 3)
            {
              bool = false;
              AppMethodBeat.o(103232);
              break;
            }
            paramd = paramJSONArray.optJSONArray(1);
            if ((paramd == null) || (paramd.length() < 3))
            {
              bool = false;
              AppMethodBeat.o(103232);
              break;
            }
            f4 = g.d(paramd, 0);
            f1 = g.d(paramd, 1);
            f3 = g.d(paramd, 2);
            if (f3 <= 0.0F)
            {
              com.tencent.luggage.g.d.i("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle(radial) failed, sr(%s) <= 0.", new Object[] { Float.valueOf(f3) });
              bool = false;
              AppMethodBeat.o(103232);
              break;
            }
            localObject2 = paramJSONArray.optJSONArray(2);
            paramd = new int[((JSONArray)localObject2).length()];
            paramJSONArray = new float[((JSONArray)localObject2).length()];
            for (i = 0; i < ((JSONArray)localObject2).length(); i++)
            {
              localObject1 = ((JSONArray)localObject2).optJSONArray(i);
              if (((JSONArray)localObject1).length() >= 2)
              {
                paramJSONArray[i] = ((float)((JSONArray)localObject1).optDouble(0));
                paramd[i] = g.n(((JSONArray)localObject1).optJSONArray(1));
              }
            }
            paramCanvas.setShader(new RadialGradient(f4, f1, f3, paramd, paramJSONArray, Shader.TileMode.CLAMP));
            continue;
          }
          if (!"normal".equalsIgnoreCase((String)localObject1))
            break label544;
          paramd = paramJSONArray.optJSONArray(1);
          if ((paramd == null) || (paramd.length() < 4))
          {
            bool = false;
            AppMethodBeat.o(103232);
            break;
          }
          paramCanvas.setShader(null);
          paramCanvas.setColor(g.n(paramd));
        }
      while (!"pattern".equalsIgnoreCase((String)localObject1));
      localObject1 = paramJSONArray.optString(1);
      paramJSONArray = paramJSONArray.optString(2);
      if (bo.isNullOrNil((String)localObject1))
      {
        com.tencent.luggage.g.d.w("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle failed, type is pattern but image path is null or nil.");
        bool = false;
        AppMethodBeat.o(103232);
        break;
      }
      paramd = paramd.hcK.a(paramd, (String)localObject1);
    }
    while ((paramd == null) || (paramd.isRecycled()));
    int j = g.qb(paramd.getWidth());
    int k = g.qb(paramd.getHeight());
    i = -1;
    switch (paramJSONArray.hashCode())
    {
    default:
      switch (i)
      {
      default:
        label684: paramd = null;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case -934531685:
    case -436782906:
    case -436782905:
    case -724648153:
    }
    while (true)
    {
      paramCanvas.setShader(paramd);
      break;
      if (!paramJSONArray.equals("repeat"))
        break label684;
      i = 0;
      break label684;
      if (!paramJSONArray.equals("repeat-x"))
        break label684;
      i = 1;
      break label684;
      if (!paramJSONArray.equals("repeat-y"))
        break label684;
      i = 2;
      break label684;
      if (!paramJSONArray.equals("no-repeat"))
        break label684;
      i = 3;
      break label684;
      paramJSONArray = Bitmap.createScaledBitmap(paramd, j, k, false);
      paramd = Shader.TileMode.REPEAT;
      paramd = new BitmapShader(paramJSONArray, paramd, paramd);
      continue;
      paramJSONArray = Bitmap.createBitmap(j, k + 1, Bitmap.Config.ARGB_8888);
      new Canvas(paramJSONArray).drawBitmap(paramd, new Rect(0, 0, paramd.getWidth(), paramd.getHeight()), new RectF(0.0F, 0.0F, j, k), null);
      paramd = new BitmapShader(paramJSONArray, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      continue;
      paramJSONArray = Bitmap.createBitmap(j + 1, k, Bitmap.Config.ARGB_8888);
      new Canvas(paramJSONArray).drawBitmap(paramd, new Rect(0, 0, paramd.getWidth(), paramd.getHeight()), new RectF(0.0F, 0.0F, j, k), null);
      paramd = new BitmapShader(paramJSONArray, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
      continue;
      paramJSONArray = Bitmap.createBitmap(j + 1, k + 1, Bitmap.Config.ARGB_8888);
      new Canvas(paramJSONArray).drawBitmap(paramd, new Rect(0, 0, paramd.getWidth(), paramd.getHeight()), new RectF(0.0F, 0.0F, j, k), null);
      paramd = Shader.TileMode.CLAMP;
      paramd = new BitmapShader(paramJSONArray, paramd, paramd);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103231);
    SetFillStyleActionArg localSetFillStyleActionArg = new SetFillStyleActionArg();
    AppMethodBeat.o(103231);
    return localSetFillStyleActionArg;
  }

  public final String getMethod()
  {
    return "setFillStyle";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.q
 * JD-Core Version:    0.6.2
 */