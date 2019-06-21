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

public final class alj extends c
{
  private final int height = 36;
  private final int width = 36;

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
        paramInt = 36;
        continue;
        paramInt = 36;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localPaint.setStrokeWidth(2.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(2.030644F, 11.052016F);
      ((Path)localObject4).cubicTo(0.7812371F, 9.886849F, 0.0F, 8.226148F, 0.0F, 6.382979F);
      ((Path)localObject4).cubicTo(0.0F, 2.857757F, 2.857757F, 0.0F, 6.382979F, 0.0F);
      ((Path)localObject4).cubicTo(8.40088F, 0.0F, 10.200077F, 0.9363797F, 11.369761F, 2.398328F);
      ((Path)localObject4).cubicTo(7.022729F, 3.583315F, 3.532287F, 6.84528F, 2.030644F, 11.052016F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(18.629875F, 2.398783F);
      ((Path)localObject4).cubicTo(19.799551F, 0.936574F, 21.598911F, 0.0F, 23.617022F, 0.0F);
      ((Path)localObject4).cubicTo(27.142242F, 0.0F, 30.0F, 2.857757F, 30.0F, 6.382979F);
      ((Path)localObject4).cubicTo(30.0F, 8.226897F, 29.218128F, 9.8882F, 27.967833F, 11.053436F);
      ((Path)localObject4).cubicTo(26.46666F, 6.846552F, 22.976622F, 3.584283F, 18.629875F, 2.398783F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(15.0F, 1.914893F);
      ((Path)localObject3).cubicTo(22.226706F, 1.914893F, 28.085106F, 7.773294F, 28.085106F, 15.0F);
      ((Path)localObject3).cubicTo(28.085106F, 22.226706F, 22.226706F, 28.085106F, 15.0F, 28.085106F);
      ((Path)localObject3).cubicTo(7.773294F, 28.085106F, 1.914893F, 22.226706F, 1.914893F, 15.0F);
      ((Path)localObject3).cubicTo(1.914893F, 7.773294F, 7.773294F, 1.914893F, 15.0F, 1.914893F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.SQUARE);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(23.0F, 26.0F);
      ((Path)localObject3).lineTo(26.19149F, 29.19149F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.SQUARE);
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 10.553192F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.0F, 26.0F);
      ((Path)localObject1).lineTo(6.553192F, 29.829786F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.SQUARE);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(15.0F, 6.136364F);
      ((Path)localObject2).lineTo(15.0F, 15.0F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeCap(Paint.Cap.SQUARE);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.0F, 15.0F);
      ((Path)localObject1).lineTo(20.74468F, 18.40909F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alj
 * JD-Core Version:    0.6.2
 */