package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class akh extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-372399);
      ((Paint)localObject3).setStrokeWidth(3.756522F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(33.423096F, 23.393011F);
      ((Path)localObject2).cubicTo(33.423096F, 28.885603F, 28.958527F, 33.335987F, 23.453514F, 33.335987F);
      ((Path)localObject2).cubicTo(17.946226F, 33.335987F, 13.483933F, 28.885603F, 13.483933F, 23.393011F);
      ((Path)localObject2).cubicTo(13.483933F, 17.900419F, 17.946226F, 13.450035F, 23.453514F, 13.450035F);
      ((Path)localObject2).cubicTo(28.958527F, 13.450035F, 33.423096F, 17.900419F, 33.423096F, 23.393011F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(36.644825F, 43.308029F);
      ((Path)localObject2).lineTo(23.453743F, 56.466183F);
      ((Path)localObject2).lineTo(14.822849F, 47.858318F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(40.033207F, 39.928688F);
      ((Path)localObject3).cubicTo(49.190014F, 30.796316F, 49.190014F, 15.989706F, 40.033207F, 6.857335F);
      ((Path)localObject3).cubicTo(30.876402F, -2.275036F, 16.030172F, -2.275036F, 6.873366F, 6.857335F);
      ((Path)localObject3).cubicTo(-2.28344F, 15.989706F, -2.28344F, 30.796316F, 6.873366F, 39.928688F);
      ((Path)localObject3).lineTo(11.679438F, 44.721935F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.akh
 * JD-Core Version:    0.6.2
 */