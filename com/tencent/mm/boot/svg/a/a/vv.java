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

public final class vv extends c
{
  private final int height = 46;
  private final int width = 66;

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
        paramInt = 66;
        continue;
        paramInt = 46;
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
      localPaint.setColor(-4547478);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(12.0F, 31.470589F);
      ((Path)localObject).lineTo(12.0F, 46.0F);
      ((Path)localObject).lineTo(66.0F, 46.0F);
      ((Path)localObject).lineTo(66.0F, 0.0F);
      ((Path)localObject).lineTo(12.0F, 0.0F);
      ((Path)localObject).lineTo(12.0F, 14.529412F);
      ((Path)localObject).lineTo(0.0F, 23.0F);
      ((Path)localObject).lineTo(12.0F, 31.470589F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 29.0F);
      ((Path)localObject).cubicTo(30.313709F, 29.0F, 33.0F, 26.313709F, 33.0F, 23.0F);
      ((Path)localObject).cubicTo(33.0F, 19.686291F, 30.313709F, 17.0F, 27.0F, 17.0F);
      ((Path)localObject).cubicTo(23.686291F, 17.0F, 21.0F, 19.686291F, 21.0F, 23.0F);
      ((Path)localObject).cubicTo(21.0F, 26.313709F, 23.686291F, 29.0F, 27.0F, 29.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(51.0F, 29.0F);
      ((Path)localObject).cubicTo(54.313709F, 29.0F, 57.0F, 26.313709F, 57.0F, 23.0F);
      ((Path)localObject).cubicTo(57.0F, 19.686291F, 54.313709F, 17.0F, 51.0F, 17.0F);
      ((Path)localObject).cubicTo(47.686291F, 17.0F, 45.0F, 19.686291F, 45.0F, 23.0F);
      ((Path)localObject).cubicTo(45.0F, 26.313709F, 47.686291F, 29.0F, 51.0F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vv
 * JD-Core Version:    0.6.2
 */