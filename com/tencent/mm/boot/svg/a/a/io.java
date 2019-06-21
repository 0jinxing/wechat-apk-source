package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class io extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-5592406);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -154.0F, 0.0F, 1.0F, -132.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 160.0F, 0.0F, 1.0F, 141.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 6.006387F);
      ((Path)localObject2).cubicTo(0.0F, 2.689151F, 2.683541F, 0.0F, 6.006387F, 0.0F);
      ((Path)localObject2).lineTo(41.993614F, 0.0F);
      ((Path)localObject2).cubicTo(45.310848F, 0.0F, 48.0F, 2.683541F, 48.0F, 6.006387F);
      ((Path)localObject2).lineTo(48.0F, 41.993614F);
      ((Path)localObject2).cubicTo(48.0F, 45.310848F, 45.31646F, 48.0F, 41.993614F, 48.0F);
      ((Path)localObject2).lineTo(6.006387F, 48.0F);
      ((Path)localObject2).cubicTo(2.689151F, 48.0F, 0.0F, 45.31646F, 0.0F, 41.993614F);
      ((Path)localObject2).lineTo(0.0F, 6.006387F);
      ((Path)localObject2).lineTo(0.0F, 6.006387F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 5.997292F);
      ((Path)localObject2).cubicTo(4.0F, 4.894218F, 4.89154F, 4.0F, 5.997292F, 4.0F);
      ((Path)localObject2).lineTo(42.002708F, 4.0F);
      ((Path)localObject2).cubicTo(43.105782F, 4.0F, 44.0F, 4.89154F, 44.0F, 5.997292F);
      ((Path)localObject2).lineTo(44.0F, 42.002708F);
      ((Path)localObject2).cubicTo(44.0F, 43.105782F, 43.108459F, 44.0F, 42.002708F, 44.0F);
      ((Path)localObject2).lineTo(5.997292F, 44.0F);
      ((Path)localObject2).cubicTo(4.894218F, 44.0F, 4.0F, 43.108459F, 4.0F, 42.002708F);
      ((Path)localObject2).lineTo(4.0F, 5.997292F);
      ((Path)localObject2).lineTo(4.0F, 5.997292F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.io
 * JD-Core Version:    0.6.2
 */