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

public final class alb extends c
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -276.0F, 0.0F, 1.0F, -265.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 276.0F, 0.0F, 1.0F, 265.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(838860800);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(45.0F, 0.0F);
      ((Path)localObject1).cubicTo(69.852814F, 0.0F, 90.0F, 20.147184F, 90.0F, 45.0F);
      ((Path)localObject1).cubicTo(90.0F, 69.852814F, 69.852814F, 90.0F, 45.0F, 90.0F);
      ((Path)localObject1).cubicTo(20.147184F, 90.0F, 0.0F, 69.852814F, 0.0F, 45.0F);
      ((Path)localObject1).cubicTo(0.0F, 20.147184F, 20.147184F, 0.0F, 45.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      ((Paint)localObject3).setStrokeWidth(6.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(45.0F, 3.0F);
      ((Path)localObject1).cubicTo(68.195961F, 3.0F, 87.0F, 21.804039F, 87.0F, 45.0F);
      ((Path)localObject1).cubicTo(87.0F, 68.195961F, 68.195961F, 87.0F, 45.0F, 87.0F);
      ((Path)localObject1).cubicTo(21.804039F, 87.0F, 3.0F, 68.195961F, 3.0F, 45.0F);
      ((Path)localObject1).cubicTo(3.0F, 21.804039F, 21.804039F, 3.0F, 45.0F, 3.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(59.248722F, 48.12048F);
      ((Path)localObject3).lineTo(39.167625F, 62.609314F);
      ((Path)localObject3).cubicTo(38.27261F, 63.255081F, 37.023556F, 63.053024F, 36.377789F, 62.158009F);
      ((Path)localObject3).cubicTo(36.132179F, 61.817604F, 36.0F, 61.408504F, 36.0F, 60.988743F);
      ((Path)localObject3).lineTo(36.0F, 32.011078F);
      ((Path)localObject3).cubicTo(36.0F, 30.907413F, 36.894695F, 30.012718F, 37.998356F, 30.012718F);
      ((Path)localObject3).cubicTo(38.418118F, 30.012718F, 38.827221F, 30.144899F, 39.167625F, 30.390507F);
      ((Path)localObject3).lineTo(59.248722F, 44.879341F);
      ((Path)localObject3).cubicTo(60.143742F, 45.525108F, 60.345795F, 46.774162F, 59.700027F, 47.669178F);
      ((Path)localObject3).cubicTo(59.574741F, 47.842819F, 59.422363F, 47.995193F, 59.248722F, 48.12048F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alb
 * JD-Core Version:    0.6.2
 */