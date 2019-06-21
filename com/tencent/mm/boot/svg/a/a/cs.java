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

public final class cs extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-12566464);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.0F, 0.0F);
      ((Path)localObject1).lineTo(68.0F, 22.0F);
      ((Path)localObject1).lineTo(68.0F, 87.0F);
      ((Path)localObject1).cubicTo(68.0F, 88.656853F, 66.656853F, 90.0F, 65.0F, 90.0F);
      ((Path)localObject1).lineTo(3.0F, 90.0F);
      ((Path)localObject1).cubicTo(1.343146F, 90.0F, 2.029061E-016F, 88.656853F, 0.0F, 87.0F);
      ((Path)localObject1).lineTo(0.0F, 3.0F);
      ((Path)localObject1).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject1).lineTo(46.0F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-13421773);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(49.0F, 22.0F);
      ((Path)localObject2).cubicTo(47.343147F, 22.0F, 46.0F, 20.656855F, 46.0F, 19.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.5F, 42.200001F);
      ((Path)localObject1).cubicTo(14.5F, 41.537258F, 15.037258F, 41.0F, 15.7F, 41.0F);
      ((Path)localObject1).lineTo(52.299999F, 41.0F);
      ((Path)localObject1).cubicTo(52.962742F, 41.0F, 53.5F, 41.537258F, 53.5F, 42.200001F);
      ((Path)localObject1).lineTo(53.5F, 69.800003F);
      ((Path)localObject1).cubicTo(53.5F, 70.462738F, 52.962742F, 71.0F, 52.299999F, 71.0F);
      ((Path)localObject1).lineTo(15.7F, 71.0F);
      ((Path)localObject1).cubicTo(15.037258F, 71.0F, 14.5F, 70.462738F, 14.5F, 69.800003F);
      ((Path)localObject1).lineTo(14.5F, 42.200001F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(38.313942F, 56.624039F);
      ((Path)localObject1).cubicTo(38.396332F, 56.569111F, 38.46703F, 56.498413F, 38.521957F, 56.416023F);
      ((Path)localObject1).cubicTo(38.75172F, 56.071377F, 38.658588F, 55.605728F, 38.313942F, 55.375961F);
      ((Path)localObject1).lineTo(31.416025F, 50.777351F);
      ((Path)localObject1).cubicTo(31.292824F, 50.695217F, 31.148069F, 50.651386F, 31.0F, 50.651386F);
      ((Path)localObject1).cubicTo(30.585787F, 50.651386F, 30.25F, 50.987175F, 30.25F, 51.401386F);
      ((Path)localObject1).lineTo(30.25F, 60.598614F);
      ((Path)localObject1).cubicTo(30.25F, 60.746681F, 30.293829F, 60.891438F, 30.375963F, 61.014637F);
      ((Path)localObject1).cubicTo(30.605726F, 61.359283F, 31.071379F, 61.452415F, 31.416025F, 61.222649F);
      ((Path)localObject1).lineTo(38.313942F, 56.624039F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.5F, 45.5F);
      ((Path)localObject1).lineTo(17.5F, 48.5F);
      ((Path)localObject1).lineTo(22.0F, 48.5F);
      ((Path)localObject1).lineTo(22.0F, 45.5F);
      ((Path)localObject1).lineTo(17.5F, 45.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(46.0F, 45.5F);
      ((Path)localObject1).lineTo(46.0F, 48.5F);
      ((Path)localObject1).lineTo(50.5F, 48.5F);
      ((Path)localObject1).lineTo(50.5F, 45.5F);
      ((Path)localObject1).lineTo(46.0F, 45.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.5F, 51.5F);
      ((Path)localObject1).lineTo(17.5F, 54.5F);
      ((Path)localObject1).lineTo(22.0F, 54.5F);
      ((Path)localObject1).lineTo(22.0F, 51.5F);
      ((Path)localObject1).lineTo(17.5F, 51.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(46.0F, 51.5F);
      ((Path)localObject1).lineTo(46.0F, 54.5F);
      ((Path)localObject1).lineTo(50.5F, 54.5F);
      ((Path)localObject1).lineTo(50.5F, 51.5F);
      ((Path)localObject1).lineTo(46.0F, 51.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.5F, 57.5F);
      ((Path)localObject1).lineTo(17.5F, 60.5F);
      ((Path)localObject1).lineTo(22.0F, 60.5F);
      ((Path)localObject1).lineTo(22.0F, 57.5F);
      ((Path)localObject1).lineTo(17.5F, 57.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(46.0F, 57.5F);
      ((Path)localObject1).lineTo(46.0F, 60.5F);
      ((Path)localObject1).lineTo(50.5F, 60.5F);
      ((Path)localObject1).lineTo(50.5F, 57.5F);
      ((Path)localObject1).lineTo(46.0F, 57.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.5F, 63.5F);
      ((Path)localObject1).lineTo(17.5F, 66.5F);
      ((Path)localObject1).lineTo(22.0F, 66.5F);
      ((Path)localObject1).lineTo(22.0F, 63.5F);
      ((Path)localObject1).lineTo(17.5F, 63.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(46.0F, 63.5F);
      ((Path)localObject1).lineTo(46.0F, 66.5F);
      ((Path)localObject1).lineTo(50.5F, 66.5F);
      ((Path)localObject1).lineTo(50.5F, 63.5F);
      ((Path)localObject1).lineTo(46.0F, 63.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cs
 * JD-Core Version:    0.6.2
 */