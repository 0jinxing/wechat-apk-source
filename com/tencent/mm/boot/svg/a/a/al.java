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

public final class al extends c
{
  private final int height = 96;
  private final int width = 79;

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
        paramInt = 79;
        continue;
        paramInt = 96;
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
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, -9.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.a((float[])localObject4, 0.7071068F, 0.7071068F, -16.991314F, -0.7071068F, 0.7071068F, 40.313557F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(43.16711F, 52.7369F);
      ((Path)localObject1).cubicTo(54.452175F, 51.26688F, 63.16711F, 41.61657F, 63.16711F, 29.93078F);
      ((Path)localObject1).cubicTo(63.16711F, 17.228231F, 52.869659F, 6.93078F, 40.16711F, 6.93078F);
      ((Path)localObject1).cubicTo(27.46456F, 6.93078F, 17.167109F, 17.228231F, 17.167109F, 29.93078F);
      ((Path)localObject1).cubicTo(17.167109F, 41.61657F, 25.882044F, 51.26688F, 37.16711F, 52.7369F);
      ((Path)localObject1).lineTo(37.16711F, 73.400368F);
      ((Path)localObject1).cubicTo(37.16711F, 73.954346F, 37.618084F, 74.403435F, 38.157887F, 74.403435F);
      ((Path)localObject1).lineTo(42.176331F, 74.403435F);
      ((Path)localObject1).cubicTo(42.723522F, 74.403435F, 43.16711F, 73.964516F, 43.16711F, 73.400368F);
      ((Path)localObject1).lineTo(43.16711F, 52.7369F);
      ((Path)localObject1).lineTo(43.16711F, 52.7369F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(40.16711F, 46.930782F);
      ((Path)localObject1).cubicTo(49.55595F, 46.930782F, 57.16711F, 39.319622F, 57.16711F, 29.93078F);
      ((Path)localObject1).cubicTo(57.16711F, 20.541941F, 49.55595F, 12.93078F, 40.16711F, 12.93078F);
      ((Path)localObject1).cubicTo(30.778269F, 12.93078F, 23.167109F, 20.541941F, 23.167109F, 29.93078F);
      ((Path)localObject1).cubicTo(23.167109F, 39.319622F, 30.778269F, 46.930782F, 40.16711F, 46.930782F);
      ((Path)localObject1).lineTo(40.16711F, 46.930782F);
      ((Path)localObject1).lineTo(40.16711F, 46.930782F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.al
 * JD-Core Version:    0.6.2
 */