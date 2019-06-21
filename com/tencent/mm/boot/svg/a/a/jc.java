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

public final class jc extends c
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-8683387);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(48.0F, 80.0F);
      ((Path)localObject).cubicTo(40.605331F, 80.0F, 33.802223F, 77.485336F, 28.383556F, 73.273331F);
      ((Path)localObject).lineTo(73.273331F, 28.383556F);
      ((Path)localObject).cubicTo(77.485336F, 33.802223F, 80.0F, 40.605331F, 80.0F, 48.0F);
      ((Path)localObject).cubicTo(80.0F, 65.67289F, 65.67289F, 80.0F, 48.0F, 80.0F);
      ((Path)localObject).moveTo(16.0F, 48.0F);
      ((Path)localObject).cubicTo(16.0F, 30.326666F, 30.326666F, 16.0F, 48.0F, 16.0F);
      ((Path)localObject).cubicTo(55.394669F, 16.0F, 62.197777F, 18.514668F, 67.616447F, 22.726667F);
      ((Path)localObject).lineTo(22.726667F, 67.616447F);
      ((Path)localObject).cubicTo(18.514668F, 62.197777F, 16.0F, 55.394669F, 16.0F, 48.0F);
      ((Path)localObject).moveTo(70.627556F, 25.372889F);
      ((Path)localObject).lineTo(70.627113F, 25.372444F);
      ((Path)localObject).lineTo(70.627556F, 25.372889F);
      ((Path)localObject).moveTo(48.0F, 8.0F);
      ((Path)localObject).cubicTo(25.908443F, 8.0F, 8.0F, 25.908443F, 8.0F, 48.0F);
      ((Path)localObject).cubicTo(8.0F, 70.091553F, 25.908443F, 88.0F, 48.0F, 88.0F);
      ((Path)localObject).cubicTo(70.091553F, 88.0F, 88.0F, 70.091553F, 88.0F, 48.0F);
      ((Path)localObject).cubicTo(88.0F, 25.908443F, 70.091553F, 8.0F, 48.0F, 8.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.jc
 * JD-Core Version:    0.6.2
 */