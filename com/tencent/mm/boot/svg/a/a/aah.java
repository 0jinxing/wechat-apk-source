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

public final class aah extends c
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
      ((Path)localObject).moveTo(49.864876F, 45.515251F);
      ((Path)localObject).lineTo(62.598618F, 58.248997F);
      ((Path)localObject).lineTo(58.355976F, 62.491638F);
      ((Path)localObject).lineTo(45.637589F, 49.773251F);
      ((Path)localObject).cubicTo(42.121399F, 52.426655F, 37.744442F, 54.0F, 33.0F, 54.0F);
      ((Path)localObject).cubicTo(21.402F, 54.0F, 12.0F, 44.598F, 12.0F, 33.0F);
      ((Path)localObject).cubicTo(12.0F, 21.402F, 21.402F, 12.0F, 33.0F, 12.0F);
      ((Path)localObject).cubicTo(44.598F, 12.0F, 54.0F, 21.402F, 54.0F, 33.0F);
      ((Path)localObject).cubicTo(54.0F, 37.689571F, 52.462833F, 42.020115F, 49.864876F, 45.515251F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 33.0F);
      ((Path)localObject).cubicTo(48.0F, 24.715714F, 41.284286F, 18.0F, 33.0F, 18.0F);
      ((Path)localObject).cubicTo(24.715714F, 18.0F, 18.0F, 24.715714F, 18.0F, 33.0F);
      ((Path)localObject).cubicTo(18.0F, 41.284286F, 24.715714F, 48.0F, 33.0F, 48.0F);
      ((Path)localObject).cubicTo(41.284286F, 48.0F, 48.0F, 41.284286F, 48.0F, 33.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aah
 * JD-Core Version:    0.6.2
 */