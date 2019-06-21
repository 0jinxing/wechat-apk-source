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

public final class aeh extends c
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(1073741824);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((float[])localObject3, 0.7071068F, 0.7071068F, -16.568542F, -0.7071068F, 0.7071068F, 40.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(37.0F, 37.0F);
      ((Path)localObject1).lineTo(37.0F, 12.995752F);
      ((Path)localObject1).cubicTo(37.0F, 12.450768F, 37.443588F, 12.0F, 37.99078F, 12.0F);
      ((Path)localObject1).lineTo(42.00922F, 12.0F);
      ((Path)localObject1).cubicTo(42.549026F, 12.0F, 43.0F, 12.445813F, 43.0F, 12.995752F);
      ((Path)localObject1).lineTo(43.0F, 37.0F);
      ((Path)localObject1).lineTo(67.00425F, 37.0F);
      ((Path)localObject1).cubicTo(67.549232F, 37.0F, 68.0F, 37.443588F, 68.0F, 37.99078F);
      ((Path)localObject1).lineTo(68.0F, 42.00922F);
      ((Path)localObject1).cubicTo(68.0F, 42.549026F, 67.554184F, 43.0F, 67.00425F, 43.0F);
      ((Path)localObject1).lineTo(43.0F, 43.0F);
      ((Path)localObject1).lineTo(43.0F, 67.00425F);
      ((Path)localObject1).cubicTo(43.0F, 67.549232F, 42.556412F, 68.0F, 42.00922F, 68.0F);
      ((Path)localObject1).lineTo(37.99078F, 68.0F);
      ((Path)localObject1).cubicTo(37.450974F, 68.0F, 37.0F, 67.554184F, 37.0F, 67.00425F);
      ((Path)localObject1).lineTo(37.0F, 43.0F);
      ((Path)localObject1).lineTo(12.995752F, 43.0F);
      ((Path)localObject1).cubicTo(12.450768F, 43.0F, 12.0F, 42.556412F, 12.0F, 42.00922F);
      ((Path)localObject1).lineTo(12.0F, 37.99078F);
      ((Path)localObject1).cubicTo(12.0F, 37.450974F, 12.445813F, 37.0F, 12.995752F, 37.0F);
      ((Path)localObject1).lineTo(37.0F, 37.0F);
      ((Path)localObject1).lineTo(37.0F, 37.0F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aeh
 * JD-Core Version:    0.6.2
 */