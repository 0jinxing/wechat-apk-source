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

public final class afy extends c
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
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(1711276032);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(90.0F, 0.0F);
      ((Path)localObject3).cubicTo(139.70563F, 0.0F, 180.0F, 40.294369F, 180.0F, 90.0F);
      ((Path)localObject3).cubicTo(180.0F, 139.70563F, 139.70563F, 180.0F, 90.0F, 180.0F);
      ((Path)localObject3).cubicTo(40.294369F, 180.0F, 0.0F, 139.70563F, 0.0F, 90.0F);
      ((Path)localObject3).cubicTo(0.0F, 40.294369F, 40.294369F, 0.0F, 90.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(69.0F, 59.645351F);
      ((Path)localObject2).cubicTo(69.0F, 56.333775F, 71.315887F, 54.997013F, 74.191467F, 56.67054F);
      ((Path)localObject2).lineTo(126.27224F, 86.980492F);
      ((Path)localObject2).cubicTo(129.1394F, 88.649124F, 129.14781F, 91.349625F, 126.27224F, 93.023155F);
      ((Path)localObject2).lineTo(74.191467F, 123.33311F);
      ((Path)localObject2).cubicTo(71.324303F, 125.00174F, 69.0F, 123.65884F, 69.0F, 120.35829F);
      ((Path)localObject2).lineTo(69.0F, 59.645351F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 204, 4);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-855638017);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(90.0F, 174.0F);
      ((Path)localObject1).cubicTo(136.39192F, 174.0F, 174.0F, 136.39192F, 174.0F, 90.0F);
      ((Path)localObject1).cubicTo(174.0F, 43.608082F, 136.39192F, 6.0F, 90.0F, 6.0F);
      ((Path)localObject1).cubicTo(43.608082F, 6.0F, 6.0F, 43.608082F, 6.0F, 90.0F);
      ((Path)localObject1).cubicTo(6.0F, 136.39192F, 43.608082F, 174.0F, 90.0F, 174.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(90.0F, 180.0F);
      ((Path)localObject1).cubicTo(40.294373F, 180.0F, 0.0F, 139.70563F, 0.0F, 90.0F);
      ((Path)localObject1).cubicTo(0.0F, 40.294373F, 40.294373F, 0.0F, 90.0F, 0.0F);
      ((Path)localObject1).cubicTo(139.70563F, 0.0F, 180.0F, 40.294373F, 180.0F, 90.0F);
      ((Path)localObject1).cubicTo(180.0F, 139.70563F, 139.70563F, 180.0F, 90.0F, 180.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afy
 * JD-Core Version:    0.6.2
 */