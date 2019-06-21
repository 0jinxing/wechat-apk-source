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

public final class asr extends c
{
  private final int height = 222;
  private final int width = 222;

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
        paramInt = 222;
        continue;
        paramInt = 222;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-8806);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(108.41F, 0.0F);
      ((Path)localObject3).lineTo(113.56F, 0.0F);
      ((Path)localObject3).cubicTo(139.19F, 0.58F, 164.5F, 10.31F, 183.78F, 27.219999F);
      ((Path)localObject3).cubicTo(206.99001F, 47.150002F, 221.11F, 77.019997F, 222.0F, 107.59F);
      ((Path)localObject3).lineTo(222.0F, 111.72F);
      ((Path)localObject3).cubicTo(221.92F, 139.39999F, 210.98F, 166.83F, 191.95F, 186.92F);
      ((Path)localObject3).cubicTo(171.7F, 208.74001F, 142.35001F, 221.7F, 112.58F, 222.0F);
      ((Path)localObject3).lineTo(107.9F, 222.0F);
      ((Path)localObject3).cubicTo(79.150002F, 221.23F, 50.91F, 208.82001F, 31.059999F, 187.98F);
      ((Path)localObject3).cubicTo(12.03F, 168.42999F, 0.85F, 141.66F, 0.0F, 114.41F);
      ((Path)localObject3).lineTo(0.0F, 107.69F);
      ((Path)localObject3).cubicTo(0.84F, 79.230003F, 13.02F, 51.32F, 33.52F, 31.540001F);
      ((Path)localObject3).cubicTo(53.310001F, 12.06F, 80.650002F, 0.61F, 108.41F, 0.0F);
      ((Path)localObject3).lineTo(108.41F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(166.8F, 67.650002F);
      ((Path)localObject3).cubicTo(141.14F, 93.129997F, 115.55F, 118.68F, 89.879997F, 144.14999F);
      ((Path)localObject3).cubicTo(78.410004F, 132.89F, 67.139999F, 121.42F, 55.639999F, 110.2F);
      ((Path)localObject3).cubicTo(53.080002F, 107.82F, 50.360001F, 110.96F, 48.689999F, 112.83F);
      ((Path)localObject3).cubicTo(47.23F, 114.01F, 46.740002F, 116.38F, 48.25F, 117.73F);
      ((Path)localObject3).cubicTo(61.049999F, 130.61F, 73.989998F, 143.36F, 86.839996F, 156.19F);
      ((Path)localObject3).cubicTo(88.389999F, 158.28F, 91.57F, 158.14F, 93.050003F, 156.06F);
      ((Path)localObject3).cubicTo(120.26F, 128.91F, 147.60001F, 101.88F, 174.75F, 74.68F);
      ((Path)localObject3).cubicTo(177.24001F, 72.190002F, 174.13F, 69.370003F, 172.24001F, 67.730003F);
      ((Path)localObject3).cubicTo(170.89F, 65.970001F, 168.16F, 65.839996F, 166.8F, 67.650002F);
      ((Path)localObject3).lineTo(166.8F, 67.650002F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1940159);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 47.0F, 0.0F, 1.0F, 66.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(119.8F, 1.65F);
      ((Path)localObject1).cubicTo(121.16F, -0.16F, 123.89F, -0.03F, 125.24F, 1.73F);
      ((Path)localObject1).cubicTo(127.13F, 3.37F, 130.24001F, 6.19F, 127.75F, 8.68F);
      ((Path)localObject1).cubicTo(100.6F, 35.880001F, 73.260002F, 62.91F, 46.049999F, 90.059998F);
      ((Path)localObject1).cubicTo(44.57F, 92.139999F, 41.389999F, 92.279999F, 39.84F, 90.190002F);
      ((Path)localObject1).cubicTo(26.99F, 77.360001F, 14.05F, 64.610001F, 1.25F, 51.73F);
      ((Path)localObject1).cubicTo(-0.26F, 50.380001F, 0.23F, 48.009998F, 1.69F, 46.830002F);
      ((Path)localObject1).cubicTo(3.36F, 44.959999F, 6.08F, 41.82F, 8.64F, 44.200001F);
      ((Path)localObject1).cubicTo(20.139999F, 55.419998F, 31.41F, 66.889999F, 42.880001F, 78.150002F);
      ((Path)localObject1).cubicTo(68.550003F, 52.68F, 94.139999F, 27.129999F, 119.8F, 1.65F);
      ((Path)localObject1).lineTo(119.8F, 1.65F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.asr
 * JD-Core Version:    0.6.2
 */