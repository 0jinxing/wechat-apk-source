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

public final class as extends c
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
      ((Paint)localObject2).setColor(-5066062);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -54.0F, 0.0F, 1.0F, -710.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 254.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 432.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(34.0F, 34.0F);
      ((Path)localObject2).lineTo(26.004946F, 34.0F);
      ((Path)localObject2).cubicTo(24.897026F, 34.0F, 24.0F, 34.895432F, 24.0F, 36.0F);
      ((Path)localObject2).cubicTo(24.0F, 37.11227F, 24.897646F, 38.0F, 26.004946F, 38.0F);
      ((Path)localObject2).lineTo(34.0F, 38.0F);
      ((Path)localObject2).lineTo(34.0F, 45.995052F);
      ((Path)localObject2).cubicTo(34.0F, 47.102974F, 34.895432F, 48.0F, 36.0F, 48.0F);
      ((Path)localObject2).cubicTo(37.11227F, 48.0F, 38.0F, 47.102356F, 38.0F, 45.995052F);
      ((Path)localObject2).lineTo(38.0F, 38.0F);
      ((Path)localObject2).lineTo(45.995052F, 38.0F);
      ((Path)localObject2).cubicTo(47.102974F, 38.0F, 48.0F, 37.104568F, 48.0F, 36.0F);
      ((Path)localObject2).cubicTo(48.0F, 34.88773F, 47.102356F, 34.0F, 45.995052F, 34.0F);
      ((Path)localObject2).lineTo(38.0F, 34.0F);
      ((Path)localObject2).lineTo(38.0F, 26.004946F);
      ((Path)localObject2).cubicTo(38.0F, 24.897026F, 37.104568F, 24.0F, 36.0F, 24.0F);
      ((Path)localObject2).cubicTo(34.88773F, 24.0F, 34.0F, 24.897646F, 34.0F, 26.004946F);
      ((Path)localObject2).lineTo(34.0F, 34.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.as
 * JD-Core Version:    0.6.2
 */