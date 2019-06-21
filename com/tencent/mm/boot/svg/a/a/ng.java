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

public final class ng extends c
{
  private final int height = 115;
  private final int width = 115;

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
        paramInt = 115;
        continue;
        paramInt = 115;
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1018.0F, 0.0F, 1.0F, -386.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1018.0F, 0.0F, 1.0F, 386.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(1275068416);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(57.5F, 0.0F);
      ((Path)localObject2).cubicTo(89.256378F, 0.0F, 115.0F, 25.743626F, 115.0F, 57.5F);
      ((Path)localObject2).cubicTo(115.0F, 89.256378F, 89.256378F, 115.0F, 57.5F, 115.0F);
      ((Path)localObject2).cubicTo(25.743626F, 115.0F, 0.0F, 89.256378F, 0.0F, 57.5F);
      ((Path)localObject2).cubicTo(0.0F, 25.743626F, 25.743626F, 0.0F, 57.5F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(6.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(57.5F, 3.0F);
      ((Path)localObject1).cubicTo(87.599518F, 3.0F, 112.0F, 27.40048F, 112.0F, 57.5F);
      ((Path)localObject1).cubicTo(112.0F, 87.599518F, 87.599518F, 112.0F, 57.5F, 112.0F);
      ((Path)localObject1).cubicTo(27.40048F, 112.0F, 3.0F, 87.599518F, 3.0F, 57.5F);
      ((Path)localObject1).cubicTo(3.0F, 27.40048F, 27.40048F, 3.0F, 57.5F, 3.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(41.0F, 43.0F);
      ((Path)localObject3).cubicTo(41.0F, 41.895432F, 41.895432F, 41.0F, 43.0F, 41.0F);
      ((Path)localObject3).lineTo(72.0F, 41.0F);
      ((Path)localObject3).cubicTo(73.104568F, 41.0F, 74.0F, 41.895432F, 74.0F, 43.0F);
      ((Path)localObject3).lineTo(74.0F, 72.0F);
      ((Path)localObject3).cubicTo(74.0F, 73.104568F, 73.104568F, 74.0F, 72.0F, 74.0F);
      ((Path)localObject3).lineTo(43.0F, 74.0F);
      ((Path)localObject3).cubicTo(41.895432F, 74.0F, 41.0F, 73.104568F, 41.0F, 72.0F);
      ((Path)localObject3).lineTo(41.0F, 43.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ng
 * JD-Core Version:    0.6.2
 */