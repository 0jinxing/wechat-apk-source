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

public final class agy extends c
{
  private final int height = 240;
  private final int width = 240;

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
        paramInt = 240;
        continue;
        paramInt = 240;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-15028967);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 68.0F, 0.0F, 1.0F, 85.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.540069F, 40.015434F);
      ((Path)localObject1).cubicTo(12.961421F, 39.417805F, 12.934421F, 38.432583F, 13.489049F, 37.804356F);
      ((Path)localObject1).lineTo(15.936921F, 35.031658F);
      ((Path)localObject1).cubicTo(16.487391F, 34.408142F, 17.474325F, 34.316227F, 18.125168F, 34.814026F);
      ((Path)localObject1).lineTo(37.615322F, 49.721111F);
      ((Path)localObject1).cubicTo(38.273388F, 50.224434F, 39.324657F, 50.210209F, 39.972931F, 49.681568F);
      ((Path)localObject1).lineTo(89.958107F, 8.920589F);
      ((Path)localObject1).cubicTo(90.602112F, 8.395429F, 91.602684F, 8.439274F, 92.194168F, 9.019729F);
      ((Path)localObject1).lineTo(93.495499F, 10.296785F);
      ((Path)localObject1).cubicTo(94.086433F, 10.876699F, 94.083435F, 11.820237F, 93.501389F, 12.391867F);
      ((Path)localObject1).lineTo(39.869316F, 65.064293F);
      ((Path)localObject1).cubicTo(39.281631F, 65.641457F, 38.337345F, 65.626122F, 37.757488F, 65.027245F);
      ((Path)localObject1).lineTo(13.540069F, 40.015434F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.agy
 * JD-Core Version:    0.6.2
 */