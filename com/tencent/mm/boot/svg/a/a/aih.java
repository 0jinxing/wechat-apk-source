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

public final class aih extends c
{
  private final int height = 63;
  private final int width = 63;

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
        paramInt = 63;
        continue;
        paramInt = 63;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject1).setColor(16777215);
      ((Paint)localObject2).setColor(-1);
      ((Paint)localObject2).setStrokeWidth(2.0F);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 1.5F);
      ((Path)localObject1).cubicTo(0.0F, 0.671573F, 0.671573F, 0.0F, 1.5F, 0.0F);
      ((Path)localObject1).lineTo(37.5F, 0.0F);
      ((Path)localObject1).cubicTo(38.328426F, 0.0F, 39.0F, 0.671573F, 39.0F, 1.5F);
      ((Path)localObject1).lineTo(39.0F, 37.5F);
      ((Path)localObject1).cubicTo(39.0F, 38.328426F, 38.328426F, 39.0F, 37.5F, 39.0F);
      ((Path)localObject1).lineTo(1.5F, 39.0F);
      ((Path)localObject1).cubicTo(0.671573F, 39.0F, 0.0F, 38.328426F, 0.0F, 37.5F);
      ((Path)localObject1).lineTo(0.0F, 1.5F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject4);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 0.0F);
      ((Path)localObject4).lineTo(20.0F, 0.0F);
      ((Path)localObject4).lineTo(20.0F, 20.0F);
      ((Path)localObject4).lineTo(0.0F, 20.0F);
      ((Path)localObject4).lineTo(0.0F, 0.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(20.0F, 20.0F);
      ((Path)localObject3).lineTo(39.5F, 20.0F);
      ((Path)localObject3).lineTo(39.5F, 39.5F);
      ((Path)localObject3).lineTo(20.0F, 39.5F);
      ((Path)localObject3).lineTo(20.0F, 20.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aih
 * JD-Core Version:    0.6.2
 */