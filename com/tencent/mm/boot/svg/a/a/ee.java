package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class ee extends c
{
  private final int height = 69;
  private final int width = 69;

  public final int a(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 69;
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
      Object localObject = c.k(localLooper);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(localLooper);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, localLooper).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(arrayOfFloat, 1.0F, 0.0F, -483.0F, 0.0F, 1.0F, -337.0F);
      paramArrayOfObject.reset();
      paramArrayOfObject.setValues((float[])localObject);
      localCanvas.concat(paramArrayOfObject);
      localCanvas.restore();
      c.j(localLooper);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ee
 * JD-Core Version:    0.6.2
 */