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

public final class vi extends c
{
  private final int height = 68;
  private final int width = 68;

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
        paramInt = 68;
        continue;
        paramInt = 68;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.133333F, 0.0F, 0.0F, 0.0F, 1.133333F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(24.0F, 6.0F);
      ((Path)localObject).lineTo(24.0F, 13.582962F);
      ((Path)localObject).cubicTo(24.0F, 16.068243F, 26.014719F, 18.082962F, 28.5F, 18.082962F);
      ((Path)localObject).cubicTo(30.985281F, 18.082962F, 33.0F, 16.068243F, 33.0F, 13.582962F);
      ((Path)localObject).lineTo(33.0F, 6.0F);
      ((Path)localObject).cubicTo(36.547421F, 7.710701F, 39.0F, 11.381189F, 39.0F, 15.633177F);
      ((Path)localObject).cubicTo(39.0F, 19.693186F, 36.763893F, 23.223017F, 33.473682F, 25.022778F);
      ((Path)localObject).lineTo(33.473682F, 49.026318F);
      ((Path)localObject).cubicTo(33.473682F, 51.773205F, 31.246889F, 54.0F, 28.5F, 54.0F);
      ((Path)localObject).cubicTo(25.753111F, 54.0F, 23.526316F, 51.773205F, 23.526316F, 49.026318F);
      ((Path)localObject).lineTo(23.526316F, 25.022778F);
      ((Path)localObject).cubicTo(20.236107F, 23.223017F, 18.0F, 19.693186F, 18.0F, 15.633177F);
      ((Path)localObject).cubicTo(18.0F, 11.381189F, 20.452579F, 7.710701F, 24.0F, 6.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vi
 * JD-Core Version:    0.6.2
 */