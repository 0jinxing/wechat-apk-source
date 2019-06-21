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

public final class amn extends c
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
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 19.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.0F, 6.0F);
      ((Path)localObject1).cubicTo(19.673405F, 4.218915F, 36.356895F, 2.132536F, 53.0F, -3.552714E-015F);
      ((Path)localObject1).cubicTo(54.563484F, -0.2662959F, 56.399273F, 0.3989264F, 57.0F, 2.0F);
      ((Path)localObject1).cubicTo(57.155781F, 5.327619F, 56.883438F, 8.673888F, 57.0F, 12.0F);
      ((Path)localObject1).cubicTo(38.97945F, 10.115204F, 20.994768F, 8.169932F, 3.0F, 6.0F);
      ((Path)localObject1).lineTo(3.0F, 6.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1.0F, 10.0F);
      ((Path)localObject3).cubicTo(2.858211F, 9.652563F, 4.547154F, 10.303478F, 6.0F, 10.0F);
      ((Path)localObject3).cubicTo(22.725773F, 12.346351F, 39.365356F, 14.088799F, 56.0F, 16.0F);
      ((Path)localObject3).cubicTo(57.334106F, 16.161715F, 58.083637F, 17.643797F, 58.0F, 19.0F);
      ((Path)localObject3).cubicTo(58.003689F, 29.600607F, 57.993694F, 40.325684F, 58.0F, 51.0F);
      ((Path)localObject3).cubicTo(58.253532F, 52.72311F, 56.764465F, 54.375435F, 55.0F, 54.0F);
      ((Path)localObject3).cubicTo(37.66642F, 51.972057F, 20.307287F, 49.959225F, 3.0F, 48.0F);
      ((Path)localObject3).cubicTo(1.289193F, 48.07658F, -0.2098686F, 46.794777F, -3.552714E-015F, 45.0F);
      ((Path)localObject3).cubicTo(-0.03997498F, 34.657715F, 0.06995621F, 24.263103F, -3.552714E-015F, 14.0F);
      ((Path)localObject3).cubicTo(0.07994995F, 12.616731F, -0.1499062F, 10.82421F, 1.0F, 10.0F);
      ((Path)localObject3).lineTo(1.0F, 10.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.amn
 * JD-Core Version:    0.6.2
 */