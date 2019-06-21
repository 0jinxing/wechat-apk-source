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

public final class eq extends c
{
  private final int height = 32;
  private final int width = 32;

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
        paramInt = 32;
        continue;
        paramInt = 32;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -307.0F, 0.0F, 1.0F, -1235.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 307.0F, 0.0F, 1.0F, 1235.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(855638016);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(16.0F, 31.5F);
      ((Path)localObject2).cubicTo(24.560413F, 31.5F, 31.5F, 24.560413F, 31.5F, 16.0F);
      ((Path)localObject2).cubicTo(31.5F, 7.439586F, 24.560413F, 0.5F, 16.0F, 0.5F);
      ((Path)localObject2).cubicTo(7.439586F, 0.5F, 0.5F, 7.439586F, 0.5F, 16.0F);
      ((Path)localObject2).cubicTo(0.5F, 24.560413F, 7.439586F, 31.5F, 16.0F, 31.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(14.023999F, 10.208398F);
      ((Path)localObject3).cubicTo(13.896853F, 10.128932F, 13.749936F, 10.086796F, 13.6F, 10.086796F);
      ((Path)localObject3).cubicTo(13.158173F, 10.086796F, 12.8F, 10.444968F, 12.8F, 10.886796F);
      ((Path)localObject3).lineTo(12.8F, 21.113203F);
      ((Path)localObject3).cubicTo(12.8F, 21.26314F, 12.842135F, 21.410057F, 12.921601F, 21.537203F);
      ((Path)localObject3).cubicTo(13.155769F, 21.911873F, 13.64933F, 22.02577F, 14.023999F, 21.791603F);
      ((Path)localObject3).lineTo(22.205126F, 16.678398F);
      ((Path)localObject3).cubicTo(22.30814F, 16.614014F, 22.39514F, 16.527014F, 22.459524F, 16.424F);
      ((Path)localObject3).cubicTo(22.693693F, 16.04933F, 22.579794F, 15.55577F, 22.205126F, 15.321602F);
      ((Path)localObject3).lineTo(14.023999F, 10.208398F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.eq
 * JD-Core Version:    0.6.2
 */