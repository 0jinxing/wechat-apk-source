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

public final class df extends c
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
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -238.0F, 0.0F, 1.0F, -408.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 238.0F, 0.0F, 1.0F, 408.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(85.0F, 62.0F);
      ((Path)localObject).lineTo(85.0F, 35.0F);
      ((Path)localObject).cubicTo(85.0F, 33.81324F, 84.190865F, 33.0F, 83.0F, 33.0F);
      ((Path)localObject).lineTo(49.0F, 33.0F);
      ((Path)localObject).cubicTo(47.811264F, 33.0F, 47.0F, 33.816391F, 47.0F, 35.0F);
      ((Path)localObject).lineTo(47.0F, 62.0F);
      ((Path)localObject).cubicTo(47.0F, 63.18676F, 47.809135F, 64.0F, 49.0F, 64.0F);
      ((Path)localObject).lineTo(83.0F, 64.0F);
      ((Path)localObject).cubicTo(84.188736F, 64.0F, 85.0F, 63.183609F, 85.0F, 62.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(89.0F, 43.0F);
      ((Path)localObject).cubicTo(93.409462F, 38.830269F, 99.615555F, 32.798397F, 100.0F, 32.0F);
      ((Path)localObject).cubicTo(101.65531F, 31.724306F, 103.0F, 32.390232F, 103.0F, 34.0F);
      ((Path)localObject).lineTo(103.0F, 63.0F);
      ((Path)localObject).cubicTo(103.0F, 64.420937F, 101.78401F, 65.347443F, 100.0F, 65.0F);
      ((Path)localObject).cubicTo(99.861565F, 64.306137F, 93.516998F, 58.096001F, 89.0F, 53.0F);
      ((Path)localObject).lineTo(89.0F, 43.0F);
      ((Path)localObject).lineTo(89.0F, 43.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.df
 * JD-Core Version:    0.6.2
 */