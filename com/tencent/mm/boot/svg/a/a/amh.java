package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class amh extends c
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
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-564640);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(12.0F, 3.0F);
      localPath.cubicTo(16.970562F, 3.0F, 21.0F, 7.029437F, 21.0F, 12.0F);
      localPath.cubicTo(21.0F, 16.970562F, 16.970562F, 21.0F, 12.0F, 21.0F);
      localPath.cubicTo(7.029437F, 21.0F, 3.0F, 16.970562F, 3.0F, 12.0F);
      localPath.cubicTo(3.0F, 7.029437F, 7.029437F, 3.0F, 12.0F, 3.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(3.0F);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(12.0F, 1.5F);
      ((Path)localObject).cubicTo(17.79899F, 1.5F, 22.5F, 6.20101F, 22.5F, 12.0F);
      ((Path)localObject).cubicTo(22.5F, 17.79899F, 17.79899F, 22.5F, 12.0F, 22.5F);
      ((Path)localObject).cubicTo(6.20101F, 22.5F, 1.5F, 17.79899F, 1.5F, 12.0F);
      ((Path)localObject).cubicTo(1.5F, 6.20101F, 6.20101F, 1.5F, 12.0F, 1.5F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.amh
 * JD-Core Version:    0.6.2
 */