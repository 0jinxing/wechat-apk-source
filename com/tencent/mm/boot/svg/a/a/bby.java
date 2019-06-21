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

public final class bby extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint3 = c.a(localPaint1, paramArrayOfObject);
      localPaint3.setColor(-7829368);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(90.0F, 0.0F);
      localPath.lineTo(90.0F, 90.0F);
      localPath.lineTo(0.0F, 90.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 25.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      ((Paint)localObject2).setStrokeWidth(4.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(40.0F, 50.0F);
      ((Path)localObject1).cubicTo(40.0F, 51.162144F, 39.16621F, 52.0F, 38.0F, 52.0F);
      ((Path)localObject1).lineTo(2.0F, 52.0F);
      ((Path)localObject1).cubicTo(0.8354569F, 52.0F, 0.0F, 51.150742F, 0.0F, 50.0F);
      ((Path)localObject1).lineTo(0.0F, 2.0F);
      ((Path)localObject1).cubicTo(0.0F, 0.837858F, 0.8337914F, 0.0F, 2.0F, 0.0F);
      ((Path)localObject1).lineTo(27.0F, 0.0F);
      ((Path)localObject1).lineTo(40.0F, 13.0F);
      ((Path)localObject1).lineTo(40.0F, 50.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(23.0F, 0.0F);
      ((Path)localObject1).lineTo(27.0F, 0.0F);
      ((Path)localObject1).lineTo(27.0F, 16.0F);
      ((Path)localObject1).lineTo(23.0F, 16.0F);
      ((Path)localObject1).lineTo(23.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(23.0F, 13.0F);
      ((Path)localObject1).lineTo(40.0F, 13.0F);
      ((Path)localObject1).lineTo(40.0F, 17.0F);
      ((Path)localObject1).lineTo(23.0F, 17.0F);
      ((Path)localObject1).lineTo(23.0F, 13.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bby
 * JD-Core Version:    0.6.2
 */