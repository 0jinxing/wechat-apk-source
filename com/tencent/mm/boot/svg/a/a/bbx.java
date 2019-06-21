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

public final class bbx extends c
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
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(72.0F, 130.8F);
      ((Path)localObject2).cubicTo(104.47434F, 130.8F, 130.8F, 104.47434F, 130.8F, 72.0F);
      ((Path)localObject2).cubicTo(130.8F, 39.525658F, 104.47434F, 13.2F, 72.0F, 13.2F);
      ((Path)localObject2).cubicTo(39.525658F, 13.2F, 13.2F, 39.525658F, 13.2F, 72.0F);
      ((Path)localObject2).cubicTo(13.2F, 104.47434F, 39.525658F, 130.8F, 72.0F, 130.8F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(72.0F, 138.0F);
      ((Path)localObject2).cubicTo(35.549206F, 138.0F, 6.0F, 108.45079F, 6.0F, 72.0F);
      ((Path)localObject2).cubicTo(6.0F, 35.549206F, 35.549206F, 6.0F, 72.0F, 6.0F);
      ((Path)localObject2).cubicTo(108.45079F, 6.0F, 138.0F, 35.549206F, 138.0F, 72.0F);
      ((Path)localObject2).cubicTo(138.0F, 108.45079F, 108.45079F, 138.0F, 72.0F, 138.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(72.0F, 106.8F);
      ((Path)localObject1).cubicTo(91.219513F, 106.8F, 106.8F, 91.219513F, 106.8F, 72.0F);
      ((Path)localObject1).cubicTo(106.8F, 52.780491F, 91.219513F, 37.200001F, 72.0F, 37.200001F);
      ((Path)localObject1).cubicTo(52.780491F, 37.200001F, 37.200001F, 52.780491F, 37.200001F, 72.0F);
      ((Path)localObject1).cubicTo(37.200001F, 91.219513F, 52.780491F, 106.8F, 72.0F, 106.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(72.0F, 114.0F);
      ((Path)localObject1).cubicTo(48.804039F, 114.0F, 30.0F, 95.195961F, 30.0F, 72.0F);
      ((Path)localObject1).cubicTo(30.0F, 48.804039F, 48.804039F, 30.0F, 72.0F, 30.0F);
      ((Path)localObject1).cubicTo(95.195961F, 30.0F, 114.0F, 48.804039F, 114.0F, 72.0F);
      ((Path)localObject1).cubicTo(114.0F, 95.195961F, 95.195961F, 114.0F, 72.0F, 114.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbx
 * JD-Core Version:    0.6.2
 */