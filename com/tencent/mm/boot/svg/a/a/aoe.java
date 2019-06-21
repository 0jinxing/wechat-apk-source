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

public final class aoe extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-13421773);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 48.0F, 0.0F, 1.0F, 48.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 15.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(28.1486F, 43.851398F);
      ((Path)localObject).cubicTo(35.633141F, 51.335941F, 42.724827F, 54.846451F, 45.347363F, 54.640877F);
      ((Path)localObject).cubicTo(47.969898F, 54.435303F, 54.500744F, 49.944027F, 57.583836F, 50.003807F);
      ((Path)localObject).cubicTo(59.065594F, 50.032539F, 68.748444F, 56.581047F, 69.920547F, 57.338161F);
      ((Path)localObject).cubicTo(71.092659F, 58.095276F, 72.179466F, 58.979683F, 71.975105F, 60.098808F);
      ((Path)localObject).cubicTo(71.770752F, 61.217937F, 67.515251F, 73.545105F, 56.65097F, 71.838074F);
      ((Path)localObject).cubicTo(45.786686F, 70.131042F, 30.640358F, 58.419163F, 22.009607F, 49.990391F);
      ((Path)localObject).lineTo(28.1486F, 43.851398F);
      ((Path)localObject).lineTo(28.1486F, 43.851398F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(28.1486F, 43.851398F);
      ((Path)localObject).cubicTo(20.664061F, 36.366859F, 17.153549F, 29.275175F, 17.359123F, 26.652639F);
      ((Path)localObject).cubicTo(17.564697F, 24.030104F, 22.055973F, 17.499258F, 21.996193F, 14.416165F);
      ((Path)localObject).cubicTo(21.967463F, 12.934404F, 15.418953F, 3.251558F, 14.661838F, 2.079449F);
      ((Path)localObject).cubicTo(13.904722F, 0.9073399F, 13.020318F, -0.1794644F, 11.901191F, 0.02489144F);
      ((Path)localObject).cubicTo(10.782063F, 0.2292473F, -1.545103F, 4.484747F, 0.1619265F, 15.34903F);
      ((Path)localObject).cubicTo(1.868956F, 26.213312F, 13.580837F, 41.359642F, 22.009607F, 49.990391F);
      ((Path)localObject).lineTo(28.1486F, 43.851398F);
      ((Path)localObject).lineTo(28.1486F, 43.851398F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aoe
 * JD-Core Version:    0.6.2
 */