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

public final class nh extends c
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
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -513.0F, 0.0F, 1.0F, -1170.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 513.0F, 0.0F, 1.0F, 1170.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(57.5F, 3.0F);
      ((Path)localObject3).cubicTo(87.599518F, 3.0F, 112.0F, 27.40048F, 112.0F, 57.5F);
      ((Path)localObject3).cubicTo(112.0F, 87.599518F, 87.599518F, 112.0F, 57.5F, 112.0F);
      ((Path)localObject3).cubicTo(27.40048F, 112.0F, 3.0F, 87.599518F, 3.0F, 57.5F);
      ((Path)localObject3).cubicTo(3.0F, 27.40048F, 27.40048F, 3.0F, 57.5F, 3.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-5066062);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(41.0F, 43.0F);
      ((Path)localObject2).cubicTo(41.0F, 41.895432F, 41.895432F, 41.0F, 43.0F, 41.0F);
      ((Path)localObject2).lineTo(72.0F, 41.0F);
      ((Path)localObject2).cubicTo(73.104568F, 41.0F, 74.0F, 41.895432F, 74.0F, 43.0F);
      ((Path)localObject2).lineTo(74.0F, 72.0F);
      ((Path)localObject2).cubicTo(74.0F, 73.104568F, 73.104568F, 74.0F, 72.0F, 74.0F);
      ((Path)localObject2).lineTo(43.0F, 74.0F);
      ((Path)localObject2).cubicTo(41.895432F, 74.0F, 41.0F, 73.104568F, 41.0F, 72.0F);
      ((Path)localObject2).lineTo(41.0F, 43.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nh
 * JD-Core Version:    0.6.2
 */