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

public final class jv extends c
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
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-8617851);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(69.0F, 73.0F);
      ((Path)localObject).cubicTo(69.0F, 75.188713F, 67.164108F, 77.0F, 65.0F, 77.0F);
      ((Path)localObject).lineTo(57.0F, 77.0F);
      ((Path)localObject).lineTo(57.0F, 57.0F);
      ((Path)localObject).lineTo(40.0F, 57.0F);
      ((Path)localObject).lineTo(40.0F, 77.0F);
      ((Path)localObject).lineTo(32.0F, 77.0F);
      ((Path)localObject).cubicTo(29.835434F, 77.0F, 28.0F, 75.188713F, 28.0F, 73.0F);
      ((Path)localObject).lineTo(28.0F, 38.0F);
      ((Path)localObject).lineTo(49.0F, 18.0F);
      ((Path)localObject).lineTo(69.0F, 38.0F);
      ((Path)localObject).lineTo(69.0F, 73.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(52.0F, 9.0F);
      ((Path)localObject).lineTo(52.0F, 9.0F);
      ((Path)localObject).cubicTo(50.789879F, 8.532246F, 49.708397F, 8.0F, 49.0F, 8.0F);
      ((Path)localObject).cubicTo(47.291603F, 8.0F, 46.210121F, 8.532246F, 45.0F, 9.0F);
      ((Path)localObject).lineTo(45.0F, 9.0F);
      ((Path)localObject).lineTo(8.0F, 47.0F);
      ((Path)localObject).lineTo(14.0F, 53.0F);
      ((Path)localObject).lineTo(20.0F, 46.0F);
      ((Path)localObject).lineTo(20.0F, 73.0F);
      ((Path)localObject).cubicTo(20.146534F, 79.556862F, 25.5868F, 85.0F, 32.0F, 85.0F);
      ((Path)localObject).lineTo(40.0F, 85.0F);
      ((Path)localObject).lineTo(57.0F, 85.0F);
      ((Path)localObject).lineTo(65.0F, 85.0F);
      ((Path)localObject).cubicTo(71.4132F, 85.0F, 76.853462F, 79.556862F, 77.0F, 73.0F);
      ((Path)localObject).lineTo(77.0F, 46.0F);
      ((Path)localObject).lineTo(83.0F, 53.0F);
      ((Path)localObject).lineTo(89.0F, 47.0F);
      ((Path)localObject).lineTo(52.0F, 9.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.jv
 * JD-Core Version:    0.6.2
 */