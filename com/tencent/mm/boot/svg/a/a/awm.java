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

public final class awm extends c
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
      ((Path)localObject2).moveTo(0.0F, 3.0F);
      ((Path)localObject2).cubicTo(0.0F, 1.343146F, 1.343146F, 0.0F, 3.0F, 0.0F);
      ((Path)localObject2).lineTo(55.5F, 0.0F);
      ((Path)localObject2).cubicTo(57.156853F, 0.0F, 58.5F, 1.343146F, 58.5F, 3.0F);
      ((Path)localObject2).lineTo(58.5F, 55.5F);
      ((Path)localObject2).cubicTo(58.5F, 57.156853F, 57.156853F, 58.5F, 55.5F, 58.5F);
      ((Path)localObject2).lineTo(3.0F, 58.5F);
      ((Path)localObject2).cubicTo(1.343146F, 58.5F, 0.0F, 57.156853F, 0.0F, 55.5F);
      ((Path)localObject2).lineTo(0.0F, 3.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(31.5F, 18.0F);
      ((Path)localObject1).lineTo(31.5F, 46.5F);
      ((Path)localObject1).cubicTo(31.5F, 47.328426F, 30.828426F, 48.0F, 30.0F, 48.0F);
      ((Path)localObject1).lineTo(27.0F, 48.0F);
      ((Path)localObject1).cubicTo(26.171574F, 48.0F, 25.5F, 47.328426F, 25.5F, 46.5F);
      ((Path)localObject1).lineTo(25.5F, 18.0F);
      ((Path)localObject1).lineTo(13.5F, 18.0F);
      ((Path)localObject1).cubicTo(12.671573F, 18.0F, 12.0F, 17.328426F, 12.0F, 16.5F);
      ((Path)localObject1).lineTo(12.0F, 13.5F);
      ((Path)localObject1).cubicTo(12.0F, 12.671573F, 12.671573F, 12.0F, 13.5F, 12.0F);
      ((Path)localObject1).lineTo(45.0F, 12.0F);
      ((Path)localObject1).cubicTo(45.828426F, 12.0F, 46.5F, 12.671573F, 46.5F, 13.5F);
      ((Path)localObject1).lineTo(46.5F, 16.5F);
      ((Path)localObject1).cubicTo(46.5F, 17.328426F, 45.828426F, 18.0F, 45.0F, 18.0F);
      ((Path)localObject1).lineTo(31.5F, 18.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awm
 * JD-Core Version:    0.6.2
 */