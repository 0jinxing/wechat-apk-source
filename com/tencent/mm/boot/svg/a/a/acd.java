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

public final class acd extends c
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
      ((Path)localObject).moveTo(15.6F, 9.6F);
      ((Path)localObject).lineTo(15.6F, 62.400002F);
      ((Path)localObject).lineTo(56.400002F, 62.400002F);
      ((Path)localObject).lineTo(56.400002F, 9.6F);
      ((Path)localObject).lineTo(15.6F, 9.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 9.0F);
      ((Path)localObject).cubicTo(12.0F, 7.343146F, 13.343145F, 6.0F, 15.0F, 6.0F);
      ((Path)localObject).lineTo(57.0F, 6.0F);
      ((Path)localObject).cubicTo(58.656853F, 6.0F, 60.0F, 7.343146F, 60.0F, 9.0F);
      ((Path)localObject).lineTo(60.0F, 63.0F);
      ((Path)localObject).cubicTo(60.0F, 64.656853F, 58.656853F, 66.0F, 57.0F, 66.0F);
      ((Path)localObject).lineTo(15.0F, 66.0F);
      ((Path)localObject).cubicTo(13.343145F, 66.0F, 12.0F, 64.656853F, 12.0F, 63.0F);
      ((Path)localObject).lineTo(12.0F, 9.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 60.0F);
      ((Path)localObject).cubicTo(34.343147F, 60.0F, 33.0F, 58.656853F, 33.0F, 57.0F);
      ((Path)localObject).cubicTo(33.0F, 55.343147F, 34.343147F, 54.0F, 36.0F, 54.0F);
      ((Path)localObject).cubicTo(37.656853F, 54.0F, 39.0F, 55.343147F, 39.0F, 57.0F);
      ((Path)localObject).cubicTo(39.0F, 58.656853F, 37.656853F, 60.0F, 36.0F, 60.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.acd
 * JD-Core Version:    0.6.2
 */