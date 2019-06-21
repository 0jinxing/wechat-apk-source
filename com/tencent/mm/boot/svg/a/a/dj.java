package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class dj extends c
{
  private final int height = 40;
  private final int width = 40;

  public final int a(int paramInt, Object[] paramArrayOfObject)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      paramInt = 0;
      while (true)
      {
        return paramInt;
        paramInt = 40;
        continue;
        paramInt = 40;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -637.0F, 0.0F, 1.0F, -1392.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 637.0F, 0.0F, 1.0F, 1392.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-921103);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(40.0F, 0.0F);
      ((Path)localObject2).lineTo(40.0F, 40.0F);
      ((Path)localObject2).lineTo(0.0F, 40.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-3552823);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(16.955261F, 20.434963F);
      ((Path)localObject3).cubicTo(18.24053F, 22.476675F, 16.106638F, 23.401121F, 15.21541F, 23.914665F);
      ((Path)localObject3).cubicTo(11.381262F, 26.095942F, 9.705882F, 26.912895F, 9.705882F, 27.974316F);
      ((Path)localObject3).lineTo(9.705882F, 29.424192F);
      ((Path)localObject3).cubicTo(9.705882F, 29.890316F, 10.054523F, 30.294117F, 10.575808F, 30.294117F);
      ((Path)localObject3).lineTo(29.424192F, 30.294117F);
      ((Path)localObject3).cubicTo(29.945477F, 30.294117F, 30.294117F, 29.890316F, 30.294117F, 29.424192F);
      ((Path)localObject3).lineTo(30.294117F, 27.974316F);
      ((Path)localObject3).cubicTo(30.294117F, 26.912895F, 28.618738F, 26.095942F, 24.78459F, 23.914665F);
      ((Path)localObject3).cubicTo(23.893362F, 23.401121F, 21.75947F, 22.476675F, 23.044739F, 20.434963F);
      ((Path)localObject3).cubicTo(24.186148F, 18.739943F, 25.076778F, 18.04949F, 25.074566F, 15.21541F);
      ((Path)localObject3).cubicTo(25.076778F, 12.524936F, 23.08713F, 9.705882F, 20.144987F, 9.705882F);
      ((Path)localObject3).cubicTo(16.91287F, 9.705882F, 14.923222F, 12.524936F, 14.925435F, 15.21541F);
      ((Path)localObject3).cubicTo(14.923222F, 18.04949F, 15.813852F, 18.739943F, 16.955261F, 20.434963F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dj
 * JD-Core Version:    0.6.2
 */