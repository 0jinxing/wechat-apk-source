package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class en extends c
{
  private final int height = 68;
  private final int width = 68;

  public final int a(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 68;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      i = 0;
      return i;
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      Looper localLooper = (Looper)paramArrayOfObject[1];
      paramArrayOfObject = c.h(localLooper);
      float[] arrayOfFloat = c.g(localLooper);
      Paint localPaint = c.k(localLooper);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(localLooper);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, localLooper).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(arrayOfFloat, 1.0F, 0.0F, -560.0F, 0.0F, 1.0F, -666.0F);
      paramArrayOfObject.reset();
      paramArrayOfObject.setValues((float[])localObject);
      localCanvas.concat(paramArrayOfObject);
      localCanvas.restore();
      c.j(localLooper);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.en
 * JD-Core Version:    0.6.2
 */