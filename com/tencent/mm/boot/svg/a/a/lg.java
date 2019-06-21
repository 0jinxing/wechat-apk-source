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

public final class lg extends c
{
  private final int height = 102;
  private final int width = 102;

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
        paramInt = 102;
        continue;
        paramInt = 102;
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
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(51.0F, 102.0F);
      ((Path)localObject2).cubicTo(79.166519F, 102.0F, 102.0F, 79.166519F, 102.0F, 51.0F);
      ((Path)localObject2).cubicTo(102.0F, 22.833477F, 79.166519F, 0.0F, 51.0F, 0.0F);
      ((Path)localObject2).cubicTo(22.833477F, 0.0F, 0.0F, 22.833477F, 0.0F, 51.0F);
      ((Path)localObject2).cubicTo(0.0F, 79.166519F, 22.833477F, 102.0F, 51.0F, 102.0F);
      ((Path)localObject2).lineTo(51.0F, 102.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(51.0F, 98.0F);
      ((Path)localObject2).cubicTo(76.957382F, 98.0F, 98.0F, 76.957382F, 98.0F, 51.0F);
      ((Path)localObject2).cubicTo(98.0F, 25.042616F, 76.957382F, 4.0F, 51.0F, 4.0F);
      ((Path)localObject2).cubicTo(25.042616F, 4.0F, 4.0F, 25.042616F, 4.0F, 51.0F);
      ((Path)localObject2).cubicTo(4.0F, 76.957382F, 25.042616F, 98.0F, 51.0F, 98.0F);
      ((Path)localObject2).lineTo(51.0F, 98.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(60.046738F, 37.910957F);
      ((Path)localObject1).cubicTo(69.133621F, 37.910957F, 76.5F, 45.204285F, 76.5F, 54.205479F);
      ((Path)localObject1).cubicTo(76.5F, 63.204693F, 69.134888F, 70.5F, 60.046738F, 70.5F);
      ((Path)localObject1).lineTo(29.047552F, 70.5F);
      ((Path)localObject1).cubicTo(28.745148F, 70.5F, 28.5F, 70.256561F, 28.5F, 69.968216F);
      ((Path)localObject1).lineTo(28.5F, 65.689323F);
      ((Path)localObject1).cubicTo(28.5F, 65.395622F, 28.735804F, 65.157532F, 29.047586F, 65.157532F);
      ((Path)localObject1).lineTo(60.048687F, 65.157532F);
      ((Path)localObject1).cubicTo(66.152725F, 65.157532F, 71.106743F, 60.254131F, 71.106743F, 54.205479F);
      ((Path)localObject1).cubicTo(71.106743F, 48.155499F, 66.155884F, 43.253426F, 60.048687F, 43.253426F);
      ((Path)localObject1).lineTo(40.83506F, 43.253426F);
      ((Path)localObject1).lineTo(40.83506F, 48.971561F);
      ((Path)localObject1).cubicTo(40.83506F, 49.56155F, 40.448963F, 49.755066F, 39.972683F, 49.402626F);
      ((Path)localObject1).lineTo(28.857897F, 41.177834F);
      ((Path)localObject1).cubicTo(28.379784F, 40.824039F, 28.38162F, 40.253983F, 28.857897F, 39.901543F);
      ((Path)localObject1).lineTo(39.972683F, 31.676752F);
      ((Path)localObject1).cubicTo(40.450798F, 31.322954F, 40.83506F, 31.517307F, 40.83506F, 32.107815F);
      ((Path)localObject1).lineTo(40.83506F, 37.910957F);
      ((Path)localObject1).lineTo(60.046738F, 37.910957F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.lg
 * JD-Core Version:    0.6.2
 */