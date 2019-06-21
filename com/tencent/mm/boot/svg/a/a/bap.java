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

public final class bap extends c
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
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(1.75F, 7.75F);
      ((Path)localObject).lineTo(22.25F, 7.75F);
      ((Path)localObject).cubicTo(22.664213F, 7.75F, 23.0F, 8.085787F, 23.0F, 8.5F);
      ((Path)localObject).cubicTo(23.0F, 8.914213F, 22.664213F, 9.25F, 22.25F, 9.25F);
      ((Path)localObject).lineTo(1.75F, 9.25F);
      ((Path)localObject).cubicTo(1.335787F, 9.25F, 1.0F, 8.914213F, 1.0F, 8.5F);
      ((Path)localObject).cubicTo(1.0F, 8.085787F, 1.335787F, 7.75F, 1.75F, 7.75F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(1.75F, 11.25F);
      ((Path)localObject).lineTo(22.25F, 11.25F);
      ((Path)localObject).cubicTo(22.664213F, 11.25F, 23.0F, 11.585787F, 23.0F, 12.0F);
      ((Path)localObject).cubicTo(23.0F, 12.414213F, 22.664213F, 12.75F, 22.25F, 12.75F);
      ((Path)localObject).lineTo(1.75F, 12.75F);
      ((Path)localObject).cubicTo(1.335787F, 12.75F, 1.0F, 12.414213F, 1.0F, 12.0F);
      ((Path)localObject).cubicTo(1.0F, 11.585787F, 1.335787F, 11.25F, 1.75F, 11.25F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(1.75F, 14.75F);
      ((Path)localObject).lineTo(22.25F, 14.75F);
      ((Path)localObject).cubicTo(22.664213F, 14.75F, 23.0F, 15.085787F, 23.0F, 15.5F);
      ((Path)localObject).cubicTo(23.0F, 15.914213F, 22.664213F, 16.25F, 22.25F, 16.25F);
      ((Path)localObject).lineTo(1.75F, 16.25F);
      ((Path)localObject).cubicTo(1.335787F, 16.25F, 1.0F, 15.914213F, 1.0F, 15.5F);
      ((Path)localObject).cubicTo(1.0F, 15.085787F, 1.335787F, 14.75F, 1.75F, 14.75F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bap
 * JD-Core Version:    0.6.2
 */