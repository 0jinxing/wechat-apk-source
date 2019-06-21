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

public final class jz extends c
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
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 40.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8617851);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(8.0F, 65.0F);
      ((Path)localObject).cubicTo(3.581778F, 65.0F, 0.0F, 68.581779F, 0.0F, 73.0F);
      ((Path)localObject).cubicTo(0.0F, 77.418221F, 3.581778F, 81.0F, 8.0F, 81.0F);
      ((Path)localObject).cubicTo(12.418222F, 81.0F, 16.0F, 77.418221F, 16.0F, 73.0F);
      ((Path)localObject).cubicTo(16.0F, 68.581779F, 12.418222F, 65.0F, 8.0F, 65.0F);
      ((Path)localObject).moveTo(8.0F, 32.0F);
      ((Path)localObject).cubicTo(3.581778F, 32.0F, 0.0F, 35.581779F, 0.0F, 40.0F);
      ((Path)localObject).cubicTo(0.0F, 44.418221F, 3.581778F, 48.0F, 8.0F, 48.0F);
      ((Path)localObject).cubicTo(12.418222F, 48.0F, 16.0F, 44.418221F, 16.0F, 40.0F);
      ((Path)localObject).cubicTo(16.0F, 35.581779F, 12.418222F, 32.0F, 8.0F, 32.0F);
      ((Path)localObject).moveTo(16.0F, 8.0F);
      ((Path)localObject).cubicTo(16.0F, 3.581778F, 12.418222F, 0.0F, 8.0F, 0.0F);
      ((Path)localObject).cubicTo(3.581778F, 0.0F, 0.0F, 3.581778F, 0.0F, 8.0F);
      ((Path)localObject).cubicTo(0.0F, 12.418222F, 3.581778F, 16.0F, 8.0F, 16.0F);
      ((Path)localObject).cubicTo(12.418222F, 16.0F, 16.0F, 12.418222F, 16.0F, 8.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.jz
 * JD-Core Version:    0.6.2
 */