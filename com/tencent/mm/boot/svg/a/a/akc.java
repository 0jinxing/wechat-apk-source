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

public final class akc extends c
{
  private final int height = 107;
  private final int width = 107;

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
        paramInt = 107;
        continue;
        paramInt = 107;
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
      ((Path)localObject).moveTo(29.0F, 22.005177F);
      ((Path)localObject).cubicTo(29.0F, 20.897749F, 29.901951F, 20.0F, 31.00853F, 20.0F);
      ((Path)localObject).lineTo(38.99147F, 20.0F);
      ((Path)localObject).cubicTo(40.10075F, 20.0F, 41.0F, 20.896469F, 41.0F, 22.005177F);
      ((Path)localObject).lineTo(41.0F, 84.99482F);
      ((Path)localObject).cubicTo(41.0F, 86.102249F, 40.098049F, 87.0F, 38.99147F, 87.0F);
      ((Path)localObject).lineTo(31.00853F, 87.0F);
      ((Path)localObject).cubicTo(29.89925F, 87.0F, 29.0F, 86.103531F, 29.0F, 84.99482F);
      ((Path)localObject).lineTo(29.0F, 22.005177F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(66.0F, 22.005177F);
      ((Path)localObject).cubicTo(66.0F, 20.897749F, 66.901947F, 20.0F, 68.00853F, 20.0F);
      ((Path)localObject).lineTo(75.99147F, 20.0F);
      ((Path)localObject).cubicTo(77.100754F, 20.0F, 78.0F, 20.896469F, 78.0F, 22.005177F);
      ((Path)localObject).lineTo(78.0F, 84.99482F);
      ((Path)localObject).cubicTo(78.0F, 86.102249F, 77.098053F, 87.0F, 75.99147F, 87.0F);
      ((Path)localObject).lineTo(68.00853F, 87.0F);
      ((Path)localObject).cubicTo(66.899246F, 87.0F, 66.0F, 86.103531F, 66.0F, 84.99482F);
      ((Path)localObject).lineTo(66.0F, 22.005177F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.akc
 * JD-Core Version:    0.6.2
 */