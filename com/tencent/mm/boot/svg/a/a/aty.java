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

public final class aty extends c
{
  private final int height = 96;
  private final int width = 584;

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
        paramInt = 584;
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
      localPaint.setColor(419430400);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 9.00051F);
      ((Path)localObject).cubicTo(0.0F, 4.029666F, 4.021278F, 0.0F, 8.997707F, 0.0F);
      ((Path)localObject).lineTo(575.00232F, 0.0F);
      ((Path)localObject).cubicTo(579.97162F, 0.0F, 584.0F, 4.03261F, 584.0F, 9.00051F);
      ((Path)localObject).lineTo(584.0F, 76.999489F);
      ((Path)localObject).cubicTo(584.0F, 81.970337F, 579.9787F, 86.0F, 575.00232F, 86.0F);
      ((Path)localObject).lineTo(8.997707F, 86.0F);
      ((Path)localObject).cubicTo(4.028411F, 86.0F, 0.0F, 81.967392F, 0.0F, 76.999489F);
      ((Path)localObject).lineTo(0.0F, 9.00051F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(113.04867F, 96.0F);
      ((Path)localObject).lineTo(104.0F, 86.0F);
      ((Path)localObject).lineTo(122.09733F, 86.0F);
      ((Path)localObject).lineTo(113.04867F, 96.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aty
 * JD-Core Version:    0.6.2
 */