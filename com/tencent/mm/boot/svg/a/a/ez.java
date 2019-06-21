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

public final class ez extends c
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
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -211.0F, 0.0F, 1.0F, -317.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 211.0F, 0.0F, 1.0F, 317.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(67.0F, 69.0F);
      ((Path)localObject2).lineTo(21.0F, 69.0F);
      ((Path)localObject2).lineTo(21.0F, 35.0F);
      ((Path)localObject2).lineTo(30.521F, 35.0F);
      ((Path)localObject2).cubicTo(31.823F, 32.063F, 33.368F, 29.768999F, 35.078999F, 28.0F);
      ((Path)localObject2).lineTo(17.0F, 28.0F);
      ((Path)localObject2).cubicTo(15.343F, 28.0F, 14.0F, 29.343F, 14.0F, 31.0F);
      ((Path)localObject2).lineTo(14.0F, 73.0F);
      ((Path)localObject2).cubicTo(14.0F, 74.656998F, 15.343F, 76.0F, 17.0F, 76.0F);
      ((Path)localObject2).lineTo(71.0F, 76.0F);
      ((Path)localObject2).cubicTo(72.655998F, 76.0F, 74.0F, 74.656998F, 74.0F, 73.0F);
      ((Path)localObject2).lineTo(74.0F, 51.220001F);
      ((Path)localObject2).lineTo(67.0F, 57.130001F);
      ((Path)localObject2).lineTo(67.0F, 69.0F);
      ((Path)localObject2).lineTo(67.0F, 69.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(59.0F, 17.0F);
      ((Path)localObject2).lineTo(59.0F, 28.018999F);
      ((Path)localObject2).cubicTo(57.325001F, 28.007999F, 55.583F, 28.0F, 54.0F, 28.0F);
      ((Path)localObject2).cubicTo(40.334F, 28.0F, 31.055F, 41.333F, 31.055F, 59.0F);
      ((Path)localObject2).cubicTo(35.721001F, 48.16F, 40.284F, 43.0F, 59.0F, 43.0F);
      ((Path)localObject2).lineTo(59.0F, 54.0F);
      ((Path)localObject2).lineTo(73.452003F, 41.848F);
      ((Path)localObject2).lineTo(74.0F, 42.356998F);
      ((Path)localObject2).lineTo(74.0F, 41.386002F);
      ((Path)localObject2).lineTo(81.0F, 35.5F);
      ((Path)localObject2).lineTo(59.0F, 17.0F);
      ((Path)localObject2).lineTo(59.0F, 17.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ez
 * JD-Core Version:    0.6.2
 */