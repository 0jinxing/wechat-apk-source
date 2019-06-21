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

public final class qq extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint2.setColor(-789517);
      localPaint2.setStrokeWidth(3.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(192.0F, 0.0F);
      ((Path)localObject3).lineTo(192.0F, 192.0F);
      ((Path)localObject3).lineTo(0.0F, 192.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-10196752);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(90.933334F, 6.12549F);
      ((Path)localObject2).lineTo(90.933334F, 68.243134F);
      ((Path)localObject2).lineTo(124.23529F, 35.631374F);
      ((Path)localObject2).cubicTo(117.14076F, 22.570004F, 105.62276F, 12.023832F, 90.933334F, 6.12549F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-11369488);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(132.0F, 66.776474F);
      ((Path)localObject1).cubicTo(132.0F, 58.296143F, 130.25346F, 49.748177F, 127.325F, 41.929413F);
      ((Path)localObject1).lineTo(82.133331F, 85.25F);
      ((Path)localObject1).lineTo(128.88333F, 85.25F);
      ((Path)localObject1).cubicTo(130.97574F, 80.729019F, 132.0F, 74.109863F, 132.0F, 66.776474F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16731650);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(127.34118F, 90.75F);
      ((Path)localObject1).lineTo(65.223526F, 90.75F);
      ((Path)localObject1).lineTo(97.835297F, 124.23529F);
      ((Path)localObject1).cubicTo(110.91912F, 117.14476F, 121.45267F, 105.64137F, 127.34118F, 90.75F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-10039264);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(66.776474F, 132.0F);
      ((Path)localObject2).cubicTo(75.235451F, 132.0F, 83.795555F, 130.25705F, 91.623528F, 127.34118F);
      ((Path)localObject2).lineTo(46.933334F, 82.305885F);
      ((Path)localObject2).lineTo(46.933334F, 128.89412F);
      ((Path)localObject2).cubicTo(52.813469F, 130.98483F, 59.420761F, 132.0F, 66.776474F, 132.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-6631134);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(41.066666F, 127.34118F);
      ((Path)localObject1).lineTo(41.066666F, 65.223526F);
      ((Path)localObject1).lineTo(7.764706F, 97.835297F);
      ((Path)localObject1).cubicTo(14.859824F, 110.91978F, 26.373886F, 121.45654F, 41.066666F, 127.34118F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-14313);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 66.776474F);
      ((Path)localObject1).cubicTo(0.0F, 75.245605F, 1.740668F, 83.800446F, 4.675F, 91.623528F);
      ((Path)localObject1).lineTo(49.866665F, 46.933334F);
      ((Path)localObject1).lineTo(3.116667F, 46.933334F);
      ((Path)localObject1).cubicTo(1.017017F, 52.817879F, 0.0F, 59.430592F, 0.0F, 66.776474F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-371630);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(65.309807F, 0.0F);
      ((Path)localObject1).cubicTo(72.633575F, 0.0F, 79.258102F, 1.019078F, 85.066666F, 3.105882F);
      ((Path)localObject1).lineTo(85.066666F, 49.694118F);
      ((Path)localObject1).lineTo(40.462746F, 4.658824F);
      ((Path)localObject1).cubicTo(48.276417F, 1.732292F, 56.819073F, 0.0F, 65.309807F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-35310);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.658824F, 41.066666F);
      ((Path)localObject1).lineTo(66.776474F, 41.066666F);
      ((Path)localObject1).lineTo(34.164707F, 7.764706F);
      ((Path)localObject1).cubicTo(21.102251F, 14.861723F, 10.553196F, 26.387012F, 4.658824F, 41.066666F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qq
 * JD-Core Version:    0.6.2
 */