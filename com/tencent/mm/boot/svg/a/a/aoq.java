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

public final class aoq extends c
{
  private final int height = 36;
  private final int width = 36;

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
        paramInt = 36;
        continue;
        paramInt = 36;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-15819547);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(18.0F, 36.0F);
      ((Path)localObject2).cubicTo(8.058874F, 36.0F, 0.0F, 27.941126F, 0.0F, 18.0F);
      ((Path)localObject2).cubicTo(0.0F, 8.058874F, 8.058874F, 0.0F, 18.0F, 0.0F);
      ((Path)localObject2).cubicTo(27.941126F, 0.0F, 36.0F, 8.058874F, 36.0F, 18.0F);
      ((Path)localObject2).cubicTo(36.0F, 27.941126F, 27.941126F, 36.0F, 18.0F, 36.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.882187F, 21.850769F);
      ((Path)localObject1).lineTo(25.960957F, 11.772F);
      ((Path)localObject1).lineTo(27.873507F, 13.684549F);
      ((Path)localObject1).lineTo(17.159441F, 24.394556F);
      ((Path)localObject1).cubicTo(16.45635F, 25.097353F, 15.316654F, 25.097116F, 14.613856F, 24.394026F);
      ((Path)localObject1).cubicTo(14.613791F, 24.393961F, 14.613726F, 24.393896F, 14.613661F, 24.393831F);
      ((Path)localObject1).lineTo(9.0F, 18.775719F);
      ((Path)localObject1).lineTo(10.903567F, 16.87215F);
      ((Path)localObject1).lineTo(15.882187F, 21.850769F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aoq
 * JD-Core Version:    0.6.2
 */