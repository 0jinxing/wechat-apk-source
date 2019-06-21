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

public final class atx extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject5 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject5).setColor(-1);
      ((Paint)localObject5).setStrokeWidth(4.5F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(7.25F, 23.25F);
      ((Path)localObject4).lineTo(40.75F, 23.25F);
      ((Path)localObject4).lineTo(40.75F, 65.75F);
      ((Path)localObject4).lineTo(7.25F, 65.75F);
      ((Path)localObject4).lineTo(7.25F, 23.25F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject5);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 17.0F, 0.0F, 1.0F, 32.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(0.0F, 1.0F);
      ((Path)localObject5).cubicTo(0.0F, 0.4477152F, 0.4477152F, -2.664535E-015F, 1.0F, -2.664535E-015F);
      ((Path)localObject5).lineTo(2.0F, -2.664535E-015F);
      ((Path)localObject5).cubicTo(2.552285F, -2.664535E-015F, 3.0F, 0.4477152F, 3.0F, 1.0F);
      ((Path)localObject5).lineTo(3.0F, 21.0F);
      ((Path)localObject5).cubicTo(3.0F, 21.552284F, 2.552285F, 22.0F, 2.0F, 22.0F);
      ((Path)localObject5).lineTo(1.0F, 22.0F);
      ((Path)localObject5).cubicTo(0.4477152F, 22.0F, 0.0F, 21.552284F, 0.0F, 21.0F);
      ((Path)localObject5).lineTo(0.0F, 1.0F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject5 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(11.998957F, -1.776357E-015F);
      ((Path)localObject4).cubicTo(11.447248F, -1.776357E-015F, 11.0F, 0.4394583F, 11.0F, 1.002462F);
      ((Path)localObject4).lineTo(11.0F, 20.997538F);
      ((Path)localObject4).cubicTo(11.0F, 21.551182F, 11.44266F, 22.0F, 11.998957F, 22.0F);
      ((Path)localObject4).lineTo(13.001043F, 22.0F);
      ((Path)localObject4).cubicTo(13.552752F, 22.0F, 14.0F, 21.560541F, 14.0F, 20.997538F);
      ((Path)localObject4).lineTo(14.0F, 1.002462F);
      ((Path)localObject4).cubicTo(14.0F, 0.4488174F, 13.55734F, -1.776357E-015F, 13.001043F, -1.776357E-015F);
      ((Path)localObject4).lineTo(11.998957F, -1.776357E-015F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject5);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(0.0F, 22.0F);
      ((Path)localObject5).cubicTo(0.0F, 21.447716F, 0.4477152F, 21.0F, 1.0F, 21.0F);
      ((Path)localObject5).lineTo(47.0F, 21.0F);
      ((Path)localObject5).cubicTo(47.552284F, 21.0F, 48.0F, 21.447716F, 48.0F, 22.0F);
      ((Path)localObject5).lineTo(48.0F, 23.0F);
      ((Path)localObject5).cubicTo(48.0F, 23.552284F, 47.552284F, 24.0F, 47.0F, 24.0F);
      ((Path)localObject5).lineTo(1.0F, 24.0F);
      ((Path)localObject5).cubicTo(0.4477152F, 24.0F, 0.0F, 23.552284F, 0.0F, 23.0F);
      ((Path)localObject5).lineTo(0.0F, 22.0F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 0.9659258F, -0.258819F, 3.58819F, 0.258819F, 0.9659258F, -2.384186E-007F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.0F, 1.0F);
      ((Path)localObject1).cubicTo(15.0F, 0.4477152F, 15.447715F, -6.82121E-013F, 16.0F, -6.82121E-013F);
      ((Path)localObject1).lineTo(32.0F, -6.82121E-013F);
      ((Path)localObject1).cubicTo(32.552284F, -6.82121E-013F, 33.0F, 0.4477152F, 33.0F, 1.0F);
      ((Path)localObject1).lineTo(33.0F, 6.0F);
      ((Path)localObject1).cubicTo(33.0F, 6.552285F, 32.552284F, 7.0F, 32.0F, 7.0F);
      ((Path)localObject1).lineTo(16.0F, 7.0F);
      ((Path)localObject1).cubicTo(15.447715F, 7.0F, 15.0F, 6.552285F, 15.0F, 6.0F);
      ((Path)localObject1).lineTo(15.0F, 1.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(-4.547474E-013F, 7.0F);
      ((Path)localObject3).cubicTo(-4.547474E-013F, 6.447715F, 0.4477152F, 6.0F, 1.0F, 6.0F);
      ((Path)localObject3).lineTo(47.0F, 6.0F);
      ((Path)localObject3).cubicTo(47.552284F, 6.0F, 48.0F, 6.447715F, 48.0F, 7.0F);
      ((Path)localObject3).lineTo(48.0F, 9.0F);
      ((Path)localObject3).cubicTo(48.0F, 9.552285F, 47.552284F, 10.0F, 47.0F, 10.0F);
      ((Path)localObject3).lineTo(1.0F, 10.0F);
      ((Path)localObject3).cubicTo(0.4477152F, 10.0F, -4.547474E-013F, 9.552285F, -4.547474E-013F, 9.0F);
      ((Path)localObject3).lineTo(-4.547474E-013F, 7.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.atx
 * JD-Core Version:    0.6.2
 */