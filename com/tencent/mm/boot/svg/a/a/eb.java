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

public final class eb extends c
{
  private final int height = 58;
  private final int width = 58;

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
        paramInt = 58;
        continue;
        paramInt = 58;
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -58.0F, 0.0F, 1.0F, -148.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 58.0F, 0.0F, 1.0F, 148.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(29.0F, 58.0F);
      ((Path)localObject2).cubicTo(45.016258F, 58.0F, 58.0F, 45.016258F, 58.0F, 29.0F);
      ((Path)localObject2).cubicTo(58.0F, 12.983743F, 45.016258F, 0.0F, 29.0F, 0.0F);
      ((Path)localObject2).cubicTo(12.983743F, 0.0F, 0.0F, 12.983743F, 0.0F, 29.0F);
      ((Path)localObject2).cubicTo(0.0F, 45.016258F, 12.983743F, 58.0F, 29.0F, 58.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(29.0F, 52.0F);
      ((Path)localObject2).cubicTo(41.702549F, 52.0F, 52.0F, 41.702549F, 52.0F, 29.0F);
      ((Path)localObject2).cubicTo(52.0F, 16.297451F, 41.702549F, 6.0F, 29.0F, 6.0F);
      ((Path)localObject2).cubicTo(16.297451F, 6.0F, 6.0F, 16.297451F, 6.0F, 29.0F);
      ((Path)localObject2).cubicTo(6.0F, 41.702549F, 16.297451F, 52.0F, 29.0F, 52.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(29.974895F, 27.246653F);
      ((Path)localObject1).lineTo(29.217737F, 14.251846F);
      ((Path)localObject1).cubicTo(29.19401F, 13.844625F, 28.835377F, 13.5F, 28.417751F, 13.5F);
      ((Path)localObject1).lineTo(27.1628F, 13.5F);
      ((Path)localObject1).cubicTo(26.745947F, 13.5F, 26.387007F, 13.836613F, 26.362814F, 14.251846F);
      ((Path)localObject1).lineTo(25.53224F, 28.506634F);
      ((Path)localObject1).cubicTo(25.501184F, 29.039612F, 25.755342F, 29.50647F, 26.163542F, 29.770678F);
      ((Path)localObject1).cubicTo(26.252584F, 30.036236F, 26.423479F, 30.280165F, 26.672367F, 30.466492F);
      ((Path)localObject1).lineTo(39.0047F, 39.699009F);
      ((Path)localObject1).cubicTo(39.340405F, 39.950333F, 39.827724F, 39.897633F, 40.089073F, 39.58617F);
      ((Path)localObject1).lineTo(40.949707F, 38.560509F);
      ((Path)localObject1).cubicTo(41.212883F, 38.246868F, 41.180317F, 37.761848F, 40.872528F, 37.473019F);
      ((Path)localObject1).lineTo(29.974895F, 27.246653F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.eb
 * JD-Core Version:    0.6.2
 */