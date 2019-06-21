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

public final class all extends c
{
  private final int height = 206;
  private final int width = 888;

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
        paramInt = 888;
        continue;
        paramInt = 206;
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint1.setColor(-855638017);
      localPaint2.setColor(419430400);
      localPaint2.setStrokeWidth(2.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(487.3696F, 158.0F);
      ((Path)localObject2).lineTo(865.59595F, 158.0F);
      ((Path)localObject2).cubicTo(873.54633F, 158.0F, 880.0F, 151.55057F, 880.0F, 143.5948F);
      ((Path)localObject2).lineTo(880.0F, 14.405201F);
      ((Path)localObject2).cubicTo(880.0F, 6.438828F, 873.55109F, 0.0F, 865.59595F, 0.0F);
      ((Path)localObject2).lineTo(14.404071F, 0.0F);
      ((Path)localObject2).cubicTo(6.453681F, 0.0F, 0.0F, 6.449428F, 0.0F, 14.405201F);
      ((Path)localObject2).lineTo(0.0F, 143.5948F);
      ((Path)localObject2).cubicTo(0.0F, 151.56117F, 6.448922F, 158.0F, 14.404071F, 158.0F);
      ((Path)localObject2).lineTo(391.99994F, 158.0F);
      ((Path)localObject2).cubicTo(401.82391F, 158.0F, 416.78622F, 166.02438F, 429.78192F, 186.76418F);
      ((Path)localObject2).cubicTo(442.77762F, 207.50397F, 454.39465F, 186.99791F, 454.39465F, 186.99791F);
      ((Path)localObject2).cubicTo(454.39465F, 186.99791F, 474.19223F, 158.00002F, 487.3696F, 158.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.all
 * JD-Core Version:    0.6.2
 */