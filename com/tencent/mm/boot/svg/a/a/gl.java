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

public final class gl extends c
{
  private final int height = 45;
  private final int width = 45;

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
        paramInt = 45;
        continue;
        paramInt = 45;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11048043);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1.5F, 4.5F);
      ((Path)localObject3).cubicTo(1.5F, 2.843146F, 2.843146F, 1.5F, 4.5F, 1.5F);
      ((Path)localObject3).lineTo(40.5F, 1.5F);
      ((Path)localObject3).cubicTo(42.156853F, 1.5F, 43.5F, 2.843146F, 43.5F, 4.5F);
      ((Path)localObject3).lineTo(43.5F, 28.5F);
      ((Path)localObject3).cubicTo(43.5F, 30.156855F, 42.156853F, 31.5F, 40.5F, 31.5F);
      ((Path)localObject3).lineTo(4.5F, 31.5F);
      ((Path)localObject3).cubicTo(2.843146F, 31.5F, 1.5F, 30.156855F, 1.5F, 28.5F);
      ((Path)localObject3).lineTo(1.5F, 4.5F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11048043);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(6.0F, 17.0F);
      ((Path)localObject3).cubicTo(6.0F, 16.447716F, 6.447715F, 16.0F, 7.0F, 16.0F);
      ((Path)localObject3).lineTo(11.0F, 16.0F);
      ((Path)localObject3).cubicTo(11.552285F, 16.0F, 12.0F, 16.447716F, 12.0F, 17.0F);
      ((Path)localObject3).lineTo(12.0F, 21.0F);
      ((Path)localObject3).cubicTo(12.0F, 21.552284F, 11.552285F, 22.0F, 11.0F, 22.0F);
      ((Path)localObject3).lineTo(7.0F, 22.0F);
      ((Path)localObject3).cubicTo(6.447715F, 22.0F, 6.0F, 21.552284F, 6.0F, 21.0F);
      ((Path)localObject3).lineTo(6.0F, 17.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11048043);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(6.0F, 9.0F);
      ((Path)localObject2).lineTo(39.0F, 9.0F);
      ((Path)localObject2).lineTo(39.0F, 12.0F);
      ((Path)localObject2).lineTo(6.0F, 12.0F);
      ((Path)localObject2).lineTo(6.0F, 9.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gl
 * JD-Core Version:    0.6.2
 */