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

public final class ake extends c
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
      localPaint2.setColor(419430400);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 1.5F);
      ((Path)localObject).cubicTo(55.053825F, 1.5F, 70.5F, 16.946175F, 70.5F, 36.0F);
      ((Path)localObject).cubicTo(70.5F, 55.053825F, 55.053825F, 70.5F, 36.0F, 70.5F);
      ((Path)localObject).cubicTo(16.946175F, 70.5F, 1.5F, 55.053825F, 1.5F, 36.0F);
      ((Path)localObject).cubicTo(1.5F, 16.946175F, 16.946175F, 1.5F, 36.0F, 1.5F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 72.0F);
      ((Path)localObject).cubicTo(55.882252F, 72.0F, 72.0F, 55.882252F, 72.0F, 36.0F);
      ((Path)localObject).cubicTo(72.0F, 16.117748F, 55.882252F, 0.0F, 36.0F, 0.0F);
      ((Path)localObject).cubicTo(16.117748F, 0.0F, 0.0F, 16.117748F, 0.0F, 36.0F);
      ((Path)localObject).cubicTo(0.0F, 55.882252F, 16.117748F, 72.0F, 36.0F, 72.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 67.5F);
      ((Path)localObject).cubicTo(53.396969F, 67.5F, 67.5F, 53.396969F, 67.5F, 36.0F);
      ((Path)localObject).cubicTo(67.5F, 18.603031F, 53.396969F, 4.5F, 36.0F, 4.5F);
      ((Path)localObject).cubicTo(18.603031F, 4.5F, 4.5F, 18.603031F, 4.5F, 36.0F);
      ((Path)localObject).cubicTo(4.5F, 53.396969F, 18.603031F, 67.5F, 36.0F, 67.5F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 48.223015F);
      ((Path)localObject).cubicTo(27.0F, 49.878769F, 28.177517F, 50.57029F, 29.625708F, 49.769974F);
      ((Path)localObject).lineTo(51.37429F, 37.751019F);
      ((Path)localObject).cubicTo(52.824429F, 36.949627F, 52.822483F, 35.649239F, 51.37429F, 34.848923F);
      ((Path)localObject).lineTo(29.625708F, 22.829967F);
      ((Path)localObject).cubicTo(28.17557F, 22.028574F, 27.0F, 22.719145F, 27.0F, 24.376926F);
      ((Path)localObject).lineTo(27.0F, 48.223015F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ake
 * JD-Core Version:    0.6.2
 */