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

public final class cm extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-855310);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 90.0F);
      ((Path)localObject3).lineTo(0.0F, 90.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.125807F, 35.884048F);
      ((Path)localObject1).cubicTo(5.726082F, 34.961723F, 9.368011E-016F, 28.649561F, 0.0F, 21.0F);
      ((Path)localObject1).lineTo(0.0F, 17.25F);
      ((Path)localObject1).lineTo(3.75F, 17.25F);
      ((Path)localObject1).lineTo(3.75F, 21.0F);
      ((Path)localObject1).cubicTo(3.75F, 27.213203F, 8.786797F, 32.25F, 15.0F, 32.25F);
      ((Path)localObject1).cubicTo(21.213203F, 32.25F, 26.25F, 27.213203F, 26.25F, 21.0F);
      ((Path)localObject1).lineTo(26.25F, 17.25F);
      ((Path)localObject1).lineTo(30.0F, 17.25F);
      ((Path)localObject1).lineTo(30.0F, 21.0F);
      ((Path)localObject1).cubicTo(30.0F, 28.649282F, 24.274334F, 34.961266F, 16.875F, 35.883949F);
      ((Path)localObject1).lineTo(16.875F, 42.0F);
      ((Path)localObject1).lineTo(13.12812F, 42.0F);
      ((Path)localObject1).lineTo(13.125807F, 35.884048F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(15.0F, 0.0F);
      ((Path)localObject1).cubicTo(19.142136F, -7.60898E-016F, 22.5F, 3.357864F, 22.5F, 7.5F);
      ((Path)localObject1).lineTo(22.5F, 21.0F);
      ((Path)localObject1).cubicTo(22.5F, 25.142136F, 19.142136F, 28.5F, 15.0F, 28.5F);
      ((Path)localObject1).cubicTo(10.857864F, 28.5F, 7.5F, 25.142136F, 7.5F, 21.0F);
      ((Path)localObject1).lineTo(7.5F, 7.5F);
      ((Path)localObject1).cubicTo(7.5F, 3.357864F, 10.857864F, 7.60898E-016F, 15.0F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(15.0F, 3.75F);
      ((Path)localObject1).cubicTo(12.928932F, 3.75F, 11.25F, 5.428932F, 11.25F, 7.5F);
      ((Path)localObject1).lineTo(11.25F, 21.0F);
      ((Path)localObject1).cubicTo(11.25F, 23.071068F, 12.928932F, 24.75F, 15.0F, 24.75F);
      ((Path)localObject1).cubicTo(17.071068F, 24.75F, 18.75F, 23.071068F, 18.75F, 21.0F);
      ((Path)localObject1).lineTo(18.75F, 7.5F);
      ((Path)localObject1).cubicTo(18.75F, 5.428932F, 17.071068F, 3.75F, 15.0F, 3.75F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cm
 * JD-Core Version:    0.6.2
 */