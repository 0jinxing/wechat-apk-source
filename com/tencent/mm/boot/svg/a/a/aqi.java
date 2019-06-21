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

public final class aqi extends c
{
  private final int height = 36;
  private final int width = 46;

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
        paramInt = 46;
        continue;
        paramInt = 36;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-9205837);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(9.0F, 12.0F);
      ((Path)localObject).lineTo(36.0F, 12.0F);
      ((Path)localObject).lineTo(36.0F, 17.0F);
      ((Path)localObject).lineTo(9.0F, 17.0F);
      ((Path)localObject).lineTo(9.0F, 12.0F);
      ((Path)localObject).lineTo(9.0F, 12.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 3.00742F);
      ((Path)localObject).cubicTo(0.0F, 1.346468F, 1.351781F, 0.0F, 3.000444F, 0.0F);
      ((Path)localObject).lineTo(42.999557F, 0.0F);
      ((Path)localObject).cubicTo(44.656654F, 0.0F, 46.0F, 1.345539F, 46.0F, 3.00742F);
      ((Path)localObject).lineTo(46.0F, 32.99258F);
      ((Path)localObject).cubicTo(46.0F, 34.653534F, 44.64822F, 36.0F, 42.999557F, 36.0F);
      ((Path)localObject).lineTo(3.000444F, 36.0F);
      ((Path)localObject).cubicTo(1.343345F, 36.0F, 0.0F, 34.654461F, 0.0F, 32.99258F);
      ((Path)localObject).lineTo(0.0F, 3.00742F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.066667F, 3.0F);
      ((Path)localObject).lineTo(43.0F, 3.0F);
      ((Path)localObject).lineTo(43.0F, 33.0F);
      ((Path)localObject).lineTo(3.066667F, 33.0F);
      ((Path)localObject).lineTo(3.066667F, 3.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(9.2F, 12.0F);
      ((Path)localObject).lineTo(37.0F, 12.0F);
      ((Path)localObject).lineTo(37.0F, 17.0F);
      ((Path)localObject).lineTo(9.2F, 17.0F);
      ((Path)localObject).lineTo(9.2F, 12.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aqi
 * JD-Core Version:    0.6.2
 */