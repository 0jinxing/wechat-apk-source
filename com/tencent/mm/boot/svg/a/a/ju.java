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

public final class ju extends c
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(32.0F, 28.0F);
      ((Path)localObject).lineTo(85.0F, 28.0F);
      ((Path)localObject).lineTo(85.0F, 20.0F);
      ((Path)localObject).lineTo(32.0F, 20.0F);
      ((Path)localObject).lineTo(32.0F, 28.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 28.0F);
      ((Path)localObject).lineTo(24.0F, 28.0F);
      ((Path)localObject).lineTo(24.0F, 20.0F);
      ((Path)localObject).lineTo(12.0F, 20.0F);
      ((Path)localObject).lineTo(12.0F, 28.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(32.0F, 52.0F);
      ((Path)localObject).lineTo(85.0F, 52.0F);
      ((Path)localObject).lineTo(85.0F, 44.0F);
      ((Path)localObject).lineTo(32.0F, 44.0F);
      ((Path)localObject).lineTo(32.0F, 52.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 52.0F);
      ((Path)localObject).lineTo(24.0F, 52.0F);
      ((Path)localObject).lineTo(24.0F, 44.0F);
      ((Path)localObject).lineTo(12.0F, 44.0F);
      ((Path)localObject).lineTo(12.0F, 52.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(32.0F, 77.0F);
      ((Path)localObject).lineTo(85.0F, 77.0F);
      ((Path)localObject).lineTo(85.0F, 69.0F);
      ((Path)localObject).lineTo(32.0F, 69.0F);
      ((Path)localObject).lineTo(32.0F, 77.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 77.0F);
      ((Path)localObject).lineTo(24.0F, 77.0F);
      ((Path)localObject).lineTo(24.0F, 69.0F);
      ((Path)localObject).lineTo(12.0F, 69.0F);
      ((Path)localObject).lineTo(12.0F, 77.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ju
 * JD-Core Version:    0.6.2
 */