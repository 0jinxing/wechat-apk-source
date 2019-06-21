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

public final class oe extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localCanvas.saveLayerAlpha(null, 230, 4);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, -1.0F, 0.0F, 72.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 83.550003F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.217442F, 20.4F);
      ((Path)localObject1).cubicTo(50.099129F, 24.392387F, 52.5F, 29.907822F, 52.5F, 36.0F);
      ((Path)localObject1).cubicTo(52.5F, 42.092178F, 50.099129F, 47.607613F, 46.217442F, 51.599998F);
      ((Path)localObject1).lineTo(42.717262F, 48.0F);
      ((Path)localObject1).cubicTo(45.703175F, 44.928932F, 47.549999F, 40.686291F, 47.549999F, 36.0F);
      ((Path)localObject1).cubicTo(47.549999F, 31.313709F, 45.703175F, 27.071068F, 42.717262F, 24.0F);
      ((Path)localObject1).lineTo(46.217442F, 20.4F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(38.050358F, 28.799999F);
      ((Path)localObject1).cubicTo(39.841904F, 30.642641F, 40.950001F, 33.188225F, 40.950001F, 36.0F);
      ((Path)localObject1).cubicTo(40.950001F, 38.811775F, 39.841904F, 41.357361F, 38.050358F, 43.200001F);
      ((Path)localObject1).lineTo(31.049999F, 36.0F);
      ((Path)localObject1).lineTo(38.050358F, 28.799999F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.oe
 * JD-Core Version:    0.6.2
 */