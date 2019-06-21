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

public final class aox extends c
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
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-9276814);
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(33.939999F, 0.0F);
      ((Path)localObject).lineTo(37.860001F, 0.0F);
      ((Path)localObject).cubicTo(45.959999F, 0.56F, 53.93F, 3.66F, 59.959999F, 9.15F);
      ((Path)localObject).cubicTo(67.07F, 15.44F, 71.419998F, 24.59F, 72.0F, 34.049999F);
      ((Path)localObject).lineTo(72.0F, 37.830002F);
      ((Path)localObject).cubicTo(71.459999F, 47.59F, 66.849998F, 57.029999F, 59.389999F, 63.349998F);
      ((Path)localObject).cubicTo(53.540001F, 68.459999F, 45.970001F, 71.349998F, 38.259998F, 72.0F);
      ((Path)localObject).lineTo(34.110001F, 72.0F);
      ((Path)localObject).cubicTo(25.1F, 71.449997F, 16.32F, 67.550003F, 10.09F, 60.970001F);
      ((Path)localObject).cubicTo(4.16F, 54.900002F, 0.65F, 46.689999F, 0.0F, 38.25F);
      ((Path)localObject).lineTo(0.0F, 34.130001F);
      ((Path)localObject).cubicTo(0.55F, 24.370001F, 5.18F, 14.93F, 12.65F, 8.61F);
      ((Path)localObject).cubicTo(18.549999F, 3.47F, 26.18F, 0.61F, 33.939999F, 0.0F);
      ((Path)localObject).lineTo(33.939999F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(29.4F, 3.66F);
      ((Path)localObject).cubicTo(23.120001F, 4.97F, 17.200001F, 8.12F, 12.68F, 12.67F);
      ((Path)localObject).cubicTo(2.03F, 22.959999F, -0.12F, 40.650002F, 7.83F, 53.16F);
      ((Path)localObject).cubicTo(16.0F, 67.239998F, 35.310001F, 73.150002F, 49.93F, 65.900002F);
      ((Path)localObject).cubicTo(64.75F, 59.369999F, 72.739998F, 41.040001F, 67.360001F, 25.73F);
      ((Path)localObject).cubicTo(62.610001F, 10.2F, 45.279999F, 0.06F, 29.4F, 3.66F);
      ((Path)localObject).lineTo(29.4F, 3.66F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(24.0F, 24.0F);
      ((Path)localObject).lineTo(48.0F, 24.0F);
      ((Path)localObject).lineTo(48.0F, 48.0F);
      ((Path)localObject).lineTo(24.0F, 48.0F);
      ((Path)localObject).lineTo(24.0F, 24.0F);
      ((Path)localObject).lineTo(24.0F, 24.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aox
 * JD-Core Version:    0.6.2
 */