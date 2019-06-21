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

public final class oz extends c
{
  private final int height = 162;
  private final int width = 162;

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
        paramInt = 162;
        continue;
        paramInt = 162;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 80.0F);
      ((Path)localObject3).cubicTo(0.0F, 35.887928F, 35.887665F, 0.0F, 80.0F, 0.0F);
      ((Path)localObject3).cubicTo(124.11234F, 0.0F, 160.0F, 35.887928F, 160.0F, 80.0F);
      ((Path)localObject3).cubicTo(160.0F, 124.11208F, 124.11234F, 160.0F, 80.0F, 160.0F);
      ((Path)localObject3).cubicTo(35.887665F, 160.0F, 0.0F, 124.11208F, 0.0F, 80.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(63.284435F, 77.0F);
      ((Path)localObject2).lineTo(89.0F, 104.0F);
      ((Path)localObject2).lineTo(58.0F, 104.0F);
      ((Path)localObject2).cubicTo(60.590897F, 100.16911F, 63.478912F, 93.101761F, 62.938694F, 80.917107F);
      ((Path)localObject2).cubicTo(63.001358F, 79.552414F, 63.116966F, 78.244446F, 63.284435F, 77.0F);
      ((Path)localObject2).moveTo(60.032513F, 81.317619F);
      ((Path)localObject2).cubicTo(60.911308F, 99.651489F, 53.0F, 104.66564F, 53.0F, 104.66564F);
      ((Path)localObject2).lineTo(53.0F, 107.0F);
      ((Path)localObject2).lineTo(97.0F, 107.0F);
      ((Path)localObject2).lineTo(61.79871F, 71.0F);
      ((Path)localObject2).cubicTo(60.848923F, 73.816193F, 60.213223F, 77.217628F, 60.032513F, 81.317619F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(84.020508F, 58.952671F);
      ((Path)localObject2).lineTo(84.020508F, 57.067513F);
      ((Path)localObject2).cubicTo(84.020508F, 54.063652F, 81.875374F, 52.031452F, 78.884567F, 52.031452F);
      ((Path)localObject2).cubicTo(75.90136F, 52.031452F, 74.009521F, 54.103878F, 74.009521F, 57.096867F);
      ((Path)localObject2).lineTo(74.009521F, 58.952671F);
      ((Path)localObject2).cubicTo(71.486191F, 59.716953F, 68.183861F, 61.1031F, 65.882317F, 63.578594F);
      ((Path)localObject2).lineTo(53.303719F, 51.0F);
      ((Path)localObject2).lineTo(51.0F, 53.303719F);
      ((Path)localObject2).lineTo(108.69628F, 111.0F);
      ((Path)localObject2).lineTo(111.0F, 108.69628F);
      ((Path)localObject2).lineTo(100.0663F, 97.762581F);
      ((Path)localObject2).cubicTo(98.537735F, 94.186867F, 97.320099F, 88.874939F, 97.69735F, 81.202759F);
      ((Path)localObject2).cubicTo(97.029823F, 66.393288F, 90.036926F, 60.812824F, 84.020508F, 58.952671F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(68.192558F, 66.0466F);
      ((Path)localObject2).lineTo(68.270584F, 65.963394F);
      ((Path)localObject2).cubicTo(69.939957F, 64.198769F, 71.999466F, 62.943111F, 74.389778F, 62.230995F);
      ((Path)localObject2).lineTo(76.990479F, 61.549137F);
      ((Path)localObject2).lineTo(76.990479F, 59.143719F);
      ((Path)localObject2).lineTo(76.990479F, 57.299133F);
      ((Path)localObject2).cubicTo(76.990479F, 56.115875F, 77.795502F, 54.989075F, 78.994507F, 54.989075F);
      ((Path)localObject2).cubicTo(80.194611F, 54.989075F, 81.000916F, 56.115875F, 81.000916F, 57.299133F);
      ((Path)localObject2).lineTo(81.000916F, 59.157768F);
      ((Path)localObject2).lineTo(81.000916F, 61.549137F);
      ((Path)localObject2).lineTo(83.404823F, 62.254768F);
      ((Path)localObject2).cubicTo(86.330345F, 63.144104F, 88.738235F, 64.841728F, 90.56147F, 67.300095F);
      ((Path)localObject2).cubicTo(93.027611F, 70.622948F, 94.425529F, 75.323563F, 94.716759F, 81.27227F);
      ((Path)localObject2).cubicTo(94.515648F, 85.521194F, 94.772812F, 89.401627F, 95.482758F, 92.880081F);
      ((Path)localObject2).lineTo(68.192558F, 66.0466F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.oz
 * JD-Core Version:    0.6.2
 */