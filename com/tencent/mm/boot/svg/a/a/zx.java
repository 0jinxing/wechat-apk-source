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

public final class zx extends c
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(21.0F, 36.0F);
      ((Path)localObject).cubicTo(21.0F, 39.313202F, 18.3132F, 42.0F, 15.0F, 42.0F);
      ((Path)localObject).cubicTo(11.6868F, 42.0F, 9.0F, 39.313202F, 9.0F, 36.0F);
      ((Path)localObject).cubicTo(9.0F, 32.6856F, 11.6868F, 30.0F, 15.0F, 30.0F);
      ((Path)localObject).cubicTo(18.3132F, 30.0F, 21.0F, 32.6856F, 21.0F, 36.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 30.0F);
      ((Path)localObject).cubicTo(39.313202F, 30.0F, 42.0F, 32.6856F, 42.0F, 36.0F);
      ((Path)localObject).cubicTo(42.0F, 39.313202F, 39.313202F, 42.0F, 36.0F, 42.0F);
      ((Path)localObject).cubicTo(32.686798F, 42.0F, 30.0F, 39.313202F, 30.0F, 36.0F);
      ((Path)localObject).cubicTo(30.0F, 32.6856F, 32.686798F, 30.0F, 36.0F, 30.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(57.0F, 30.0F);
      ((Path)localObject).cubicTo(60.313202F, 30.0F, 63.0F, 32.6856F, 63.0F, 36.0F);
      ((Path)localObject).cubicTo(63.0F, 39.313202F, 60.313202F, 42.0F, 57.0F, 42.0F);
      ((Path)localObject).cubicTo(53.686798F, 42.0F, 51.0F, 39.313202F, 51.0F, 36.0F);
      ((Path)localObject).cubicTo(51.0F, 32.6856F, 53.686798F, 30.0F, 57.0F, 30.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zx
 * JD-Core Version:    0.6.2
 */