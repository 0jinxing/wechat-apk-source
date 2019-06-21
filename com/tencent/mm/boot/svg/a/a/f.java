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

public final class f extends c
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
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 19.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.9975446F, 38.0F);
      ((Path)localObject1).cubicTo(0.446616F, 38.0F, 0.0F, 38.446312F, 0.0F, 38.997543F);
      ((Path)localObject1).lineTo(0.0F, 46.002457F);
      ((Path)localObject1).cubicTo(0.0F, 46.553383F, 0.4463114F, 47.0F, 0.9975446F, 47.0F);
      ((Path)localObject1).lineTo(8.002456F, 47.0F);
      ((Path)localObject1).cubicTo(8.553384F, 47.0F, 9.0F, 46.553688F, 9.0F, 46.002457F);
      ((Path)localObject1).lineTo(9.0F, 38.997543F);
      ((Path)localObject1).cubicTo(9.0F, 38.446617F, 8.553689F, 38.0F, 8.002456F, 38.0F);
      ((Path)localObject1).lineTo(0.9975446F, 38.0F);
      ((Path)localObject1).lineTo(0.9975446F, 38.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.9975446F, 19.0F);
      ((Path)localObject1).cubicTo(0.446616F, 19.0F, 0.0F, 19.446312F, 0.0F, 19.997545F);
      ((Path)localObject1).lineTo(0.0F, 27.002455F);
      ((Path)localObject1).cubicTo(0.0F, 27.553385F, 0.4463114F, 28.0F, 0.9975446F, 28.0F);
      ((Path)localObject1).lineTo(8.002456F, 28.0F);
      ((Path)localObject1).cubicTo(8.553384F, 28.0F, 9.0F, 27.553688F, 9.0F, 27.002455F);
      ((Path)localObject1).lineTo(9.0F, 19.997545F);
      ((Path)localObject1).cubicTo(9.0F, 19.446615F, 8.553689F, 19.0F, 8.002456F, 19.0F);
      ((Path)localObject1).lineTo(0.9975446F, 19.0F);
      ((Path)localObject1).lineTo(0.9975446F, 19.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.993174F, 38.0F);
      ((Path)localObject1).cubicTo(17.444658F, 38.0F, 17.0F, 38.446312F, 17.0F, 38.997543F);
      ((Path)localObject1).lineTo(17.0F, 46.002457F);
      ((Path)localObject1).cubicTo(17.0F, 46.553383F, 17.446476F, 47.0F, 17.993174F, 47.0F);
      ((Path)localObject1).lineTo(57.006824F, 47.0F);
      ((Path)localObject1).cubicTo(57.55534F, 47.0F, 58.0F, 46.553688F, 58.0F, 46.002457F);
      ((Path)localObject1).lineTo(58.0F, 38.997543F);
      ((Path)localObject1).cubicTo(58.0F, 38.446617F, 57.553524F, 38.0F, 57.006824F, 38.0F);
      ((Path)localObject1).lineTo(17.993174F, 38.0F);
      ((Path)localObject1).lineTo(17.993174F, 38.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.993174F, 19.0F);
      ((Path)localObject1).cubicTo(17.444658F, 19.0F, 17.0F, 19.446312F, 17.0F, 19.997545F);
      ((Path)localObject1).lineTo(17.0F, 27.002455F);
      ((Path)localObject1).cubicTo(17.0F, 27.553385F, 17.446476F, 28.0F, 17.993174F, 28.0F);
      ((Path)localObject1).lineTo(57.006824F, 28.0F);
      ((Path)localObject1).cubicTo(57.55534F, 28.0F, 58.0F, 27.553688F, 58.0F, 27.002455F);
      ((Path)localObject1).lineTo(58.0F, 19.997545F);
      ((Path)localObject1).cubicTo(58.0F, 19.446615F, 57.553524F, 19.0F, 57.006824F, 19.0F);
      ((Path)localObject1).lineTo(17.993174F, 19.0F);
      ((Path)localObject1).lineTo(17.993174F, 19.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.993174F, 0.0F);
      ((Path)localObject1).cubicTo(17.444658F, 0.0F, 17.0F, 0.4463114F, 17.0F, 0.9975446F);
      ((Path)localObject1).lineTo(17.0F, 8.002456F);
      ((Path)localObject1).cubicTo(17.0F, 8.553384F, 17.446476F, 9.0F, 17.993174F, 9.0F);
      ((Path)localObject1).lineTo(57.006824F, 9.0F);
      ((Path)localObject1).cubicTo(57.55534F, 9.0F, 58.0F, 8.553689F, 58.0F, 8.002456F);
      ((Path)localObject1).lineTo(58.0F, 0.9975446F);
      ((Path)localObject1).cubicTo(58.0F, 0.446616F, 57.553524F, 0.0F, 57.006824F, 0.0F);
      ((Path)localObject1).lineTo(17.993174F, 0.0F);
      ((Path)localObject1).lineTo(17.993174F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.9975446F, 0.0F);
      ((Path)localObject1).cubicTo(0.446616F, 0.0F, 0.0F, 0.4463114F, 0.0F, 0.9975446F);
      ((Path)localObject1).lineTo(0.0F, 8.002456F);
      ((Path)localObject1).cubicTo(0.0F, 8.553384F, 0.4463114F, 9.0F, 0.9975446F, 9.0F);
      ((Path)localObject1).lineTo(8.002456F, 9.0F);
      ((Path)localObject1).cubicTo(8.553384F, 9.0F, 9.0F, 8.553689F, 9.0F, 8.002456F);
      ((Path)localObject1).lineTo(9.0F, 0.9975446F);
      ((Path)localObject1).cubicTo(9.0F, 0.446616F, 8.553689F, 0.0F, 8.002456F, 0.0F);
      ((Path)localObject1).lineTo(0.9975446F, 0.0F);
      ((Path)localObject1).lineTo(0.9975446F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.9975446F, 38.0F);
      ((Path)localObject3).cubicTo(0.446616F, 38.0F, 0.0F, 38.446312F, 0.0F, 38.997543F);
      ((Path)localObject3).lineTo(0.0F, 46.002457F);
      ((Path)localObject3).cubicTo(0.0F, 46.553383F, 0.4463114F, 47.0F, 0.9975446F, 47.0F);
      ((Path)localObject3).lineTo(8.002456F, 47.0F);
      ((Path)localObject3).cubicTo(8.553384F, 47.0F, 9.0F, 46.553688F, 9.0F, 46.002457F);
      ((Path)localObject3).lineTo(9.0F, 38.997543F);
      ((Path)localObject3).cubicTo(9.0F, 38.446617F, 8.553689F, 38.0F, 8.002456F, 38.0F);
      ((Path)localObject3).lineTo(0.9975446F, 38.0F);
      ((Path)localObject3).lineTo(0.9975446F, 38.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(0.9975446F, 19.0F);
      ((Path)localObject3).cubicTo(0.446616F, 19.0F, 0.0F, 19.446312F, 0.0F, 19.997545F);
      ((Path)localObject3).lineTo(0.0F, 27.002455F);
      ((Path)localObject3).cubicTo(0.0F, 27.553385F, 0.4463114F, 28.0F, 0.9975446F, 28.0F);
      ((Path)localObject3).lineTo(8.002456F, 28.0F);
      ((Path)localObject3).cubicTo(8.553384F, 28.0F, 9.0F, 27.553688F, 9.0F, 27.002455F);
      ((Path)localObject3).lineTo(9.0F, 19.997545F);
      ((Path)localObject3).cubicTo(9.0F, 19.446615F, 8.553689F, 19.0F, 8.002456F, 19.0F);
      ((Path)localObject3).lineTo(0.9975446F, 19.0F);
      ((Path)localObject3).lineTo(0.9975446F, 19.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(17.993174F, 38.0F);
      ((Path)localObject3).cubicTo(17.444658F, 38.0F, 17.0F, 38.446312F, 17.0F, 38.997543F);
      ((Path)localObject3).lineTo(17.0F, 46.002457F);
      ((Path)localObject3).cubicTo(17.0F, 46.553383F, 17.446476F, 47.0F, 17.993174F, 47.0F);
      ((Path)localObject3).lineTo(57.006824F, 47.0F);
      ((Path)localObject3).cubicTo(57.55534F, 47.0F, 58.0F, 46.553688F, 58.0F, 46.002457F);
      ((Path)localObject3).lineTo(58.0F, 38.997543F);
      ((Path)localObject3).cubicTo(58.0F, 38.446617F, 57.553524F, 38.0F, 57.006824F, 38.0F);
      ((Path)localObject3).lineTo(17.993174F, 38.0F);
      ((Path)localObject3).lineTo(17.993174F, 38.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(17.993174F, 19.0F);
      ((Path)localObject3).cubicTo(17.444658F, 19.0F, 17.0F, 19.446312F, 17.0F, 19.997545F);
      ((Path)localObject3).lineTo(17.0F, 27.002455F);
      ((Path)localObject3).cubicTo(17.0F, 27.553385F, 17.446476F, 28.0F, 17.993174F, 28.0F);
      ((Path)localObject3).lineTo(57.006824F, 28.0F);
      ((Path)localObject3).cubicTo(57.55534F, 28.0F, 58.0F, 27.553688F, 58.0F, 27.002455F);
      ((Path)localObject3).lineTo(58.0F, 19.997545F);
      ((Path)localObject3).cubicTo(58.0F, 19.446615F, 57.553524F, 19.0F, 57.006824F, 19.0F);
      ((Path)localObject3).lineTo(17.993174F, 19.0F);
      ((Path)localObject3).lineTo(17.993174F, 19.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(17.993174F, 0.0F);
      ((Path)localObject3).cubicTo(17.444658F, 0.0F, 17.0F, 0.4463114F, 17.0F, 0.9975446F);
      ((Path)localObject3).lineTo(17.0F, 8.002456F);
      ((Path)localObject3).cubicTo(17.0F, 8.553384F, 17.446476F, 9.0F, 17.993174F, 9.0F);
      ((Path)localObject3).lineTo(57.006824F, 9.0F);
      ((Path)localObject3).cubicTo(57.55534F, 9.0F, 58.0F, 8.553689F, 58.0F, 8.002456F);
      ((Path)localObject3).lineTo(58.0F, 0.9975446F);
      ((Path)localObject3).cubicTo(58.0F, 0.446616F, 57.553524F, 0.0F, 57.006824F, 0.0F);
      ((Path)localObject3).lineTo(17.993174F, 0.0F);
      ((Path)localObject3).lineTo(17.993174F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(0.9975446F, 0.0F);
      ((Path)localObject3).cubicTo(0.446616F, 0.0F, 0.0F, 0.4463114F, 0.0F, 0.9975446F);
      ((Path)localObject3).lineTo(0.0F, 8.002456F);
      ((Path)localObject3).cubicTo(0.0F, 8.553384F, 0.4463114F, 9.0F, 0.9975446F, 9.0F);
      ((Path)localObject3).lineTo(8.002456F, 9.0F);
      ((Path)localObject3).cubicTo(8.553384F, 9.0F, 9.0F, 8.553689F, 9.0F, 8.002456F);
      ((Path)localObject3).lineTo(9.0F, 0.9975446F);
      ((Path)localObject3).cubicTo(9.0F, 0.446616F, 8.553689F, 0.0F, 8.002456F, 0.0F);
      ((Path)localObject3).lineTo(0.9975446F, 0.0F);
      ((Path)localObject3).lineTo(0.9975446F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.f
 * JD-Core Version:    0.6.2
 */