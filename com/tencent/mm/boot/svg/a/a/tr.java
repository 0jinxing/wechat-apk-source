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

public final class tr extends c
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
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-10526881);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.009998F, 0.01F);
      ((Path)localObject1).cubicTo(53.34F, 6.17F, 60.669998F, 12.34F, 68.0F, 18.5F);
      ((Path)localObject1).cubicTo(60.709999F, 24.709999F, 53.32F, 30.809999F, 46.009998F, 36.990002F);
      ((Path)localObject1).cubicTo(45.990002F, 33.32F, 46.0F, 29.65F, 46.0F, 25.98F);
      ((Path)localObject1).cubicTo(38.869999F, 26.16F, 30.950001F, 26.379999F, 25.17F, 31.129999F);
      ((Path)localObject1).cubicTo(21.73F, 33.950001F, 19.85F, 38.09F, 17.959999F, 42.0F);
      ((Path)localObject1).cubicTo(18.18F, 31.950001F, 21.110001F, 20.870001F, 29.620001F, 14.66F);
      ((Path)localObject1).cubicTo(34.259998F, 11.04F, 40.360001F, 10.72F, 45.990002F, 11.02F);
      ((Path)localObject1).cubicTo(46.0F, 7.35F, 46.0F, 3.68F, 46.009998F, 0.01F);
      ((Path)localObject1).lineTo(46.009998F, 0.01F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1.01F, 14.82F);
      ((Path)localObject3).cubicTo(0.72F, 13.08F, 1.91F, 10.96F, 3.85F, 11.06F);
      ((Path)localObject3).cubicTo(9.89F, 10.89F, 15.94F, 11.07F, 21.98F, 10.99F);
      ((Path)localObject3).cubicTo(20.17F, 13.11F, 18.65F, 15.46F, 17.459999F, 17.99F);
      ((Path)localObject3).cubicTo(14.31F, 18.0F, 11.15F, 18.0F, 8.0F, 18.0F);
      ((Path)localObject3).lineTo(8.0F, 52.0F);
      ((Path)localObject3).lineTo(54.0F, 52.0F);
      ((Path)localObject3).lineTo(54.0F, 40.150002F);
      ((Path)localObject3).cubicTo(56.32F, 38.16F, 58.66F, 36.189999F, 60.990002F, 34.23F);
      ((Path)localObject3).cubicTo(60.959999F, 41.529999F, 61.09F, 48.830002F, 60.939999F, 56.130001F);
      ((Path)localObject3).cubicTo(61.0F, 58.099998F, 58.889999F, 59.32F, 57.099998F, 59.0F);
      ((Path)localObject3).cubicTo(39.369999F, 58.970001F, 21.629999F, 59.07F, 3.9F, 58.950001F);
      ((Path)localObject3).cubicTo(1.9F, 59.060001F, 0.69F, 56.900002F, 1.01F, 55.110001F);
      ((Path)localObject3).cubicTo(1.0F, 41.68F, 0.99F, 28.25F, 1.01F, 14.82F);
      ((Path)localObject3).lineTo(1.01F, 14.82F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tr
 * JD-Core Version:    0.6.2
 */