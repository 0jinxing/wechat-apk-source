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

public final class ajc extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-5592406);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(28.0F, 24.0F);
      ((Path)localObject).lineTo(34.0F, 24.0F);
      ((Path)localObject).lineTo(34.0F, 36.0F);
      ((Path)localObject).lineTo(28.0F, 36.0F);
      ((Path)localObject).lineTo(28.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(38.0F, 24.0F);
      ((Path)localObject).lineTo(43.0F, 24.0F);
      ((Path)localObject).lineTo(43.0F, 36.0F);
      ((Path)localObject).lineTo(38.0F, 36.0F);
      ((Path)localObject).lineTo(38.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(47.0F, 24.0F);
      ((Path)localObject).lineTo(51.0F, 24.0F);
      ((Path)localObject).lineTo(51.0F, 36.0F);
      ((Path)localObject).lineTo(47.0F, 36.0F);
      ((Path)localObject).lineTo(47.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.763962F, 14.012434F);
      ((Path)localObject).cubicTo(26.998892F, 12.900997F, 28.0F, 13.345539F, 28.0F, 15.00742F);
      ((Path)localObject).lineTo(28.0F, 44.99258F);
      ((Path)localObject).cubicTo(28.0F, 46.653534F, 27.008198F, 47.107376F, 25.763962F, 45.987564F);
      ((Path)localObject).lineTo(10.236038F, 32.012436F);
      ((Path)localObject).cubicTo(9.001108F, 30.900997F, 8.991803F, 29.107378F, 10.236038F, 27.987566F);
      ((Path)localObject).lineTo(25.763962F, 14.012434F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ajc
 * JD-Core Version:    0.6.2
 */