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

public final class avp extends c
{
  private final int height = 42;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 42;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-4210753);
      localPaint.setStrokeWidth(2.38417F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.255814F, 19.44186F);
      ((Path)localObject1).cubicTo(15.75252F, 23.571234F, 11.813965F, 25.277498F, 9.72093F, 26.511627F);
      ((Path)localObject1).cubicTo(3.092273F, 30.251368F, 0.0F, 31.759228F, 0.0F, 33.581394F);
      ((Path)localObject1).lineTo(0.0F, 36.232559F);
      ((Path)localObject1).cubicTo(0.0F, 37.254696F, 0.6434917F, 38.0F, 1.767442F, 38.0F);
      ((Path)localObject1).lineTo(36.232559F, 38.0F);
      ((Path)localObject1).cubicTo(37.356506F, 38.0F, 38.0F, 37.254696F, 38.0F, 36.232559F);
      ((Path)localObject1).lineTo(38.0F, 33.581394F);
      ((Path)localObject1).cubicTo(38.0F, 31.759228F, 34.907726F, 30.251368F, 28.27907F, 26.511627F);
      ((Path)localObject1).cubicTo(26.186035F, 25.277498F, 22.24748F, 23.571234F, 24.744186F, 19.44186F);
      ((Path)localObject1).cubicTo(26.726433F, 16.674295F, 28.370281F, 15.399918F, 28.27907F, 10.604651F);
      ((Path)localObject1).cubicTo(28.370281F, 5.203167F, 24.697962F, 0.0F, 19.44186F, 0.0F);
      ((Path)localObject1).cubicTo(13.302039F, 0.0F, 9.629718F, 5.203167F, 9.72093F, 10.604651F);
      ((Path)localObject1).cubicTo(9.629718F, 15.399918F, 11.273568F, 16.674295F, 13.255814F, 19.44186F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4737097);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(16.347082F, 34.103432F);
      ((Path)localObject2).lineTo(18.393309F, 36.052551F);
      ((Path)localObject2).lineTo(18.393309F, 36.052551F);
      ((Path)localObject2).cubicTo(18.723711F, 36.367271F, 19.241936F, 36.370655F, 19.57642F, 36.060276F);
      ((Path)localObject2).lineTo(21.677546F, 34.110565F);
      ((Path)localObject2).lineTo(21.677546F, 34.110565F);
      ((Path)localObject2).cubicTo(22.181849F, 33.642605F, 22.360359F, 32.919991F, 22.131973F, 32.27103F);
      ((Path)localObject2).lineTo(18.981232F, 23.318182F);
      ((Path)localObject2).lineTo(15.904492F, 32.292583F);
      ((Path)localObject2).lineTo(15.904492F, 32.292583F);
      ((Path)localObject2).cubicTo(15.685678F, 32.930836F, 15.858533F, 33.638069F, 16.347082F, 34.103432F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avp
 * JD-Core Version:    0.6.2
 */