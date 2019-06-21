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

public final class avb extends c
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.307692F, 0.0F, 1.0F, 2.076923F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4210753);
      ((Paint)localObject1).setStrokeWidth(2.3F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 1.648806F);
      ((Path)localObject2).cubicTo(0.0F, 0.7381957F, 0.7381957F, 0.0F, 1.648806F, 0.0F);
      ((Path)localObject2).lineTo(30.658888F, 0.0F);
      ((Path)localObject2).cubicTo(31.569498F, 0.0F, 32.307693F, 0.7381957F, 32.307693F, 1.648806F);
      ((Path)localObject2).lineTo(32.307693F, 36.351192F);
      ((Path)localObject2).cubicTo(32.307693F, 37.261803F, 31.569498F, 38.0F, 30.658888F, 38.0F);
      ((Path)localObject2).lineTo(1.648806F, 38.0F);
      ((Path)localObject2).cubicTo(0.7381957F, 38.0F, 0.0F, 37.261803F, 0.0F, 36.351192F);
      ((Path)localObject2).lineTo(0.0F, 1.648806F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4737097);
      ((Paint)localObject2).setColor(-4737097);
      ((Paint)localObject2).setStrokeWidth(0.6F);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(4.038462F, 14.942307F);
      ((Path)localObject4).lineTo(21.0F, 14.942307F);
      ((Path)localObject4).lineTo(21.0F, 16.602564F);
      ((Path)localObject4).lineTo(4.038462F, 16.602564F);
      ((Path)localObject4).lineTo(4.038462F, 14.942307F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-4737097);
      ((Paint)localObject2).setColor(-4737097);
      ((Paint)localObject2).setStrokeWidth(0.6F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.038462F, 19.923077F);
      ((Path)localObject1).lineTo(12.923077F, 19.923077F);
      ((Path)localObject1).lineTo(12.923077F, 21.583332F);
      ((Path)localObject1).lineTo(4.038462F, 21.583332F);
      ((Path)localObject1).lineTo(4.038462F, 19.923077F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject4);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4737097);
      ((Paint)localObject2).setColor(-4737097);
      ((Paint)localObject2).setStrokeWidth(0.6F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(4.038462F, 24.903847F);
      ((Path)localObject3).lineTo(14.538462F, 24.903847F);
      ((Path)localObject3).lineTo(14.538462F, 26.564102F);
      ((Path)localObject3).lineTo(4.038462F, 26.564102F);
      ((Path)localObject3).lineTo(4.038462F, 24.903847F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-4737097);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(6.369543F, 6.0F);
      ((Path)localObject3).cubicTo(7.656963F, 6.0F, 8.700624F, 7.072651F, 8.700624F, 8.395833F);
      ((Path)localObject3).cubicTo(8.700624F, 9.719015F, 7.656963F, 10.791666F, 6.369543F, 10.791666F);
      ((Path)localObject3).cubicTo(5.082122F, 10.791666F, 4.038462F, 9.719015F, 4.038462F, 8.395833F);
      ((Path)localObject3).cubicTo(4.038462F, 7.072651F, 5.082122F, 6.0F, 6.369543F, 6.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avb
 * JD-Core Version:    0.6.2
 */