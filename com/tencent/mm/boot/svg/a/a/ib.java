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

public final class ib extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 23.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.0F, 25.019958F);
      ((Path)localObject1).cubicTo(9.014991F, 17.016632F, 17.029982F, 9.003326F, 25.054966F, 1.0F);
      ((Path)localObject1).cubicTo(26.474079F, 2.437006F, 27.893192F, 3.874013F, 29.292316F, 5.320998F);
      ((Path)localObject1).cubicTo(23.73579F, 10.869439F, 18.179262F, 16.4079F, 12.63273F, 21.956341F);
      ((Path)localObject1).cubicTo(24.755154F, 21.96632F, 36.877575F, 21.956341F, 49.0F, 21.96632F);
      ((Path)localObject1).lineTo(49.0F, 28.013721F);
      ((Path)localObject1).lineTo(12.582761F, 28.013721F);
      ((Path)localObject1).cubicTo(18.129293F, 33.612057F, 23.725796F, 39.15052F, 29.292316F, 44.728897F);
      ((Path)localObject1).cubicTo(27.873203F, 46.155926F, 26.444098F, 47.572971F, 25.01499F, 49.0F);
      ((Path)localObject1).cubicTo(17.009995F, 41.006653F, 9.004997F, 33.013306F, 1.0F, 25.019958F);
      ((Path)localObject1).lineTo(1.0F, 25.019958F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ib
 * JD-Core Version:    0.6.2
 */