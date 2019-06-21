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

public final class yw extends c
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(4.0F, 4.890718F);
      ((Path)localObject2).lineTo(9.341856F, 1.145409F);
      ((Path)localObject2).cubicTo(9.818216F, 0.81142F, 10.475134F, 0.9268357F, 10.809122F, 1.403196F);
      ((Path)localObject2).cubicTo(10.933353F, 1.580385F, 11.0F, 1.791535F, 11.0F, 2.007935F);
      ((Path)localObject2).lineTo(11.0F, 14.870968F);
      ((Path)localObject2).cubicTo(11.0F, 15.452748F, 10.528375F, 15.924374F, 9.946595F, 15.924374F);
      ((Path)localObject2).cubicTo(9.766121F, 15.924374F, 9.588673F, 15.878006F, 9.431269F, 15.789718F);
      ((Path)localObject2).lineTo(4.0F, 12.743319F);
      ((Path)localObject2).lineTo(1.053405F, 12.743319F);
      ((Path)localObject2).cubicTo(0.4716255F, 12.743319F, 2.93292E-016F, 12.271693F, 2.220446E-016F, 11.689914F);
      ((Path)localObject2).lineTo(0.0F, 5.944123F);
      ((Path)localObject2).cubicTo(-7.124744E-017F, 5.362343F, 0.4716255F, 4.890718F, 1.053405F, 4.890718F);
      ((Path)localObject2).lineTo(4.0F, 4.890718F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      ((Canvas)localObject1).drawPath((Path)localObject2, localPaint);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(1.87272F);
      localPaint.setStrokeCap(Paint.Cap.ROUND);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(14.029777F, 12.4375F);
      ((Path)localObject3).cubicTo(15.813192F, 12.025054F, 17.145054F, 10.392283F, 17.145054F, 8.440882F);
      ((Path)localObject3).cubicTo(17.145054F, 6.478635F, 15.798347F, 4.83857F, 14.0F, 4.4375F);
      ((Canvas)localObject1).drawPath((Path)localObject3, localPaint);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).restore();
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yw
 * JD-Core Version:    0.6.2
 */