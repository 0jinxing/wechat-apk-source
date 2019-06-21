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

public final class ij extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
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
      localPaint.setColor(-16139513);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(115.8F, 60.688889F);
      localPath.cubicTo(115.8F, 29.181868F, 90.81813F, 4.2F, 59.311111F, 4.2F);
      localPath.cubicTo(29.181868F, 4.2F, 4.2F, 29.181868F, 4.2F, 60.688889F);
      localPath.cubicTo(4.2F, 90.81813F, 29.181868F, 115.8F, 59.311111F, 115.8F);
      localPath.cubicTo(90.81813F, 115.8F, 115.8F, 90.81813F, 115.8F, 60.688889F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(32.582005F, 63.962925F);
      ((Path)localObject).cubicTo(32.199821F, 63.567383F, 32.154182F, 62.887268F, 32.482109F, 62.441059F);
      ((Path)localObject).lineTo(34.526138F, 59.65979F);
      ((Path)localObject).cubicTo(34.853153F, 59.214828F, 35.480194F, 59.131527F, 35.906685F, 59.458405F);
      ((Path)localObject).lineTo(50.228809F, 70.435493F);
      ((Path)localObject).cubicTo(50.664249F, 70.769234F, 51.36269F, 70.751999F, 51.779251F, 70.404968F);
      ((Path)localObject).lineTo(87.556282F, 40.599812F);
      ((Path)localObject).cubicTo(87.977119F, 40.249214F, 88.639626F, 40.282352F, 89.034737F, 40.672565F);
      ((Path)localObject).lineTo(90.830078F, 42.445641F);
      ((Path)localObject).cubicTo(91.225769F, 42.836422F, 91.232048F, 43.462711F, 90.834473F, 43.853981F);
      ((Path)localObject).lineTo(51.728115F, 82.340485F);
      ((Path)localObject).cubicTo(51.334854F, 82.727509F, 50.700047F, 82.714195F, 50.324051F, 82.325066F);
      ((Path)localObject).lineTo(32.582005F, 63.962925F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ij
 * JD-Core Version:    0.6.2
 */