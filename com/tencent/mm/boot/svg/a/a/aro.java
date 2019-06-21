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

public final class aro extends c
{
  private final int height = 78;
  private final int width = 78;

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
        paramInt = 78;
        continue;
        paramInt = 78;
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
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -223.0F, 0.0F, 1.0F, -237.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 223.0F, 0.0F, 1.0F, 237.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11184811);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(2.995937F, 0.0F);
      ((Path)localObject2).cubicTo(1.341327F, 0.0F, 0.0F, 1.342408F, 0.0F, 3.002084F);
      ((Path)localObject2).lineTo(0.0F, 68.997917F);
      ((Path)localObject2).cubicTo(0.0F, 70.655922F, 1.33731F, 72.0F, 2.995937F, 72.0F);
      ((Path)localObject2).lineTo(57.004063F, 72.0F);
      ((Path)localObject2).cubicTo(58.658672F, 72.0F, 60.0F, 70.657593F, 60.0F, 68.997917F);
      ((Path)localObject2).lineTo(60.0F, 3.002084F);
      ((Path)localObject2).cubicTo(60.0F, 1.344079F, 58.662689F, 0.0F, 57.004063F, 0.0F);
      ((Path)localObject2).lineTo(2.995937F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11184811);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(8.0F, 27.0F);
      ((Path)localObject2).lineTo(40.0F, 27.0F);
      ((Path)localObject2).lineTo(40.0F, 30.0F);
      ((Path)localObject2).lineTo(8.0F, 30.0F);
      ((Path)localObject2).lineTo(8.0F, 27.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-11184811);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(8.0F, 36.0F);
      ((Path)localObject1).lineTo(25.0F, 36.0F);
      ((Path)localObject1).lineTo(25.0F, 39.0F);
      ((Path)localObject1).lineTo(8.0F, 39.0F);
      ((Path)localObject1).lineTo(8.0F, 36.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-11184811);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(8.0F, 45.0F);
      ((Path)localObject1).lineTo(28.0F, 45.0F);
      ((Path)localObject1).lineTo(28.0F, 48.0F);
      ((Path)localObject1).lineTo(8.0F, 48.0F);
      ((Path)localObject1).lineTo(8.0F, 45.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-11184811);
      localPaint.setStrokeWidth(3.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(14.0F, 8.0F);
      ((Path)localObject3).cubicTo(17.313709F, 8.0F, 20.0F, 10.686291F, 20.0F, 14.0F);
      ((Path)localObject3).cubicTo(20.0F, 17.313709F, 17.313709F, 20.0F, 14.0F, 20.0F);
      ((Path)localObject3).cubicTo(10.686291F, 20.0F, 8.0F, 17.313709F, 8.0F, 14.0F);
      ((Path)localObject3).cubicTo(8.0F, 10.686291F, 10.686291F, 8.0F, 14.0F, 8.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aro
 * JD-Core Version:    0.6.2
 */