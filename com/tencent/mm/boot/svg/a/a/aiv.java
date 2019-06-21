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

public final class aiv extends c
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
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
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
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(15.0F, 3.3F);
      ((Path)localObject3).cubicTo(15.0F, 3.134315F, 15.134315F, 3.0F, 15.3F, 3.0F);
      ((Path)localObject3).lineTo(18.700001F, 3.0F);
      ((Path)localObject3).cubicTo(18.865686F, 3.0F, 19.0F, 3.134315F, 19.0F, 3.3F);
      ((Path)localObject3).lineTo(19.0F, 20.700001F);
      ((Path)localObject3).cubicTo(19.0F, 20.865686F, 18.865686F, 21.0F, 18.700001F, 21.0F);
      ((Path)localObject3).lineTo(15.3F, 21.0F);
      ((Path)localObject3).cubicTo(15.134315F, 21.0F, 15.0F, 20.865686F, 15.0F, 20.700001F);
      ((Path)localObject3).lineTo(15.0F, 3.3F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aiv
 * JD-Core Version:    0.6.2
 */