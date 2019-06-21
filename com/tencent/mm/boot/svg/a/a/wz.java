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

public final class wz extends c
{
  private final int height = 20;
  private final int width = 15;

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
        paramInt = 15;
        continue;
        paramInt = 20;
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
      localCanvas.save();
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, -278.0F, 0.0F, 1.0F, -114.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(286.10001F, 115.88284F);
      ((Path)localObject1).lineTo(286.10001F, 125.12132F);
      ((Path)localObject1).lineTo(284.89999F, 125.12132F);
      ((Path)localObject1).lineTo(284.89999F, 115.88285F);
      ((Path)localObject1).lineTo(282.81299F, 117.96985F);
      ((Path)localObject1).lineTo(281.96448F, 117.12132F);
      ((Path)localObject1).lineTo(284.79291F, 114.29289F);
      ((Path)localObject1).cubicTo(285.18341F, 113.90237F, 285.81659F, 113.90237F, 286.20709F, 114.29289F);
      ((Path)localObject1).lineTo(286.34854F, 114.43432F);
      ((Path)localObject1).lineTo(289.03552F, 117.12132F);
      ((Path)localObject1).lineTo(288.18701F, 117.96985F);
      ((Path)localObject1).lineTo(286.10001F, 115.88284F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(281.0F, 118.62132F);
      ((Path)localObject1).lineTo(281.0F, 119.82132F);
      ((Path)localObject1).lineTo(279.20001F, 119.82132F);
      ((Path)localObject1).lineTo(279.20001F, 132.42133F);
      ((Path)localObject1).lineTo(291.79999F, 132.42133F);
      ((Path)localObject1).lineTo(291.79999F, 119.82132F);
      ((Path)localObject1).lineTo(290.0F, 119.82132F);
      ((Path)localObject1).lineTo(290.0F, 118.62132F);
      ((Path)localObject1).lineTo(292.00104F, 118.62132F);
      ((Path)localObject1).cubicTo(292.55087F, 118.62132F, 293.0F, 119.06716F, 293.0F, 119.61713F);
      ((Path)localObject1).lineTo(293.0F, 132.62552F);
      ((Path)localObject1).cubicTo(293.0F, 133.17239F, 292.55417F, 133.62132F, 292.00418F, 133.62132F);
      ((Path)localObject1).lineTo(278.99582F, 133.62132F);
      ((Path)localObject1).cubicTo(278.44891F, 133.62132F, 278.0F, 133.17548F, 278.0F, 132.62552F);
      ((Path)localObject1).lineTo(278.0F, 119.61713F);
      ((Path)localObject1).cubicTo(278.0F, 119.07024F, 278.44724F, 118.62132F, 278.99896F, 118.62132F);
      ((Path)localObject1).lineTo(281.0F, 118.62132F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wz
 * JD-Core Version:    0.6.2
 */