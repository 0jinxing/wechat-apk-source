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

public final class pd extends c
{
  private final int height = 162;
  private final int width = 162;

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
        paramInt = 162;
        continue;
        paramInt = 162;
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
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.333333F, 0.0F, 1.0F, 0.333333F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.6666667F, 80.666664F);
      ((Path)localObject2).cubicTo(0.6666667F, 36.554592F, 36.554333F, 0.6666667F, 80.666664F, 0.6666667F);
      ((Path)localObject2).cubicTo(124.779F, 0.6666667F, 160.66667F, 36.554592F, 160.66667F, 80.666664F);
      ((Path)localObject2).cubicTo(160.66667F, 124.77874F, 124.779F, 160.66667F, 80.666664F, 160.66667F);
      ((Path)localObject2).cubicTo(36.554333F, 160.66667F, 0.6666667F, 124.77874F, 0.6666667F, 80.666664F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(106.66666F, 96.666664F);
      ((Path)localObject2).cubicTo(106.66666F, 101.28787F, 104.28978F, 103.66666F, 99.666664F, 103.66666F);
      ((Path)localObject2).lineTo(60.666668F, 103.66666F);
      ((Path)localObject2).cubicTo(56.043552F, 103.66666F, 53.666668F, 101.28787F, 53.666668F, 96.666664F);
      ((Path)localObject2).lineTo(53.666668F, 57.666668F);
      ((Path)localObject2).lineTo(71.666664F, 57.666668F);
      ((Path)localObject2).lineTo(77.666664F, 64.666664F);
      ((Path)localObject2).lineTo(106.66666F, 64.666664F);
      ((Path)localObject2).lineTo(106.66666F, 98.666664F);
      ((Path)localObject2).lineTo(106.66666F, 96.666664F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(79.666664F, 61.666668F);
      ((Path)localObject2).lineTo(73.666664F, 54.666668F);
      ((Path)localObject2).lineTo(53.666668F, 54.666668F);
      ((Path)localObject2).cubicTo(52.085701F, 54.666668F, 50.666668F, 56.086094F, 50.666668F, 57.666668F);
      ((Path)localObject2).lineTo(50.666668F, 96.666664F);
      ((Path)localObject2).cubicTo(50.666668F, 102.8492F, 54.573978F, 106.66666F, 60.666668F, 106.66666F);
      ((Path)localObject2).lineTo(99.666664F, 106.66666F);
      ((Path)localObject2).cubicTo(105.75935F, 106.66666F, 109.66666F, 102.8492F, 109.66666F, 96.666664F);
      ((Path)localObject2).lineTo(109.66666F, 64.666664F);
      ((Path)localObject2).cubicTo(109.66666F, 62.701645F, 108.24101F, 61.278912F, 106.66666F, 61.666668F);
      ((Path)localObject2).lineTo(79.666664F, 61.666668F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-11711155);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(59.666668F, 78.666664F);
      ((Path)localObject1).lineTo(100.66666F, 78.666664F);
      ((Path)localObject1).lineTo(100.66666F, 75.666664F);
      ((Path)localObject1).lineTo(59.666668F, 75.666664F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.pd
 * JD-Core Version:    0.6.2
 */