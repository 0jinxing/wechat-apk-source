package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.canvas.e.a;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class f
  implements d
{
  private boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, int paramInt1, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(103191);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(103191);
    }
    while (true)
    {
      return bool;
      if (paramInt1 < 5)
        break label653;
      if ((paramFloat3 != 0.0F) && (paramFloat4 != 0.0F))
        break;
      bool = true;
      AppMethodBeat.o(103191);
    }
    float f1;
    label73: float f2;
    float f3;
    if (paramFloat3 < 0.0F)
    {
      f1 = paramFloat1 + paramFloat3;
      paramFloat3 = -paramFloat3;
      if (paramFloat4 < 0.0F)
      {
        f2 = -paramFloat4;
        paramFloat1 = paramFloat2 + paramFloat4;
        f3 = paramFloat3;
        paramFloat2 = f1;
      }
    }
    while (true)
    {
      paramFloat3 = paramFloat2 + f3;
      paramFloat4 = paramFloat1 + f2;
      if (paramInt1 >= 9)
      {
        if ((paramInt4 == 0) || (paramInt5 == 0))
        {
          bool = true;
          AppMethodBeat.o(103191);
          break;
        }
        if (paramInt4 >= 0)
          break label621;
        paramInt1 = paramInt2 + paramInt4;
        paramInt4 = -paramInt4;
      }
      while (true)
      {
        if (paramInt5 < 0)
        {
          paramInt2 = paramInt3 + paramInt5;
          paramInt5 = -paramInt5;
        }
        while (true)
        {
          if ((paramInt1 + paramInt4 <= 0) || (paramInt2 + paramInt5 <= 0))
          {
            bool = true;
            AppMethodBeat.o(103191);
            break;
          }
          if (paramInt1 > 0)
          {
            paramInt3 = paramInt1;
            label207: if (paramInt2 <= 0)
              break label292;
          }
          Object localObject;
          label292: for (int i = paramInt2; ; i = 0)
          {
            localObject = new Rect(paramInt3, i, paramInt1 + paramInt4, paramInt2 + paramInt5);
            paramString = paramd.hcK.a(paramd, paramString, (Rect)localObject, new f.1(this));
            if ((paramString != null) && (!paramString.isRecycled()))
              break label298;
            bool = false;
            AppMethodBeat.o(103191);
            break;
            paramInt3 = 0;
            break label207;
          }
          label298: paramInt1 = g.qb(paramInt1);
          paramInt2 = g.qb(paramInt2);
          paramInt4 = g.qb(paramInt4);
          paramInt5 = g.qb(paramInt5);
          paramInt3 = g.qb(paramInt3);
          int j = g.qb(i);
          i = g.qb(paramString.getWidth());
          int k = g.qb(paramString.getHeight());
          paramFloat4 = f3 / paramInt4;
          paramFloat3 = f2 / paramInt5;
          f1 = paramFloat2 + (paramInt3 - paramInt1) * paramFloat4;
          f3 = paramFloat1 + (j - paramInt2) * paramFloat3;
          float f4 = f1 + i * paramFloat4;
          paramFloat4 = k * paramFloat3 + f3;
          while (true)
          {
            paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            paramCanvas.drawBitmap(paramString, new Rect(0, 0, paramString.getWidth(), paramString.getHeight()), new RectF(f1, f3, f4, paramFloat4), paramd.hcF);
            bool = true;
            AppMethodBeat.o(103191);
            break;
            localObject = paramd.hcK.a(paramd, paramString, new e.a()
            {
              public final void a(com.tencent.mm.plugin.appbrand.canvas.d paramAnonymousd)
              {
                AppMethodBeat.i(103187);
                paramAnonymousd.invalidate();
                AppMethodBeat.o(103187);
              }
            });
            if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
            {
              bool = false;
              AppMethodBeat.o(103191);
              break;
            }
            if (f3 == 0.0F)
              paramFloat3 = g.qb(((Bitmap)localObject).getWidth()) + paramFloat2;
            f4 = paramFloat3;
            f3 = paramFloat1;
            f1 = paramFloat2;
            paramString = (String)localObject;
            if (f2 == 0.0F)
            {
              paramFloat4 = g.qb(((Bitmap)localObject).getHeight()) + paramFloat1;
              f4 = paramFloat3;
              f3 = paramFloat1;
              f1 = paramFloat2;
              paramString = (String)localObject;
            }
          }
          paramInt2 = paramInt3;
        }
        label621: paramInt1 = paramInt2;
      }
      paramFloat1 = paramFloat2;
      paramFloat2 = f1;
      f3 = paramFloat3;
      f2 = paramFloat4;
      continue;
      f1 = paramFloat1;
      break label73;
      label653: f1 = paramFloat2;
      paramFloat2 = paramFloat1;
      paramFloat1 = f1;
      f3 = paramFloat3;
      f2 = paramFloat4;
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103190);
    paramDrawActionArg = (DrawImageActionArg)paramDrawActionArg;
    boolean bool;
    if (paramDrawActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103190);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas, paramDrawActionArg.hcT, paramDrawActionArg.url, paramDrawActionArg.x, paramDrawActionArg.y, paramDrawActionArg.width, paramDrawActionArg.height, paramDrawActionArg.hcU, paramDrawActionArg.hcV, paramDrawActionArg.aIJ, paramDrawActionArg.aIK);
      AppMethodBeat.o(103190);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103189);
    int i = paramJSONArray.length();
    boolean bool;
    if (i < 3)
    {
      bool = false;
      AppMethodBeat.o(103189);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas, i, paramJSONArray.optString(0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), g.d(paramJSONArray, 3), g.d(paramJSONArray, 4), paramJSONArray.optInt(5), paramJSONArray.optInt(6), paramJSONArray.optInt(7), paramJSONArray.optInt(8));
      AppMethodBeat.o(103189);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103188);
    DrawImageActionArg localDrawImageActionArg = new DrawImageActionArg();
    AppMethodBeat.o(103188);
    return localDrawImageActionArg;
  }

  public final String getMethod()
  {
    return "drawImage";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.f
 * JD-Core Version:    0.6.2
 */