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

public final class abh extends c
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
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-16777216);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(9.6F, 15.6F);
      ((Path)localObject).lineTo(9.6F, 53.400002F);
      ((Path)localObject).lineTo(62.400002F, 53.400002F);
      ((Path)localObject).lineTo(62.400002F, 15.6F);
      ((Path)localObject).lineTo(9.6F, 15.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(6.0F, 15.0F);
      ((Path)localObject).cubicTo(6.0F, 13.343145F, 7.343146F, 12.0F, 9.0F, 12.0F);
      ((Path)localObject).lineTo(63.0F, 12.0F);
      ((Path)localObject).cubicTo(64.656853F, 12.0F, 66.0F, 13.343145F, 66.0F, 15.0F);
      ((Path)localObject).lineTo(66.0F, 54.0F);
      ((Path)localObject).cubicTo(66.0F, 55.656853F, 64.656853F, 57.0F, 63.0F, 57.0F);
      ((Path)localObject).lineTo(9.0F, 57.0F);
      ((Path)localObject).cubicTo(7.343146F, 57.0F, 6.0F, 55.656853F, 6.0F, 54.0F);
      ((Path)localObject).lineTo(6.0F, 15.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.0F, 62.699997F);
      ((Path)localObject).cubicTo(24.0F, 61.705887F, 24.798523F, 60.899998F, 25.8039F, 60.899998F);
      ((Path)localObject).lineTo(46.196098F, 60.899998F);
      ((Path)localObject).cubicTo(47.192368F, 60.899998F, 48.0F, 61.698956F, 48.0F, 62.699997F);
      ((Path)localObject).lineTo(48.0F, 64.5F);
      ((Path)localObject).lineTo(24.0F, 64.5F);
      ((Path)localObject).lineTo(24.0F, 62.699997F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abh
 * JD-Core Version:    0.6.2
 */