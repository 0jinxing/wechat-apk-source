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

public final class adi extends c
{
  private final int height = 108;
  private final int width = 108;

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
        paramInt = 108;
        continue;
        paramInt = 108;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-14187817);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(108.0F, 0.0F);
      ((Path)localObject3).lineTo(108.0F, 108.0F);
      ((Path)localObject3).lineTo(0.0F, 108.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 32.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(60.154037F, 3.58796F);
      ((Path)localObject2).lineTo(60.154037F, 40.412003F);
      ((Path)localObject2).lineTo(3.845964F, 40.40884F);
      ((Path)localObject2).lineTo(3.845964F, 3.58796F);
      ((Path)localObject2).lineTo(60.154037F, 3.58796F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 2.351667F);
      ((Path)localObject2).lineTo(0.0F, 41.644958F);
      ((Path)localObject2).cubicTo(0.0F, 42.943291F, 1.047125F, 43.996597F, 2.336709F, 43.99667F);
      ((Path)localObject2).lineTo(61.66312F, 44.0F);
      ((Path)localObject2).cubicTo(62.953594F, 44.000072F, 64.0F, 42.948074F, 64.0F, 41.648312F);
      ((Path)localObject2).lineTo(64.0F, 2.351735F);
      ((Path)localObject2).cubicTo(64.0F, 1.053358F, 62.95285F, 0.0F, 61.663208F, 0.0F);
      ((Path)localObject2).lineTo(2.336793F, 0.0F);
      ((Path)localObject2).cubicTo(1.046383F, 0.0F, 0.0F, 1.051947F, 0.0F, 2.351667F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.915514F, 0.0F);
      ((Path)localObject1).lineTo(-3.552714E-015F, 2.919991F);
      ((Path)localObject1).lineTo(32.030815F, 35.0F);
      ((Path)localObject1).lineTo(62.492252F, 4.491779F);
      ((Path)localObject1).lineTo(63.021221F, 2.001433F);
      ((Path)localObject1).lineTo(61.084488F, 0.06172573F);
      ((Path)localObject1).lineTo(32.030815F, 29.160017F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.874115F, 43.0F);
      ((Path)localObject1).lineTo(23.0F, 22.874115F);
      ((Path)localObject1).lineTo(20.125885F, 20.0F);
      ((Path)localObject1).lineTo(0.0F, 40.125885F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(63.0F, 41.125885F);
      ((Path)localObject1).lineTo(42.874115F, 21.0F);
      ((Path)localObject1).lineTo(40.0F, 23.874115F);
      ((Path)localObject1).lineTo(60.125885F, 44.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.adi
 * JD-Core Version:    0.6.2
 */