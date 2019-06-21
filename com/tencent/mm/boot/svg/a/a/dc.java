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

public final class dc extends c
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
      ((Paint)localObject2).setColor(-16777216);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -368.0F, 0.0F, 1.0F, -950.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 239.0F, 0.0F, 1.0F, 950.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 170.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(26.0F, 52.0F);
      ((Path)localObject2).cubicTo(11.640596F, 52.0F, 0.0F, 40.359402F, 0.0F, 26.0F);
      ((Path)localObject2).cubicTo(0.0F, 11.640596F, 11.640596F, 0.0F, 26.0F, 0.0F);
      ((Path)localObject2).cubicTo(40.359402F, 0.0F, 52.0F, 11.640596F, 52.0F, 26.0F);
      ((Path)localObject2).cubicTo(52.0F, 40.359402F, 40.359402F, 52.0F, 26.0F, 52.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(26.0F, 45.882355F);
      ((Path)localObject2).cubicTo(36.980721F, 45.882355F, 45.882355F, 36.980721F, 45.882355F, 26.0F);
      ((Path)localObject2).cubicTo(45.882355F, 15.019279F, 36.980721F, 6.117647F, 26.0F, 6.117647F);
      ((Path)localObject2).cubicTo(15.019279F, 6.117647F, 6.117647F, 15.019279F, 6.117647F, 26.0F);
      ((Path)localObject2).cubicTo(6.117647F, 36.980721F, 15.019279F, 45.882355F, 26.0F, 45.882355F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(35.0F, 26.0F);
      ((Path)localObject2).cubicTo(35.0F, 30.969801F, 30.969801F, 35.0F, 26.0F, 35.0F);
      ((Path)localObject2).cubicTo(21.030199F, 35.0F, 17.0F, 30.969801F, 17.0F, 26.0F);
      ((Path)localObject2).cubicTo(17.0F, 21.0284F, 21.030199F, 17.0F, 26.0F, 17.0F);
      ((Path)localObject2).cubicTo(30.969801F, 17.0F, 35.0F, 21.0284F, 35.0F, 26.0F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dc
 * JD-Core Version:    0.6.2
 */