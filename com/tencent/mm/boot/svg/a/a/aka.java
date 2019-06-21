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

public final class aka extends c
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
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(419430400);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(36.0F, 1.5F);
      ((Path)localObject3).cubicTo(55.053825F, 1.5F, 70.5F, 16.946175F, 70.5F, 36.0F);
      ((Path)localObject3).cubicTo(70.5F, 55.053825F, 55.053825F, 70.5F, 36.0F, 70.5F);
      ((Path)localObject3).cubicTo(16.946175F, 70.5F, 1.5F, 55.053825F, 1.5F, 36.0F);
      ((Path)localObject3).cubicTo(1.5F, 16.946175F, 16.946175F, 1.5F, 36.0F, 1.5F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(36.0F, 72.0F);
      ((Path)localObject2).cubicTo(55.882252F, 72.0F, 72.0F, 55.882252F, 72.0F, 36.0F);
      ((Path)localObject2).cubicTo(72.0F, 16.117748F, 55.882252F, 0.0F, 36.0F, 0.0F);
      ((Path)localObject2).cubicTo(16.117748F, 0.0F, 0.0F, 16.117748F, 0.0F, 36.0F);
      ((Path)localObject2).cubicTo(0.0F, 55.882252F, 16.117748F, 72.0F, 36.0F, 72.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(36.0F, 67.5F);
      ((Path)localObject2).cubicTo(53.396969F, 67.5F, 67.5F, 53.396969F, 67.5F, 36.0F);
      ((Path)localObject2).cubicTo(67.5F, 18.603031F, 53.396969F, 4.5F, 36.0F, 4.5F);
      ((Path)localObject2).cubicTo(18.603031F, 4.5F, 4.5F, 18.603031F, 4.5F, 36.0F);
      ((Path)localObject2).cubicTo(4.5F, 53.396969F, 18.603031F, 67.5F, 36.0F, 67.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(24.0F, 27.0F);
      ((Path)localObject1).cubicTo(24.0F, 25.343145F, 25.343145F, 24.0F, 27.0F, 24.0F);
      ((Path)localObject1).lineTo(45.0F, 24.0F);
      ((Path)localObject1).cubicTo(46.656853F, 24.0F, 48.0F, 25.343145F, 48.0F, 27.0F);
      ((Path)localObject1).lineTo(48.0F, 45.0F);
      ((Path)localObject1).cubicTo(48.0F, 46.656853F, 46.656853F, 48.0F, 45.0F, 48.0F);
      ((Path)localObject1).lineTo(27.0F, 48.0F);
      ((Path)localObject1).cubicTo(25.343145F, 48.0F, 24.0F, 46.656853F, 24.0F, 45.0F);
      ((Path)localObject1).lineTo(24.0F, 27.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aka
 * JD-Core Version:    0.6.2
 */