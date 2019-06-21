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

public final class zv extends c
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
      ((Path)localObject).moveTo(28.5F, 65.054871F);
      ((Path)localObject).lineTo(28.5F, 45.470562F);
      ((Path)localObject).lineTo(46.963139F, 63.933704F);
      ((Path)localObject).cubicTo(43.567234F, 65.267532F, 39.869156F, 66.0F, 36.0F, 66.0F);
      ((Path)localObject).cubicTo(33.410252F, 66.0F, 30.89715F, 65.671852F, 28.5F, 65.054871F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.0F, 63.503738F);
      ((Path)localObject).cubicTo(18.196375F, 60.968025F, 13.350096F, 56.649204F, 10.153644F, 51.239754F);
      ((Path)localObject).lineTo(24.0F, 37.393398F);
      ((Path)localObject).lineTo(24.0F, 63.503738F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(8.066298F, 46.963139F);
      ((Path)localObject).cubicTo(6.732465F, 43.567234F, 6.0F, 39.869156F, 6.0F, 36.0F);
      ((Path)localObject).cubicTo(6.0F, 33.410252F, 6.328147F, 30.89715F, 6.945131F, 28.5F);
      ((Path)localObject).lineTo(26.529438F, 28.5F);
      ((Path)localObject).lineTo(8.066298F, 46.963139F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(8.496263F, 24.0F);
      ((Path)localObject).cubicTo(11.031974F, 18.196375F, 15.350795F, 13.350096F, 20.760244F, 10.153644F);
      ((Path)localObject).lineTo(34.606602F, 24.0F);
      ((Path)localObject).lineTo(8.496263F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.03686F, 8.066298F);
      ((Path)localObject).cubicTo(28.432766F, 6.732465F, 32.130844F, 6.0F, 36.0F, 6.0F);
      ((Path)localObject).cubicTo(38.589748F, 6.0F, 41.102852F, 6.328147F, 43.5F, 6.945131F);
      ((Path)localObject).lineTo(43.5F, 26.529438F);
      ((Path)localObject).lineTo(25.03686F, 8.066298F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 8.496263F);
      ((Path)localObject).cubicTo(53.803627F, 11.031974F, 58.649906F, 15.350795F, 61.846355F, 20.760244F);
      ((Path)localObject).lineTo(48.0F, 34.606602F);
      ((Path)localObject).lineTo(48.0F, 8.496263F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.933704F, 25.03686F);
      ((Path)localObject).cubicTo(65.267532F, 28.432766F, 66.0F, 32.130844F, 66.0F, 36.0F);
      ((Path)localObject).cubicTo(66.0F, 38.589748F, 65.671852F, 41.102852F, 65.054871F, 43.5F);
      ((Path)localObject).lineTo(45.470562F, 43.5F);
      ((Path)localObject).lineTo(63.933704F, 25.03686F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.503738F, 48.0F);
      ((Path)localObject).cubicTo(60.968025F, 53.803627F, 56.649204F, 58.649906F, 51.239754F, 61.846355F);
      ((Path)localObject).lineTo(37.393398F, 48.0F);
      ((Path)localObject).lineTo(63.503738F, 48.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zv
 * JD-Core Version:    0.6.2
 */