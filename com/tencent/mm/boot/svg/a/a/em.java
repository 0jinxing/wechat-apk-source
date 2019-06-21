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

public final class em extends c
{
  private final int height = 45;
  private final int width = 45;

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
        paramInt = 45;
        continue;
        paramInt = 45;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      Object localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(1275068416);
      localPaint2.setColor(-1);
      localPaint2.setStrokeWidth(2.3F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(22.5F, 1.15F);
      ((Path)localObject2).cubicTo(34.291279F, 1.15F, 43.849998F, 10.70872F, 43.849998F, 22.5F);
      ((Path)localObject2).cubicTo(43.849998F, 34.291279F, 34.291279F, 43.849998F, 22.5F, 43.849998F);
      ((Path)localObject2).cubicTo(10.70872F, 43.849998F, 1.15F, 34.291279F, 1.15F, 22.5F);
      ((Path)localObject2).cubicTo(1.15F, 10.70872F, 10.70872F, 1.15F, 22.5F, 1.15F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(29.748446F, 23.296038F);
      ((Path)localObject1).lineTo(19.473919F, 30.033487F);
      ((Path)localObject1).cubicTo(19.034281F, 30.321777F, 18.444176F, 30.199085F, 18.155884F, 29.759445F);
      ((Path)localObject1).cubicTo(18.05418F, 29.604349F, 18.0F, 29.422918F, 18.0F, 29.23745F);
      ((Path)localObject1).lineTo(18.0F, 15.762551F);
      ((Path)localObject1).cubicTo(18.0F, 15.236818F, 18.426191F, 14.810628F, 18.951923F, 14.810628F);
      ((Path)localObject1).cubicTo(19.137392F, 14.810628F, 19.318823F, 14.864809F, 19.473919F, 14.966513F);
      ((Path)localObject1).lineTo(29.748446F, 21.703962F);
      ((Path)localObject1).cubicTo(30.188086F, 21.992252F, 30.310778F, 22.582357F, 30.022488F, 23.021997F);
      ((Path)localObject1).cubicTo(29.950897F, 23.131168F, 29.857618F, 23.224449F, 29.748446F, 23.296038F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.em
 * JD-Core Version:    0.6.2
 */