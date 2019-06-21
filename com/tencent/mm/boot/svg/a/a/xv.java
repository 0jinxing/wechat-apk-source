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

public final class xv extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      localCanvas.save();
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, -175.0F, 0.0F, 1.0F, -368.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-11048043);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 339.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(179.0F, 40.0F);
      ((Path)localObject1).lineTo(179.0F, 30.0F);
      ((Path)localObject1).cubicTo(179.0F, 29.447716F, 179.44771F, 29.0F, 180.0F, 29.0F);
      ((Path)localObject1).cubicTo(180.55229F, 29.0F, 181.0F, 29.447716F, 181.0F, 30.0F);
      ((Path)localObject1).lineTo(181.0F, 40.0F);
      ((Path)localObject1).lineTo(191.0F, 40.0F);
      ((Path)localObject1).cubicTo(191.55229F, 40.0F, 192.0F, 40.447716F, 192.0F, 41.0F);
      ((Path)localObject1).cubicTo(192.0F, 41.552284F, 191.55229F, 42.0F, 191.0F, 42.0F);
      ((Path)localObject1).lineTo(181.0F, 42.0F);
      ((Path)localObject1).lineTo(181.0F, 52.0F);
      ((Path)localObject1).cubicTo(181.0F, 52.552284F, 180.55229F, 53.0F, 180.0F, 53.0F);
      ((Path)localObject1).cubicTo(179.44771F, 53.0F, 179.0F, 52.552284F, 179.0F, 52.0F);
      ((Path)localObject1).lineTo(179.0F, 42.0F);
      ((Path)localObject1).lineTo(169.0F, 42.0F);
      ((Path)localObject1).cubicTo(168.44771F, 42.0F, 168.0F, 41.552284F, 168.0F, 41.0F);
      ((Path)localObject1).cubicTo(168.0F, 40.447716F, 168.44771F, 40.0F, 169.0F, 40.0F);
      ((Path)localObject1).lineTo(179.0F, 40.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xv
 * JD-Core Version:    0.6.2
 */