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

public final class ael extends c
{
  private final int height = 48;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 48;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-15028967);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -69.0F, 0.0F, 1.0F, -98.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 69.0F, 0.0F, 1.0F, 98.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 6.006387F);
      ((Path)localObject).cubicTo(0.0F, 2.689151F, 2.683541F, 0.0F, 6.006387F, 0.0F);
      ((Path)localObject).lineTo(41.993614F, 0.0F);
      ((Path)localObject).cubicTo(45.310848F, 0.0F, 48.0F, 2.683541F, 48.0F, 6.006387F);
      ((Path)localObject).lineTo(48.0F, 41.993614F);
      ((Path)localObject).cubicTo(48.0F, 45.310848F, 45.31646F, 48.0F, 41.993614F, 48.0F);
      ((Path)localObject).lineTo(6.006387F, 48.0F);
      ((Path)localObject).cubicTo(2.689151F, 48.0F, 0.0F, 45.31646F, 0.0F, 41.993614F);
      ((Path)localObject).lineTo(0.0F, 6.006387F);
      ((Path)localObject).lineTo(0.0F, 6.006387F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(6.0F, 26.576923F);
      ((Path)localObject).lineTo(10.2F, 22.538462F);
      ((Path)localObject).lineTo(19.0F, 30.923077F);
      ((Path)localObject).lineTo(37.799999F, 13.0F);
      ((Path)localObject).lineTo(42.0F, 17.038462F);
      ((Path)localObject).lineTo(19.0F, 39.0F);
      ((Path)localObject).lineTo(6.0F, 26.576923F);
      ((Path)localObject).lineTo(6.0F, 26.576923F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ael
 * JD-Core Version:    0.6.2
 */