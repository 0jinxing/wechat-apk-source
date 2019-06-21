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

public final class xt extends c
{
  private final int height = 30;
  private final int width = 55;

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
        paramInt = 55;
        continue;
        paramInt = 30;
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
      ((Path)localObject2).moveTo(0.0F, 4.0F);
      ((Path)localObject2).cubicTo(0.0F, 1.790861F, 1.790861F, 0.0F, 4.0F, 0.0F);
      ((Path)localObject2).lineTo(30.0F, 0.0F);
      ((Path)localObject2).cubicTo(32.209141F, 0.0F, 34.0F, 1.790861F, 34.0F, 4.0F);
      ((Path)localObject2).lineTo(34.0F, 26.0F);
      ((Path)localObject2).cubicTo(34.0F, 28.209139F, 32.209141F, 30.0F, 30.0F, 30.0F);
      ((Path)localObject2).lineTo(4.0F, 30.0F);
      ((Path)localObject2).cubicTo(1.790861F, 30.0F, 0.0F, 28.209139F, 0.0F, 26.0F);
      ((Path)localObject2).lineTo(0.0F, 4.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(38.71698F, 13.0F);
      ((Path)localObject1).cubicTo(43.576469F, 8.820671F, 48.100197F, 4.156057F, 54.0F, 1.0F);
      ((Path)localObject1).cubicTo(54.131836F, 10.646817F, 54.071522F, 20.353184F, 54.0F, 30.0F);
      ((Path)localObject1).lineTo(52.981133F, 30.0F);
      ((Path)localObject1).cubicTo(47.165295F, 25.652977F, 41.495552F, 21.266256F, 35.660378F, 17.0F);
      ((Path)localObject1).cubicTo(34.679802F, 14.844969F, 37.29351F, 13.584531F, 38.71698F, 13.0F);
      ((Path)localObject1).lineTo(38.71698F, 13.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xt
 * JD-Core Version:    0.6.2
 */