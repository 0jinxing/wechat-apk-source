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

public final class awp extends c
{
  private final int height = 63;
  private final int width = 63;

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
        paramInt = 63;
        continue;
        paramInt = 63;
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
      ((Paint)localObject).setColor(-1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(35.0F, 20.0F);
      ((Path)localObject).lineTo(50.492165F, 20.0F);
      ((Path)localObject).cubicTo(51.322575F, 20.0F, 52.0F, 19.326305F, 52.0F, 18.495262F);
      ((Path)localObject).lineTo(52.0F, 13.504739F);
      ((Path)localObject).cubicTo(52.0F, 12.668316F, 51.324917F, 12.0F, 50.492165F, 12.0F);
      ((Path)localObject).lineTo(12.507836F, 12.0F);
      ((Path)localObject).cubicTo(11.677424F, 12.0F, 11.0F, 12.673695F, 11.0F, 13.504739F);
      ((Path)localObject).lineTo(11.0F, 18.495262F);
      ((Path)localObject).cubicTo(11.0F, 19.331684F, 11.675081F, 20.0F, 12.507836F, 20.0F);
      ((Path)localObject).lineTo(27.0F, 20.0F);
      ((Path)localObject).lineTo(27.0F, 52.505199F);
      ((Path)localObject).cubicTo(27.0F, 53.323269F, 27.673695F, 54.0F, 28.504738F, 54.0F);
      ((Path)localObject).lineTo(33.495262F, 54.0F);
      ((Path)localObject).cubicTo(34.331684F, 54.0F, 35.0F, 53.330753F, 35.0F, 52.505199F);
      ((Path)localObject).lineTo(35.0F, 20.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awp
 * JD-Core Version:    0.6.2
 */