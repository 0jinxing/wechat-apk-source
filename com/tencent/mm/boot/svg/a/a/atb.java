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

public final class atb extends c
{
  private final int height = 12;
  private final int width = 64;

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
        paramInt = 64;
        continue;
        paramInt = 12;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      Looper localLooper = (Looper)paramArrayOfObject[1];
      paramArrayOfObject = c.h(localLooper);
      float[] arrayOfFloat = c.g(localLooper);
      Object localObject1 = c.k(localLooper);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(localLooper);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, localLooper).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject1, localLooper);
      ((Paint)localObject2).setColor(-2565928);
      localCanvas.save();
      Paint localPaint1 = c.a((Paint)localObject2, localLooper);
      localObject2 = c.l(localLooper);
      ((Path)localObject2).moveTo(6.0F, 12.0F);
      ((Path)localObject2).cubicTo(9.313708F, 12.0F, 12.0F, 9.313708F, 12.0F, 6.0F);
      ((Path)localObject2).cubicTo(12.0F, 2.686292F, 9.313708F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject2).cubicTo(2.686292F, 0.0F, 0.0F, 2.686292F, 0.0F, 6.0F);
      ((Path)localObject2).cubicTo(0.0F, 9.313708F, 2.686292F, 12.0F, 6.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(32.0F, 12.0F);
      ((Path)localObject2).cubicTo(35.313709F, 12.0F, 38.0F, 9.313708F, 38.0F, 6.0F);
      ((Path)localObject2).cubicTo(38.0F, 2.686292F, 35.313709F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject2).cubicTo(28.686291F, 0.0F, 26.0F, 2.686292F, 26.0F, 6.0F);
      ((Path)localObject2).cubicTo(26.0F, 9.313708F, 28.686291F, 12.0F, 32.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(58.0F, 12.0F);
      ((Path)localObject2).cubicTo(61.313709F, 12.0F, 64.0F, 9.313708F, 64.0F, 6.0F);
      ((Path)localObject2).cubicTo(64.0F, 2.686292F, 61.313709F, 0.0F, 58.0F, 0.0F);
      ((Path)localObject2).cubicTo(54.686291F, 0.0F, 52.0F, 2.686292F, 52.0F, 6.0F);
      ((Path)localObject2).cubicTo(52.0F, 9.313708F, 54.686291F, 12.0F, 58.0F, 12.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, localLooper);
      localObject1 = c.l(localLooper);
      ((Path)localObject1).moveTo(6.0F, 12.0F);
      ((Path)localObject1).cubicTo(9.313708F, 12.0F, 12.0F, 9.313708F, 12.0F, 6.0F);
      ((Path)localObject1).cubicTo(12.0F, 2.686292F, 9.313708F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject1).cubicTo(2.686292F, 0.0F, 0.0F, 2.686292F, 0.0F, 6.0F);
      ((Path)localObject1).cubicTo(0.0F, 9.313708F, 2.686292F, 12.0F, 6.0F, 12.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(32.0F, 12.0F);
      ((Path)localObject1).cubicTo(35.313709F, 12.0F, 38.0F, 9.313708F, 38.0F, 6.0F);
      ((Path)localObject1).cubicTo(38.0F, 2.686292F, 35.313709F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject1).cubicTo(28.686291F, 0.0F, 26.0F, 2.686292F, 26.0F, 6.0F);
      ((Path)localObject1).cubicTo(26.0F, 9.313708F, 28.686291F, 12.0F, 32.0F, 12.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(58.0F, 12.0F);
      ((Path)localObject1).cubicTo(61.313709F, 12.0F, 64.0F, 9.313708F, 64.0F, 6.0F);
      ((Path)localObject1).cubicTo(64.0F, 2.686292F, 61.313709F, 0.0F, 58.0F, 0.0F);
      ((Path)localObject1).cubicTo(54.686291F, 0.0F, 52.0F, 2.686292F, 52.0F, 6.0F);
      ((Path)localObject1).cubicTo(52.0F, 9.313708F, 54.686291F, 12.0F, 58.0F, 12.0F);
      ((Path)localObject1).close();
      localPaint1 = c.k(localLooper);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(localLooper);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 64.0F, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F);
      paramArrayOfObject.reset();
      paramArrayOfObject.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient((Paint)localObject2, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -6556649, -9903790 }, new float[] { 0.0F, 1.0F }, paramArrayOfObject, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(localLooper);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.atb
 * JD-Core Version:    0.6.2
 */