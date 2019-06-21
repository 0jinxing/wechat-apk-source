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

public final class aal extends c
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(9.0F, 16.5F);
      ((Path)localObject).lineTo(48.0F, 16.5F);
      ((Path)localObject).cubicTo(49.656853F, 16.5F, 51.0F, 17.843145F, 51.0F, 19.5F);
      ((Path)localObject).lineTo(51.0F, 52.5F);
      ((Path)localObject).cubicTo(51.0F, 54.156853F, 49.656853F, 55.5F, 48.0F, 55.5F);
      ((Path)localObject).lineTo(9.0F, 55.5F);
      ((Path)localObject).cubicTo(7.343146F, 55.5F, 6.0F, 54.156853F, 6.0F, 52.5F);
      ((Path)localObject).lineTo(6.0F, 19.5F);
      ((Path)localObject).cubicTo(6.0F, 17.843145F, 7.343146F, 16.5F, 9.0F, 16.5F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(54.0F, 30.0F);
      ((Path)localObject).lineTo(64.125916F, 21.899267F);
      ((Path)localObject).cubicTo(65.419701F, 20.864239F, 67.307579F, 21.074003F, 68.342606F, 22.36779F);
      ((Path)localObject).cubicTo(68.768158F, 22.899729F, 69.0F, 23.560659F, 69.0F, 24.241875F);
      ((Path)localObject).lineTo(69.0F, 47.758125F);
      ((Path)localObject).cubicTo(69.0F, 49.414978F, 67.656853F, 50.758125F, 66.0F, 50.758125F);
      ((Path)localObject).cubicTo(65.318787F, 50.758125F, 64.657852F, 50.526283F, 64.125916F, 50.100731F);
      ((Path)localObject).lineTo(54.0F, 42.0F);
      ((Path)localObject).lineTo(54.0F, 30.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aal
 * JD-Core Version:    0.6.2
 */