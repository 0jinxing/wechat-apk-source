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

public final class axg extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
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
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(46.622131F, 76.745499F);
      ((Path)localObject2).cubicTo(46.622131F, 76.745499F, 27.0F, 57.136356F, 27.0F, 41.21418F);
      ((Path)localObject2).cubicTo(27.0F, 29.446882F, 36.40202F, 20.0F, 48.304348F, 20.0F);
      ((Path)localObject2).cubicTo(59.59798F, 20.0F, 69.0F, 29.446882F, 69.0F, 41.21418F);
      ((Path)localObject2).cubicTo(69.0F, 57.136356F, 49.377869F, 76.745499F, 49.377869F, 76.745499F);
      ((Path)localObject2).cubicTo(48.628487F, 77.53978F, 47.383106F, 77.54187F, 46.622131F, 76.745499F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(48.0F, 48.0905F);
      ((Path)localObject2).cubicTo(51.865993F, 48.0905F, 55.0F, 44.946362F, 55.0F, 41.067875F);
      ((Path)localObject2).cubicTo(55.0F, 37.189384F, 51.865993F, 34.04525F, 48.0F, 34.04525F);
      ((Path)localObject2).cubicTo(44.134007F, 34.04525F, 41.0F, 37.189384F, 41.0F, 41.067875F);
      ((Path)localObject2).cubicTo(41.0F, 44.946362F, 44.134007F, 48.0905F, 48.0F, 48.0905F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(46.622131F, 76.745499F);
      ((Path)localObject1).cubicTo(46.622131F, 76.745499F, 27.0F, 57.136356F, 27.0F, 41.21418F);
      ((Path)localObject1).cubicTo(27.0F, 29.446882F, 36.40202F, 20.0F, 48.304348F, 20.0F);
      ((Path)localObject1).cubicTo(59.59798F, 20.0F, 69.0F, 29.446882F, 69.0F, 41.21418F);
      ((Path)localObject1).cubicTo(69.0F, 57.136356F, 49.377869F, 76.745499F, 49.377869F, 76.745499F);
      ((Path)localObject1).cubicTo(48.628487F, 77.53978F, 47.383106F, 77.54187F, 46.622131F, 76.745499F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(48.0F, 48.0905F);
      ((Path)localObject1).cubicTo(51.865993F, 48.0905F, 55.0F, 44.946362F, 55.0F, 41.067875F);
      ((Path)localObject1).cubicTo(55.0F, 37.189384F, 51.865993F, 34.04525F, 48.0F, 34.04525F);
      ((Path)localObject1).cubicTo(44.134007F, 34.04525F, 41.0F, 37.189384F, 41.0F, 41.067875F);
      ((Path)localObject1).cubicTo(41.0F, 44.946362F, 44.134007F, 48.0905F, 48.0F, 48.0905F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.axg
 * JD-Core Version:    0.6.2
 */