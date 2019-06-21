package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class wu extends c
{
  private final int height = 46;
  private final int width = 46;

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
        paramInt = 46;
        continue;
        paramInt = 46;
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
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-8744017);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(30.430653F, 34.178318F);
      ((Path)localObject).cubicTo(27.249908F, 36.577492F, 23.291077F, 38.0F, 19.0F, 38.0F);
      ((Path)localObject).cubicTo(8.50659F, 38.0F, 0.0F, 29.49341F, 0.0F, 19.0F);
      ((Path)localObject).cubicTo(0.0F, 8.50659F, 8.50659F, 0.0F, 19.0F, 0.0F);
      ((Path)localObject).cubicTo(29.49341F, 0.0F, 38.0F, 8.50659F, 38.0F, 19.0F);
      ((Path)localObject).cubicTo(38.0F, 23.291077F, 36.577492F, 27.249908F, 34.178318F, 30.430653F);
      ((Path)localObject).lineTo(45.619164F, 41.871498F);
      ((Path)localObject).lineTo(41.871498F, 45.619164F);
      ((Path)localObject).lineTo(30.430653F, 34.178318F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.062714F, 30.446621F);
      ((Path)localObject).cubicTo(24.783264F, 32.055153F, 22.001972F, 33.0F, 19.0F, 33.0F);
      ((Path)localObject).cubicTo(11.268014F, 33.0F, 5.0F, 26.731987F, 5.0F, 19.0F);
      ((Path)localObject).cubicTo(5.0F, 11.268014F, 11.268014F, 5.0F, 19.0F, 5.0F);
      ((Path)localObject).cubicTo(26.731987F, 5.0F, 33.0F, 11.268014F, 33.0F, 19.0F);
      ((Path)localObject).cubicTo(33.0F, 22.001972F, 32.055153F, 24.783264F, 30.446621F, 27.062714F);
      ((Path)localObject).lineTo(27.062714F, 30.446621F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wu
 * JD-Core Version:    0.6.2
 */