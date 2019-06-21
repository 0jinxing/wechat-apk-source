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

public final class wr extends c
{
  private final int height = 40;
  private final int width = 40;

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
        paramInt = 40;
        continue;
        paramInt = 40;
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
      ((Paint)localObject3).setColor(-6710887);
      localObject2 = c.a((float[])localObject2, -6.123234E-017F, -1.0F, 40.000004F, -1.0F, 6.123234E-017F, 40.028648F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(35.940868F, 3.862609F);
      ((Path)localObject1).cubicTo(31.874783F, -0.2034783F, 25.262609F, -0.2156522F, 21.191305F, 3.853913F);
      ((Path)localObject1).lineTo(17.493914F, 7.551304F);
      ((Path)localObject1).lineTo(19.953043F, 10.010435F);
      ((Path)localObject1).lineTo(23.634783F, 6.330435F);
      ((Path)localObject1).cubicTo(26.356522F, 3.608696F, 30.770435F, 3.610435F, 33.48F, 6.321739F);
      ((Path)localObject1).cubicTo(36.196522F, 9.038261F, 36.193043F, 13.446957F, 33.471306F, 16.166956F);
      ((Path)localObject1).lineTo(27.33913F, 22.299129F);
      ((Path)localObject1).cubicTo(24.617392F, 25.02087F, 20.203478F, 25.019131F, 17.493914F, 22.307827F);
      ((Path)localObject1).lineTo(15.034782F, 24.766956F);
      ((Path)localObject1).cubicTo(19.10087F, 28.833044F, 25.713043F, 28.845217F, 29.784348F, 24.775652F);
      ((Path)localObject1).lineTo(35.949566F, 18.610435F);
      ((Path)localObject1).cubicTo(40.005219F, 14.553043F, 40.015652F, 7.937391F, 35.940868F, 3.862609F);
      ((Path)localObject1).lineTo(35.940868F, 3.862609F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(23.732174F, 16.017391F);
      ((Path)localObject3).cubicTo(19.666086F, 11.951304F, 13.050435F, 11.942609F, 8.975652F, 16.017391F);
      ((Path)localObject3).lineTo(3.692174F, 21.354782F);
      ((Path)localObject3).cubicTo(-0.3843478F, 25.431305F, -0.3739131F, 32.027824F, 3.70087F, 36.102608F);
      ((Path)localObject3).cubicTo(7.766956F, 40.168697F, 14.37913F, 40.18261F, 18.448696F, 36.111305F);
      ((Path)localObject3).lineTo(21.184347F, 33.375652F);
      ((Path)localObject3).lineTo(18.725218F, 30.916521F);
      ((Path)localObject3).lineTo(15.876522F, 33.765217F);
      ((Path)localObject3).cubicTo(13.165217F, 36.476521F, 8.76F, 36.466087F, 6.048696F, 33.754784F);
      ((Path)localObject3).cubicTo(3.332174F, 31.038261F, 3.330435F, 26.634783F, 6.038261F, 23.926956F);
      ((Path)localObject3).lineTo(11.50087F, 18.495653F);
      ((Path)localObject3).cubicTo(14.213913F, 15.782609F, 18.622608F, 15.789565F, 21.333914F, 18.50087F);
      ((Path)localObject3).cubicTo(21.44174F, 18.608696F, 21.546087F, 18.719999F, 21.645218F, 18.833044F);
      ((Path)localObject3).lineTo(24.088696F, 16.389565F);
      ((Path)localObject3).cubicTo(23.972174F, 16.264347F, 23.853912F, 16.140869F, 23.732174F, 16.017391F);
      ((Path)localObject3).lineTo(23.732174F, 16.017391F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wr
 * JD-Core Version:    0.6.2
 */