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

public final class ob extends c
{
  private final int height = 22;
  private final int width = 20;

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
        paramInt = 20;
        continue;
        paramInt = 22;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-12404711);
      localCanvas.saveLayerAlpha(null, 245, 4);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(10.0F, 0.0F);
      ((Path)localObject).cubicTo(13.33002F, 3.351164F, 16.779324F, 6.583703F, 20.0F, 10.043607F);
      ((Path)localObject).cubicTo(19.990059F, 11.556079F, 19.264414F, 12.188747F, 17.823061F, 11.951496F);
      ((Path)localObject).cubicTo(15.129225F, 9.470251F, 12.624254F, 6.791297F, 10.00994F, 4.240854F);
      ((Path)localObject).cubicTo(7.365805F, 6.781412F, 4.870775F, 9.470251F, 2.176938F, 11.951496F);
      ((Path)localObject).cubicTo(0.7355865F, 12.188747F, 0.009940358F, 11.546193F, 0.0F, 10.043607F);
      ((Path)localObject).cubicTo(3.210736F, 6.573817F, 6.679921F, 3.351164F, 10.0F, 0.0F);
      ((Path)localObject).lineTo(10.0F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(20.0F, 20.046492F);
      ((Path)localObject).cubicTo(19.990059F, 21.549509F, 19.264414F, 22.18236F, 17.833002F, 21.954929F);
      ((Path)localObject).cubicTo(15.129225F, 19.472971F, 12.624254F, 16.793247F, 10.00994F, 14.242071F);
      ((Path)localObject).cubicTo(7.365805F, 16.793247F, 4.870775F, 19.472971F, 2.166998F, 21.954929F);
      ((Path)localObject).cubicTo(0.7355865F, 22.18236F, 0.009940358F, 21.549509F, 0.0F, 20.046492F);
      ((Path)localObject).cubicTo(3.210736F, 16.575705F, 6.679921F, 13.362015F, 10.0F, 10.0F);
      ((Path)localObject).cubicTo(13.33002F, 13.352126F, 16.789265F, 16.585594F, 20.0F, 20.046492F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ob
 * JD-Core Version:    0.6.2
 */