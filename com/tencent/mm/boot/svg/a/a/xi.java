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

public final class xi extends c
{
  private final int height = 50;
  private final int width = 50;

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
        paramInt = 50;
        continue;
        paramInt = 50;
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
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -289.0F, 0.0F, 1.0F, -369.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 302.0F, 0.0F, 1.0F, 370.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 1.5F);
      ((Path)localObject1).cubicTo(0.0F, 0.671573F, 0.671573F, 0.0F, 1.5F, 0.0F);
      ((Path)localObject1).lineTo(2.5F, 0.0F);
      ((Path)localObject1).cubicTo(3.328427F, 0.0F, 4.0F, 0.671573F, 4.0F, 1.5F);
      ((Path)localObject1).lineTo(4.0F, 46.5F);
      ((Path)localObject1).cubicTo(4.0F, 47.328426F, 3.328427F, 48.0F, 2.5F, 48.0F);
      ((Path)localObject1).lineTo(1.5F, 48.0F);
      ((Path)localObject1).cubicTo(0.671573F, 48.0F, 0.0F, 47.328426F, 0.0F, 46.5F);
      ((Path)localObject1).lineTo(0.0F, 1.5F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(20.0F, 1.5F);
      ((Path)localObject1).cubicTo(20.0F, 0.671573F, 20.671574F, 0.0F, 21.5F, 0.0F);
      ((Path)localObject1).lineTo(22.5F, 0.0F);
      ((Path)localObject1).cubicTo(23.328426F, 0.0F, 24.0F, 0.671573F, 24.0F, 1.5F);
      ((Path)localObject1).lineTo(24.0F, 46.5F);
      ((Path)localObject1).cubicTo(24.0F, 47.328426F, 23.328426F, 48.0F, 22.5F, 48.0F);
      ((Path)localObject1).lineTo(21.5F, 48.0F);
      ((Path)localObject1).cubicTo(20.671574F, 48.0F, 20.0F, 47.328426F, 20.0F, 46.5F);
      ((Path)localObject1).lineTo(20.0F, 1.5F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xi
 * JD-Core Version:    0.6.2
 */