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

public final class apk extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 16.0F);
      ((Path)localObject3).cubicTo(0.0F, 7.163444F, 7.163444F, 0.0F, 16.0F, 0.0F);
      ((Path)localObject3).lineTo(56.0F, 0.0F);
      ((Path)localObject3).cubicTo(64.836555F, 0.0F, 72.0F, 7.163444F, 72.0F, 16.0F);
      ((Path)localObject3).lineTo(72.0F, 56.0F);
      ((Path)localObject3).cubicTo(72.0F, 64.836555F, 64.836555F, 72.0F, 56.0F, 72.0F);
      ((Path)localObject3).lineTo(16.0F, 72.0F);
      ((Path)localObject3).cubicTo(7.163444F, 72.0F, 0.0F, 64.836555F, 0.0F, 56.0F);
      ((Path)localObject3).lineTo(0.0F, 16.0F);
      ((Path)localObject3).close();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 16.0F);
      ((Path)localObject4).cubicTo(0.0F, 7.163444F, 7.163444F, 0.0F, 16.0F, 0.0F);
      ((Path)localObject4).lineTo(56.0F, 0.0F);
      ((Path)localObject4).cubicTo(64.836555F, 0.0F, 72.0F, 7.163444F, 72.0F, 16.0F);
      ((Path)localObject4).lineTo(72.0F, 56.0F);
      ((Path)localObject4).cubicTo(72.0F, 64.836555F, 64.836555F, 72.0F, 56.0F, 72.0F);
      ((Path)localObject4).lineTo(16.0F, 72.0F);
      ((Path)localObject4).cubicTo(7.163444F, 72.0F, 0.0F, 64.836555F, 0.0F, 56.0F);
      ((Path)localObject4).lineTo(0.0F, 16.0F);
      ((Path)localObject4).close();
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 72.0F, 0.0F, 0.0F, 0.0F, 72.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient((Paint)localObject3, 1.0F, 0.0F, 0.5F, 1.076647F, new int[] { -5066062, -5066062, -4605511, -4605511 }, new float[] { 0.0F, 0.4091888F, 0.604568F, 1.0F }, (Matrix)localObject1, 0);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(44.0F, 5.941125F);
      ((Path)localObject3).lineTo(27.247156F, 22.69397F);
      ((Path)localObject3).cubicTo(24.901516F, 25.039608F, 21.102449F, 25.043575F, 18.752844F, 22.69397F);
      ((Path)localObject3).lineTo(0.0F, 3.941125F);
      ((Path)localObject3).lineTo(0.0F, 1.005643F);
      ((Path)localObject3).cubicTo(0.0F, 0.4502417F, 0.449816F, 0.0F, 1.001672F, 0.0F);
      ((Path)localObject3).lineTo(3.129942F, 0.0F);
      ((Path)localObject3).lineTo(22.295103F, 19.165161F);
      ((Path)localObject3).cubicTo(22.679518F, 19.549576F, 23.315594F, 19.554464F, 23.704897F, 19.165161F);
      ((Path)localObject3).lineTo(42.870056F, 0.0F);
      ((Path)localObject3).lineTo(42.998329F, 0.0F);
      ((Path)localObject3).cubicTo(43.551537F, 0.0F, 44.0F, 0.4415441F, 44.0F, 1.005643F);
      ((Path)localObject3).lineTo(44.0F, 5.941125F);
      ((Path)localObject3).lineTo(44.0F, 5.941125F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 6.000244F);
      ((Path)localObject2).cubicTo(0.0F, 2.686401F, 2.683541F, 0.0F, 6.006387F, 0.0F);
      ((Path)localObject2).lineTo(41.993614F, 0.0F);
      ((Path)localObject2).cubicTo(45.310848F, 0.0F, 48.0F, 2.687226F, 48.0F, 6.000244F);
      ((Path)localObject2).lineTo(48.0F, 31.999756F);
      ((Path)localObject2).cubicTo(48.0F, 35.313599F, 45.31646F, 38.0F, 41.993614F, 38.0F);
      ((Path)localObject2).lineTo(6.006387F, 38.0F);
      ((Path)localObject2).cubicTo(2.689151F, 38.0F, 0.0F, 35.312775F, 0.0F, 31.999756F);
      ((Path)localObject2).lineTo(0.0F, 6.000244F);
      ((Path)localObject2).lineTo(0.0F, 6.000244F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(5.0F, 5.996535F);
      ((Path)localObject2).cubicTo(5.0F, 5.446164F, 5.45323F, 5.0F, 5.996875F, 5.0F);
      ((Path)localObject2).lineTo(42.003124F, 5.0F);
      ((Path)localObject2).cubicTo(42.553684F, 5.0F, 43.0F, 5.439813F, 43.0F, 5.996535F);
      ((Path)localObject2).lineTo(43.0F, 32.003464F);
      ((Path)localObject2).cubicTo(43.0F, 32.553837F, 42.546768F, 33.0F, 42.003124F, 33.0F);
      ((Path)localObject2).lineTo(5.996875F, 33.0F);
      ((Path)localObject2).cubicTo(5.446316F, 33.0F, 5.0F, 32.560188F, 5.0F, 32.003464F);
      ((Path)localObject2).lineTo(5.0F, 5.996535F);
      ((Path)localObject2).lineTo(5.0F, 5.996535F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apk
 * JD-Core Version:    0.6.2
 */