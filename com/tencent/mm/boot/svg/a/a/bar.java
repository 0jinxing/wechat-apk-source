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

public final class bar extends c
{
  private final int height = 114;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 114;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(31.299999F, 6.11F);
      localPath.cubicTo(44.619999F, 0.43F, 59.82F, -1.95F, 73.980003F, 1.96F);
      localPath.cubicTo(85.050003F, 4.16F, 95.230003F, 9.86F, 103.34F, 17.639999F);
      localPath.cubicTo(105.35F, 19.709999F, 107.31F, 21.959999F, 108.27F, 24.73F);
      localPath.cubicTo(111.19F, 26.969999F, 112.68F, 30.469999F, 114.14F, 33.73F);
      localPath.cubicTo(116.27F, 39.25F, 117.71F, 45.09F, 117.98F, 51.009998F);
      localPath.cubicTo(118.1F, 66.309998F, 110.63F, 81.330002F, 98.540001F, 90.669998F);
      localPath.cubicTo(82.940002F, 102.73F, 61.470001F, 107.08F, 42.459999F, 101.71F);
      localPath.cubicTo(37.889999F, 104.36F, 33.57F, 107.93F, 28.209999F, 108.79F);
      localPath.cubicTo(23.18F, 109.03F, 17.530001F, 106.08F, 16.440001F, 100.83F);
      localPath.cubicTo(14.89F, 96.949997F, 16.66F, 92.980003F, 17.629999F, 89.199997F);
      localPath.cubicTo(6.39F, 79.519997F, -0.43F, 64.82F, 0.06F, 49.939999F);
      localPath.cubicTo(0.93F, 40.349998F, 3.95F, 30.68F, 10.07F, 23.110001F);
      localPath.cubicTo(15.38F, 15.59F, 23.16F, 10.19F, 31.299999F, 6.11F);
      localPath.lineTo(31.299999F, 6.11F);
      localPath.close();
      localPath.moveTo(23.799999F, 22.799999F);
      localPath.cubicTo(15.5F, 30.110001F, 9.91F, 40.790001F, 10.01F, 51.990002F);
      localPath.cubicTo(9.91F, 63.91F, 16.18F, 75.300003F, 25.440001F, 82.589996F);
      localPath.cubicTo(26.709999F, 83.709999F, 28.700001F, 84.870003F, 28.23F, 86.889999F);
      localPath.cubicTo(27.620001F, 90.620003F, 26.08F, 94.160004F, 25.66F, 97.93F);
      localPath.cubicTo(26.02F, 98.220001F, 26.73F, 98.790001F, 27.09F, 99.080002F);
      localPath.cubicTo(31.690001F, 97.160004F, 35.599998F, 93.860001F, 40.139999F, 91.800003F);
      localPath.cubicTo(41.610001F, 91.150002F, 43.189999F, 91.919998F, 44.66F, 92.18F);
      localPath.cubicTo(59.349998F, 96.099998F, 75.760002F, 93.849998F, 88.57F, 85.540001F);
      localPath.cubicTo(97.910004F, 79.529999F, 105.25F, 69.959999F, 107.33F, 58.919998F);
      localPath.cubicTo(109.16F, 49.91F, 107.17F, 40.380001F, 102.45F, 32.549999F);
      localPath.cubicTo(83.809998F, 43.599998F, 65.190002F, 54.689999F, 46.549999F, 65.760002F);
      localPath.cubicTo(44.970001F, 67.150002F, 42.130001F, 66.900002F, 41.310001F, 64.790001F);
      localPath.cubicTo(38.220001F, 58.02F, 35.200001F, 51.200001F, 32.259998F, 44.369999F);
      localPath.cubicTo(31.620001F, 43.169998F, 32.580002F, 41.75F, 33.950001F, 41.889999F);
      localPath.cubicTo(38.049999F, 44.43F, 41.650002F, 47.709999F, 45.75F, 50.259998F);
      localPath.cubicTo(47.369999F, 51.290001F, 49.330002F, 50.619999F, 50.91F, 49.860001F);
      localPath.cubicTo(66.940002F, 42.470001F, 83.010002F, 35.169998F, 99.040001F, 27.780001F);
      localPath.cubicTo(80.889999F, 6.03F, 44.779999F, 4.14F, 23.799999F, 22.799999F);
      localPath.lineTo(23.799999F, 22.799999F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16598272);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 10.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(13.8F, 12.8F);
      ((Path)localObject).cubicTo(34.779999F, -5.86F, 70.889999F, -3.97F, 89.040001F, 17.780001F);
      ((Path)localObject).cubicTo(73.010002F, 25.17F, 56.939999F, 32.470001F, 40.91F, 39.860001F);
      ((Path)localObject).cubicTo(39.330002F, 40.619999F, 37.369999F, 41.290001F, 35.75F, 40.259998F);
      ((Path)localObject).cubicTo(31.65F, 37.709999F, 28.049999F, 34.43F, 23.950001F, 31.889999F);
      ((Path)localObject).cubicTo(22.58F, 31.75F, 21.620001F, 33.169998F, 22.26F, 34.369999F);
      ((Path)localObject).cubicTo(25.200001F, 41.200001F, 28.219999F, 48.02F, 31.309999F, 54.790001F);
      ((Path)localObject).cubicTo(32.130001F, 56.900002F, 34.970001F, 57.150002F, 36.549999F, 55.759998F);
      ((Path)localObject).cubicTo(55.189999F, 44.689999F, 73.809998F, 33.599998F, 92.449997F, 22.549999F);
      ((Path)localObject).cubicTo(97.169998F, 30.379999F, 99.160004F, 39.91F, 97.330002F, 48.919998F);
      ((Path)localObject).cubicTo(95.25F, 59.959999F, 87.910004F, 69.529999F, 78.57F, 75.540001F);
      ((Path)localObject).cubicTo(65.760002F, 83.849998F, 49.349998F, 86.099998F, 34.66F, 82.18F);
      ((Path)localObject).cubicTo(33.189999F, 81.919998F, 31.610001F, 81.150002F, 30.139999F, 81.800003F);
      ((Path)localObject).cubicTo(25.6F, 83.860001F, 21.690001F, 87.160004F, 17.09F, 89.080002F);
      ((Path)localObject).cubicTo(16.73F, 88.790001F, 16.02F, 88.220001F, 15.66F, 87.93F);
      ((Path)localObject).cubicTo(16.08F, 84.160004F, 17.620001F, 80.620003F, 18.23F, 76.889999F);
      ((Path)localObject).cubicTo(18.700001F, 74.870003F, 16.709999F, 73.709999F, 15.44F, 72.589996F);
      ((Path)localObject).cubicTo(6.18F, 65.300003F, -0.09F, 53.91F, 0.01F, 41.990002F);
      ((Path)localObject).cubicTo(-0.09F, 30.790001F, 5.5F, 20.110001F, 13.8F, 12.8F);
      ((Path)localObject).lineTo(13.8F, 12.8F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bar
 * JD-Core Version:    0.6.2
 */