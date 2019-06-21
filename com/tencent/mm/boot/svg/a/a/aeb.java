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

public final class aeb extends c
{
  private final int height = 45;
  private final int width = 45;

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
        paramInt = 45;
        continue;
        paramInt = 45;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint2.setColor(-1);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(43.153847F, 34.76923F);
      ((Path)localObject).lineTo(34.46154F, 31.5F);
      ((Path)localObject).cubicTo(34.0F, 31.346153F, 33.807693F, 31.423077F, 33.384617F, 31.653847F);
      ((Path)localObject).cubicTo(32.0F, 32.423077F, 28.615385F, 34.26923F, 26.615385F, 35.307693F);
      ((Path)localObject).lineTo(26.615385F, 35.307693F);
      ((Path)localObject).cubicTo(26.115385F, 35.576923F, 25.576923F, 35.73077F, 24.961538F, 35.73077F);
      ((Path)localObject).cubicTo(24.307692F, 35.73077F, 23.73077F, 35.53846F, 23.23077F, 35.23077F);
      ((Path)localObject).cubicTo(20.423077F, 33.576923F, 17.76923F, 31.653847F, 15.5F, 29.346153F);
      ((Path)localObject).lineTo(15.5F, 29.346153F);
      ((Path)localObject).cubicTo(13.230769F, 27.076923F, 11.307693F, 24.423077F, 9.653846F, 21.615385F);
      ((Path)localObject).cubicTo(9.346154F, 21.115385F, 9.153846F, 20.5F, 9.153846F, 19.884615F);
      ((Path)localObject).cubicTo(9.153846F, 19.307692F, 9.307693F, 18.73077F, 9.576923F, 18.23077F);
      ((Path)localObject).lineTo(9.576923F, 18.23077F);
      ((Path)localObject).cubicTo(10.615385F, 16.192308F, 12.461538F, 12.807693F, 13.230769F, 11.461538F);
      ((Path)localObject).cubicTo(13.461538F, 11.038462F, 13.538462F, 10.807693F, 13.384615F, 10.384615F);
      ((Path)localObject).lineTo(10.115385F, 1.692308F);
      ((Path)localObject).cubicTo(9.692308F, 0.6923077F, 8.730769F, 0.0384615F, 7.576923F, 0.0F);
      ((Path)localObject).cubicTo(7.115385F, 0.0F, 6.576923F, 0.192308F, 6.461538F, 0.2307692F);
      ((Path)localObject).cubicTo(2.692308F, 1.615385F, -2.131628E-014F, 5.192308F, -2.131628E-014F, 9.423077F);
      ((Path)localObject).cubicTo(-2.131628E-014F, 10.615385F, 0.3076923F, 11.730769F, 0.3461539F, 12.0F);
      ((Path)localObject).cubicTo(2.192308F, 20.076923F, 6.307693F, 27.26923F, 11.961538F, 32.923077F);
      ((Path)localObject).lineTo(11.961538F, 32.923077F);
      ((Path)localObject).lineTo(11.961538F, 32.923077F);
      ((Path)localObject).lineTo(11.961538F, 32.923077F);
      ((Path)localObject).lineTo(11.961538F, 32.923077F);
      ((Path)localObject).lineTo(11.961538F, 32.923077F);
      ((Path)localObject).cubicTo(17.615385F, 38.576923F, 24.807692F, 42.692307F, 32.884617F, 44.53846F);
      ((Path)localObject).cubicTo(33.153847F, 44.615383F, 34.26923F, 44.884617F, 35.46154F, 44.884617F);
      ((Path)localObject).cubicTo(39.692307F, 44.884617F, 43.26923F, 42.192307F, 44.653847F, 38.423077F);
      ((Path)localObject).cubicTo(44.692307F, 38.307693F, 44.923077F, 37.76923F, 44.884617F, 37.307693F);
      ((Path)localObject).cubicTo(44.807693F, 36.153847F, 44.153847F, 35.192307F, 43.153847F, 34.76923F);
      ((Path)localObject).lineTo(43.153847F, 34.76923F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(24.638493F, 9.469288F);
      ((Path)localObject).cubicTo(24.465891F, 6.903247F, 25.258863F, 4.40392F, 27.063414F, 2.563286F);
      ((Path)localObject).cubicTo(30.722916F, -1.169391F, 37.156761F, -0.779695F, 41.433807F, 3.433697F);
      ((Path)localObject).cubicTo(45.710857F, 7.64709F, 46.211475F, 14.088652F, 42.551971F, 17.821329F);
      ((Path)localObject).cubicTo(40.582294F, 19.830393F, 37.808891F, 20.64521F, 35.00066F, 20.312353F);
      ((Path)localObject).cubicTo(34.714729F, 20.922211F, 34.328201F, 21.487631F, 33.839317F, 21.986317F);
      ((Path)localObject).cubicTo(31.17852F, 24.700453F, 26.493263F, 24.409948F, 23.374504F, 21.337458F);
      ((Path)localObject).cubicTo(20.255747F, 18.264965F, 19.884499F, 13.573975F, 22.545298F, 10.859838F);
      ((Path)localObject).cubicTo(23.151972F, 10.241F, 23.863892F, 9.778364F, 24.638493F, 9.469288F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.638493F, 9.469288F);
      ((Path)localObject).cubicTo(24.815912F, 12.107001F, 26.013597F, 14.815207F, 28.181576F, 16.950918F);
      ((Path)localObject).cubicTo(30.156559F, 18.896509F, 32.591427F, 20.026789F, 35.00066F, 20.312353F);
      ((Path)localObject).cubicTo(36.270943F, 17.60301F, 35.55584F, 14.016662F, 33.010109F, 11.508697F);
      ((Path)localObject).cubicTo(30.602446F, 9.136748F, 27.261183F, 8.422798F, 24.638493F, 9.469288F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aeb
 * JD-Core Version:    0.6.2
 */