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

public final class kk extends c
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
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8683387);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(53.089928F, 45.616577F);
      ((Path)localObject).lineTo(53.623455F, 47.162701F);
      ((Path)localObject).cubicTo(53.623455F, 47.162701F, 53.01152F, 44.282021F, 54.975307F, 42.670761F);
      ((Path)localObject).cubicTo(54.863106F, 42.752514F, 54.75811F, 42.829773F, 54.656723F, 42.905239F);
      ((Path)localObject).lineTo(73.0F, 26.948959F);
      ((Path)localObject).lineTo(48.666668F, 26.948959F);
      ((Path)localObject).cubicTo(48.666668F, 26.948959F, 45.512344F, 26.898201F, 45.061729F, 24.253796F);
      ((Path)localObject).cubicTo(45.0784F, 24.353516F, 45.093723F, 24.444702F, 45.109043F, 24.537237F);
      ((Path)localObject).lineTo(36.420692F, 0.0F);
      ((Path)localObject).lineTo(27.904024F, 24.459076F);
      ((Path)localObject).cubicTo(27.915741F, 24.39035F, 27.926556F, 24.326115F, 27.938272F, 24.253796F);
      ((Path)localObject).cubicTo(27.916191F, 24.383163F, 27.882845F, 24.501301F, 27.848598F, 24.61854F);
      ((Path)localObject).lineTo(27.758926F, 24.875479F);
      ((Path)localObject).cubicTo(26.960882F, 26.899998F, 24.333334F, 26.948959F, 24.333334F, 26.948959F);
      ((Path)localObject).lineTo(0.0F, 26.948959F);
      ((Path)localObject).lineTo(18.472155F, 43.11681F);
      ((Path)localObject).cubicTo(19.523445F, 44.343559F, 19.512178F, 45.986263F, 19.435574F, 46.744949F);
      ((Path)localObject).lineTo(11.566444F, 71.872879F);
      ((Path)localObject).lineTo(34.679054F, 56.182972F);
      ((Path)localObject).lineTo(34.246914F, 56.595779F);
      ((Path)localObject).cubicTo(34.246914F, 56.595779F, 36.448177F, 54.918938F, 38.753086F, 56.595779F);
      ((Path)localObject).cubicTo(38.745876F, 56.588593F, 38.740017F, 56.583202F, 38.732807F, 56.575569F);
      ((Path)localObject).lineTo(61.149216F, 72.0F);
      ((Path)localObject).lineTo(53.089928F, 45.616577F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.kk
 * JD-Core Version:    0.6.2
 */