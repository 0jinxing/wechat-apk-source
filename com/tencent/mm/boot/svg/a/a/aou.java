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

public final class aou extends c
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-6710887);
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(33.880001F, 0.0F);
      localPath.lineTo(37.990002F, 0.0F);
      localPath.cubicTo(46.5F, 0.63F, 54.849998F, 4.06F, 60.959999F, 10.08F);
      localPath.cubicTo(67.43F, 16.24F, 71.330002F, 24.85F, 72.0F, 33.73F);
      localPath.lineTo(72.0F, 37.970001F);
      localPath.cubicTo(71.440002F, 46.970001F, 67.489998F, 55.709999F, 60.950001F, 61.93F);
      localPath.cubicTo(54.91F, 67.870003F, 46.689999F, 71.300003F, 38.290001F, 72.0F);
      localPath.lineTo(34.16F, 72.0F);
      localPath.cubicTo(25.58F, 71.470001F, 17.17F, 67.949997F, 11.02F, 61.900002F);
      localPath.cubicTo(4.53F, 55.720001F, 0.62F, 47.060001F, 0.0F, 38.139999F);
      localPath.lineTo(0.0F, 34.200001F);
      localPath.cubicTo(0.52F, 24.67F, 4.91F, 15.44F, 12.08F, 9.12F);
      localPath.cubicTo(18.040001F, 3.69F, 25.889999F, 0.64F, 33.880001F, 0.0F);
      localPath.lineTo(33.880001F, 0.0F);
      localPath.close();
      localPath.moveTo(29.41F, 3.66F);
      localPath.cubicTo(22.9F, 5.01F, 16.790001F, 8.34F, 12.2F, 13.16F);
      localPath.cubicTo(1.73F, 23.690001F, -0.01F, 41.470001F, 8.24F, 53.82F);
      localPath.cubicTo(16.74F, 67.699997F, 36.16F, 73.150002F, 50.599998F, 65.580002F);
      localPath.cubicTo(65.279999F, 58.720001F, 72.839996F, 40.209999F, 67.129997F, 25.040001F);
      localPath.cubicTo(62.099998F, 9.87F, 45.029999F, 0.13F, 29.41F, 3.66F);
      localPath.lineTo(29.41F, 3.66F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(26.0F, 19.01F);
      ((Path)localObject).cubicTo(35.330002F, 24.67F, 44.66F, 30.33F, 53.990002F, 36.0F);
      ((Path)localObject).cubicTo(44.669998F, 41.669998F, 35.34F, 47.330002F, 26.0F, 52.990002F);
      ((Path)localObject).lineTo(26.0F, 19.01F);
      ((Path)localObject).lineTo(26.0F, 19.01F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aou
 * JD-Core Version:    0.6.2
 */