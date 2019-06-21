package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class gt extends c
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
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-372399);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(33.0F, 0.0F);
      localPath.cubicTo(51.225395F, 0.0F, 66.0F, 14.774603F, 66.0F, 33.0F);
      localPath.cubicTo(66.0F, 51.225395F, 51.225395F, 66.0F, 33.0F, 66.0F);
      localPath.cubicTo(14.774603F, 66.0F, 0.0F, 51.225395F, 0.0F, 33.0F);
      localPath.cubicTo(0.0F, 14.774603F, 14.774603F, 0.0F, 33.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(40.0F, 18.0F);
      localPath.lineTo(44.0F, 18.0F);
      localPath.lineTo(44.0F, 48.0F);
      localPath.lineTo(40.0F, 48.0F);
      localPath.lineTo(40.0F, 18.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(22.0F, 18.0F);
      localPath.lineTo(26.0F, 18.0F);
      localPath.lineTo(26.0F, 48.0F);
      localPath.lineTo(22.0F, 48.0F);
      localPath.lineTo(22.0F, 18.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(419430400);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(33.0F, 0.0F);
      ((Path)localObject).cubicTo(51.225395F, 0.0F, 66.0F, 14.774603F, 66.0F, 33.0F);
      ((Path)localObject).cubicTo(66.0F, 51.225395F, 51.225395F, 66.0F, 33.0F, 66.0F);
      ((Path)localObject).cubicTo(14.774603F, 66.0F, 0.0F, 51.225395F, 0.0F, 33.0F);
      ((Path)localObject).cubicTo(0.0F, 14.774603F, 14.774603F, 0.0F, 33.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gt
 * JD-Core Version:    0.6.2
 */