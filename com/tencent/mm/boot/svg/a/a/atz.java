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

public final class atz extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(10.0F, 20.0F);
      ((Path)localObject1).cubicTo(4.477152F, 20.0F, 0.0F, 15.522847F, 0.0F, 10.0F);
      ((Path)localObject1).cubicTo(0.0F, 4.477152F, 4.477152F, 0.0F, 10.0F, 0.0F);
      ((Path)localObject1).cubicTo(15.522847F, 0.0F, 20.0F, 4.477152F, 20.0F, 10.0F);
      ((Path)localObject1).cubicTo(20.0F, 15.522847F, 15.522847F, 20.0F, 10.0F, 20.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(10.0F, 18.799999F);
      ((Path)localObject1).cubicTo(14.860106F, 18.799999F, 18.799999F, 14.860106F, 18.799999F, 10.0F);
      ((Path)localObject1).cubicTo(18.799999F, 5.139894F, 14.860106F, 1.2F, 10.0F, 1.2F);
      ((Path)localObject1).cubicTo(5.139894F, 1.2F, 1.2F, 5.139894F, 1.2F, 10.0F);
      ((Path)localObject1).cubicTo(1.2F, 14.860106F, 5.139894F, 18.799999F, 10.0F, 18.799999F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(6.0F, 9.0F);
      ((Path)localObject1).cubicTo(6.552285F, 9.0F, 7.0F, 9.447715F, 7.0F, 10.0F);
      ((Path)localObject1).cubicTo(7.0F, 10.552285F, 6.552285F, 11.0F, 6.0F, 11.0F);
      ((Path)localObject1).cubicTo(5.447715F, 11.0F, 5.0F, 10.552285F, 5.0F, 10.0F);
      ((Path)localObject1).cubicTo(5.0F, 9.447715F, 5.447715F, 9.0F, 6.0F, 9.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(10.0F, 9.0F);
      ((Path)localObject1).cubicTo(10.552285F, 9.0F, 11.0F, 9.447715F, 11.0F, 10.0F);
      ((Path)localObject1).cubicTo(11.0F, 10.552285F, 10.552285F, 11.0F, 10.0F, 11.0F);
      ((Path)localObject1).cubicTo(9.447715F, 11.0F, 9.0F, 10.552285F, 9.0F, 10.0F);
      ((Path)localObject1).cubicTo(9.0F, 9.447715F, 9.447715F, 9.0F, 10.0F, 9.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.0F, 9.0F);
      ((Path)localObject1).cubicTo(14.552285F, 9.0F, 15.0F, 9.447715F, 15.0F, 10.0F);
      ((Path)localObject1).cubicTo(15.0F, 10.552285F, 14.552285F, 11.0F, 14.0F, 11.0F);
      ((Path)localObject1).cubicTo(13.447715F, 11.0F, 13.0F, 10.552285F, 13.0F, 10.0F);
      ((Path)localObject1).cubicTo(13.0F, 9.447715F, 13.447715F, 9.0F, 14.0F, 9.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.atz
 * JD-Core Version:    0.6.2
 */