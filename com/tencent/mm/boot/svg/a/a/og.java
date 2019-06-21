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

public final class og extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 0.0F);
      ((Path)localObject4).lineTo(60.0F, 0.0F);
      ((Path)localObject4).lineTo(60.0F, 60.0F);
      ((Path)localObject4).lineTo(0.0F, 60.0F);
      ((Path)localObject4).lineTo(0.0F, 0.0F);
      ((Path)localObject4).close();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 6.006387F);
      ((Path)localObject1).cubicTo(0.0F, 2.689151F, 2.683541F, 0.0F, 6.006387F, 0.0F);
      ((Path)localObject1).lineTo(41.993614F, 0.0F);
      ((Path)localObject1).cubicTo(45.310848F, 0.0F, 48.0F, 2.683541F, 48.0F, 6.006387F);
      ((Path)localObject1).lineTo(48.0F, 41.993614F);
      ((Path)localObject1).cubicTo(48.0F, 45.310848F, 45.31646F, 48.0F, 41.993614F, 48.0F);
      ((Path)localObject1).lineTo(6.006387F, 48.0F);
      ((Path)localObject1).cubicTo(2.689151F, 48.0F, 0.0F, 45.31646F, 0.0F, 41.993614F);
      ((Path)localObject1).lineTo(0.0F, 6.006387F);
      ((Path)localObject1).lineTo(0.0F, 6.006387F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15028967);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 6.006387F);
      ((Path)localObject3).cubicTo(0.0F, 2.689151F, 2.683541F, 0.0F, 6.006387F, 0.0F);
      ((Path)localObject3).lineTo(41.993614F, 0.0F);
      ((Path)localObject3).cubicTo(45.310848F, 0.0F, 48.0F, 2.683541F, 48.0F, 6.006387F);
      ((Path)localObject3).lineTo(48.0F, 41.993614F);
      ((Path)localObject3).cubicTo(48.0F, 45.310848F, 45.31646F, 48.0F, 41.993614F, 48.0F);
      ((Path)localObject3).lineTo(6.006387F, 48.0F);
      ((Path)localObject3).cubicTo(2.689151F, 48.0F, 0.0F, 45.31646F, 0.0F, 41.993614F);
      ((Path)localObject3).lineTo(0.0F, 6.006387F);
      ((Path)localObject3).lineTo(0.0F, 6.006387F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(6.0F, 26.576923F);
      ((Path)localObject3).lineTo(10.2F, 22.538462F);
      ((Path)localObject3).lineTo(19.0F, 30.923077F);
      ((Path)localObject3).lineTo(37.799999F, 13.0F);
      ((Path)localObject3).lineTo(42.0F, 17.038462F);
      ((Path)localObject3).lineTo(19.0F, 39.0F);
      ((Path)localObject3).lineTo(6.0F, 26.576923F);
      ((Path)localObject3).lineTo(6.0F, 26.576923F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.og
 * JD-Core Version:    0.6.2
 */