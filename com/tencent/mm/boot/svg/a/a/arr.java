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

public final class arr extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -326.0F, 0.0F, 1.0F, -362.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 98.0F, 0.0F, 1.0F, 362.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 228.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-11184811);
      localPaint.setStrokeWidth(3.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(28.72093F, 39.790699F);
      ((Path)localObject1).cubicTo(33.188721F, 47.180103F, 26.140779F, 50.233418F, 22.39535F, 52.44186F);
      ((Path)localObject1).cubicTo(10.53354F, 59.134026F, 5.0F, 61.832302F, 5.0F, 65.093025F);
      ((Path)localObject1).lineTo(5.0F, 69.837212F);
      ((Path)localObject1).cubicTo(5.0F, 71.666298F, 6.151512F, 73.0F, 8.16279F, 73.0F);
      ((Path)localObject1).lineTo(69.837212F, 73.0F);
      ((Path)localObject1).cubicTo(71.848488F, 73.0F, 73.0F, 71.666298F, 73.0F, 69.837212F);
      ((Path)localObject1).lineTo(73.0F, 65.093025F);
      ((Path)localObject1).cubicTo(73.0F, 61.832302F, 67.466461F, 59.134026F, 55.604652F, 52.44186F);
      ((Path)localObject1).cubicTo(51.859222F, 50.233418F, 44.811279F, 47.180103F, 49.279068F, 39.790699F);
      ((Path)localObject1).cubicTo(52.826248F, 34.838211F, 55.767872F, 32.557747F, 55.604652F, 23.976744F);
      ((Path)localObject1).cubicTo(55.767872F, 14.310931F, 49.19635F, 5.0F, 39.790699F, 5.0F);
      ((Path)localObject1).cubicTo(28.803648F, 5.0F, 22.232128F, 14.310931F, 22.39535F, 23.976744F);
      ((Path)localObject1).cubicTo(22.232128F, 32.557747F, 25.173754F, 34.838211F, 28.72093F, 39.790699F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11184811);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(33.032784F, 62.024521F);
      ((Path)localObject2).cubicTo(32.495216F, 63.592533F, 33.032784F, 65.790817F, 34.231796F, 66.93293F);
      ((Path)localObject2).lineTo(37.862457F, 70.391289F);
      ((Path)localObject2).cubicTo(38.465904F, 70.966103F, 39.441631F, 70.980598F, 40.061115F, 70.405762F);
      ((Path)localObject2).lineTo(43.832729F, 66.905937F);
      ((Path)localObject2).cubicTo(45.048244F, 65.778015F, 45.590824F, 63.605457F, 45.034451F, 62.024521F);
      ((Path)localObject2).lineTo(38.955097F, 44.75F);
      ((Path)localObject2).lineTo(33.032784F, 62.024521F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.arr
 * JD-Core Version:    0.6.2
 */