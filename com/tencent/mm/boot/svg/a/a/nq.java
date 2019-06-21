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

public final class nq extends c
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
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1420.0F, 0.0F, 1.0F, -201.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16139513);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1423.0F, 259.5F);
      ((Path)localObject2).cubicTo(1423.0F, 228.84819F, 1447.8481F, 204.0F, 1478.5F, 204.0F);
      ((Path)localObject2).lineTo(1478.5F, 204.0F);
      ((Path)localObject2).cubicTo(1509.1519F, 204.0F, 1534.0F, 228.84819F, 1534.0F, 259.5F);
      ((Path)localObject2).lineTo(1534.0F, 259.5F);
      ((Path)localObject2).cubicTo(1534.0F, 290.15179F, 1509.1519F, 315.0F, 1478.5F, 315.0F);
      ((Path)localObject2).lineTo(1478.5F, 315.0F);
      ((Path)localObject2).cubicTo(1447.8481F, 315.0F, 1423.0F, 290.15179F, 1423.0F, 259.5F);
      ((Path)localObject2).lineTo(1423.0F, 259.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16139513);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(1475.762F, 276.99985F);
      ((Path)localObject3).cubicTo(1480.2301F, 272.53815F, 1483.0F, 266.33554F, 1483.0F, 259.47748F);
      ((Path)localObject3).cubicTo(1483.0F, 252.50348F, 1480.1356F, 246.20723F, 1475.5338F, 241.7303F);
      ((Path)localObject3).lineTo(1470.5934F, 246.6707F);
      ((Path)localObject3).cubicTo(1473.9595F, 249.87605F, 1476.0616F, 254.42805F, 1476.0616F, 259.47748F);
      ((Path)localObject3).cubicTo(1476.0616F, 264.41092F, 1474.0549F, 268.86954F, 1470.8234F, 272.06125F);
      ((Path)localObject3).lineTo(1475.762F, 276.99985F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(1464.6487F, 265.88657F);
      ((Path)localObject3).cubicTo(1466.3352F, 264.2836F, 1467.3888F, 262.00519F, 1467.3888F, 259.47748F);
      ((Path)localObject3).cubicTo(1467.3888F, 256.83368F, 1466.2362F, 254.46259F, 1464.4122F, 252.85182F);
      ((Path)localObject3).lineTo(1458.0131F, 259.25101F);
      ((Path)localObject3).lineTo(1464.6487F, 265.88657F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nq
 * JD-Core Version:    0.6.2
 */