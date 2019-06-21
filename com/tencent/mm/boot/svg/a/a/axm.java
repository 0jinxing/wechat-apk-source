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

public final class axm extends c
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
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 76, 4);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject4 = c.a((float[])localObject4, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 53.63604F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(37.79998F, 15.784549F);
      ((Path)localObject1).lineTo(37.79998F, 43.5F);
      ((Path)localObject1).lineTo(34.199982F, 43.5F);
      ((Path)localObject1).lineTo(34.199982F, 15.784586F);
      ((Path)localObject1).lineTo(27.938982F, 22.045584F);
      ((Path)localObject1).lineTo(25.393398F, 19.5F);
      ((Path)localObject1).lineTo(33.878681F, 11.014719F);
      ((Path)localObject1).cubicTo(35.050251F, 9.843145F, 36.949749F, 9.843145F, 38.121319F, 11.014719F);
      ((Path)localObject1).lineTo(38.545586F, 11.438983F);
      ((Path)localObject1).lineTo(46.606602F, 19.5F);
      ((Path)localObject1).lineTo(44.061016F, 22.045584F);
      ((Path)localObject1).lineTo(37.79998F, 15.784549F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(56.400002F, 24.6F);
      ((Path)localObject3).lineTo(48.0F, 24.6F);
      ((Path)localObject3).lineTo(48.0F, 21.0F);
      ((Path)localObject3).lineTo(57.003132F, 21.0F);
      ((Path)localObject3).cubicTo(58.652611F, 21.0F, 60.0F, 22.337517F, 60.0F, 23.987425F);
      ((Path)localObject3).lineTo(60.0F, 63.012573F);
      ((Path)localObject3).cubicTo(60.0F, 64.653236F, 58.662483F, 66.0F, 57.012573F, 66.0F);
      ((Path)localObject3).lineTo(14.987426F, 66.0F);
      ((Path)localObject3).cubicTo(13.346761F, 66.0F, 12.0F, 64.662483F, 12.0F, 63.012573F);
      ((Path)localObject3).lineTo(12.0F, 23.987425F);
      ((Path)localObject3).cubicTo(12.0F, 22.34676F, 13.341744F, 21.0F, 14.99687F, 21.0F);
      ((Path)localObject3).lineTo(24.0F, 21.0F);
      ((Path)localObject3).lineTo(24.0F, 24.6F);
      ((Path)localObject3).lineTo(15.6F, 24.6F);
      ((Path)localObject3).lineTo(15.6F, 62.400002F);
      ((Path)localObject3).lineTo(56.400002F, 62.400002F);
      ((Path)localObject3).lineTo(56.400002F, 24.6F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.axm
 * JD-Core Version:    0.6.2
 */