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

public final class u extends c
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(18.0F, 37.5F);
      ((Path)localObject).cubicTo(18.0F, 39.984901F, 15.9849F, 42.0F, 13.5F, 42.0F);
      ((Path)localObject).cubicTo(11.0151F, 42.0F, 9.0F, 39.984901F, 9.0F, 37.5F);
      ((Path)localObject).cubicTo(9.0F, 35.014198F, 11.0151F, 33.0F, 13.5F, 33.0F);
      ((Path)localObject).cubicTo(15.9849F, 33.0F, 18.0F, 35.014198F, 18.0F, 37.5F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(34.5F, 33.0F);
      ((Path)localObject).cubicTo(36.984901F, 33.0F, 39.0F, 35.014198F, 39.0F, 37.5F);
      ((Path)localObject).cubicTo(39.0F, 39.984901F, 36.984901F, 42.0F, 34.5F, 42.0F);
      ((Path)localObject).cubicTo(32.015099F, 42.0F, 30.0F, 39.984901F, 30.0F, 37.5F);
      ((Path)localObject).cubicTo(30.0F, 35.014198F, 32.015099F, 33.0F, 34.5F, 33.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(55.5F, 33.0F);
      ((Path)localObject).cubicTo(57.984901F, 33.0F, 60.0F, 35.014198F, 60.0F, 37.5F);
      ((Path)localObject).cubicTo(60.0F, 39.984901F, 57.984901F, 42.0F, 55.5F, 42.0F);
      ((Path)localObject).cubicTo(53.015099F, 42.0F, 51.0F, 39.984901F, 51.0F, 37.5F);
      ((Path)localObject).cubicTo(51.0F, 35.014198F, 53.015099F, 33.0F, 55.5F, 33.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.u
 * JD-Core Version:    0.6.2
 */