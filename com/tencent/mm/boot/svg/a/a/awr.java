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

public final class awr extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(96.0F, 0.0F);
      ((Path)localObject1).lineTo(96.0F, 96.0F);
      ((Path)localObject1).lineTo(0.0F, 96.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(419430400);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(7.0F, 13.0F);
      ((Path)localObject2).cubicTo(7.0F, 9.686291F, 9.686291F, 7.0F, 13.0F, 7.0F);
      ((Path)localObject2).lineTo(83.0F, 7.0F);
      ((Path)localObject2).cubicTo(86.313705F, 7.0F, 89.0F, 9.686291F, 89.0F, 13.0F);
      ((Path)localObject2).lineTo(89.0F, 63.0F);
      ((Path)localObject2).cubicTo(89.0F, 66.313705F, 86.313705F, 69.0F, 83.0F, 69.0F);
      ((Path)localObject2).lineTo(13.0F, 69.0F);
      ((Path)localObject2).cubicTo(9.686291F, 69.0F, 7.0F, 66.313705F, 7.0F, 63.0F);
      ((Path)localObject2).lineTo(7.0F, 13.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-9473160);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(7.0F, 13.001155F);
      ((Path)localObject2).cubicTo(7.0F, 9.686809F, 9.681666F, 7.0F, 12.996433F, 7.0F);
      ((Path)localObject2).lineTo(83.003563F, 7.0F);
      ((Path)localObject2).cubicTo(86.315308F, 7.0F, 89.0F, 9.683963F, 89.0F, 13.001155F);
      ((Path)localObject2).lineTo(89.0F, 62.998844F);
      ((Path)localObject2).cubicTo(89.0F, 66.313194F, 86.318336F, 69.0F, 83.003563F, 69.0F);
      ((Path)localObject2).lineTo(12.996433F, 69.0F);
      ((Path)localObject2).cubicTo(9.684694F, 69.0F, 7.0F, 66.31604F, 7.0F, 62.998844F);
      ((Path)localObject2).lineTo(7.0F, 13.001155F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(9.0F, 13.009459F);
      ((Path)localObject2).cubicTo(9.0F, 10.795095F, 10.794424F, 9.0F, 13.002277F, 9.0F);
      ((Path)localObject2).lineTo(82.997719F, 9.0F);
      ((Path)localObject2).cubicTo(85.208122F, 9.0F, 87.0F, 10.799425F, 87.0F, 13.009459F);
      ((Path)localObject2).lineTo(87.0F, 62.99054F);
      ((Path)localObject2).cubicTo(87.0F, 65.204903F, 85.205574F, 67.0F, 82.997719F, 67.0F);
      ((Path)localObject2).lineTo(13.002277F, 67.0F);
      ((Path)localObject2).cubicTo(10.791881F, 67.0F, 9.0F, 65.200577F, 9.0F, 62.99054F);
      ((Path)localObject2).lineTo(9.0F, 13.009459F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9473160);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(39.0F, 80.0F);
      ((Path)localObject1).lineTo(57.0F, 80.0F);
      ((Path)localObject1).lineTo(48.0F, 90.505859F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9473160);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(24.0F, 20.0F);
      ((Path)localObject1).cubicTo(26.209139F, 20.0F, 28.0F, 21.790861F, 28.0F, 24.0F);
      ((Path)localObject1).cubicTo(28.0F, 26.209139F, 26.209139F, 28.0F, 24.0F, 28.0F);
      ((Path)localObject1).cubicTo(21.790861F, 28.0F, 20.0F, 26.209139F, 20.0F, 24.0F);
      ((Path)localObject1).cubicTo(20.0F, 21.790861F, 21.790861F, 20.0F, 24.0F, 20.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9473160);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(24.0F, 34.0F);
      ((Path)localObject1).cubicTo(26.209139F, 34.0F, 28.0F, 35.790859F, 28.0F, 38.0F);
      ((Path)localObject1).cubicTo(28.0F, 40.209141F, 26.209139F, 42.0F, 24.0F, 42.0F);
      ((Path)localObject1).cubicTo(21.790861F, 42.0F, 20.0F, 40.209141F, 20.0F, 38.0F);
      ((Path)localObject1).cubicTo(20.0F, 35.790859F, 21.790861F, 34.0F, 24.0F, 34.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-9473160);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(24.0F, 48.0F);
      ((Path)localObject2).cubicTo(26.209139F, 48.0F, 28.0F, 49.790859F, 28.0F, 52.0F);
      ((Path)localObject2).cubicTo(28.0F, 54.209141F, 26.209139F, 56.0F, 24.0F, 56.0F);
      ((Path)localObject2).cubicTo(21.790861F, 56.0F, 20.0F, 54.209141F, 20.0F, 52.0F);
      ((Path)localObject2).cubicTo(20.0F, 49.790859F, 21.790861F, 48.0F, 24.0F, 48.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9473160);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(34.0F, 23.0F);
      ((Path)localObject1).cubicTo(34.0F, 21.89543F, 34.895432F, 21.0F, 36.0F, 21.0F);
      ((Path)localObject1).lineTo(74.0F, 21.0F);
      ((Path)localObject1).cubicTo(75.104568F, 21.0F, 76.0F, 21.89543F, 76.0F, 23.0F);
      ((Path)localObject1).lineTo(76.0F, 25.0F);
      ((Path)localObject1).cubicTo(76.0F, 26.10457F, 75.104568F, 27.0F, 74.0F, 27.0F);
      ((Path)localObject1).lineTo(36.0F, 27.0F);
      ((Path)localObject1).cubicTo(34.895432F, 27.0F, 34.0F, 26.10457F, 34.0F, 25.0F);
      ((Path)localObject1).lineTo(34.0F, 23.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9473160);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(34.0F, 37.0F);
      ((Path)localObject1).cubicTo(34.0F, 35.895432F, 34.895432F, 35.0F, 36.0F, 35.0F);
      ((Path)localObject1).lineTo(74.0F, 35.0F);
      ((Path)localObject1).cubicTo(75.104568F, 35.0F, 76.0F, 35.895432F, 76.0F, 37.0F);
      ((Path)localObject1).lineTo(76.0F, 39.0F);
      ((Path)localObject1).cubicTo(76.0F, 40.104568F, 75.104568F, 41.0F, 74.0F, 41.0F);
      ((Path)localObject1).lineTo(36.0F, 41.0F);
      ((Path)localObject1).cubicTo(34.895432F, 41.0F, 34.0F, 40.104568F, 34.0F, 39.0F);
      ((Path)localObject1).lineTo(34.0F, 37.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-9473160);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(34.0F, 51.0F);
      ((Path)localObject1).cubicTo(34.0F, 49.895432F, 34.895432F, 49.0F, 36.0F, 49.0F);
      ((Path)localObject1).lineTo(74.0F, 49.0F);
      ((Path)localObject1).cubicTo(75.104568F, 49.0F, 76.0F, 49.895432F, 76.0F, 51.0F);
      ((Path)localObject1).lineTo(76.0F, 53.0F);
      ((Path)localObject1).cubicTo(76.0F, 54.104568F, 75.104568F, 55.0F, 74.0F, 55.0F);
      ((Path)localObject1).lineTo(36.0F, 55.0F);
      ((Path)localObject1).cubicTo(34.895432F, 55.0F, 34.0F, 54.104568F, 34.0F, 53.0F);
      ((Path)localObject1).lineTo(34.0F, 51.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awr
 * JD-Core Version:    0.6.2
 */