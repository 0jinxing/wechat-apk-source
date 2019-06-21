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

public final class yl extends c
{
  private final int height = 33;
  private final int width = 33;

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
        paramInt = 33;
        continue;
        paramInt = 33;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, -226.0F, 0.0F, 1.0F, -665.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((float[])localObject3, 0.7071068F, -0.7071068F, 553.11835F, 0.7071068F, 0.7071068F, 28.051147F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(244.19849F, 680.19849F);
      ((Path)localObject1).lineTo(244.19849F, 660.69849F);
      ((Path)localObject1).lineTo(241.19849F, 660.69849F);
      ((Path)localObject1).lineTo(241.19849F, 680.19849F);
      ((Path)localObject1).lineTo(221.69849F, 680.19849F);
      ((Path)localObject1).lineTo(221.69849F, 683.19849F);
      ((Path)localObject1).lineTo(241.19849F, 683.19849F);
      ((Path)localObject1).lineTo(241.19849F, 702.69849F);
      ((Path)localObject1).lineTo(244.19849F, 702.69849F);
      ((Path)localObject1).lineTo(244.19849F, 683.19849F);
      ((Path)localObject1).lineTo(263.69849F, 683.19849F);
      ((Path)localObject1).lineTo(263.69849F, 680.19849F);
      ((Path)localObject1).lineTo(244.19849F, 680.19849F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yl
 * JD-Core Version:    0.6.2
 */