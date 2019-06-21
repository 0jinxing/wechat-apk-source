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

public final class xk extends c
{
  private final int height = 43;
  private final int width = 43;

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
        paramInt = 43;
        continue;
        paramInt = 43;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, -57.0F, 0.0F, 1.0F, -1296.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-6710887);
      ((Paint)localObject2).setStrokeWidth(4.6F);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 60.0F, 0.0F, 1.0F, 1299.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(15.0F, 0.0F);
      ((Path)localObject3).cubicTo(23.284271F, 0.0F, 30.0F, 6.715729F, 30.0F, 15.0F);
      ((Path)localObject3).cubicTo(30.0F, 23.284271F, 23.284271F, 30.0F, 15.0F, 30.0F);
      ((Path)localObject3).cubicTo(6.715729F, 30.0F, 0.0F, 23.284271F, 0.0F, 15.0F);
      ((Path)localObject3).cubicTo(0.0F, 6.715729F, 6.715729F, 0.0F, 15.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.SQUARE);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(26.5F, 26.5F);
      ((Path)localObject2).lineTo(36.0F, 36.0F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xk
 * JD-Core Version:    0.6.2
 */