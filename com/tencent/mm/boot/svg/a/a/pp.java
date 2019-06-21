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

public final class pp extends c
{
  private final int height = 292;
  private final int width = 378;

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
        paramInt = 378;
        continue;
        paramInt = 292;
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
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-13158344);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.0F, 226.0F);
      ((Path)localObject1).lineTo(360.0F, 226.0F);
      ((Path)localObject1).lineTo(360.0F, 14.0F);
      ((Path)localObject1).lineTo(14.0F, 14.0F);
      ((Path)localObject1).lineTo(14.0F, 226.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.0F, 227.0F);
      ((Path)localObject1).lineTo(361.0F, 227.0F);
      ((Path)localObject1).lineTo(361.0F, 13.0F);
      ((Path)localObject1).lineTo(13.0F, 13.0F);
      ((Path)localObject1).lineTo(13.0F, 227.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(371.00021F, 225.99319F);
      ((Path)localObject3).cubicTo(371.00021F, 232.06219F, 366.0632F, 237.0002F, 359.99319F, 237.0002F);
      ((Path)localObject3).lineTo(206.0002F, 237.0002F);
      ((Path)localObject3).lineTo(206.0002F, 237.0002F);
      ((Path)localObject3).lineTo(168.0002F, 237.0002F);
      ((Path)localObject3).lineTo(168.0002F, 237.0002F);
      ((Path)localObject3).lineTo(14.0062F, 237.0002F);
      ((Path)localObject3).cubicTo(7.9382F, 237.0002F, 3.0002F, 232.06219F, 3.0002F, 225.99319F);
      ((Path)localObject3).lineTo(3.0002F, 14.0072F);
      ((Path)localObject3).cubicTo(3.0002F, 7.9372F, 7.9382F, 3.0002F, 14.0062F, 3.0002F);
      ((Path)localObject3).lineTo(359.99319F, 3.0002F);
      ((Path)localObject3).cubicTo(366.0632F, 3.0002F, 371.00021F, 7.9372F, 371.00021F, 14.0072F);
      ((Path)localObject3).lineTo(371.00021F, 225.99319F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(256.00021F, 278.73019F);
      ((Path)localObject3).lineTo(256.00021F, 284.00021F);
      ((Path)localObject3).lineTo(118.0002F, 284.00021F);
      ((Path)localObject3).lineTo(118.0002F, 278.73019F);
      ((Path)localObject3).lineTo(171.0002F, 273.73019F);
      ((Path)localObject3).lineTo(171.0002F, 240.0002F);
      ((Path)localObject3).lineTo(203.0002F, 240.0002F);
      ((Path)localObject3).lineTo(203.0002F, 273.73019F);
      ((Path)localObject3).lineTo(256.00021F, 278.73019F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(359.99319F, 0.0002F);
      ((Path)localObject3).lineTo(14.0072F, 0.0002F);
      ((Path)localObject3).cubicTo(6.2762F, 0.0002F, 0.0002F, 6.2712F, 0.0002F, 14.0072F);
      ((Path)localObject3).lineTo(0.0002F, 225.99319F);
      ((Path)localObject3).cubicTo(0.0002F, 233.73421F, 6.2712F, 240.0002F, 14.0072F, 240.0002F);
      ((Path)localObject3).lineTo(168.0002F, 240.0002F);
      ((Path)localObject3).lineTo(168.0002F, 271.00021F);
      ((Path)localObject3).lineTo(115.0002F, 276.00021F);
      ((Path)localObject3).lineTo(115.0002F, 287.00021F);
      ((Path)localObject3).lineTo(259.00021F, 287.00021F);
      ((Path)localObject3).lineTo(259.00021F, 276.00021F);
      ((Path)localObject3).lineTo(206.0002F, 271.00021F);
      ((Path)localObject3).lineTo(206.0002F, 240.0002F);
      ((Path)localObject3).lineTo(359.99319F, 240.0002F);
      ((Path)localObject3).cubicTo(367.72421F, 240.0002F, 374.00021F, 233.7292F, 374.00021F, 225.99319F);
      ((Path)localObject3).lineTo(374.00021F, 14.0072F);
      ((Path)localObject3).cubicTo(374.00021F, 6.2652F, 367.72919F, 0.0002F, 359.99319F, 0.0002F);
      ((Path)localObject3).lineTo(359.99319F, 0.0002F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.pp
 * JD-Core Version:    0.6.2
 */