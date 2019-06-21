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

public final class ant extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-13421773);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 48.0F, 0.0F, 1.0F, 48.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(3.002084F, 68.210526F);
      ((Path)localObject).cubicTo(1.344079F, 68.210526F, 2.12813E-014F, 66.872337F, 1.425136E-014F, 65.205696F);
      ((Path)localObject).lineTo(0.0F, 61.827019F);
      ((Path)localObject).cubicTo(-1.178005E-014F, 59.230892F, 1.88773F, 56.205124F, 4.221844F, 55.066101F);
      ((Path)localObject).lineTo(25.671602F, 44.598858F);
      ((Path)localObject).cubicTo(28.782482F, 43.080784F, 29.505823F, 39.718468F, 27.259371F, 37.055893F);
      ((Path)localObject).lineTo(25.889353F, 35.432102F);
      ((Path)localObject).cubicTo(23.101835F, 32.128239F, 20.842106F, 25.955986F, 20.842106F, 21.635206F);
      ((Path)localObject).lineTo(20.842106F, 15.156304F);
      ((Path)localObject).cubicTo(20.842106F, 6.785709F, 27.645559F, 0.0F, 36.0F, 0.0F);
      ((Path)localObject).cubicTo(44.371475F, 0.0F, 51.157894F, 6.794451F, 51.157894F, 15.158681F);
      ((Path)localObject).lineTo(51.157894F, 21.638597F);
      ((Path)localObject).cubicTo(51.157894F, 25.955227F, 48.887745F, 32.145576F, 46.110645F, 35.437538F);
      ((Path)localObject).lineTo(44.740627F, 37.061554F);
      ((Path)localObject).cubicTo(42.506649F, 39.709709F, 43.204502F, 43.080242F, 46.328396F, 44.604038F);
      ((Path)localObject).lineTo(67.77816F, 55.066956F);
      ((Path)localObject).cubicTo(70.109818F, 56.204308F, 72.0F, 59.21117F, 72.0F, 61.827019F);
      ((Path)localObject).lineTo(72.0F, 65.205696F);
      ((Path)localObject).cubicTo(72.0F, 66.865219F, 70.657593F, 68.210526F, 68.997917F, 68.210526F);
      ((Path)localObject).lineTo(3.002084F, 68.210526F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ant
 * JD-Core Version:    0.6.2
 */