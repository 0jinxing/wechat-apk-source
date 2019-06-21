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

public final class azm extends c
{
  private final int height = 27;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 27;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.5F);
      localPath.lineTo(26.0F, 0.5F);
      localPath.lineTo(26.0F, 24.5F);
      localPath.lineTo(0.0F, 24.5F);
      localPath.lineTo(0.0F, 0.5F);
      localPath.close();
      localPath.moveTo(2.0F, 2.5F);
      localPath.lineTo(2.0F, 22.5F);
      localPath.lineTo(24.0F, 22.5F);
      localPath.lineTo(24.0F, 2.5F);
      localPath.lineTo(2.0F, 2.5F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject4, 1.0F, 0.0F, 27.363636F, 0.0F, 1.0F, 1.090909F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(31.008236F, 11.565939F);
      ((Path)localObject3).lineTo(31.002834F, 13.579968F);
      ((Path)localObject3).lineTo(39.986187F, 19.714403F);
      ((Path)localObject3).lineTo(39.997097F, 5.325294F);
      ((Path)localObject3).lineTo(31.008236F, 11.565939F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(29.011042F, 10.51777F);
      ((Path)localObject3).lineTo(42.0F, 1.5F);
      ((Path)localObject3).lineTo(41.983315F, 23.5F);
      ((Path)localObject3).lineTo(29.0F, 14.634123F);
      ((Path)localObject3).lineTo(29.011042F, 10.51777F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azm
 * JD-Core Version:    0.6.2
 */