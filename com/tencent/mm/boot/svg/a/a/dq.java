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

public final class dq extends c
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
      localPaint.setColor(-1);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(36.0F, 0.0F);
      localPath.cubicTo(55.882252F, 0.0F, 72.0F, 16.117748F, 72.0F, 36.0F);
      localPath.cubicTo(72.0F, 55.882252F, 55.882252F, 72.0F, 36.0F, 72.0F);
      localPath.cubicTo(16.117748F, 72.0F, 0.0F, 55.882252F, 0.0F, 36.0F);
      localPath.cubicTo(0.0F, 16.117748F, 16.117748F, 0.0F, 36.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(33.0F, 33.0F);
      ((Path)localObject).lineTo(33.0F, 18.0F);
      ((Path)localObject).lineTo(39.0F, 18.0F);
      ((Path)localObject).lineTo(39.0F, 33.0F);
      ((Path)localObject).lineTo(54.0F, 33.0F);
      ((Path)localObject).lineTo(54.0F, 39.0F);
      ((Path)localObject).lineTo(39.0F, 39.0F);
      ((Path)localObject).lineTo(39.0F, 54.0F);
      ((Path)localObject).lineTo(33.0F, 54.0F);
      ((Path)localObject).lineTo(33.0F, 39.0F);
      ((Path)localObject).lineTo(18.0F, 39.0F);
      ((Path)localObject).lineTo(18.0F, 33.0F);
      ((Path)localObject).lineTo(33.0F, 33.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 227, 4);
      localPaint = c.a(localPaint, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dq
 * JD-Core Version:    0.6.2
 */