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

public final class ami extends c
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
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-12140518);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(28.009975F, 0.143353F);
      ((Path)localObject2).cubicTo(17.018795F, 0.2060361F, 14.567894F, 10.157754F, 15.0F, 16.0F);
      ((Path)localObject2).cubicTo(14.805542F, 21.506954F, 18.45052F, 25.816072F, 21.0F, 30.0F);
      ((Path)localObject2).cubicTo(22.314592F, 32.33474F, 21.796728F, 35.264141F, 20.0F, 37.0F);
      ((Path)localObject2).cubicTo(14.028744F, 40.733021F, 7.226779F, 43.172523F, 2.0F, 48.0F);
      ((Path)localObject2).cubicTo(-0.9395621F, 50.261074F, -0.8997263F, 57.339626F, 4.0F, 57.0F);
      ((Path)localObject2).cubicTo(11.956668F, 56.980297F, 20.026274F, 56.986336F, 28.009975F, 56.99984F);
      ((Path)localObject2).lineTo(28.009975F, 57.010265F);
      ((Path)localObject2).cubicTo(36.024422F, 56.996651F, 44.021988F, 56.96801F, 52.009975F, 56.987789F);
      ((Path)localObject2).cubicTo(56.909702F, 57.327415F, 56.949539F, 50.261074F, 54.009975F, 48.0F);
      ((Path)localObject2).cubicTo(48.783195F, 43.172523F, 41.981232F, 40.733021F, 36.009975F, 37.0F);
      ((Path)localObject2).cubicTo(34.213249F, 35.264141F, 33.695385F, 32.33474F, 35.009975F, 30.0F);
      ((Path)localObject2).cubicTo(37.559456F, 25.816072F, 41.204433F, 21.506954F, 41.009975F, 16.0F);
      ((Path)localObject2).cubicTo(41.443314F, 10.141088F, 39.081421F, 0.1472785F, 28.009975F, 0.1411133F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(59.0F, 15.0F);
      ((Path)localObject1).cubicTo(59.550797F, 12.291986F, 64.496094F, 12.311896F, 65.0F, 15.0F);
      ((Path)localObject1).cubicTo(65.098213F, 18.404175F, 64.910667F, 21.709135F, 65.0F, 25.0F);
      ((Path)localObject1).cubicTo(68.602364F, 25.073826F, 72.244705F, 24.884686F, 76.0F, 25.0F);
      ((Path)localObject1).cubicTo(77.397285F, 26.348026F, 77.338066F, 29.59326F, 76.0F, 31.0F);
      ((Path)localObject1).cubicTo(72.26445F, 31.116329F, 68.612236F, 30.927191F, 65.0F, 31.0F);
      ((Path)localObject1).cubicTo(64.910667F, 34.321743F, 65.108086F, 37.65657F, 65.0F, 41.0F);
      ((Path)localObject1).cubicTo(64.357895F, 43.699074F, 59.540924F, 43.669209F, 59.0F, 41.0F);
      ((Path)localObject1).cubicTo(58.899319F, 37.606796F, 59.106606F, 34.291878F, 59.0F, 31.0F);
      ((Path)localObject1).cubicTo(55.405041F, 30.927191F, 51.762695F, 31.116329F, 48.0F, 31.0F);
      ((Path)localObject1).cubicTo(46.659466F, 29.662943F, 46.56076F, 26.20866F, 48.0F, 25.0F);
      ((Path)localObject1).cubicTo(51.81205F, 24.874731F, 55.43465F, 25.073826F, 59.0F, 25.0F);
      ((Path)localObject1).cubicTo(59.106606F, 21.709135F, 58.909191F, 18.39422F, 59.0F, 15.0F);
      ((Path)localObject1).lineTo(59.0F, 15.0F);
      ((Path)localObject1).lineTo(59.0F, 15.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ami
 * JD-Core Version:    0.6.2
 */