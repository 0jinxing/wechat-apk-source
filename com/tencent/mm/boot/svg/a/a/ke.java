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

public final class ke extends c
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
      ((Paint)localObject).setColor(-8617851);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(77.0F, 71.0F);
      ((Path)localObject).lineTo(53.0F, 76.0F);
      ((Path)localObject).lineTo(53.0F, 26.0F);
      ((Path)localObject).lineTo(77.0F, 21.0F);
      ((Path)localObject).lineTo(77.0F, 71.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(20.0F, 21.0F);
      ((Path)localObject).lineTo(44.0F, 26.0F);
      ((Path)localObject).lineTo(44.0F, 76.0F);
      ((Path)localObject).lineTo(20.0F, 71.0F);
      ((Path)localObject).lineTo(20.0F, 21.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(85.0F, 18.0F);
      ((Path)localObject).cubicTo(85.0F, 14.723531F, 82.276466F, 12.0F, 79.0F, 12.0F);
      ((Path)localObject).cubicTo(78.840515F, 12.0F, 78.766609F, 12.008562F, 79.0F, 12.0F);
      ((Path)localObject).lineTo(79.0F, 12.0F);
      ((Path)localObject).lineTo(79.0F, 12.0F);
      ((Path)localObject).cubicTo(77.960457F, 12.046865F, 77.32959F, 12.18205F, 77.0F, 12.0F);
      ((Path)localObject).lineTo(49.0F, 18.0F);
      ((Path)localObject).lineTo(20.0F, 12.0F);
      ((Path)localObject).cubicTo(19.670408F, 12.18205F, 19.039543F, 12.046865F, 18.0F, 12.0F);
      ((Path)localObject).lineTo(18.0F, 12.0F);
      ((Path)localObject).lineTo(18.0F, 12.0F);
      ((Path)localObject).cubicTo(18.233389F, 12.008562F, 18.159487F, 12.0F, 18.0F, 12.0F);
      ((Path)localObject).cubicTo(14.723531F, 12.0F, 12.0F, 14.723531F, 12.0F, 18.0F);
      ((Path)localObject).cubicTo(12.0F, 18.159487F, 12.008562F, 18.233389F, 12.0F, 18.0F);
      ((Path)localObject).lineTo(12.0F, 18.0F);
      ((Path)localObject).lineTo(12.0F, 72.0F);
      ((Path)localObject).lineTo(12.0F, 72.0F);
      ((Path)localObject).cubicTo(12.008562F, 72.45797F, 12.0F, 72.531868F, 12.0F, 73.0F);
      ((Path)localObject).cubicTo(12.0F, 75.967827F, 14.723531F, 78.69136F, 18.0F, 79.0F);
      ((Path)localObject).cubicTo(18.159487F, 78.69136F, 18.233389F, 78.682793F, 18.0F, 79.0F);
      ((Path)localObject).lineTo(18.0F, 79.0F);
      ((Path)localObject).lineTo(49.0F, 85.0F);
      ((Path)localObject).lineTo(79.0F, 79.0F);
      ((Path)localObject).lineTo(79.0F, 79.0F);
      ((Path)localObject).cubicTo(78.766609F, 78.682793F, 78.840515F, 78.69136F, 79.0F, 79.0F);
      ((Path)localObject).cubicTo(82.276466F, 78.69136F, 85.0F, 75.967827F, 85.0F, 73.0F);
      ((Path)localObject).cubicTo(85.0F, 72.531868F, 84.99144F, 72.45797F, 85.0F, 72.0F);
      ((Path)localObject).lineTo(85.0F, 72.0F);
      ((Path)localObject).lineTo(85.0F, 18.0F);
      ((Path)localObject).lineTo(85.0F, 18.0F);
      ((Path)localObject).cubicTo(84.99144F, 18.233389F, 85.0F, 18.159487F, 85.0F, 18.0F);
      ((Path)localObject).lineTo(85.0F, 18.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ke
 * JD-Core Version:    0.6.2
 */