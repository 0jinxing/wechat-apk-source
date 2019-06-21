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

public final class arq extends c
{
  private final int height = 78;
  private final int width = 78;

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
        paramInt = 78;
        continue;
        paramInt = 78;
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -326.0F, 0.0F, 1.0F, -237.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 326.0F, 0.0F, 1.0F, 237.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setColor(-11184811);
      localPaint2.setStrokeWidth(3.0F);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(28.72093F, 39.790699F);
      ((Path)localObject).cubicTo(33.188721F, 47.180103F, 26.140779F, 50.233418F, 22.39535F, 52.44186F);
      ((Path)localObject).cubicTo(10.53354F, 59.134026F, 5.0F, 61.832302F, 5.0F, 65.093025F);
      ((Path)localObject).lineTo(5.0F, 69.837212F);
      ((Path)localObject).cubicTo(5.0F, 71.666298F, 6.151512F, 73.0F, 8.16279F, 73.0F);
      ((Path)localObject).lineTo(69.837212F, 73.0F);
      ((Path)localObject).cubicTo(71.848488F, 73.0F, 73.0F, 71.666298F, 73.0F, 69.837212F);
      ((Path)localObject).lineTo(73.0F, 65.093025F);
      ((Path)localObject).cubicTo(73.0F, 61.832302F, 67.466461F, 59.134026F, 55.604652F, 52.44186F);
      ((Path)localObject).cubicTo(51.859222F, 50.233418F, 44.811279F, 47.180103F, 49.279068F, 39.790699F);
      ((Path)localObject).cubicTo(52.826248F, 34.838211F, 55.767872F, 32.557747F, 55.604652F, 23.976744F);
      ((Path)localObject).cubicTo(55.767872F, 14.310931F, 49.19635F, 5.0F, 39.790699F, 5.0F);
      ((Path)localObject).cubicTo(28.803648F, 5.0F, 22.232128F, 14.310931F, 22.39535F, 23.976744F);
      ((Path)localObject).cubicTo(22.232128F, 32.557747F, 25.173754F, 34.838211F, 28.72093F, 39.790699F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-11184811);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(33.032784F, 62.024521F);
      ((Path)localObject).cubicTo(32.495216F, 63.592533F, 33.032784F, 65.790817F, 34.231796F, 66.93293F);
      ((Path)localObject).lineTo(37.862457F, 70.391289F);
      ((Path)localObject).cubicTo(38.465904F, 70.966103F, 39.441631F, 70.980598F, 40.061115F, 70.405762F);
      ((Path)localObject).lineTo(43.832729F, 66.905937F);
      ((Path)localObject).cubicTo(45.048244F, 65.778015F, 45.590824F, 63.605457F, 45.034451F, 62.024521F);
      ((Path)localObject).lineTo(38.955097F, 44.75F);
      ((Path)localObject).lineTo(33.032784F, 62.024521F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.arq
 * JD-Core Version:    0.6.2
 */