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

public final class qp extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-12953699);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(192.0F, 0.0F);
      ((Path)localObject).lineTo(192.0F, 192.0F);
      ((Path)localObject).lineTo(0.0F, 192.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(104.72727F, 192.0F);
      ((Path)localObject).lineTo(104.72727F, 117.81818F);
      ((Path)localObject).lineTo(80.0F, 117.81818F);
      ((Path)localObject).lineTo(80.0F, 87.272728F);
      ((Path)localObject).lineTo(104.72727F, 87.272728F);
      ((Path)localObject).lineTo(104.72727F, 61.090908F);
      ((Path)localObject).cubicTo(104.62603F, 44.320255F, 121.20966F, 29.09091F, 138.18182F, 29.09091F);
      ((Path)localObject).lineTo(164.36363F, 29.09091F);
      ((Path)localObject).lineTo(164.36363F, 58.18182F);
      ((Path)localObject).lineTo(148.36363F, 58.18182F);
      ((Path)localObject).cubicTo(137.98802F, 58.097572F, 133.74586F, 62.343899F, 133.81818F, 72.727272F);
      ((Path)localObject).lineTo(133.81818F, 87.272728F);
      ((Path)localObject).lineTo(164.36363F, 87.272728F);
      ((Path)localObject).lineTo(158.54546F, 117.81818F);
      ((Path)localObject).lineTo(133.81818F, 117.81818F);
      ((Path)localObject).lineTo(133.81818F, 192.0F);
      ((Path)localObject).lineTo(104.72727F, 192.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qp
 * JD-Core Version:    0.6.2
 */