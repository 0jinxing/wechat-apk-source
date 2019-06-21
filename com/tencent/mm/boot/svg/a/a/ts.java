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

public final class ts extends c
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
      ((Paint)localObject3).setColor(-12632257);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(46.009998F, 0.01F);
      ((Path)localObject2).cubicTo(53.34F, 6.17F, 60.669998F, 12.33F, 68.0F, 18.5F);
      ((Path)localObject2).cubicTo(60.709999F, 24.709999F, 53.330002F, 30.82F, 46.0F, 36.990002F);
      ((Path)localObject2).lineTo(46.0F, 25.98F);
      ((Path)localObject2).cubicTo(38.849998F, 26.16F, 30.92F, 26.379999F, 25.139999F, 31.16F);
      ((Path)localObject2).cubicTo(21.719999F, 33.970001F, 19.85F, 38.099998F, 17.969999F, 41.990002F);
      ((Path)localObject2).cubicTo(18.18F, 31.93F, 21.120001F, 20.860001F, 29.629999F, 14.65F);
      ((Path)localObject2).cubicTo(34.27F, 11.04F, 40.360001F, 10.72F, 45.990002F, 11.02F);
      ((Path)localObject2).cubicTo(46.0F, 7.35F, 45.990002F, 3.68F, 46.009998F, 0.01F);
      ((Path)localObject2).lineTo(46.009998F, 0.01F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1.0F, 14.89F);
      ((Path)localObject3).cubicTo(0.71F, 13.12F, 1.88F, 10.94F, 3.88F, 11.06F);
      ((Path)localObject3).cubicTo(9.91F, 10.89F, 15.95F, 11.07F, 21.98F, 10.99F);
      ((Path)localObject3).cubicTo(20.16F, 13.11F, 18.66F, 15.48F, 17.450001F, 17.99F);
      ((Path)localObject3).cubicTo(14.3F, 18.0F, 11.15F, 18.0F, 8.0F, 18.0F);
      ((Path)localObject3).lineTo(8.0F, 52.0F);
      ((Path)localObject3).lineTo(54.0F, 52.0F);
      ((Path)localObject3).lineTo(54.0F, 40.150002F);
      ((Path)localObject3).cubicTo(56.310001F, 38.169998F, 58.639999F, 36.200001F, 60.990002F, 34.259998F);
      ((Path)localObject3).cubicTo(60.970001F, 41.540001F, 61.080002F, 48.82F, 60.939999F, 56.099998F);
      ((Path)localObject3).cubicTo(61.02F, 58.07F, 58.919998F, 59.330002F, 57.119999F, 58.990002F);
      ((Path)localObject3).cubicTo(39.709999F, 59.0F, 22.309999F, 59.0F, 4.91F, 59.0F);
      ((Path)localObject3).cubicTo(3.11F, 59.32F, 0.93F, 58.099998F, 1.05F, 56.09F);
      ((Path)localObject3).cubicTo(0.93F, 42.360001F, 1.03F, 28.620001F, 1.0F, 14.89F);
      ((Path)localObject3).lineTo(1.0F, 14.89F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ts
 * JD-Core Version:    0.6.2
 */