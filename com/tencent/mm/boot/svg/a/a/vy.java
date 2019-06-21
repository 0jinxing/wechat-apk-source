package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class vy extends c
{
  private final int height = 60;
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
        paramInt = 60;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
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
      localCanvas.save();
      Object localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(117440512);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 12.0F);
      ((Path)localObject2).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject2).lineTo(84.0F, 0.0F);
      ((Path)localObject2).cubicTo(90.627419F, 0.0F, 96.0F, 5.372582F, 96.0F, 12.0F);
      ((Path)localObject2).lineTo(96.0F, 48.0F);
      ((Path)localObject2).cubicTo(96.0F, 54.627419F, 90.627419F, 60.0F, 84.0F, 60.0F);
      ((Path)localObject2).lineTo(12.0F, 60.0F);
      ((Path)localObject2).cubicTo(5.372582F, 60.0F, 0.0F, 54.627419F, 0.0F, 48.0F);
      ((Path)localObject2).lineTo(0.0F, 12.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-11048043);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(36.0F, 36.0F);
      ((Path)localObject3).cubicTo(32.686291F, 36.0F, 30.0F, 33.313709F, 30.0F, 30.0F);
      ((Path)localObject3).cubicTo(30.0F, 26.686291F, 32.686291F, 24.0F, 36.0F, 24.0F);
      ((Path)localObject3).cubicTo(39.313709F, 24.0F, 42.0F, 26.686291F, 42.0F, 30.0F);
      ((Path)localObject3).cubicTo(42.0F, 33.313709F, 39.313709F, 36.0F, 36.0F, 36.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(60.0F, 36.0F);
      ((Path)localObject3).cubicTo(56.686291F, 36.0F, 54.0F, 33.313709F, 54.0F, 30.0F);
      ((Path)localObject3).cubicTo(54.0F, 26.686291F, 56.686291F, 24.0F, 60.0F, 24.0F);
      ((Path)localObject3).cubicTo(63.313709F, 24.0F, 66.0F, 26.686291F, 66.0F, 30.0F);
      ((Path)localObject3).cubicTo(66.0F, 33.313709F, 63.313709F, 36.0F, 60.0F, 36.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(419430400);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 12.0F);
      ((Path)localObject1).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject1).lineTo(84.0F, 0.0F);
      ((Path)localObject1).cubicTo(90.627419F, 0.0F, 96.0F, 5.372582F, 96.0F, 12.0F);
      ((Path)localObject1).lineTo(96.0F, 48.0F);
      ((Path)localObject1).cubicTo(96.0F, 54.627419F, 90.627419F, 60.0F, 84.0F, 60.0F);
      ((Path)localObject1).lineTo(12.0F, 60.0F);
      ((Path)localObject1).cubicTo(5.372582F, 60.0F, 0.0F, 54.627419F, 0.0F, 48.0F);
      ((Path)localObject1).lineTo(0.0F, 12.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vy
 * JD-Core Version:    0.6.2
 */