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

public final class iz extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-9276814);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(8.0F, 32.0F);
      ((Path)localObject2).cubicTo(8.0F, 28.686291F, 10.686291F, 26.0F, 14.0F, 26.0F);
      ((Path)localObject2).lineTo(130.0F, 26.0F);
      ((Path)localObject2).cubicTo(133.31371F, 26.0F, 136.0F, 28.686291F, 136.0F, 32.0F);
      ((Path)localObject2).lineTo(136.0F, 112.0F);
      ((Path)localObject2).cubicTo(136.0F, 115.31371F, 133.31371F, 118.0F, 130.0F, 118.0F);
      ((Path)localObject2).lineTo(14.0F, 118.0F);
      ((Path)localObject2).cubicTo(10.686291F, 118.0F, 8.0F, 115.31371F, 8.0F, 112.0F);
      ((Path)localObject2).lineTo(8.0F, 32.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(71.885094F, 65.030899F);
      ((Path)localObject1).lineTo(27.494259F, 39.401836F);
      ((Path)localObject1).cubicTo(26.058262F, 38.572762F, 24.230272F, 39.068474F, 23.401754F, 40.50351F);
      ((Path)localObject1).lineTo(21.402084F, 43.967037F);
      ((Path)localObject1).cubicTo(20.576242F, 45.397442F, 21.06255F, 47.235489F, 22.494259F, 48.062088F);
      ((Path)localObject1).lineTo(70.312874F, 75.670181F);
      ((Path)localObject1).cubicTo(70.809265F, 75.956772F, 71.352501F, 76.08506F, 71.885094F, 76.070969F);
      ((Path)localObject1).cubicTo(72.417694F, 76.08506F, 72.96093F, 75.956772F, 73.457321F, 75.670181F);
      ((Path)localObject1).lineTo(121.27593F, 48.062088F);
      ((Path)localObject1).cubicTo(122.70764F, 47.235489F, 123.19395F, 45.397442F, 122.36811F, 43.967037F);
      ((Path)localObject1).lineTo(120.36844F, 40.50351F);
      ((Path)localObject1).cubicTo(119.53992F, 39.068474F, 117.71193F, 38.572762F, 116.27593F, 39.401836F);
      ((Path)localObject1).lineTo(71.885094F, 65.030899F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.iz
 * JD-Core Version:    0.6.2
 */