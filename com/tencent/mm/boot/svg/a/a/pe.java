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

public final class pe extends c
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(36.0F, 67.68F);
      ((Path)localObject2).cubicTo(53.49638F, 67.68F, 67.68F, 53.49638F, 67.68F, 36.0F);
      ((Path)localObject2).cubicTo(67.68F, 18.503618F, 53.49638F, 4.32F, 36.0F, 4.32F);
      ((Path)localObject2).cubicTo(18.503618F, 4.32F, 4.32F, 18.503618F, 4.32F, 36.0F);
      ((Path)localObject2).cubicTo(4.32F, 53.49638F, 18.503618F, 67.68F, 36.0F, 67.68F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(36.0F, 72.0F);
      ((Path)localObject2).cubicTo(16.117748F, 72.0F, 0.0F, 55.882252F, 0.0F, 36.0F);
      ((Path)localObject2).cubicTo(0.0F, 16.117748F, 16.117748F, 0.0F, 36.0F, 0.0F);
      ((Path)localObject2).cubicTo(55.882252F, 0.0F, 72.0F, 16.117748F, 72.0F, 36.0F);
      ((Path)localObject2).cubicTo(72.0F, 55.882252F, 55.882252F, 72.0F, 36.0F, 72.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(25.200001F, 27.745117F);
      ((Path)localObject1).lineTo(29.494884F, 27.745117F);
      ((Path)localObject1).cubicTo(29.771162F, 24.153488F, 32.182327F, 21.91814F, 35.974884F, 21.91814F);
      ((Path)localObject1).cubicTo(39.717209F, 21.91814F, 42.128372F, 24.20372F, 42.128372F, 27.31814F);
      ((Path)localObject1).cubicTo(42.128372F, 30.005581F, 40.998138F, 31.587908F, 38.084652F, 33.371162F);
      ((Path)localObject1).cubicTo(34.643723F, 35.430698F, 33.036278F, 37.691162F, 33.061394F, 41.006512F);
      ((Path)localObject1).lineTo(33.061394F, 43.317211F);
      ((Path)localObject1).lineTo(37.456745F, 43.317211F);
      ((Path)localObject1).lineTo(37.456745F, 41.68465F);
      ((Path)localObject1).cubicTo(37.456745F, 39.047443F, 38.360931F, 37.64093F, 41.550697F, 35.75721F);
      ((Path)localObject1).cubicTo(44.765583F, 33.823257F, 46.799999F, 31.035349F, 46.799999F, 27.092093F);
      ((Path)localObject1).cubicTo(46.799999F, 21.91814F, 42.48F, 18.0F, 36.150696F, 18.0F);
      ((Path)localObject1).cubicTo(29.093023F, 18.0F, 25.476278F, 22.32F, 25.200001F, 27.745117F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(35.271629F, 54.770233F);
      ((Path)localObject1).cubicTo(36.904186F, 54.770233F, 38.134884F, 53.51442F, 38.134884F, 51.906979F);
      ((Path)localObject1).cubicTo(38.134884F, 50.274418F, 36.904186F, 49.04372F, 35.271629F, 49.04372F);
      ((Path)localObject1).cubicTo(33.664185F, 49.04372F, 32.408371F, 50.274418F, 32.408371F, 51.906979F);
      ((Path)localObject1).cubicTo(32.408371F, 53.51442F, 33.664185F, 54.770233F, 35.271629F, 54.770233F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.pe
 * JD-Core Version:    0.6.2
 */