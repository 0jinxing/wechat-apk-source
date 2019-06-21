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

public final class aon extends c
{
  private final int height = 24;
  private final int width = 30;

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
        paramInt = 30;
        continue;
        paramInt = 24;
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
      Object localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(26.0F, 0.0F);
      ((Path)localObject2).lineTo(26.0F, 20.0F);
      ((Path)localObject2).lineTo(0.0F, 20.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(24.0F, 2.0F);
      ((Path)localObject2).lineTo(2.0F, 2.0F);
      ((Path)localObject2).lineTo(2.0F, 17.0F);
      ((Path)localObject2).lineTo(24.0F, 17.0F);
      ((Path)localObject2).lineTo(24.0F, 2.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(28.0F, 23.0F);
      ((Path)localObject3).lineTo(29.0F, 23.0F);
      ((Path)localObject3).lineTo(29.0F, 3.0F);
      ((Path)localObject3).lineTo(27.0F, 3.0F);
      ((Path)localObject3).lineTo(27.0F, 21.0F);
      ((Path)localObject3).lineTo(3.0F, 21.0F);
      ((Path)localObject3).lineTo(3.0F, 23.0F);
      ((Path)localObject3).lineTo(28.0F, 23.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(19.784946F, 8.898396F);
      ((Path)localObject1).lineTo(15.462585F, 11.916007F);
      ((Path)localObject1).lineTo(8.518518F, 6.545455F);
      ((Path)localObject1).lineTo(0.0F, 13.368984F);
      ((Path)localObject1).lineTo(0.0F, 18.545454F);
      ((Path)localObject1).lineTo(25.555555F, 18.545454F);
      ((Path)localObject1).lineTo(25.555555F, 13.368984F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aon
 * JD-Core Version:    0.6.2
 */