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

public final class awb extends c
{
  private final int height = 46;
  private final int width = 46;

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
        paramInt = 46;
        continue;
        paramInt = 46;
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
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-6710887);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(23.0F, 0.0F);
      ((Path)localObject).cubicTo(35.702549F, 0.0F, 46.0F, 10.29745F, 46.0F, 23.0F);
      ((Path)localObject).cubicTo(46.0F, 35.702549F, 35.702549F, 46.0F, 23.0F, 46.0F);
      ((Path)localObject).cubicTo(10.29745F, 46.0F, 0.0F, 35.702549F, 0.0F, 23.0F);
      ((Path)localObject).cubicTo(0.0F, 10.29745F, 10.29745F, 0.0F, 23.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(29.837742F, 16.978155F);
      ((Path)localObject).cubicTo(29.663364F, 15.734242F, 29.332104F, 14.538659F, 28.424576F, 13.573514F);
      ((Path)localObject).cubicTo(25.837162F, 10.148845F, 20.172827F, 10.138831F, 17.585415F, 13.5635F);
      ((Path)localObject).cubicTo(15.967033F, 15.315889F, 16.176823F, 17.799276F, 15.827173F, 19.982252F);
      ((Path)localObject).lineTo(13.0F, 19.982252F);
      ((Path)localObject).cubicTo(13.00999F, 24.328176F, 13.00999F, 28.664089F, 13.00999F, 33.0F);
      ((Path)localObject).lineTo(32.990009F, 33.0F);
      ((Path)localObject).cubicTo(32.990009F, 28.664089F, 32.990009F, 24.328176F, 33.0F, 19.982252F);
      ((Path)localObject).lineTo(31.586414F, 19.982252F);
      ((Path)localObject).lineTo(26.086912F, 19.982252F);
      ((Path)localObject).lineTo(18.824175F, 19.982252F);
      ((Path)localObject).cubicTo(18.804195F, 17.358675F, 19.713287F, 13.873924F, 22.990009F, 13.97406F);
      ((Path)localObject).cubicTo(25.067957F, 13.891255F, 26.212177F, 15.279206F, 26.759495F, 16.978155F);
      ((Path)localObject).lineTo(29.837742F, 16.978155F);
      ((Path)localObject).lineTo(29.837742F, 16.978155F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awb
 * JD-Core Version:    0.6.2
 */