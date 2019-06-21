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

public final class aug extends c
{
  private final int height = 186;
  private final int width = 186;

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
        paramInt = 186;
        continue;
        paramInt = 186;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint2.setColor(-2105120);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(186.0F, 0.0F);
      ((Path)localObject).lineTo(186.0F, 186.0F);
      ((Path)localObject).lineTo(0.0F, 186.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.0F, 3.0F);
      ((Path)localObject).lineTo(3.0F, 183.0F);
      ((Path)localObject).lineTo(183.0F, 183.0F);
      ((Path)localObject).lineTo(183.0F, 3.0F);
      ((Path)localObject).lineTo(3.0F, 3.0F);
      ((Path)localObject).lineTo(3.0F, 3.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(90.0F, 33.0F);
      ((Path)localObject).lineTo(96.0F, 33.0F);
      ((Path)localObject).lineTo(96.0F, 90.0F);
      ((Path)localObject).lineTo(153.0F, 90.0F);
      ((Path)localObject).lineTo(153.0F, 96.0F);
      ((Path)localObject).lineTo(96.0F, 96.0F);
      ((Path)localObject).lineTo(96.0F, 153.0F);
      ((Path)localObject).lineTo(90.0F, 153.0F);
      ((Path)localObject).lineTo(90.0F, 96.0F);
      ((Path)localObject).lineTo(33.0F, 96.0F);
      ((Path)localObject).lineTo(33.0F, 90.0F);
      ((Path)localObject).lineTo(90.0F, 90.0F);
      ((Path)localObject).lineTo(90.0F, 33.0F);
      ((Path)localObject).lineTo(90.0F, 33.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aug
 * JD-Core Version:    0.6.2
 */