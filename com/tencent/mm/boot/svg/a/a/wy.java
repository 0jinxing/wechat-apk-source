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

public final class wy extends c
{
  private final int height = 33;
  private final int width = 38;

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
        paramInt = 38;
        continue;
        paramInt = 33;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -480.0F, 0.0F, 1.0F, -190.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(504.54526F, 207.37386F);
      ((Path)localObject1).lineTo(481.53622F, 221.99107F);
      ((Path)localObject1).lineTo(481.53622F, 221.99107F);
      ((Path)localObject1).cubicTo(481.07007F, 222.28723F, 480.45209F, 222.1494F, 480.15591F, 221.68323F);
      ((Path)localObject1).cubicTo(480.05408F, 221.52292F, 480.0F, 221.33693F, 480.0F, 221.147F);
      ((Path)localObject1).lineTo(480.0F, 191.00273F);
      ((Path)localObject1).lineTo(480.0F, 191.00273F);
      ((Path)localObject1).cubicTo(480.0F, 190.45044F, 480.44772F, 190.00273F, 481.0F, 190.00273F);
      ((Path)localObject1).cubicTo(481.19934F, 190.00273F, 481.39413F, 190.0623F, 481.55939F, 190.17381F);
      ((Path)localObject1).lineTo(504.56839F, 205.70087F);
      ((Path)localObject1).cubicTo(505.02618F, 206.00981F, 505.14688F, 206.63136F, 504.83795F, 207.08916F);
      ((Path)localObject1).cubicTo(504.76099F, 207.20319F, 504.66135F, 207.30009F, 504.54526F, 207.37386F);
      ((Path)localObject1).lineTo(504.54526F, 207.37386F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(511.0F, 190.00006F);
      ((Path)localObject1).lineTo(517.0F, 190.00006F);
      ((Path)localObject1).lineTo(517.0F, 190.00006F);
      ((Path)localObject1).cubicTo(517.55231F, 190.00006F, 518.0F, 190.44777F, 518.0F, 191.00006F);
      ((Path)localObject1).lineTo(518.0F, 221.0F);
      ((Path)localObject1).lineTo(518.0F, 221.0F);
      ((Path)localObject1).cubicTo(518.0F, 221.55229F, 517.55231F, 222.0F, 517.0F, 222.0F);
      ((Path)localObject1).lineTo(511.0F, 222.0F);
      ((Path)localObject1).lineTo(511.0F, 222.0F);
      ((Path)localObject1).cubicTo(510.44772F, 222.0F, 510.0F, 221.55229F, 510.0F, 221.0F);
      ((Path)localObject1).lineTo(510.0F, 191.00006F);
      ((Path)localObject1).lineTo(510.0F, 191.00006F);
      ((Path)localObject1).cubicTo(510.0F, 190.44777F, 510.44772F, 190.00006F, 511.0F, 190.00006F);
      ((Path)localObject1).lineTo(511.0F, 190.00006F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wy
 * JD-Core Version:    0.6.2
 */