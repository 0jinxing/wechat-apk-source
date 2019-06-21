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

public final class arc extends c
{
  private final int height = 49;
  private final int width = 56;

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
        paramInt = 56;
        continue;
        paramInt = 49;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-27648);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(52.0F, 0.0F);
      ((Path)localObject).cubicTo(53.5F, 1.052578F, 54.73F, 2.105156F, 56.0F, 3.0F);
      ((Path)localObject).lineTo(56.0F, 5.0F);
      ((Path)localObject).cubicTo(53.09F, 7.107406F, 50.939999F, 10.395458F, 49.0F, 13.0F);
      ((Path)localObject).cubicTo(39.470001F, 25.301964F, 30.389999F, 37.161007F, 21.0F, 49.0F);
      ((Path)localObject).cubicTo(13.57F, 41.772301F, 7.51F, 33.00082F, 0.0F, 26.0F);
      ((Path)localObject).lineTo(0.0F, 24.0F);
      ((Path)localObject).cubicTo(0.87F, 22.956219F, 1.72F, 21.643003F, 3.0F, 20.0F);
      ((Path)localObject).cubicTo(8.66F, 25.121523F, 14.88F, 29.762888F, 21.0F, 34.0F);
      ((Path)localObject).cubicTo(31.450001F, 22.986294F, 41.91F, 11.538257F, 52.0F, 0.0F);
      ((Path)localObject).lineTo(52.0F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.arc
 * JD-Core Version:    0.6.2
 */