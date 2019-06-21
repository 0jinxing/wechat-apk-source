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

public final class bbw extends c
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
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(72.0F, 124.8F);
      ((Path)localObject).cubicTo(101.16064F, 124.8F, 124.8F, 101.16064F, 124.8F, 72.0F);
      ((Path)localObject).cubicTo(124.8F, 42.839367F, 101.16064F, 19.200001F, 72.0F, 19.200001F);
      ((Path)localObject).cubicTo(42.839367F, 19.200001F, 19.200001F, 42.839367F, 19.200001F, 72.0F);
      ((Path)localObject).cubicTo(19.200001F, 101.16064F, 42.839367F, 124.8F, 72.0F, 124.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(72.0F, 132.0F);
      ((Path)localObject).cubicTo(38.862915F, 132.0F, 12.0F, 105.13708F, 12.0F, 72.0F);
      ((Path)localObject).cubicTo(12.0F, 38.862915F, 38.862915F, 12.0F, 72.0F, 12.0F);
      ((Path)localObject).cubicTo(105.13708F, 12.0F, 132.0F, 38.862915F, 132.0F, 72.0F);
      ((Path)localObject).cubicTo(132.0F, 105.13708F, 105.13708F, 132.0F, 72.0F, 132.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(72.0F, 106.8F);
      ((Path)localObject).cubicTo(91.219513F, 106.8F, 106.8F, 91.219513F, 106.8F, 72.0F);
      ((Path)localObject).cubicTo(106.8F, 52.780491F, 91.219513F, 37.200001F, 72.0F, 37.200001F);
      ((Path)localObject).cubicTo(52.780491F, 37.200001F, 37.200001F, 52.780491F, 37.200001F, 72.0F);
      ((Path)localObject).cubicTo(37.200001F, 91.219513F, 52.780491F, 106.8F, 72.0F, 106.8F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(72.0F, 114.0F);
      ((Path)localObject).cubicTo(48.804039F, 114.0F, 30.0F, 95.195961F, 30.0F, 72.0F);
      ((Path)localObject).cubicTo(30.0F, 48.804039F, 48.804039F, 30.0F, 72.0F, 30.0F);
      ((Path)localObject).cubicTo(95.195961F, 30.0F, 114.0F, 48.804039F, 114.0F, 72.0F);
      ((Path)localObject).cubicTo(114.0F, 95.195961F, 95.195961F, 114.0F, 72.0F, 114.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbw
 * JD-Core Version:    0.6.2
 */