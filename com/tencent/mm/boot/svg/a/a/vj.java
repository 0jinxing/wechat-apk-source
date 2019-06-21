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

public final class vj extends c
{
  private final int height = 100;
  private final int width = 100;

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
        paramInt = 100;
        continue;
        paramInt = 100;
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
      localPaint.setColor(-1686720);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(51.515152F, 100.0F);
      ((Path)localObject).cubicTo(22.385763F, 100.0F, 0.0F, 77.614235F, 0.0F, 51.515152F);
      ((Path)localObject).cubicTo(0.0F, 22.385763F, 22.385763F, 0.0F, 51.515152F, 0.0F);
      ((Path)localObject).cubicTo(77.614235F, 0.0F, 100.0F, 22.385763F, 100.0F, 51.515152F);
      ((Path)localObject).cubicTo(100.0F, 77.614235F, 77.614235F, 100.0F, 51.515152F, 100.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.567917F, 25.108103F);
      ((Path)localObject).lineTo(47.272728F, 60.909092F);
      ((Path)localObject).lineTo(54.545456F, 60.909092F);
      ((Path)localObject).lineTo(56.250263F, 25.108103F);
      ((Path)localObject).cubicTo(56.309967F, 23.85433F, 55.341984F, 22.789549F, 54.088211F, 22.729845F);
      ((Path)localObject).cubicTo(54.052204F, 22.72813F, 54.016159F, 22.727272F, 53.98011F, 22.727272F);
      ((Path)localObject).lineTo(47.838074F, 22.727272F);
      ((Path)localObject).cubicTo(46.582882F, 22.727272F, 45.565346F, 23.744808F, 45.565346F, 25.0F);
      ((Path)localObject).cubicTo(45.565346F, 25.036049F, 45.566204F, 25.072094F, 45.567917F, 25.108103F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.909092F, 76.818184F);
      ((Path)localObject).cubicTo(53.921555F, 76.818184F, 56.363636F, 74.376099F, 56.363636F, 71.36364F);
      ((Path)localObject).cubicTo(56.363636F, 68.351173F, 53.921555F, 65.909088F, 50.909092F, 65.909088F);
      ((Path)localObject).cubicTo(47.896629F, 65.909088F, 45.454544F, 68.351173F, 45.454544F, 71.36364F);
      ((Path)localObject).cubicTo(45.454544F, 74.376099F, 47.896629F, 76.818184F, 50.909092F, 76.818184F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vj
 * JD-Core Version:    0.6.2
 */