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

public final class aw extends c
{
  private final int height = 48;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 48;
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
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-9342607);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(22.700001F, 0.0F);
      ((Path)localObject3).lineTo(25.07F, 0.0F);
      ((Path)localObject3).cubicTo(37.02F, 0.35F, 47.450001F, 10.65F, 48.0F, 22.58F);
      ((Path)localObject3).lineTo(48.0F, 25.35F);
      ((Path)localObject3).cubicTo(47.490002F, 37.130001F, 37.360001F, 47.34F, 25.6F, 48.0F);
      ((Path)localObject3).lineTo(22.6F, 48.0F);
      ((Path)localObject3).cubicTo(10.77F, 47.459999F, 0.55F, 37.220001F, 0.0F, 25.4F);
      ((Path)localObject3).lineTo(0.0F, 22.73F);
      ((Path)localObject3).cubicTo(0.46F, 10.81F, 10.8F, 0.49F, 22.700001F, 0.0F);
      ((Path)localObject3).lineTo(22.700001F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(22.0F, 12.0F);
      ((Path)localObject3).cubicTo(22.171429F, 17.652987F, 22.371429F, 23.305975F, 22.571428F, 28.958961F);
      ((Path)localObject3).cubicTo(23.514286F, 28.979481F, 24.457144F, 28.98974F, 25.409523F, 29.0F);
      ((Path)localObject3).cubicTo(25.523809F, 23.326494F, 25.771429F, 17.663246F, 26.0F, 12.0F);
      ((Path)localObject3).cubicTo(24.666666F, 12.01026F, 23.333334F, 12.01026F, 22.0F, 12.0F);
      ((Path)localObject3).lineTo(22.0F, 12.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(23.251102F, 31.157341F);
      ((Path)localObject3).cubicTo(22.210506F, 31.45582F, 21.597021F, 33.081738F, 22.303694F, 33.977173F);
      ((Path)localObject3).cubicTo(22.948242F, 35.658073F, 25.883654F, 35.147518F, 25.953545F, 33.317379F);
      ((Path)localObject3).cubicTo(26.302998F, 31.817135F, 24.610088F, 30.544678F, 23.251102F, 31.157341F);
      ((Path)localObject3).lineTo(23.251102F, 31.157341F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).cubicTo(1.333333F, 0.01025951F, 2.666667F, 0.01025951F, 4.0F, 0.0F);
      ((Path)localObject2).cubicTo(3.771429F, 5.663247F, 3.523809F, 11.326493F, 3.409524F, 17.0F);
      ((Path)localObject2).cubicTo(2.457143F, 16.98974F, 1.514286F, 16.979481F, 0.571429F, 16.958961F);
      ((Path)localObject2).cubicTo(0.3714286F, 11.305975F, 0.1714286F, 5.652988F, 0.0F, 0.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aw
 * JD-Core Version:    0.6.2
 */