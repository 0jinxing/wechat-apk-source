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

public final class ea extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1463.0F, 0.0F, 1.0F, -215.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1463.0F, 0.0F, 1.0F, 215.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(8.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(72.0F, 52.0F);
      ((Path)localObject1).lineTo(77.143501F, 52.0F);
      ((Path)localObject1).cubicTo(80.375984F, 52.0F, 81.201538F, 50.095749F, 78.983025F, 47.746735F);
      ((Path)localObject1).lineTo(53.016972F, 20.253265F);
      ((Path)localObject1).cubicTo(50.803982F, 17.910099F, 47.201538F, 17.904251F, 44.983028F, 20.253265F);
      ((Path)localObject1).lineTo(19.016973F, 47.746735F);
      ((Path)localObject1).cubicTo(16.803982F, 50.089901F, 17.622042F, 52.0F, 20.856497F, 52.0F);
      ((Path)localObject1).lineTo(26.0F, 52.0F);
      ((Path)localObject1).lineTo(26.0F, 74.073174F);
      ((Path)localObject1).cubicTo(26.0F, 75.697594F, 27.311769F, 77.0F, 28.92992F, 77.0F);
      ((Path)localObject1).lineTo(69.070076F, 77.0F);
      ((Path)localObject1).cubicTo(70.697411F, 77.0F, 72.0F, 75.689613F, 72.0F, 74.073174F);
      ((Path)localObject1).lineTo(72.0F, 52.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(54.0F, 63.0F);
      ((Path)localObject2).lineTo(54.0F, 74.0F);
      ((Path)localObject2).lineTo(45.0F, 74.0F);
      ((Path)localObject2).lineTo(45.0F, 63.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ea
 * JD-Core Version:    0.6.2
 */