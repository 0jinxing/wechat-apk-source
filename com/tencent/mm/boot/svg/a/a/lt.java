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

public final class lt extends c
{
  private final int height = 260;
  private final int width = 260;

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
        paramInt = 260;
        continue;
        paramInt = 260;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -449.0F, 0.0F, 1.0F, -309.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 459.0F, 0.0F, 1.0F, 319.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(10.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(240.0F, 121.48148F);
      ((Path)localObject1).cubicTo(240.0F, 53.724445F, 186.27556F, 0.0F, 118.51852F, 0.0F);
      ((Path)localObject1).cubicTo(53.724445F, 0.0F, 0.0F, 53.724445F, 0.0F, 121.48148F);
      ((Path)localObject1).cubicTo(0.0F, 186.27556F, 53.724445F, 240.0F, 118.51852F, 240.0F);
      ((Path)localObject1).cubicTo(186.27556F, 240.0F, 240.0F, 186.27556F, 240.0F, 121.48148F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(62.897171F, 128.89716F);
      ((Path)localObject2).cubicTo(62.320534F, 128.30037F, 62.253185F, 127.27216F, 62.745144F, 126.60276F);
      ((Path)localObject2).lineTo(67.678764F, 119.88967F);
      ((Path)localObject2).cubicTo(68.17144F, 119.2193F, 69.103912F, 119.08443F, 69.767876F, 119.59332F);
      ((Path)localObject2).lineTo(100.45844F, 143.11588F);
      ((Path)localObject2).cubicTo(101.11954F, 143.62259F, 102.17168F, 143.60332F, 102.81298F, 143.06906F);
      ((Path)localObject2).lineTo(178.11874F, 80.333267F);
      ((Path)localObject2).cubicTo(178.75801F, 79.800705F, 179.75937F, 79.846115F, 180.34068F, 80.420227F);
      ((Path)localObject2).lineTo(184.92955F, 84.952164F);
      ((Path)localObject2).cubicTo(185.51743F, 85.532753F, 185.51967F, 86.470215F, 184.92761F, 87.052887F);
      ((Path)localObject2).lineTo(102.71939F, 167.95805F);
      ((Path)localObject2).cubicTo(102.13045F, 168.53767F, 101.19228F, 168.5307F, 100.60892F, 167.92696F);
      ((Path)localObject2).lineTo(62.897171F, 128.89716F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.lt
 * JD-Core Version:    0.6.2
 */