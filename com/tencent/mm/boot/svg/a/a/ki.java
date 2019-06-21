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

public final class ki extends c
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
      ((Paint)localObject).setColor(-8617851);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(41.0F, 65.0F);
      ((Path)localObject).cubicTo(28.297495F, 65.0F, 18.0F, 54.702503F, 18.0F, 42.0F);
      ((Path)localObject).cubicTo(18.0F, 29.297495F, 28.297495F, 19.0F, 41.0F, 19.0F);
      ((Path)localObject).cubicTo(53.702503F, 19.0F, 64.0F, 29.297495F, 64.0F, 42.0F);
      ((Path)localObject).cubicTo(64.0F, 54.702503F, 53.702503F, 65.0F, 41.0F, 65.0F);
      ((Path)localObject).lineTo(41.0F, 65.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(85.0F, 78.0F);
      ((Path)localObject).lineTo(66.0F, 61.0F);
      ((Path)localObject).cubicTo(70.123146F, 55.956898F, 72.5F, 49.400074F, 73.0F, 42.0F);
      ((Path)localObject).cubicTo(72.5F, 25.006767F, 58.508797F, 11.0F, 41.0F, 11.0F);
      ((Path)localObject).cubicTo(23.991203F, 11.0F, 10.0F, 25.006767F, 10.0F, 42.0F);
      ((Path)localObject).cubicTo(10.0F, 59.562756F, 23.991203F, 73.569519F, 41.0F, 74.0F);
      ((Path)localObject).cubicTo(48.358334F, 73.569519F, 54.908794F, 71.18956F, 60.0F, 67.0F);
      ((Path)localObject).lineTo(77.0F, 86.0F);
      ((Path)localObject).lineTo(85.0F, 78.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ki
 * JD-Core Version:    0.6.2
 */