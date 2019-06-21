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

public final class ava extends c
{
  private final int height = 30;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 30;
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
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(3.0F, 21.0F);
      ((Path)localObject2).lineTo(25.0F, 21.0F);
      ((Path)localObject2).lineTo(25.0F, 3.0F);
      ((Path)localObject2).lineTo(3.0F, 3.0F);
      ((Path)localObject2).lineTo(3.0F, 21.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 2.004947F);
      ((Path)localObject2).cubicTo(0.0F, 0.8976452F, 0.8998975F, 0.0F, 1.991244F, 0.0F);
      ((Path)localObject2).lineTo(26.008757F, 0.0F);
      ((Path)localObject2).cubicTo(27.10849F, 0.0F, 28.0F, 0.8970262F, 28.0F, 2.004947F);
      ((Path)localObject2).lineTo(28.0F, 21.995054F);
      ((Path)localObject2).cubicTo(28.0F, 23.102354F, 27.100103F, 24.0F, 26.008757F, 24.0F);
      ((Path)localObject2).lineTo(1.991244F, 24.0F);
      ((Path)localObject2).cubicTo(0.8915104F, 24.0F, 0.0F, 23.102974F, 0.0F, 21.995054F);
      ((Path)localObject2).lineTo(0.0F, 2.004947F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(34.0F, 14.914493F);
      ((Path)localObject3).lineTo(39.0F, 18.323584F);
      ((Path)localObject3).lineTo(39.0F, 5.676416F);
      ((Path)localObject3).lineTo(34.0F, 9.085507F);
      ((Path)localObject3).lineTo(34.0F, 14.914493F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(31.0F, 7.5F);
      ((Path)localObject3).lineTo(39.51767F, 1.692498F);
      ((Path)localObject3).cubicTo(40.888622F, 0.7577572F, 42.0F, 1.341771F, 42.0F, 2.991091F);
      ((Path)localObject3).lineTo(42.0F, 21.008909F);
      ((Path)localObject3).cubicTo(42.0F, 22.660843F, 40.884727F, 23.239586F, 39.51767F, 22.307503F);
      ((Path)localObject3).lineTo(31.0F, 16.5F);
      ((Path)localObject3).lineTo(31.0F, 7.5F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ava
 * JD-Core Version:    0.6.2
 */