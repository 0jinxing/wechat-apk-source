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

public final class mb extends c
{
  private final int height = 48;
  private final int width = 63;

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
        paramInt = 63;
        continue;
        paramInt = 48;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-5066062);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(2.0F, 0.0F);
      ((Path)localObject).lineTo(61.0F, 0.0F);
      ((Path)localObject).cubicTo(61.110001F, 1.2F, 61.669998F, 1.83F, 63.0F, 2.0F);
      ((Path)localObject).lineTo(63.0F, 46.0F);
      ((Path)localObject).cubicTo(61.799999F, 46.099998F, 61.18F, 46.66F, 61.0F, 48.0F);
      ((Path)localObject).lineTo(2.0F, 48.0F);
      ((Path)localObject).cubicTo(1.89F, 46.799999F, 1.34F, 46.169998F, 0.0F, 46.0F);
      ((Path)localObject).lineTo(0.0F, 2.0F);
      ((Path)localObject).cubicTo(1.2F, 1.9F, 1.82F, 1.34F, 2.0F, 0.0F);
      ((Path)localObject).lineTo(2.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(6.0F, 6.0F);
      ((Path)localObject).cubicTo(6.009992F, 14.688017F, 6.039969F, 23.386019F, 6.0F, 32.0F);
      ((Path)localObject).cubicTo(9.807015F, 26.681475F, 14.5433F, 21.658401F, 20.0F, 19.0F);
      ((Path)localObject).cubicTo(23.536245F, 16.894972F, 26.683777F, 19.161846F, 29.0F, 21.0F);
      ((Path)localObject).cubicTo(33.988049F, 25.31336F, 38.404583F, 30.196625F, 43.0F, 35.0F);
      ((Path)localObject).cubicTo(41.642044F, 32.882919F, 40.323078F, 30.815771F, 39.0F, 29.0F);
      ((Path)localObject).cubicTo(41.272335F, 26.441805F, 43.510578F, 23.286158F, 47.0F, 23.0F);
      ((Path)localObject).cubicTo(51.614223F, 24.234848F, 54.332092F, 28.598829F, 57.0F, 32.0F);
      ((Path)localObject).cubicTo(56.96003F, 23.425964F, 56.990009F, 14.707989F, 57.0F, 6.0F);
      ((Path)localObject).lineTo(6.0F, 6.0F);
      ((Path)localObject).lineTo(6.0F, 6.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.mb
 * JD-Core Version:    0.6.2
 */