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

public final class age extends c
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
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-2147483648);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 9.6F);
      ((Path)localObject2).cubicTo(0.0F, 4.298066F, 4.298066F, 0.0F, 9.6F, 0.0F);
      ((Path)localObject2).lineTo(86.400002F, 0.0F);
      ((Path)localObject2).cubicTo(91.701935F, 0.0F, 96.0F, 4.298066F, 96.0F, 9.6F);
      ((Path)localObject2).lineTo(96.0F, 86.400002F);
      ((Path)localObject2).cubicTo(96.0F, 91.701935F, 91.701935F, 96.0F, 86.400002F, 96.0F);
      ((Path)localObject2).lineTo(9.6F, 96.0F);
      ((Path)localObject2).cubicTo(4.298066F, 96.0F, 0.0F, 91.701935F, 0.0F, 86.400002F);
      ((Path)localObject2).lineTo(0.0F, 9.6F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(48.0F, 45.001343F);
      ((Path)localObject1).lineTo(30.427227F, 27.428572F);
      ((Path)localObject1).lineTo(27.428572F, 30.427227F);
      ((Path)localObject1).lineTo(45.001343F, 48.0F);
      ((Path)localObject1).lineTo(27.428572F, 65.572769F);
      ((Path)localObject1).lineTo(30.427227F, 68.571426F);
      ((Path)localObject1).lineTo(48.0F, 50.998657F);
      ((Path)localObject1).lineTo(65.572769F, 68.571426F);
      ((Path)localObject1).lineTo(68.571426F, 65.572769F);
      ((Path)localObject1).lineTo(50.998657F, 48.0F);
      ((Path)localObject1).lineTo(68.571426F, 30.427227F);
      ((Path)localObject1).lineTo(65.572769F, 27.428572F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.age
 * JD-Core Version:    0.6.2
 */