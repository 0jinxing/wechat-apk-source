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

public final class ds extends c
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
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(36.0F, 0.0F);
      ((Path)localObject2).cubicTo(55.882252F, 0.0F, 72.0F, 16.117748F, 72.0F, 36.0F);
      ((Path)localObject2).cubicTo(72.0F, 55.882252F, 55.882252F, 72.0F, 36.0F, 72.0F);
      ((Path)localObject2).cubicTo(16.117748F, 72.0F, 0.0F, 55.882252F, 0.0F, 36.0F);
      ((Path)localObject2).cubicTo(0.0F, 16.117748F, 16.117748F, 0.0F, 36.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-372399);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(23.485189F, 27.727831F);
      ((Path)localObject1).cubicTo(21.914631F, 30.099129F, 21.0F, 32.942753F, 21.0F, 36.0F);
      ((Path)localObject1).cubicTo(21.0F, 44.284271F, 27.715729F, 51.0F, 36.0F, 51.0F);
      ((Path)localObject1).cubicTo(39.057247F, 51.0F, 41.900871F, 50.085369F, 44.272171F, 48.514809F);
      ((Path)localObject1).lineTo(23.485189F, 27.727831F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(27.727831F, 23.485189F);
      ((Path)localObject1).lineTo(48.514809F, 44.272171F);
      ((Path)localObject1).cubicTo(50.085369F, 41.900871F, 51.0F, 39.057247F, 51.0F, 36.0F);
      ((Path)localObject1).cubicTo(51.0F, 27.715729F, 44.284271F, 21.0F, 36.0F, 21.0F);
      ((Path)localObject1).cubicTo(32.942753F, 21.0F, 30.099129F, 21.914631F, 27.727831F, 23.485189F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(36.0F, 57.0F);
      ((Path)localObject1).cubicTo(24.40202F, 57.0F, 15.0F, 47.59798F, 15.0F, 36.0F);
      ((Path)localObject1).cubicTo(15.0F, 24.40202F, 24.40202F, 15.0F, 36.0F, 15.0F);
      ((Path)localObject1).cubicTo(47.59798F, 15.0F, 57.0F, 24.40202F, 57.0F, 36.0F);
      ((Path)localObject1).cubicTo(57.0F, 47.59798F, 47.59798F, 57.0F, 36.0F, 57.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ds
 * JD-Core Version:    0.6.2
 */