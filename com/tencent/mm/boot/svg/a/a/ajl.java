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

public final class ajl extends c
{
  private final int height = 24;
  private final int width = 120;

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
        paramInt = 120;
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
      localPaint1 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint1.setColor(-1);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(60.0F, 24.0F);
      ((Path)localObject).cubicTo(66.627419F, 24.0F, 72.0F, 18.627417F, 72.0F, 12.0F);
      ((Path)localObject).cubicTo(72.0F, 5.372583F, 66.627419F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject).cubicTo(53.372581F, 0.0F, 48.0F, 5.372583F, 48.0F, 12.0F);
      ((Path)localObject).cubicTo(48.0F, 18.627417F, 53.372581F, 24.0F, 60.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 24.0F);
      ((Path)localObject).cubicTo(18.627417F, 24.0F, 24.0F, 18.627417F, 24.0F, 12.0F);
      ((Path)localObject).cubicTo(24.0F, 5.372583F, 18.627417F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject).cubicTo(5.372583F, 0.0F, 0.0F, 5.372583F, 0.0F, 12.0F);
      ((Path)localObject).cubicTo(0.0F, 18.627417F, 5.372583F, 24.0F, 12.0F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(108.0F, 24.0F);
      ((Path)localObject).cubicTo(114.62742F, 24.0F, 120.0F, 18.627417F, 120.0F, 12.0F);
      ((Path)localObject).cubicTo(120.0F, 5.372583F, 114.62742F, 0.0F, 108.0F, 0.0F);
      ((Path)localObject).cubicTo(101.37258F, 0.0F, 96.0F, 5.372583F, 96.0F, 12.0F);
      ((Path)localObject).cubicTo(96.0F, 18.627417F, 101.37258F, 24.0F, 108.0F, 24.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 76, 4);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(12.0F, 0.0F);
      ((Path)localObject).cubicTo(18.627419F, 0.0F, 24.0F, 5.372582F, 24.0F, 12.0F);
      ((Path)localObject).cubicTo(24.0F, 18.627419F, 18.627419F, 24.0F, 12.0F, 24.0F);
      ((Path)localObject).cubicTo(5.372582F, 24.0F, 0.0F, 18.627419F, 0.0F, 12.0F);
      ((Path)localObject).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.drawPath((Path)localObject, c.a(localPaint1, paramArrayOfObject));
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ajl
 * JD-Core Version:    0.6.2
 */