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

public final class aez extends c
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
      ((Paint)localObject2).setColor(-16139513);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -345.0F, 0.0F, 1.0F, -473.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 40.0F, 0.0F, 1.0F, 403.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 305.0F, 0.0F, 1.0F, 70.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(60.0F, 30.370371F);
      ((Path)localObject2).cubicTo(60.0F, 46.56889F, 46.56889F, 60.0F, 29.629629F, 60.0F);
      ((Path)localObject2).cubicTo(13.431111F, 60.0F, 0.0F, 46.56889F, 0.0F, 30.370371F);
      ((Path)localObject2).cubicTo(0.0F, 13.431111F, 13.431111F, 0.0F, 29.629629F, 0.0F);
      ((Path)localObject2).cubicTo(46.56889F, 0.0F, 60.0F, 13.431111F, 60.0F, 30.370371F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(15.577749F, 32.460346F);
      ((Path)localObject2).lineTo(24.479271F, 41.672981F);
      ((Path)localObject2).cubicTo(24.862179F, 42.069271F, 25.488976F, 42.073776F, 25.882545F, 41.686443F);
      ((Path)localObject2).lineTo(46.247879F, 21.643913F);
      ((Path)localObject2).cubicTo(46.635559F, 21.262381F, 46.64444F, 20.630444F, 46.254559F, 20.245399F);
      ((Path)localObject2).lineTo(45.930828F, 19.92568F);
      ((Path)localObject2).cubicTo(45.543224F, 19.542885F, 44.883877F, 19.512583F, 44.463219F, 19.863024F);
      ((Path)localObject2).lineTo(25.932226F, 35.300838F);
      ((Path)localObject2).cubicTo(25.518642F, 35.64539F, 24.817387F, 35.66468F, 24.381721F, 35.330769F);
      ((Path)localObject2).lineTo(17.411554F, 29.988533F);
      ((Path)localObject2).cubicTo(16.979122F, 29.657099F, 16.359636F, 29.741899F, 16.035114F, 30.183472F);
      ((Path)localObject2).lineTo(15.474698F, 30.946018F);
      ((Path)localObject2).cubicTo(15.1507F, 31.386875F, 15.196312F, 32.065578F, 15.577749F, 32.460346F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aez
 * JD-Core Version:    0.6.2
 */