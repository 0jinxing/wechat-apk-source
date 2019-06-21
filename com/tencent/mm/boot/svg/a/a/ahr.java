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

public final class ahr extends c
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
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-14046139);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(96.0F, 0.0F);
      ((Path)localObject3).lineTo(96.0F, 96.0F);
      ((Path)localObject3).lineTo(0.0F, 96.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject3, c.a(localPaint2, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 51, 4);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(20.25F, 36.0F);
      ((Path)localObject2).cubicTo(20.25F, 38.899052F, 17.89905F, 41.25F, 15.0F, 41.25F);
      ((Path)localObject2).cubicTo(12.10095F, 41.25F, 9.75F, 38.899052F, 9.75F, 36.0F);
      ((Path)localObject2).cubicTo(9.75F, 33.099899F, 12.10095F, 30.75F, 15.0F, 30.75F);
      ((Path)localObject2).cubicTo(17.89905F, 30.75F, 20.25F, 33.099899F, 20.25F, 36.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(36.0F, 30.75F);
      ((Path)localObject2).cubicTo(38.899052F, 30.75F, 41.25F, 33.099899F, 41.25F, 36.0F);
      ((Path)localObject2).cubicTo(41.25F, 38.899052F, 38.899052F, 41.25F, 36.0F, 41.25F);
      ((Path)localObject2).cubicTo(33.100948F, 41.25F, 30.75F, 38.899052F, 30.75F, 36.0F);
      ((Path)localObject2).cubicTo(30.75F, 33.099899F, 33.100948F, 30.75F, 36.0F, 30.75F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(57.0F, 30.75F);
      ((Path)localObject2).cubicTo(59.899052F, 30.75F, 62.25F, 33.099899F, 62.25F, 36.0F);
      ((Path)localObject2).cubicTo(62.25F, 38.899052F, 59.899052F, 41.25F, 57.0F, 41.25F);
      ((Path)localObject2).cubicTo(54.100948F, 41.25F, 51.75F, 38.899052F, 51.75F, 36.0F);
      ((Path)localObject2).cubicTo(51.75F, 33.099899F, 54.100948F, 30.75F, 57.0F, 30.75F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ahr
 * JD-Core Version:    0.6.2
 */