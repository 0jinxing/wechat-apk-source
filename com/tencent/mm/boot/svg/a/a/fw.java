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

public final class fw extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -114.0F, 0.0F, 1.0F, -60.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 114.0F, 0.0F, 1.0F, 60.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 0.0F);
      ((Path)localObject1).lineTo(24.0F, 24.0F);
      ((Path)localObject1).lineTo(0.0F, 24.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(5.0F, 3.3F);
      ((Path)localObject1).cubicTo(5.0F, 3.134315F, 5.134315F, 3.0F, 5.3F, 3.0F);
      ((Path)localObject1).lineTo(8.7F, 3.0F);
      ((Path)localObject1).cubicTo(8.865686F, 3.0F, 9.0F, 3.134315F, 9.0F, 3.3F);
      ((Path)localObject1).lineTo(9.0F, 20.700001F);
      ((Path)localObject1).cubicTo(9.0F, 20.865686F, 8.865686F, 21.0F, 8.7F, 21.0F);
      ((Path)localObject1).lineTo(5.3F, 21.0F);
      ((Path)localObject1).cubicTo(5.134315F, 21.0F, 5.0F, 20.865686F, 5.0F, 20.700001F);
      ((Path)localObject1).lineTo(5.0F, 3.3F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.0F, 3.3F);
      ((Path)localObject1).cubicTo(15.0F, 3.134315F, 15.134315F, 3.0F, 15.3F, 3.0F);
      ((Path)localObject1).lineTo(18.700001F, 3.0F);
      ((Path)localObject1).cubicTo(18.865686F, 3.0F, 19.0F, 3.134315F, 19.0F, 3.3F);
      ((Path)localObject1).lineTo(19.0F, 20.700001F);
      ((Path)localObject1).cubicTo(19.0F, 20.865686F, 18.865686F, 21.0F, 18.700001F, 21.0F);
      ((Path)localObject1).lineTo(15.3F, 21.0F);
      ((Path)localObject1).cubicTo(15.134315F, 21.0F, 15.0F, 20.865686F, 15.0F, 20.700001F);
      ((Path)localObject1).lineTo(15.0F, 3.3F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.fw
 * JD-Core Version:    0.6.2
 */