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

public final class bbz extends c
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
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, -127.0F, 0.0F, 1.0F, -128.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 127.0F, 0.0F, 1.0F, 128.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9276814);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(78.0F, 47.0F);
      ((Path)localObject1).cubicTo(78.0F, 68.539108F, 60.539104F, 86.0F, 39.0F, 86.0F);
      ((Path)localObject1).cubicTo(17.460896F, 86.0F, 0.0F, 68.539108F, 0.0F, 47.0F);
      ((Path)localObject1).cubicTo(0.0F, 29.647755F, 11.332416F, 14.942338F, 27.0F, 9.880997F);
      ((Path)localObject1).lineTo(27.0F, 18.408052F);
      ((Path)localObject1).cubicTo(15.838201F, 23.098259F, 8.0F, 34.133774F, 8.0F, 47.0F);
      ((Path)localObject1).cubicTo(8.0F, 64.120827F, 21.879173F, 78.0F, 39.0F, 78.0F);
      ((Path)localObject1).cubicTo(56.120827F, 78.0F, 70.0F, 64.120827F, 70.0F, 47.0F);
      ((Path)localObject1).cubicTo(70.0F, 34.133774F, 62.1618F, 23.098259F, 51.0F, 18.408056F);
      ((Path)localObject1).lineTo(51.0F, 9.880997F);
      ((Path)localObject1).cubicTo(66.667587F, 14.942338F, 78.0F, 29.647755F, 78.0F, 47.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(35.0F, 2.0F);
      ((Path)localObject2).cubicTo(35.0F, 0.8954305F, 35.895432F, 0.0F, 37.0F, 0.0F);
      ((Path)localObject2).lineTo(42.0F, 0.0F);
      ((Path)localObject2).cubicTo(43.104568F, 0.0F, 44.0F, 0.8954305F, 44.0F, 2.0F);
      ((Path)localObject2).lineTo(44.0F, 28.0F);
      ((Path)localObject2).cubicTo(44.0F, 29.10457F, 43.104568F, 30.0F, 42.0F, 30.0F);
      ((Path)localObject2).lineTo(37.0F, 30.0F);
      ((Path)localObject2).cubicTo(35.895432F, 30.0F, 35.0F, 29.10457F, 35.0F, 28.0F);
      ((Path)localObject2).lineTo(35.0F, 2.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbz
 * JD-Core Version:    0.6.2
 */