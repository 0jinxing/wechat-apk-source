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

public final class nw extends c
{
  private final int height = 135;
  private final int width = 300;

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
        paramInt = 300;
        continue;
        paramInt = 135;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-921103);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(300.0F, 0.0F);
      ((Path)localObject3).lineTo(300.0F, 136.0F);
      ((Path)localObject3).lineTo(0.0F, 136.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-3552823);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 111.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 3.004289F);
      ((Path)localObject2).cubicTo(0.0F, 1.345066F, 1.338046F, 0.0F, 3.000426F, 0.0F);
      ((Path)localObject2).lineTo(75.999573F, 0.0F);
      ((Path)localObject2).cubicTo(77.656662F, 0.0F, 79.0F, 1.352776F, 79.0F, 3.004289F);
      ((Path)localObject2).lineTo(79.0F, 53.995712F);
      ((Path)localObject2).cubicTo(79.0F, 55.654934F, 77.661957F, 57.0F, 75.999573F, 57.0F);
      ((Path)localObject2).lineTo(3.000426F, 57.0F);
      ((Path)localObject2).cubicTo(1.343337F, 57.0F, 0.0F, 55.647224F, 0.0F, 53.995712F);
      ((Path)localObject2).lineTo(0.0F, 3.004289F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 4.0F);
      ((Path)localObject2).lineTo(75.0F, 4.0F);
      ((Path)localObject2).lineTo(75.0F, 53.0F);
      ((Path)localObject2).lineTo(4.0F, 53.0F);
      ((Path)localObject2).lineTo(4.0F, 4.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(60.921059F, 30.279995F);
      ((Path)localObject2).lineTo(50.039063F, 38.768322F);
      ((Path)localObject2).lineTo(53.859421F, 46.690155F);
      ((Path)localObject2).lineTo(27.177771F, 22.0F);
      ((Path)localObject2).lineTo(2.0F, 45.710293F);
      ((Path)localObject2).lineTo(2.0F, 56.5F);
      ((Path)localObject2).lineTo(77.96154F, 56.5F);
      ((Path)localObject2).lineTo(77.96154F, 45.710293F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nw
 * JD-Core Version:    0.6.2
 */