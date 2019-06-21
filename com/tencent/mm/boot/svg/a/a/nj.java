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

public final class nj extends c
{
  private final int height = 115;
  private final int width = 115;

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
        paramInt = 115;
        continue;
        paramInt = 115;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -91.0F, 0.0F, 1.0F, -386.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 91.0F, 0.0F, 1.0F, 386.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(1275068416);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(57.391304F, 0.0F);
      ((Path)localObject2).cubicTo(89.087646F, 0.0F, 114.78261F, 25.69496F, 114.78261F, 57.391304F);
      ((Path)localObject2).cubicTo(114.78261F, 89.087646F, 89.087646F, 114.78261F, 57.391304F, 114.78261F);
      ((Path)localObject2).cubicTo(25.69496F, 114.78261F, 0.0F, 89.087646F, 0.0F, 57.391304F);
      ((Path)localObject2).cubicTo(0.0F, 25.69496F, 25.69496F, 0.0F, 57.391304F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(57.391304F, 3.0F);
      ((Path)localObject4).cubicTo(87.430794F, 3.0F, 111.78261F, 27.351814F, 111.78261F, 57.391304F);
      ((Path)localObject4).cubicTo(111.78261F, 87.430794F, 87.430794F, 111.78261F, 57.391304F, 111.78261F);
      ((Path)localObject4).cubicTo(27.351814F, 111.78261F, 3.0F, 87.430794F, 3.0F, 57.391304F);
      ((Path)localObject4).cubicTo(3.0F, 27.351814F, 27.351814F, 3.0F, 57.391304F, 3.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(75.873352F, 59.571442F);
      ((Path)localObject3).lineTo(50.798225F, 76.710197F);
      ((Path)localObject3).lineTo(50.798225F, 76.710197F);
      ((Path)localObject3).cubicTo(49.69112F, 77.466904F, 48.180206F, 77.182846F, 47.423504F, 76.075737F);
      ((Path)localObject3).cubicTo(47.147606F, 75.672089F, 47.0F, 75.194542F, 47.0F, 74.705612F);
      ((Path)localObject3).lineTo(47.0F, 40.428093F);
      ((Path)localObject3).lineTo(47.0F, 40.428093F);
      ((Path)localObject3).cubicTo(47.0F, 39.087093F, 48.087093F, 38.0F, 49.428093F, 38.0F);
      ((Path)localObject3).cubicTo(49.917027F, 38.0F, 50.394569F, 38.147606F, 50.798225F, 38.423504F);
      ((Path)localObject3).lineTo(75.873352F, 55.562263F);
      ((Path)localObject3).lineTo(75.873352F, 55.562263F);
      ((Path)localObject3).cubicTo(76.980461F, 56.318962F, 77.264519F, 57.829876F, 76.507813F, 58.936981F);
      ((Path)localObject3).cubicTo(76.337578F, 59.186047F, 76.122421F, 59.401207F, 75.873352F, 59.571442F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nj
 * JD-Core Version:    0.6.2
 */