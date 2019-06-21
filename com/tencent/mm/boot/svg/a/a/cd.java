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

public final class cd extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-14824411);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(68.0F, 87.0F);
      ((Path)localObject2).cubicTo(68.0F, 88.656853F, 66.656853F, 90.0F, 65.0F, 90.0F);
      ((Path)localObject2).lineTo(3.0F, 90.0F);
      ((Path)localObject2).cubicTo(1.343146F, 90.0F, 2.029061E-016F, 88.656853F, 0.0F, 87.0F);
      ((Path)localObject2).lineTo(0.0F, 3.0F);
      ((Path)localObject2).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15228131);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(68.0F, 22.0F);
      ((Path)localObject1).lineTo(49.0F, 22.0F);
      ((Path)localObject1).cubicTo(47.343147F, 22.0F, 46.0F, 20.656855F, 46.0F, 19.0F);
      ((Path)localObject1).lineTo(46.0F, 0.0F);
      ((Path)localObject1).lineTo(68.0F, 22.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(19.75F, 62.0F);
      ((Path)localObject1).lineTo(24.25F, 62.0F);
      ((Path)localObject1).cubicTo(24.664213F, 62.0F, 25.0F, 62.335785F, 25.0F, 62.75F);
      ((Path)localObject1).lineTo(25.0F, 65.25F);
      ((Path)localObject1).cubicTo(25.0F, 65.664215F, 24.664213F, 66.0F, 24.25F, 66.0F);
      ((Path)localObject1).lineTo(19.75F, 66.0F);
      ((Path)localObject1).cubicTo(19.335787F, 66.0F, 19.0F, 65.664215F, 19.0F, 65.25F);
      ((Path)localObject1).lineTo(19.0F, 62.75F);
      ((Path)localObject1).cubicTo(19.0F, 62.335785F, 19.335787F, 62.0F, 19.75F, 62.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(27.75F, 55.0F);
      ((Path)localObject1).lineTo(32.25F, 55.0F);
      ((Path)localObject1).cubicTo(32.664215F, 55.0F, 33.0F, 55.335785F, 33.0F, 55.75F);
      ((Path)localObject1).lineTo(33.0F, 65.25F);
      ((Path)localObject1).cubicTo(33.0F, 65.664215F, 32.664215F, 66.0F, 32.25F, 66.0F);
      ((Path)localObject1).lineTo(27.75F, 66.0F);
      ((Path)localObject1).cubicTo(27.335787F, 66.0F, 27.0F, 65.664215F, 27.0F, 65.25F);
      ((Path)localObject1).lineTo(27.0F, 55.75F);
      ((Path)localObject1).cubicTo(27.0F, 55.335785F, 27.335787F, 55.0F, 27.75F, 55.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(35.75F, 44.0F);
      ((Path)localObject1).lineTo(40.25F, 44.0F);
      ((Path)localObject1).cubicTo(40.664215F, 44.0F, 41.0F, 44.335785F, 41.0F, 44.75F);
      ((Path)localObject1).lineTo(41.0F, 65.25F);
      ((Path)localObject1).cubicTo(41.0F, 65.664215F, 40.664215F, 66.0F, 40.25F, 66.0F);
      ((Path)localObject1).lineTo(35.75F, 66.0F);
      ((Path)localObject1).cubicTo(35.335785F, 66.0F, 35.0F, 65.664215F, 35.0F, 65.25F);
      ((Path)localObject1).lineTo(35.0F, 44.75F);
      ((Path)localObject1).cubicTo(35.0F, 44.335785F, 35.335785F, 44.0F, 35.75F, 44.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(19.0F, 68.0F);
      ((Path)localObject1).lineTo(49.0F, 68.0F);
      ((Path)localObject1).cubicTo(49.552284F, 68.0F, 50.0F, 68.447716F, 50.0F, 69.0F);
      ((Path)localObject1).cubicTo(50.0F, 69.552284F, 49.552284F, 70.0F, 49.0F, 70.0F);
      ((Path)localObject1).lineTo(19.0F, 70.0F);
      ((Path)localObject1).cubicTo(18.447716F, 70.0F, 18.0F, 69.552284F, 18.0F, 69.0F);
      ((Path)localObject1).cubicTo(18.0F, 68.447716F, 18.447716F, 68.0F, 19.0F, 68.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(43.75F, 50.0F);
      ((Path)localObject1).lineTo(48.25F, 50.0F);
      ((Path)localObject1).cubicTo(48.664215F, 50.0F, 49.0F, 50.335785F, 49.0F, 50.75F);
      ((Path)localObject1).lineTo(49.0F, 65.25F);
      ((Path)localObject1).cubicTo(49.0F, 65.664215F, 48.664215F, 66.0F, 48.25F, 66.0F);
      ((Path)localObject1).lineTo(43.75F, 66.0F);
      ((Path)localObject1).cubicTo(43.335785F, 66.0F, 43.0F, 65.664215F, 43.0F, 65.25F);
      ((Path)localObject1).lineTo(43.0F, 50.75F);
      ((Path)localObject1).cubicTo(43.0F, 50.335785F, 43.335785F, 50.0F, 43.75F, 50.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cd
 * JD-Core Version:    0.6.2
 */