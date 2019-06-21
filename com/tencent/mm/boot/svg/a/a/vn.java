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

public final class vn extends c
{
  private final int height = 6;
  private final int width = 14;

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
        paramInt = 14;
        continue;
        paramInt = 6;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-2500135);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(2.0F, 1.0F);
      ((Path)localObject).lineTo(12.0F, 1.0F);
      ((Path)localObject).cubicTo(12.552284F, 1.0F, 13.0F, 1.447715F, 13.0F, 2.0F);
      ((Path)localObject).lineTo(13.0F, 4.0F);
      ((Path)localObject).cubicTo(13.0F, 4.552285F, 12.552284F, 5.0F, 12.0F, 5.0F);
      ((Path)localObject).lineTo(2.0F, 5.0F);
      ((Path)localObject).cubicTo(1.447715F, 5.0F, 1.0F, 4.552285F, 1.0F, 4.0F);
      ((Path)localObject).lineTo(1.0F, 2.0F);
      ((Path)localObject).cubicTo(1.0F, 1.447715F, 1.447715F, 1.0F, 2.0F, 1.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vn
 * JD-Core Version:    0.6.2
 */