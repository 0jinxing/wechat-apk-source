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

public final class cp extends c
{
  private final int height = 80;
  private final int width = 80;

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
        paramInt = 80;
        continue;
        paramInt = 80;
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(61.0F, 33.0F);
      ((Path)localObject).lineTo(61.0F, 64.0F);
      ((Path)localObject).lineTo(19.0F, 64.0F);
      ((Path)localObject).lineTo(19.0F, 17.0F);
      ((Path)localObject).lineTo(47.0F, 17.0F);
      ((Path)localObject).lineTo(47.0F, 33.0F);
      ((Path)localObject).lineTo(49.0F, 33.0F);
      ((Path)localObject).lineTo(61.0F, 33.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.989494F, 29.0F);
      ((Path)localObject).lineTo(51.0F, 18.140165F);
      ((Path)localObject).lineTo(51.0F, 29.0F);
      ((Path)localObject).lineTo(60.989494F, 29.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.0F, 68.0F);
      ((Path)localObject).lineTo(15.0F, 68.0F);
      ((Path)localObject).lineTo(15.0F, 66.0F);
      ((Path)localObject).lineTo(15.0F, 15.0F);
      ((Path)localObject).lineTo(15.0F, 13.0F);
      ((Path)localObject).lineTo(51.0F, 13.0F);
      ((Path)localObject).lineTo(51.0F, 13.028122F);
      ((Path)localObject).lineTo(65.04203F, 28.0F);
      ((Path)localObject).lineTo(65.0F, 28.010773F);
      ((Path)localObject).lineTo(65.0F, 68.0F);
      ((Path)localObject).lineTo(63.0F, 68.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cp
 * JD-Core Version:    0.6.2
 */