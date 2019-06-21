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

public final class dd extends c
{
  private final int height = 96;
  private final int width = 132;

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
        paramInt = 132;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -659.0F, 0.0F, 1.0F, -950.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 532.0F, 0.0F, 1.0F, 950.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 170.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(26.0F, 52.0F);
      ((Path)localObject).cubicTo(11.640596F, 52.0F, 0.0F, 40.359402F, 0.0F, 26.0F);
      ((Path)localObject).cubicTo(0.0F, 11.640596F, 11.640596F, 0.0F, 26.0F, 0.0F);
      ((Path)localObject).cubicTo(40.359402F, 0.0F, 52.0F, 11.640596F, 52.0F, 26.0F);
      ((Path)localObject).cubicTo(52.0F, 40.359402F, 40.359402F, 52.0F, 26.0F, 52.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(26.0F, 45.882355F);
      ((Path)localObject).cubicTo(36.980721F, 45.882355F, 45.882355F, 36.980721F, 45.882355F, 26.0F);
      ((Path)localObject).cubicTo(45.882355F, 15.019279F, 36.980721F, 6.117647F, 26.0F, 6.117647F);
      ((Path)localObject).cubicTo(15.019279F, 6.117647F, 6.117647F, 15.019279F, 6.117647F, 26.0F);
      ((Path)localObject).cubicTo(6.117647F, 36.980721F, 15.019279F, 45.882355F, 26.0F, 45.882355F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(35.0F, 26.0F);
      ((Path)localObject).cubicTo(35.0F, 30.969801F, 30.969801F, 35.0F, 26.0F, 35.0F);
      ((Path)localObject).cubicTo(21.030199F, 35.0F, 17.0F, 30.969801F, 17.0F, 26.0F);
      ((Path)localObject).cubicTo(17.0F, 21.0284F, 21.030199F, 17.0F, 26.0F, 17.0F);
      ((Path)localObject).cubicTo(30.969801F, 17.0F, 35.0F, 21.0284F, 35.0F, 26.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dd
 * JD-Core Version:    0.6.2
 */