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

public final class axp extends c
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
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 76, 4);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(48.757702F, 15.974849F);
      ((Path)localObject).lineTo(27.774939F, 3.734904F);
      ((Path)localObject).cubicTo(27.466654F, 3.555071F, 26.53348F, 3.554993F, 26.225061F, 3.734904F);
      ((Path)localObject).lineTo(5.2423F, 15.974849F);
      ((Path)localObject).lineTo(27.0F, 28.536663F);
      ((Path)localObject).lineTo(48.757702F, 15.974849F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.400002F, 19.183588F);
      ((Path)localObject).lineTo(28.799999F, 31.654354F);
      ((Path)localObject).lineTo(28.799999F, 56.897388F);
      ((Path)localObject).lineTo(49.597191F, 44.765697F);
      ((Path)localObject).cubicTo(49.920998F, 44.576809F, 50.400002F, 43.743988F, 50.400002F, 43.37328F);
      ((Path)localObject).lineTo(50.400002F, 19.183588F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.6F, 19.183588F);
      ((Path)localObject).lineTo(3.6F, 43.37328F);
      ((Path)localObject).cubicTo(3.6F, 43.736622F, 4.083672F, 44.579533F, 4.402809F, 44.765697F);
      ((Path)localObject).lineTo(25.200001F, 56.897388F);
      ((Path)localObject).lineTo(25.200001F, 31.654354F);
      ((Path)localObject).lineTo(3.6F, 19.183588F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.411127F, 0.6252996F);
      ((Path)localObject).cubicTo(25.840921F, -0.2087476F, 28.160156F, -0.2081187F, 29.588873F, 0.6252996F);
      ((Path)localObject).lineTo(51.411125F, 13.354947F);
      ((Path)localObject).cubicTo(52.840923F, 14.188994F, 54.0F, 16.218639F, 54.0F, 17.856966F);
      ((Path)localObject).lineTo(54.0F, 43.37328F);
      ((Path)localObject).cubicTo(54.0F, 45.025631F, 52.839844F, 47.041882F, 51.411125F, 47.875301F);
      ((Path)localObject).lineTo(29.588873F, 60.604946F);
      ((Path)localObject).cubicTo(28.159079F, 61.438995F, 25.839844F, 61.438366F, 24.411127F, 60.604946F);
      ((Path)localObject).lineTo(2.588874F, 47.875301F);
      ((Path)localObject).cubicTo(1.159078F, 47.041252F, 0.0F, 45.011608F, 0.0F, 43.37328F);
      ((Path)localObject).lineTo(0.0F, 17.856966F);
      ((Path)localObject).cubicTo(0.0F, 16.204617F, 1.160156F, 14.188366F, 2.588874F, 13.354947F);
      ((Path)localObject).lineTo(24.411127F, 0.6252996F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.axp
 * JD-Core Version:    0.6.2
 */