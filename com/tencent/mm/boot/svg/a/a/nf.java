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

public final class nf extends c
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
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1180.0F, 0.0F, 1.0F, -386.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1180.0F, 0.0F, 1.0F, 386.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(1711276032);
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
      localObject2 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      ((Paint)localObject2).setStrokeWidth(6.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(57.5F, 3.0F);
      ((Path)localObject1).cubicTo(87.599518F, 3.0F, 112.0F, 27.40048F, 112.0F, 57.5F);
      ((Path)localObject1).cubicTo(112.0F, 87.599518F, 87.599518F, 112.0F, 57.5F, 112.0F);
      ((Path)localObject1).cubicTo(27.40048F, 112.0F, 3.0F, 87.599518F, 3.0F, 57.5F);
      ((Path)localObject1).cubicTo(3.0F, 27.40048F, 27.40048F, 3.0F, 57.5F, 3.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject1).setColor(419430400);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(57.5F, 3.0F);
      ((Path)localObject4).cubicTo(87.599518F, 3.0F, 112.0F, 27.40048F, 112.0F, 57.5F);
      ((Path)localObject4).cubicTo(112.0F, 87.599518F, 87.599518F, 112.0F, 57.5F, 112.0F);
      ((Path)localObject4).cubicTo(27.40048F, 112.0F, 3.0F, 87.599518F, 3.0F, 57.5F);
      ((Path)localObject4).cubicTo(3.0F, 27.40048F, 27.40048F, 3.0F, 57.5F, 3.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(41.0F, 43.0F);
      ((Path)localObject1).cubicTo(41.0F, 41.895432F, 41.895432F, 41.0F, 43.0F, 41.0F);
      ((Path)localObject1).lineTo(72.0F, 41.0F);
      ((Path)localObject1).cubicTo(73.104568F, 41.0F, 74.0F, 41.895432F, 74.0F, 43.0F);
      ((Path)localObject1).lineTo(74.0F, 72.0F);
      ((Path)localObject1).cubicTo(74.0F, 73.104568F, 73.104568F, 74.0F, 72.0F, 74.0F);
      ((Path)localObject1).lineTo(43.0F, 74.0F);
      ((Path)localObject1).cubicTo(41.895432F, 74.0F, 41.0F, 73.104568F, 41.0F, 72.0F);
      ((Path)localObject1).lineTo(41.0F, 43.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject4);
      localCanvas.restore();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(419430400);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
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
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nf
 * JD-Core Version:    0.6.2
 */