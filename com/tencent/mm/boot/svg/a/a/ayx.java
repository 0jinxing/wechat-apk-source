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

public final class ayx extends c
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(72.0F, 36.444443F);
      ((Path)localObject).cubicTo(72.0F, 55.882668F, 55.882668F, 72.0F, 35.555557F, 72.0F);
      ((Path)localObject).cubicTo(16.117332F, 72.0F, 0.0F, 55.882668F, 0.0F, 36.444443F);
      ((Path)localObject).cubicTo(0.0F, 16.117332F, 16.117332F, 0.0F, 35.555557F, 0.0F);
      ((Path)localObject).cubicTo(55.882668F, 0.0F, 72.0F, 16.117332F, 72.0F, 36.444443F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(31.091883F, 45.941124F);
      ((Path)localObject).lineTo(21.18198F, 36.031223F);
      ((Path)localObject).lineTo(18.0F, 39.213203F);
      ((Path)localObject).lineTo(28.970562F, 50.183765F);
      ((Path)localObject).cubicTo(30.142136F, 51.355339F, 32.04163F, 51.355339F, 33.213203F, 50.183765F);
      ((Path)localObject).lineTo(56.214989F, 27.18198F);
      ((Path)localObject).lineTo(53.033009F, 24.0F);
      ((Path)localObject).lineTo(31.091883F, 45.941124F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayx
 * JD-Core Version:    0.6.2
 */