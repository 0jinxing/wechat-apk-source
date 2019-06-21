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

public final class tp extends c
{
  private final int height = 84;
  private final int width = 84;

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
        paramInt = 84;
        continue;
        paramInt = 84;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-12632257);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 11.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(21.139999F, 1.2F);
      ((Path)localObject1).cubicTo(25.040001F, 0.82F, 28.99F, 0.82F, 32.889999F, 1.2F);
      ((Path)localObject1).cubicTo(33.540001F, 2.09F, 34.150002F, 3.01F, 34.700001F, 3.97F);
      ((Path)localObject1).cubicTo(40.119999F, 4.19F, 45.57F, 3.66F, 50.970001F, 4.21F);
      ((Path)localObject1).cubicTo(53.779999F, 5.17F, 52.77F, 8.74F, 53.09F, 11.0F);
      ((Path)localObject1).lineTo(0.91F, 11.0F);
      ((Path)localObject1).cubicTo(1.23F, 8.75F, 0.21F, 5.22F, 2.98F, 4.22F);
      ((Path)localObject1).cubicTo(8.39F, 3.65F, 13.86F, 4.2F, 19.299999F, 3.97F);
      ((Path)localObject1).cubicTo(19.84F, 3.0F, 20.459999F, 2.07F, 21.139999F, 1.2F);
      ((Path)localObject1).lineTo(21.139999F, 1.2F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(38.983093F, 49.0F);
      ((Path)localObject1).lineTo(39.0F, 49.0F);
      ((Path)localObject1).lineTo(39.0F, 25.0F);
      ((Path)localObject1).lineTo(38.983974F, 25.0F);
      ((Path)localObject1).lineTo(38.983974F, 25.0F);
      ((Path)localObject1).cubicTo(38.983978F, 24.998188F, 38.983982F, 24.996376F, 38.983982F, 24.994562F);
      ((Path)localObject1).cubicTo(38.983982F, 23.890539F, 38.089172F, 22.99555F, 36.985374F, 22.99555F);
      ((Path)localObject1).cubicTo(35.881573F, 22.99555F, 34.986767F, 23.890539F, 34.986767F, 24.994562F);
      ((Path)localObject1).cubicTo(34.986767F, 25.072788F, 34.991261F, 25.149965F, 35.0F, 25.225849F);
      ((Path)localObject1).lineTo(35.0F, 48.828903F);
      ((Path)localObject1).cubicTo(34.991261F, 48.904785F, 34.986767F, 48.981964F, 34.986767F, 49.060188F);
      ((Path)localObject1).cubicTo(34.986767F, 50.164211F, 35.881573F, 51.0592F, 36.985374F, 51.0592F);
      ((Path)localObject1).cubicTo(38.089172F, 51.0592F, 38.983982F, 50.164211F, 38.983982F, 49.060188F);
      ((Path)localObject1).cubicTo(38.983982F, 49.040054F, 38.983685F, 49.019989F, 38.983093F, 49.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(18.983091F, 49.0F);
      ((Path)localObject1).lineTo(19.0F, 49.0F);
      ((Path)localObject1).lineTo(19.0F, 25.0F);
      ((Path)localObject1).lineTo(18.983973F, 25.0F);
      ((Path)localObject1).lineTo(18.983973F, 25.0F);
      ((Path)localObject1).cubicTo(18.983978F, 24.998188F, 18.98398F, 24.996376F, 18.98398F, 24.994562F);
      ((Path)localObject1).cubicTo(18.98398F, 23.890539F, 18.089174F, 22.99555F, 16.985374F, 22.99555F);
      ((Path)localObject1).cubicTo(15.881574F, 22.99555F, 14.986767F, 23.890539F, 14.986767F, 24.994562F);
      ((Path)localObject1).cubicTo(14.986767F, 25.072788F, 14.99126F, 25.149965F, 15.0F, 25.225849F);
      ((Path)localObject1).lineTo(15.0F, 48.828903F);
      ((Path)localObject1).cubicTo(14.99126F, 48.904785F, 14.986767F, 48.981964F, 14.986767F, 49.060188F);
      ((Path)localObject1).cubicTo(14.986767F, 50.164211F, 15.881574F, 51.0592F, 16.985374F, 51.0592F);
      ((Path)localObject1).cubicTo(18.089174F, 51.0592F, 18.98398F, 50.164211F, 18.98398F, 49.060188F);
      ((Path)localObject1).cubicTo(18.98398F, 49.040054F, 18.983683F, 49.019989F, 18.983091F, 49.0F);
      ((Path)localObject1).lineTo(18.983091F, 49.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(28.983091F, 49.0F);
      ((Path)localObject1).lineTo(29.0F, 49.0F);
      ((Path)localObject1).lineTo(29.0F, 25.0F);
      ((Path)localObject1).lineTo(28.983973F, 25.0F);
      ((Path)localObject1).lineTo(28.983973F, 25.0F);
      ((Path)localObject1).cubicTo(28.983978F, 24.998188F, 28.98398F, 24.996376F, 28.98398F, 24.994562F);
      ((Path)localObject1).cubicTo(28.98398F, 23.890539F, 28.089174F, 22.99555F, 26.985374F, 22.99555F);
      ((Path)localObject1).cubicTo(25.881573F, 22.99555F, 24.986767F, 23.890539F, 24.986767F, 24.994562F);
      ((Path)localObject1).cubicTo(24.986767F, 25.072788F, 24.991259F, 25.149965F, 25.0F, 25.225849F);
      ((Path)localObject1).lineTo(25.0F, 48.828903F);
      ((Path)localObject1).cubicTo(24.991259F, 48.904785F, 24.986767F, 48.981964F, 24.986767F, 49.060188F);
      ((Path)localObject1).cubicTo(24.986767F, 50.164211F, 25.881573F, 51.0592F, 26.985374F, 51.0592F);
      ((Path)localObject1).cubicTo(28.089174F, 51.0592F, 28.98398F, 50.164211F, 28.98398F, 49.060188F);
      ((Path)localObject1).cubicTo(28.98398F, 49.040054F, 28.983683F, 49.019989F, 28.983091F, 49.0F);
      ((Path)localObject1).lineTo(28.983091F, 49.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(47.985489F, 14.0F);
      ((Path)localObject1).cubicTo(47.965504F, 28.023064F, 48.015469F, 42.056126F, 47.975498F, 56.079189F);
      ((Path)localObject1).cubicTo(48.175358F, 57.828323F, 47.146076F, 59.987255F, 45.12748F, 59.897301F);
      ((Path)localObject1).cubicTo(33.395657F, 60.087208F, 21.653841F, 59.937279F, 9.912026F, 59.967266F);
      ((Path)localObject1).cubicTo(8.113279F, 60.207146F, 5.97477F, 59.117687F, 6.094686F, 57.058704F);
      ((Path)localObject1).cubicTo(5.894826F, 42.715797F, 6.084693F, 28.352901F, 6.014742F, 14.0F);
      ((Path)localObject1).lineTo(47.985489F, 14.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tp
 * JD-Core Version:    0.6.2
 */