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

public final class bw extends c
{
  private final int height = 180;
  private final int width = 180;

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
        paramInt = 180;
        continue;
        paramInt = 180;
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
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-13917627);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(180.0F, 0.0F);
      localPath.lineTo(180.0F, 180.0F);
      localPath.lineTo(0.0F, 180.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(49.799175F, 34.799999F);
      ((Path)localObject).cubicTo(48.142776F, 34.799999F, 46.799999F, 36.136326F, 46.799999F, 37.79583F);
      ((Path)localObject).lineTo(46.799999F, 142.20418F);
      ((Path)localObject).cubicTo(46.799999F, 143.85872F, 48.139797F, 145.2F, 49.799175F, 145.2F);
      ((Path)localObject).lineTo(130.20082F, 145.2F);
      ((Path)localObject).cubicTo(131.85722F, 145.2F, 133.2F, 143.86368F, 133.2F, 142.20418F);
      ((Path)localObject).lineTo(133.2F, 37.79583F);
      ((Path)localObject).cubicTo(133.2F, 36.141277F, 131.8602F, 34.799999F, 130.20082F, 34.799999F);
      ((Path)localObject).lineTo(49.799175F, 34.799999F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(88.800003F, 84.0F);
      ((Path)localObject).lineTo(88.800003F, 90.0F);
      ((Path)localObject).lineTo(57.599998F, 90.0F);
      ((Path)localObject).lineTo(57.599998F, 84.0F);
      ((Path)localObject).lineTo(88.800003F, 84.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(108.0F, 67.199997F);
      ((Path)localObject).lineTo(108.0F, 73.199997F);
      ((Path)localObject).lineTo(57.599998F, 73.199997F);
      ((Path)localObject).lineTo(57.599998F, 67.199997F);
      ((Path)localObject).lineTo(108.0F, 67.199997F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(122.4F, 51.599998F);
      ((Path)localObject).lineTo(122.4F, 57.599998F);
      ((Path)localObject).lineTo(57.599998F, 57.599998F);
      ((Path)localObject).lineTo(57.599998F, 51.599998F);
      ((Path)localObject).lineTo(122.4F, 51.599998F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bw
 * JD-Core Version:    0.6.2
 */