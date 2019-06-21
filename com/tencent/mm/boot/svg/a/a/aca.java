package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class aca extends c
{
  private final int height = 40;
  private final int width = 40;

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
        paramInt = 40;
        continue;
        paramInt = 40;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 5.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localPaint2.setStrokeWidth(1.875F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(15.0F, 0.0F);
      ((Path)localObject2).cubicTo(23.284271F, 0.0F, 30.0F, 6.715729F, 30.0F, 15.0F);
      ((Path)localObject2).cubicTo(30.0F, 23.284271F, 23.284271F, 30.0F, 15.0F, 30.0F);
      ((Path)localObject2).cubicTo(6.715729F, 30.0F, 0.0F, 23.284271F, 0.0F, 15.0F);
      ((Path)localObject2).cubicTo(0.0F, 6.715729F, 6.715729F, 0.0F, 15.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, -0.7071068F, 14.779029F, 0.7071068F, 0.7071068F, -6.304732F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 13.75F);
      ((Path)localObject1).lineTo(30.0F, 13.75F);
      ((Path)localObject1).lineTo(30.0F, 15.625F);
      ((Path)localObject1).lineTo(0.0F, 15.625F);
      ((Path)localObject1).lineTo(0.0F, 13.75F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aca
 * JD-Core Version:    0.6.2
 */