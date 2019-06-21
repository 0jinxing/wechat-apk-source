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

public final class aql extends c
{
  private final int height = 64;
  private final int width = 64;

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
        paramInt = 64;
        continue;
        paramInt = 64;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-12082593);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(32.0F, 64.0F);
      ((Path)localObject).cubicTo(49.673111F, 64.0F, 64.0F, 49.673111F, 64.0F, 32.0F);
      ((Path)localObject).cubicTo(64.0F, 14.326888F, 49.673111F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject).cubicTo(14.326888F, 0.0F, 0.0F, 14.326888F, 0.0F, 32.0F);
      ((Path)localObject).cubicTo(0.0F, 49.673111F, 14.326888F, 64.0F, 32.0F, 64.0F);
      ((Path)localObject).lineTo(32.0F, 64.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.055362F, 31.019482F);
      ((Path)localObject).cubicTo(2.559515F, 38.257221F, 5.435425F, 45.386047F, 10.036881F, 50.881187F);
      ((Path)localObject).cubicTo(14.08299F, 46.574188F, 20.043064F, 45.029606F, 24.71394F, 41.613712F);
      ((Path)localObject).cubicTo(26.132061F, 40.73251F, 26.608074F, 38.811687F, 25.626297F, 37.415623F);
      ((Path)localObject).cubicTo(23.623077F, 34.207653F, 20.757084F, 31.088789F, 21.104177F, 27.009516F);
      ((Path)localObject).cubicTo(20.638081F, 20.05891F, 27.689018F, 13.524151F, 34.630871F, 15.623195F);
      ((Path)localObject).cubicTo(41.850395F, 17.464809F, 45.093235F, 26.979813F, 41.136379F, 33.078922F);
      ((Path)localObject).cubicTo(39.926514F, 35.425491F, 37.06052F, 37.475029F, 38.012543F, 40.415672F);
      ((Path)localObject).cubicTo(42.494999F, 45.019707F, 49.635189F, 46.009819F, 53.849884F, 51.0F);
      ((Path)localObject).cubicTo(60.008297F, 43.910778F, 62.497448F, 33.890816F, 60.097549F, 24.801559F);
      ((Path)localObject).cubicTo(57.16214F, 13.048896F, 46.144428F, 3.652706F, 33.946602F, 3.127945F);
      ((Path)localObject).cubicTo(18.218349F, 1.523959F, 3.015694F, 15.23705F, 3.055362F, 31.019482F);
      ((Path)localObject).lineTo(3.055362F, 31.019482F);
      ((Path)localObject).lineTo(3.055362F, 31.019482F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aql
 * JD-Core Version:    0.6.2
 */