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

public final class tt extends c
{
  private final int height = 66;
  private final int width = 66;

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
        paramInt = 66;
        continue;
        paramInt = 66;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-564640);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(57.0F, 30.370371F);
      ((Path)localObject1).cubicTo(57.0F, 15.087965F, 44.912033F, 3.0F, 29.629629F, 3.0F);
      ((Path)localObject1).cubicTo(14.985957F, 3.0F, 3.0F, 15.192142F, 3.0F, 30.370371F);
      ((Path)localObject1).cubicTo(3.0F, 44.912033F, 15.087965F, 57.0F, 29.629629F, 57.0F);
      ((Path)localObject1).cubicTo(44.807858F, 57.0F, 57.0F, 45.014042F, 57.0F, 30.370371F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(60.0F, 30.370371F);
      ((Path)localObject1).cubicTo(60.0F, 46.56889F, 46.56889F, 60.0F, 29.629629F, 60.0F);
      ((Path)localObject1).cubicTo(13.431111F, 60.0F, 0.0F, 46.56889F, 0.0F, 30.370371F);
      ((Path)localObject1).cubicTo(0.0F, 13.431111F, 13.431111F, 0.0F, 29.629629F, 0.0F);
      ((Path)localObject1).cubicTo(46.56889F, 0.0F, 60.0F, 13.431111F, 60.0F, 30.370371F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(30.0F, 45.0F);
      ((Path)localObject3).cubicTo(31.656855F, 45.0F, 33.0F, 43.656853F, 33.0F, 42.0F);
      ((Path)localObject3).cubicTo(33.0F, 40.343147F, 31.656855F, 39.0F, 30.0F, 39.0F);
      ((Path)localObject3).cubicTo(28.343145F, 39.0F, 27.0F, 40.343147F, 27.0F, 42.0F);
      ((Path)localObject3).cubicTo(27.0F, 43.656853F, 28.343145F, 45.0F, 30.0F, 45.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(28.498575F, 15.0F);
      ((Path)localObject3).cubicTo(27.670935F, 15.0F, 27.032139F, 15.674923F, 27.071115F, 16.493433F);
      ((Path)localObject3).lineTo(28.0F, 36.0F);
      ((Path)localObject3).lineTo(32.0F, 36.0F);
      ((Path)localObject3).lineTo(32.928883F, 16.493433F);
      ((Path)localObject3).cubicTo(32.968159F, 15.668633F, 32.334969F, 15.0F, 31.501425F, 15.0F);
      ((Path)localObject3).lineTo(28.498575F, 15.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tt
 * JD-Core Version:    0.6.2
 */