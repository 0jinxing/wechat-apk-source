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

public final class px extends c
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
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-9538696);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(50.830002F, 1.1693F);
      ((Path)localObject1).cubicTo(50.650002F, 0.9883F, 50.452F, 0.8253F, 50.238998F, 0.6813F);
      ((Path)localObject1).cubicTo(49.813999F, 0.3943F, 49.331001F, 0.1873F, 48.811001F, 0.0813F);
      ((Path)localObject1).cubicTo(48.550999F, 0.0283F, 48.282001F, 0.0003F, 48.006001F, 0.0003F);
      ((Path)localObject1).lineTo(3.994F, 0.0003F);
      ((Path)localObject1).cubicTo(3.443F, 0.0003F, 2.918F, 0.1123F, 2.44F, 0.3143F);
      ((Path)localObject1).cubicTo(1.007F, 0.9213F, 0.0F, 2.3433F, 0.0F, 4.0003F);
      ((Path)localObject1).lineTo(0.0F, 58.999298F);
      ((Path)localObject1).cubicTo(0.0F, 61.216301F, 1.788F, 63.000301F, 3.994F, 63.000301F);
      ((Path)localObject1).lineTo(48.006001F, 63.000301F);
      ((Path)localObject1).cubicTo(50.209999F, 63.000301F, 52.0F, 61.209301F, 52.0F, 58.999298F);
      ((Path)localObject1).lineTo(52.0F, 4.0003F);
      ((Path)localObject1).cubicTo(52.0F, 2.8923F, 51.553001F, 1.8923F, 50.830002F, 1.1693F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(49.0F, 58.999298F);
      ((Path)localObject1).cubicTo(49.0F, 59.5513F, 48.554001F, 60.000301F, 48.006001F, 60.000301F);
      ((Path)localObject1).lineTo(3.994F, 60.000301F);
      ((Path)localObject1).cubicTo(3.446F, 60.000301F, 3.0F, 59.5513F, 3.0F, 58.999298F);
      ((Path)localObject1).lineTo(3.0F, 4.0003F);
      ((Path)localObject1).cubicTo(3.0F, 3.5093F, 3.329F, 3.1963F, 3.611F, 3.0763F);
      ((Path)localObject1).cubicTo(3.731F, 3.0253F, 3.86F, 3.0003F, 3.994F, 3.0003F);
      ((Path)localObject1).lineTo(48.006001F, 3.0003F);
      ((Path)localObject1).cubicTo(48.076F, 3.0003F, 48.145F, 3.0073F, 48.210999F, 3.0203F);
      ((Path)localObject1).cubicTo(48.335999F, 3.0463F, 48.452999F, 3.0953F, 48.560001F, 3.1673F);
      ((Path)localObject1).cubicTo(48.612999F, 3.2033F, 48.662998F, 3.2443F, 48.708F, 3.2903F);
      ((Path)localObject1).cubicTo(48.841F, 3.4233F, 49.0F, 3.6543F, 49.0F, 4.0003F);
      ((Path)localObject1).lineTo(49.0F, 58.999298F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(6.0F, 52.0F);
      ((Path)localObject1).lineTo(46.0F, 52.0F);
      ((Path)localObject1).lineTo(46.0F, 10.0F);
      ((Path)localObject1).lineTo(6.0F, 10.0F);
      ((Path)localObject1).lineTo(6.0F, 52.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(9.0F, 49.0F);
      ((Path)localObject1).lineTo(43.0F, 49.0F);
      ((Path)localObject1).lineTo(43.0F, 13.0F);
      ((Path)localObject1).lineTo(9.0F, 13.0F);
      ((Path)localObject1).lineTo(9.0F, 49.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(26.0F, 54.0F);
      ((Path)localObject1).cubicTo(24.895F, 54.0F, 24.0F, 54.895F, 24.0F, 56.0F);
      ((Path)localObject1).cubicTo(24.0F, 57.105F, 24.895F, 58.0F, 26.0F, 58.0F);
      ((Path)localObject1).cubicTo(27.105F, 58.0F, 28.0F, 57.105F, 28.0F, 56.0F);
      ((Path)localObject1).cubicTo(28.0F, 54.895F, 27.105F, 54.0F, 26.0F, 54.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.px
 * JD-Core Version:    0.6.2
 */