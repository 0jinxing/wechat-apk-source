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

public final class yt extends c
{
  private final int height = 36;
  private final int width = 36;

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
        paramInt = 36;
        continue;
        paramInt = 36;
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -3864.0F, 0.0F, 1.0F, -2672.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3855.0F, 0.0F, 1.0F, 2663.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(42.0F, 12.0F);
      ((Path)localObject).lineTo(42.0F, 24.0F);
      ((Path)localObject).lineTo(45.0F, 24.0F);
      ((Path)localObject).lineTo(45.0F, 10.5F);
      ((Path)localObject).lineTo(45.0F, 9.0F);
      ((Path)localObject).lineTo(30.0F, 9.0F);
      ((Path)localObject).lineTo(30.0F, 12.0F);
      ((Path)localObject).lineTo(42.0F, 12.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 42.0F);
      ((Path)localObject).lineTo(12.0F, 30.0F);
      ((Path)localObject).lineTo(9.0F, 30.0F);
      ((Path)localObject).lineTo(9.0F, 43.5F);
      ((Path)localObject).lineTo(9.0F, 45.0F);
      ((Path)localObject).lineTo(24.0F, 45.0F);
      ((Path)localObject).lineTo(24.0F, 42.0F);
      ((Path)localObject).lineTo(12.0F, 42.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yt
 * JD-Core Version:    0.6.2
 */