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

public final class wl extends c
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
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(48.0F, 88.0F);
      ((Path)localObject3).cubicTo(70.091393F, 88.0F, 88.0F, 70.091393F, 88.0F, 48.0F);
      ((Path)localObject3).cubicTo(88.0F, 25.908609F, 70.091393F, 8.0F, 48.0F, 8.0F);
      ((Path)localObject3).cubicTo(25.908609F, 8.0F, 8.0F, 25.908609F, 8.0F, 48.0F);
      ((Path)localObject3).cubicTo(8.0F, 70.091393F, 25.908609F, 88.0F, 48.0F, 88.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(48.0F, 60.0F);
      ((Path)localObject3).cubicTo(54.627419F, 60.0F, 60.0F, 54.627419F, 60.0F, 48.0F);
      ((Path)localObject3).cubicTo(60.0F, 41.372581F, 54.627419F, 36.0F, 48.0F, 36.0F);
      ((Path)localObject3).cubicTo(41.372581F, 36.0F, 36.0F, 41.372581F, 36.0F, 48.0F);
      ((Path)localObject3).cubicTo(36.0F, 54.627419F, 41.372581F, 60.0F, 48.0F, 60.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 10.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-499359);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 2.623663F);
      ((Path)localObject2).cubicTo(8.265033F, -0.6444683F, 17.53581F, -0.805361F, 25.990042F, 1.839312F);
      ((Path)localObject2).cubicTo(25.980083F, 10.899578F, 25.960169F, 19.949789F, 26.0F, 29.0F);
      ((Path)localObject2).cubicTo(17.495979F, 20.040291F, 8.623516F, 11.452647F, 0.0F, 2.623663F);
      ((Path)localObject2).lineTo(0.0F, 2.623663F);
      ((Path)localObject2).lineTo(0.0F, 2.623663F);
      ((Path)localObject2).lineTo(0.0F, 2.623663F);
      ((Path)localObject2).lineTo(0.0F, 2.623663F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9676047);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 53.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0372867F, 0.0F);
      ((Path)localObject3).cubicTo(8.154168F, 3.651844F, 14.891579F, 10.052603F, 19.0F, 17.968275F);
      ((Path)localObject3).cubicTo(12.672432F, 24.30884F, 6.344863F, 30.669468F, 0.0172944F, 37.0F);
      ((Path)localObject3).cubicTo(0.0172944F, 24.670012F, -0.0326864F, 12.340022F, 0.0372867F, 0.0F);
      ((Path)localObject3).lineTo(0.0372867F, 0.0F);
      ((Path)localObject3).lineTo(0.0372867F, 0.0F);
      ((Path)localObject3).lineTo(0.0372867F, 0.0F);
      ((Path)localObject3).lineTo(0.0372867F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16384);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 18.962732F);
      ((Path)localObject2).cubicTo(3.693994F, 10.870102F, 10.040855F, 4.066298F, 17.979437F, 0.0F);
      ((Path)localObject2).cubicTo(24.326298F, 6.324241F, 30.663149F, 12.648482F, 37.0F, 18.982716F);
      ((Path)localObject2).cubicTo(24.666666F, 18.982716F, 12.333333F, 19.032669F, 0.0F, 18.962732F);
      ((Path)localObject2).lineTo(0.0F, 18.962732F);
      ((Path)localObject2).lineTo(0.0F, 18.962732F);
      ((Path)localObject2).lineTo(0.0F, 18.962732F);
      ((Path)localObject2).lineTo(0.0F, 18.962732F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-12799249);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 47.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(-7.105427E-015F, 26.0F);
      ((Path)localObject3).cubicTo(8.894916F, 17.439388F, 17.54834F, 8.640153F, 26.362759F, 0.0F);
      ((Path)localObject3).cubicTo(29.622887F, 8.262333F, 29.824129F, 17.538815F, 27.167728F, 26.0F);
      ((Path)localObject3).cubicTo(18.111818F, 25.990057F, 9.055909F, 25.980114F, -7.105427E-015F, 26.0F);
      ((Path)localObject3).lineTo(-7.105427E-015F, 26.0F);
      ((Path)localObject3).lineTo(-7.105427E-015F, 26.0F);
      ((Path)localObject3).lineTo(-7.105427E-015F, 26.0F);
      ((Path)localObject3).lineTo(-7.105427E-015F, 26.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1124019);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 26.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1.832632F, 0.01995395F);
      ((Path)localObject3).cubicTo(10.885068F, 0.00997698F, 19.937506F, 0.0399079F, 29.0F, 0.0F);
      ((Path)localObject3).cubicTo(19.977737F, 8.450499F, 11.448331F, 17.38987F, 2.59706F, 26.0F);
      ((Path)localObject3).cubicTo(-0.6014681F, 17.729086F, -0.8328081F, 8.470453F, 1.832632F, 0.01995395F);
      ((Path)localObject3).lineTo(1.832632F, 0.01995395F);
      ((Path)localObject3).lineTo(1.832632F, 0.01995395F);
      ((Path)localObject3).lineTo(1.832632F, 0.01995395F);
      ((Path)localObject3).lineTo(1.832632F, 0.01995395F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-5117108);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 36.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 19.053654F);
      ((Path)localObject3).cubicTo(6.336649F, 12.69911F, 12.673299F, 6.354543F, 19.0F, 0.0F);
      ((Path)localObject3).cubicTo(18.850786F, 12.330009F, 19.019896F, 24.669992F, 18.910471F, 37.0F);
      ((Path)localObject3).cubicTo(10.793194F, 33.378807F, 4.088482F, 26.94446F, 0.0F, 19.053654F);
      ((Path)localObject3).lineTo(0.0F, 19.053654F);
      ((Path)localObject3).lineTo(0.0F, 19.053654F);
      ((Path)localObject3).lineTo(0.0F, 19.053654F);
      ((Path)localObject3).lineTo(0.0F, 19.053654F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-10818218);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 26.0F, 0.0F, 1.0F, 47.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 7.105427E-015F);
      ((Path)localObject3).cubicTo(8.487356F, 8.976492F, 17.383142F, 17.54085F, 26.0F, 26.386665F);
      ((Path)localObject3).cubicTo(17.7318F, 29.58322F, 8.457471F, 29.854626F, 0.0199234F, 27.160673F);
      ((Path)localObject3).cubicTo(0.00996169F, 18.103765F, 0.03984674F, 9.056909F, 0.0F, 7.105427E-015F);
      ((Path)localObject3).lineTo(0.0F, 7.105427E-015F);
      ((Path)localObject3).lineTo(0.0F, 7.105427E-015F);
      ((Path)localObject3).lineTo(0.0F, 7.105427E-015F);
      ((Path)localObject3).lineTo(0.0F, 7.105427E-015F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-11083026);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 36.0F, 0.0F, 1.0F, 53.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(-7.105427E-015F, 0.0122606F);
      ((Path)localObject1).cubicTo(12.333333F, 0.0222488F, 24.666666F, -0.0376809F, 37.0F, 0.0422254F);
      ((Path)localObject1).cubicTo(33.306007F, 8.122752F, 26.969156F, 14.944755F, 19.020563F, 19.0F);
      ((Path)localObject1).cubicTo(12.683712F, 12.667424F, 6.32684F, 6.354825F, -7.105427E-015F, 0.0122606F);
      ((Path)localObject1).lineTo(-7.105427E-015F, 0.0122606F);
      ((Path)localObject1).lineTo(-7.105427E-015F, 0.0122606F);
      ((Path)localObject1).lineTo(-7.105427E-015F, 0.0122606F);
      ((Path)localObject1).lineTo(-7.105427E-015F, 0.0122606F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wl
 * JD-Core Version:    0.6.2
 */