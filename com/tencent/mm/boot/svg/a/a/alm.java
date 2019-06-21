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

public final class alm extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      Object localObject4 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject4).setColor(-855638017);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 26.584616F);
      ((Path)localObject4).cubicTo(0.0F, 11.902337F, 11.902337F, 0.0F, 26.584616F, 0.0F);
      ((Path)localObject4).lineTo(117.41538F, 0.0F);
      ((Path)localObject4).cubicTo(132.09766F, 0.0F, 144.0F, 11.902337F, 144.0F, 26.584616F);
      ((Path)localObject4).lineTo(144.0F, 117.41538F);
      ((Path)localObject4).cubicTo(144.0F, 132.09766F, 132.09766F, 144.0F, 117.41538F, 144.0F);
      ((Path)localObject4).lineTo(26.584616F, 144.0F);
      ((Path)localObject4).cubicTo(11.902337F, 144.0F, 0.0F, 132.09766F, 0.0F, 117.41538F);
      ((Path)localObject4).lineTo(0.0F, 26.584616F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 41.446156F, 0.0F, 1.0F, 43.661537F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(3.101538F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(17.944616F, 9.969231F);
      ((Path)localObject1).lineTo(61.809231F, 9.969231F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(3.101538F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(17.944616F, 29.907692F);
      ((Path)localObject2).lineTo(61.809231F, 29.907692F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(3.101538F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(17.944616F, 49.846153F);
      ((Path)localObject1).lineTo(61.809231F, 49.846153F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.606058F, 15.0F);
      ((Path)localObject1).lineTo(3.606058F, 5.918654F);
      ((Path)localObject1).lineTo(3.559327F, 5.918654F);
      ((Path)localObject1).lineTo(0.6931731F, 7.896923F);
      ((Path)localObject1).lineTo(0.6931731F, 5.778462F);
      ((Path)localObject1).lineTo(3.598269F, 3.76125F);
      ((Path)localObject1).lineTo(5.934808F, 3.76125F);
      ((Path)localObject1).lineTo(5.934808F, 15.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.606058F, 15.0F);
      ((Path)localObject1).lineTo(3.606058F, 5.918654F);
      ((Path)localObject1).lineTo(3.559327F, 5.918654F);
      ((Path)localObject1).lineTo(0.6931731F, 7.896923F);
      ((Path)localObject1).lineTo(0.6931731F, 5.778462F);
      ((Path)localObject1).lineTo(3.598269F, 3.76125F);
      ((Path)localObject1).lineTo(5.934808F, 3.76125F);
      ((Path)localObject1).lineTo(5.934808F, 15.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.6620193F, 27.079905F);
      ((Path)localObject1).cubicTo(0.6620193F, 24.953653F, 2.359904F, 23.450481F, 4.813269F, 23.450481F);
      ((Path)localObject1).cubicTo(7.180962F, 23.450481F, 8.80875F, 24.821251F, 8.80875F, 26.698269F);
      ((Path)localObject1).cubicTo(8.80875F, 28.100193F, 7.874135F, 29.151634F, 6.635769F, 30.382212F);
      ((Path)localObject1).lineTo(3.894231F, 33.022499F);
      ((Path)localObject1).lineTo(3.894231F, 33.069229F);
      ((Path)localObject1).lineTo(8.96452F, 33.069229F);
      ((Path)localObject1).lineTo(8.96452F, 34.938461F);
      ((Path)localObject1).lineTo(0.794423F, 34.938461F);
      ((Path)localObject1).lineTo(0.794423F, 33.357403F);
      ((Path)localObject1).lineTo(5.031346F, 29.276251F);
      ((Path)localObject1).cubicTo(6.168461F, 28.139135F, 6.518942F, 27.570578F, 6.518942F, 26.791731F);
      ((Path)localObject1).cubicTo(6.518942F, 25.950577F, 5.779038F, 25.280769F, 4.735385F, 25.280769F);
      ((Path)localObject1).cubicTo(3.645F, 25.280769F, 2.842789F, 26.044039F, 2.842789F, 27.079905F);
      ((Path)localObject1).lineTo(2.842789F, 27.118847F);
      ((Path)localObject1).lineTo(0.6620193F, 27.118847F);
      ((Path)localObject1).lineTo(0.6620193F, 27.079905F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(3.528173F, 49.970192F);
      ((Path)localObject3).lineTo(3.528173F, 48.272308F);
      ((Path)localObject3).lineTo(4.891154F, 48.272308F);
      ((Path)localObject3).cubicTo(5.965962F, 48.272308F, 6.690289F, 47.633656F, 6.690289F, 46.706825F);
      ((Path)localObject3).cubicTo(6.690289F, 45.795578F, 6.043846F, 45.195866F, 4.875577F, 45.195866F);
      ((Path)localObject3).cubicTo(3.785192F, 45.195866F, 3.060865F, 45.842308F, 2.998558F, 46.823654F);
      ((Path)localObject3).lineTo(0.8333654F, 46.823654F);
      ((Path)localObject3).cubicTo(0.9190385F, 44.744133F, 2.539038F, 43.388943F, 4.976827F, 43.388943F);
      ((Path)localObject3).cubicTo(7.313366F, 43.388943F, 8.91F, 44.588364F, 8.91F, 46.387501F);
      ((Path)localObject3).cubicTo(8.91F, 47.766056F, 7.967596F, 48.762981F, 6.589038F, 49.012211F);
      ((Path)localObject3).lineTo(6.589038F, 49.058941F);
      ((Path)localObject3).cubicTo(8.263557F, 49.199135F, 9.346154F, 50.211636F, 9.346154F, 51.769325F);
      ((Path)localObject3).cubicTo(9.346154F, 53.786537F, 7.515865F, 55.126152F, 4.922308F, 55.126152F);
      ((Path)localObject3).cubicTo(2.383269F, 55.126152F, 0.7243269F, 53.732018F, 0.6152884F, 51.66029F);
      ((Path)localObject3).lineTo(2.866154F, 51.66029F);
      ((Path)localObject3).cubicTo(2.93625F, 52.610481F, 3.715096F, 53.233559F, 4.953462F, 53.233559F);
      ((Path)localObject3).cubicTo(6.12952F, 53.233559F, 6.955096F, 52.571537F, 6.955096F, 51.621346F);
      ((Path)localObject3).cubicTo(6.955096F, 50.593269F, 6.184039F, 49.970192F, 4.914519F, 49.970192F);
      ((Path)localObject3).lineTo(3.528173F, 49.970192F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alm
 * JD-Core Version:    0.6.2
 */