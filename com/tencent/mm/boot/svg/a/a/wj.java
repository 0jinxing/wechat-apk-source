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

public final class wj extends c
{
  private final int height = 32;
  private final int width = 33;

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
        paramInt = 33;
        continue;
        paramInt = 32;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-4547478);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(9.0F, 0.0F);
      ((Path)localObject).cubicTo(4.469839F, 0.0F, 1.286665E-007F, 4.280687F, 0.0F, 12.0F);
      ((Path)localObject).cubicTo(-1.286665E-007F, 19.498301F, 7.829132F, 28.649586F, 16.5F, 31.5F);
      ((Path)localObject).cubicTo(25.447317F, 28.649586F, 33.0F, 19.289865F, 33.0F, 12.0F);
      ((Path)localObject).cubicTo(33.0F, 4.072251F, 28.713329F, 1.044223E-007F, 24.0F, 0.0F);
      ((Path)localObject).cubicTo(19.675785F, -9.371384E-008F, 17.939146F, 1.543965F, 16.5F, 3.0F);
      ((Path)localObject).cubicTo(15.07374F, 1.543965F, 12.953914F, 0.0F, 9.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(9.965287F, 4.0F);
      ((Path)localObject).cubicTo(7.320104F, 4.0F, 4.0F, 6.783052F, 4.0F, 11.904762F);
      ((Path)localObject).cubicTo(4.0F, 17.026472F, 9.405654F, 24.647278F, 16.5F, 27.0F);
      ((Path)localObject).cubicTo(23.820532F, 24.647278F, 29.0F, 15.826896F, 29.0F, 11.904762F);
      ((Path)localObject).cubicTo(29.0F, 7.982628F, 26.492723F, 4.0F, 22.636364F, 4.0F);
      ((Path)localObject).cubicTo(19.09837F, 4.0F, 17.274794F, 7.602714F, 16.5F, 9.0F);
      ((Path)localObject).cubicTo(15.76442F, 7.602714F, 12.610471F, 4.0F, 9.965287F, 4.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wj
 * JD-Core Version:    0.6.2
 */