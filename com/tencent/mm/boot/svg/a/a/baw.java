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

public final class baw extends c
{
  private final int height = 102;
  private final int width = 102;

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
        paramInt = 102;
        continue;
        paramInt = 102;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      Object localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-986896);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(102.0F, 0.0F);
      ((Path)localObject1).lineTo(102.0F, 102.0F);
      ((Path)localObject1).lineTo(0.0F, 102.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject1, c.a(localPaint2, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11048043);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(24.0F, 50.0F);
      ((Path)localObject2).cubicTo(24.0F, 48.895432F, 24.89543F, 48.0F, 26.0F, 48.0F);
      ((Path)localObject2).lineTo(76.0F, 48.0F);
      ((Path)localObject2).cubicTo(77.104568F, 48.0F, 78.0F, 48.895432F, 78.0F, 50.0F);
      ((Path)localObject2).lineTo(78.0F, 79.0F);
      ((Path)localObject2).cubicTo(78.0F, 80.104568F, 77.104568F, 81.0F, 76.0F, 81.0F);
      ((Path)localObject2).lineTo(26.0F, 81.0F);
      ((Path)localObject2).cubicTo(24.89543F, 81.0F, 24.0F, 80.104568F, 24.0F, 79.0F);
      ((Path)localObject2).lineTo(24.0F, 50.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-11048043);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(28.5F, 35.0F);
      ((Path)localObject1).cubicTo(28.5F, 22.573593F, 38.573593F, 12.5F, 51.0F, 12.5F);
      ((Path)localObject1).cubicTo(63.426407F, 12.5F, 73.5F, 22.573593F, 73.5F, 35.0F);
      ((Path)localObject1).lineTo(67.5F, 35.0F);
      ((Path)localObject1).cubicTo(67.5F, 25.887302F, 60.112698F, 18.5F, 51.0F, 18.5F);
      ((Path)localObject1).cubicTo(41.887302F, 18.5F, 34.5F, 25.887302F, 34.5F, 35.0F);
      ((Path)localObject1).lineTo(28.5F, 35.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11048043);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(28.5F, 35.0F);
      ((Path)localObject2).lineTo(34.5F, 35.0F);
      ((Path)localObject2).lineTo(34.5F, 47.0F);
      ((Path)localObject2).lineTo(28.5F, 47.0F);
      ((Path)localObject2).lineTo(28.5F, 35.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-11048043);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(67.5F, 35.0F);
      ((Path)localObject1).lineTo(73.5F, 35.0F);
      ((Path)localObject1).lineTo(73.5F, 35.0F);
      ((Path)localObject1).lineTo(73.5F, 35.0F);
      ((Path)localObject1).cubicTo(73.5F, 36.656853F, 72.156853F, 38.0F, 70.5F, 38.0F);
      ((Path)localObject1).lineTo(70.5F, 38.0F);
      ((Path)localObject1).lineTo(70.5F, 38.0F);
      ((Path)localObject1).cubicTo(68.843147F, 38.0F, 67.5F, 36.656853F, 67.5F, 35.0F);
      ((Path)localObject1).lineTo(67.5F, 35.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.baw
 * JD-Core Version:    0.6.2
 */