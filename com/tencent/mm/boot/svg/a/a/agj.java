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

public final class agj extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
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
      localPaint.setColor(-2565928);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(96.0F, 0.0F);
      ((Path)localObject2).lineTo(96.0F, 96.0F);
      ((Path)localObject2).lineTo(0.0F, 96.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject2, c.a(localPaint, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-8617851);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(58.234665F, 65.333336F);
      ((Path)localObject1).cubicTo(58.234665F, 65.333336F, 56.0F, 64.883553F, 56.0F, 62.666668F);
      ((Path)localObject1).lineTo(56.0F, 61.333332F);
      ((Path)localObject1).cubicTo(56.0F, 59.977333F, 57.333332F, 58.666668F, 57.333332F, 58.666668F);
      ((Path)localObject1).cubicTo(62.017944F, 54.044582F, 65.138985F, 47.470398F, 65.130219F, 37.007732F);
      ((Path)localObject1).cubicTo(65.120117F, 24.950094F, 58.554668F, 16.0F, 48.0F, 16.0F);
      ((Path)localObject1).cubicTo(37.445332F, 16.0F, 30.897902F, 24.952658F, 30.908001F, 37.007732F);
      ((Path)localObject1).cubicTo(30.908001F, 47.468624F, 34.000893F, 54.025047F, 38.753777F, 58.666668F);
      ((Path)localObject1).cubicTo(38.666668F, 58.666668F, 40.0F, 59.977333F, 40.0F, 61.333332F);
      ((Path)localObject1).lineTo(40.0F, 62.666668F);
      ((Path)localObject1).cubicTo(40.0F, 64.883553F, 37.765335F, 65.333336F, 37.765335F, 65.333336F);
      ((Path)localObject1).lineTo(17.333334F, 72.444443F);
      ((Path)localObject1).cubicTo(14.228F, 73.564445F, 12.0F, 76.518219F, 12.0F, 80.0F);
      ((Path)localObject1).lineTo(12.0F, 84.0F);
      ((Path)localObject1).lineTo(84.0F, 84.0F);
      ((Path)localObject1).lineTo(84.0F, 80.0F);
      ((Path)localObject1).cubicTo(84.0F, 76.518219F, 81.771553F, 73.564445F, 78.666664F, 72.46489F);
      ((Path)localObject1).lineTo(58.234665F, 65.333336F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.agj
 * JD-Core Version:    0.6.2
 */