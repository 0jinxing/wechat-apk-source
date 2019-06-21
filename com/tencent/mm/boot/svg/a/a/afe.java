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

public final class afe extends c
{
  private final int height = 70;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 70;
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(69.0F, 50.0F);
      ((Path)localObject).lineTo(21.0F, 50.0F);
      ((Path)localObject).lineTo(21.0F, 52.008118F);
      ((Path)localObject).cubicTo(21.0F, 53.108204F, 20.113445F, 54.0F, 18.994081F, 54.0F);
      ((Path)localObject).lineTo(16.005919F, 54.0F);
      ((Path)localObject).cubicTo(14.898081F, 54.0F, 14.0F, 53.106602F, 14.0F, 52.008118F);
      ((Path)localObject).lineTo(14.0F, 50.0F);
      ((Path)localObject).lineTo(0.0F, 50.0F);
      ((Path)localObject).lineTo(0.0F, 43.0F);
      ((Path)localObject).lineTo(14.0F, 43.0F);
      ((Path)localObject).lineTo(14.0F, 43.0F);
      ((Path)localObject).lineTo(14.0F, 40.991882F);
      ((Path)localObject).cubicTo(14.0F, 39.891796F, 14.886555F, 39.0F, 16.005919F, 39.0F);
      ((Path)localObject).lineTo(18.994081F, 39.0F);
      ((Path)localObject).cubicTo(20.101919F, 39.0F, 21.0F, 39.893398F, 21.0F, 40.991882F);
      ((Path)localObject).lineTo(21.0F, 43.0F);
      ((Path)localObject).lineTo(69.0F, 43.0F);
      ((Path)localObject).lineTo(69.0F, 40.991882F);
      ((Path)localObject).cubicTo(69.0F, 39.891796F, 69.886559F, 39.0F, 71.00592F, 39.0F);
      ((Path)localObject).lineTo(73.99408F, 39.0F);
      ((Path)localObject).cubicTo(75.101921F, 39.0F, 76.0F, 39.893398F, 76.0F, 40.991882F);
      ((Path)localObject).lineTo(76.0F, 43.0F);
      ((Path)localObject).lineTo(90.0F, 43.0F);
      ((Path)localObject).lineTo(90.0F, 50.0F);
      ((Path)localObject).lineTo(76.0F, 50.0F);
      ((Path)localObject).lineTo(76.0F, 52.008118F);
      ((Path)localObject).cubicTo(76.0F, 53.108204F, 75.113441F, 54.0F, 73.99408F, 54.0F);
      ((Path)localObject).lineTo(71.00592F, 54.0F);
      ((Path)localObject).cubicTo(69.898079F, 54.0F, 69.0F, 53.106602F, 69.0F, 52.008118F);
      ((Path)localObject).lineTo(69.0F, 50.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(0.0F, 3.99323F);
      ((Path)localObject).cubicTo(0.0F, 2.8924F, 0.8907616F, 2.0F, 2.005965F, 2.0F);
      ((Path)localObject).lineTo(87.994034F, 2.0F);
      ((Path)localObject).cubicTo(89.101898F, 2.0F, 90.0F, 2.895443F, 90.0F, 3.99323F);
      ((Path)localObject).lineTo(90.0F, 66.006767F);
      ((Path)localObject).cubicTo(90.0F, 67.107597F, 89.109238F, 68.0F, 87.994034F, 68.0F);
      ((Path)localObject).lineTo(2.005965F, 68.0F);
      ((Path)localObject).cubicTo(0.898101F, 68.0F, 0.0F, 67.104553F, 0.0F, 66.006767F);
      ((Path)localObject).lineTo(0.0F, 3.99323F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 128, 4);
      localPaint = c.a(localPaint, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afe
 * JD-Core Version:    0.6.2
 */