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

public final class gj extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-3194563);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(28.0F, 0.0F);
      localPath.lineTo(31.91F, 0.0F);
      localPath.cubicTo(46.529999F, 0.77F, 59.150002F, 13.36F, 60.0F, 27.969999F);
      localPath.lineTo(60.0F, 31.799999F);
      localPath.cubicTo(59.299999F, 46.689999F, 46.27F, 59.57F, 31.35F, 60.0F);
      localPath.lineTo(28.48F, 60.0F);
      localPath.cubicTo(13.76F, 59.470001F, 0.96F, 46.869999F, 0.0F, 32.200001F);
      localPath.lineTo(0.0F, 28.26F);
      localPath.cubicTo(0.67F, 13.56F, 13.33F, 0.84F, 28.0F, 0.0F);
      localPath.moveTo(13.35F, 25.51F);
      localPath.cubicTo(11.47F, 26.709999F, 12.06F, 29.219999F, 11.97F, 31.09F);
      localPath.cubicTo(11.7F, 32.880001F, 12.89F, 35.049999F, 14.89F, 34.939999F);
      localPath.cubicTo(24.629999F, 35.080002F, 34.380001F, 34.970001F, 44.130001F, 34.990002F);
      localPath.cubicTo(45.919998F, 35.310001F, 47.970001F, 34.09F, 47.959999F, 32.139999F);
      localPath.cubicTo(47.98F, 29.780001F, 48.759998F, 26.290001F, 45.990002F, 25.15F);
      localPath.cubicTo(36.689999F, 24.77F, 27.35F, 25.139999F, 18.040001F, 24.98F);
      localPath.cubicTo(16.5F, 25.15F, 14.73F, 24.65F, 13.35F, 25.51F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-665128);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(13.35F, 25.51F);
      ((Path)localObject).cubicTo(14.73F, 24.65F, 16.5F, 25.15F, 18.040001F, 24.98F);
      ((Path)localObject).cubicTo(27.35F, 25.139999F, 36.689999F, 24.77F, 45.990002F, 25.15F);
      ((Path)localObject).cubicTo(48.759998F, 26.290001F, 47.98F, 29.780001F, 47.959999F, 32.139999F);
      ((Path)localObject).cubicTo(47.970001F, 34.09F, 45.919998F, 35.310001F, 44.130001F, 34.990002F);
      ((Path)localObject).cubicTo(34.380001F, 34.970001F, 24.629999F, 35.080002F, 14.89F, 34.939999F);
      ((Path)localObject).cubicTo(12.89F, 35.049999F, 11.7F, 32.880001F, 11.97F, 31.09F);
      ((Path)localObject).cubicTo(12.06F, 29.219999F, 11.47F, 26.709999F, 13.35F, 25.51F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gj
 * JD-Core Version:    0.6.2
 */