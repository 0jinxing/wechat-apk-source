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

public final class aos extends c
{
  private final int height = 180;
  private final int width = 180;

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
        paramInt = 180;
        continue;
        paramInt = 180;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(87.199997F, 0.0F);
      ((Path)localObject).lineTo(92.220001F, 0.0F);
      ((Path)localObject).cubicTo(113.42F, 0.53F, 134.32001F, 8.75F, 150.06F, 22.99F);
      ((Path)localObject).cubicTo(168.44F, 39.279999F, 179.52F, 63.389999F, 180.0F, 87.940002F);
      ((Path)localObject).lineTo(180.0F, 92.07F);
      ((Path)localObject).cubicTo(179.55F, 113.06F, 171.47F, 133.75F, 157.55F, 149.48F);
      ((Path)localObject).cubicTo(141.39F, 167.99001F, 117.4F, 179.25999F, 92.839996F, 180.0F);
      ((Path)localObject).lineTo(87.550003F, 180.0F);
      ((Path)localObject).cubicTo(65.970001F, 179.42F, 44.720001F, 170.82001F, 28.92F, 156.09F);
      ((Path)localObject).cubicTo(11.34F, 140.02F, 0.77F, 116.72F, 0.0F, 92.919998F);
      ((Path)localObject).lineTo(0.0F, 87.360001F);
      ((Path)localObject).cubicTo(0.68F, 63.009998F, 11.7F, 39.150002F, 29.950001F, 22.98F);
      ((Path)localObject).cubicTo(45.540001F, 8.88F, 66.209999F, 0.69F, 87.199997F, 0.0F);
      ((Path)localObject).lineTo(87.199997F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(78.510002F, 6.8F);
      ((Path)localObject).cubicTo(52.119999F, 10.22F, 28.040001F, 27.17F, 15.74F, 50.740002F);
      ((Path)localObject).cubicTo(5.37F, 70.120003F, 3.19F, 93.650002F, 9.69F, 114.64F);
      ((Path)localObject).cubicTo(14.98F, 132.03F, 26.139999F, 147.55F, 40.91F, 158.14999F);
      ((Path)localObject).cubicTo(55.330002F, 168.63F, 73.18F, 174.25F, 91.010002F, 173.98F);
      ((Path)localObject).cubicTo(108.18F, 173.82001F, 125.27F, 168.21001F, 139.16F, 158.10001F);
      ((Path)localObject).cubicTo(153.28F, 147.95F, 164.10001F, 133.28999F, 169.62F, 116.8F);
      ((Path)localObject).cubicTo(176.00999F, 97.919998F, 175.37F, 76.760002F, 167.8F, 58.32F);
      ((Path)localObject).cubicTo(160.56F, 40.439999F, 146.92999F, 25.24F, 129.94F, 16.110001F);
      ((Path)localObject).cubicTo(114.38F, 7.61F, 96.07F, 4.36F, 78.510002F, 6.8F);
      ((Path)localObject).lineTo(78.510002F, 6.8F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(66.0F, 49.0F);
      ((Path)localObject).cubicTo(88.660004F, 62.669998F, 111.34F, 76.330002F, 134.0F, 90.010002F);
      ((Path)localObject).cubicTo(111.33F, 103.67F, 88.660004F, 117.33F, 66.0F, 131.00999F);
      ((Path)localObject).lineTo(66.0F, 49.0F);
      ((Path)localObject).lineTo(66.0F, 49.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aos
 * JD-Core Version:    0.6.2
 */