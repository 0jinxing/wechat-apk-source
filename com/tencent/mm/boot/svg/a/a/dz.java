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

public final class dz extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
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
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -921.0F, 0.0F, 1.0F, -39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 921.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(855638016);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 60.0F);
      ((Path)localObject1).cubicTo(0.0F, 26.862915F, 26.862915F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject1).lineTo(60.0F, 0.0F);
      ((Path)localObject1).cubicTo(93.137085F, 0.0F, 120.0F, 26.862915F, 120.0F, 60.0F);
      ((Path)localObject1).lineTo(120.0F, 60.0F);
      ((Path)localObject1).cubicTo(120.0F, 93.137085F, 93.137085F, 120.0F, 60.0F, 120.0F);
      ((Path)localObject1).lineTo(60.0F, 120.0F);
      ((Path)localObject1).cubicTo(26.862915F, 120.0F, 0.0F, 93.137085F, 0.0F, 60.0F);
      ((Path)localObject1).lineTo(0.0F, 60.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(40.5F, 60.75F);
      ((Path)localObject3).cubicTo(40.5F, 64.477348F, 37.477348F, 67.5F, 33.75F, 67.5F);
      ((Path)localObject3).cubicTo(30.02265F, 67.5F, 27.0F, 64.477348F, 27.0F, 60.75F);
      ((Path)localObject3).cubicTo(27.0F, 57.021301F, 30.02265F, 54.0F, 33.75F, 54.0F);
      ((Path)localObject3).cubicTo(37.477348F, 54.0F, 40.5F, 57.021301F, 40.5F, 60.75F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(59.25F, 49.5F);
      ((Path)localObject3).cubicTo(65.46225F, 49.5F, 70.5F, 54.5355F, 70.5F, 60.75F);
      ((Path)localObject3).cubicTo(70.5F, 66.96225F, 65.46225F, 72.0F, 59.25F, 72.0F);
      ((Path)localObject3).cubicTo(53.03775F, 72.0F, 48.0F, 66.96225F, 48.0F, 60.75F);
      ((Path)localObject3).cubicTo(48.0F, 54.5355F, 53.03775F, 49.5F, 59.25F, 49.5F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(93.0F, 60.75F);
      ((Path)localObject3).cubicTo(93.0F, 64.477348F, 89.977348F, 67.5F, 86.25F, 67.5F);
      ((Path)localObject3).cubicTo(82.522652F, 67.5F, 79.5F, 64.477348F, 79.5F, 60.75F);
      ((Path)localObject3).cubicTo(79.5F, 57.021301F, 82.522652F, 54.0F, 86.25F, 54.0F);
      ((Path)localObject3).cubicTo(89.977348F, 54.0F, 93.0F, 57.021301F, 93.0F, 60.75F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dz
 * JD-Core Version:    0.6.2
 */