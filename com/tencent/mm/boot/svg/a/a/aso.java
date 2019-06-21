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

public final class aso extends c
{
  private final int height = 44;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 44;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 217, 4);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-2928046);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(10.666615F, 0.0F);
      ((Path)localObject3).lineTo(12.372898F, 0.0F);
      ((Path)localObject3).cubicTo(20.305622F, 0.02008788F, 25.773712F, 9.732577F, 21.512991F, 16.52228F);
      ((Path)localObject3).cubicTo(17.801077F, 23.834269F, 6.156437F, 23.824224F, 2.464478F, 16.502193F);
      ((Path)localObject3).cubicTo(-1.556764F, 9.973632F, 3.20287F, 0.8738228F, 10.666615F, 0.0F);
      ((Path)localObject3).lineTo(10.666615F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-12537567);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(6.158603F, 2.137319F);
      ((Path)localObject2).cubicTo(12.047705F, -1.00158F, 20.032927F, 2.687126F, 21.580063F, 9.154857F);
      ((Path)localObject2).cubicTo(23.476555F, 15.432654F, 18.695402F, 22.130304F, 12.34715F, 23.0F);
      ((Path)localObject2).lineTo(9.921639F, 23.0F);
      ((Path)localObject2).cubicTo(4.64141F, 22.400211F, 0.359335F, 17.991756F, 0.0F, 12.673622F);
      ((Path)localObject2).lineTo(0.0F, 10.884251F);
      ((Path)localObject2).cubicTo(0.6188548F, 7.23553F, 2.714976F, 3.736758F, 6.158603F, 2.137319F);
      ((Path)localObject2).lineTo(6.158603F, 2.137319F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-2511616);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 25.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.069737F, 12.944695F);
      ((Path)localObject1).cubicTo(0.2700923F, 6.407746F, 6.477336F, 0.2206352F, 13.014434F, 1.080234F);
      ((Path)localObject1).cubicTo(18.142157F, 1.400085F, 22.220346F, 5.75805F, 23.0F, 10.70574F);
      ((Path)localObject1).lineTo(23.0F, 13.044648F);
      ((Path)localObject1).cubicTo(22.440248F, 18.152264F, 18.332073F, 22.260345F, 13.284314F, 23.0F);
      ((Path)localObject1).lineTo(11.015322F, 23.0F);
      ((Path)localObject1).cubicTo(5.877603F, 22.440262F, 1.3796F, 18.192245F, 1.069737F, 12.944695F);
      ((Path)localObject1).lineTo(1.069737F, 12.944695F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aso
 * JD-Core Version:    0.6.2
 */