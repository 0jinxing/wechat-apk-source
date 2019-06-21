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

public final class aqf extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localPaint1.setColor(-899014);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -218.0F, 0.0F, 1.0F, -230.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 224.0F, 0.0F, 1.0F, 236.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 24.0F);
      ((Path)localObject1).cubicTo(0.0F, 10.8F, 10.8F, 0.0F, 24.0F, 0.0F);
      ((Path)localObject1).cubicTo(37.200001F, 0.0F, 48.0F, 10.8F, 48.0F, 24.0F);
      ((Path)localObject1).cubicTo(48.0F, 37.200001F, 37.200001F, 48.0F, 24.0F, 48.0F);
      ((Path)localObject1).cubicTo(10.8F, 48.0F, 0.0F, 37.200001F, 0.0F, 24.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(4.0F, 24.0F);
      ((Path)localObject1).cubicTo(4.0F, 35.0F, 13.0F, 44.0F, 24.0F, 44.0F);
      ((Path)localObject1).cubicTo(35.0F, 44.0F, 44.0F, 35.0F, 44.0F, 24.0F);
      ((Path)localObject1).cubicTo(44.0F, 13.0F, 35.0F, 4.0F, 24.0F, 4.0F);
      ((Path)localObject1).cubicTo(13.0F, 4.0F, 4.0F, 13.0F, 4.0F, 24.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(10.0F, 24.0F);
      ((Path)localObject1).cubicTo(10.0F, 31.700001F, 16.299999F, 38.0F, 24.0F, 38.0F);
      ((Path)localObject1).cubicTo(31.700001F, 38.0F, 38.0F, 31.700001F, 38.0F, 24.0F);
      ((Path)localObject1).cubicTo(38.0F, 16.299999F, 31.700001F, 10.0F, 24.0F, 10.0F);
      ((Path)localObject1).cubicTo(16.299999F, 10.0F, 10.0F, 16.299999F, 10.0F, 24.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aqf
 * JD-Core Version:    0.6.2
 */