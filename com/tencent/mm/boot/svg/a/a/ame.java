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

public final class ame extends c
{
  private final int height = 42;
  private final int width = 33;

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
        paramInt = 33;
        continue;
        paramInt = 42;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16036);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, 6.123234E-017F, -1.0F, 37.0F, 1.0F, 6.123234E-017F, 4.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(-4.0F, 13.0F);
      ((Path)localObject).lineTo(6.0F, 13.0F);
      ((Path)localObject).lineTo(17.0F, 5.0F);
      ((Path)localObject).lineTo(20.0F, 5.0F);
      ((Path)localObject).lineTo(20.0F, 36.0F);
      ((Path)localObject).lineTo(17.0F, 36.0F);
      ((Path)localObject).lineTo(6.0F, 28.0F);
      ((Path)localObject).lineTo(-4.0F, 28.0F);
      ((Path)localObject).lineTo(-4.0F, 13.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 19.0F);
      ((Path)localObject).lineTo(37.0F, 19.0F);
      ((Path)localObject).lineTo(37.0F, 22.0F);
      ((Path)localObject).lineTo(27.0F, 22.0F);
      ((Path)localObject).lineTo(27.0F, 19.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 12.0F);
      ((Path)localObject).lineTo(37.0F, 8.0F);
      ((Path)localObject).lineTo(37.0F, 11.0F);
      ((Path)localObject).lineTo(27.0F, 15.0F);
      ((Path)localObject).lineTo(27.0F, 12.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(37.0F, 29.0F);
      ((Path)localObject).lineTo(27.0F, 25.0F);
      ((Path)localObject).lineTo(27.0F, 28.0F);
      ((Path)localObject).lineTo(37.0F, 32.0F);
      ((Path)localObject).lineTo(37.0F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ame
 * JD-Core Version:    0.6.2
 */