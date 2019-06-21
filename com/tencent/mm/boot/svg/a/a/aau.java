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

public final class aau extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 9.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(43.08889F, 34.5F);
      ((Path)localObject2).lineTo(44.74044F, 32.84845F);
      ((Path)localObject2).cubicTo(45.865658F, 31.72323F, 46.497799F, 30.197107F, 46.497799F, 28.605808F);
      ((Path)localObject2).lineTo(46.497799F, 20.484488F);
      ((Path)localObject2).lineTo(53.922421F, 13.059866F);
      ((Path)localObject2).lineTo(56.043743F, 15.181187F);
      ((Path)localObject2).lineTo(57.104401F, 14.120526F);
      ((Path)localObject2).cubicTo(57.690189F, 13.534739F, 57.690189F, 12.584992F, 57.104401F, 11.999206F);
      ((Path)localObject2).lineTo(46.497799F, 1.392604F);
      ((Path)localObject2).cubicTo(45.912014F, 0.8068177F, 44.962265F, 0.8068177F, 44.37648F, 1.392604F);
      ((Path)localObject2).lineTo(43.315819F, 2.453264F);
      ((Path)localObject2).lineTo(45.437141F, 4.574585F);
      ((Path)localObject2).lineTo(38.01252F, 11.999206F);
      ((Path)localObject2).lineTo(29.891199F, 11.999206F);
      ((Path)localObject2).cubicTo(28.2999F, 11.999206F, 26.773777F, 12.631347F, 25.648558F, 13.756565F);
      ((Path)localObject2).lineTo(5.132054F, 34.273071F);
      ((Path)localObject2).cubicTo(5.058281F, 34.346844F, 4.987604F, 34.422539F, 4.920025F, 34.5F);
      ((Path)localObject2).lineTo(9.996292F, 34.5F);
      ((Path)localObject2).lineTo(28.194143F, 16.302149F);
      ((Path)localObject2).cubicTo(28.64423F, 15.852062F, 29.254679F, 15.599206F, 29.891199F, 15.599206F);
      ((Path)localObject2).lineTo(39.503689F, 15.599206F);
      ((Path)localObject2).lineTo(47.982723F, 7.120169F);
      ((Path)localObject2).lineTo(51.376839F, 10.514281F);
      ((Path)localObject2).lineTo(42.8978F, 18.993319F);
      ((Path)localObject2).lineTo(42.8978F, 28.605808F);
      ((Path)localObject2).cubicTo(42.8978F, 29.242327F, 42.644943F, 29.852776F, 42.194859F, 30.302864F);
      ((Path)localObject2).lineTo(37.997719F, 34.5F);
      ((Path)localObject2).lineTo(43.08889F, 34.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(31.5F, 34.5F);
      ((Path)localObject3).lineTo(49.5F, 34.5F);
      ((Path)localObject3).lineTo(49.5F, 38.099991F);
      ((Path)localObject3).lineTo(31.5F, 38.099991F);
      ((Path)localObject3).lineTo(31.5F, 34.5F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(0.0F, 34.5F);
      ((Path)localObject3).lineTo(22.5F, 34.5F);
      ((Path)localObject3).lineTo(22.5F, 38.099991F);
      ((Path)localObject3).lineTo(0.0F, 38.099991F);
      ((Path)localObject3).lineTo(0.0F, 34.5F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(34.5F, 49.5F);
      ((Path)localObject3).lineTo(48.0F, 49.5F);
      ((Path)localObject3).lineTo(48.0F, 53.099991F);
      ((Path)localObject3).lineTo(34.5F, 53.099991F);
      ((Path)localObject3).lineTo(34.5F, 49.5F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(25.5F, 42.0F);
      ((Path)localObject3).lineTo(37.5F, 42.0F);
      ((Path)localObject3).lineTo(37.5F, 45.599991F);
      ((Path)localObject3).lineTo(25.5F, 45.599991F);
      ((Path)localObject3).lineTo(25.5F, 42.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(12.0F, 42.0F);
      ((Path)localObject3).lineTo(18.0F, 42.0F);
      ((Path)localObject3).lineTo(18.0F, 45.599991F);
      ((Path)localObject3).lineTo(12.0F, 45.599991F);
      ((Path)localObject3).lineTo(12.0F, 42.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aau
 * JD-Core Version:    0.6.2
 */