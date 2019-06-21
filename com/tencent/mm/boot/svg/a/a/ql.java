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

public final class ql extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localPaint.setColor(-14187817);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(192.0F, 0.0F);
      localPath.lineTo(192.0F, 192.0F);
      localPath.lineTo(0.0F, 192.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(56.891357F, 44.799999F);
      ((Path)localObject).cubicTo(54.926315F, 44.799999F, 53.333332F, 46.408459F, 53.333332F, 48.354576F);
      ((Path)localObject).lineTo(53.333332F, 143.64542F);
      ((Path)localObject).cubicTo(53.333332F, 145.60857F, 54.924335F, 147.2F, 56.891357F, 147.2F);
      ((Path)localObject).lineTo(135.10864F, 147.2F);
      ((Path)localObject).cubicTo(137.07368F, 147.2F, 138.66667F, 145.59154F, 138.66667F, 143.64542F);
      ((Path)localObject).lineTo(138.66667F, 48.354576F);
      ((Path)localObject).cubicTo(138.66667F, 46.391438F, 137.07567F, 44.799999F, 135.10864F, 44.799999F);
      ((Path)localObject).lineTo(56.891357F, 44.799999F);
      ((Path)localObject).lineTo(56.891357F, 44.799999F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.0F, 76.800003F);
      ((Path)localObject).lineTo(64.0F, 83.199997F);
      ((Path)localObject).lineTo(108.8F, 83.199997F);
      ((Path)localObject).lineTo(108.8F, 76.800003F);
      ((Path)localObject).lineTo(64.0F, 76.800003F);
      ((Path)localObject).lineTo(64.0F, 76.800003F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.0F, 89.599998F);
      ((Path)localObject).lineTo(64.0F, 96.0F);
      ((Path)localObject).lineTo(87.466667F, 96.0F);
      ((Path)localObject).lineTo(87.466667F, 89.599998F);
      ((Path)localObject).lineTo(64.0F, 89.599998F);
      ((Path)localObject).lineTo(64.0F, 89.599998F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.0F, 102.4F);
      ((Path)localObject).lineTo(64.0F, 108.8F);
      ((Path)localObject).lineTo(91.73333F, 108.8F);
      ((Path)localObject).lineTo(91.73333F, 102.4F);
      ((Path)localObject).lineTo(64.0F, 102.4F);
      ((Path)localObject).lineTo(64.0F, 102.4F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.400002F, 55.466667F);
      ((Path)localObject).cubicTo(73.934631F, 55.466667F, 76.800003F, 58.331631F, 76.800003F, 61.865753F);
      ((Path)localObject).cubicTo(76.800003F, 65.399879F, 73.934631F, 68.26667F, 70.400002F, 68.26667F);
      ((Path)localObject).cubicTo(66.865372F, 68.26667F, 64.0F, 65.399879F, 64.0F, 61.865753F);
      ((Path)localObject).cubicTo(64.0F, 58.331631F, 66.865372F, 55.466667F, 70.400002F, 55.466667F);
      ((Path)localObject).lineTo(70.400002F, 55.466667F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ql
 * JD-Core Version:    0.6.2
 */