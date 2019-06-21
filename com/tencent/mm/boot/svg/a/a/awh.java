package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class awh extends c
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
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-6710887);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 12.0F);
      ((Path)localObject).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject).lineTo(198.0F, 0.0F);
      ((Path)localObject).cubicTo(204.62741F, 0.0F, 210.0F, 5.372582F, 210.0F, 12.0F);
      ((Path)localObject).lineTo(210.0F, 60.0F);
      ((Path)localObject).cubicTo(210.0F, 66.627419F, 204.62741F, 72.0F, 198.0F, 72.0F);
      ((Path)localObject).lineTo(12.0F, 72.0F);
      ((Path)localObject).cubicTo(5.372582F, 72.0F, 0.0F, 66.627419F, 0.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 12.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(3.0F, 11.0F);
      ((Path)localObject).cubicTo(3.0F, 6.581722F, 6.581722F, 3.0F, 11.0F, 3.0F);
      ((Path)localObject).lineTo(97.0F, 3.0F);
      ((Path)localObject).cubicTo(101.41828F, 3.0F, 105.0F, 6.581722F, 105.0F, 11.0F);
      ((Path)localObject).lineTo(105.0F, 61.0F);
      ((Path)localObject).cubicTo(105.0F, 65.418282F, 101.41828F, 69.0F, 97.0F, 69.0F);
      ((Path)localObject).lineTo(11.0F, 69.0F);
      ((Path)localObject).cubicTo(6.581722F, 69.0F, 3.0F, 65.418282F, 3.0F, 61.0F);
      ((Path)localObject).lineTo(3.0F, 11.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awh
 * JD-Core Version:    0.6.2
 */