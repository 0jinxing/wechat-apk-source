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

public final class zs extends c
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
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-16777216);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(33.785156F, 66.403427F);
      ((Path)localObject).cubicTo(33.785156F, 66.403427F, 12.0F, 48.054832F, 12.0F, 30.0F);
      ((Path)localObject).cubicTo(12.0F, 16.745167F, 22.745167F, 6.0F, 36.0F, 6.0F);
      ((Path)localObject).cubicTo(49.254833F, 6.0F, 60.0F, 16.745167F, 60.0F, 30.0F);
      ((Path)localObject).cubicTo(60.0F, 48.054832F, 38.225567F, 66.39341F, 38.225567F, 66.39341F);
      ((Path)localObject).cubicTo(37.000694F, 67.518059F, 35.008381F, 67.506104F, 33.785156F, 66.403427F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 40.5F);
      ((Path)localObject).cubicTo(41.798988F, 40.5F, 46.5F, 35.798988F, 46.5F, 30.0F);
      ((Path)localObject).cubicTo(46.5F, 24.20101F, 41.798988F, 19.5F, 36.0F, 19.5F);
      ((Path)localObject).cubicTo(30.20101F, 19.5F, 25.5F, 24.20101F, 25.5F, 30.0F);
      ((Path)localObject).cubicTo(25.5F, 35.798988F, 30.20101F, 40.5F, 36.0F, 40.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zs
 * JD-Core Version:    0.6.2
 */