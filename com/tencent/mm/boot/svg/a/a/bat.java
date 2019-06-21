package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class bat extends c
{
  private final int height = 102;
  private final int width = 102;

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
        paramInt = 102;
        continue;
        paramInt = 102;
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
      Paint localPaint2 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localObject = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject).setColor(-789517);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(102.0F, 0.0F);
      localPath.lineTo(102.0F, 102.0F);
      localPath.lineTo(0.0F, 102.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint2, paramArrayOfObject);
      ((Paint)localObject).setColor(-15616);
      ((Paint)localObject).setStrokeWidth(6.0F);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(27.0F, 25.0F);
      localPath.cubicTo(27.0F, 22.790861F, 28.790861F, 21.0F, 31.0F, 21.0F);
      localPath.lineTo(71.0F, 21.0F);
      localPath.cubicTo(73.209137F, 21.0F, 75.0F, 22.790861F, 75.0F, 25.0F);
      localPath.lineTo(75.0F, 77.0F);
      localPath.cubicTo(75.0F, 79.209137F, 73.209137F, 81.0F, 71.0F, 81.0F);
      localPath.lineTo(31.0F, 81.0F);
      localPath.cubicTo(28.790861F, 81.0F, 27.0F, 79.209137F, 27.0F, 77.0F);
      localPath.lineTo(27.0F, 25.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject).setColor(-15616);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(36.0F, 33.0F);
      localPath.lineTo(60.0F, 33.0F);
      localPath.lineTo(60.0F, 39.0F);
      localPath.lineTo(36.0F, 39.0F);
      localPath.lineTo(36.0F, 33.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-15616);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 45.0F);
      ((Path)localObject).lineTo(51.0F, 45.0F);
      ((Path)localObject).lineTo(51.0F, 51.0F);
      ((Path)localObject).lineTo(36.0F, 51.0F);
      ((Path)localObject).lineTo(36.0F, 45.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bat
 * JD-Core Version:    0.6.2
 */