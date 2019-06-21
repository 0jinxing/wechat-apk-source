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

public final class amm extends c
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(51.362026F, 6.0F);
      ((Path)localObject1).lineTo(61.99543F, 6.0F);
      ((Path)localObject1).cubicTo(64.200432F, 6.0F, 66.0F, 7.795291F, 66.0F, 10.009893F);
      ((Path)localObject1).lineTo(66.0F, 49.990108F);
      ((Path)localObject1).cubicTo(66.0F, 52.205948F, 64.207092F, 54.0F, 61.99543F, 54.0F);
      ((Path)localObject1).lineTo(4.004571F, 54.0F);
      ((Path)localObject1).cubicTo(1.79957F, 54.0F, 0.0F, 52.204708F, 0.0F, 49.990108F);
      ((Path)localObject1).lineTo(0.0F, 10.009893F);
      ((Path)localObject1).cubicTo(0.0F, 7.794053F, 1.792907F, 6.0F, 4.004571F, 6.0F);
      ((Path)localObject1).lineTo(14.637975F, 6.0F);
      ((Path)localObject1).lineTo(21.0F, 0.0F);
      ((Path)localObject1).lineTo(45.0F, 0.0F);
      ((Path)localObject1).lineTo(51.362026F, 6.0F);
      ((Path)localObject1).lineTo(51.362026F, 6.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(33.0F, 48.0F);
      ((Path)localObject1).cubicTo(44.045696F, 48.0F, 53.0F, 39.045696F, 53.0F, 28.0F);
      ((Path)localObject1).cubicTo(53.0F, 16.954306F, 44.045696F, 8.0F, 33.0F, 8.0F);
      ((Path)localObject1).cubicTo(21.954306F, 8.0F, 13.0F, 16.954306F, 13.0F, 28.0F);
      ((Path)localObject1).cubicTo(13.0F, 39.045696F, 21.954306F, 48.0F, 33.0F, 48.0F);
      ((Path)localObject1).lineTo(33.0F, 48.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(33.0F, 41.0F);
      ((Path)localObject1).cubicTo(40.179703F, 41.0F, 46.0F, 35.179703F, 46.0F, 28.0F);
      ((Path)localObject1).cubicTo(46.0F, 20.820299F, 40.179703F, 15.0F, 33.0F, 15.0F);
      ((Path)localObject1).cubicTo(25.820299F, 15.0F, 20.0F, 20.820299F, 20.0F, 28.0F);
      ((Path)localObject1).cubicTo(20.0F, 35.179703F, 25.820299F, 41.0F, 33.0F, 41.0F);
      ((Path)localObject1).lineTo(33.0F, 41.0F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.amm
 * JD-Core Version:    0.6.2
 */