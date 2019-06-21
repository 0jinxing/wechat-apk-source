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

public final class jk extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(77.0F, 40.0F);
      ((Path)localObject).lineTo(77.0F, 48.0F);
      ((Path)localObject).cubicTo(79.005363F, 48.166668F, 80.833336F, 49.995094F, 81.0F, 52.0F);
      ((Path)localObject).lineTo(81.0F, 77.0F);
      ((Path)localObject).cubicTo(80.833336F, 79.005363F, 79.005363F, 80.833336F, 77.0F, 81.0F);
      ((Path)localObject).lineTo(52.0F, 81.0F);
      ((Path)localObject).cubicTo(49.99464F, 80.833336F, 48.166668F, 79.005363F, 48.0F, 77.0F);
      ((Path)localObject).lineTo(40.0F, 77.0F);
      ((Path)localObject).cubicTo(40.0F, 83.515633F, 45.484371F, 89.0F, 52.0F, 89.0F);
      ((Path)localObject).lineTo(77.0F, 89.0F);
      ((Path)localObject).cubicTo(83.515633F, 89.0F, 89.0F, 83.515633F, 89.0F, 77.0F);
      ((Path)localObject).lineTo(89.0F, 52.0F);
      ((Path)localObject).cubicTo(89.0F, 45.484371F, 83.515633F, 40.0F, 77.0F, 40.0F);
      ((Path)localObject).moveTo(16.0F, 57.0F);
      ((Path)localObject).lineTo(16.0F, 20.0F);
      ((Path)localObject).cubicTo(16.0F, 17.831364F, 17.831364F, 16.0F, 20.0F, 16.0F);
      ((Path)localObject).lineTo(57.0F, 16.0F);
      ((Path)localObject).cubicTo(59.168636F, 16.0F, 61.0F, 17.831364F, 61.0F, 20.0F);
      ((Path)localObject).lineTo(61.0F, 57.0F);
      ((Path)localObject).cubicTo(61.0F, 59.168636F, 59.168636F, 61.0F, 57.0F, 61.0F);
      ((Path)localObject).lineTo(20.0F, 61.0F);
      ((Path)localObject).cubicTo(17.831364F, 61.0F, 16.0F, 59.168636F, 16.0F, 57.0F);
      ((Path)localObject).moveTo(69.0F, 57.0F);
      ((Path)localObject).lineTo(69.0F, 20.0F);
      ((Path)localObject).cubicTo(69.0F, 13.462437F, 63.538013F, 8.0F, 57.0F, 8.0F);
      ((Path)localObject).lineTo(20.0F, 8.0F);
      ((Path)localObject).cubicTo(13.461986F, 8.0F, 8.0F, 13.462437F, 8.0F, 20.0F);
      ((Path)localObject).lineTo(8.0F, 57.0F);
      ((Path)localObject).cubicTo(8.0F, 63.538013F, 13.461986F, 69.0F, 20.0F, 69.0F);
      ((Path)localObject).lineTo(57.0F, 69.0F);
      ((Path)localObject).cubicTo(63.538013F, 69.0F, 69.0F, 63.538013F, 69.0F, 57.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.jk
 * JD-Core Version:    0.6.2
 */