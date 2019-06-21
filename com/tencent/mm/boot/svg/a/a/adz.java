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

public final class adz extends c
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
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-350642);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(44.999012F, 71.646385F);
      ((Path)localObject).lineTo(18.061729F, 87.246506F);
      ((Path)localObject).cubicTo(16.15247F, 88.352211F, 15.124873F, 87.531441F, 15.765567F, 85.416451F);
      ((Path)localObject).lineTo(24.811031F, 55.556461F);
      ((Path)localObject).lineTo(1.004314F, 34.664188F);
      ((Path)localObject).cubicTo(-0.6587564F, 33.204716F, -0.2076475F, 32.021576F, 1.996635F, 32.021576F);
      ((Path)localObject).lineTo(31.459358F, 32.021576F);
      ((Path)localObject).lineTo(43.445843F, 3.529796F);
      ((Path)localObject).cubicTo(44.303635F, 1.49083F, 45.693748F, 1.489306F, 46.552185F, 3.529796F);
      ((Path)localObject).lineTo(58.538666F, 32.021576F);
      ((Path)localObject).lineTo(88.001389F, 32.021576F);
      ((Path)localObject).cubicTo(90.212502F, 32.021576F, 90.656677F, 33.204803F, 88.993713F, 34.664188F);
      ((Path)localObject).lineTo(65.186996F, 55.556461F);
      ((Path)localObject).lineTo(74.23246F, 85.416451F);
      ((Path)localObject).cubicTo(74.873581F, 87.532867F, 73.844276F, 88.351463F, 71.936295F, 87.246506F);
      ((Path)localObject).lineTo(44.999012F, 71.646385F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.adz
 * JD-Core Version:    0.6.2
 */