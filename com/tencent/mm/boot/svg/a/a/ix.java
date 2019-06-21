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

public final class ix extends c
{
  private final int height = 242;
  private final int width = 245;

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
        paramInt = 245;
        continue;
        paramInt = 242;
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-3552823);
      localPaint.setStrokeWidth(4.0F);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(123.0F, 7.0F);
      localPath.cubicTo(185.96046F, 7.0F, 237.0F, 58.039536F, 237.0F, 121.0F);
      localPath.cubicTo(237.0F, 183.96046F, 185.96046F, 235.0F, 123.0F, 235.0F);
      localPath.cubicTo(60.039536F, 235.0F, 9.0F, 183.96046F, 9.0F, 121.0F);
      localPath.cubicTo(9.0F, 58.039536F, 60.039536F, 7.0F, 123.0F, 7.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-3552823);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(117.13348F, 111.82906F);
      ((Path)localObject).lineTo(94.750854F, 89.446419F);
      ((Path)localObject).lineTo(94.750854F, 100.31056F);
      ((Path)localObject).lineTo(116.18076F, 121.74048F);
      ((Path)localObject).lineTo(94.750854F, 143.17038F);
      ((Path)localObject).lineTo(94.750854F, 154.18599F);
      ((Path)localObject).lineTo(117.13348F, 131.80336F);
      ((Path)localObject).lineTo(117.13348F, 165.4863F);
      ((Path)localObject).lineTo(116.81284F, 165.80695F);
      ((Path)localObject).lineTo(117.13348F, 165.80695F);
      ((Path)localObject).lineTo(117.13348F, 176.50191F);
      ((Path)localObject).lineTo(149.46358F, 144.17183F);
      ((Path)localObject).lineTo(148.58734F, 143.29559F);
      ((Path)localObject).lineTo(148.59369F, 143.28926F);
      ((Path)localObject).lineTo(127.12064F, 121.81621F);
      ((Path)localObject).lineTo(148.28012F, 100.65672F);
      ((Path)localObject).lineTo(148.23923F, 100.61583F);
      ((Path)localObject).lineTo(150.24332F, 98.61174F);
      ((Path)localObject).lineTo(117.13348F, 65.501915F);
      ((Path)localObject).lineTo(117.13348F, 75.7257F);
      ((Path)localObject).lineTo(117.13348F, 111.82906F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(124.9227F, 112.99854F);
      ((Path)localObject).lineTo(139.2686F, 98.652641F);
      ((Path)localObject).lineTo(124.9227F, 84.306732F);
      ((Path)localObject).lineTo(124.9227F, 112.99854F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(124.9227F, 157.6971F);
      ((Path)localObject).lineTo(138.53004F, 144.08975F);
      ((Path)localObject).lineTo(124.9227F, 130.48241F);
      ((Path)localObject).lineTo(124.9227F, 157.6971F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ix
 * JD-Core Version:    0.6.2
 */