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

public final class arn extends c
{
  private final int height = 138;
  private final int width = 138;

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
        paramInt = 138;
        continue;
        paramInt = 138;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -283.0F, 0.0F, 1.0F, -245.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 283.0F, 0.0F, 1.0F, 245.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      Object localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-13917627);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 6.0F);
      ((Path)localObject3).cubicTo(0.0F, 2.686291F, 2.686291F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject3).lineTo(132.0F, 0.0F);
      ((Path)localObject3).cubicTo(135.31371F, 0.0F, 138.0F, 2.686291F, 138.0F, 6.0F);
      ((Path)localObject3).lineTo(138.0F, 132.0F);
      ((Path)localObject3).cubicTo(138.0F, 135.31371F, 135.31371F, 138.0F, 132.0F, 138.0F);
      ((Path)localObject3).lineTo(6.0F, 138.0F);
      ((Path)localObject3).cubicTo(2.686291F, 138.0F, 0.0F, 135.31371F, 0.0F, 132.0F);
      ((Path)localObject3).lineTo(0.0F, 6.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 36.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localPaint1.setStrokeWidth(6.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(23.239437F, 34.394367F);
      ((Path)localObject1).cubicTo(27.35964F, 40.93951F, 20.518991F, 43.903023F, 17.661972F, 45.549297F);
      ((Path)localObject1).cubicTo(5.370789F, 52.541847F, 0.0F, 55.160763F, 0.0F, 58.563381F);
      ((Path)localObject1).lineTo(0.0F, 63.211269F);
      ((Path)localObject1).cubicTo(0.0F, 64.705521F, 1.117644F, 66.0F, 2.788732F, 66.0F);
      ((Path)localObject1).lineTo(63.211269F, 66.0F);
      ((Path)localObject1).cubicTo(64.882355F, 66.0F, 66.0F, 64.705521F, 66.0F, 63.211269F);
      ((Path)localObject1).lineTo(66.0F, 58.563381F);
      ((Path)localObject1).cubicTo(66.0F, 55.160763F, 60.629211F, 52.541847F, 48.338028F, 45.549297F);
      ((Path)localObject1).cubicTo(45.481007F, 43.903023F, 38.640362F, 40.93951F, 42.760563F, 34.394367F);
      ((Path)localObject1).cubicTo(46.419594F, 28.960619F, 49.2747F, 26.747225F, 49.267605F, 17.661972F);
      ((Path)localObject1).cubicTo(49.2747F, 9.037081F, 42.896458F, 0.0F, 33.46479F, 0.0F);
      ((Path)localObject1).cubicTo(23.103542F, 0.0F, 16.7253F, 9.037081F, 16.732395F, 17.661972F);
      ((Path)localObject1).cubicTo(16.7253F, 26.747225F, 19.580408F, 28.960619F, 23.239437F, 34.394367F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(69.0F, 30.0F);
      ((Path)localObject2).lineTo(61.5F, 30.0F);
      ((Path)localObject2).lineTo(61.5F, 34.5F);
      ((Path)localObject2).lineTo(69.0F, 34.5F);
      ((Path)localObject2).lineTo(69.0F, 42.0F);
      ((Path)localObject2).lineTo(73.5F, 42.0F);
      ((Path)localObject2).lineTo(73.5F, 34.5F);
      ((Path)localObject2).lineTo(81.0F, 34.5F);
      ((Path)localObject2).lineTo(81.0F, 30.0F);
      ((Path)localObject2).lineTo(73.5F, 30.0F);
      ((Path)localObject2).lineTo(73.5F, 22.5F);
      ((Path)localObject2).lineTo(69.0F, 22.5F);
      ((Path)localObject2).lineTo(69.0F, 30.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.arn
 * JD-Core Version:    0.6.2
 */