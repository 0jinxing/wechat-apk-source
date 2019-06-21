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

public final class afz extends c
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
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-2147483648);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 9.6F);
      ((Path)localObject3).cubicTo(0.0F, 4.298066F, 4.298066F, 0.0F, 9.6F, 0.0F);
      ((Path)localObject3).lineTo(86.400002F, 0.0F);
      ((Path)localObject3).cubicTo(91.701935F, 0.0F, 96.0F, 4.298066F, 96.0F, 9.6F);
      ((Path)localObject3).lineTo(96.0F, 86.400002F);
      ((Path)localObject3).cubicTo(96.0F, 91.701935F, 91.701935F, 96.0F, 86.400002F, 96.0F);
      ((Path)localObject3).lineTo(9.6F, 96.0F);
      ((Path)localObject3).cubicTo(4.298066F, 96.0F, 0.0F, 91.701935F, 0.0F, 86.400002F);
      ((Path)localObject3).lineTo(0.0F, 9.6F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 75.943878F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(50.0103F, 25.920588F);
      ((Path)localObject1).lineTo(50.0103F, 54.991493F);
      ((Path)localObject1).lineTo(46.988003F, 54.989735F);
      ((Path)localObject1).lineTo(46.988003F, 25.922291F);
      ((Path)localObject1).lineTo(41.279999F, 31.652632F);
      ((Path)localObject1).lineTo(39.0F, 29.363708F);
      ((Path)localObject1).lineTo(46.587086F, 21.746929F);
      ((Path)localObject1).cubicTo(47.639442F, 20.690456F, 49.348984F, 20.687119F, 50.405457F, 21.739473F);
      ((Path)localObject1).cubicTo(50.407948F, 21.741953F, 50.410431F, 21.744438F, 50.412914F, 21.746929F);
      ((Path)localObject1).lineTo(50.779999F, 22.115454F);
      ((Path)localObject1).lineTo(58.0F, 29.363708F);
      ((Path)localObject1).lineTo(55.720001F, 31.652632F);
      ((Path)localObject1).lineTo(50.0103F, 25.920588F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(66.997154F, 35.043194F);
      ((Path)localObject2).lineTo(59.003365F, 35.039516F);
      ((Path)localObject2).lineTo(59.003365F, 32.0F);
      ((Path)localObject2).lineTo(67.315308F, 32.0F);
      ((Path)localObject2).cubicTo(68.792961F, 32.0F, 70.0F, 33.218624F, 70.0F, 34.721878F);
      ((Path)localObject2).lineTo(70.0F, 68.278122F);
      ((Path)localObject2).cubicTo(70.0F, 69.772949F, 68.801811F, 71.0F, 67.323761F, 71.0F);
      ((Path)localObject2).lineTo(29.676235F, 71.0F);
      ((Path)localObject2).cubicTo(28.206472F, 71.0F, 27.0F, 69.781372F, 27.0F, 68.278122F);
      ((Path)localObject2).lineTo(27.0F, 34.721878F);
      ((Path)localObject2).cubicTo(27.0F, 33.227047F, 28.201979F, 32.0F, 29.684696F, 32.0F);
      ((Path)localObject2).lineTo(37.994774F, 32.0F);
      ((Path)localObject2).lineTo(37.994774F, 35.045048F);
      ((Path)localObject2).lineTo(29.999331F, 35.045048F);
      ((Path)localObject2).lineTo(29.999331F, 67.929237F);
      ((Path)localObject2).lineTo(66.997154F, 67.932915F);
      ((Path)localObject2).lineTo(66.997154F, 35.043194F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afz
 * JD-Core Version:    0.6.2
 */