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

public final class aov extends c
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
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-9276814);
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(33.900002F, 0.0F);
      ((Path)localObject2).lineTo(38.040001F, 0.0F);
      ((Path)localObject2).cubicTo(46.52F, 0.64F, 54.84F, 4.06F, 60.93F, 10.05F);
      ((Path)localObject2).cubicTo(67.459999F, 16.26F, 71.400002F, 24.959999F, 72.0F, 33.919998F);
      ((Path)localObject2).lineTo(72.0F, 38.040001F);
      ((Path)localObject2).cubicTo(71.410004F, 47.029999F, 67.470001F, 55.740002F, 60.93F, 61.950001F);
      ((Path)localObject2).cubicTo(54.900002F, 67.870003F, 46.700001F, 71.290001F, 38.32F, 72.0F);
      ((Path)localObject2).lineTo(33.950001F, 72.0F);
      ((Path)localObject2).cubicTo(25.01F, 71.389999F, 16.299999F, 67.519997F, 10.12F, 61.0F);
      ((Path)localObject2).cubicTo(4.16F, 54.919998F, 0.64F, 46.689999F, 0.0F, 38.23F);
      ((Path)localObject2).lineTo(0.0F, 33.93F);
      ((Path)localObject2).cubicTo(0.66F, 23.299999F, 6.2F, 13.1F, 14.85F, 6.87F);
      ((Path)localObject2).cubicTo(20.360001F, 2.78F, 27.09F, 0.58F, 33.900002F, 0.0F);
      ((Path)localObject2).lineTo(33.900002F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(29.450001F, 3.65F);
      ((Path)localObject2).cubicTo(21.99F, 5.18F, 15.07F, 9.34F, 10.31F, 15.3F);
      ((Path)localObject2).cubicTo(1.3F, 26.139999F, 0.57F, 42.84F, 8.63F, 54.419998F);
      ((Path)localObject2).cubicTo(17.32F, 67.889999F, 36.419998F, 73.029999F, 50.650002F, 65.550003F);
      ((Path)localObject2).cubicTo(65.309998F, 58.669998F, 72.849998F, 40.150002F, 67.110001F, 24.99F);
      ((Path)localObject2).cubicTo(62.07F, 9.86F, 45.049999F, 0.15F, 29.450001F, 3.65F);
      ((Path)localObject2).lineTo(29.450001F, 3.65F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(26.01F, 19.02F);
      ((Path)localObject1).cubicTo(35.34F, 24.67F, 44.66F, 30.33F, 53.98F, 36.0F);
      ((Path)localObject1).cubicTo(44.68F, 41.689999F, 35.330002F, 47.310001F, 26.030001F, 53.0F);
      ((Path)localObject1).cubicTo(25.969999F, 41.669998F, 26.01F, 30.34F, 26.01F, 19.02F);
      ((Path)localObject1).lineTo(26.01F, 19.02F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aov
 * JD-Core Version:    0.6.2
 */