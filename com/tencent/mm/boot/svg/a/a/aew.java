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

public final class aew extends c
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
      ((Paint)localObject).setColor(-8421505);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 61.0F);
      ((Path)localObject).cubicTo(22.192881F, 61.0F, 11.0F, 49.807117F, 11.0F, 36.0F);
      ((Path)localObject).cubicTo(11.0F, 22.192881F, 22.192881F, 11.0F, 36.0F, 11.0F);
      ((Path)localObject).cubicTo(49.807117F, 11.0F, 61.0F, 22.192881F, 61.0F, 36.0F);
      ((Path)localObject).cubicTo(61.0F, 49.807117F, 49.807117F, 61.0F, 36.0F, 61.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 58.0F);
      ((Path)localObject).cubicTo(48.150265F, 58.0F, 58.0F, 48.150265F, 58.0F, 36.0F);
      ((Path)localObject).cubicTo(58.0F, 23.849735F, 48.150265F, 14.0F, 36.0F, 14.0F);
      ((Path)localObject).cubicTo(23.849735F, 14.0F, 14.0F, 23.849735F, 14.0F, 36.0F);
      ((Path)localObject).cubicTo(14.0F, 48.150265F, 23.849735F, 58.0F, 36.0F, 58.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(34.5F, 31.0F);
      ((Path)localObject).lineTo(37.5F, 31.0F);
      ((Path)localObject).lineTo(37.5F, 48.5F);
      ((Path)localObject).lineTo(34.5F, 48.5F);
      ((Path)localObject).lineTo(34.5F, 31.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 28.5F);
      ((Path)localObject).cubicTo(34.619289F, 28.5F, 33.5F, 27.380713F, 33.5F, 26.0F);
      ((Path)localObject).cubicTo(33.5F, 24.619287F, 34.619289F, 23.5F, 36.0F, 23.5F);
      ((Path)localObject).cubicTo(37.380711F, 23.5F, 38.5F, 24.619287F, 38.5F, 26.0F);
      ((Path)localObject).cubicTo(38.5F, 27.380713F, 37.380711F, 28.5F, 36.0F, 28.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aew
 * JD-Core Version:    0.6.2
 */