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

public final class s extends c
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
      localCanvas.saveLayerAlpha(null, 230, 4);
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(1275068416);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 60.0F);
      ((Path)localObject).cubicTo(22.745167F, 60.0F, 12.0F, 49.254833F, 12.0F, 36.0F);
      ((Path)localObject).cubicTo(12.0F, 22.745167F, 22.745167F, 12.0F, 36.0F, 12.0F);
      ((Path)localObject).cubicTo(49.254833F, 12.0F, 60.0F, 22.745167F, 60.0F, 36.0F);
      ((Path)localObject).cubicTo(60.0F, 49.254833F, 49.254833F, 60.0F, 36.0F, 60.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 32.938873F);
      ((Path)localObject).lineTo(27.061129F, 24.0F);
      ((Path)localObject).lineTo(24.0F, 27.061129F);
      ((Path)localObject).lineTo(32.938873F, 36.0F);
      ((Path)localObject).lineTo(24.0F, 44.938873F);
      ((Path)localObject).lineTo(27.061129F, 48.0F);
      ((Path)localObject).lineTo(36.0F, 39.061127F);
      ((Path)localObject).lineTo(44.938873F, 48.0F);
      ((Path)localObject).lineTo(48.0F, 44.938873F);
      ((Path)localObject).lineTo(39.061127F, 36.0F);
      ((Path)localObject).lineTo(48.0F, 27.061129F);
      ((Path)localObject).lineTo(44.938873F, 24.0F);
      ((Path)localObject).lineTo(36.0F, 32.938873F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.s
 * JD-Core Version:    0.6.2
 */