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

public final class afc extends c
{
  private final int height = 70;
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
        paramInt = 70;
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
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 4.492257F);
      ((Path)localObject1).cubicTo(0.46F, 1.683729F, 3.04F, -0.3052276F, 5.88F, 0.04458893F);
      ((Path)localObject1).cubicTo(31.950001F, 0.02459941F, 58.02F, 0.03459417F, 84.089996F, 0.04458893F);
      ((Path)localObject1).cubicTo(86.849998F, -0.3152224F, 89.239998F, 1.543803F, 90.0F, 4.132445F);
      ((Path)localObject1).lineTo(90.0F, 61.532345F);
      ((Path)localObject1).cubicTo(89.599998F, 63.73119F, 88.0F, 65.330353F, 85.919998F, 66.0F);
      ((Path)localObject1).lineTo(4.35F, 66.0F);
      ((Path)localObject1).cubicTo(2.2F, 65.55024F, 0.66F, 63.941078F, 0.0F, 61.892155F);
      ((Path)localObject1).lineTo(0.0F, 4.492257F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(7.0F, 14.0F);
      ((Path)localObject1).lineTo(83.0F, 14.0F);
      ((Path)localObject1).lineTo(83.0F, 26.0F);
      ((Path)localObject1).lineTo(7.0F, 26.0F);
      ((Path)localObject1).lineTo(7.0F, 14.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afc
 * JD-Core Version:    0.6.2
 */