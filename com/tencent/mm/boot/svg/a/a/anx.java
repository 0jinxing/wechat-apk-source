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

public final class anx extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 48.0F, 0.0F, 1.0F, 48.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-13421773);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(64.663895F, 28.437271F);
      ((Path)localObject1).cubicTo(62.816101F, 26.772472F, 59.729828F, 26.66011F, 57.775352F, 28.182531F);
      ((Path)localObject1).lineTo(49.720131F, 34.457081F);
      ((Path)localObject1).lineTo(53.791866F, 42.888355F);
      ((Path)localObject1).lineTo(28.658388F, 19.66337F);
      ((Path)localObject1).cubicTo(26.833735F, 17.977272F, 23.881802F, 17.995331F, 22.078856F, 19.690735F);
      ((Path)localObject1).lineTo(0.0F, 40.452621F);
      ((Path)localObject1).lineTo(0.0F, 57.0F);
      ((Path)localObject1).lineTo(78.0F, 57.0F);
      ((Path)localObject1).lineTo(78.0F, 40.452621F);
      ((Path)localObject1).lineTo(64.663895F, 28.437271F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-13421773);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(3.0F, 6.0F);
      ((Path)localObject2).cubicTo(3.0F, 4.343145F, 4.343145F, 3.0F, 6.0F, 3.0F);
      ((Path)localObject2).lineTo(72.0F, 3.0F);
      ((Path)localObject2).cubicTo(73.656853F, 3.0F, 75.0F, 4.343145F, 75.0F, 6.0F);
      ((Path)localObject2).lineTo(75.0F, 54.0F);
      ((Path)localObject2).cubicTo(75.0F, 55.656853F, 73.656853F, 57.0F, 72.0F, 57.0F);
      ((Path)localObject2).lineTo(6.0F, 57.0F);
      ((Path)localObject2).cubicTo(4.343145F, 57.0F, 3.0F, 55.656853F, 3.0F, 54.0F);
      ((Path)localObject2).lineTo(3.0F, 6.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anx
 * JD-Core Version:    0.6.2
 */