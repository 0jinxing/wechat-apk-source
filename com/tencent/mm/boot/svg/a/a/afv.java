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

public final class afv extends c
{
  private final int height = 36;
  private final int width = 46;

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
        paramInt = 46;
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
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-16036);
      localCanvas.save();
      Object localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(25.915672F, 0.0F);
      ((Path)localObject1).cubicTo(25.97802F, 12.003458F, 26.092323F, 24.006916F, 25.863716F, 36.0F);
      ((Path)localObject1).cubicTo(19.75988F, 32.493511F, 13.654047F, 28.48876F, 7.201107F, 25.397118F);
      ((Path)localObject1).cubicTo(4.82152F, 25.034006F, 2.400369F, 25.241499F, 0.0F, 25.241499F);
      ((Path)localObject1).lineTo(0.0F, 10.696254F);
      ((Path)localObject1).cubicTo(2.400369F, 10.696254F, 4.82152F, 10.903747F, 7.211498F, 10.540634F);
      ((Path)localObject1).cubicTo(13.685221F, 7.500865F, 19.217047F, 3.892254F, 25.915672F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(34.0F, 8.687097F);
      ((Path)localObject2).cubicTo(37.385418F, 6.432258F, 40.822918F, 4.225806F, 44.239582F, 2.0F);
      ((Path)localObject2).cubicTo(44.822918F, 2.793548F, 45.40625F, 3.577419F, 46.0F, 4.370968F);
      ((Path)localObject2).cubicTo(42.5625F, 6.548387F, 39.177082F, 8.793549F, 35.760418F, 11.0F);
      ((Path)localObject2).cubicTo(35.1875F, 10.225806F, 34.59375F, 9.451613F, 34.0F, 8.687097F);
      ((Path)localObject2).lineTo(34.0F, 8.687097F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.0F, 16.0F);
      ((Path)localObject1).lineTo(46.0F, 19.0F);
      ((Path)localObject1).lineTo(34.0F, 19.0F);
      ((Path)localObject1).lineTo(34.0F, 16.0F);
      ((Path)localObject1).lineTo(46.0F, 16.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(34.0F, 26.688448F);
      ((Path)localObject1).cubicTo(34.535355F, 25.806301F, 35.050507F, 24.913652F, 35.535355F, 24.0F);
      ((Path)localObject1).cubicTo(39.010101F, 26.121353F, 42.505051F, 28.211203F, 46.0F, 30.290548F);
      ((Path)localObject1).cubicTo(45.626263F, 30.973162F, 44.878788F, 32.317387F, 44.515152F, 33.0F);
      ((Path)localObject1).cubicTo(41.0F, 30.899651F, 37.505051F, 28.788797F, 34.0F, 26.688448F);
      ((Path)localObject1).lineTo(34.0F, 26.688448F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afv
 * JD-Core Version:    0.6.2
 */