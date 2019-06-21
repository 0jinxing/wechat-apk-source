package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class ada extends c
{
  private final int height = 55;
  private final int width = 35;

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
        paramInt = 35;
        continue;
        paramInt = 55;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 4.0F);
      ((Path)localObject).cubicTo(0.0F, 1.790861F, 1.790861F, 0.0F, 4.0F, 0.0F);
      ((Path)localObject).lineTo(5.0F, 0.0F);
      ((Path)localObject).cubicTo(7.209139F, 0.0F, 9.0F, 1.790861F, 9.0F, 4.0F);
      ((Path)localObject).lineTo(9.0F, 51.0F);
      ((Path)localObject).cubicTo(9.0F, 53.209141F, 7.209139F, 55.0F, 5.0F, 55.0F);
      ((Path)localObject).lineTo(4.0F, 55.0F);
      ((Path)localObject).cubicTo(1.790861F, 55.0F, 0.0F, 53.209141F, 0.0F, 51.0F);
      ((Path)localObject).lineTo(0.0F, 4.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(26.0F, 4.0F);
      ((Path)localObject).cubicTo(26.0F, 1.790861F, 27.790861F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject).lineTo(31.0F, 0.0F);
      ((Path)localObject).cubicTo(33.209141F, 0.0F, 35.0F, 1.790861F, 35.0F, 4.0F);
      ((Path)localObject).lineTo(35.0F, 51.0F);
      ((Path)localObject).cubicTo(35.0F, 53.209141F, 33.209141F, 55.0F, 31.0F, 55.0F);
      ((Path)localObject).lineTo(30.0F, 55.0F);
      ((Path)localObject).cubicTo(27.790861F, 55.0F, 26.0F, 53.209141F, 26.0F, 51.0F);
      ((Path)localObject).lineTo(26.0F, 4.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ada
 * JD-Core Version:    0.6.2
 */