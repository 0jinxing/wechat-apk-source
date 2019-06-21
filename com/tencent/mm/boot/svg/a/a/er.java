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

public final class er extends c
{
  private final int height = 41;
  private final int width = 47;

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
        paramInt = 47;
        continue;
        paramInt = 41;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -126.0F, 0.0F, 1.0F, -1631.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 127.0F, 0.0F, 1.0F, 1631.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-10526881);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.2737557F, 36.998192F);
      ((Path)localObject3).cubicTo(-0.9820049F, 39.208328F, 0.05327524F, 41.0F, 2.614258F, 41.0F);
      ((Path)localObject3).lineTo(43.385742F, 41.0F);
      ((Path)localObject3).cubicTo(45.934128F, 41.0F, 46.981197F, 39.206909F, 45.726246F, 36.998192F);
      ((Path)localObject3).lineTo(25.273756F, 1.00181F);
      ((Path)localObject3).cubicTo(24.017996F, -1.208329F, 21.981197F, -1.206909F, 20.726244F, 1.00181F);
      ((Path)localObject3).lineTo(0.2737557F, 36.998192F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-10526881);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(22.224131F, 14.0F);
      ((Path)localObject2).cubicTo(21.548061F, 14.0F, 21.041523F, 14.548094F, 21.093502F, 15.234215F);
      ((Path)localObject2).lineTo(22.120932F, 28.796301F);
      ((Path)localObject2).cubicTo(22.146191F, 29.129715F, 22.437256F, 29.4F, 22.777334F, 29.4F);
      ((Path)localObject2).lineTo(22.722666F, 29.4F);
      ((Path)localObject2).cubicTo(23.059927F, 29.4F, 23.353582F, 29.132704F, 23.379068F, 28.796301F);
      ((Path)localObject2).lineTo(24.406498F, 15.234215F);
      ((Path)localObject2).cubicTo(24.458138F, 14.552577F, 23.953125F, 14.0F, 23.275869F, 14.0F);
      ((Path)localObject2).lineTo(22.224131F, 14.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(23.0F, 35.0F);
      ((Path)localObject2).cubicTo(24.10457F, 35.0F, 25.0F, 34.104568F, 25.0F, 33.0F);
      ((Path)localObject2).cubicTo(25.0F, 31.89543F, 24.10457F, 31.0F, 23.0F, 31.0F);
      ((Path)localObject2).cubicTo(21.89543F, 31.0F, 21.0F, 31.89543F, 21.0F, 33.0F);
      ((Path)localObject2).cubicTo(21.0F, 34.104568F, 21.89543F, 35.0F, 23.0F, 35.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.er
 * JD-Core Version:    0.6.2
 */