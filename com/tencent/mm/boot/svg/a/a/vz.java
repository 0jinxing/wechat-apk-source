package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class vz extends c
{
  private final int height = 48;
  private final int width = 52;

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
        paramInt = 52;
        continue;
        paramInt = 48;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-7503);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(14.181818F, 0.0F);
      ((Path)localObject).cubicTo(7.043382F, 0.0F, 2.027472E-007F, 6.794741F, 0.0F, 19.047619F);
      ((Path)localObject).cubicTo(-2.027472E-007F, 30.949684F, 12.336814F, 43.475533F, 26.0F, 48.0F);
      ((Path)localObject).cubicTo(40.098804F, 43.475533F, 52.0F, 30.618835F, 52.0F, 19.047619F);
      ((Path)localObject).cubicTo(52.0F, 6.463891F, 45.245247F, 1.657497E-007F, 37.81818F, 0.0F);
      ((Path)localObject).cubicTo(31.004267F, -1.487521E-007F, 28.267746F, 2.450739F, 26.0F, 4.761905F);
      ((Path)localObject).cubicTo(23.75256F, 2.450739F, 20.412228F, 0.0F, 14.181818F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(15.702877F, 6.349206F);
      ((Path)localObject).cubicTo(11.534709F, 6.349206F, 6.303031F, 10.766748F, 6.303031F, 18.896448F);
      ((Path)localObject).cubicTo(6.303031F, 27.026146F, 14.82103F, 37.122662F, 26.0F, 40.857143F);
      ((Path)localObject).cubicTo(37.535385F, 37.122662F, 45.696968F, 25.122057F, 45.696968F, 18.896448F);
      ((Path)localObject).cubicTo(45.696968F, 12.670838F, 41.746109F, 6.349206F, 35.669422F, 6.349206F);
      ((Path)localObject).cubicTo(30.0944F, 6.349206F, 27.220886F, 12.0678F, 26.0F, 14.285714F);
      ((Path)localObject).cubicTo(24.840904F, 12.0678F, 19.871044F, 6.349206F, 15.702877F, 6.349206F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vz
 * JD-Core Version:    0.6.2
 */