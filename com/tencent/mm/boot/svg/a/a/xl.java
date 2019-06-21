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

public final class xl extends c
{
  private final int height = 14;
  private final int width = 57;

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
        paramInt = 57;
        continue;
        paramInt = 14;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-3684404);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -799.0F, 0.0F, 1.0F, -836.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 203.0F, 0.0F, 1.0F, 793.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 596.4823F, 0.0F, 1.0F, 43.304348F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(6.461538F, 0.0F);
      ((Path)localObject2).cubicTo(10.030148F, 0.0F, 12.923077F, 2.910149F, 12.923077F, 6.5F);
      ((Path)localObject2).cubicTo(12.923077F, 10.089851F, 10.030148F, 13.0F, 6.461538F, 13.0F);
      ((Path)localObject2).cubicTo(2.892929F, 13.0F, 0.0F, 10.089851F, 0.0F, 6.5F);
      ((Path)localObject2).cubicTo(0.0F, 2.910149F, 2.892929F, 0.0F, 6.461538F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(28.0F, 0.0F);
      ((Path)localObject2).cubicTo(31.568609F, 0.0F, 34.46154F, 2.910149F, 34.46154F, 6.5F);
      ((Path)localObject2).cubicTo(34.46154F, 10.089851F, 31.568609F, 13.0F, 28.0F, 13.0F);
      ((Path)localObject2).cubicTo(24.431391F, 13.0F, 21.538462F, 10.089851F, 21.538462F, 6.5F);
      ((Path)localObject2).cubicTo(21.538462F, 2.910149F, 24.431391F, 0.0F, 28.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(49.53846F, 0.0F);
      ((Path)localObject3).cubicTo(53.107071F, 0.0F, 56.0F, 2.910149F, 56.0F, 6.5F);
      ((Path)localObject3).cubicTo(56.0F, 10.089851F, 53.107071F, 13.0F, 49.53846F, 13.0F);
      ((Path)localObject3).cubicTo(45.969849F, 13.0F, 43.07692F, 10.089851F, 43.07692F, 6.5F);
      ((Path)localObject3).cubicTo(43.07692F, 2.910149F, 45.969849F, 0.0F, 49.53846F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xl
 * JD-Core Version:    0.6.2
 */