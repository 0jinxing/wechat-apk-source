package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class nr extends c
{
  private final int height = 117;
  private final int width = 117;

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
        paramInt = 117;
        continue;
        paramInt = 117;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1580.0F, 0.0F, 1.0F, -201.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16139513);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1583.0F, 259.5F);
      ((Path)localObject2).cubicTo(1583.0F, 228.84819F, 1607.8481F, 204.0F, 1638.5F, 204.0F);
      ((Path)localObject2).lineTo(1638.5F, 204.0F);
      ((Path)localObject2).cubicTo(1669.1519F, 204.0F, 1694.0F, 228.84819F, 1694.0F, 259.5F);
      ((Path)localObject2).lineTo(1694.0F, 259.5F);
      ((Path)localObject2).cubicTo(1694.0F, 290.15179F, 1669.1519F, 315.0F, 1638.5F, 315.0F);
      ((Path)localObject2).lineTo(1638.5F, 315.0F);
      ((Path)localObject2).cubicTo(1607.8481F, 315.0F, 1583.0F, 290.15179F, 1583.0F, 259.5F);
      ((Path)localObject2).lineTo(1583.0F, 259.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16139513);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1646.8911F, 288.97781F);
      ((Path)localObject1).lineTo(1641.9794F, 284.06616F);
      ((Path)localObject1).cubicTo(1647.6785F, 277.75735F, 1651.1661F, 269.28784F, 1651.1661F, 259.97653F);
      ((Path)localObject1).cubicTo(1651.1661F, 250.72066F, 1647.7198F, 242.29657F, 1642.0809F, 235.9998F);
      ((Path)localObject1).lineTo(1646.9929F, 231.0878F);
      ((Path)localObject1).cubicTo(1653.8218F, 238.65639F, 1658.0F, 248.81223F, 1658.0F, 259.97653F);
      ((Path)localObject1).cubicTo(1658.0F, 271.19629F, 1653.7802F, 281.39749F, 1646.8911F, 288.97781F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1635.4944F, 277.58115F);
      ((Path)localObject1).lineTo(1630.5815F, 272.66824F);
      ((Path)localObject1).cubicTo(1633.7931F, 269.45828F, 1635.7898F, 264.95837F, 1635.7898F, 259.97653F);
      ((Path)localObject1).cubicTo(1635.7898F, 255.05014F, 1633.8373F, 250.595F, 1630.6882F, 247.39249F);
      ((Path)localObject1).lineTo(1635.6002F, 242.48047F);
      ((Path)localObject1).cubicTo(1639.9392F, 246.95483F, 1642.6238F, 253.14172F, 1642.6238F, 259.97653F);
      ((Path)localObject1).cubicTo(1642.6238F, 266.86679F, 1639.8955F, 273.09854F, 1635.4944F, 277.58115F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1624.436F, 266.5228F);
      ((Path)localObject1).cubicTo(1626.1627F, 264.90756F, 1627.2474F, 262.57294F, 1627.2474F, 259.97653F);
      ((Path)localObject1).cubicTo(1627.2474F, 257.43564F, 1626.2086F, 255.14546F, 1624.5459F, 253.53485F);
      ((Path)localObject1).lineTo(1617.9969F, 260.08374F);
      ((Path)localObject1).lineTo(1624.436F, 266.5228F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nr
 * JD-Core Version:    0.6.2
 */