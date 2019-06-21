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

public final class apc extends c
{
  private final int height = 76;
  private final int width = 76;

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
        paramInt = 76;
        continue;
        paramInt = 76;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-789517);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 4.0F);
      ((Path)localObject3).cubicTo(0.0F, 1.790861F, 1.790861F, 0.0F, 4.0F, 0.0F);
      ((Path)localObject3).lineTo(72.0F, 0.0F);
      ((Path)localObject3).cubicTo(74.209137F, 0.0F, 76.0F, 1.790861F, 76.0F, 4.0F);
      ((Path)localObject3).lineTo(76.0F, 72.0F);
      ((Path)localObject3).cubicTo(76.0F, 74.209137F, 74.209137F, 76.0F, 72.0F, 76.0F);
      ((Path)localObject3).lineTo(4.0F, 76.0F);
      ((Path)localObject3).cubicTo(1.790861F, 76.0F, 0.0F, 74.209137F, 0.0F, 72.0F);
      ((Path)localObject3).lineTo(0.0F, 4.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-5658199);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 18.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.707012F, 6.412617F);
      ((Path)localObject1).cubicTo(6.347564F, 3.091073F, 10.084194F, -0.3609254F, 14.617972F, 0.0304348F);
      ((Path)localObject1).cubicTo(16.40159F, 5.148222F, 19.90904F, 9.844545F, 19.92897F, 15.433972F);
      ((Path)localObject1).cubicTo(17.168846F, 17.220181F, 12.874211F, 18.815727F, 13.252857F, 22.849749F);
      ((Path)localObject1).cubicTo(14.059969F, 27.385513F, 16.501234F, 31.840998F, 19.958862F, 34.871532F);
      ((Path)localObject1).cubicTo(23.376635F, 37.169518F, 26.385868F, 33.416473F, 28.398664F, 31.048243F);
      ((Path)localObject1).cubicTo(29.494743F, 31.028173F, 30.580858F, 31.018139F, 31.676935F, 31.018139F);
      ((Path)localObject1).cubicTo(35.134563F, 33.908184F, 38.651978F, 36.727985F, 42.0F, 39.748482F);
      ((Path)localObject1).cubicTo(41.15303F, 41.805634F, 40.993603F, 44.49498F, 38.891125F, 45.729271F);
      ((Path)localObject1).cubicTo(35.463387F, 48.288162F, 31.447756F, 50.736675F, 26.973764F, 49.793396F);
      ((Path)localObject1).cubicTo(17.358168F, 48.248024F, 10.452875F, 40.149879F, 5.729775F, 32.152081F);
      ((Path)localObject1).cubicTo(1.425176F, 24.545643F, -1.324984F, 14.320102F, 3.707012F, 6.412617F);
      ((Path)localObject1).lineTo(3.707012F, 6.412617F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apc
 * JD-Core Version:    0.6.2
 */