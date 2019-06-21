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

public final class o extends c
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
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-3355444);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 20.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.987003F, 13.975044F);
      ((Path)localObject1).cubicTo(21.005089F, 9.323351F, 27.003181F, 4.651693F, 33.021267F, 0.0F);
      ((Path)localObject1).lineTo(37.0F, 0.0F);
      ((Path)localObject1).lineTo(37.0F, 56.0F);
      ((Path)localObject1).cubicTo(35.340527F, 55.740463F, 33.401146F, 56.139751F, 32.031582F, 54.961853F);
      ((Path)localObject1).cubicTo(26.323397F, 50.619606F, 20.645203F, 46.247414F, 14.937019F, 41.91515F);
      ((Path)localObject1).cubicTo(10.648384F, 41.835293F, 6.339755F, 42.134758F, 2.061116F, 41.785381F);
      ((Path)localObject1).cubicTo(0.2217014F, 41.605705F, -0.06820635F, 39.499466F, 0.0117682F, 38.032085F);
      ((Path)localObject1).cubicTo(0.0017714F, 31.314081F, 0.0017714F, 24.596079F, 0.0117682F, 17.878075F);
      ((Path)localObject1).cubicTo(-0.05820953F, 16.440641F, 0.211705F, 14.274509F, 2.051119F, 14.144741F);
      ((Path)localObject1).cubicTo(6.349752F, 13.735473F, 10.678374F, 14.074866F, 14.987003F, 13.975044F);
      ((Path)localObject1).lineTo(14.987003F, 13.975044F);
      ((Path)localObject1).lineTo(14.987003F, 13.975044F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(52.339943F, 7.684289F);
      ((Path)localObject2).cubicTo(49.137051F, 5.601287F, 52.269878F, 0.3937841F, 55.58287F, 2.486704F);
      ((Path)localObject2).cubicTo(67.533661F, 9.856561F, 72.358017F, 26.480894F, 66.532761F, 39.147526F);
      ((Path)localObject2).cubicTo(64.270714F, 44.424461F, 60.207047F, 48.669819F, 55.58287F, 51.992699F);
      ((Path)localObject2).cubicTo(52.500084F, 52.151405F, 49.997826F, 49.701397F, 51.39909F, 46.686008F);
      ((Path)localObject2).cubicTo(59.506413F, 42.37122F, 64.410843F, 32.839008F, 62.689285F, 23.80275F);
      ((Path)localObject2).cubicTo(61.758446F, 17.206579F, 57.504604F, 11.681667F, 52.339943F, 7.684289F);
      ((Path)localObject2).lineTo(52.339943F, 7.684289F);
      ((Path)localObject2).lineTo(52.339943F, 7.684289F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(44.386761F, 13.448668F);
      ((Path)localObject3).cubicTo(47.041458F, 11.830107F, 48.881649F, 14.987299F, 50.440281F, 16.635832F);
      ((Path)localObject3).cubicTo(54.512833F, 20.991959F, 56.161964F, 27.55612F, 54.130718F, 33.21109F);
      ((Path)localObject3).cubicTo(52.984367F, 36.618057F, 50.440281F, 39.365616F, 47.574409F, 41.463749F);
      ((Path)localObject3).cubicTo(46.025837F, 42.682663F, 43.481747F, 41.693542F, 43.05941F, 39.805225F);
      ((Path)localObject3).cubicTo(42.808018F, 38.606289F, 43.421413F, 37.467304F, 43.652695F, 36.318325F);
      ((Path)localObject3).cubicTo(45.301826F, 35.149364F, 47.162128F, 34.02037F, 48.036972F, 32.112068F);
      ((Path)localObject3).cubicTo(50.239166F, 27.815887F, 48.348698F, 22.320776F, 44.477261F, 19.643158F);
      ((Path)localObject3).cubicTo(43.300747F, 17.834766F, 41.94323F, 14.857414F, 44.386761F, 13.448668F);
      ((Path)localObject3).lineTo(44.386761F, 13.448668F);
      ((Path)localObject3).lineTo(44.386761F, 13.448668F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.o
 * JD-Core Version:    0.6.2
 */