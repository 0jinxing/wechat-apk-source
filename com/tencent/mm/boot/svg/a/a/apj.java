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

public final class apj extends c
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
      Matrix localMatrix = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-2565928);
      localCanvas.save();
      Object localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 16.0F);
      ((Path)localObject2).cubicTo(0.0F, 7.163444F, 7.163444F, 0.0F, 16.0F, 0.0F);
      ((Path)localObject2).lineTo(56.0F, 0.0F);
      ((Path)localObject2).cubicTo(64.836555F, 0.0F, 72.0F, 7.163444F, 72.0F, 16.0F);
      ((Path)localObject2).lineTo(72.0F, 56.0F);
      ((Path)localObject2).cubicTo(72.0F, 64.836555F, 64.836555F, 72.0F, 56.0F, 72.0F);
      ((Path)localObject2).lineTo(16.0F, 72.0F);
      ((Path)localObject2).cubicTo(7.163444F, 72.0F, 0.0F, 64.836555F, 0.0F, 56.0F);
      ((Path)localObject2).lineTo(0.0F, 16.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 16.0F);
      ((Path)localObject2).cubicTo(0.0F, 7.163444F, 7.163444F, 0.0F, 16.0F, 0.0F);
      ((Path)localObject2).lineTo(56.0F, 0.0F);
      ((Path)localObject2).cubicTo(64.836555F, 0.0F, 72.0F, 7.163444F, 72.0F, 16.0F);
      ((Path)localObject2).lineTo(72.0F, 56.0F);
      ((Path)localObject2).cubicTo(72.0F, 64.836555F, 64.836555F, 72.0F, 56.0F, 72.0F);
      ((Path)localObject2).lineTo(16.0F, 72.0F);
      ((Path)localObject2).cubicTo(7.163444F, 72.0F, 0.0F, 64.836555F, 0.0F, 56.0F);
      ((Path)localObject2).lineTo(0.0F, 16.0F);
      ((Path)localObject2).close();
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
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient((Paint)localObject3, 1.0F, 0.0F, 0.5F, 1.076647F, new int[] { -4923895, -994809, -868352, -1352192 }, new float[] { 0.0F, 0.4091888F, 0.604568F, 1.0F }, localMatrix, 0);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 19.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      localCanvas.concat(localMatrix);
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-2565928);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(44.0F, 5.830662F);
      ((Path)localObject2).lineTo(27.247156F, 22.272018F);
      ((Path)localObject2).cubicTo(24.901516F, 24.574047F, 21.102449F, 24.57794F, 18.752844F, 22.272018F);
      ((Path)localObject2).lineTo(0.0F, 3.867848F);
      ((Path)localObject2).lineTo(0.0F, 0.986945F);
      ((Path)localObject2).cubicTo(0.0F, 0.4418703F, 0.449816F, 0.0F, 1.001672F, 0.0F);
      ((Path)localObject2).lineTo(3.129942F, 0.0F);
      ((Path)localObject2).lineTo(22.295103F, 18.808823F);
      ((Path)localObject2).cubicTo(22.679518F, 19.18609F, 23.315594F, 19.190887F, 23.704897F, 18.808823F);
      ((Path)localObject2).lineTo(42.870056F, 0.0F);
      ((Path)localObject2).lineTo(42.998329F, 0.0F);
      ((Path)localObject2).cubicTo(43.551537F, 0.0F, 44.0F, 0.4333345F, 44.0F, 0.986945F);
      ((Path)localObject2).lineTo(44.0F, 5.830662F);
      ((Path)localObject2).lineTo(44.0F, 5.830662F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(44.0F, 5.830662F);
      ((Path)localObject3).lineTo(27.247156F, 22.272018F);
      ((Path)localObject3).cubicTo(24.901516F, 24.574047F, 21.102449F, 24.57794F, 18.752844F, 22.272018F);
      ((Path)localObject3).lineTo(0.0F, 3.867848F);
      ((Path)localObject3).lineTo(0.0F, 0.986945F);
      ((Path)localObject3).cubicTo(0.0F, 0.4418703F, 0.449816F, 0.0F, 1.001672F, 0.0F);
      ((Path)localObject3).lineTo(3.129942F, 0.0F);
      ((Path)localObject3).lineTo(22.295103F, 18.808823F);
      ((Path)localObject3).cubicTo(22.679518F, 19.18609F, 23.315594F, 19.190887F, 23.704897F, 18.808823F);
      ((Path)localObject3).lineTo(42.870056F, 0.0F);
      ((Path)localObject3).lineTo(42.998329F, 0.0F);
      ((Path)localObject3).cubicTo(43.551537F, 0.0F, 44.0F, 0.4333345F, 44.0F, 0.986945F);
      ((Path)localObject3).lineTo(44.0F, 5.830662F);
      ((Path)localObject3).lineTo(44.0F, 5.830662F);
      ((Path)localObject3).close();
      localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.FILL);
      localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      localPaint2.setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 44.0F, 0.0F, 0.0F, 0.0F, 24.57794F, 0.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient((Paint)localObject2, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -657160, -1577489 }, new float[] { 0.0F, 1.0F }, localMatrix, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 17.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      localCanvas.concat(localMatrix);
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-2565928);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
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
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 6.000244F);
      ((Path)localObject1).cubicTo(0.0F, 2.686401F, 2.683541F, 0.0F, 6.006387F, 0.0F);
      ((Path)localObject1).lineTo(41.993614F, 0.0F);
      ((Path)localObject1).cubicTo(45.310848F, 0.0F, 48.0F, 2.687226F, 48.0F, 6.000244F);
      ((Path)localObject1).lineTo(48.0F, 31.999756F);
      ((Path)localObject1).cubicTo(48.0F, 35.313599F, 45.31646F, 38.0F, 41.993614F, 38.0F);
      ((Path)localObject1).lineTo(6.006387F, 38.0F);
      ((Path)localObject1).cubicTo(2.689151F, 38.0F, 0.0F, 35.312775F, 0.0F, 31.999756F);
      ((Path)localObject1).lineTo(0.0F, 6.000244F);
      ((Path)localObject1).lineTo(0.0F, 6.000244F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(5.0F, 5.996535F);
      ((Path)localObject1).cubicTo(5.0F, 5.446164F, 5.45323F, 5.0F, 5.996875F, 5.0F);
      ((Path)localObject1).lineTo(42.003124F, 5.0F);
      ((Path)localObject1).cubicTo(42.553684F, 5.0F, 43.0F, 5.439813F, 43.0F, 5.996535F);
      ((Path)localObject1).lineTo(43.0F, 32.003464F);
      ((Path)localObject1).cubicTo(43.0F, 32.553837F, 42.546768F, 33.0F, 42.003124F, 33.0F);
      ((Path)localObject1).lineTo(5.996875F, 33.0F);
      ((Path)localObject1).cubicTo(5.446316F, 33.0F, 5.0F, 32.560188F, 5.0F, 32.003464F);
      ((Path)localObject1).lineTo(5.0F, 5.996535F);
      ((Path)localObject1).lineTo(5.0F, 5.996535F);
      ((Path)localObject1).close();
      localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.FILL);
      localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint2.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 48.0F, 0.0F, 0.0F, 0.0F, 38.0F, 0.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient((Paint)localObject2, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -525831, -1380109, -2037267 }, new float[] { 0.0F, 0.565661F, 1.0F }, localMatrix, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apj
 * JD-Core Version:    0.6.2
 */