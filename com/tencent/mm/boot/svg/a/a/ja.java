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

public final class ja extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-9276814);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(15.052474F, 8.0F);
      ((Path)localObject).cubicTo(11.166417F, 8.0F, 8.0F, 11.165231F, 8.0F, 15.049831F);
      ((Path)localObject).lineTo(8.0F, 128.90221F);
      ((Path)localObject).cubicTo(8.0F, 132.78682F, 11.166417F, 135.95204F, 15.052474F, 135.95204F);
      ((Path)localObject).lineTo(76.365814F, 135.95204F);
      ((Path)localObject).lineTo(76.365814F, 86.411392F);
      ((Path)localObject).lineTo(59.670166F, 86.411392F);
      ((Path)localObject).lineTo(59.670166F, 67.084305F);
      ((Path)localObject).lineTo(76.365814F, 67.084305F);
      ((Path)localObject).lineTo(76.365814F, 52.840763F);
      ((Path)localObject).cubicTo(76.365814F, 36.295242F, 86.488754F, 27.327089F, 101.21739F, 27.327089F);
      ((Path)localObject).cubicTo(108.26987F, 27.327089F, 114.36282F, 27.854628F, 116.13793F, 28.094418F);
      ((Path)localObject).lineTo(116.13793F, 45.35931F);
      ((Path)localObject).lineTo(105.91904F, 45.35931F);
      ((Path)localObject).cubicTo(97.907043F, 45.35931F, 96.323837F, 49.147995F, 96.323837F, 54.759087F);
      ((Path)localObject).lineTo(96.323837F, 67.084305F);
      ((Path)localObject).lineTo(115.46627F, 67.084305F);
      ((Path)localObject).lineTo(112.97151F, 86.411392F);
      ((Path)localObject).lineTo(96.323837F, 86.411392F);
      ((Path)localObject).lineTo(96.323837F, 136.0F);
      ((Path)localObject).lineTo(128.94753F, 136.0F);
      ((Path)localObject).cubicTo(132.83359F, 136.0F, 136.0F, 132.83476F, 136.0F, 128.95016F);
      ((Path)localObject).lineTo(136.0F, 15.049831F);
      ((Path)localObject).cubicTo(136.0F, 11.117272F, 132.88156F, 8.0F, 128.94753F, 8.0F);
      ((Path)localObject).lineTo(15.052474F, 8.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ja
 * JD-Core Version:    0.6.2
 */