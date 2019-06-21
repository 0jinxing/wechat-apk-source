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

public final class dn extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-9473160);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 15.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(33.0F, 66.0F);
      ((Path)localObject1).cubicTo(51.225395F, 66.0F, 66.0F, 51.225395F, 66.0F, 33.0F);
      ((Path)localObject1).cubicTo(66.0F, 14.774603F, 51.225395F, 0.0F, 33.0F, 0.0F);
      ((Path)localObject1).cubicTo(14.774603F, 0.0F, 0.0F, 14.774603F, 0.0F, 33.0F);
      ((Path)localObject1).cubicTo(0.0F, 51.225395F, 14.774603F, 66.0F, 33.0F, 66.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(33.0F, 63.0F);
      ((Path)localObject1).cubicTo(49.568542F, 63.0F, 63.0F, 49.568542F, 63.0F, 33.0F);
      ((Path)localObject1).cubicTo(63.0F, 16.431458F, 49.568542F, 3.0F, 33.0F, 3.0F);
      ((Path)localObject1).cubicTo(16.431458F, 3.0F, 3.0F, 16.431458F, 3.0F, 33.0F);
      ((Path)localObject1).cubicTo(3.0F, 49.568542F, 16.431458F, 63.0F, 33.0F, 63.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(25.400999F, 47.626999F);
      ((Path)localObject1).cubicTo(20.216999F, 47.626999F, 16.0F, 44.080002F, 16.0F, 39.720001F);
      ((Path)localObject1).cubicTo(16.0F, 35.360001F, 20.216999F, 31.813999F, 25.400999F, 31.813999F);
      ((Path)localObject1).cubicTo(26.23F, 31.813999F, 26.900999F, 32.485001F, 26.900999F, 33.313999F);
      ((Path)localObject1).cubicTo(26.900999F, 34.141998F, 26.23F, 34.813999F, 25.400999F, 34.813999F);
      ((Path)localObject1).cubicTo(21.871F, 34.813999F, 19.0F, 37.014999F, 19.0F, 39.720001F);
      ((Path)localObject1).cubicTo(19.0F, 42.425999F, 21.871F, 44.626999F, 25.400999F, 44.626999F);
      ((Path)localObject1).cubicTo(28.931F, 44.626999F, 31.802F, 42.425999F, 31.802F, 39.720001F);
      ((Path)localObject1).lineTo(31.802F, 26.907F);
      ((Path)localObject1).cubicTo(31.802F, 22.547001F, 36.02F, 19.0F, 41.203999F, 19.0F);
      ((Path)localObject1).cubicTo(46.388F, 19.0F, 50.605F, 22.547001F, 50.605F, 26.907F);
      ((Path)localObject1).cubicTo(50.605F, 31.267F, 46.388F, 34.813999F, 41.203999F, 34.813999F);
      ((Path)localObject1).cubicTo(40.375F, 34.813999F, 39.703999F, 34.141998F, 39.703999F, 33.313999F);
      ((Path)localObject1).cubicTo(39.703999F, 32.485001F, 40.375F, 31.813999F, 41.203999F, 31.813999F);
      ((Path)localObject1).cubicTo(44.734001F, 31.813999F, 47.605F, 29.612F, 47.605F, 26.907F);
      ((Path)localObject1).cubicTo(47.605F, 24.201F, 44.734001F, 22.0F, 41.203999F, 22.0F);
      ((Path)localObject1).cubicTo(37.674F, 22.0F, 34.801998F, 24.201F, 34.801998F, 26.907F);
      ((Path)localObject1).lineTo(34.801998F, 39.720001F);
      ((Path)localObject1).cubicTo(34.801998F, 44.080002F, 30.584999F, 47.626999F, 25.400999F, 47.626999F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dn
 * JD-Core Version:    0.6.2
 */