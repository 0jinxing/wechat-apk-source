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

public final class ane extends c
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(68.0F, 71.0F);
      ((Path)localObject).lineTo(22.0F, 71.0F);
      ((Path)localObject).lineTo(22.0F, 37.0F);
      ((Path)localObject).lineTo(31.521F, 37.0F);
      ((Path)localObject).cubicTo(32.823002F, 34.063F, 34.368F, 31.768999F, 36.078999F, 30.0F);
      ((Path)localObject).lineTo(18.0F, 30.0F);
      ((Path)localObject).cubicTo(16.343F, 30.0F, 15.0F, 31.343F, 15.0F, 33.0F);
      ((Path)localObject).lineTo(15.0F, 75.0F);
      ((Path)localObject).cubicTo(15.0F, 76.656998F, 16.343F, 78.0F, 18.0F, 78.0F);
      ((Path)localObject).lineTo(72.0F, 78.0F);
      ((Path)localObject).cubicTo(73.655998F, 78.0F, 75.0F, 76.656998F, 75.0F, 75.0F);
      ((Path)localObject).lineTo(75.0F, 53.220001F);
      ((Path)localObject).lineTo(68.0F, 59.130001F);
      ((Path)localObject).lineTo(68.0F, 71.0F);
      ((Path)localObject).lineTo(68.0F, 71.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.0F, 19.0F);
      ((Path)localObject).lineTo(60.0F, 30.018999F);
      ((Path)localObject).cubicTo(58.325001F, 30.007999F, 56.583F, 30.0F, 55.0F, 30.0F);
      ((Path)localObject).cubicTo(41.334F, 30.0F, 32.055F, 43.333F, 32.055F, 61.0F);
      ((Path)localObject).cubicTo(36.721001F, 50.16F, 41.284F, 45.0F, 60.0F, 45.0F);
      ((Path)localObject).lineTo(60.0F, 56.0F);
      ((Path)localObject).lineTo(74.452003F, 43.848F);
      ((Path)localObject).lineTo(75.0F, 44.356998F);
      ((Path)localObject).lineTo(75.0F, 43.386002F);
      ((Path)localObject).lineTo(82.0F, 37.5F);
      ((Path)localObject).lineTo(60.0F, 19.0F);
      ((Path)localObject).lineTo(60.0F, 19.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ane
 * JD-Core Version:    0.6.2
 */