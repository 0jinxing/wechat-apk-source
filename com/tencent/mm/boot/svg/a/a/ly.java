package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class ly extends c
{
  private final int height = 48;
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
        paramInt = 48;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      c.a((Paint)localObject1, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Object localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15683841);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.1875F, 2.88F);
      ((Path)localObject1).cubicTo(0.1875F, 1.28942F, 1.47692F, 0.0F, 3.0675F, 0.0F);
      ((Path)localObject1).lineTo(62.932499F, 0.0F);
      ((Path)localObject1).cubicTo(64.523079F, 0.0F, 65.8125F, 1.28942F, 65.8125F, 2.88F);
      ((Path)localObject1).lineTo(65.8125F, 45.119999F);
      ((Path)localObject1).cubicTo(65.8125F, 46.710579F, 64.523079F, 48.0F, 62.932499F, 48.0F);
      ((Path)localObject1).lineTo(3.0675F, 48.0F);
      ((Path)localObject1).cubicTo(1.47692F, 48.0F, 0.1875F, 46.710579F, 0.1875F, 45.119999F);
      ((Path)localObject1).lineTo(0.1875F, 2.88F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(14.4375F, 9.081081F);
      ((Path)localObject2).cubicTo(17.854763F, 9.081081F, 20.625F, 11.69477F, 20.625F, 14.918919F);
      ((Path)localObject2).cubicTo(20.625F, 18.143068F, 17.854763F, 20.756756F, 14.4375F, 20.756756F);
      ((Path)localObject2).cubicTo(11.020238F, 20.756756F, 8.25F, 18.143068F, 8.25F, 14.918919F);
      ((Path)localObject2).cubicTo(8.25F, 11.69477F, 11.020238F, 9.081081F, 14.4375F, 9.081081F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(8.25F, 29.837837F);
      ((Path)localObject1).lineTo(55.0F, 29.837837F);
      ((Path)localObject1).lineTo(55.0F, 36.705883F);
      ((Path)localObject1).lineTo(8.25F, 36.705883F);
      ((Path)localObject1).lineTo(8.25F, 29.837837F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ly
 * JD-Core Version:    0.6.2
 */