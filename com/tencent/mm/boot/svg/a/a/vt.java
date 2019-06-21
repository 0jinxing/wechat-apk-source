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

public final class vt extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-9473160);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 39.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9473160);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(10.5F, 7.5F);
      ((Path)localObject3).lineTo(10.5F, 10.5F);
      ((Path)localObject3).lineTo(3.0F, 10.5F);
      ((Path)localObject3).lineTo(3.0F, 67.5F);
      ((Path)localObject3).lineTo(39.0F, 67.5F);
      ((Path)localObject3).lineTo(39.0F, 42.5F);
      ((Path)localObject3).lineTo(42.0F, 42.5F);
      ((Path)localObject3).lineTo(42.0F, 67.5F);
      ((Path)localObject3).cubicTo(42.0F, 69.156853F, 40.656853F, 70.5F, 39.0F, 70.5F);
      ((Path)localObject3).lineTo(3.0F, 70.5F);
      ((Path)localObject3).cubicTo(1.343146F, 70.5F, 2.029061E-016F, 69.156853F, 0.0F, 67.5F);
      ((Path)localObject3).lineTo(4.440892E-016F, 10.5F);
      ((Path)localObject3).cubicTo(2.411831E-016F, 8.843145F, 1.343146F, 7.5F, 3.0F, 7.5F);
      ((Path)localObject3).lineTo(10.5F, 7.5F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(19.736181F, 0.0F);
      ((Path)localObject3).lineTo(22.228626F, 0.0F);
      ((Path)localObject3).cubicTo(22.580238F, 0.0F, 22.865276F, 0.2878169F, 22.865276F, 0.6428571F);
      ((Path)localObject3).cubicTo(22.865276F, 0.651781F, 22.865093F, 0.6607037F, 22.864725F, 0.6696196F);
      ((Path)localObject3).lineTo(22.281128F, 14.812477F);
      ((Path)localObject3).cubicTo(22.26692F, 15.156808F, 21.986332F, 15.428572F, 21.645029F, 15.428572F);
      ((Path)localObject3).lineTo(20.319778F, 15.428572F);
      ((Path)localObject3).cubicTo(19.978476F, 15.428572F, 19.697887F, 15.156808F, 19.68368F, 14.812477F);
      ((Path)localObject3).lineTo(19.100082F, 0.6696196F);
      ((Path)localObject3).cubicTo(19.085445F, 0.3148872F, 19.35837F, 0.01533783F, 19.709679F, 0.0005573102F);
      ((Path)localObject3).cubicTo(19.718508F, 0.0001858103F, 19.727345F, 0.0F, 19.736181F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(41.709831F, 8.148046F);
      ((Path)localObject3).lineTo(43.472256F, 9.927651F);
      ((Path)localObject3).cubicTo(43.720886F, 10.178701F, 43.720886F, 10.585736F, 43.472256F, 10.836787F);
      ((Path)localObject3).cubicTo(43.466007F, 10.843098F, 43.459629F, 10.849276F, 43.453125F, 10.855318F);
      ((Path)localObject3).lineTo(33.136501F, 20.43914F);
      ((Path)localObject3).cubicTo(32.885323F, 20.672474F, 32.496609F, 20.664301F, 32.255272F, 20.42061F);
      ((Path)localObject3).lineTo(31.318178F, 19.47438F);
      ((Path)localObject3).cubicTo(31.076839F, 19.23069F, 31.068745F, 18.838186F, 31.299826F, 18.584562F);
      ((Path)localObject3).lineTo(40.791122F, 8.167363F);
      ((Path)localObject3).cubicTo(41.029182F, 7.906078F, 41.431938F, 7.889134F, 41.690701F, 8.129516F);
      ((Path)localObject3).cubicTo(41.697205F, 8.135557F, 41.703583F, 8.141735F, 41.709831F, 8.148046F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(51.541637F, 29.598772F);
      ((Path)localObject3).lineTo(51.541637F, 32.115513F);
      ((Path)localObject3).cubicTo(51.541637F, 32.470554F, 51.256599F, 32.758369F, 50.904987F, 32.758369F);
      ((Path)localObject3).cubicTo(50.896149F, 32.758369F, 50.887314F, 32.758186F, 50.878483F, 32.757813F);
      ((Path)localObject3).lineTo(36.872166F, 32.16853F);
      ((Path)localObject3).cubicTo(36.531158F, 32.154182F, 36.26202F, 31.870859F, 36.26202F, 31.526228F);
      ((Path)localObject3).lineTo(36.26202F, 30.188057F);
      ((Path)localObject3).cubicTo(36.26202F, 29.843428F, 36.531158F, 29.560104F, 36.872166F, 29.545757F);
      ((Path)localObject3).lineTo(50.878483F, 28.956472F);
      ((Path)localObject3).cubicTo(51.22979F, 28.941692F, 51.526447F, 29.217278F, 51.541084F, 29.57201F);
      ((Path)localObject3).cubicTo(51.541454F, 29.580925F, 51.541637F, 29.589848F, 51.541637F, 29.598772F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vt
 * JD-Core Version:    0.6.2
 */