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

public final class avh extends c
{
  private final int height = 42;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 42;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.a(localPaint2, paramArrayOfObject);
      localPaint1.setColor(-4210753);
      ((Paint)localObject3).setColor(-4210753);
      ((Paint)localObject3).setStrokeWidth(1.2F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(20.065081F, 39.519398F);
      ((Path)localObject1).cubicTo(9.131414F, 39.519398F, 0.3604506F, 30.628284F, 0.3604506F, 19.814768F);
      ((Path)localObject1).cubicTo(0.3604506F, 8.881102F, 9.251564F, 0.1101377F, 20.065081F, 0.1101377F);
      ((Path)localObject1).cubicTo(30.998749F, 0.1101377F, 39.769711F, 9.001251F, 39.769711F, 19.814768F);
      ((Path)localObject1).cubicTo(39.769711F, 30.628284F, 30.998749F, 39.519398F, 20.065081F, 39.519398F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(20.065081F, 1.191489F);
      ((Path)localObject1).cubicTo(9.852315F, 1.191489F, 1.561953F, 9.481853F, 1.561953F, 19.694618F);
      ((Path)localObject1).cubicTo(1.561953F, 29.907385F, 9.852315F, 38.197746F, 20.065081F, 38.197746F);
      ((Path)localObject1).cubicTo(30.277847F, 38.197746F, 38.568211F, 29.907385F, 38.568211F, 19.694618F);
      ((Path)localObject1).cubicTo(38.568211F, 9.481853F, 30.277847F, 1.191489F, 20.065081F, 1.191489F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(25.832291F, 27.26408F);
      ((Path)localObject3).cubicTo(25.712141F, 27.26408F, 25.47184F, 27.14393F, 25.35169F, 27.023779F);
      ((Path)localObject3).lineTo(19.58448F, 20.055069F);
      ((Path)localObject3).cubicTo(19.464331F, 19.934919F, 19.464331F, 19.814768F, 19.464331F, 19.694618F);
      ((Path)localObject3).lineTo(19.464331F, 8.1602F);
      ((Path)localObject3).cubicTo(19.464331F, 7.79975F, 19.70463F, 7.559449F, 20.065081F, 7.559449F);
      ((Path)localObject3).cubicTo(20.425531F, 7.559449F, 20.665833F, 7.79975F, 20.665833F, 8.1602F);
      ((Path)localObject3).lineTo(20.665833F, 19.454317F);
      ((Path)localObject3).lineTo(26.312891F, 26.182728F);
      ((Path)localObject3).cubicTo(26.553192F, 26.423029F, 26.433041F, 26.78348F, 26.192741F, 27.023779F);
      ((Path)localObject3).cubicTo(26.07259F, 27.26408F, 25.95244F, 27.26408F, 25.832291F, 27.26408F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avh
 * JD-Core Version:    0.6.2
 */