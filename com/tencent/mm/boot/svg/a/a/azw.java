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

public final class azw extends c
{
  private final int height = 189;
  private final int width = 189;

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
        paramInt = 189;
        continue;
        paramInt = 189;
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
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-16268960);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(94.5F, 0.0F);
      ((Path)localObject4).cubicTo(146.69092F, 0.0F, 189.0F, 42.30909F, 189.0F, 94.5F);
      ((Path)localObject4).cubicTo(189.0F, 146.69092F, 146.69092F, 189.0F, 94.5F, 189.0F);
      ((Path)localObject4).cubicTo(42.30909F, 189.0F, 0.0F, 146.69092F, 0.0F, 94.5F);
      ((Path)localObject4).cubicTo(0.0F, 42.30909F, 42.30909F, 0.0F, 94.5F, 0.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 44.5F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 0.8660254F, -0.5F, 46.363972F, 0.5F, 0.8660254F, 0.1238961F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.281093F, 17.051855F);
      ((Path)localObject1).cubicTo(14.281093F, 7.868282F, 21.725847F, 0.4235266F, 30.90942F, 0.4235266F);
      ((Path)localObject1).lineTo(30.909422F, 0.4235266F);
      ((Path)localObject1).cubicTo(40.092995F, 0.4235266F, 47.53775F, 7.868282F, 47.53775F, 17.051855F);
      ((Path)localObject1).lineTo(47.53775F, 43.997627F);
      ((Path)localObject1).cubicTo(47.53775F, 53.181198F, 40.092995F, 60.625954F, 30.909422F, 60.625954F);
      ((Path)localObject1).lineTo(30.90942F, 60.625954F);
      ((Path)localObject1).cubicTo(21.725847F, 60.625954F, 14.281093F, 53.181198F, 14.281093F, 43.997627F);
      ((Path)localObject1).lineTo(14.281093F, 17.051855F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(7.629761F, 33.86932F);
      ((Path)localObject2).lineTo(7.629761F, 44.035454F);
      ((Path)localObject2).cubicTo(7.629761F, 56.892452F, 18.05242F, 67.315109F, 30.90942F, 67.315109F);
      ((Path)localObject2).cubicTo(43.766418F, 67.315109F, 54.189079F, 56.892452F, 54.189079F, 44.035454F);
      ((Path)localObject2).lineTo(54.189079F, 33.86932F);
      ((Path)localObject2).lineTo(60.840408F, 33.86932F);
      ((Path)localObject2).lineTo(60.840408F, 44.07328F);
      ((Path)localObject2).cubicTo(60.840408F, 60.60371F, 47.43985F, 74.004272F, 30.90942F, 74.004272F);
      ((Path)localObject2).cubicTo(14.378991F, 74.004272F, 0.9784303F, 60.60371F, 0.9784303F, 44.07328F);
      ((Path)localObject2).lineTo(0.9784303F, 33.86932F);
      ((Path)localObject2).lineTo(7.629761F, 33.86932F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(27.583754F, 70.659691F);
      ((Path)localObject1).lineTo(34.235085F, 70.659691F);
      ((Path)localObject1).lineTo(34.235085F, 80.693428F);
      ((Path)localObject1).lineTo(27.583754F, 80.693428F);
      ((Path)localObject1).lineTo(27.583754F, 70.659691F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(27.583754F, 84.03801F);
      ((Path)localObject3).lineTo(34.235085F, 84.03801F);
      ((Path)localObject3).lineTo(31.560646F, 90.282692F);
      ((Path)localObject3).cubicTo(31.406612F, 90.642357F, 30.990179F, 90.809052F, 30.630516F, 90.655014F);
      ((Path)localObject3).cubicTo(30.463182F, 90.583351F, 30.329857F, 90.45002F, 30.258192F, 90.282692F);
      ((Path)localObject3).lineTo(27.583754F, 84.03801F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azw
 * JD-Core Version:    0.6.2
 */