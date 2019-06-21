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

public final class aaa extends c
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
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(42.0F, 9.0F);
      ((Path)localObject).lineTo(42.0F, 15.0F);
      ((Path)localObject).lineTo(15.0F, 15.0F);
      ((Path)localObject).lineTo(15.0F, 57.0F);
      ((Path)localObject).lineTo(57.0F, 57.0F);
      ((Path)localObject).lineTo(57.0F, 30.0F);
      ((Path)localObject).lineTo(63.0F, 30.0F);
      ((Path)localObject).lineTo(63.0F, 60.0F);
      ((Path)localObject).cubicTo(63.0F, 61.656853F, 61.656853F, 63.0F, 60.0F, 63.0F);
      ((Path)localObject).lineTo(12.0F, 63.0F);
      ((Path)localObject).cubicTo(10.343145F, 63.0F, 9.0F, 61.656853F, 9.0F, 60.0F);
      ((Path)localObject).lineTo(9.0F, 12.0F);
      ((Path)localObject).cubicTo(9.0F, 10.343145F, 10.343145F, 9.0F, 12.0F, 9.0F);
      ((Path)localObject).lineTo(42.0F, 9.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(59.821098F, 10.06066F);
      ((Path)localObject).lineTo(61.942421F, 12.18198F);
      ((Path)localObject).cubicTo(62.528206F, 12.767767F, 62.528206F, 13.717514F, 61.942421F, 14.303301F);
      ((Path)localObject).lineTo(33.942829F, 42.302895F);
      ((Path)localObject).lineTo(27.965082F, 45.242802F);
      ((Path)localObject).cubicTo(27.519051F, 45.462166F, 26.979641F, 45.278412F, 26.760279F, 44.832382F);
      ((Path)localObject).cubicTo(26.637094F, 44.581913F, 26.637094F, 44.288467F, 26.760279F, 44.037998F);
      ((Path)localObject).lineTo(29.700188F, 38.060253F);
      ((Path)localObject).lineTo(57.69978F, 10.06066F);
      ((Path)localObject).cubicTo(58.285564F, 9.474874F, 59.235313F, 9.474874F, 59.821098F, 10.06066F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aaa
 * JD-Core Version:    0.6.2
 */