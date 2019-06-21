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

public final class bt extends c
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
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9061376);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.0F, 0.0F);
      ((Path)localObject1).lineTo(68.0F, 22.0F);
      ((Path)localObject1).lineTo(68.0F, 87.0F);
      ((Path)localObject1).cubicTo(68.0F, 88.656853F, 66.656853F, 90.0F, 65.0F, 90.0F);
      ((Path)localObject1).lineTo(3.0F, 90.0F);
      ((Path)localObject1).cubicTo(1.343146F, 90.0F, 2.029061E-016F, 88.656853F, 0.0F, 87.0F);
      ((Path)localObject1).lineTo(0.0F, 3.0F);
      ((Path)localObject1).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject1).lineTo(46.0F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-10643968);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(49.0F, 22.0F);
      ((Path)localObject2).cubicTo(47.343147F, 22.0F, 46.0F, 20.656855F, 46.0F, 19.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(44.469551F, 48.780758F);
      ((Path)localObject1).lineTo(36.883331F, 41.194542F);
      ((Path)localObject1).cubicTo(35.289864F, 39.601074F, 32.701378F, 39.601379F, 31.10466F, 41.198101F);
      ((Path)localObject1).lineTo(19.198929F, 53.103832F);
      ((Path)localObject1).cubicTo(17.601286F, 54.701473F, 17.600616F, 57.28775F, 19.19537F, 58.882504F);
      ((Path)localObject1).lineTo(31.116667F, 70.803802F);
      ((Path)localObject1).cubicTo(32.710136F, 72.39727F, 35.298622F, 72.396957F, 36.89534F, 70.80024F);
      ((Path)localObject1).lineTo(48.801071F, 58.894512F);
      ((Path)localObject1).cubicTo(50.398716F, 57.296867F, 50.399384F, 54.71059F, 48.80463F, 53.115837F);
      ((Path)localObject1).lineTo(48.442215F, 52.753422F);
      ((Path)localObject1).lineTo(34.003448F, 67.192184F);
      ((Path)localObject1).lineTo(32.017117F, 65.205856F);
      ((Path)localObject1).lineTo(24.794092F, 57.98283F);
      ((Path)localObject1).lineTo(22.80776F, 55.996498F);
      ((Path)localObject1).lineTo(33.998104F, 44.806156F);
      ((Path)localObject1).lineTo(37.970768F, 48.77882F);
      ((Path)localObject1).lineTo(30.75119F, 55.998394F);
      ((Path)localObject1).lineTo(34.001553F, 59.248756F);
      ((Path)localObject1).lineTo(44.469551F, 48.780758F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bt
 * JD-Core Version:    0.6.2
 */