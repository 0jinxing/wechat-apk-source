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

public final class cj extends c
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
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(26.302921F, 41.794167F);
      ((Path)localObject).lineTo(26.302921F, 19.211407F);
      ((Path)localObject).lineTo(42.211685F, 19.211407F);
      ((Path)localObject).cubicTo(45.428864F, 19.211407F, 48.290138F, 20.02573F, 49.282246F, 20.948542F);
      ((Path)localObject).cubicTo(51.91206F, 23.283072F, 54.585167F, 22.735918F, 54.585167F, 29.634218F);
      ((Path)localObject).cubicTo(54.585167F, 36.532516F, 51.91206F, 37.732571F, 49.282246F, 40.05703F);
      ((Path)localObject).cubicTo(48.290138F, 41.038528F, 45.428864F, 41.840698F, 42.211685F, 41.794167F);
      ((Path)localObject).lineTo(26.302921F, 41.794167F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(21.0F, 14.0F);
      ((Path)localObject).lineTo(21.0F, 66.114059F);
      ((Path)localObject).lineTo(26.302921F, 66.114059F);
      ((Path)localObject).lineTo(26.302921F, 47.005573F);
      ((Path)localObject).lineTo(43.979324F, 47.005573F);
      ((Path)localObject).cubicTo(49.142723F, 47.143589F, 53.855812F, 44.454838F, 56.352806F, 41.794167F);
      ((Path)localObject).cubicTo(58.849804F, 39.133495F, 59.888088F, 35.379871F, 59.888088F, 31.371353F);
      ((Path)localObject).cubicTo(59.888088F, 25.94755F, 58.535789F, 22.28079F, 56.352806F, 19.211407F);
      ((Path)localObject).cubicTo(53.8633F, 15.711034F, 49.142723F, 14.0F, 43.979324F, 14.0F);
      ((Path)localObject).lineTo(21.0F, 14.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cj
 * JD-Core Version:    0.6.2
 */