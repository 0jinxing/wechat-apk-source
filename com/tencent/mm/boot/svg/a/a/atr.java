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

public final class atr extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      localPaint.setColor(-2697514);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(12.0F, 0.0F);
      ((Path)localObject).cubicTo(5.371652F, 0.0F, 0.0F, 5.371652F, 0.0F, 12.0F);
      ((Path)localObject).cubicTo(0.0F, 18.628347F, 5.371652F, 24.0F, 12.0F, 24.0F);
      ((Path)localObject).cubicTo(18.628347F, 24.0F, 24.0F, 18.628347F, 24.0F, 12.0F);
      ((Path)localObject).cubicTo(24.0F, 5.371652F, 18.628347F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.148247F, 12.97082F);
      ((Path)localObject).lineTo(18.916821F, 15.12273F);
      ((Path)localObject).lineTo(18.506933F, 16.406258F);
      ((Path)localObject).lineTo(10.797303F, 13.955056F);
      ((Path)localObject).lineTo(10.797303F, 3.155124F);
      ((Path)localObject).lineTo(12.145618F, 3.155124F);
      ((Path)localObject).lineTo(12.145618F, 12.97082F);
      ((Path)localObject).lineTo(12.148247F, 12.97082F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.atr
 * JD-Core Version:    0.6.2
 */