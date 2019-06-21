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

public final class wn extends c
{
  private final int height = 33;
  private final int width = 38;

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
        paramInt = 38;
        continue;
        paramInt = 33;
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
      ((Paint)localObject).setColor(-4547478);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(14.666667F, 23.0F);
      ((Path)localObject).lineTo(33.0F, 23.0F);
      ((Path)localObject).lineTo(33.0F, 5.0F);
      ((Path)localObject).lineTo(5.0F, 5.0F);
      ((Path)localObject).lineTo(5.0F, 23.0F);
      ((Path)localObject).lineTo(11.0F, 23.0F);
      ((Path)localObject).lineTo(11.0F, 26.0F);
      ((Path)localObject).lineTo(14.666667F, 23.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(15.222222F, 27.0F);
      ((Path)localObject).lineTo(35.000294F, 27.0F);
      ((Path)localObject).cubicTo(36.110107F, 27.0F, 37.0F, 26.105911F, 37.0F, 25.002995F);
      ((Path)localObject).lineTo(37.0F, 2.997005F);
      ((Path)localObject).cubicTo(37.0F, 1.894979F, 36.104702F, 1.0F, 35.000294F, 1.0F);
      ((Path)localObject).lineTo(2.999707F, 1.0F);
      ((Path)localObject).cubicTo(1.889893F, 1.0F, 1.0F, 1.89409F, 1.0F, 2.997005F);
      ((Path)localObject).lineTo(1.0F, 25.002995F);
      ((Path)localObject).cubicTo(1.0F, 26.105021F, 1.895299F, 27.0F, 2.999707F, 27.0F);
      ((Path)localObject).lineTo(8.0F, 27.0F);
      ((Path)localObject).lineTo(8.0F, 32.0F);
      ((Path)localObject).lineTo(15.222222F, 27.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wn
 * JD-Core Version:    0.6.2
 */