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

public final class alk extends c
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
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-855638017);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 28.799999F);
      ((Path)localObject2).cubicTo(0.0F, 12.894198F, 12.894198F, 0.0F, 28.799999F, 0.0F);
      ((Path)localObject2).lineTo(115.2F, 0.0F);
      ((Path)localObject2).cubicTo(131.1058F, 0.0F, 144.0F, 12.894198F, 144.0F, 28.799999F);
      ((Path)localObject2).lineTo(144.0F, 115.2F);
      ((Path)localObject2).cubicTo(144.0F, 131.1058F, 131.1058F, 144.0F, 115.2F, 144.0F);
      ((Path)localObject2).lineTo(28.799999F, 144.0F);
      ((Path)localObject2).cubicTo(12.894198F, 144.0F, 0.0F, 131.1058F, 0.0F, 115.2F);
      ((Path)localObject2).lineTo(0.0F, 28.799999F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(55.950001F, 100.0F);
      ((Path)localObject1).lineTo(55.950001F, 45.325001F);
      ((Path)localObject1).lineTo(71.025002F, 45.325001F);
      ((Path)localObject1).cubicTo(82.050003F, 45.325001F, 89.25F, 49.375F, 89.25F, 58.599998F);
      ((Path)localObject1).cubicTo(89.25F, 64.224998F, 86.324997F, 68.875F, 80.849998F, 70.525002F);
      ((Path)localObject1).lineTo(80.849998F, 70.900002F);
      ((Path)localObject1).cubicTo(87.900002F, 72.099998F, 92.550003F, 76.525002F, 92.550003F, 84.025002F);
      ((Path)localObject1).cubicTo(92.550003F, 94.599998F, 84.449997F, 100.0F, 72.150002F, 100.0F);
      ((Path)localObject1).lineTo(55.950001F, 100.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(60.450001F, 69.175003F);
      ((Path)localObject1).lineTo(69.599998F, 69.175003F);
      ((Path)localObject1).cubicTo(80.400002F, 69.175003F, 84.75F, 65.349998F, 84.75F, 59.125F);
      ((Path)localObject1).cubicTo(84.75F, 51.700001F, 79.724998F, 49.0F, 70.050003F, 49.0F);
      ((Path)localObject1).lineTo(60.450001F, 49.0F);
      ((Path)localObject1).lineTo(60.450001F, 69.175003F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(60.450001F, 96.25F);
      ((Path)localObject1).lineTo(71.099998F, 96.25F);
      ((Path)localObject1).cubicTo(81.675003F, 96.25F, 88.125F, 92.5F, 88.125F, 84.025002F);
      ((Path)localObject1).cubicTo(88.125F, 76.375F, 81.974998F, 72.775002F, 71.099998F, 72.775002F);
      ((Path)localObject1).lineTo(60.450001F, 72.775002F);
      ((Path)localObject1).lineTo(60.450001F, 96.25F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 230, 4);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alk
 * JD-Core Version:    0.6.2
 */