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

public final class iy extends c
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
      ((Path)localObject).moveTo(90.0F, 38.571999F);
      ((Path)localObject).cubicTo(90.0F, 40.466F, 91.536003F, 42.0F, 93.428001F, 42.0F);
      ((Path)localObject).lineTo(122.0F, 42.0F);
      ((Path)localObject).lineTo(90.0F, 10.0F);
      ((Path)localObject).lineTo(90.0F, 38.571999F);
      ((Path)localObject).lineTo(90.0F, 38.571999F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.0F, 10.0F);
      ((Path)localObject).lineTo(40.0F, 10.0F);
      ((Path)localObject).cubicTo(36.686001F, 10.0F, 34.0F, 12.686F, 34.0F, 16.0F);
      ((Path)localObject).lineTo(34.0F, 116.0F);
      ((Path)localObject).cubicTo(34.0F, 119.314F, 36.686001F, 122.0F, 40.0F, 122.0F);
      ((Path)localObject).lineTo(116.0F, 122.0F);
      ((Path)localObject).cubicTo(119.314F, 122.0F, 122.0F, 119.314F, 122.0F, 116.0F);
      ((Path)localObject).lineTo(122.0F, 48.0F);
      ((Path)localObject).lineTo(90.0F, 48.0F);
      ((Path)localObject).cubicTo(86.685997F, 48.001999F, 84.0F, 45.316002F, 84.0F, 42.0F);
      ((Path)localObject).lineTo(84.0F, 10.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(28.0F, 34.0F);
      ((Path)localObject).cubicTo(24.686001F, 34.0F, 22.0F, 36.686001F, 22.0F, 40.0F);
      ((Path)localObject).lineTo(22.0F, 128.0F);
      ((Path)localObject).cubicTo(22.0F, 131.314F, 24.686001F, 134.0F, 28.0F, 134.0F);
      ((Path)localObject).lineTo(96.0F, 134.0F);
      ((Path)localObject).cubicTo(99.314003F, 134.0F, 102.0F, 131.314F, 102.0F, 128.0F);
      ((Path)localObject).lineTo(34.0F, 128.0F);
      ((Path)localObject).cubicTo(30.686001F, 128.0F, 28.0F, 125.314F, 28.0F, 122.0F);
      ((Path)localObject).lineTo(28.0F, 34.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.iy
 * JD-Core Version:    0.6.2
 */