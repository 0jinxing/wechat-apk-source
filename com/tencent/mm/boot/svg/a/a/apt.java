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

public final class apt extends c
{
  private final int height = 210;
  private final int width = 210;

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
        paramInt = 210;
        continue;
        paramInt = 210;
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-263173);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(24.700001F, 33.630001F);
      ((Path)localObject3).cubicTo(40.27F, 15.91F, 62.450001F, 4.14F, 85.879997F, 1.28F);
      ((Path)localObject3).cubicTo(108.44F, -1.63F, 131.96001F, 3.59F, 151.09F, 15.93F);
      ((Path)localObject3).cubicTo(172.67F, 29.610001F, 188.49001F, 52.029999F, 194.03F, 76.980003F);
      ((Path)localObject3).cubicTo(200.74001F, 105.79F, 193.44F, 137.39999F, 174.77F, 160.34F);
      ((Path)localObject3).cubicTo(173.14999F, 160.22F, 171.53F, 160.10001F, 169.92F, 159.98F);
      ((Path)localObject3).cubicTo(183.87F, 143.67F, 192.17999F, 122.51F, 192.44F, 100.99F);
      ((Path)localObject3).cubicTo(193.16F, 79.559998F, 185.98F, 58.09F, 172.86F, 41.169998F);
      ((Path)localObject3).cubicTo(159.56F, 23.77F, 139.95F, 11.4F, 118.6F, 6.64F);
      ((Path)localObject3).cubicTo(99.239998F, 2.59F, 78.5F, 4.25F, 60.389999F, 12.4F);
      ((Path)localObject3).cubicTo(38.52F, 21.959999F, 20.59F, 40.16F, 11.33F, 62.16F);
      ((Path)localObject3).cubicTo(-0.62F, 90.040001F, 2.12F, 123.71F, 18.58F, 149.22F);
      ((Path)localObject3).cubicTo(17.559999F, 149.45F, 15.51F, 149.89999F, 14.49F, 150.13F);
      ((Path)localObject3).cubicTo(3.87F, 132.83F, -1.21F, 112.21F, 0.26F, 91.959999F);
      ((Path)localObject3).cubicTo(1.63F, 70.519997F, 10.41F, 49.66F, 24.700001F, 33.630001F);
      ((Path)localObject3).lineTo(24.700001F, 33.630001F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(99.0F, 199.0F);
      ((Path)localObject4).cubicTo(153.67619F, 199.0F, 198.0F, 154.67619F, 198.0F, 100.0F);
      ((Path)localObject4).cubicTo(198.0F, 45.323811F, 153.67619F, 1.0F, 99.0F, 1.0F);
      ((Path)localObject4).cubicTo(44.323811F, 1.0F, 0.0F, 45.323811F, 0.0F, 100.0F);
      ((Path)localObject4).cubicTo(0.0F, 154.67619F, 44.323811F, 199.0F, 99.0F, 199.0F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(99.0F, 194.0F);
      ((Path)localObject4).cubicTo(150.91476F, 194.0F, 193.0F, 151.91476F, 193.0F, 100.0F);
      ((Path)localObject4).cubicTo(193.0F, 48.085232F, 150.91476F, 6.0F, 99.0F, 6.0F);
      ((Path)localObject4).cubicTo(47.085232F, 6.0F, 5.0F, 48.085232F, 5.0F, 100.0F);
      ((Path)localObject4).cubicTo(5.0F, 151.91476F, 47.085232F, 194.0F, 99.0F, 194.0F);
      ((Path)localObject4).close();
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
      arrayOfFloat = c.a(arrayOfFloat, 198.0F, 0.0F, 0.0F, 0.0F, 199.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient((Paint)localObject3, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -1, -1184275 }, new float[] { 0.0F, 1.0F }, (Matrix)localObject1, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-13684945);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 38, 4);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(57.243538F, 7.868875F);
      ((Path)localObject2).cubicTo(75.306519F, -0.2599675F, 95.992676F, -1.915658F, 115.30242F, 2.123828F);
      ((Path)localObject2).cubicTo(136.597F, 6.871471F, 156.15608F, 19.209358F, 169.42155F, 36.564186F);
      ((Path)localObject2).cubicTo(182.50749F, 53.440262F, 189.66885F, 74.854523F, 188.95073F, 96.228889F);
      ((Path)localObject2).cubicTo(188.69141F, 117.69302F, 180.40297F, 138.7981F, 166.48918F, 155.06575F);
      ((Path)localObject2).cubicTo(153.29353F, 170.29611F, 135.36021F, 181.46703F, 115.63156F, 185.8157F);
      ((Path)localObject2).cubicTo(98.336578F, 189.47618F, 79.914528F, 188.66829F, 63.267857F, 182.54422F);
      ((Path)localObject2).cubicTo(43.688816F, 175.55243F, 26.673105F, 161.87802F, 15.542078F, 144.33368F);
      ((Path)localObject2).cubicTo(-0.8751906F, 118.88991F, -3.608077F, 85.30732F, 8.3109F, 57.499695F);
      ((Path)localObject2).cubicTo(17.54686F, 35.556808F, 35.430313F, 17.404057F, 57.243538F, 7.868875F);
      ((Path)localObject2).lineTo(57.243538F, 7.868875F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apt
 * JD-Core Version:    0.6.2
 */