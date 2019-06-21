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

public final class yz extends c
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(61.5F, 42.408176F);
      ((Path)localObject).lineTo(61.5F, 16.5F);
      ((Path)localObject).lineTo(10.5F, 16.5F);
      ((Path)localObject).lineTo(10.5F, 41.548817F);
      ((Path)localObject).lineTo(24.597736F, 30.147776F);
      ((Path)localObject).cubicTo(25.985397F, 29.025555F, 28.213877F, 29.079981F, 29.551487F, 30.255251F);
      ((Path)localObject).lineTo(42.98077F, 42.05468F);
      ((Path)localObject).lineTo(49.827309F, 36.232494F);
      ((Path)localObject).cubicTo(51.213951F, 35.053314F, 53.42017F, 35.077267F, 54.766293F, 36.285252F);
      ((Path)localObject).lineTo(61.5F, 42.408176F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(8.97541F, 12.0F);
      ((Path)localObject).lineTo(63.02459F, 12.0F);
      ((Path)localObject).cubicTo(64.634087F, 12.0F, 66.0F, 13.443411F, 66.0F, 15.223948F);
      ((Path)localObject).lineTo(66.0F, 56.776051F);
      ((Path)localObject).cubicTo(66.0F, 58.563454F, 64.667862F, 60.0F, 63.02459F, 60.0F);
      ((Path)localObject).lineTo(8.97541F, 60.0F);
      ((Path)localObject).cubicTo(7.365917F, 60.0F, 6.0F, 58.556587F, 6.0F, 56.776051F);
      ((Path)localObject).lineTo(6.0F, 15.223948F);
      ((Path)localObject).cubicTo(6.0F, 13.436544F, 7.332136F, 12.0F, 8.97541F, 12.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yz
 * JD-Core Version:    0.6.2
 */