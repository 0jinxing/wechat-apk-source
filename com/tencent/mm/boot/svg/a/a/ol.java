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

public final class ol extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -2041.0F, 0.0F, 1.0F, -765.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 2041.0F, 0.0F, 1.0F, 765.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-4144960);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(33.391903F, 19.063471F);
      ((Path)localObject3).cubicTo(33.619621F, 19.295631F, 33.835602F, 19.538998F, 34.042191F, 19.791971F);
      ((Path)localObject3).lineTo(34.042191F, 1.245654F);
      ((Path)localObject3).cubicTo(31.573284F, 0.441903F, 28.946306F, 0.0F, 26.216816F, 0.0F);
      ((Path)localObject3).cubicTo(22.826082F, 0.0F, 19.591854F, 0.6772644F, 16.625256F, 1.892498F);
      ((Path)localObject3).lineTo(33.401291F, 19.054665F);
      ((Path)localObject3).lineTo(33.391903F, 19.063471F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(25.968216F, 15.787904F);
      ((Path)localObject3).cubicTo(25.974443F, 15.787904F, 25.980671F, 15.787129F, 25.986897F, 15.787129F);
      ((Path)localObject3).cubicTo(26.300591F, 15.787129F, 26.610392F, 15.805709F, 26.91708F, 15.833577F);
      ((Path)localObject3).lineTo(14.180967F, 3.166715F);
      ((Path)localObject3).cubicTo(8.922124F, 5.879218F, 4.724235F, 10.342772F, 2.375037F, 15.786356F);
      ((Path)localObject3).lineTo(25.968216F, 15.786356F);
      ((Path)localObject3).lineTo(25.968216F, 15.787904F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(36.464424F, 2.375037F);
      ((Path)localObject3).lineTo(36.464424F, 25.96822F);
      ((Path)localObject3).cubicTo(36.464424F, 26.288654F, 36.446629F, 26.604424F, 36.417225F, 26.91708F);
      ((Path)localObject3).lineTo(49.084087F, 14.184461F);
      ((Path)localObject3).cubicTo(46.373684F, 8.922952F, 41.909992F, 4.723855F, 36.464424F, 2.375037F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(3.166715F, 38.071529F);
      ((Path)localObject3).cubicTo(5.874467F, 43.327538F, 10.329879F, 47.523945F, 15.76627F, 49.875767F);
      ((Path)localObject3).lineTo(15.76627F, 26.301525F);
      ((Path)localObject3).lineTo(15.786385F, 26.301525F);
      ((Path)localObject3).cubicTo(15.786385F, 26.295301F, 15.785611F, 26.289856F, 15.785611F, 26.28441F);
      ((Path)localObject3).cubicTo(15.785611F, 25.963106F, 15.803405F, 25.646469F, 15.833577F, 25.333723F);
      ((Path)localObject3).lineTo(3.166715F, 38.071529F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(18.877953F, 33.207298F);
      ((Path)localObject3).cubicTo(18.643097F, 32.969006F, 18.419983F, 32.719517F, 18.208612F, 32.458832F);
      ((Path)localObject3).lineTo(18.208612F, 51.00016F);
      ((Path)localObject3).cubicTo(20.68478F, 51.806999F, 23.319084F, 52.250805F, 26.056725F, 52.250805F);
      ((Path)localObject3).cubicTo(29.438652F, 52.250805F, 32.664795F, 51.578304F, 35.625549F, 50.370842F);
      ((Path)localObject3).lineTo(18.849771F, 33.236084F);
      ((Path)localObject3).lineTo(18.877953F, 33.207298F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(50.36517F, 16.625256F);
      ((Path)localObject3).lineTo(33.216125F, 33.399986F);
      ((Path)localObject3).lineTo(33.198532F, 33.382778F);
      ((Path)localObject3).cubicTo(32.963428F, 33.613533F, 32.715527F, 33.833336F, 32.458832F, 34.042191F);
      ((Path)localObject3).lineTo(51.000912F, 34.042191F);
      ((Path)localObject3).cubicTo(51.807781F, 31.568808F, 52.250805F, 28.936632F, 52.250805F, 26.201206F);
      ((Path)localObject3).cubicTo(52.250805F, 22.815754F, 51.575878F, 19.586744F, 50.36517F, 16.625256F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(26.301567F, 36.465168F);
      ((Path)localObject3).cubicTo(25.975065F, 36.465168F, 25.652451F, 36.447384F, 25.333723F, 36.417225F);
      ((Path)localObject3).lineTo(38.068066F, 49.084087F);
      ((Path)localObject3).cubicTo(43.326298F, 46.378433F, 47.524178F, 41.922104F, 49.875767F, 36.484501F);
      ((Path)localObject3).lineTo(26.301567F, 36.484501F);
      ((Path)localObject3).lineTo(26.301567F, 36.465168F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(19.054665F, 18.868826F);
      ((Path)localObject3).cubicTo(19.289227F, 18.637791F, 19.536596F, 18.417719F, 19.791971F, 18.208612F);
      ((Path)localObject3).lineTo(1.245654F, 18.208612F);
      ((Path)localObject3).cubicTo(0.441903F, 20.679518F, 0.0F, 23.30862F, 0.0F, 26.040321F);
      ((Path)localObject3).cubicTo(0.0F, 29.4291F, 0.6748627F, 32.661247F, 1.886894F, 35.625549F);
      ((Path)localObject3).lineTo(19.034651F, 18.849247F);
      ((Path)localObject3).lineTo(19.054665F, 18.868826F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-8421505);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(14.386539F, 0.983613F);
      ((Path)localObject2).cubicTo(16.02746F, 0.09464517F, 17.985523F, -0.2148387F, 19.822016F, 0.1532903F);
      ((Path)localObject2).cubicTo(21.645F, 0.5022581F, 23.300604F, 1.50271F, 24.558016F, 2.839355F);
      ((Path)localObject2).cubicTo(26.095572F, 4.47271F, 27.077539F, 6.57871F, 27.462809F, 8.768903F);
      ((Path)localObject2).cubicTo(28.023682F, 11.919484F, 27.404079F, 15.306968F, 25.57346F, 17.966904F);
      ((Path)localObject2).cubicTo(25.07308F, 18.693291F, 24.482254F, 19.359871F, 23.812731F, 19.938774F);
      ((Path)localObject2).cubicTo(23.522017F, 20.202387F, 23.221905F, 20.478775F, 23.053936F, 20.838774F);
      ((Path)localObject2).cubicTo(22.925905F, 21.113419F, 22.971127F, 21.423485F, 22.963491F, 21.716709F);
      ((Path)localObject2).cubicTo(22.968191F, 21.935614F, 22.927668F, 22.178904F, 23.065683F, 22.369354F);
      ((Path)localObject2).cubicTo(23.343475F, 22.778709F, 23.792175F, 23.026064F, 24.211508F, 23.271677F);
      ((Path)localObject2).cubicTo(27.12746F, 25.072838F, 30.043413F, 26.875162F, 32.959366F, 28.676903F);
      ((Path)localObject2).cubicTo(33.115589F, 28.775032F, 33.271809F, 28.875484F, 33.44154F, 28.952129F);
      ((Path)localObject2).cubicTo(34.395317F, 29.395161F, 35.208729F, 30.129097F, 35.741413F, 31.028517F);
      ((Path)localObject2).cubicTo(36.208317F, 31.808323F, 36.462032F, 32.711227F, 36.470253F, 33.617615F);
      ((Path)localObject2).cubicTo(36.47319F, 34.411354F, 36.470253F, 35.205677F, 36.471428F, 36.0F);
      ((Path)localObject2).lineTo(0.05873016F, 36.0F);
      ((Path)localObject2).cubicTo(0.05931746F, 35.205677F, 0.05755556F, 34.411934F, 0.05931746F, 33.618195F);
      ((Path)localObject2).cubicTo(0.0693016F, 32.558517F, 0.4158095F, 31.505806F, 1.040698F, 30.644711F);
      ((Path)localObject2).cubicTo(1.592762F, 29.870129F, 2.369175F, 29.265097F, 3.240143F, 28.877226F);
      ((Path)localObject2).cubicTo(6.245953F, 27.029032F, 9.244715F, 25.168064F, 12.248175F, 23.315226F);
      ((Path)localObject2).cubicTo(12.65165F, 23.067871F, 13.056889F, 22.807161F, 13.375206F, 22.454128F);
      ((Path)localObject2).cubicTo(13.500889F, 22.317677F, 13.589571F, 22.140581F, 13.567842F, 21.95129F);
      ((Path)localObject2).cubicTo(13.543762F, 21.548903F, 13.642428F, 21.110516F, 13.428651F, 20.743549F);
      ((Path)localObject2).cubicTo(13.174349F, 20.295872F, 12.750905F, 19.983484F, 12.382079F, 19.634516F);
      ((Path)localObject2).cubicTo(10.92792F, 18.261871F, 9.909539F, 16.471161F, 9.361F, 14.566065F);
      ((Path)localObject2).cubicTo(8.418381F, 11.26858F, 8.823619F, 7.577419F, 10.614302F, 4.626F);
      ((Path)localObject2).cubicTo(11.529904F, 3.122129F, 12.81492F, 1.816839F, 14.386539F, 0.983613F);
      ((Path)localObject2).lineTo(14.386539F, 0.983613F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ol
 * JD-Core Version:    0.6.2
 */