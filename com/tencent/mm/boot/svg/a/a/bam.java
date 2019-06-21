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

public final class bam extends c
{
  private final int height = 240;
  private final int width = 240;

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
        paramInt = 240;
        continue;
        paramInt = 240;
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
      Object localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-407039);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(120.0F, 0.0F);
      ((Path)localObject2).cubicTo(186.27417F, 0.0F, 240.0F, 53.72583F, 240.0F, 120.0F);
      ((Path)localObject2).cubicTo(240.0F, 186.27417F, 186.27417F, 240.0F, 120.0F, 240.0F);
      ((Path)localObject2).cubicTo(53.72583F, 240.0F, 0.0F, 186.27417F, 0.0F, 120.0F);
      ((Path)localObject2).cubicTo(0.0F, 53.72583F, 53.72583F, 0.0F, 120.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(120.0F, 21.0F);
      ((Path)localObject3).cubicTo(174.67619F, 21.0F, 219.0F, 65.323807F, 219.0F, 120.0F);
      ((Path)localObject3).cubicTo(219.0F, 174.67619F, 174.67619F, 219.0F, 120.0F, 219.0F);
      ((Path)localObject3).cubicTo(65.323807F, 219.0F, 21.0F, 174.67619F, 21.0F, 120.0F);
      ((Path)localObject3).cubicTo(21.0F, 65.323807F, 65.323807F, 21.0F, 120.0F, 21.0F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 102, 4);
      localCanvas.drawPath((Path)localObject3, c.a((Paint)localObject2, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-407039);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(125.57143F, 108.0F);
      ((Path)localObject1).lineTo(142.28572F, 72.0F);
      ((Path)localObject1).lineTo(159.0F, 72.0F);
      ((Path)localObject1).lineTo(142.28572F, 108.0F);
      ((Path)localObject1).lineTo(159.0F, 108.0F);
      ((Path)localObject1).lineTo(159.0F, 123.0F);
      ((Path)localObject1).lineTo(126.0F, 123.0F);
      ((Path)localObject1).lineTo(126.0F, 135.0F);
      ((Path)localObject1).lineTo(159.0F, 135.0F);
      ((Path)localObject1).lineTo(159.0F, 150.0F);
      ((Path)localObject1).lineTo(126.0F, 150.0F);
      ((Path)localObject1).lineTo(126.0F, 171.0F);
      ((Path)localObject1).lineTo(114.0F, 171.0F);
      ((Path)localObject1).lineTo(114.0F, 150.0F);
      ((Path)localObject1).lineTo(81.0F, 150.0F);
      ((Path)localObject1).lineTo(81.0F, 135.0F);
      ((Path)localObject1).lineTo(114.0F, 135.0F);
      ((Path)localObject1).lineTo(114.0F, 123.0F);
      ((Path)localObject1).lineTo(81.0F, 123.0F);
      ((Path)localObject1).lineTo(81.0F, 108.0F);
      ((Path)localObject1).lineTo(97.714287F, 108.0F);
      ((Path)localObject1).lineTo(81.0F, 72.0F);
      ((Path)localObject1).lineTo(97.714287F, 72.0F);
      ((Path)localObject1).lineTo(114.42857F, 108.0F);
      ((Path)localObject1).lineTo(125.57143F, 108.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bam
 * JD-Core Version:    0.6.2
 */