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

public final class ka extends c
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(53.0F, 44.0F);
      ((Path)localObject).lineTo(81.0F, 44.0F);
      ((Path)localObject).lineTo(81.0F, 16.0F);
      ((Path)localObject).lineTo(53.0F, 16.0F);
      ((Path)localObject).lineTo(53.0F, 44.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(16.0F, 44.0F);
      ((Path)localObject).lineTo(44.0F, 44.0F);
      ((Path)localObject).lineTo(44.0F, 16.0F);
      ((Path)localObject).lineTo(16.0F, 16.0F);
      ((Path)localObject).lineTo(16.0F, 44.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(53.0F, 81.0F);
      ((Path)localObject).lineTo(81.0F, 81.0F);
      ((Path)localObject).lineTo(81.0F, 53.0F);
      ((Path)localObject).lineTo(53.0F, 53.0F);
      ((Path)localObject).lineTo(53.0F, 81.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(16.0F, 81.0F);
      ((Path)localObject).lineTo(44.0F, 81.0F);
      ((Path)localObject).lineTo(44.0F, 53.0F);
      ((Path)localObject).lineTo(16.0F, 53.0F);
      ((Path)localObject).lineTo(16.0F, 81.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ka
 * JD-Core Version:    0.6.2
 */