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

public final class zo extends c
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
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(7.5F, 15.0F);
      ((Path)localObject2).lineTo(46.5F, 15.0F);
      ((Path)localObject2).lineTo(7.5F, 15.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(46.235294F, 19.500006F);
      ((Path)localObject2).lineTo(43.832214F, 60.352333F);
      ((Path)localObject2).cubicTo(43.645664F, 63.523708F, 41.019428F, 66.0F, 37.842571F, 66.0F);
      ((Path)localObject2).lineTo(16.157431F, 66.0F);
      ((Path)localObject2).cubicTo(12.980573F, 66.0F, 10.354336F, 63.523708F, 10.167784F, 60.352333F);
      ((Path)localObject2).lineTo(7.764706F, 19.500006F);
      ((Path)localObject2).lineTo(46.235294F, 19.500006F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(18.0F, 26.999945F);
      ((Path)localObject2).lineTo(19.5F, 53.999981F);
      ((Path)localObject2).lineTo(24.0F, 53.999981F);
      ((Path)localObject2).lineTo(22.800001F, 26.999945F);
      ((Path)localObject2).lineTo(18.0F, 26.999945F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(31.5F, 26.999945F);
      ((Path)localObject2).lineTo(30.0F, 53.999981F);
      ((Path)localObject2).lineTo(34.5F, 53.999981F);
      ((Path)localObject2).lineTo(36.0F, 26.999945F);
      ((Path)localObject2).lineTo(31.5F, 26.999945F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, 0.9848077F, -0.1736482F, 2.226877F, 0.1736482F, 0.9848077F, -4.779654F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.429283F, 11.836774F);
      ((Path)localObject1).lineTo(52.429283F, 11.836774F);
      ((Path)localObject1).cubicTo(53.25771F, 11.836774F, 53.929283F, 12.508347F, 53.929283F, 13.336774F);
      ((Path)localObject1).lineTo(53.929283F, 16.336781F);
      ((Path)localObject1).lineTo(2.929283F, 16.336781F);
      ((Path)localObject1).lineTo(2.929283F, 13.336774F);
      ((Path)localObject1).cubicTo(2.929283F, 12.508347F, 3.600856F, 11.836774F, 4.429283F, 11.836774F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.429283F, 4.336876F);
      ((Path)localObject1).lineTo(34.429283F, 4.336876F);
      ((Path)localObject1).cubicTo(35.25771F, 4.336876F, 35.929283F, 5.008449F, 35.929283F, 5.836876F);
      ((Path)localObject1).lineTo(35.929283F, 8.836774F);
      ((Path)localObject1).lineTo(20.929283F, 8.836774F);
      ((Path)localObject1).lineTo(20.929283F, 5.836876F);
      ((Path)localObject1).cubicTo(20.929283F, 5.008449F, 21.600857F, 4.336876F, 22.429283F, 4.336876F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zo
 * JD-Core Version:    0.6.2
 */