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

public final class zf extends c
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
      ((Path)localObject).moveTo(44.197224F, 12.0F);
      ((Path)localObject).cubicTo(44.698753F, 12.0F, 45.167103F, 12.250651F, 45.445301F, 12.66795F);
      ((Path)localObject).lineTo(51.0F, 21.0F);
      ((Path)localObject).lineTo(63.0F, 21.0F);
      ((Path)localObject).cubicTo(64.656853F, 21.0F, 66.0F, 22.343145F, 66.0F, 24.0F);
      ((Path)localObject).lineTo(66.0F, 57.0F);
      ((Path)localObject).cubicTo(66.0F, 58.656853F, 64.656853F, 60.0F, 63.0F, 60.0F);
      ((Path)localObject).lineTo(9.0F, 60.0F);
      ((Path)localObject).cubicTo(7.343146F, 60.0F, 6.0F, 58.656853F, 6.0F, 57.0F);
      ((Path)localObject).lineTo(6.0F, 24.0F);
      ((Path)localObject).cubicTo(6.0F, 22.343145F, 7.343146F, 21.0F, 9.0F, 21.0F);
      ((Path)localObject).lineTo(21.0F, 21.0F);
      ((Path)localObject).lineTo(26.554701F, 12.66795F);
      ((Path)localObject).cubicTo(26.832899F, 12.250651F, 27.301247F, 12.0F, 27.802776F, 12.0F);
      ((Path)localObject).lineTo(44.197224F, 12.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 49.5F);
      ((Path)localObject).cubicTo(41.798988F, 49.5F, 46.5F, 44.798988F, 46.5F, 39.0F);
      ((Path)localObject).cubicTo(46.5F, 33.201012F, 41.798988F, 28.5F, 36.0F, 28.5F);
      ((Path)localObject).cubicTo(30.20101F, 28.5F, 25.5F, 33.201012F, 25.5F, 39.0F);
      ((Path)localObject).cubicTo(25.5F, 44.798988F, 30.20101F, 49.5F, 36.0F, 49.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zf
 * JD-Core Version:    0.6.2
 */