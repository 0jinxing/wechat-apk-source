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

public final class aom extends c
{
  private final int height = 44;
  private final int width = 54;

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
        paramInt = 54;
        continue;
        paramInt = 44;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.5F, 0.5F);
      ((Path)localObject1).lineTo(46.5F, 0.5F);
      ((Path)localObject1).lineTo(46.5F, 36.5F);
      ((Path)localObject1).lineTo(0.5F, 36.5F);
      ((Path)localObject1).lineTo(0.5F, 0.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(42.5F, 2.5F);
      ((Path)localObject1).lineTo(42.5F, 32.5F);
      ((Path)localObject1).lineTo(3.5F, 32.5F);
      ((Path)localObject1).lineTo(3.5F, 2.5F);
      ((Path)localObject1).lineTo(42.5F, 2.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(51.0F, 42.5F);
      ((Path)localObject1).lineTo(52.5F, 42.5F);
      ((Path)localObject1).lineTo(52.5F, 7.5F);
      ((Path)localObject1).lineTo(49.5F, 7.5F);
      ((Path)localObject1).lineTo(49.5F, 39.5F);
      ((Path)localObject1).lineTo(5.5F, 39.5F);
      ((Path)localObject1).lineTo(5.5F, 42.5F);
      ((Path)localObject1).lineTo(51.0F, 42.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(36.170597F, 14.009804F);
      ((Path)localObject3).lineTo(28.390347F, 19.793558F);
      ((Path)localObject3).lineTo(15.891026F, 9.5F);
      ((Path)localObject3).lineTo(0.5576923F, 22.578432F);
      ((Path)localObject3).lineTo(0.5576923F, 32.5F);
      ((Path)localObject3).lineTo(46.557693F, 32.5F);
      ((Path)localObject3).lineTo(46.557693F, 22.578432F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aom
 * JD-Core Version:    0.6.2
 */