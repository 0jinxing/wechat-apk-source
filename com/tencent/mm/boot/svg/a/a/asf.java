package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class asf extends c
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(72.0F, 0.0F);
      ((Path)localObject).lineTo(72.0F, 72.0F);
      ((Path)localObject).lineTo(0.0F, 72.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(3.6F);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(50.391575F, 17.210928F);
      ((Path)localObject).lineTo(37.490154F, 24.799999F);
      ((Path)localObject).lineTo(21.0F, 24.799999F);
      ((Path)localObject).cubicTo(20.337257F, 24.799999F, 19.799999F, 25.337257F, 19.799999F, 26.0F);
      ((Path)localObject).lineTo(19.799999F, 46.0F);
      ((Path)localObject).cubicTo(19.799999F, 46.662743F, 20.337257F, 47.200001F, 21.0F, 47.200001F);
      ((Path)localObject).lineTo(37.490154F, 47.200001F);
      ((Path)localObject).lineTo(50.391575F, 54.78907F);
      ((Path)localObject).cubicTo(50.575989F, 54.897549F, 50.786049F, 54.95475F, 51.0F, 54.95475F);
      ((Path)localObject).cubicTo(51.662743F, 54.95475F, 52.200001F, 54.417492F, 52.200001F, 53.754749F);
      ((Path)localObject).lineTo(52.200001F, 18.245251F);
      ((Path)localObject).cubicTo(52.200001F, 18.031298F, 52.142799F, 17.821238F, 52.034321F, 17.636826F);
      ((Path)localObject).cubicTo(51.698299F, 17.065586F, 50.962814F, 16.874905F, 50.391575F, 17.210928F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.asf
 * JD-Core Version:    0.6.2
 */