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

public final class agw extends c
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
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-855310);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(4.0F, 56.998116F);
      ((Path)localObject2).cubicTo(4.0F, 56.997799F, 73.997719F, 57.0F, 73.997719F, 57.0F);
      ((Path)localObject2).cubicTo(74.002319F, 57.0F, 74.0F, 14.001884F, 74.0F, 14.001884F);
      ((Path)localObject2).cubicTo(74.0F, 14.004772F, 56.5F, 14.0F, 56.5F, 14.0F);
      ((Path)localObject2).lineTo(49.0F, 4.0F);
      ((Path)localObject2).lineTo(29.0F, 4.0F);
      ((Path)localObject2).lineTo(21.5F, 14.0F);
      ((Path)localObject2).lineTo(3.999805F, 14.0F);
      ((Path)localObject2).cubicTo(3.999931F, 14.00048F, 4.0F, 56.998116F, 4.0F, 56.998116F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(3.993171F, 10.0F);
      ((Path)localObject2).lineTo(19.5F, 10.0F);
      ((Path)localObject2).lineTo(27.0F, 0.0F);
      ((Path)localObject2).lineTo(51.0F, 0.0F);
      ((Path)localObject2).lineTo(58.5F, 10.0F);
      ((Path)localObject2).lineTo(74.006828F, 10.0F);
      ((Path)localObject2).cubicTo(76.200439F, 10.0F, 78.0F, 11.791705F, 78.0F, 14.001884F);
      ((Path)localObject2).lineTo(78.0F, 56.998116F);
      ((Path)localObject2).cubicTo(78.0F, 59.214787F, 76.208122F, 61.0F, 73.997719F, 61.0F);
      ((Path)localObject2).lineTo(4.002278F, 61.0F);
      ((Path)localObject2).cubicTo(1.794424F, 61.0F, 0.0F, 59.208294F, 0.0F, 56.998116F);
      ((Path)localObject2).lineTo(0.0F, 14.001884F);
      ((Path)localObject2).cubicTo(0.0F, 11.785213F, 1.787804F, 10.0F, 3.993171F, 10.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(21.0F, 33.0F);
      ((Path)localObject3).cubicTo(21.0F, 42.941124F, 29.058874F, 51.0F, 39.0F, 51.0F);
      ((Path)localObject3).cubicTo(44.036018F, 51.0F, 48.588997F, 48.93187F, 51.855957F, 45.598595F);
      ((Path)localObject3).lineTo(49.027344F, 42.769985F);
      ((Path)localObject3).cubicTo(46.484406F, 45.379486F, 42.931446F, 47.0F, 39.0F, 47.0F);
      ((Path)localObject3).cubicTo(31.268013F, 47.0F, 25.0F, 40.731987F, 25.0F, 33.0F);
      ((Path)localObject3).lineTo(30.5F, 33.0F);
      ((Path)localObject3).lineTo(22.5F, 25.0F);
      ((Path)localObject3).lineTo(14.5F, 33.0F);
      ((Path)localObject3).lineTo(21.0F, 33.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(57.0F, 33.0F);
      ((Path)localObject3).cubicTo(57.0F, 23.058874F, 48.941124F, 15.0F, 39.0F, 15.0F);
      ((Path)localObject3).cubicTo(33.963982F, 15.0F, 29.411005F, 17.068129F, 26.144045F, 20.401403F);
      ((Path)localObject3).lineTo(28.972656F, 23.230017F);
      ((Path)localObject3).cubicTo(31.515596F, 20.620514F, 35.068554F, 19.0F, 39.0F, 19.0F);
      ((Path)localObject3).cubicTo(46.731987F, 19.0F, 53.0F, 25.268013F, 53.0F, 33.0F);
      ((Path)localObject3).lineTo(47.5F, 33.0F);
      ((Path)localObject3).lineTo(55.5F, 41.0F);
      ((Path)localObject3).lineTo(63.5F, 33.0F);
      ((Path)localObject3).lineTo(57.0F, 33.0F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.agw
 * JD-Core Version:    0.6.2
 */