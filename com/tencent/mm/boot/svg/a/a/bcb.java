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

public final class bcb extends c
{
  private final int height = 39;
  private final int width = 39;

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
        paramInt = 39;
        continue;
        paramInt = 39;
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
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(15.911817F, 28.210007F);
      ((Path)localObject).cubicTo(12.592391F, 26.960802F, 10.230769F, 23.756193F, 10.230769F, 20.0F);
      ((Path)localObject).cubicTo(10.230769F, 15.156888F, 14.156888F, 11.230769F, 19.0F, 11.230769F);
      ((Path)localObject).cubicTo(23.843113F, 11.230769F, 27.76923F, 15.156888F, 27.76923F, 20.0F);
      ((Path)localObject).cubicTo(27.76923F, 20.19488F, 27.762875F, 20.388273F, 27.750357F, 20.579987F);
      ((Path)localObject).cubicTo(30.774906F, 21.110861F, 33.20298F, 23.374031F, 33.973866F, 26.308788F);
      ((Path)localObject).cubicTo(34.541199F, 26.484497F, 35.077324F, 26.731188F, 35.571869F, 27.038485F);
      ((Path)localObject).cubicTo(36.491306F, 24.876438F, 37.0F, 22.497625F, 37.0F, 20.0F);
      ((Path)localObject).cubicTo(37.0F, 10.058874F, 28.941126F, 2.0F, 19.0F, 2.0F);
      ((Path)localObject).cubicTo(9.058874F, 2.0F, 1.0F, 10.058874F, 1.0F, 20.0F);
      ((Path)localObject).cubicTo(1.0F, 29.941126F, 9.058874F, 38.0F, 19.0F, 38.0F);
      ((Path)localObject).cubicTo(19.099163F, 38.0F, 19.198141F, 37.999199F, 19.296925F, 37.997601F);
      ((Path)localObject).cubicTo(19.351601F, 37.999195F, 19.406475F, 38.0F, 19.461538F, 38.0F);
      ((Path)localObject).lineTo(32.384617F, 38.0F);
      ((Path)localObject).lineTo(32.384617F, 37.979301F);
      ((Path)localObject).cubicTo(34.972229F, 37.74612F, 37.0F, 35.571404F, 37.0F, 32.923077F);
      ((Path)localObject).cubicTo(37.0F, 30.269276F, 34.96384F, 28.091045F, 32.368565F, 27.865429F);
      ((Path)localObject).cubicTo(32.142185F, 24.75823F, 29.549576F, 22.307692F, 26.384615F, 22.307692F);
      ((Path)localObject).cubicTo(23.496096F, 22.307692F, 21.084314F, 24.348843F, 20.512947F, 27.067463F);
      ((Path)localObject).cubicTo(20.216953F, 26.979319F, 19.868599F, 26.929428F, 19.461538F, 26.923077F);
      ((Path)localObject).cubicTo(18.110815F, 26.923077F, 16.873026F, 27.406603F, 15.911817F, 28.210007F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 76, 4);
      localPaint = c.a(localPaint, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bcb
 * JD-Core Version:    0.6.2
 */