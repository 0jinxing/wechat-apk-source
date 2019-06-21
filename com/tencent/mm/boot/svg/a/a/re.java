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

public final class re extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-14187817);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(192.0F, 0.0F);
      ((Path)localObject3).lineTo(192.0F, 192.0F);
      ((Path)localObject3).lineTo(0.0F, 192.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(31.0F, 60.0F);
      ((Path)localObject2).lineTo(31.0F, 136.9996F);
      ((Path)localObject2).cubicTo(31.0F, 138.65668F, 32.350418F, 140.0F, 33.990707F, 140.0F);
      ((Path)localObject2).lineTo(158.00929F, 140.0F);
      ((Path)localObject2).cubicTo(159.66101F, 140.0F, 161.0F, 138.65442F, 161.0F, 136.9996F);
      ((Path)localObject2).lineTo(161.0F, 60.0F);
      ((Path)localObject2).lineTo(103.2854F, 107.40642F);
      ((Path)localObject2).cubicTo(99.163788F, 110.79189F, 92.838867F, 110.79407F, 88.7146F, 107.40642F);
      ((Path)localObject2).lineTo(31.0F, 60.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(32.661129F, 52.0F);
      ((Path)localObject1).cubicTo(31.001602F, 52.0F, 30.711802F, 52.82119F, 32.017536F, 53.837048F);
      ((Path)localObject1).lineTo(93.639847F, 101.77914F);
      ((Path)localObject1).cubicTo(94.943932F, 102.79372F, 97.05661F, 102.795F, 98.362343F, 101.77914F);
      ((Path)localObject1).lineTo(159.98466F, 53.837048F);
      ((Path)localObject1).cubicTo(161.28874F, 52.822475F, 161.01111F, 52.0F, 159.34106F, 52.0F);
      ((Path)localObject1).lineTo(32.661129F, 52.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.re
 * JD-Core Version:    0.6.2
 */