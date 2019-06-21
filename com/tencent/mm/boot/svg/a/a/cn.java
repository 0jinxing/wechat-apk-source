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

public final class cn extends c
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
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1710619);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(46.0F, 0.0F);
      ((Path)localObject3).lineTo(68.0F, 22.0F);
      ((Path)localObject3).lineTo(68.0F, 87.0F);
      ((Path)localObject3).cubicTo(68.0F, 88.656853F, 66.656853F, 90.0F, 65.0F, 90.0F);
      ((Path)localObject3).lineTo(3.0F, 90.0F);
      ((Path)localObject3).cubicTo(1.343146F, 90.0F, 2.029061E-016F, 88.656853F, 0.0F, 87.0F);
      ((Path)localObject3).lineTo(0.0F, 3.0F);
      ((Path)localObject3).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject3).lineTo(46.0F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-2434342);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(68.0F, 22.0F);
      ((Path)localObject3).lineTo(49.0F, 22.0F);
      ((Path)localObject3).cubicTo(47.343147F, 22.0F, 46.0F, 20.656855F, 46.0F, 19.0F);
      ((Path)localObject3).lineTo(46.0F, 0.0F);
      ((Path)localObject3).lineTo(68.0F, 22.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-5723992);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(13.0F, 44.0F);
      ((Path)localObject2).lineTo(55.0F, 44.0F);
      ((Path)localObject2).lineTo(55.0F, 47.0F);
      ((Path)localObject2).lineTo(13.0F, 47.0F);
      ((Path)localObject2).lineTo(13.0F, 44.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(13.0F, 56.0F);
      ((Path)localObject2).lineTo(55.0F, 56.0F);
      ((Path)localObject2).lineTo(55.0F, 59.0F);
      ((Path)localObject2).lineTo(13.0F, 59.0F);
      ((Path)localObject2).lineTo(13.0F, 56.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(13.0F, 68.0F);
      ((Path)localObject2).lineTo(37.0F, 68.0F);
      ((Path)localObject2).lineTo(37.0F, 71.0F);
      ((Path)localObject2).lineTo(13.0F, 71.0F);
      ((Path)localObject2).lineTo(13.0F, 68.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cn
 * JD-Core Version:    0.6.2
 */