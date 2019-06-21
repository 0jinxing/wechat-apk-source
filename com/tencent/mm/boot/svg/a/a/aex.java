package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class aex extends c
{
  private final int height = 64;
  private final int width = 64;

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
        paramInt = 64;
        continue;
        paramInt = 64;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 5.333333F, 0.0F, 1.0F, 5.333333F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-871936);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(32.360928F, 33.960926F);
      ((Path)localObject).lineTo(25.066666F, 26.666666F);
      ((Path)localObject).lineTo(25.066666F, 10.666667F);
      ((Path)localObject).lineTo(28.266666F, 10.666667F);
      ((Path)localObject).lineTo(28.266666F, 25.341183F);
      ((Path)localObject).lineTo(34.67662F, 31.751137F);
      ((Path)localObject).cubicTo(34.125797F, 32.04063F, 33.630104F, 32.437782F, 33.222229F, 32.927273F);
      ((Path)localObject).lineTo(32.360928F, 33.960926F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(52.44347F, 33.523678F);
      ((Path)localObject).lineTo(51.836155F, 32.832275F);
      ((Path)localObject).cubicTo(51.246536F, 32.161018F, 50.48835F, 31.675097F, 49.652542F, 31.415672F);
      ((Path)localObject).cubicTo(49.967758F, 29.881962F, 50.133335F, 28.29365F, 50.133335F, 26.666666F);
      ((Path)localObject).cubicTo(50.133335F, 13.706385F, 39.626949F, 3.2F, 26.666666F, 3.2F);
      ((Path)localObject).cubicTo(13.706385F, 3.2F, 3.2F, 13.706385F, 3.2F, 26.666666F);
      ((Path)localObject).cubicTo(3.2F, 39.626949F, 13.706385F, 50.133335F, 26.666666F, 50.133335F);
      ((Path)localObject).cubicTo(29.255632F, 50.133335F, 31.746675F, 49.714081F, 34.075607F, 48.939762F);
      ((Path)localObject).lineTo(36.17955F, 51.586544F);
      ((Path)localObject).cubicTo(33.224854F, 52.71513F, 30.017956F, 53.333332F, 26.666666F, 53.333332F);
      ((Path)localObject).cubicTo(11.939074F, 53.333332F, 0.0F, 41.39426F, 0.0F, 26.666666F);
      ((Path)localObject).cubicTo(0.0F, 11.939074F, 11.939074F, 0.0F, 26.666666F, 0.0F);
      ((Path)localObject).cubicTo(41.39426F, 0.0F, 53.333332F, 11.939074F, 53.333332F, 26.666666F);
      ((Path)localObject).cubicTo(53.333332F, 29.037308F, 53.023991F, 31.335699F, 52.44347F, 33.523678F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(35.680626F, 34.975758F);
      ((Path)localObject).cubicTo(35.984615F, 34.610939F, 36.434952F, 34.400002F, 36.909824F, 34.400002F);
      ((Path)localObject).lineTo(48.229839F, 34.400002F);
      ((Path)localObject).cubicTo(48.690151F, 34.400002F, 49.128166F, 34.598251F, 49.431946F, 34.944092F);
      ((Path)localObject).lineTo(53.202106F, 39.236256F);
      ((Path)localObject).cubicTo(53.714092F, 39.819126F, 53.734158F, 40.68531F, 53.249714F, 41.291267F);
      ((Path)localObject).lineTo(43.889675F, 52.999107F);
      ((Path)localObject).cubicTo(43.248005F, 53.801727F, 42.026894F, 53.800026F, 41.387466F, 52.995617F);
      ((Path)localObject).lineTo(32.080837F, 41.287781F);
      ((Path)localObject).cubicTo(31.608892F, 40.694069F, 31.618622F, 39.850586F, 32.104134F, 39.267921F);
      ((Path)localObject).lineTo(35.680626F, 34.975758F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(35.396164F, 40.315956F);
      ((Path)localObject).lineTo(42.643543F, 49.433231F);
      ((Path)localObject).lineTo(49.912876F, 40.340515F);
      ((Path)localObject).lineTo(47.505653F, 37.599998F);
      ((Path)localObject).lineTo(37.659264F, 37.599998F);
      ((Path)localObject).lineTo(35.396164F, 40.315956F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aex
 * JD-Core Version:    0.6.2
 */