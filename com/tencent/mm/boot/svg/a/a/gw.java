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

public final class gw extends c
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
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(11.0F, 15.0F);
      ((Path)localObject).lineTo(44.0F, 15.0F);
      ((Path)localObject).lineTo(44.0F, 48.0F);
      ((Path)localObject).lineTo(11.0F, 48.0F);
      ((Path)localObject).lineTo(11.0F, 15.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-2012855);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(30.0F, 28.378679F);
      ((Path)localObject).lineTo(20.454058F, 18.832739F);
      ((Path)localObject).lineTo(18.332739F, 20.954058F);
      ((Path)localObject).lineTo(27.878679F, 30.5F);
      ((Path)localObject).lineTo(18.332739F, 40.04594F);
      ((Path)localObject).lineTo(20.454058F, 42.167263F);
      ((Path)localObject).lineTo(30.0F, 32.621319F);
      ((Path)localObject).lineTo(39.54594F, 42.167263F);
      ((Path)localObject).lineTo(41.667263F, 40.04594F);
      ((Path)localObject).lineTo(32.121319F, 30.5F);
      ((Path)localObject).lineTo(41.667263F, 20.954058F);
      ((Path)localObject).lineTo(39.54594F, 18.832739F);
      ((Path)localObject).lineTo(30.0F, 28.378679F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(30.0F, 60.0F);
      ((Path)localObject).cubicTo(13.431458F, 60.0F, 0.0F, 46.568542F, 0.0F, 30.0F);
      ((Path)localObject).cubicTo(0.0F, 13.431458F, 13.431458F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject).cubicTo(46.568542F, 0.0F, 60.0F, 13.431458F, 60.0F, 30.0F);
      ((Path)localObject).cubicTo(60.0F, 46.568542F, 46.568542F, 60.0F, 30.0F, 60.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gw
 * JD-Core Version:    0.6.2
 */