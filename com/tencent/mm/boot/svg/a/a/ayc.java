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

public final class ayc extends c
{
  private final int height = 50;
  private final int width = 50;

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
        paramInt = 50;
        continue;
        paramInt = 50;
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
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      Object localObject4 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject3 = c.a((float[])localObject2, 0.8910065F, 0.4539905F, -8.881499F, 0.4539905F, -0.8910065F, 36.994106F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(25.83573F, 29.0F);
      ((Path)localObject2).cubicTo(26.399111F, 31.619719F, 27.385025F, 33.732395F, 28.793476F, 35.422535F);
      ((Path)localObject2).cubicTo(29.075167F, 35.84507F, 29.356857F, 36.267605F, 29.638548F, 36.549297F);
      ((Path)localObject2).cubicTo(31.046997F, 37.957745F, 33.018829F, 38.943661F, 35.131504F, 39.0F);
      ((Path)localObject2).lineTo(38.793476F, 39.0F);
      ((Path)localObject2).cubicTo(41.187843F, 38.802818F, 43.300518F, 37.676056F, 44.568123F, 35.84507F);
      ((Path)localObject2).cubicTo(45.27235F, 34.859154F, 45.835732F, 33.591549F, 45.976574F, 32.323944F);
      ((Path)localObject2).lineTo(45.976574F, 30.774649F);
      ((Path)localObject2).cubicTo(45.976574F, 28.802816F, 45.694885F, 26.97183F, 45.131504F, 25.140844F);
      ((Path)localObject2).cubicTo(44.990658F, 24.718309F, 44.849815F, 24.295774F, 44.708969F, 23.732395F);
      ((Path)localObject2).cubicTo(44.286434F, 22.183098F, 44.145588F, 20.492958F, 44.145588F, 18.943663F);
      ((Path)localObject2).cubicTo(44.145588F, 18.239437F, 44.286434F, 16.830986F, 44.286434F, 16.830986F);
      ((Path)localObject2).cubicTo(44.42728F, 15.845071F, 43.723053F, 15.0F, 42.737137F, 15.0F);
      ((Path)localObject2).cubicTo(42.032913F, 15.0F, 41.187843F, 15.56338F, 40.765308F, 16.12676F);
      ((Path)localObject2).cubicTo(39.920238F, 16.97183F, 39.497704F, 18.098591F, 39.497704F, 19.225351F);
      ((Path)localObject2).lineTo(39.497704F, 22.746479F);
      ((Path)localObject2).lineTo(39.497704F, 23.169014F);
      ((Path)localObject2).cubicTo(39.356857F, 24.295774F, 38.370941F, 25.0F, 37.244183F, 25.0F);
      ((Path)localObject2).lineTo(17.976576F, 25.0F);
      ((Path)localObject2).cubicTo(16.872005F, 25.0F, 15.976575F, 25.89543F, 15.976575F, 27.0F);
      ((Path)localObject2).cubicTo(15.976575F, 28.10457F, 16.872005F, 29.0F, 17.976576F, 29.0F);
      ((Path)localObject2).lineTo(25.83573F, 29.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 0.7660444F, 0.6427876F, -14.573307F, -0.6427876F, 0.7660444F, 12.015224F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(-1.861548F, 39.610298F);
      ((Path)localObject4).cubicTo(2.055231F, 31.076334F, 14.849355F, 15.051029F, 20.299797F, 12.444754F);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject2 = c.a((float[])localObject3, 0.9271839F, 0.3746066F, -4.2529F, -0.3746066F, 0.9271839F, 3.769188F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.540471F, 13.01096F);
      ((Path)localObject1).lineTo(10.597422F, 8.574231F);
      ((Path)localObject1).lineTo(12.597422F, 17.074232F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayc
 * JD-Core Version:    0.6.2
 */