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

public final class asu extends c
{
  private final int height = 54;
  private final int width = 54;

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
        paramInt = 54;
        continue;
        paramInt = 54;
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
      ((Paint)localObject).setColor(-8683387);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(35.483871F, 28.66256F);
      ((Path)localObject).lineTo(35.483871F, 37.66291F);
      ((Path)localObject).cubicTo(35.483871F, 38.458199F, 34.839161F, 39.102909F, 34.043873F, 39.102909F);
      ((Path)localObject).lineTo(6.44F, 39.102909F);
      ((Path)localObject).cubicTo(5.64471F, 39.102909F, 5.0F, 38.458199F, 5.0F, 37.66291F);
      ((Path)localObject).lineTo(5.0F, 16.157227F);
      ((Path)localObject).cubicTo(5.0F, 15.361936F, 5.64471F, 14.717226F, 6.44F, 14.717226F);
      ((Path)localObject).lineTo(34.043873F, 14.717226F);
      ((Path)localObject).cubicTo(34.839161F, 14.717226F, 35.483871F, 15.361936F, 35.483871F, 16.157227F);
      ((Path)localObject).lineTo(35.483871F, 25.287582F);
      ((Path)localObject).cubicTo(38.187832F, 22.945694F, 46.986294F, 14.808152F, 47.822582F, 14.082182F);
      ((Path)localObject).cubicTo(48.88459F, 13.782787F, 50.0F, 14.307455F, 50.0F, 15.557618F);
      ((Path)localObject).lineTo(50.0F, 38.42688F);
      ((Path)localObject).cubicTo(50.0F, 39.543766F, 48.991348F, 40.273739F, 47.822582F, 39.902317F);
      ((Path)localObject).cubicTo(47.261726F, 39.311028F, 38.312565F, 31.013081F, 35.483871F, 28.66256F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.asu
 * JD-Core Version:    0.6.2
 */