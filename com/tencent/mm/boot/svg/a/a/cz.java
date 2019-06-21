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

public final class cz extends c
{
  private final int height = 280;
  private final int width = 280;

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
        paramInt = 280;
        continue;
        paramInt = 280;
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
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, -10.0F, 0.0F, 1.0F, -10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16896);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(289.5F, 151.72223F);
      ((Path)localObject1).cubicTo(289.5F, 72.954666F, 227.04533F, 10.5F, 148.27777F, 10.5F);
      ((Path)localObject1).cubicTo(72.954666F, 10.5F, 10.5F, 72.954666F, 10.5F, 151.72223F);
      ((Path)localObject1).cubicTo(10.5F, 227.04533F, 72.954666F, 289.5F, 148.27777F, 289.5F);
      ((Path)localObject1).cubicTo(227.04533F, 289.5F, 289.5F, 227.04533F, 289.5F, 151.72223F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(141.49457F, 85.5F);
      ((Path)localObject1).cubicTo(140.39299F, 85.5F, 139.53296F, 86.392433F, 139.57391F, 87.500977F);
      ((Path)localObject1).lineTo(142.96306F, 179.25606F);
      ((Path)localObject1).cubicTo(142.98346F, 179.80836F, 143.44995F, 180.2561F, 144.00685F, 180.2561F);
      ((Path)localObject1).lineTo(155.99315F, 180.2561F);
      ((Path)localObject1).cubicTo(156.54922F, 180.2561F, 157.01639F, 179.81255F, 157.03694F, 179.25606F);
      ((Path)localObject1).lineTo(160.42609F, 87.500977F);
      ((Path)localObject1).cubicTo(160.4669F, 86.395866F, 159.59766F, 85.5F, 158.50543F, 85.5F);
      ((Path)localObject1).lineTo(141.49457F, 85.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(150.0F, 214.5F);
      ((Path)localObject1).cubicTo(155.799F, 214.5F, 160.5F, 209.799F, 160.5F, 204.0F);
      ((Path)localObject1).cubicTo(160.5F, 198.201F, 155.799F, 193.5F, 150.0F, 193.5F);
      ((Path)localObject1).cubicTo(144.201F, 193.5F, 139.5F, 198.201F, 139.5F, 204.0F);
      ((Path)localObject1).cubicTo(139.5F, 209.799F, 144.201F, 214.5F, 150.0F, 214.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cz
 * JD-Core Version:    0.6.2
 */