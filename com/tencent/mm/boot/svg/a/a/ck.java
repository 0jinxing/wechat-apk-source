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

public final class ck extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
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
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-7645398);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(68.0F, 87.0F);
      ((Path)localObject2).cubicTo(68.0F, 88.656853F, 66.656853F, 90.0F, 65.0F, 90.0F);
      ((Path)localObject2).lineTo(3.0F, 90.0F);
      ((Path)localObject2).cubicTo(1.343146F, 90.0F, 2.029061E-016F, 88.656853F, 0.0F, 87.0F);
      ((Path)localObject2).lineTo(0.0F, 3.0F);
      ((Path)localObject2).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-9485023);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(49.0F, 22.0F);
      ((Path)localObject2).cubicTo(47.343147F, 22.0F, 46.0F, 20.656855F, 46.0F, 19.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(32.714287F, 22.674419F);
      ((Path)localObject1).lineTo(32.714287F, 15.116279F);
      ((Path)localObject1).lineTo(29.5F, 15.116279F);
      ((Path)localObject1).cubicTo(28.671574F, 15.116279F, 28.0F, 14.444706F, 28.0F, 13.616279F);
      ((Path)localObject1).lineTo(28.0F, 9.05814F);
      ((Path)localObject1).cubicTo(28.0F, 8.229713F, 28.671574F, 7.558139F, 29.5F, 7.558139F);
      ((Path)localObject1).lineTo(32.714287F, 7.558139F);
      ((Path)localObject1).lineTo(32.714287F, 0.0F);
      ((Path)localObject1).lineTo(37.5F, 2.220446E-016F);
      ((Path)localObject1).cubicTo(38.328426F, -6.659261E-016F, 39.0F, 0.6715729F, 39.0F, 1.5F);
      ((Path)localObject1).lineTo(39.0F, 6.058139F);
      ((Path)localObject1).cubicTo(39.0F, 6.886567F, 38.328426F, 7.558139F, 37.5F, 7.558139F);
      ((Path)localObject1).lineTo(34.285713F, 7.558139F);
      ((Path)localObject1).lineTo(34.285713F, 15.116279F);
      ((Path)localObject1).lineTo(37.5F, 15.116279F);
      ((Path)localObject1).cubicTo(38.328426F, 15.116279F, 39.0F, 15.787852F, 39.0F, 16.61628F);
      ((Path)localObject1).lineTo(39.0F, 21.174419F);
      ((Path)localObject1).cubicTo(39.0F, 22.002846F, 38.328426F, 22.674419F, 37.5F, 22.674419F);
      ((Path)localObject1).lineTo(34.285713F, 22.674419F);
      ((Path)localObject1).lineTo(34.285713F, 30.232557F);
      ((Path)localObject1).lineTo(37.5F, 30.232557F);
      ((Path)localObject1).cubicTo(38.328426F, 30.232557F, 39.0F, 30.904131F, 39.0F, 31.732557F);
      ((Path)localObject1).lineTo(39.0F, 36.290699F);
      ((Path)localObject1).cubicTo(39.0F, 37.119125F, 38.328426F, 37.790699F, 37.5F, 37.790699F);
      ((Path)localObject1).lineTo(32.714287F, 37.790699F);
      ((Path)localObject1).lineTo(32.714287F, 30.232557F);
      ((Path)localObject1).lineTo(29.5F, 30.232557F);
      ((Path)localObject1).cubicTo(28.671574F, 30.232557F, 28.0F, 29.560986F, 28.0F, 28.732557F);
      ((Path)localObject1).lineTo(28.0F, 24.174419F);
      ((Path)localObject1).cubicTo(28.0F, 23.345991F, 28.671574F, 22.674419F, 29.5F, 22.674419F);
      ((Path)localObject1).lineTo(32.714287F, 22.674419F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(29.5F, 42.325581F);
      ((Path)localObject1).lineTo(37.5F, 42.325581F);
      ((Path)localObject1).cubicTo(38.328426F, 42.325581F, 39.0F, 42.997154F, 39.0F, 43.825581F);
      ((Path)localObject1).lineTo(39.0F, 63.5F);
      ((Path)localObject1).cubicTo(39.0F, 64.32843F, 38.328426F, 65.0F, 37.5F, 65.0F);
      ((Path)localObject1).lineTo(29.5F, 65.0F);
      ((Path)localObject1).cubicTo(28.671574F, 65.0F, 28.0F, 64.32843F, 28.0F, 63.5F);
      ((Path)localObject1).lineTo(28.0F, 43.825581F);
      ((Path)localObject1).cubicTo(28.0F, 42.997154F, 28.671574F, 42.325581F, 29.5F, 42.325581F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(30.357143F, 54.418606F);
      ((Path)localObject1).lineTo(30.357143F, 62.732559F);
      ((Path)localObject1).lineTo(36.642857F, 62.732559F);
      ((Path)localObject1).lineTo(36.642857F, 54.418606F);
      ((Path)localObject1).lineTo(30.357143F, 54.418606F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ck
 * JD-Core Version:    0.6.2
 */