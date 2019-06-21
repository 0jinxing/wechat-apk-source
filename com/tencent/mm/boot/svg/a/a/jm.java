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

public final class jm extends c
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8617851);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(40.500099F, 1.0E-004F);
      ((Path)localObject).cubicTo(16.194099F, 1.0E-004F, 1.0E-004F, 14.5371F, 1.0E-004F, 32.4701F);
      ((Path)localObject).cubicTo(1.0E-004F, 42.0741F, 4.6671F, 50.701099F, 12.7231F, 56.646099F);
      ((Path)localObject).lineTo(8.1001F, 69.000099F);
      ((Path)localObject).lineTo(23.6971F, 62.301102F);
      ((Path)localObject).cubicTo(28.6931F, 63.997101F, 34.337101F, 64.941101F, 40.500099F, 64.941101F);
      ((Path)localObject).cubicTo(64.740097F, 64.941101F, 81.000099F, 50.403099F, 81.000099F, 32.4701F);
      ((Path)localObject).cubicTo(81.000099F, 14.5371F, 64.806099F, 1.0E-004F, 40.500099F, 1.0E-004F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.640099F, 39.745098F);
      ((Path)localObject).lineTo(68.6931F, 45.421101F);
      ((Path)localObject).cubicTo(66.319099F, 44.606098F, 61.024101F, 42.323101F, 56.2901F, 37.049099F);
      ((Path)localObject).cubicTo(49.830101F, 45.303101F, 42.313099F, 46.000099F, 40.000099F, 46.000099F);
      ((Path)localObject).cubicTo(37.687099F, 46.000099F, 30.170099F, 45.303101F, 23.7101F, 37.049099F);
      ((Path)localObject).cubicTo(18.976101F, 42.323101F, 13.6811F, 44.606098F, 11.3071F, 45.421101F);
      ((Path)localObject).lineTo(9.3601F, 39.745098F);
      ((Path)localObject).cubicTo(11.3931F, 39.0471F, 16.1241F, 36.987099F, 20.1311F, 32.000099F);
      ((Path)localObject).cubicTo(16.1241F, 27.0121F, 11.3931F, 24.9531F, 9.3601F, 24.2551F);
      ((Path)localObject).lineTo(11.3071F, 18.5791F);
      ((Path)localObject).cubicTo(13.6811F, 19.3941F, 18.976101F, 21.677099F, 23.7101F, 26.951099F);
      ((Path)localObject).cubicTo(30.170099F, 18.6971F, 37.687099F, 18.000099F, 40.000099F, 18.000099F);
      ((Path)localObject).cubicTo(42.313099F, 18.000099F, 49.830101F, 18.6971F, 56.2901F, 26.951099F);
      ((Path)localObject).cubicTo(61.024101F, 21.677099F, 66.319099F, 19.3941F, 68.6931F, 18.5791F);
      ((Path)localObject).lineTo(70.640099F, 24.2551F);
      ((Path)localObject).cubicTo(68.607101F, 24.9531F, 63.875099F, 27.0121F, 59.868099F, 32.000099F);
      ((Path)localObject).cubicTo(63.875099F, 36.987099F, 68.607101F, 39.0471F, 70.640099F, 39.745098F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.0F, 24.0F);
      ((Path)localObject).cubicTo(38.298F, 24.0F, 32.505001F, 24.612F, 27.462999F, 32.0F);
      ((Path)localObject).cubicTo(32.505001F, 39.388F, 38.298F, 40.0F, 40.0F, 40.0F);
      ((Path)localObject).cubicTo(41.702F, 40.0F, 47.494999F, 39.388F, 52.536999F, 32.0F);
      ((Path)localObject).cubicTo(47.494999F, 24.612F, 41.702F, 24.0F, 40.0F, 24.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.jm
 * JD-Core Version:    0.6.2
 */