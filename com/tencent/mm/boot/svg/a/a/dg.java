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

public final class dg extends c
{
  private final int height = 96;
  private final int width = 130;

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
        paramInt = 130;
        continue;
        paramInt = 96;
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
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -238.0F, 0.0F, 1.0F, -292.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 238.0F, 0.0F, 1.0F, 292.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(61.0F, 44.0F);
      ((Path)localObject2).lineTo(61.0F, 50.0F);
      ((Path)localObject2).cubicTo(61.0F, 58.22929F, 67.939583F, 65.0F, 77.0F, 65.0F);
      ((Path)localObject2).cubicTo(85.060417F, 65.0F, 92.0F, 58.22929F, 92.0F, 50.0F);
      ((Path)localObject2).lineTo(92.0F, 44.0F);
      ((Path)localObject2).lineTo(94.996758F, 44.0F);
      ((Path)localObject2).cubicTo(95.562012F, 44.0F, 96.0F, 44.450371F, 96.0F, 45.005928F);
      ((Path)localObject2).lineTo(96.0F, 50.25F);
      ((Path)localObject2).cubicTo(96.0F, 60.017532F, 88.365898F, 67.913139F, 79.0F, 68.896767F);
      ((Path)localObject2).lineTo(79.0F, 72.0F);
      ((Path)localObject2).lineTo(91.003685F, 72.0F);
      ((Path)localObject2).cubicTo(91.561775F, 72.0F, 92.0F, 72.451912F, 92.0F, 73.009369F);
      ((Path)localObject2).lineTo(92.0F, 74.990631F);
      ((Path)localObject2).cubicTo(92.0F, 75.556648F, 91.553932F, 76.0F, 91.003685F, 76.0F);
      ((Path)localObject2).lineTo(61.996315F, 76.0F);
      ((Path)localObject2).cubicTo(61.438225F, 76.0F, 61.0F, 75.548088F, 61.0F, 74.990631F);
      ((Path)localObject2).lineTo(61.0F, 73.009369F);
      ((Path)localObject2).cubicTo(61.0F, 72.443352F, 61.446064F, 72.0F, 61.996315F, 72.0F);
      ((Path)localObject2).lineTo(74.0F, 72.0F);
      ((Path)localObject2).lineTo(74.0F, 68.796776F);
      ((Path)localObject2).cubicTo(64.208183F, 67.464806F, 57.0F, 59.741146F, 57.0F, 50.25F);
      ((Path)localObject2).lineTo(57.0F, 44.997505F);
      ((Path)localObject2).cubicTo(57.0F, 44.447468F, 57.449165F, 44.0F, 58.003242F, 44.0F);
      ((Path)localObject2).lineTo(61.0F, 44.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(76.5F, 21.0F);
      ((Path)localObject2).cubicTo(82.300262F, 21.0F, 87.0F, 25.705276F, 87.0F, 31.509529F);
      ((Path)localObject2).lineTo(87.0F, 50.490471F);
      ((Path)localObject2).cubicTo(87.0F, 56.293869F, 82.298988F, 61.0F, 76.5F, 61.0F);
      ((Path)localObject2).cubicTo(70.699738F, 61.0F, 66.0F, 56.294724F, 66.0F, 50.490471F);
      ((Path)localObject2).lineTo(66.0F, 31.509529F);
      ((Path)localObject2).cubicTo(66.0F, 25.706133F, 70.701012F, 21.0F, 76.5F, 21.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dg
 * JD-Core Version:    0.6.2
 */