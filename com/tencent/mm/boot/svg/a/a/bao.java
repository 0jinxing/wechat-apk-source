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

public final class bao extends c
{
  private final int height = 36;
  private final int width = 45;

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
        paramInt = 45;
        continue;
        paramInt = 36;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9205837);
      ((Paint)localObject2).setStrokeWidth(3.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 19.0F);
      ((Path)localObject1).lineTo(0.0F, 10.0F);
      ((Path)localObject1).lineTo(4.0F, 10.0F);
      ((Path)localObject1).cubicTo(4.0F, 10.0F, 6.220947F, 10.146362F, 7.607544F, 9.330322F);
      ((Path)localObject1).cubicTo(10.395386F, 7.628418F, 23.0F, 0.0F, 23.0F, 0.0F);
      ((Path)localObject1).lineTo(23.0F, 19.0F);
      ((Path)localObject1).lineTo(23.0F, 36.0F);
      ((Path)localObject1).cubicTo(23.0F, 36.0F, 10.395386F, 28.371582F, 7.607544F, 26.669678F);
      ((Path)localObject1).cubicTo(6.220947F, 25.853638F, 4.0F, 26.0F, 4.0F, 26.0F);
      ((Path)localObject1).lineTo(0.0F, 26.0F);
      ((Path)localObject1).lineTo(0.0F, 19.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9205837);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(28.0F, 8.608248F);
      ((Path)localObject1).cubicTo(31.119555F, 6.412371F, 34.228916F, 4.195876F, 37.338276F, 2.0F);
      ((Path)localObject1).cubicTo(37.888786F, 2.793814F, 38.44949F, 3.587629F, 39.0F, 4.371134F);
      ((Path)localObject1).cubicTo(35.880444F, 6.587629F, 32.760891F, 8.804124F, 29.641335F, 11.0F);
      ((Path)localObject1).cubicTo(29.223354F, 10.402061F, 28.407785F, 9.206185F, 28.0F, 8.608248F);
      ((Path)localObject1).lineTo(28.0F, 8.608248F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9205837);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(29.0F, 17.007513F);
      ((Path)localObject1).cubicTo(32.666668F, 16.997496F, 36.333332F, 16.997496F, 40.0F, 17.007513F);
      ((Path)localObject1).lineTo(40.0F, 19.992487F);
      ((Path)localObject1).cubicTo(36.333332F, 20.002504F, 32.666668F, 20.002504F, 29.0F, 19.992487F);
      ((Path)localObject1).lineTo(29.0F, 17.007513F);
      ((Path)localObject1).lineTo(29.0F, 17.007513F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-9205837);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(29.381166F, 26.0F);
      ((Path)localObject3).cubicTo(32.587444F, 27.870647F, 35.79372F, 29.731344F, 39.0F, 31.61194F);
      ((Path)localObject3).cubicTo(38.634979F, 32.208954F, 37.914799F, 33.402985F, 37.549774F, 34.0F);
      ((Path)localObject3).cubicTo(34.363228F, 32.159203F, 31.186546F, 30.298508F, 28.0F, 28.447762F);
      ((Path)localObject3).cubicTo(28.463676F, 27.631842F, 28.927355F, 26.81592F, 29.381166F, 26.0F);
      ((Path)localObject3).lineTo(29.381166F, 26.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bao
 * JD-Core Version:    0.6.2
 */