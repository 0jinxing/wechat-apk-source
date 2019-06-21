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

public final class agg extends c
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
      localPaint1.setColor(-6710887);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(32.150002F, 1.21F);
      ((Path)localObject1).cubicTo(35.310001F, 0.04F, 39.400002F, 2.29F, 38.970001F, 5.93F);
      ((Path)localObject1).cubicTo(38.98F, 15.62F, 39.110001F, 25.32F, 38.91F, 35.009998F);
      ((Path)localObject1).cubicTo(38.66F, 40.349998F, 29.360001F, 40.369999F, 29.1F, 35.029999F);
      ((Path)localObject1).cubicTo(28.84F, 25.66F, 29.08F, 16.280001F, 28.99F, 6.91F);
      ((Path)localObject1).cubicTo(28.75F, 4.59F, 29.67F, 1.89F, 32.150002F, 1.21F);
      ((Path)localObject1).lineTo(32.150002F, 1.21F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(10.5F, 14.5F);
      ((Path)localObject1).cubicTo(13.31F, 12.04F, 18.200001F, 14.27F, 18.4F, 17.950001F);
      ((Path)localObject1).cubicTo(18.76F, 20.52F, 16.549999F, 22.299999F, 15.2F, 24.190001F);
      ((Path)localObject1).cubicTo(10.43F, 29.93F, 8.89F, 38.040001F, 10.82F, 45.200001F);
      ((Path)localObject1).cubicTo(12.8F, 52.84F, 18.84F, 59.259998F, 26.33F, 61.740002F);
      ((Path)localObject1).cubicTo(34.52F, 64.550003F, 44.169998F, 62.52F, 50.419998F, 56.490002F);
      ((Path)localObject1).cubicTo(56.650002F, 50.759998F, 59.369999F, 41.619999F, 57.34F, 33.41F);
      ((Path)localObject1).cubicTo(56.41F, 29.040001F, 53.919998F, 25.26F, 50.990002F, 21.969999F);
      ((Path)localObject1).cubicTo(49.540001F, 20.48F, 48.990002F, 18.129999F, 50.02F, 16.26F);
      ((Path)localObject1).cubicTo(51.349998F, 13.27F, 55.790001F, 12.49F, 57.98F, 14.96F);
      ((Path)localObject1).cubicTo(66.339996F, 23.07F, 69.849998F, 35.709999F, 67.040001F, 47.0F);
      ((Path)localObject1).cubicTo(63.740002F, 61.509998F, 49.98F, 72.800003F, 35.060001F, 72.949997F);
      ((Path)localObject1).cubicTo(20.809999F, 73.68F, 6.93F, 64.230003F, 2.13F, 50.830002F);
      ((Path)localObject1).cubicTo(-2.61F, 38.490002F, 0.77F, 23.49F, 10.5F, 14.5F);
      ((Path)localObject1).lineTo(10.5F, 14.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.agg
 * JD-Core Version:    0.6.2
 */