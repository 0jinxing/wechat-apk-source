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

public final class apw extends c
{
  private final int height = 74;
  private final int width = 165;

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
        paramInt = 165;
        continue;
        paramInt = 74;
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
      localPaint1.setColor(-14442031);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(87.709999F, 1.02F);
      ((Path)localObject1).cubicTo(97.18F, 0.98F, 106.65F, 1.01F, 116.11F, 1.0F);
      ((Path)localObject1).cubicTo(122.86F, 0.94F, 129.37F, 4.23F, 133.81F, 9.23F);
      ((Path)localObject1).cubicTo(138.87F, 14.77F, 141.50999F, 22.18F, 142.0F, 29.610001F);
      ((Path)localObject1).lineTo(142.0F, 36.950001F);
      ((Path)localObject1).cubicTo(141.63F, 45.0F, 138.59F, 53.09F, 132.81F, 58.82F);
      ((Path)localObject1).cubicTo(128.22F, 63.52F, 121.67F, 66.290001F, 115.07F, 66.0F);
      ((Path)localObject1).cubicTo(76.949997F, 65.860001F, 38.82F, 66.269997F, 0.7F, 65.790001F);
      ((Path)localObject1).cubicTo(14.4F, 65.129997F, 27.91F, 61.470001F, 40.080002F, 55.189999F);
      ((Path)localObject1).cubicTo(62.049999F, 44.0F, 79.389999F, 24.209999F, 87.709999F, 1.02F);
      ((Path)localObject1).lineTo(87.709999F, 1.02F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apw
 * JD-Core Version:    0.6.2
 */