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

public final class avm extends c
{
  private final int height = 42;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 42;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint1.setColor(-4210753);
      localPaint2.setColor(-4210753);
      localPaint2.setStrokeWidth(0.5F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(20.0F, 40.0F);
      ((Path)localObject2).cubicTo(8.954305F, 40.0F, 0.0F, 31.045694F, 0.0F, 20.0F);
      ((Path)localObject2).cubicTo(0.0F, 8.954305F, 8.954305F, 0.0F, 20.0F, 0.0F);
      ((Path)localObject2).cubicTo(31.045694F, 0.0F, 40.0F, 8.954305F, 40.0F, 20.0F);
      ((Path)localObject2).cubicTo(40.0F, 31.045694F, 31.045694F, 40.0F, 20.0F, 40.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(20.0F, 25.384615F);
      ((Path)localObject2).cubicTo(22.973841F, 25.384615F, 25.384615F, 22.973841F, 25.384615F, 20.0F);
      ((Path)localObject2).cubicTo(25.384615F, 17.026159F, 22.973841F, 14.615385F, 20.0F, 14.615385F);
      ((Path)localObject2).cubicTo(17.026159F, 14.615385F, 14.615385F, 17.026159F, 14.615385F, 20.0F);
      ((Path)localObject2).cubicTo(14.615385F, 22.973841F, 17.026159F, 25.384615F, 20.0F, 25.384615F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2.841629F, 13.025641F);
      ((Path)localObject2).lineTo(20.217196F, 13.025641F);
      ((Path)localObject2).lineTo(11.095022F, 3.710407F);
      ((Path)localObject2).cubicTo(7.441189F, 5.695587F, 4.490405F, 8.919444F, 2.841629F, 13.025641F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(19.806938F, 1.538462F);
      ((Path)localObject2).cubicTo(17.431908F, 1.538462F, 15.042355F, 2.023019F, 12.856712F, 2.841629F);
      ((Path)localObject2).lineTo(25.333334F, 15.438914F);
      ((Path)localObject2).lineTo(25.333334F, 2.40724F);
      ((Path)localObject2).cubicTo(23.708561F, 1.823518F, 21.855545F, 1.538462F, 19.806938F, 1.538462F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1.538462F, 20.217196F);
      ((Path)localObject2).cubicTo(1.538462F, 22.586182F, 2.025362F, 24.979147F, 2.846154F, 27.167421F);
      ((Path)localObject2).lineTo(15.48718F, 14.666667F);
      ((Path)localObject2).lineTo(2.410256F, 14.666667F);
      ((Path)localObject2).cubicTo(1.822942F, 16.312695F, 1.538462F, 18.162403F, 1.538462F, 20.217196F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(13.025641F, 37.158371F);
      ((Path)localObject2).lineTo(13.025641F, 19.782804F);
      ((Path)localObject2).lineTo(3.710407F, 28.904978F);
      ((Path)localObject2).cubicTo(5.695056F, 32.564972F, 8.915772F, 35.512318F, 13.025641F, 37.158371F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(20.217196F, 38.46154F);
      ((Path)localObject2).cubicTo(22.583342F, 38.46154F, 24.977779F, 37.973999F, 27.167421F, 37.158371F);
      ((Path)localObject2).lineTo(14.666667F, 24.561087F);
      ((Path)localObject2).lineTo(14.666667F, 37.592762F);
      ((Path)localObject2).cubicTo(16.31146F, 38.177578F, 18.159653F, 38.46154F, 20.217196F, 38.46154F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(37.158371F, 26.923077F);
      ((Path)localObject2).lineTo(19.782804F, 26.923077F);
      ((Path)localObject2).lineTo(28.904978F, 36.289593F);
      ((Path)localObject2).cubicTo(32.564789F, 34.306225F, 35.511238F, 31.088493F, 37.158371F, 26.923077F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(38.46154F, 20.217196F);
      ((Path)localObject2).cubicTo(38.46154F, 17.845076F, 37.973F, 15.454035F, 37.153847F, 13.266969F);
      ((Path)localObject2).lineTo(24.512821F, 25.384615F);
      ((Path)localObject2).lineTo(37.589745F, 25.384615F);
      ((Path)localObject2).cubicTo(38.175034F, 24.120005F, 38.46154F, 22.268494F, 38.46154F, 20.217196F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(26.97436F, 3.251885F);
      ((Path)localObject2).lineTo(26.97436F, 20.627451F);
      ((Path)localObject2).lineTo(36.289593F, 11.505279F);
      ((Path)localObject2).cubicTo(34.305107F, 7.851749F, 31.083288F, 4.901771F, 26.97436F, 3.251885F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avm
 * JD-Core Version:    0.6.2
 */