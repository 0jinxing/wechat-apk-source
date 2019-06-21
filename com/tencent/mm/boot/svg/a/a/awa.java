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

public final class awa extends c
{
  private final int height = 46;
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
        paramInt = 46;
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
      localPaint2.setColor(-499359);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(23.0F, 0.0F);
      ((Path)localObject).cubicTo(35.702549F, 0.0F, 46.0F, 10.29745F, 46.0F, 23.0F);
      ((Path)localObject).cubicTo(46.0F, 35.702549F, 35.702549F, 46.0F, 23.0F, 46.0F);
      ((Path)localObject).cubicTo(10.29745F, 46.0F, 0.0F, 35.702549F, 0.0F, 23.0F);
      ((Path)localObject).cubicTo(0.0F, 10.29745F, 10.29745F, 0.0F, 23.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(29.85458F, 16.970005F);
      ((Path)localObject).cubicTo(29.680027F, 15.727787F, 29.348436F, 14.533834F, 28.440001F, 13.570005F);
      ((Path)localObject).cubicTo(25.85F, 10.150005F, 20.18F, 10.140005F, 17.59F, 13.560005F);
      ((Path)localObject).cubicTo(15.97F, 15.310005F, 16.18F, 17.790005F, 15.83F, 19.970005F);
      ((Path)localObject).lineTo(13.0F, 19.970005F);
      ((Path)localObject).cubicTo(13.01F, 24.310005F, 13.01F, 28.640005F, 13.01F, 32.970005F);
      ((Path)localObject).lineTo(33.009998F, 32.970005F);
      ((Path)localObject).cubicTo(33.009998F, 28.640005F, 33.009998F, 24.310005F, 33.02F, 19.970005F);
      ((Path)localObject).lineTo(31.605F, 19.970005F);
      ((Path)localObject).lineTo(26.1F, 19.970005F);
      ((Path)localObject).lineTo(18.83F, 19.970005F);
      ((Path)localObject).cubicTo(18.809999F, 17.350006F, 19.719999F, 13.870006F, 23.0F, 13.970005F);
      ((Path)localObject).cubicTo(25.080025F, 13.887314F, 26.225389F, 15.273373F, 26.773254F, 16.970005F);
      ((Path)localObject).lineTo(29.85458F, 16.970005F);
      ((Path)localObject).lineTo(29.85458F, 16.970005F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awa
 * JD-Core Version:    0.6.2
 */