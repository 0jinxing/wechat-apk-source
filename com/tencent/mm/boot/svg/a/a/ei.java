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

public final class ei extends c
{
  private final int height = 57;
  private final int width = 45;

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
        paramInt = 45;
        continue;
        paramInt = 57;
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
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-11184811);
      localPaint1.setStrokeWidth(3.0F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1450.0F, 0.0F, 1.0F, -602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1470.9163F, 655.84851F);
      ((Path)localObject2).cubicTo(1472.067F, 657.03674F, 1473.9164F, 657.02386F, 1475.0333F, 655.78809F);
      ((Path)localObject2).cubicTo(1475.0333F, 655.78809F, 1492.0F, 638.46387F, 1492.0F, 624.0F);
      ((Path)localObject2).cubicTo(1492.0F, 612.76703F, 1483.2695F, 604.0F, 1473.0F, 604.0F);
      ((Path)localObject2).cubicTo(1461.7305F, 604.0F, 1453.0F, 612.76703F, 1453.0F, 624.0F);
      ((Path)localObject2).cubicTo(1453.0F, 638.46387F, 1470.9163F, 655.84851F, 1470.9163F, 655.84851F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1473.0F, 630.0F);
      ((Path)localObject2).cubicTo(1476.0898F, 630.0F, 1479.0F, 627.08984F, 1479.0F, 624.0F);
      ((Path)localObject2).cubicTo(1479.0F, 619.91016F, 1476.0898F, 617.0F, 1473.0F, 617.0F);
      ((Path)localObject2).cubicTo(1468.9102F, 617.0F, 1466.0F, 619.91016F, 1466.0F, 624.0F);
      ((Path)localObject2).cubicTo(1466.0F, 627.08984F, 1468.9102F, 630.0F, 1473.0F, 630.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ei
 * JD-Core Version:    0.6.2
 */