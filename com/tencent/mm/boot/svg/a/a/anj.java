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

public final class anj extends c
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
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1.049392F, 4.955139F);
      ((Path)localObject2).cubicTo(0.7397459F, 3.15857F, 1.938376F, 0.9428011F, 3.976046F, 1.102496F);
      ((Path)localObject2).cubicTo(22.345047F, 0.9727439F, 40.724033F, 1.072553F, 59.093037F, 1.052591F);
      ((Path)localObject2).cubicTo(60.89098F, 0.7232205F, 63.00856F, 1.970838F, 62.908672F, 3.957045F);
      ((Path)localObject2).cubicTo(63.048512F, 17.002132F, 62.948627F, 30.04722F, 62.958614F, 43.092308F);
      ((Path)localObject2).cubicTo(63.238297F, 44.828991F, 62.07962F, 46.994858F, 60.11187F, 46.895046F);
      ((Path)localObject2).cubicTo(53.07991F, 47.054741F, 46.03796F, 46.905029F, 38.99601F, 46.954933F);
      ((Path)localObject2).lineTo(38.99601F, 50.957291F);
      ((Path)localObject2).cubicTo(42.322208F, 50.927345F, 45.658394F, 50.8475F, 48.984592F, 51.176868F);
      ((Path)localObject2).cubicTo(48.984592F, 52.274773F, 48.914673F, 54.400715F, 47.176659F, 53.93161F);
      ((Path)localObject2).cubicTo(37.068214F, 53.951572F, 26.95977F, 53.951572F, 16.851326F, 53.93161F);
      ((Path)localObject2).cubicTo(15.083348F, 54.410694F, 14.993451F, 52.25481F, 15.093336F, 51.136948F);
      ((Path)localObject2).cubicTo(18.389568F, 50.877441F, 21.705776F, 50.917366F, 25.011997F, 50.957291F);
      ((Path)localObject2).lineTo(25.011997F, 46.954933F);
      ((Path)localObject2).cubicTo(17.980036F, 46.905029F, 10.948075F, 47.054741F, 3.926103F, 46.895046F);
      ((Path)localObject2).cubicTo(1.90841F, 47.024799F, 0.7397459F, 44.809029F, 1.049392F, 43.032425F);
      ((Path)localObject2).cubicTo(1.029415F, 30.336668F, 1.029415F, 17.650894F, 1.049392F, 4.955139F);
      ((Path)localObject2).lineTo(1.049392F, 4.955139F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(5.0F, 5.0F);
      ((Path)localObject2).lineTo(5.0F, 39.0F);
      ((Path)localObject2).lineTo(59.0F, 39.0F);
      ((Path)localObject2).lineTo(59.0F, 5.0F);
      ((Path)localObject2).lineTo(5.0F, 5.0F);
      ((Path)localObject2).lineTo(5.0F, 5.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(31.225903F, 41.130821F);
      ((Path)localObject2).cubicTo(28.789328F, 42.126995F, 30.338081F, 45.779629F, 32.794384F, 44.849869F);
      ((Path)localObject2).cubicTo(35.201366F, 43.844208F, 33.652611F, 40.276962F, 31.225903F, 41.130821F);
      ((Path)localObject2).lineTo(31.225903F, 41.130821F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-15658735);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 29.0F, 0.0F, 1.0F, 40.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 17, 4);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.225902F, 1.130823F);
      ((Path)localObject1).cubicTo(4.652611F, 0.2769606F, 6.201365F, 3.844208F, 3.794385F, 4.849868F);
      ((Path)localObject1).cubicTo(1.338081F, 5.779629F, -0.2106723F, 2.126996F, 2.225902F, 1.130823F);
      ((Path)localObject1).lineTo(2.225902F, 1.130823F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anj
 * JD-Core Version:    0.6.2
 */