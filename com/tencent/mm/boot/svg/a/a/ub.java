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

public final class ub extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.6F, 3.6F);
      ((Path)localObject1).lineTo(3.6F, 44.400002F);
      ((Path)localObject1).lineTo(56.400002F, 44.400002F);
      ((Path)localObject1).lineTo(56.400002F, 8.1F);
      ((Path)localObject1).lineTo(24.612188F, 8.1F);
      ((Path)localObject1).lineTo(18.987188F, 3.6F);
      ((Path)localObject1).lineTo(3.6F, 3.6F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(3.0F, 0.0F);
      ((Path)localObject1).lineTo(20.25F, 0.0F);
      ((Path)localObject1).lineTo(25.875F, 4.5F);
      ((Path)localObject1).lineTo(57.0F, 4.5F);
      ((Path)localObject1).cubicTo(58.656853F, 4.5F, 60.0F, 5.843146F, 60.0F, 7.5F);
      ((Path)localObject1).lineTo(60.0F, 45.0F);
      ((Path)localObject1).cubicTo(60.0F, 46.656853F, 58.656853F, 48.0F, 57.0F, 48.0F);
      ((Path)localObject1).lineTo(3.0F, 48.0F);
      ((Path)localObject1).cubicTo(1.343146F, 48.0F, 2.029061E-016F, 46.656853F, 0.0F, 45.0F);
      ((Path)localObject1).lineTo(0.0F, 3.0F);
      ((Path)localObject1).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 12.0F);
      ((Path)localObject1).lineTo(60.0F, 12.0F);
      ((Path)localObject1).lineTo(60.0F, 15.6F);
      ((Path)localObject1).lineTo(0.0F, 15.6F);
      ((Path)localObject1).lineTo(0.0F, 12.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ub
 * JD-Core Version:    0.6.2
 */