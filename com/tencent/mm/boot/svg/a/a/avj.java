package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class avj extends c
{
  private final int height = 24;
  private final int width = 14;

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
        paramInt = 14;
        continue;
        paramInt = 24;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.SQUARE);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setColor(-7039852);
      localPaint2.setStrokeWidth(1.333333F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -297.0F, 0.0F, 1.0F, -1097.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(309.19489F, 1109.0F);
      ((Path)localObject1).lineTo(309.33334F, 1108.8616F);
      ((Path)localObject1).lineTo(309.09744F, 1108.6256F);
      ((Path)localObject1).lineTo(298.70767F, 1098.2358F);
      ((Path)localObject1).lineTo(298.47177F, 1098.0F);
      ((Path)localObject1).lineTo(298.0F, 1098.4718F);
      ((Path)localObject1).lineTo(298.2359F, 1098.7076F);
      ((Path)localObject1).lineTo(308.52823F, 1109.0F);
      ((Path)localObject1).lineTo(298.2359F, 1119.2924F);
      ((Path)localObject1).lineTo(298.0F, 1119.5282F);
      ((Path)localObject1).lineTo(298.47177F, 1120.0F);
      ((Path)localObject1).lineTo(298.70767F, 1119.7642F);
      ((Path)localObject1).lineTo(309.09744F, 1109.3744F);
      ((Path)localObject1).lineTo(309.33334F, 1109.1384F);
      ((Path)localObject1).lineTo(309.19489F, 1109.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avj
 * JD-Core Version:    0.6.2
 */