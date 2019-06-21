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

public final class kv extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localPaint.setColor(-9276814);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(18.0F, 118.0F);
      ((Path)localObject).lineTo(18.0F, 48.0F);
      ((Path)localObject).lineTo(37.602036F, 48.0F);
      ((Path)localObject).cubicTo(40.250168F, 42.636612F, 43.392544F, 37.607285F, 46.872543F, 34.0F);
      ((Path)localObject).lineTo(10.101695F, 34.0F);
      ((Path)localObject).cubicTo(6.731525F, 34.009319F, 4.0F, 36.740845F, 4.0F, 40.0F);
      ((Path)localObject).lineTo(4.0F, 125.89831F);
      ((Path)localObject).cubicTo(4.0F, 129.26848F, 6.731525F, 132.0F, 10.101695F, 132.0F);
      ((Path)localObject).lineTo(119.93221F, 132.0F);
      ((Path)localObject).cubicTo(123.30034F, 132.0F, 126.0339F, 129.26848F, 126.0F, 125.89831F);
      ((Path)localObject).lineTo(126.0F, 81.599998F);
      ((Path)localObject).lineTo(112.0F, 93.620338F);
      ((Path)localObject).lineTo(112.0F, 118.0F);
      ((Path)localObject).lineTo(18.0F, 118.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(95.0F, 34.411526F);
      ((Path)localObject).cubicTo(92.118645F, 34.389153F, 88.575592F, 34.372883F, 85.355934F, 34.372883F);
      ((Path)localObject).cubicTo(57.560677F, 34.372883F, 38.688137F, 61.490849F, 38.688137F, 97.423729F);
      ((Path)localObject).cubicTo(48.178307F, 75.376274F, 57.458984F, 64.881355F, 95.0F, 64.881355F);
      ((Path)localObject).lineTo(95.0F, 87.254234F);
      ((Path)localObject).lineTo(140.27118F, 49.627117F);
      ((Path)localObject).lineTo(95.0F, 12.0F);
      ((Path)localObject).lineTo(95.0F, 34.411526F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.kv
 * JD-Core Version:    0.6.2
 */