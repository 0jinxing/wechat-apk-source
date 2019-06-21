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

public final class aco extends c
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(3.6F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1.8F, 18.004917F);
      ((Path)localObject2).lineTo(1.8F, 54.001087F);
      ((Path)localObject2).cubicTo(1.8F, 56.322994F, 3.68056F, 58.200001F, 6.006387F, 58.200001F);
      ((Path)localObject2).lineTo(41.993614F, 58.200001F);
      ((Path)localObject2).cubicTo(44.320652F, 58.200001F, 46.200001F, 56.321777F, 46.200001F, 54.001087F);
      ((Path)localObject2).lineTo(46.200001F, 18.004917F);
      ((Path)localObject2).cubicTo(46.200001F, 17.339945F, 45.660645F, 16.799999F, 44.997383F, 16.799999F);
      ((Path)localObject2).lineTo(3.002615F, 16.799999F);
      ((Path)localObject2).cubicTo(2.332884F, 16.799999F, 1.8F, 17.334574F, 1.8F, 18.004917F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(12.0F, 12.0F);
      ((Path)localObject3).cubicTo(12.0F, 5.372583F, 17.372583F, 0.0F, 24.0F, 0.0F);
      ((Path)localObject3).cubicTo(30.627417F, 0.0F, 36.0F, 5.372583F, 36.0F, 12.0F);
      ((Path)localObject3).lineTo(35.999996F, 27.0F);
      ((Path)localObject3).lineTo(32.399998F, 27.0F);
      ((Path)localObject3).lineTo(32.399998F, 12.0F);
      ((Path)localObject3).cubicTo(32.39999F, 7.360799F, 28.639183F, 3.599991F, 23.99999F, 3.599991F);
      ((Path)localObject3).cubicTo(19.3608F, 3.599991F, 15.599991F, 7.360799F, 15.599991F, 11.99999F);
      ((Path)localObject3).lineTo(15.6F, 27.0F);
      ((Path)localObject3).lineTo(12.0F, 27.0F);
      ((Path)localObject3).lineTo(12.0F, 12.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aco
 * JD-Core Version:    0.6.2
 */