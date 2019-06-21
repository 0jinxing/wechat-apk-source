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

public final class yv extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
      }
      Object localObject1 = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject2 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      ((Canvas)localObject1).save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      ((Canvas)localObject1).save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5625F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      ((Canvas)localObject1).save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(4.509916F, 4.533203F);
      ((Path)localObject4).lineTo(9.341856F, 1.145409F);
      ((Path)localObject4).cubicTo(9.818216F, 0.81142F, 10.475134F, 0.9268357F, 10.809122F, 1.403196F);
      ((Path)localObject4).cubicTo(10.933353F, 1.580385F, 11.0F, 1.791535F, 11.0F, 2.007935F);
      ((Path)localObject4).lineTo(11.0F, 11.023287F);
      ((Path)localObject4).lineTo(4.509916F, 4.533203F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(11.0F, 13.851713F);
      ((Path)localObject4).lineTo(11.0F, 14.870968F);
      ((Path)localObject4).cubicTo(11.0F, 15.452748F, 10.528375F, 15.924374F, 9.946595F, 15.924374F);
      ((Path)localObject4).cubicTo(9.766121F, 15.924374F, 9.588673F, 15.878006F, 9.431269F, 15.789718F);
      ((Path)localObject4).lineTo(4.0F, 12.743319F);
      ((Path)localObject4).lineTo(1.053405F, 12.743319F);
      ((Path)localObject4).cubicTo(0.4716255F, 12.743319F, -2.990477E-014F, 12.271693F, -2.997602E-014F, 11.689914F);
      ((Path)localObject4).lineTo(-3.019807E-014F, 5.944123F);
      ((Path)localObject4).cubicTo(-3.026932E-014F, 5.362343F, 0.4716255F, 4.890718F, 1.053405F, 4.890718F);
      ((Path)localObject4).lineTo(2.039004F, 4.890718F);
      ((Path)localObject4).lineTo(11.0F, 13.851713F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      ((Canvas)localObject1).drawPath((Path)localObject4, localPaint2);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      ((Paint)localObject4).setStrokeWidth(1.87272F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.ROUND);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(14.029777F, 12.4375F);
      ((Path)localObject3).cubicTo(15.813192F, 12.025054F, 17.145054F, 10.392283F, 17.145054F, 8.440882F);
      ((Path)localObject3).cubicTo(17.145054F, 6.478635F, 15.798347F, 4.83857F, 14.0F, 4.4375F);
      ((Canvas)localObject1).drawPath((Path)localObject3, (Paint)localObject4);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, 0.7071068F, -4.878679F, -0.7071068F, 0.7071068F, 11.778175F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(10.778174F, 2.778175F);
      ((Path)localObject2).cubicTo(10.778174F, 2.22589F, 11.225889F, 1.778175F, 11.778174F, 1.778175F);
      ((Path)localObject2).lineTo(11.778174F, 1.778175F);
      ((Path)localObject2).cubicTo(12.33046F, 1.778175F, 12.778174F, 2.22589F, 12.778174F, 2.778175F);
      ((Path)localObject2).lineTo(12.778174F, 20.778175F);
      ((Path)localObject2).cubicTo(12.778174F, 21.33046F, 12.33046F, 21.778175F, 11.778174F, 21.778175F);
      ((Path)localObject2).lineTo(11.778174F, 21.778175F);
      ((Path)localObject2).cubicTo(11.225889F, 21.778175F, 10.778174F, 21.33046F, 10.778174F, 20.778175F);
      ((Path)localObject2).lineTo(10.778174F, 2.778175F);
      ((Path)localObject2).close();
      ((Canvas)localObject1).drawPath((Path)localObject2, localPaint1);
      ((Canvas)localObject1).restore();
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 24.0F);
      ((Path)localObject1).lineTo(0.0F, 24.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 24.0F);
      ((Path)localObject1).lineTo(0.0F, 24.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yv
 * JD-Core Version:    0.6.2
 */