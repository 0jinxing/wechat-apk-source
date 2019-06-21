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

public final class vx extends c
{
  private final int height = 60;
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
        paramInt = 60;
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
      localPaint.setColor(117440512);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 12.0F);
      localPath.cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      localPath.lineTo(84.0F, 0.0F);
      localPath.cubicTo(90.627419F, 0.0F, 96.0F, 5.372582F, 96.0F, 12.0F);
      localPath.lineTo(96.0F, 48.0F);
      localPath.cubicTo(96.0F, 54.627419F, 90.627419F, 60.0F, 84.0F, 60.0F);
      localPath.lineTo(12.0F, 60.0F);
      localPath.cubicTo(5.372582F, 60.0F, 0.0F, 54.627419F, 0.0F, 48.0F);
      localPath.lineTo(0.0F, 12.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-11048043);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 36.0F);
      ((Path)localObject).cubicTo(32.686291F, 36.0F, 30.0F, 33.313709F, 30.0F, 30.0F);
      ((Path)localObject).cubicTo(30.0F, 26.686291F, 32.686291F, 24.0F, 36.0F, 24.0F);
      ((Path)localObject).cubicTo(39.313709F, 24.0F, 42.0F, 26.686291F, 42.0F, 30.0F);
      ((Path)localObject).cubicTo(42.0F, 33.313709F, 39.313709F, 36.0F, 36.0F, 36.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.0F, 36.0F);
      ((Path)localObject).cubicTo(56.686291F, 36.0F, 54.0F, 33.313709F, 54.0F, 30.0F);
      ((Path)localObject).cubicTo(54.0F, 26.686291F, 56.686291F, 24.0F, 60.0F, 24.0F);
      ((Path)localObject).cubicTo(63.313709F, 24.0F, 66.0F, 26.686291F, 66.0F, 30.0F);
      ((Path)localObject).cubicTo(66.0F, 33.313709F, 63.313709F, 36.0F, 60.0F, 36.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vx
 * JD-Core Version:    0.6.2
 */