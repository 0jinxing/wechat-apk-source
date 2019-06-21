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

public final class ah extends c
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
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, -245.0F, 0.0F, 1.0F, -283.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 245.0F, 0.0F, 1.0F, 283.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(2113929216);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(90.0F, 0.0F);
      ((Path)localObject2).lineTo(90.0F, 90.0F);
      ((Path)localObject2).lineTo(0.0F, 90.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(45.0F, 27.0F);
      ((Path)localObject1).cubicTo(47.761425F, 27.0F, 50.0F, 24.761423F, 50.0F, 22.0F);
      ((Path)localObject1).cubicTo(50.0F, 19.238577F, 47.761425F, 17.0F, 45.0F, 17.0F);
      ((Path)localObject1).cubicTo(42.238575F, 17.0F, 40.0F, 19.238577F, 40.0F, 22.0F);
      ((Path)localObject1).cubicTo(40.0F, 24.761423F, 42.238575F, 27.0F, 45.0F, 27.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(45.0F, 50.0F);
      ((Path)localObject1).cubicTo(47.761425F, 50.0F, 50.0F, 47.761425F, 50.0F, 45.0F);
      ((Path)localObject1).cubicTo(50.0F, 42.238575F, 47.761425F, 40.0F, 45.0F, 40.0F);
      ((Path)localObject1).cubicTo(42.238575F, 40.0F, 40.0F, 42.238575F, 40.0F, 45.0F);
      ((Path)localObject1).cubicTo(40.0F, 47.761425F, 42.238575F, 50.0F, 45.0F, 50.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(45.0F, 73.0F);
      ((Path)localObject1).cubicTo(47.761425F, 73.0F, 50.0F, 70.761421F, 50.0F, 68.0F);
      ((Path)localObject1).cubicTo(50.0F, 65.238579F, 47.761425F, 63.0F, 45.0F, 63.0F);
      ((Path)localObject1).cubicTo(42.238575F, 63.0F, 40.0F, 65.238579F, 40.0F, 68.0F);
      ((Path)localObject1).cubicTo(40.0F, 70.761421F, 42.238575F, 73.0F, 45.0F, 73.0F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ah
 * JD-Core Version:    0.6.2
 */