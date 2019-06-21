package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class anh extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint2.setColor(-1);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(16.0F, 29.0F);
      ((Path)localObject).cubicTo(17.726973F, 27.70042F, 19.455055F, 28.159777F, 21.0F, 28.0F);
      ((Path)localObject).cubicTo(34.0089F, 28.089874F, 47.05442F, 27.920113F, 60.0F, 28.0F);
      ((Path)localObject).cubicTo(62.067753F, 27.960056F, 63.226467F, 30.137007F, 63.0F, 32.0F);
      ((Path)localObject).cubicTo(62.976746F, 42.619518F, 62.966755F, 53.34449F, 63.0F, 64.0F);
      ((Path)localObject).cubicTo(63.246445F, 65.83699F, 62.057766F, 68.023926F, 60.0F, 68.0F);
      ((Path)localObject).cubicTo(46.335217F, 68.023926F, 32.600464F, 67.944038F, 19.0F, 68.0F);
      ((Path)localObject).cubicTo(17.10766F, 68.253601F, 14.970034F, 67.065269F, 15.0F, 65.0F);
      ((Path)localObject).cubicTo(14.920089F, 54.383034F, 15.0899F, 43.678036F, 15.0F, 33.0F);
      ((Path)localObject).cubicTo(15.059934F, 31.435186F, 14.790233F, 29.447971F, 16.0F, 29.0F);
      ((Path)localObject).lineTo(16.0F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(66.0F, 41.0F);
      ((Path)localObject).cubicTo(71.038727F, 37.01664F, 75.738205F, 32.185577F, 81.0F, 28.0F);
      ((Path)localObject).cubicTo(82.33345F, 30.067574F, 81.934341F, 32.589008F, 82.0F, 35.0F);
      ((Path)localObject).cubicTo(81.944321F, 44.712051F, 81.974251F, 54.505295F, 82.0F, 64.0F);
      ((Path)localObject).cubicTo(82.004189F, 65.629852F, 81.664948F, 66.860313F, 81.0F, 68.0F);
      ((Path)localObject).cubicTo(75.718254F, 63.824509F, 71.018768F, 58.993443F, 66.0F, 55.0F);
      ((Path)localObject).lineTo(66.0F, 41.0F);
      ((Path)localObject).lineTo(66.0F, 41.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anh
 * JD-Core Version:    0.6.2
 */