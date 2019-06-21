package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class kt extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-9276814);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(32.316944F, 114.45962F);
      ((Path)localObject).cubicTo(17.49707F, 103.41242F, 8.0F, 86.389702F, 8.0F, 67.29348F);
      ((Path)localObject).cubicTo(8.0F, 33.994308F, 36.877632F, 7.0F, 72.5F, 7.0F);
      ((Path)localObject).cubicTo(108.12237F, 7.0F, 137.0F, 33.994308F, 137.0F, 67.29348F);
      ((Path)localObject).cubicTo(137.0F, 100.59264F, 108.12237F, 127.58696F, 72.5F, 127.58696F);
      ((Path)localObject).cubicTo(66.067978F, 127.58696F, 59.85585F, 126.70688F, 53.993908F, 125.06851F);
      ((Path)localObject).lineTo(32.316944F, 136.89055F);
      ((Path)localObject).lineTo(32.316944F, 114.45962F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(30.467037F, 88.387131F);
      ((Path)localObject).lineTo(66.017456F, 50.875744F);
      ((Path)localObject).lineTo(82.726631F, 68.654297F);
      ((Path)localObject).lineTo(114.75198F, 50.19022F);
      ((Path)localObject).lineTo(79.510872F, 88.326088F);
      ((Path)localObject).lineTo(63.189262F, 70.644653F);
      ((Path)localObject).lineTo(30.467037F, 88.387131F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.kt
 * JD-Core Version:    0.6.2
 */