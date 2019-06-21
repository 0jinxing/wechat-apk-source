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

public final class apu extends c
{
  private final int height = 291;
  private final int width = 291;

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
        paramInt = 291;
        continue;
        paramInt = 291;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      Looper localLooper = (Looper)paramArrayOfObject[1];
      paramArrayOfObject = c.h(localLooper);
      Object localObject1 = c.g(localLooper);
      Paint localPaint1 = c.k(localLooper);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(localLooper);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, localLooper).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject1, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.462312F);
      paramArrayOfObject.reset();
      paramArrayOfObject.setValues((float[])localObject2);
      localCanvas.concat(paramArrayOfObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, localLooper);
      localObject1 = c.l(localLooper);
      ((Path)localObject1).moveTo(145.5F, 290.53769F);
      ((Path)localObject1).cubicTo(225.85744F, 290.53769F, 291.0F, 225.72247F, 291.0F, 145.76884F);
      ((Path)localObject1).cubicTo(291.0F, 65.815216F, 225.85744F, 1.0F, 145.5F, 1.0F);
      ((Path)localObject1).cubicTo(65.14257F, 1.0F, 0.0F, 65.815216F, 0.0F, 145.76884F);
      ((Path)localObject1).cubicTo(0.0F, 225.72247F, 65.14257F, 290.53769F, 145.5F, 290.53769F);
      ((Path)localObject1).lineTo(145.5F, 290.53769F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(145.5F, 286.3819F);
      ((Path)localObject1).cubicTo(223.55066F, 286.3819F, 286.82324F, 223.42729F, 286.82324F, 145.76884F);
      ((Path)localObject1).cubicTo(286.82324F, 68.11039F, 223.55066F, 5.155779F, 145.5F, 5.155779F);
      ((Path)localObject1).cubicTo(67.449333F, 5.155779F, 4.176768F, 68.11039F, 4.176768F, 145.76884F);
      ((Path)localObject1).cubicTo(4.176768F, 223.42729F, 67.449333F, 286.3819F, 145.5F, 286.3819F);
      ((Path)localObject1).lineTo(145.5F, 286.3819F);
      ((Path)localObject1).close();
      Paint localPaint2 = c.k(localLooper);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.FILL);
      Paint localPaint3 = c.k(localLooper);
      localPaint3.setFlags(385);
      localPaint3.setStyle(Paint.Style.STROKE);
      localPaint2.setColor(-16777216);
      localPaint3.setStrokeWidth(1.0F);
      localPaint3.setStrokeCap(Paint.Cap.BUTT);
      localPaint3.setStrokeJoin(Paint.Join.MITER);
      localPaint3.setStrokeMiter(4.0F);
      localPaint3.setPathEffect(null);
      localObject2 = c.a((float[])localObject2, 291.0F, 0.0F, 0.0F, 0.0F, 290.53769F, 1.0F);
      paramArrayOfObject.reset();
      paramArrayOfObject.setValues((float[])localObject2);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint1, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -1, -1 }, new float[] { 0.0F, 1.0F }, paramArrayOfObject, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(localLooper);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apu
 * JD-Core Version:    0.6.2
 */