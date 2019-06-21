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

public final class azc extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
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
      ((Paint)localObject).setColor(-9318371);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(47.999001F, 15.0F);
      ((Path)localObject).cubicTo(29.773001F, 15.0F, 15.0F, 29.774F, 15.0F, 48.0F);
      ((Path)localObject).cubicTo(15.0F, 66.225998F, 29.773001F, 81.0F, 47.999001F, 81.0F);
      ((Path)localObject).cubicTo(66.224998F, 81.0F, 81.0F, 66.225998F, 81.0F, 48.0F);
      ((Path)localObject).cubicTo(81.0F, 29.774F, 66.224998F, 15.0F, 47.999001F, 15.0F);
      ((Path)localObject).lineTo(47.999001F, 15.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(62.0F, 31.0F);
      ((Path)localObject).cubicTo(64.762001F, 31.0F, 67.0F, 33.462002F, 67.0F, 36.5F);
      ((Path)localObject).cubicTo(67.0F, 39.537998F, 64.762001F, 42.0F, 62.0F, 42.0F);
      ((Path)localObject).cubicTo(59.237999F, 42.0F, 57.0F, 39.537998F, 57.0F, 36.5F);
      ((Path)localObject).cubicTo(57.0F, 33.462002F, 59.237999F, 31.0F, 62.0F, 31.0F);
      ((Path)localObject).lineTo(62.0F, 31.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(35.0F, 31.0F);
      ((Path)localObject).cubicTo(37.762001F, 31.0F, 40.0F, 33.462002F, 40.0F, 36.5F);
      ((Path)localObject).cubicTo(40.0F, 39.537998F, 37.762001F, 42.0F, 35.0F, 42.0F);
      ((Path)localObject).cubicTo(32.237999F, 42.0F, 30.0F, 39.537998F, 30.0F, 36.5F);
      ((Path)localObject).cubicTo(30.0F, 33.462002F, 32.237999F, 31.0F, 35.0F, 31.0F);
      ((Path)localObject).lineTo(35.0F, 31.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 71.0F);
      ((Path)localObject).cubicTo(28.667F, 71.0F, 26.0F, 53.0F, 26.0F, 53.0F);
      ((Path)localObject).cubicTo(26.0F, 53.0F, 40.361F, 51.0F, 48.0F, 51.0F);
      ((Path)localObject).cubicTo(55.639F, 51.0F, 70.0F, 53.0F, 70.0F, 53.0F);
      ((Path)localObject).cubicTo(70.0F, 53.0F, 67.333F, 71.0F, 48.0F, 71.0F);
      ((Path)localObject).lineTo(48.0F, 71.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azc
 * JD-Core Version:    0.6.2
 */