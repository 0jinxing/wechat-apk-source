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

public final class aio extends c
{
  private final int height = 75;
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
        paramInt = 75;
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -482.0F, 0.0F, 1.0F, -537.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 482.0F, 0.0F, 1.0F, 537.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(29.0F, 26.032377F);
      ((Path)localObject1).lineTo(4.202622F, 1.234999F);
      ((Path)localObject1).cubicTo(3.240851F, 0.273229F, 1.691369F, 0.2762538F, 0.7338114F, 1.233811F);
      ((Path)localObject1).cubicTo(-0.2304221F, 2.198045F, -0.2232146F, 3.744408F, 0.7349988F, 4.702622F);
      ((Path)localObject1).lineTo(25.532377F, 29.5F);
      ((Path)localObject1).lineTo(5.754876F, 29.5F);
      ((Path)localObject1).cubicTo(4.498154F, 29.5F, 3.5F, 30.507359F, 3.5F, 31.75F);
      ((Path)localObject1).cubicTo(3.5F, 33.001305F, 4.509543F, 34.0F, 5.754876F, 34.0F);
      ((Path)localObject1).lineTo(31.245125F, 34.0F);
      ((Path)localObject1).cubicTo(31.245937F, 34.0F, 31.24675F, 34.0F, 31.247562F, 34.0F);
      ((Path)localObject1).cubicTo(31.248375F, 34.0F, 31.249187F, 34.0F, 31.25F, 34.0F);
      ((Path)localObject1).cubicTo(31.874836F, 34.0F, 32.436684F, 33.748272F, 32.842648F, 33.34116F);
      ((Path)localObject1).cubicTo(33.251106F, 32.932365F, 33.5F, 32.370518F, 33.5F, 31.75F);
      ((Path)localObject1).cubicTo(33.5F, 31.749187F, 33.5F, 31.748375F, 33.5F, 31.747562F);
      ((Path)localObject1).cubicTo(33.5F, 31.74675F, 33.5F, 31.745937F, 33.5F, 31.745125F);
      ((Path)localObject1).lineTo(33.5F, 6.254876F);
      ((Path)localObject1).cubicTo(33.5F, 4.998154F, 32.492641F, 4.0F, 31.25F, 4.0F);
      ((Path)localObject1).cubicTo(29.998695F, 4.0F, 29.0F, 5.009543F, 29.0F, 6.254876F);
      ((Path)localObject1).lineTo(29.0F, 26.032377F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(44.0F, 49.468422F);
      ((Path)localObject1).lineTo(67.828835F, 73.297256F);
      ((Path)localObject1).cubicTo(68.790787F, 74.259209F, 70.340591F, 74.256149F, 71.29837F, 73.29837F);
      ((Path)localObject1).cubicTo(72.262825F, 72.333916F, 72.255653F, 70.787224F, 71.297256F, 69.828835F);
      ((Path)localObject1).lineTo(47.468422F, 46.0F);
      ((Path)localObject1).lineTo(67.245125F, 46.0F);
      ((Path)localObject1).cubicTo(68.501846F, 46.0F, 69.5F, 44.992641F, 69.5F, 43.75F);
      ((Path)localObject1).cubicTo(69.5F, 42.498695F, 68.490456F, 41.5F, 67.245125F, 41.5F);
      ((Path)localObject1).lineTo(41.754875F, 41.5F);
      ((Path)localObject1).cubicTo(41.754063F, 41.5F, 41.75325F, 41.5F, 41.752438F, 41.5F);
      ((Path)localObject1).cubicTo(41.751625F, 41.5F, 41.750813F, 41.5F, 41.75F, 41.5F);
      ((Path)localObject1).cubicTo(41.129482F, 41.5F, 40.567635F, 41.748894F, 40.160591F, 42.154591F);
      ((Path)localObject1).cubicTo(39.748894F, 42.567635F, 39.5F, 43.129482F, 39.5F, 43.75F);
      ((Path)localObject1).cubicTo(39.5F, 43.750813F, 39.5F, 43.751625F, 39.5F, 43.752438F);
      ((Path)localObject1).cubicTo(39.5F, 43.75325F, 39.5F, 43.754063F, 39.5F, 43.754875F);
      ((Path)localObject1).lineTo(39.5F, 69.245125F);
      ((Path)localObject1).cubicTo(39.5F, 70.490456F, 40.498695F, 71.5F, 41.75F, 71.5F);
      ((Path)localObject1).cubicTo(42.992641F, 71.5F, 44.0F, 70.501846F, 44.0F, 69.245125F);
      ((Path)localObject1).lineTo(44.0F, 49.468422F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aio
 * JD-Core Version:    0.6.2
 */