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

public final class ar extends c
{
  private final int height = 16;
  private final int width = 28;

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
        paramInt = 28;
        continue;
        paramInt = 16;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-3355444);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(13.962992F, 10.188502F);
      ((Path)localObject).cubicTo(13.08834F, 9.283867F, 12.178382F, 8.349955F, 11.50355F, 7.675123F);
      ((Path)localObject).lineTo(3.828427F, 8.881784E-016F);
      ((Path)localObject).lineTo(1.0F, 2.828427F);
      ((Path)localObject).lineTo(13.961679F, 15.961207F);
      ((Path)localObject).lineTo(13.994814F, 15.928072F);
      ((Path)localObject).lineTo(14.008518F, 15.941776F);
      ((Path)localObject).lineTo(15.711977F, 14.210909F);
      ((Path)localObject).lineTo(16.790106F, 13.13278F);
      ((Path)localObject).cubicTo(16.790106F, 13.13278F, 16.787266F, 13.1298F, 16.781706F, 13.123969F);
      ((Path)localObject).lineTo(26.914213F, 2.828427F);
      ((Path)localObject).lineTo(24.085787F, -5.329071E-015F);
      ((Path)localObject).lineTo(16.410664F, 7.675123F);
      ((Path)localObject).cubicTo(15.734303F, 8.351483F, 14.829623F, 9.285367F, 13.962992F, 10.188502F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ar
 * JD-Core Version:    0.6.2
 */