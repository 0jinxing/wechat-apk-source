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

public final class afi extends c
{
  private final int height = 93;
  private final int width = 93;

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
        paramInt = 93;
        continue;
        paramInt = 93;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 11.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(5.217392F, 0.0F);
      ((Path)localObject2).cubicTo(2.270083F, 0.0F, -7.105427E-015F, 2.426357F, -7.105427E-015F, 5.217392F);
      ((Path)localObject2).lineTo(-7.105427E-015F, 65.217392F);
      ((Path)localObject2).cubicTo(-7.105427E-015F, 68.008423F, 2.270083F, 70.434784F, 5.217392F, 70.434784F);
      ((Path)localObject2).lineTo(86.08696F, 70.434784F);
      ((Path)localObject2).cubicTo(89.033127F, 70.434784F, 91.304344F, 68.008423F, 91.304344F, 65.217392F);
      ((Path)localObject2).lineTo(91.304344F, 5.217392F);
      ((Path)localObject2).cubicTo(91.304344F, 2.426357F, 89.033127F, 0.0F, 86.08696F, 0.0F);
      ((Path)localObject2).lineTo(5.217392F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(67.826088F, 6.521739F);
      ((Path)localObject2).lineTo(80.933716F, 6.521739F);
      ((Path)localObject2).cubicTo(82.835846F, 6.521739F, 84.782608F, 8.498771F, 84.782608F, 11.73913F);
      ((Path)localObject2).lineTo(84.782608F, 24.782608F);
      ((Path)localObject2).lineTo(91.304344F, 24.782608F);
      ((Path)localObject2).lineTo(91.304344F, 44.347828F);
      ((Path)localObject2).lineTo(84.782608F, 44.347828F);
      ((Path)localObject2).lineTo(84.782608F, 58.695652F);
      ((Path)localObject2).cubicTo(84.782608F, 61.936012F, 82.835846F, 63.913044F, 80.933716F, 63.913044F);
      ((Path)localObject2).lineTo(67.826088F, 63.913044F);
      ((Path)localObject2).lineTo(67.826088F, 70.434784F);
      ((Path)localObject2).lineTo(24.782608F, 70.434784F);
      ((Path)localObject2).lineTo(24.782608F, 63.913044F);
      ((Path)localObject2).lineTo(10.370634F, 63.913044F);
      ((Path)localObject2).cubicTo(8.467525F, 63.913044F, 6.521739F, 61.936012F, 6.521739F, 58.695652F);
      ((Path)localObject2).lineTo(6.521739F, 44.347828F);
      ((Path)localObject2).lineTo(7.105427E-015F, 44.347828F);
      ((Path)localObject2).lineTo(8.303451E-015F, 24.782608F);
      ((Path)localObject2).lineTo(6.521739F, 24.782608F);
      ((Path)localObject2).lineTo(6.521739F, 11.73913F);
      ((Path)localObject2).cubicTo(6.521739F, 8.498771F, 8.467525F, 6.521739F, 10.370634F, 6.521739F);
      ((Path)localObject2).lineTo(24.782608F, 6.521739F);
      ((Path)localObject2).lineTo(24.782608F, 0.0F);
      ((Path)localObject2).lineTo(67.826088F, 0.0F);
      ((Path)localObject2).lineTo(67.826088F, 6.521739F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(29.608696F, 34.347828F);
      ((Path)localObject3).lineTo(27.0F, 39.565216F);
      ((Path)localObject3).lineTo(38.739132F, 53.913044F);
      ((Path)localObject3).lineTo(64.826088F, 22.608696F);
      ((Path)localObject3).lineTo(62.217392F, 20.0F);
      ((Path)localObject3).lineTo(38.739132F, 42.173912F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afi
 * JD-Core Version:    0.6.2
 */