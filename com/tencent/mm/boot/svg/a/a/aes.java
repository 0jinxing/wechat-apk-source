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

public final class aes extends c
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
      localPaint1.setColor(-12206054);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 21.0F);
      ((Path)localObject2).cubicTo(6.57101F, 9.043519F, 19.245094F, 0.2346748F, 33.0F, 0.0F);
      ((Path)localObject2).cubicTo(47.520351F, -0.535224F, 61.110394F, 8.483593F, 68.0F, 21.0F);
      ((Path)localObject2).cubicTo(61.578331F, 32.60043F, 49.461784F, 41.279293F, 36.0F, 42.0F);
      ((Path)localObject2).cubicTo(21.216398F, 42.959072F, 7.019033F, 33.850266F, 0.0F, 21.0F);
      ((Path)localObject2).lineTo(0.0F, 21.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(30.0F, 10.0F);
      ((Path)localObject2).cubicTo(25.925423F, 10.998532F, 22.441738F, 15.190254F, 22.0F, 20.0F);
      ((Path)localObject2).cubicTo(21.223944F, 26.657608F, 27.203108F, 33.174736F, 34.0F, 33.0F);
      ((Path)localObject2).cubicTo(40.808449F, 33.204678F, 46.767651F, 26.667587F, 46.0F, 20.0F);
      ((Path)localObject2).cubicTo(45.479984F, 12.565438F, 37.35471F, 7.156121F, 30.0F, 10.0F);
      ((Path)localObject2).lineTo(30.0F, 10.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aes
 * JD-Core Version:    0.6.2
 */