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

public final class bbt extends c
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
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, -249.0F, 0.0F, 1.0F, -128.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 249.0F, 0.0F, 1.0F, 128.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-9276814);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(80.0F, 38.0F);
      ((Path)localObject1).lineTo(80.0F, 46.0F);
      ((Path)localObject1).cubicTo(81.59742F, 46.5F, 83.5F, 48.403057F, 84.0F, 50.0F);
      ((Path)localObject1).lineTo(84.0F, 77.0F);
      ((Path)localObject1).cubicTo(83.5F, 78.59742F, 81.59742F, 80.5F, 80.0F, 81.0F);
      ((Path)localObject1).lineTo(53.0F, 81.0F);
      ((Path)localObject1).cubicTo(51.402584F, 80.5F, 49.5F, 78.59742F, 49.0F, 77.0F);
      ((Path)localObject1).lineTo(41.0F, 77.0F);
      ((Path)localObject1).cubicTo(41.0F, 83.291779F, 46.708221F, 89.0F, 53.0F, 89.0F);
      ((Path)localObject1).lineTo(80.0F, 89.0F);
      ((Path)localObject1).cubicTo(86.291779F, 89.0F, 92.0F, 83.291779F, 92.0F, 77.0F);
      ((Path)localObject1).lineTo(92.0F, 50.0F);
      ((Path)localObject1).cubicTo(92.0F, 43.708221F, 86.291779F, 38.0F, 80.0F, 38.0F);
      ((Path)localObject1).moveTo(16.0F, 56.0F);
      ((Path)localObject1).lineTo(16.0F, 17.0F);
      ((Path)localObject1).cubicTo(16.0F, 14.912758F, 17.912758F, 13.0F, 20.0F, 13.0F);
      ((Path)localObject1).lineTo(59.0F, 13.0F);
      ((Path)localObject1).cubicTo(61.087242F, 13.0F, 63.0F, 14.912758F, 63.0F, 17.0F);
      ((Path)localObject1).lineTo(63.0F, 56.0F);
      ((Path)localObject1).cubicTo(63.0F, 58.087242F, 61.087242F, 60.0F, 59.0F, 60.0F);
      ((Path)localObject1).lineTo(20.0F, 60.0F);
      ((Path)localObject1).cubicTo(17.912758F, 60.0F, 16.0F, 58.087242F, 16.0F, 56.0F);
      ((Path)localObject1).moveTo(71.0F, 56.0F);
      ((Path)localObject1).lineTo(71.0F, 17.0F);
      ((Path)localObject1).cubicTo(71.0F, 10.641533F, 65.358932F, 5.0F, 59.0F, 5.0F);
      ((Path)localObject1).lineTo(20.0F, 5.0F);
      ((Path)localObject1).cubicTo(13.641067F, 5.0F, 8.0F, 10.641533F, 8.0F, 17.0F);
      ((Path)localObject1).lineTo(8.0F, 56.0F);
      ((Path)localObject1).cubicTo(8.0F, 62.358932F, 13.641067F, 68.0F, 20.0F, 68.0F);
      ((Path)localObject1).lineTo(59.0F, 68.0F);
      ((Path)localObject1).cubicTo(65.358932F, 68.0F, 71.0F, 62.358932F, 71.0F, 56.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbt
 * JD-Core Version:    0.6.2
 */