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

public final class jf extends c
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
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -102.0F, 0.0F, 1.0F, -1105.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-8683388);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(27.860264F, 42.224224F);
      ((Path)localObject2).lineTo(16.244278F, 48.809719F);
      ((Path)localObject2).lineTo(11.775919F, 32.292778F);
      ((Path)localObject2).cubicTo(11.293263F, 30.495869F, 11.832553F, 28.662212F, 13.041141F, 27.405102F);
      ((Path)localObject2).lineTo(27.860264F, 42.224224F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.487175F, 24.123215F);
      ((Path)localObject2).lineTo(32.122139F, 21.56749F);
      ((Path)localObject2).lineTo(32.157063F, 33.793102F);
      ((Path)localObject2).lineTo(22.487175F, 24.123215F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(58.562431F, 72.926392F);
      ((Path)localObject2).lineTo(62.774803F, 77.138763F);
      ((Path)localObject2).lineTo(51.687485F, 88.06427F);
      ((Path)localObject2).cubicTo(49.648521F, 90.080627F, 46.351482F, 90.080627F, 44.312519F, 88.06427F);
      ((Path)localObject2).lineTo(32.122139F, 76.009048F);
      ((Path)localObject2).lineTo(45.397076F, 68.372643F);
      ((Path)localObject2).cubicTo(47.002213F, 67.428818F, 48.997791F, 67.428818F, 50.646313F, 68.372643F);
      ((Path)localObject2).lineTo(58.562431F, 72.926392F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(72.13884F, 73.774879F);
      ((Path)localObject2).lineTo(63.847919F, 65.483963F);
      ((Path)localObject2).lineTo(63.83448F, 60.77914F);
      ((Path)localObject2).cubicTo(63.83448F, 58.977291F, 64.832268F, 57.261246F, 66.437408F, 56.317421F);
      ((Path)localObject2).lineTo(79.755722F, 48.766819F);
      ((Path)localObject2).lineTo(84.224083F, 65.24086F);
      ((Path)localObject2).cubicTo(84.961578F, 67.986534F, 83.313057F, 70.818008F, 80.536606F, 71.547333F);
      ((Path)localObject2).lineTo(72.13884F, 73.774879F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(32.165524F, 60.822041F);
      ((Path)localObject2).lineTo(32.122139F, 76.009048F);
      ((Path)localObject2).lineTo(15.4634F, 71.590233F);
      ((Path)localObject2).cubicTo(12.686943F, 70.860909F, 11.038423F, 68.029434F, 11.775919F, 65.28376F);
      ((Path)localObject2).lineTo(16.244278F, 48.809719F);
      ((Path)localObject2).lineTo(29.562593F, 56.360321F);
      ((Path)localObject2).cubicTo(31.167734F, 57.261246F, 32.165524F, 58.977291F, 32.165524F, 60.822041F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(63.83448F, 36.754498F);
      ((Path)localObject2).lineTo(63.877865F, 21.56749F);
      ((Path)localObject2).lineTo(80.536606F, 25.986307F);
      ((Path)localObject2).cubicTo(83.313057F, 26.715628F, 84.961578F, 29.547104F, 84.224083F, 32.292778F);
      ((Path)localObject2).lineTo(79.755722F, 48.766819F);
      ((Path)localObject2).lineTo(66.437408F, 41.216217F);
      ((Path)localObject2).cubicTo(64.832268F, 40.315292F, 63.83448F, 38.599247F, 63.83448F, 36.754498F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(45.397076F, 29.203894F);
      ((Path)localObject2).lineTo(32.122139F, 21.56749F);
      ((Path)localObject2).lineTo(44.312519F, 9.512265F);
      ((Path)localObject2).cubicTo(46.351482F, 7.495912F, 49.648521F, 7.495912F, 51.687485F, 9.512265F);
      ((Path)localObject2).lineTo(63.877865F, 21.56749F);
      ((Path)localObject2).lineTo(50.602928F, 29.203894F);
      ((Path)localObject2).cubicTo(48.997791F, 30.147718F, 47.002213F, 30.147718F, 45.397076F, 29.203894F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8683388);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, -0.7071068F, 48.001785F, 0.7071068F, 0.7071068F, -19.882988F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.001786F, 45.401787F);
      ((Path)localObject1).cubicTo(2.001786F, 44.904732F, 2.40473F, 44.501785F, 2.901786F, 44.501785F);
      ((Path)localObject1).lineTo(93.101784F, 44.501785F);
      ((Path)localObject1).cubicTo(93.598839F, 44.501785F, 94.001785F, 44.904732F, 94.001785F, 45.401787F);
      ((Path)localObject1).lineTo(94.001785F, 50.601784F);
      ((Path)localObject1).cubicTo(94.001785F, 51.098839F, 93.598839F, 51.501785F, 93.101784F, 51.501785F);
      ((Path)localObject1).lineTo(2.901786F, 51.501785F);
      ((Path)localObject1).cubicTo(2.40473F, 51.501785F, 2.001786F, 51.098839F, 2.001786F, 50.601784F);
      ((Path)localObject1).lineTo(2.001786F, 45.401787F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.jf
 * JD-Core Version:    0.6.2
 */