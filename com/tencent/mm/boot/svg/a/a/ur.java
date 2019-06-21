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

public final class ur extends c
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
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 230, 4);
      Paint localPaint1 = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(43.491169F, 12.6F);
      ((Path)localObject1).lineTo(14.091168F, 42.0F);
      ((Path)localObject1).lineTo(29.999989F, 57.908821F);
      ((Path)localObject1).lineTo(59.398491F, 28.508768F);
      ((Path)localObject1).lineTo(59.399723F, 12.6F);
      ((Path)localObject1).lineTo(43.491169F, 12.6F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(60.0F, 9.0F);
      ((Path)localObject1).cubicTo(61.657085F, 8.999896F, 63.00013F, 10.343145F, 63.0F, 12.0F);
      ((Path)localObject1).lineTo(62.99847F, 28.757538F);
      ((Path)localObject1).cubicTo(62.998409F, 29.553082F, 62.682365F, 30.316027F, 62.119843F, 30.878574F);
      ((Path)localObject1).lineTo(32.121319F, 60.878681F);
      ((Path)localObject1).cubicTo(30.949696F, 62.050304F, 29.0502F, 62.050304F, 27.878628F, 60.878731F);
      ((Path)localObject1).lineTo(11.121321F, 44.121319F);
      ((Path)localObject1).cubicTo(9.949747F, 42.949749F, 9.949747F, 41.050251F, 11.121321F, 39.878681F);
      ((Path)localObject1).lineTo(41.121319F, 9.878679F);
      ((Path)localObject1).cubicTo(41.683929F, 9.316071F, 42.446991F, 9.0F, 43.242641F, 9.0F);
      ((Path)localObject1).lineTo(60.0F, 9.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localPaint2.setStrokeWidth(1.2F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(48.0F, 20.4F);
      ((Path)localObject2).cubicTo(49.988224F, 20.4F, 51.599998F, 22.011774F, 51.599998F, 24.0F);
      ((Path)localObject2).cubicTo(51.599998F, 25.988226F, 49.988224F, 27.6F, 48.0F, 27.6F);
      ((Path)localObject2).cubicTo(46.011776F, 27.6F, 44.400002F, 25.988226F, 44.400002F, 24.0F);
      ((Path)localObject2).cubicTo(44.400002F, 22.011774F, 46.011776F, 20.4F, 48.0F, 20.4F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ur
 * JD-Core Version:    0.6.2
 */