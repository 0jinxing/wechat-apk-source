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

public final class aqz extends c
{
  private final int height = 63;
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
        paramInt = 63;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-15028967);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(5.0F, 5.0F);
      ((Path)localObject1).lineTo(5.0F, 34.0F);
      ((Path)localObject1).lineTo(34.0F, 34.0F);
      ((Path)localObject1).lineTo(34.0F, 5.0F);
      ((Path)localObject1).lineTo(5.0F, 5.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.0F, 1.50495F);
      ((Path)localObject1).cubicTo(0.0F, 0.6737889F, 0.676918F, 0.0F, 1.50495F, 0.0F);
      ((Path)localObject1).lineTo(37.495052F, 0.0F);
      ((Path)localObject1).cubicTo(38.32621F, 0.0F, 39.0F, 0.676918F, 39.0F, 1.50495F);
      ((Path)localObject1).lineTo(39.0F, 37.495052F);
      ((Path)localObject1).cubicTo(39.0F, 38.32621F, 38.323082F, 39.0F, 37.495052F, 39.0F);
      ((Path)localObject1).lineTo(1.50495F, 39.0F);
      ((Path)localObject1).cubicTo(0.6737889F, 39.0F, 0.0F, 38.323082F, 0.0F, 37.495052F);
      ((Path)localObject1).lineTo(0.0F, 1.50495F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(52.925938F, 23.0F);
      ((Path)localObject1).cubicTo(52.974922F, 22.49169F, 53.0F, 21.976135F, 53.0F, 21.454546F);
      ((Path)localObject1).cubicTo(53.0F, 12.919235F, 46.284271F, 6.0F, 38.0F, 6.0F);
      ((Path)localObject1).cubicTo(35.866688F, 6.0F, 33.837387F, 6.458838F, 32.0F, 7.285953F);
      ((Path)localObject1).lineTo(32.0F, 10.252686F);
      ((Path)localObject1).cubicTo(33.601051F, 9.50638F, 35.378433F, 9.090909F, 37.25F, 9.090909F);
      ((Path)localObject1).cubicTo(44.29163F, 9.090909F, 50.0F, 14.97226F, 50.0F, 22.227272F);
      ((Path)localObject1).cubicTo(50.0F, 22.486673F, 49.992702F, 22.744318F, 49.978306F, 23.0F);
      ((Path)localObject1).lineTo(52.925938F, 23.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(35.0F, 0.0F);
      ((Path)localObject3).lineTo(26.0F, 7.443152F);
      ((Path)localObject3).lineTo(34.865273F, 15.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aqz
 * JD-Core Version:    0.6.2
 */