package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class azy extends c
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
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15028967);
      ((Paint)localObject2).setStrokeWidth(3.6F);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(36.0F, 1.799999F);
      ((Path)localObject3).cubicTo(54.888138F, 1.799999F, 70.199997F, 17.11186F, 70.199997F, 36.0F);
      ((Path)localObject3).cubicTo(70.199997F, 54.888138F, 54.888138F, 70.199997F, 36.0F, 70.199997F);
      ((Path)localObject3).cubicTo(17.11186F, 70.199997F, 1.799999F, 54.888138F, 1.799999F, 36.0F);
      ((Path)localObject3).cubicTo(1.799999F, 17.11186F, 17.11186F, 1.799999F, 36.0F, 1.799999F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-15028967);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(24.0F, 19.5F);
      ((Path)localObject2).lineTo(29.4F, 19.5F);
      ((Path)localObject2).lineTo(29.4F, 52.5F);
      ((Path)localObject2).lineTo(24.0F, 52.5F);
      ((Path)localObject2).lineTo(24.0F, 19.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15028967);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(42.599991F, 19.5F);
      ((Path)localObject1).lineTo(47.999992F, 19.5F);
      ((Path)localObject1).lineTo(47.999992F, 52.5F);
      ((Path)localObject1).lineTo(42.599991F, 52.5F);
      ((Path)localObject1).lineTo(42.599991F, 19.5F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azy
 * JD-Core Version:    0.6.2
 */