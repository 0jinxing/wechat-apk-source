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

public final class aic extends c
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
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-14046139);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(96.0F, 0.0F);
      ((Path)localObject3).lineTo(96.0F, 96.0F);
      ((Path)localObject3).lineTo(0.0F, 96.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject3, c.a(localPaint2, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 51, 4);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(56.400002F, 24.6F);
      ((Path)localObject2).lineTo(48.0F, 24.6F);
      ((Path)localObject2).lineTo(48.0F, 21.0F);
      ((Path)localObject2).lineTo(57.003132F, 21.0F);
      ((Path)localObject2).cubicTo(58.652611F, 21.0F, 60.0F, 22.337517F, 60.0F, 23.987425F);
      ((Path)localObject2).lineTo(60.0F, 63.012573F);
      ((Path)localObject2).cubicTo(60.0F, 64.653236F, 58.662483F, 66.0F, 57.012573F, 66.0F);
      ((Path)localObject2).lineTo(14.987426F, 66.0F);
      ((Path)localObject2).cubicTo(13.346761F, 66.0F, 12.0F, 64.662483F, 12.0F, 63.012573F);
      ((Path)localObject2).lineTo(12.0F, 23.987425F);
      ((Path)localObject2).cubicTo(12.0F, 22.34676F, 13.341744F, 21.0F, 14.99687F, 21.0F);
      ((Path)localObject2).lineTo(24.0F, 21.0F);
      ((Path)localObject2).lineTo(24.0F, 24.6F);
      ((Path)localObject2).lineTo(15.6F, 24.6F);
      ((Path)localObject2).lineTo(15.6F, 62.400002F);
      ((Path)localObject2).lineTo(56.400002F, 62.400002F);
      ((Path)localObject2).lineTo(56.400002F, 24.6F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(37.79998F, 12.784549F);
      ((Path)localObject2).lineTo(37.79998F, 40.5F);
      ((Path)localObject2).lineTo(34.199982F, 40.5F);
      ((Path)localObject2).lineTo(34.199982F, 12.784586F);
      ((Path)localObject2).lineTo(27.938982F, 19.045584F);
      ((Path)localObject2).lineTo(25.393398F, 16.5F);
      ((Path)localObject2).lineTo(33.878681F, 8.014719F);
      ((Path)localObject2).cubicTo(35.050251F, 6.843146F, 36.949749F, 6.843146F, 38.121319F, 8.014719F);
      ((Path)localObject2).lineTo(38.545586F, 8.438983F);
      ((Path)localObject2).lineTo(46.606602F, 16.5F);
      ((Path)localObject2).lineTo(44.061016F, 19.045584F);
      ((Path)localObject2).lineTo(37.79998F, 12.784549F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aic
 * JD-Core Version:    0.6.2
 */