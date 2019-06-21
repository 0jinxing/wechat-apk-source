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

public final class db extends c
{
  private final int height = 61;
  private final int width = 68;

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
        paramInt = 68;
        continue;
        paramInt = 61;
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
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -296.0F, 0.0F, 1.0F, -485.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 295.0F, 0.0F, 1.0F, 485.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(53.0F, 31.0F);
      ((Path)localObject2).lineTo(59.0F, 31.0F);
      ((Path)localObject2).lineTo(38.0F, 9.956522F);
      ((Path)localObject2).lineTo(36.0F, 8.043478F);
      ((Path)localObject2).lineTo(12.0F, 31.0F);
      ((Path)localObject2).lineTo(17.0F, 31.0F);
      ((Path)localObject2).lineTo(17.0F, 55.04348F);
      ((Path)localObject2).lineTo(53.0F, 55.04348F);
      ((Path)localObject2).lineTo(53.0F, 31.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(59.0F, 37.0F);
      ((Path)localObject2).lineTo(59.0F, 59.001785F);
      ((Path)localObject2).cubicTo(59.0F, 60.10537F, 58.105061F, 61.0F, 56.998611F, 61.0F);
      ((Path)localObject2).lineTo(13.00139F, 61.0F);
      ((Path)localObject2).cubicTo(11.896052F, 61.0F, 11.0F, 60.105663F, 11.0F, 59.001785F);
      ((Path)localObject2).lineTo(11.0F, 37.0F);
      ((Path)localObject2).lineTo(3.993048F, 37.0F);
      ((Path)localObject2).cubicTo(0.683179F, 37.0F, -0.102573F, 35.102573F, 2.248472F, 32.75153F);
      ((Path)localObject2).lineTo(33.17487F, 1.825131F);
      ((Path)localObject2).cubicTo(34.735146F, 0.2648543F, 37.228786F, 0.297053F, 38.750225F, 1.903014F);
      ((Path)localObject2).lineTo(67.870346F, 32.640915F);
      ((Path)localObject2).cubicTo(70.151093F, 35.04837F, 69.322586F, 37.0F, 66.00695F, 37.0F);
      ((Path)localObject2).lineTo(59.0F, 37.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(40.0F, 42.0F);
      ((Path)localObject1).lineTo(40.0F, 58.0F);
      ((Path)localObject1).lineTo(30.0F, 58.0F);
      ((Path)localObject1).lineTo(30.0F, 42.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.db
 * JD-Core Version:    0.6.2
 */