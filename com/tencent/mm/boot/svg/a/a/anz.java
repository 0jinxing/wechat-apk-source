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

public final class anz extends c
{
  private final int height = 168;
  private final int width = 168;

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
        paramInt = 168;
        continue;
        paramInt = 168;
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8617594);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 50.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(53.458427F, 68.672852F);
      ((Path)localObject1).cubicTo(83.841217F, 68.672852F, 105.82796F, 35.957947F, 105.82796F, 35.957947F);
      ((Path)localObject1).cubicTo(106.46974F, 35.062405F, 106.47585F, 33.603374F, 105.81945F, 32.703407F);
      ((Path)localObject1).cubicTo(105.81945F, 32.703407F, 83.841217F, 2.496345E-015F, 53.458427F, 0.0F);
      ((Path)localObject1).cubicTo(23.075638F, -2.496345E-015F, 1.088889F, 32.714905F, 1.088889F, 32.714905F);
      ((Path)localObject1).cubicTo(0.4471118F, 33.610447F, 0.4410017F, 35.069477F, 1.097409F, 35.969444F);
      ((Path)localObject1).cubicTo(1.097409F, 35.969444F, 23.075642F, 68.672852F, 53.458427F, 68.672852F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(53.458427F, 54.626133F);
      ((Path)localObject1).cubicTo(64.858315F, 54.626133F, 74.099747F, 45.542122F, 74.099747F, 34.336426F);
      ((Path)localObject1).cubicTo(74.099747F, 23.13073F, 64.858315F, 14.04672F, 53.458427F, 14.04672F);
      ((Path)localObject1).cubicTo(42.058544F, 14.04672F, 32.817112F, 23.13073F, 32.817112F, 34.336426F);
      ((Path)localObject1).cubicTo(32.817112F, 45.542122F, 42.058544F, 54.626133F, 53.458427F, 54.626133F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(41.175587F, 25.241171F);
      ((Path)localObject1).cubicTo(39.181583F, 27.849945F, 38.0F, 31.093002F, 38.0F, 34.607468F);
      ((Path)localObject1).cubicTo(38.0F, 43.227589F, 45.108429F, 50.214931F, 53.877937F, 50.214931F);
      ((Path)localObject1).cubicTo(62.647442F, 50.214931F, 69.755875F, 43.227589F, 69.755875F, 34.607468F);
      ((Path)localObject1).cubicTo(69.755875F, 25.987343F, 62.647442F, 19.0F, 53.877937F, 19.0F);
      ((Path)localObject1).cubicTo(51.331928F, 19.0F, 48.92593F, 19.588953F, 46.793247F, 20.635828F);
      ((Path)localObject1).cubicTo(49.016388F, 21.031485F, 50.702347F, 22.943605F, 50.702347F, 25.242987F);
      ((Path)localObject1).cubicTo(50.702347F, 27.829023F, 48.56982F, 29.925226F, 45.938969F, 29.925226F);
      ((Path)localObject1).cubicTo(43.308117F, 29.925226F, 41.175587F, 27.829023F, 41.175587F, 25.242987F);
      ((Path)localObject1).cubicTo(41.175587F, 25.24238F, 41.175587F, 25.241776F, 41.175587F, 25.241171F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anz
 * JD-Core Version:    0.6.2
 */