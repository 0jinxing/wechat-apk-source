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

public final class kg extends c
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(47.0F, 87.987747F);
      ((Path)localObject).cubicTo(25.370693F, 87.457024F, 8.0F, 69.75708F, 8.0F, 48.0F);
      ((Path)localObject).cubicTo(8.0F, 34.31184F, 14.875527F, 22.229542F, 25.36142F, 15.018275F);
      ((Path)localObject).lineTo(31.139889F, 20.796743F);
      ((Path)localObject).cubicTo(22.05139F, 26.441599F, 16.0F, 36.514111F, 16.0F, 48.0F);
      ((Path)localObject).cubicTo(16.0F, 65.338554F, 29.789598F, 79.456375F, 47.0F, 79.984673F);
      ((Path)localObject).lineTo(47.0F, 70.0F);
      ((Path)localObject).lineTo(65.0F, 88.0F);
      ((Path)localObject).lineTo(47.0F, 88.0F);
      ((Path)localObject).lineTo(47.0F, 87.987747F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(47.0F, 8.012256F);
      ((Path)localObject).cubicTo(47.332344F, 8.004101F, 47.665691F, 8.0F, 48.0F, 8.0F);
      ((Path)localObject).cubicTo(70.091393F, 8.0F, 88.0F, 25.908609F, 88.0F, 48.0F);
      ((Path)localObject).cubicTo(88.0F, 62.075714F, 80.72963F, 74.453346F, 69.739311F, 81.582458F);
      ((Path)localObject).lineTo(63.921238F, 75.764381F);
      ((Path)localObject).cubicTo(73.52948F, 70.242729F, 80.0F, 59.876999F, 80.0F, 48.0F);
      ((Path)localObject).cubicTo(80.0F, 30.326887F, 65.673111F, 16.0F, 48.0F, 16.0F);
      ((Path)localObject).cubicTo(47.665443F, 16.0F, 47.332085F, 16.005135F, 47.0F, 16.015327F);
      ((Path)localObject).lineTo(47.0F, 26.0F);
      ((Path)localObject).lineTo(29.0F, 8.0F);
      ((Path)localObject).lineTo(47.0F, 8.0F);
      ((Path)localObject).lineTo(47.0F, 8.012256F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.kg
 * JD-Core Version:    0.6.2
 */