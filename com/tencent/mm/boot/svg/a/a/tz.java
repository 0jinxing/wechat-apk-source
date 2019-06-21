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

public final class tz extends c
{
  private final int height = 30;
  private final int width = 30;

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
        paramInt = 30;
        continue;
        paramInt = 30;
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
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-5066062);
      localPaint.setStrokeWidth(2.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(1.759891F, 9.578414F);
      ((Path)localObject4).cubicTo(0.6770722F, 8.568604F, 0.0F, 7.129328F, 0.0F, 5.531915F);
      ((Path)localObject4).cubicTo(0.0F, 2.476723F, 2.476723F, 0.0F, 5.531915F, 0.0F);
      ((Path)localObject4).cubicTo(7.280762F, 0.0F, 8.840067F, 0.811529F, 9.853792F, 2.078551F);
      ((Path)localObject4).cubicTo(6.086365F, 3.10554F, 3.061316F, 5.932576F, 1.759891F, 9.578414F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(16.145893F, 2.078945F);
      ((Path)localObject4).cubicTo(17.159611F, 0.811697F, 18.719057F, 0.0F, 20.468084F, 0.0F);
      ((Path)localObject4).cubicTo(23.523277F, 0.0F, 26.0F, 2.476723F, 26.0F, 5.531915F);
      ((Path)localObject4).cubicTo(26.0F, 7.129978F, 25.322378F, 8.569773F, 24.238789F, 9.579644F);
      ((Path)localObject4).cubicTo(22.937773F, 5.933679F, 19.913073F, 3.106378F, 16.145893F, 2.078945F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(13.0F, 1.659575F);
      ((Path)localObject3).cubicTo(19.263145F, 1.659575F, 24.340425F, 6.736856F, 24.340425F, 13.0F);
      ((Path)localObject3).cubicTo(24.340425F, 19.263145F, 19.263145F, 24.340425F, 13.0F, 24.340425F);
      ((Path)localObject3).cubicTo(6.736856F, 24.340425F, 1.659575F, 19.263145F, 1.659575F, 13.0F);
      ((Path)localObject3).cubicTo(1.659575F, 6.736856F, 6.736856F, 1.659575F, 13.0F, 1.659575F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.SQUARE);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(20.265247F, 22.957447F);
      ((Path)localObject3).lineTo(23.031206F, 25.723404F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.SQUARE);
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 8.777304F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.28227F, 22.404255F);
      ((Path)localObject1).lineTo(5.495036F, 25.723404F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.SQUARE);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.0F, 5.318182F);
      ((Path)localObject1).lineTo(13.0F, 13.0F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeCap(Paint.Cap.SQUARE);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.0F, 13.0F);
      ((Path)localObject1).lineTo(17.978724F, 15.954546F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tz
 * JD-Core Version:    0.6.2
 */