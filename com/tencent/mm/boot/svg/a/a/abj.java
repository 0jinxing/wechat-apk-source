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

public final class abj extends c
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
      ((Paint)localObject3).setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(30.0F, 56.400002F);
      ((Path)localObject1).cubicTo(44.580318F, 56.400002F, 56.400002F, 44.580318F, 56.400002F, 30.0F);
      ((Path)localObject1).cubicTo(56.400002F, 15.419683F, 44.580318F, 3.6F, 30.0F, 3.6F);
      ((Path)localObject1).cubicTo(15.419683F, 3.6F, 3.6F, 15.419683F, 3.6F, 30.0F);
      ((Path)localObject1).cubicTo(3.6F, 44.580318F, 15.419683F, 56.400002F, 30.0F, 56.400002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(30.0F, 60.0F);
      ((Path)localObject1).cubicTo(13.431458F, 60.0F, 0.0F, 46.568542F, 0.0F, 30.0F);
      ((Path)localObject1).cubicTo(0.0F, 13.431458F, 13.431458F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject1).cubicTo(46.568542F, 0.0F, 60.0F, 13.431458F, 60.0F, 30.0F);
      ((Path)localObject1).cubicTo(60.0F, 46.568542F, 46.568542F, 60.0F, 30.0F, 60.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(30.0F, 45.900002F);
      ((Path)localObject1).cubicTo(36.709824F, 45.900002F, 42.347782F, 41.310818F, 43.946339F, 35.099998F);
      ((Path)localObject1).lineTo(16.053663F, 35.099998F);
      ((Path)localObject1).cubicTo(17.652218F, 41.310818F, 23.290178F, 45.900002F, 30.0F, 45.900002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(12.0F, 31.5F);
      ((Path)localObject1).lineTo(48.0F, 31.5F);
      ((Path)localObject1).cubicTo(48.0F, 41.441124F, 39.941124F, 49.5F, 30.0F, 49.5F);
      ((Path)localObject1).cubicTo(20.058874F, 49.5F, 12.0F, 41.441124F, 12.0F, 31.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(19.5F, 25.5F);
      ((Path)localObject3).cubicTo(17.014719F, 25.5F, 15.0F, 23.485281F, 15.0F, 21.0F);
      ((Path)localObject3).cubicTo(15.0F, 18.514719F, 17.014719F, 16.5F, 19.5F, 16.5F);
      ((Path)localObject3).cubicTo(21.985281F, 16.5F, 24.0F, 18.514719F, 24.0F, 21.0F);
      ((Path)localObject3).cubicTo(24.0F, 23.485281F, 21.985281F, 25.5F, 19.5F, 25.5F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(40.5F, 25.5F);
      ((Path)localObject3).cubicTo(38.014717F, 25.5F, 36.0F, 23.485281F, 36.0F, 21.0F);
      ((Path)localObject3).cubicTo(36.0F, 18.514719F, 38.014717F, 16.5F, 40.5F, 16.5F);
      ((Path)localObject3).cubicTo(42.985283F, 16.5F, 45.0F, 18.514719F, 45.0F, 21.0F);
      ((Path)localObject3).cubicTo(45.0F, 23.485281F, 42.985283F, 25.5F, 40.5F, 25.5F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abj
 * JD-Core Version:    0.6.2
 */