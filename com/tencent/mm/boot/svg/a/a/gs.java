package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class gs extends c
{
  private final int height = 66;
  private final int width = 66;

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
        paramInt = 66;
        continue;
        paramInt = 66;
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
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-372399);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(33.0F, 0.0F);
      ((Path)localObject3).cubicTo(51.225395F, 0.0F, 66.0F, 14.774603F, 66.0F, 33.0F);
      ((Path)localObject3).cubicTo(66.0F, 51.225395F, 51.225395F, 66.0F, 33.0F, 66.0F);
      ((Path)localObject3).cubicTo(14.774603F, 66.0F, 0.0F, 51.225395F, 0.0F, 33.0F);
      ((Path)localObject3).cubicTo(0.0F, 14.774603F, 14.774603F, 0.0F, 33.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(40.0F, 18.0F);
      ((Path)localObject2).lineTo(44.0F, 18.0F);
      ((Path)localObject2).lineTo(44.0F, 48.0F);
      ((Path)localObject2).lineTo(40.0F, 48.0F);
      ((Path)localObject2).lineTo(40.0F, 18.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(22.0F, 18.0F);
      ((Path)localObject1).lineTo(26.0F, 18.0F);
      ((Path)localObject1).lineTo(26.0F, 48.0F);
      ((Path)localObject1).lineTo(22.0F, 48.0F);
      ((Path)localObject1).lineTo(22.0F, 18.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gs
 * JD-Core Version:    0.6.2
 */