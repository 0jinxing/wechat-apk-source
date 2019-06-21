package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class awi extends c
{
  private final int height = 72;
  private final int width = 210;

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
        paramInt = 210;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-11286451);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 12.0F);
      ((Path)localObject2).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject2).lineTo(198.0F, 0.0F);
      ((Path)localObject2).cubicTo(204.62741F, 0.0F, 210.0F, 5.372582F, 210.0F, 12.0F);
      ((Path)localObject2).lineTo(210.0F, 60.0F);
      ((Path)localObject2).cubicTo(210.0F, 66.627419F, 204.62741F, 72.0F, 198.0F, 72.0F);
      ((Path)localObject2).lineTo(12.0F, 72.0F);
      ((Path)localObject2).cubicTo(5.372582F, 72.0F, 0.0F, 66.627419F, 0.0F, 60.0F);
      ((Path)localObject2).lineTo(0.0F, 12.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(105.0F, 11.0F);
      ((Path)localObject1).cubicTo(105.0F, 6.581722F, 108.58172F, 3.0F, 113.0F, 3.0F);
      ((Path)localObject1).lineTo(199.0F, 3.0F);
      ((Path)localObject1).cubicTo(203.41827F, 3.0F, 207.0F, 6.581722F, 207.0F, 11.0F);
      ((Path)localObject1).lineTo(207.0F, 61.0F);
      ((Path)localObject1).cubicTo(207.0F, 65.418282F, 203.41827F, 69.0F, 199.0F, 69.0F);
      ((Path)localObject1).lineTo(113.0F, 69.0F);
      ((Path)localObject1).cubicTo(108.58172F, 69.0F, 105.0F, 65.418282F, 105.0F, 61.0F);
      ((Path)localObject1).lineTo(105.0F, 11.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awi
 * JD-Core Version:    0.6.2
 */