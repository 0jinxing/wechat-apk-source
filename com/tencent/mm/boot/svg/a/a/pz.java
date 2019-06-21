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

public final class pz extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-9538696);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.0F, 55.0F);
      ((Path)localObject1).lineTo(46.0F, 55.577999F);
      ((Path)localObject1).lineTo(46.215F, 56.113998F);
      ((Path)localObject1).lineTo(47.769001F, 60.0F);
      ((Path)localObject1).lineTo(33.230999F, 60.0F);
      ((Path)localObject1).lineTo(34.785F, 56.113998F);
      ((Path)localObject1).lineTo(35.0F, 55.577999F);
      ((Path)localObject1).lineTo(35.0F, 55.0F);
      ((Path)localObject1).lineTo(46.0F, 55.0F);
      ((Path)localObject1).lineTo(46.0F, 55.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(3.0F, 4.44F);
      ((Path)localObject1).cubicTo(3.0F, 3.645F, 3.64F, 3.0F, 4.445F, 3.0F);
      ((Path)localObject1).lineTo(75.555F, 3.0F);
      ((Path)localObject1).cubicTo(76.352997F, 3.0F, 77.0F, 3.637F, 77.0F, 4.44F);
      ((Path)localObject1).lineTo(77.0F, 29.0F);
      ((Path)localObject1).lineTo(80.0F, 29.0F);
      ((Path)localObject1).lineTo(80.0F, 4.316F);
      ((Path)localObject1).cubicTo(80.0F, 1.925F, 78.068001F, 0.0F, 75.684998F, 0.0F);
      ((Path)localObject1).lineTo(4.315F, 0.0F);
      ((Path)localObject1).cubicTo(1.938F, 0.0F, 0.0F, 1.932F, 0.0F, 4.316F);
      ((Path)localObject1).lineTo(0.0F, 50.683998F);
      ((Path)localObject1).cubicTo(0.0F, 53.075001F, 1.932F, 55.0F, 4.315F, 55.0F);
      ((Path)localObject1).lineTo(32.0F, 55.0F);
      ((Path)localObject1).lineTo(30.0F, 60.0F);
      ((Path)localObject1).lineTo(26.0F, 62.0F);
      ((Path)localObject1).lineTo(26.0F, 63.0F);
      ((Path)localObject1).lineTo(55.0F, 63.0F);
      ((Path)localObject1).lineTo(55.0F, 62.0F);
      ((Path)localObject1).lineTo(51.0F, 60.0F);
      ((Path)localObject1).lineTo(49.0F, 55.0F);
      ((Path)localObject1).lineTo(59.0F, 55.0F);
      ((Path)localObject1).lineTo(59.0F, 52.0F);
      ((Path)localObject1).lineTo(49.0F, 52.0F);
      ((Path)localObject1).lineTo(32.0F, 52.0F);
      ((Path)localObject1).lineTo(4.445F, 52.0F);
      ((Path)localObject1).cubicTo(3.647F, 52.0F, 3.0F, 51.362999F, 3.0F, 50.560001F);
      ((Path)localObject1).lineTo(3.0F, 43.0F);
      ((Path)localObject1).lineTo(59.0F, 43.0F);
      ((Path)localObject1).lineTo(59.0F, 40.0F);
      ((Path)localObject1).lineTo(3.0F, 40.0F);
      ((Path)localObject1).lineTo(3.0F, 4.44F);
      ((Path)localObject1).lineTo(3.0F, 4.44F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(65.0F, 60.0F);
      ((Path)localObject3).lineTo(84.0F, 60.0F);
      ((Path)localObject3).lineTo(84.0F, 46.0F);
      ((Path)localObject3).lineTo(65.0F, 46.0F);
      ((Path)localObject3).lineTo(65.0F, 60.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(69.0F, 37.0F);
      ((Path)localObject3).cubicTo(69.0F, 35.895F, 69.900002F, 35.0F, 70.991997F, 35.0F);
      ((Path)localObject3).lineTo(78.008003F, 35.0F);
      ((Path)localObject3).cubicTo(79.108002F, 35.0F, 80.0F, 35.887001F, 80.0F, 37.0F);
      ((Path)localObject3).lineTo(80.0F, 43.0F);
      ((Path)localObject3).lineTo(69.0F, 43.0F);
      ((Path)localObject3).lineTo(69.0F, 37.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(84.132004F, 43.0F);
      ((Path)localObject3).lineTo(83.0F, 43.0F);
      ((Path)localObject3).lineTo(83.0F, 37.754002F);
      ((Path)localObject3).cubicTo(83.0F, 34.574001F, 80.422997F, 32.0F, 77.245003F, 32.0F);
      ((Path)localObject3).lineTo(71.754997F, 32.0F);
      ((Path)localObject3).cubicTo(68.582001F, 32.0F, 66.0F, 34.576F, 66.0F, 37.754002F);
      ((Path)localObject3).lineTo(66.0F, 43.0F);
      ((Path)localObject3).lineTo(64.867996F, 43.0F);
      ((Path)localObject3).cubicTo(63.291F, 43.0F, 62.0F, 44.292F, 62.0F, 45.887001F);
      ((Path)localObject3).lineTo(62.0F, 60.112999F);
      ((Path)localObject3).cubicTo(62.0F, 61.717999F, 63.284F, 63.0F, 64.867996F, 63.0F);
      ((Path)localObject3).lineTo(84.132004F, 63.0F);
      ((Path)localObject3).cubicTo(85.709F, 63.0F, 87.0F, 61.708F, 87.0F, 60.112999F);
      ((Path)localObject3).lineTo(87.0F, 45.887001F);
      ((Path)localObject3).cubicTo(87.0F, 44.280998F, 85.716003F, 43.0F, 84.132004F, 43.0F);
      ((Path)localObject3).lineTo(84.132004F, 43.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.pz
 * JD-Core Version:    0.6.2
 */