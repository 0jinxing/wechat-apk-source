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

public final class xf extends c
{
  private final int height = 75;
  private final int width = 63;

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
        paramInt = 63;
        continue;
        paramInt = 75;
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
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -366.0F, 0.0F, 1.0F, -536.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 377.0F, 0.0F, 1.0F, 537.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 3.084645F);
      ((Path)localObject1).cubicTo(0.0F, 1.842004F, 1.007359F, 0.8346449F, 2.25F, 0.8346449F);
      ((Path)localObject1).lineTo(4.646552F, 0.8346449F);
      ((Path)localObject1).cubicTo(5.889193F, 0.8346449F, 6.896552F, 1.842004F, 6.896552F, 3.084645F);
      ((Path)localObject1).lineTo(6.896552F, 69.939705F);
      ((Path)localObject1).cubicTo(6.896552F, 71.182343F, 5.889193F, 72.189705F, 4.646552F, 72.189705F);
      ((Path)localObject1).lineTo(2.25F, 72.189705F);
      ((Path)localObject1).cubicTo(1.007359F, 72.189705F, 0.0F, 71.182343F, 0.0F, 69.939705F);
      ((Path)localObject1).lineTo(0.0F, 3.084645F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(33.103447F, 3.088012F);
      ((Path)localObject3).cubicTo(33.103447F, 1.843512F, 34.106266F, 0.8346449F, 35.361637F, 0.8346449F);
      ((Path)localObject3).lineTo(37.74181F, 0.8346449F);
      ((Path)localObject3).cubicTo(38.988976F, 0.8346449F, 40.0F, 1.843342F, 40.0F, 3.088012F);
      ((Path)localObject3).lineTo(40.0F, 69.93634F);
      ((Path)localObject3).cubicTo(40.0F, 71.18084F, 38.997181F, 72.189705F, 37.74181F, 72.189705F);
      ((Path)localObject3).lineTo(35.361637F, 72.189705F);
      ((Path)localObject3).cubicTo(34.114475F, 72.189705F, 33.103447F, 71.181007F, 33.103447F, 69.93634F);
      ((Path)localObject3).lineTo(33.103447F, 3.088012F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xf
 * JD-Core Version:    0.6.2
 */