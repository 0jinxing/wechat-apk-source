package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class es extends c
{
  private final int height = 75;
  private final int width = 57;

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
        paramInt = 57;
        continue;
        paramInt = 75;
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setColor(-11184811);
      localPaint2.setStrokeWidth(3.0F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1448.0F, 0.0F, 1.0F, -685.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1474.4348F, 755.26208F);
      ((Path)localObject1).cubicTo(1475.5754F, 756.45862F, 1477.4377F, 756.46204F, 1478.5652F, 755.26208F);
      ((Path)localObject1).cubicTo(1478.5652F, 755.26208F, 1502.0F, 731.94885F, 1502.0F, 712.67706F);
      ((Path)localObject1).cubicTo(1502.0F, 698.43427F, 1490.5833F, 687.0F, 1476.8696F, 687.0F);
      ((Path)localObject1).cubicTo(1462.4167F, 687.0F, 1451.0F, 698.43427F, 1451.0F, 712.67706F);
      ((Path)localObject1).cubicTo(1451.0F, 731.94885F, 1474.4348F, 755.26208F, 1474.4348F, 755.26208F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1476.5F, 721.0F);
      ((Path)localObject1).cubicTo(1481.1945F, 721.0F, 1485.0F, 717.1944F, 1485.0F, 712.5F);
      ((Path)localObject1).cubicTo(1485.0F, 707.8056F, 1481.1945F, 704.0F, 1476.5F, 704.0F);
      ((Path)localObject1).cubicTo(1471.8055F, 704.0F, 1468.0F, 707.8056F, 1468.0F, 712.5F);
      ((Path)localObject1).cubicTo(1468.0F, 717.1944F, 1471.8055F, 721.0F, 1476.5F, 721.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.es
 * JD-Core Version:    0.6.2
 */