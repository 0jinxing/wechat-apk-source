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

public final class ec extends c
{
  private final int height = 58;
  private final int width = 58;

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
        paramInt = 58;
        continue;
        paramInt = 58;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, -249.0F, 0.0F, 1.0F, -79.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((float[])localObject3, 0.7071068F, 0.7071068F, 4.642571F, -0.7071068F, 0.7071068F, 229.20816F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(277.0F, 118.906F);
      ((Path)localObject1).lineTo(277.0F, 141.0F);
      ((Path)localObject1).lineTo(283.0F, 141.0F);
      ((Path)localObject1).lineTo(283.0F, 118.61951F);
      ((Path)localObject1).cubicTo(292.68488F, 116.75179F, 300.0F, 108.23016F, 300.0F, 98.0F);
      ((Path)localObject1).cubicTo(300.0F, 86.402023F, 290.59799F, 77.0F, 279.0F, 77.0F);
      ((Path)localObject1).cubicTo(267.40201F, 77.0F, 258.0F, 86.402023F, 258.0F, 98.0F);
      ((Path)localObject1).cubicTo(258.0F, 108.92341F, 266.34015F, 117.89888F, 277.0F, 118.906F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(279.0F, 113.0F);
      ((Path)localObject1).cubicTo(287.28427F, 113.0F, 294.0F, 106.28427F, 294.0F, 98.0F);
      ((Path)localObject1).cubicTo(294.0F, 89.715729F, 287.28427F, 83.0F, 279.0F, 83.0F);
      ((Path)localObject1).cubicTo(270.71573F, 83.0F, 264.0F, 89.715729F, 264.0F, 98.0F);
      ((Path)localObject1).cubicTo(264.0F, 106.28427F, 270.71573F, 113.0F, 279.0F, 113.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ec
 * JD-Core Version:    0.6.2
 */