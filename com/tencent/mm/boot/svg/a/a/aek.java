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

public final class aek extends c
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, -180.0F, 0.0F, 1.0F, -98.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 180.0F, 0.0F, 1.0F, 98.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-3552823);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(120.0F, 0.0F);
      ((Path)localObject3).lineTo(120.0F, 120.0F);
      ((Path)localObject3).lineTo(0.0F, 120.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(84.015633F, 54.268833F);
      ((Path)localObject2).cubicTo(89.063972F, 49.220486F, 89.019447F, 40.999851F, 83.919144F, 35.899551F);
      ((Path)localObject2).cubicTo(78.819962F, 30.800369F, 70.595184F, 30.757744F, 65.549866F, 35.803066F);
      ((Path)localObject2).lineTo(53.803066F, 47.549866F);
      ((Path)localObject2).cubicTo(48.754719F, 52.598209F, 48.799248F, 60.818844F, 53.899551F, 65.919144F);
      ((Path)localObject2).lineTo(56.509949F, 63.308746F);
      ((Path)localObject2).cubicTo(52.866802F, 59.6656F, 52.805256F, 53.823605F, 56.441032F, 50.187832F);
      ((Path)localObject2).lineTo(68.187828F, 38.441032F);
      ((Path)localObject2).cubicTo(71.821533F, 34.807327F, 77.667282F, 34.868488F, 81.308746F, 38.509949F);
      ((Path)localObject2).cubicTo(84.951897F, 42.153095F, 85.013443F, 47.99509F, 81.377663F, 51.630867F);
      ((Path)localObject2).lineTo(75.504265F, 57.504265F);
      ((Path)localObject2).lineTo(78.142235F, 60.142231F);
      ((Path)localObject2).lineTo(84.015633F, 54.268833F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(35.803066F, 65.549866F);
      ((Path)localObject2).cubicTo(30.754721F, 70.598206F, 30.799248F, 78.818848F, 35.899551F, 83.919144F);
      ((Path)localObject2).cubicTo(40.99873F, 89.018326F, 49.223511F, 89.060951F, 54.268833F, 84.015633F);
      ((Path)localObject2).lineTo(66.015633F, 72.268829F);
      ((Path)localObject2).cubicTo(71.063972F, 67.22049F, 71.019447F, 58.999851F, 65.919144F, 53.899551F);
      ((Path)localObject2).lineTo(63.308746F, 56.509949F);
      ((Path)localObject2).cubicTo(66.951897F, 60.153095F, 67.013443F, 65.995087F, 63.377663F, 69.630867F);
      ((Path)localObject2).lineTo(51.630867F, 81.377663F);
      ((Path)localObject2).cubicTo(47.997158F, 85.011368F, 42.151413F, 84.950211F, 38.509949F, 81.308746F);
      ((Path)localObject2).cubicTo(34.866802F, 77.665596F, 34.805256F, 71.823608F, 38.441032F, 68.187828F);
      ((Path)localObject2).lineTo(44.31443F, 62.31443F);
      ((Path)localObject2).lineTo(41.676464F, 59.676464F);
      ((Path)localObject2).lineTo(35.803066F, 65.549866F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aek
 * JD-Core Version:    0.6.2
 */