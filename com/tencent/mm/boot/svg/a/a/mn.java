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

public final class mn extends c
{
  private final int height = 294;
  private final int width = 300;

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
        paramInt = 300;
        continue;
        paramInt = 294;
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint3 = c.a(localPaint1, paramArrayOfObject);
      localPaint3.setColor(-657931);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 15.00912F);
      localPath.cubicTo(0.0F, 6.719812F, 6.722175F, 0.0F, 15.005396F, 0.0F);
      localPath.lineTo(284.9946F, 0.0F);
      localPath.cubicTo(293.28186F, 0.0F, 300.0F, 6.710611F, 300.0F, 15.00912F);
      localPath.lineTo(300.0F, 278.99088F);
      localPath.cubicTo(300.0F, 287.28018F, 293.27783F, 294.0F, 284.9946F, 294.0F);
      localPath.lineTo(15.005396F, 294.0F);
      localPath.cubicTo(6.718145F, 294.0F, 0.0F, 287.2894F, 0.0F, 278.99088F);
      localPath.lineTo(0.0F, 15.00912F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 64.0F, 0.0F, 1.0F, 83.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-3552823);
      ((Paint)localObject2).setStrokeWidth(20.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 2.0F);
      ((Path)localObject1).cubicTo(0.0F, 0.8954305F, 0.8954305F, 0.0F, 2.0F, 0.0F);
      ((Path)localObject1).lineTo(163.0F, 0.0F);
      ((Path)localObject1).cubicTo(164.10457F, 0.0F, 165.0F, 0.8954305F, 165.0F, 2.0F);
      ((Path)localObject1).lineTo(165.0F, 118.0F);
      ((Path)localObject1).cubicTo(165.0F, 119.10457F, 164.10457F, 120.0F, 163.0F, 120.0F);
      ((Path)localObject1).lineTo(2.0F, 120.0F);
      ((Path)localObject1).cubicTo(0.8954305F, 120.0F, 0.0F, 119.10457F, 0.0F, 118.0F);
      ((Path)localObject1).lineTo(0.0F, 2.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-3552823);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(126.73595F, 64.148972F);
      ((Path)localObject1).lineTo(103.83727F, 81.985718F);
      ((Path)localObject1).lineTo(111.87634F, 98.63208F);
      ((Path)localObject1).lineTo(55.730881F, 46.75F);
      ((Path)localObject1).lineTo(2.75F, 96.573067F);
      ((Path)localObject1).lineTo(2.75F, 119.24577F);
      ((Path)localObject1).lineTo(162.59375F, 119.24577F);
      ((Path)localObject1).lineTo(162.59375F, 96.573067F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.mn
 * JD-Core Version:    0.6.2
 */