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

public final class hj extends c
{
  private final int height = 100;
  private final int width = 100;

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
        paramInt = 100;
        continue;
        paramInt = 100;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-9473160);
      ((Paint)localObject3).setStrokeWidth(6.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 59.0F, 0.0F, 1.0F, 38.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 1.973422F);
      ((Path)localObject2).cubicTo(0.0F, 0.8835311F, 0.8835311F, 0.0F, 1.973422F, 0.0F);
      ((Path)localObject2).lineTo(28.026579F, 0.0F);
      ((Path)localObject2).cubicTo(29.11647F, 0.0F, 30.0F, 0.8835311F, 30.0F, 1.973422F);
      ((Path)localObject2).lineTo(30.0F, 46.026577F);
      ((Path)localObject2).cubicTo(30.0F, 47.116467F, 29.11647F, 48.0F, 28.026579F, 48.0F);
      ((Path)localObject2).lineTo(1.973422F, 48.0F);
      ((Path)localObject2).cubicTo(0.8835311F, 48.0F, 0.0F, 47.116467F, 0.0F, 46.026577F);
      ((Path)localObject2).lineTo(0.0F, 1.973422F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(69.0F, 35.0F);
      ((Path)localObject3).lineTo(69.0F, 15.980916F);
      ((Path)localObject3).cubicTo(69.0F, 14.886887F, 68.122162F, 14.0F, 67.023438F, 14.0F);
      ((Path)localObject3).lineTo(24.976563F, 14.0F);
      ((Path)localObject3).cubicTo(23.884937F, 14.0F, 23.0F, 14.88437F, 23.0F, 15.981961F);
      ((Path)localObject3).lineTo(23.0F, 84.018036F);
      ((Path)localObject3).cubicTo(23.0F, 85.112648F, 23.873781F, 86.0F, 24.969942F, 86.0F);
      ((Path)localObject3).lineTo(56.0F, 86.0F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.hj
 * JD-Core Version:    0.6.2
 */