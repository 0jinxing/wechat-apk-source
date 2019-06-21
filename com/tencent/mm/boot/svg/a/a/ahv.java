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

public final class ahv extends c
{
  private final int height = 108;
  private final int width = 108;

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
        paramInt = 108;
        continue;
        paramInt = 108;
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
      ((Paint)localObject).setColor(-15683841);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(87.114998F, 33.876888F);
      ((Path)localObject).cubicTo(87.114998F, 30.632847F, 84.48362F, 28.0F, 81.238113F, 28.0F);
      ((Path)localObject).lineTo(26.876888F, 28.0F);
      ((Path)localObject).cubicTo(23.631376F, 28.0F, 21.0F, 30.632847F, 21.0F, 33.876888F);
      ((Path)localObject).lineTo(21.0F, 75.016579F);
      ((Path)localObject).cubicTo(21.0F, 78.262093F, 23.631376F, 80.891998F, 26.876888F, 80.891998F);
      ((Path)localObject).lineTo(81.238113F, 80.891998F);
      ((Path)localObject).cubicTo(84.48362F, 80.891998F, 87.114998F, 78.262093F, 87.114998F, 75.016579F);
      ((Path)localObject).lineTo(87.114998F, 66.199776F);
      ((Path)localObject).lineTo(72.422775F, 66.199776F);
      ((Path)localObject).cubicTo(65.931755F, 66.199776F, 60.668999F, 60.937023F, 60.668999F, 54.445999F);
      ((Path)localObject).cubicTo(60.668999F, 47.954975F, 65.931755F, 42.692223F, 72.422775F, 42.692223F);
      ((Path)localObject).lineTo(87.114998F, 42.692223F);
      ((Path)localObject).lineTo(87.114998F, 33.876888F);
      ((Path)localObject).lineTo(87.114998F, 33.876888F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(66.545891F, 54.445999F);
      ((Path)localObject).cubicTo(66.545891F, 57.692982F, 69.177269F, 60.322887F, 72.422775F, 60.322887F);
      ((Path)localObject).cubicTo(75.668289F, 60.322887F, 78.299667F, 57.692982F, 78.299667F, 54.445999F);
      ((Path)localObject).cubicTo(78.299667F, 51.200489F, 75.668289F, 48.569111F, 72.422775F, 48.569111F);
      ((Path)localObject).cubicTo(69.177269F, 48.569111F, 66.545891F, 51.200489F, 66.545891F, 54.445999F);
      ((Path)localObject).lineTo(66.545891F, 54.445999F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ahv
 * JD-Core Version:    0.6.2
 */