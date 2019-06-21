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

public final class aqw extends c
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
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-15683841);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(186.0F, 94.148148F);
      ((Path)localObject2).cubicTo(186.0F, 41.636444F, 144.36356F, 0.0F, 91.851852F, 0.0F);
      ((Path)localObject2).cubicTo(41.636444F, 0.0F, 0.0F, 41.636444F, 0.0F, 94.148148F);
      ((Path)localObject2).cubicTo(0.0F, 144.36356F, 41.636444F, 186.0F, 91.851852F, 186.0F);
      ((Path)localObject2).cubicTo(144.36356F, 186.0F, 186.0F, 144.36356F, 186.0F, 94.148148F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(96.539574F, 101.59992F);
      ((Path)localObject1).lineTo(93.960793F, 37.990128F);
      ((Path)localObject1).cubicTo(93.939034F, 37.453369F, 93.474998F, 37.0F, 92.925255F, 37.0F);
      ((Path)localObject1).lineTo(84.916054F, 37.0F);
      ((Path)localObject1).cubicTo(84.37632F, 37.0F, 83.902679F, 37.443295F, 83.880516F, 37.990128F);
      ((Path)localObject1).lineTo(81.001671F, 109.00153F);
      ((Path)localObject1).cubicTo(80.974144F, 109.68064F, 81.288383F, 110.28124F, 81.791107F, 110.64247F);
      ((Path)localObject1).cubicTo(81.98214F, 110.94476F, 82.257759F, 111.19843F, 82.60479F, 111.36398F);
      ((Path)localObject1).lineTo(129.58261F, 133.77519F);
      ((Path)localObject1).cubicTo(130.08742F, 134.01601F, 130.71049F, 133.82021F, 130.98582F, 133.34332F);
      ((Path)localObject1).lineTo(133.9888F, 128.14203F);
      ((Path)localObject1).cubicTo(134.26079F, 127.67092F, 134.11714F, 127.02809F, 133.66052F, 126.71911F);
      ((Path)localObject1).lineTo(96.539574F, 101.59992F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aqw
 * JD-Core Version:    0.6.2
 */