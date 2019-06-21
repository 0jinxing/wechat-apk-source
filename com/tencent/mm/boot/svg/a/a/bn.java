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

public final class bn extends c
{
  private final int height = 46;
  private final int width = 46;

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
        paramInt = 46;
        continue;
        paramInt = 46;
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
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-11184811);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 5.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.14628F, 3.467816F);
      ((Path)localObject1).cubicTo(-0.1427753F, 2.680582F, -0.7123578F, 0.1096149F, 1.436068F, 0.0F);
      ((Path)localObject1).cubicTo(4.623731F, 1.624293F, 6.612273F, 4.872879F, 9.310296F, 7.154862F);
      ((Path)localObject1).cubicTo(10.96908F, 5.699973F, 12.857696F, 4.544035F, 14.886209F, 3.697011F);
      ((Path)localObject1).cubicTo(15.485769F, 1.943173F, 16.874752F, -0.31888F, 19.083132F, 0.5281444F);
      ((Path)localObject1).cubicTo(20.751909F, 0.827094F, 20.961756F, 2.710477F, 21.561316F, 3.966065F);
      ((Path)localObject1).cubicTo(24.129435F, 5.321303F, 26.577639F, 7.134931F, 27.756775F, 9.885268F);
      ((Path)localObject1).cubicTo(30.714607F, 15.515486F, 28.865961F, 22.112309F, 30.7246F, 28.001616F);
      ((Path)localObject1).cubicTo(32.263474F, 30.851603F, 35.391178F, 32.426071F, 37.0F, 35.26609F);
      ((Path)localObject1).cubicTo(36.560322F, 35.704552F, 35.700951F, 36.561539F, 35.261276F, 37.0F);
      ((Path)localObject1).cubicTo(33.11285F, 35.624832F, 31.424088F, 33.68166F, 29.645391F, 31.88796F);
      ((Path)localObject1).cubicTo(20.142357F, 22.411257F, 10.639321F, 12.944519F, 1.14628F, 3.467816F);
      ((Path)localObject1).lineTo(1.14628F, 3.467816F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(6.493734F, 13.0F);
      ((Path)localObject3).cubicTo(14.062656F, 20.270292F, 21.491228F, 27.668304F, 29.0F, 34.997543F);
      ((Path)localObject3).cubicTo(19.666666F, 34.997543F, 10.333333F, 35.00737F, 1.0F, 34.98772F);
      ((Path)localObject3).cubicTo(1.77193F, 32.541363F, 3.917293F, 30.812214F, 4.588973F, 28.336386F);
      ((Path)localObject3).cubicTo(6.323309F, 23.394552F, 5.350877F, 18.059731F, 6.493734F, 13.0F);
      ((Path)localObject3).lineTo(6.493734F, 13.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bn
 * JD-Core Version:    0.6.2
 */