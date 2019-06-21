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

public final class gx extends c
{
  private final int height = 168;
  private final int width = 168;

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
        paramInt = 168;
        continue;
        paramInt = 168;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-2500135);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(168.0F, 0.0F);
      ((Path)localObject3).lineTo(168.0F, 168.0F);
      ((Path)localObject3).lineTo(0.0F, 168.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(3.0F, 3.0F);
      ((Path)localObject3).lineTo(3.0F, 165.0F);
      ((Path)localObject3).lineTo(165.0F, 165.0F);
      ((Path)localObject3).lineTo(165.0F, 3.0F);
      ((Path)localObject3).lineTo(3.0F, 3.0F);
      ((Path)localObject3).lineTo(3.0F, 3.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-4539718);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 33.0F, 0.0F, 1.0F, 33.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(56.0F, 0.0F);
      ((Path)localObject2).lineTo(56.0F, 46.0F);
      ((Path)localObject2).lineTo(102.0F, 46.0F);
      ((Path)localObject2).lineTo(102.0F, 56.0F);
      ((Path)localObject2).lineTo(56.0F, 56.0F);
      ((Path)localObject2).lineTo(56.0F, 102.0F);
      ((Path)localObject2).lineTo(46.0F, 102.0F);
      ((Path)localObject2).lineTo(46.0F, 56.0F);
      ((Path)localObject2).lineTo(0.0F, 56.0F);
      ((Path)localObject2).lineTo(0.0F, 46.0F);
      ((Path)localObject2).lineTo(46.0F, 46.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gx
 * JD-Core Version:    0.6.2
 */