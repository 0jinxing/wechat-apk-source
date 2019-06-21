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

public final class il extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
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
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-15683841);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(115.8F, 60.688889F);
      ((Path)localObject).cubicTo(115.8F, 29.181868F, 90.81813F, 4.2F, 59.311111F, 4.2F);
      ((Path)localObject).cubicTo(29.181868F, 4.2F, 4.2F, 29.181868F, 4.2F, 60.688889F);
      ((Path)localObject).cubicTo(4.2F, 90.81813F, 29.181868F, 115.8F, 59.311111F, 115.8F);
      ((Path)localObject).cubicTo(90.81813F, 115.8F, 115.8F, 90.81813F, 115.8F, 60.688889F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(62.123741F, 65.15995F);
      ((Path)localObject).lineTo(60.59251F, 27.389608F);
      ((Path)localObject).cubicTo(60.57021F, 26.839443F, 60.108807F, 26.4F, 59.561615F, 26.4F);
      ((Path)localObject).lineTo(55.543171F, 26.4F);
      ((Path)localObject).cubicTo(55.003368F, 26.4F, 54.534431F, 26.843063F, 54.512272F, 27.389608F);
      ((Path)localObject).lineTo(52.833233F, 68.805969F);
      ((Path)localObject).cubicTo(52.807594F, 69.438377F, 53.077152F, 69.998924F, 53.518978F, 70.363365F);
      ((Path)localObject).cubicTo(53.700817F, 70.78672F, 54.031994F, 71.146774F, 54.481876F, 71.361397F);
      ((Path)localObject).lineTo(81.584015F, 84.290726F);
      ((Path)localObject).cubicTo(82.093552F, 84.533798F, 82.715027F, 84.338448F, 82.98967F, 83.862755F);
      ((Path)localObject).lineTo(84.395103F, 81.428467F);
      ((Path)localObject).cubicTo(84.670898F, 80.950768F, 84.51857F, 80.314194F, 84.057442F, 80.002151F);
      ((Path)localObject).lineTo(62.123741F, 65.15995F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.il
 * JD-Core Version:    0.6.2
 */