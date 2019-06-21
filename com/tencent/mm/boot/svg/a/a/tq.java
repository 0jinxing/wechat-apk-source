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

public final class tq extends c
{
  private final int height = 84;
  private final int width = 84;

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
        paramInt = 84;
        continue;
        paramInt = 84;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-5460820);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.009998F, 0.02F);
      ((Path)localObject1).cubicTo(53.349998F, 6.17F, 60.669998F, 12.34F, 68.0F, 18.5F);
      ((Path)localObject1).cubicTo(60.700001F, 24.700001F, 53.34F, 30.82F, 46.009998F, 36.98F);
      ((Path)localObject1).cubicTo(45.990002F, 33.310001F, 46.0F, 29.65F, 46.0F, 25.98F);
      ((Path)localObject1).cubicTo(39.099998F, 26.16F, 31.549999F, 26.35F, 25.780001F, 30.639999F);
      ((Path)localObject1).cubicTo(21.98F, 33.450001F, 19.950001F, 37.860001F, 17.969999F, 42.0F);
      ((Path)localObject1).cubicTo(18.18F, 31.950001F, 21.110001F, 20.879999F, 29.610001F, 14.67F);
      ((Path)localObject1).cubicTo(34.25F, 11.05F, 40.349998F, 10.71F, 46.0F, 11.03F);
      ((Path)localObject1).cubicTo(46.0F, 7.36F, 45.990002F, 3.69F, 46.009998F, 0.02F);
      ((Path)localObject1).lineTo(46.009998F, 0.02F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1.0F, 14.9F);
      ((Path)localObject3).cubicTo(0.7F, 13.12F, 1.87F, 10.94F, 3.88F, 11.05F);
      ((Path)localObject3).cubicTo(9.91F, 10.9F, 15.95F, 11.07F, 21.98F, 10.99F);
      ((Path)localObject3).cubicTo(20.17F, 13.1F, 18.65F, 15.45F, 17.469999F, 17.98F);
      ((Path)localObject3).cubicTo(14.32F, 18.01F, 11.16F, 18.0F, 8.0F, 18.0F);
      ((Path)localObject3).lineTo(8.0F, 52.0F);
      ((Path)localObject3).lineTo(54.0F, 52.0F);
      ((Path)localObject3).lineTo(54.0F, 40.150002F);
      ((Path)localObject3).cubicTo(56.32F, 38.16F, 58.650002F, 36.200001F, 60.990002F, 34.240002F);
      ((Path)localObject3).cubicTo(60.959999F, 41.529999F, 61.080002F, 48.82F, 60.950001F, 56.099998F);
      ((Path)localObject3).cubicTo(61.009998F, 58.07F, 58.919998F, 59.330002F, 57.119999F, 59.0F);
      ((Path)localObject3).cubicTo(39.380001F, 58.970001F, 21.620001F, 59.07F, 3.88F, 58.950001F);
      ((Path)localObject3).cubicTo(1.87F, 59.049999F, 0.69F, 56.860001F, 1.0F, 55.07F);
      ((Path)localObject3).lineTo(1.0F, 14.9F);
      ((Path)localObject3).lineTo(1.0F, 14.9F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tq
 * JD-Core Version:    0.6.2
 */