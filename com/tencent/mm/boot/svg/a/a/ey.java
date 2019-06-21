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

public final class ey extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
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
      localPaint2.setColor(-13882324);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -333.0F, 0.0F, 1.0F, -317.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 333.0F, 0.0F, 1.0F, 317.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(67.0F, 69.0F);
      ((Path)localObject).lineTo(21.0F, 69.0F);
      ((Path)localObject).lineTo(21.0F, 35.0F);
      ((Path)localObject).lineTo(30.521F, 35.0F);
      ((Path)localObject).cubicTo(31.823F, 32.063F, 33.368F, 29.768999F, 35.078999F, 28.0F);
      ((Path)localObject).lineTo(17.0F, 28.0F);
      ((Path)localObject).cubicTo(15.343F, 28.0F, 14.0F, 29.343F, 14.0F, 31.0F);
      ((Path)localObject).lineTo(14.0F, 73.0F);
      ((Path)localObject).cubicTo(14.0F, 74.656998F, 15.343F, 76.0F, 17.0F, 76.0F);
      ((Path)localObject).lineTo(71.0F, 76.0F);
      ((Path)localObject).cubicTo(72.655998F, 76.0F, 74.0F, 74.656998F, 74.0F, 73.0F);
      ((Path)localObject).lineTo(74.0F, 51.220001F);
      ((Path)localObject).lineTo(67.0F, 57.130001F);
      ((Path)localObject).lineTo(67.0F, 69.0F);
      ((Path)localObject).lineTo(67.0F, 69.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(59.0F, 17.0F);
      ((Path)localObject).lineTo(59.0F, 28.018999F);
      ((Path)localObject).cubicTo(57.325001F, 28.007999F, 55.583F, 28.0F, 54.0F, 28.0F);
      ((Path)localObject).cubicTo(40.334F, 28.0F, 31.055F, 41.333F, 31.055F, 59.0F);
      ((Path)localObject).cubicTo(35.721001F, 48.16F, 40.284F, 43.0F, 59.0F, 43.0F);
      ((Path)localObject).lineTo(59.0F, 54.0F);
      ((Path)localObject).lineTo(73.452003F, 41.848F);
      ((Path)localObject).lineTo(74.0F, 42.356998F);
      ((Path)localObject).lineTo(74.0F, 41.386002F);
      ((Path)localObject).lineTo(81.0F, 35.5F);
      ((Path)localObject).lineTo(59.0F, 17.0F);
      ((Path)localObject).lineTo(59.0F, 17.0F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ey
 * JD-Core Version:    0.6.2
 */