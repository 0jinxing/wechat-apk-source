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

public final class rj extends c
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
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-12206054);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(192.0F, 0.0F);
      ((Path)localObject2).lineTo(192.0F, 192.0F);
      ((Path)localObject2).lineTo(0.0F, 192.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(65.454544F, 90.181816F);
      ((Path)localObject1).lineTo(58.18182F, 90.181816F);
      ((Path)localObject1).lineTo(58.18182F, 103.31862F);
      ((Path)localObject1).cubicTo(58.18182F, 122.70565F, 72.805359F, 138.68132F, 91.63636F, 140.84218F);
      ((Path)localObject1).lineTo(91.63636F, 149.81818F);
      ((Path)localObject1).lineTo(73.720978F, 149.81818F);
      ((Path)localObject1).cubicTo(73.172165F, 149.81818F, 72.727272F, 150.27472F, 72.727272F, 150.81836F);
      ((Path)localObject1).lineTo(72.727272F, 154.63618F);
      ((Path)localObject1).cubicTo(72.727272F, 155.18857F, 73.173027F, 155.63637F, 73.720978F, 155.63637F);
      ((Path)localObject1).lineTo(118.27902F, 155.63637F);
      ((Path)localObject1).cubicTo(118.82784F, 155.63637F, 119.27273F, 155.17982F, 119.27273F, 154.63618F);
      ((Path)localObject1).lineTo(119.27273F, 150.81836F);
      ((Path)localObject1).cubicTo(119.27273F, 150.26598F, 118.82698F, 149.81818F, 118.27902F, 149.81818F);
      ((Path)localObject1).lineTo(100.36363F, 149.81818F);
      ((Path)localObject1).lineTo(100.36363F, 149.81818F);
      ((Path)localObject1).lineTo(100.36363F, 140.84218F);
      ((Path)localObject1).lineTo(100.36363F, 140.84218F);
      ((Path)localObject1).cubicTo(119.19464F, 138.68132F, 133.81818F, 122.70565F, 133.81818F, 103.31862F);
      ((Path)localObject1).lineTo(133.81818F, 90.181816F);
      ((Path)localObject1).lineTo(126.54546F, 90.181816F);
      ((Path)localObject1).lineTo(126.54546F, 102.82269F);
      ((Path)localObject1).cubicTo(126.54546F, 119.94102F, 112.86979F, 133.81818F, 96.0F, 133.81818F);
      ((Path)localObject1).cubicTo(79.130211F, 133.81818F, 65.454544F, 119.94102F, 65.454544F, 102.82269F);
      ((Path)localObject1).lineTo(65.454544F, 90.181816F);
      ((Path)localObject1).lineTo(65.454544F, 90.181816F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(96.0F, 36.363636F);
      ((Path)localObject1).cubicTo(83.146828F, 36.363636F, 72.727272F, 46.774685F, 72.727272F, 59.646313F);
      ((Path)localObject1).lineTo(72.727272F, 103.26278F);
      ((Path)localObject1).cubicTo(72.727272F, 116.12144F, 83.144005F, 126.54546F, 96.0F, 126.54546F);
      ((Path)localObject1).cubicTo(108.85317F, 126.54546F, 119.27273F, 116.13441F, 119.27273F, 103.26278F);
      ((Path)localObject1).lineTo(119.27273F, 59.646313F);
      ((Path)localObject1).cubicTo(119.27273F, 46.787647F, 108.856F, 36.363636F, 96.0F, 36.363636F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.rj
 * JD-Core Version:    0.6.2
 */