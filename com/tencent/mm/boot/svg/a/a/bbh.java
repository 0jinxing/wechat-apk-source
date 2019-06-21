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

public final class bbh extends c
{
  private final int height = 16;
  private final int width = 16;

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
        paramInt = 16;
        continue;
        paramInt = 16;
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
      localPaint1.setColor(-5066062);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -72.0F, 0.0F, 1.0F, -603.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 66.0F, 0.0F, 1.0F, 602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 5.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(7.5F, 14.1F);
      ((Path)localObject2).cubicTo(11.14508F, 14.1F, 14.1F, 11.14508F, 14.1F, 7.5F);
      ((Path)localObject2).cubicTo(14.1F, 3.854921F, 11.14508F, 0.9F, 7.5F, 0.9F);
      ((Path)localObject2).cubicTo(3.854921F, 0.9F, 0.9F, 3.854921F, 0.9F, 7.5F);
      ((Path)localObject2).cubicTo(0.9F, 11.14508F, 3.854921F, 14.1F, 7.5F, 14.1F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(7.5F, 15.0F);
      ((Path)localObject2).cubicTo(3.357864F, 15.0F, 0.0F, 11.642136F, 0.0F, 7.5F);
      ((Path)localObject2).cubicTo(0.0F, 3.357864F, 3.357864F, 0.0F, 7.5F, 0.0F);
      ((Path)localObject2).cubicTo(11.642136F, 0.0F, 15.0F, 3.357864F, 15.0F, 7.5F);
      ((Path)localObject2).cubicTo(15.0F, 11.642136F, 11.642136F, 15.0F, 7.5F, 15.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(7.5F, 11.475F);
      ((Path)localObject1).cubicTo(9.177456F, 11.475F, 10.586946F, 10.327704F, 10.986585F, 8.775F);
      ((Path)localObject1).lineTo(4.013416F, 8.775F);
      ((Path)localObject1).cubicTo(4.413055F, 10.327704F, 5.822545F, 11.475F, 7.5F, 11.475F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(3.0F, 7.875F);
      ((Path)localObject1).lineTo(12.0F, 7.875F);
      ((Path)localObject1).cubicTo(12.0F, 10.360281F, 9.985281F, 12.375F, 7.5F, 12.375F);
      ((Path)localObject1).cubicTo(5.014719F, 12.375F, 3.0F, 10.360281F, 3.0F, 7.875F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.875F, 6.375F);
      ((Path)localObject1).cubicTo(4.25368F, 6.375F, 3.75F, 5.87132F, 3.75F, 5.25F);
      ((Path)localObject1).cubicTo(3.75F, 4.62868F, 4.25368F, 4.125F, 4.875F, 4.125F);
      ((Path)localObject1).cubicTo(5.49632F, 4.125F, 6.0F, 4.62868F, 6.0F, 5.25F);
      ((Path)localObject1).cubicTo(6.0F, 5.87132F, 5.49632F, 6.375F, 4.875F, 6.375F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(10.125F, 6.375F);
      ((Path)localObject1).cubicTo(9.503679F, 6.375F, 9.0F, 5.87132F, 9.0F, 5.25F);
      ((Path)localObject1).cubicTo(9.0F, 4.62868F, 9.503679F, 4.125F, 10.125F, 4.125F);
      ((Path)localObject1).cubicTo(10.746321F, 4.125F, 11.25F, 4.62868F, 11.25F, 5.25F);
      ((Path)localObject1).cubicTo(11.25F, 5.87132F, 10.746321F, 6.375F, 10.125F, 6.375F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbh
 * JD-Core Version:    0.6.2
 */