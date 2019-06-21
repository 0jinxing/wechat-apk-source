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

public final class ad extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-16777216);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(31.508831F, 53.400002F);
      ((Path)localObject).lineTo(61.5F, 53.400002F);
      ((Path)localObject).cubicTo(61.997055F, 53.400002F, 62.400002F, 52.997055F, 62.400002F, 52.5F);
      ((Path)localObject).lineTo(62.400002F, 16.5F);
      ((Path)localObject).cubicTo(62.400002F, 16.002943F, 61.997055F, 15.6F, 61.5F, 15.6F);
      ((Path)localObject).lineTo(10.5F, 15.6F);
      ((Path)localObject).cubicTo(10.002944F, 15.6F, 9.6F, 16.002943F, 9.6F, 16.5F);
      ((Path)localObject).lineTo(9.6F, 52.5F);
      ((Path)localObject).cubicTo(9.6F, 52.997055F, 10.002944F, 53.400002F, 10.5F, 53.400002F);
      ((Path)localObject).lineTo(24.6F, 53.400002F);
      ((Path)localObject).lineTo(24.6F, 60.30883F);
      ((Path)localObject).lineTo(31.508831F, 53.400002F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(26.121321F, 63.878681F);
      ((Path)localObject).cubicTo(24.949747F, 65.050255F, 23.050253F, 65.050255F, 21.878679F, 63.878681F);
      ((Path)localObject).cubicTo(21.316071F, 63.316071F, 21.0F, 62.553009F, 21.0F, 61.757359F);
      ((Path)localObject).lineTo(21.0F, 57.0F);
      ((Path)localObject).lineTo(10.5F, 57.0F);
      ((Path)localObject).cubicTo(8.014719F, 57.0F, 6.0F, 54.985283F, 6.0F, 52.5F);
      ((Path)localObject).lineTo(6.0F, 16.5F);
      ((Path)localObject).cubicTo(6.0F, 14.014719F, 8.014719F, 12.0F, 10.5F, 12.0F);
      ((Path)localObject).lineTo(61.5F, 12.0F);
      ((Path)localObject).cubicTo(63.985283F, 12.0F, 66.0F, 14.014719F, 66.0F, 16.5F);
      ((Path)localObject).lineTo(66.0F, 52.5F);
      ((Path)localObject).cubicTo(66.0F, 54.985283F, 63.985283F, 57.0F, 61.5F, 57.0F);
      ((Path)localObject).lineTo(33.0F, 57.0F);
      ((Path)localObject).lineTo(26.121321F, 63.878681F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ad
 * JD-Core Version:    0.6.2
 */