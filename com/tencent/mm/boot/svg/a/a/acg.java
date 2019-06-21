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

public final class acg extends c
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
      ((Paint)localObject).setColor(-16777216);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(31.322699F, 25.5F);
      ((Path)localObject).lineTo(38.61396F, 32.791264F);
      ((Path)localObject).lineTo(35.43198F, 35.973244F);
      ((Path)localObject).lineTo(25.88604F, 26.427301F);
      ((Path)localObject).lineTo(23.764719F, 24.305983F);
      ((Path)localObject).cubicTo(23.178932F, 23.720196F, 23.178932F, 22.770449F, 23.764719F, 22.184662F);
      ((Path)localObject).lineTo(35.43198F, 10.5174F);
      ((Path)localObject).lineTo(38.61396F, 13.69938F);
      ((Path)localObject).lineTo(31.313341F, 21.0F);
      ((Path)localObject).lineTo(45.0F, 21.0F);
      ((Path)localObject).cubicTo(54.941124F, 21.0F, 63.0F, 29.058874F, 63.0F, 39.0F);
      ((Path)localObject).cubicTo(63.0F, 48.941124F, 54.941124F, 57.0F, 45.0F, 57.0F);
      ((Path)localObject).lineTo(12.0F, 57.0F);
      ((Path)localObject).lineTo(12.0F, 52.5F);
      ((Path)localObject).lineTo(45.0F, 52.5F);
      ((Path)localObject).cubicTo(52.455845F, 52.5F, 58.5F, 46.455845F, 58.5F, 39.0F);
      ((Path)localObject).cubicTo(58.5F, 31.544155F, 52.455845F, 25.5F, 45.0F, 25.5F);
      ((Path)localObject).lineTo(31.322699F, 25.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.acg
 * JD-Core Version:    0.6.2
 */