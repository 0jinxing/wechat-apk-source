package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class avk extends c
{
  private final int height = 144;
  private final int width = 111;

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
        paramInt = 111;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint1.setColor(-3355444);
      ((Paint)localObject3).setColor(-3355444);
      ((Paint)localObject3).setStrokeWidth(2.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 40.0F, 0.0F, 1.0F, 52.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(16.837944F, 33.589672F);
      ((Path)localObject2).cubicTo(7.731226F, 33.589672F, 0.2687747F, 26.054348F, 0.2687747F, 16.858696F);
      ((Path)localObject2).cubicTo(0.2687747F, 7.663044F, 7.731226F, 0.1277174F, 16.837944F, 0.1277174F);
      ((Path)localObject2).cubicTo(25.944664F, 0.1277174F, 33.407116F, 7.663044F, 33.407116F, 16.858696F);
      ((Path)localObject2).cubicTo(33.407116F, 26.182066F, 25.944664F, 33.589672F, 16.837944F, 33.589672F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(16.837944F, 1.404891F);
      ((Path)localObject2).cubicTo(8.363636F, 1.404891F, 1.533597F, 8.30163F, 1.533597F, 16.858696F);
      ((Path)localObject2).cubicTo(1.533597F, 25.41576F, 8.363636F, 32.3125F, 16.837944F, 32.3125F);
      ((Path)localObject2).cubicTo(25.312254F, 32.3125F, 32.142292F, 25.41576F, 32.142292F, 16.858696F);
      ((Path)localObject2).cubicTo(32.142292F, 8.429348F, 25.18577F, 1.404891F, 16.837944F, 1.404891F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(39.35178F, 40.23098F);
      ((Path)localObject3).cubicTo(39.225296F, 40.23098F, 38.972332F, 40.23098F, 38.845848F, 40.10326F);
      ((Path)localObject3).lineTo(27.841898F, 28.991848F);
      ((Path)localObject3).cubicTo(27.588932F, 28.736412F, 27.588932F, 28.35326F, 27.841898F, 28.097826F);
      ((Path)localObject3).cubicTo(28.094862F, 27.842392F, 28.474308F, 27.842392F, 28.727272F, 28.097826F);
      ((Path)localObject3).lineTo(39.731224F, 39.20924F);
      ((Path)localObject3).cubicTo(39.984188F, 39.464672F, 39.984188F, 39.847828F, 39.731224F, 40.10326F);
      ((Path)localObject3).cubicTo(39.604744F, 40.23098F, 39.47826F, 40.23098F, 39.35178F, 40.23098F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avk
 * JD-Core Version:    0.6.2
 */