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

public final class ajt extends c
{
  private final int height = 210;
  private final int width = 210;

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
        paramInt = 210;
        continue;
        paramInt = 210;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-13327053);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(105.0F, 0.0F);
      ((Path)localObject).cubicTo(162.9899F, 0.0F, 210.0F, 47.010098F, 210.0F, 105.0F);
      ((Path)localObject).cubicTo(210.0F, 162.9899F, 162.9899F, 210.0F, 105.0F, 210.0F);
      ((Path)localObject).cubicTo(47.010098F, 210.0F, 0.0F, 162.9899F, 0.0F, 105.0F);
      ((Path)localObject).cubicTo(0.0F, 47.010098F, 47.010098F, 0.0F, 105.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(96.494316F, 113.50568F);
      ((Path)localObject).cubicTo(104.60257F, 121.61394F, 112.28522F, 125.41699F, 115.1263F, 125.19428F);
      ((Path)localObject).cubicTo(117.96738F, 124.97158F, 125.04247F, 120.10603F, 128.38249F, 120.17079F);
      ((Path)localObject).cubicTo(129.98773F, 120.20192F, 140.47748F, 127.29613F, 141.74727F, 128.11635F);
      ((Path)localObject).cubicTo(143.01704F, 128.93655F, 144.19443F, 129.89465F, 143.97304F, 131.10704F);
      ((Path)localObject).cubicTo(143.75165F, 132.31943F, 139.14153F, 145.67386F, 127.37189F, 143.82458F);
      ((Path)localObject).cubicTo(115.60224F, 141.9753F, 99.193718F, 129.28743F, 89.843742F, 120.15626F);
      ((Path)localObject).lineTo(96.494316F, 113.50568F);
      ((Path)localObject).lineTo(96.494316F, 113.50568F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(96.494316F, 113.50568F);
      ((Path)localObject).cubicTo(88.386063F, 105.39743F, 84.583008F, 97.714775F, 84.805717F, 94.873695F);
      ((Path)localObject).cubicTo(85.028419F, 92.032608F, 89.893974F, 84.957527F, 89.829208F, 81.617516F);
      ((Path)localObject).cubicTo(89.79808F, 80.012268F, 82.703865F, 69.522522F, 81.883659F, 68.252739F);
      ((Path)localObject).cubicTo(81.063446F, 66.982948F, 80.105347F, 65.80558F, 78.89296F, 66.026962F);
      ((Path)localObject).cubicTo(77.680565F, 66.248352F, 64.326141F, 70.858475F, 66.175423F, 82.628113F);
      ((Path)localObject).cubicTo(68.024704F, 94.397758F, 80.71257F, 110.80628F, 89.843742F, 120.15626F);
      ((Path)localObject).lineTo(96.494316F, 113.50568F);
      ((Path)localObject).lineTo(96.494316F, 113.50568F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ajt
 * JD-Core Version:    0.6.2
 */