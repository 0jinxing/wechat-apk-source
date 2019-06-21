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

public final class bf extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      ((Paint)localObject).setColor(-15028967);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(11.261719F, 22.134476F);
      ((Path)localObject).cubicTo(11.261719F, 22.134476F, 4.0F, 16.018278F, 4.0F, 10.0F);
      ((Path)localObject).cubicTo(4.0F, 5.581722F, 7.581722F, 2.0F, 12.0F, 2.0F);
      ((Path)localObject).cubicTo(16.418278F, 2.0F, 20.0F, 5.581722F, 20.0F, 10.0F);
      ((Path)localObject).cubicTo(20.0F, 16.018278F, 12.738281F, 22.134476F, 12.738281F, 22.134476F);
      ((Path)localObject).cubicTo(12.333565F, 22.50602F, 11.66946F, 22.502035F, 11.261719F, 22.134476F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 13.2F);
      ((Path)localObject).cubicTo(13.767311F, 13.2F, 15.2F, 11.767311F, 15.2F, 10.0F);
      ((Path)localObject).cubicTo(15.2F, 8.232689F, 13.767311F, 6.8F, 12.0F, 6.8F);
      ((Path)localObject).cubicTo(10.232689F, 6.8F, 8.8F, 8.232689F, 8.8F, 10.0F);
      ((Path)localObject).cubicTo(8.8F, 11.767311F, 10.232689F, 13.2F, 12.0F, 13.2F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bf
 * JD-Core Version:    0.6.2
 */