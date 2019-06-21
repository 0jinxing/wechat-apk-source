package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class xp extends c
{
  private final int height = 216;
  private final int width = 216;

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
        paramInt = 216;
        continue;
        paramInt = 216;
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
      localPaint.setColor(-5066062);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 40.0F);
      ((Path)localObject).cubicTo(0.0F, 17.908609F, 17.908609F, 0.0F, 40.0F, 0.0F);
      ((Path)localObject).lineTo(176.0F, 0.0F);
      ((Path)localObject).cubicTo(198.09138F, 0.0F, 216.0F, 17.908609F, 216.0F, 40.0F);
      ((Path)localObject).lineTo(216.0F, 176.0F);
      ((Path)localObject).cubicTo(216.0F, 198.09138F, 198.09138F, 216.0F, 176.0F, 216.0F);
      ((Path)localObject).lineTo(40.0F, 216.0F);
      ((Path)localObject).cubicTo(17.908609F, 216.0F, 0.0F, 198.09138F, 0.0F, 176.0F);
      ((Path)localObject).lineTo(0.0F, 40.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xp
 * JD-Core Version:    0.6.2
 */