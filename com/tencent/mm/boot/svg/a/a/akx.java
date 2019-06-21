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

public final class akx extends c
{
  private final int height = 271;
  private final int width = 152;

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
        paramInt = 152;
        continue;
        paramInt = 271;
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
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.333333F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localPaint.setStrokeWidth(4.0F);
      Object localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(2.0F, 16.0F);
      ((Path)localObject5).cubicTo(2.0F, 8.268013F, 8.268013F, 2.0F, 16.0F, 2.0F);
      ((Path)localObject5).lineTo(133.33333F, 2.0F);
      ((Path)localObject5).cubicTo(141.06531F, 2.0F, 147.33333F, 8.268013F, 147.33333F, 16.0F);
      ((Path)localObject5).lineTo(147.33333F, 250.66666F);
      ((Path)localObject5).cubicTo(147.33333F, 258.39865F, 141.06531F, 264.66666F, 133.33333F, 264.66666F);
      ((Path)localObject5).lineTo(16.0F, 264.66666F);
      ((Path)localObject5).cubicTo(8.268013F, 264.66666F, 2.0F, 258.39865F, 2.0F, 250.66666F);
      ((Path)localObject5).lineTo(2.0F, 16.0F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject5 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject5).setColor(-16777216);
      ((Paint)localObject5).setStrokeWidth(2.0F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(11.666667F, 29.0F);
      ((Path)localObject4).lineTo(11.666667F, 232.33333F);
      ((Path)localObject4).lineTo(137.66667F, 232.33333F);
      ((Path)localObject4).lineTo(137.66667F, 29.0F);
      ((Path)localObject4).lineTo(11.666667F, 29.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject5);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-16777216);
      localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(65.333336F, 13.333333F);
      ((Path)localObject5).lineTo(85.333336F, 13.333333F);
      ((Path)localObject5).lineTo(85.333336F, 17.333332F);
      ((Path)localObject5).lineTo(65.333336F, 17.333332F);
      ((Path)localObject5).lineTo(65.333336F, 13.333333F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1549736);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 38.0F, 0.0F, 1.0F, 90.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(74.558861F, 18.441139F);
      ((Path)localObject1).lineTo(73.350342F, 19.649662F);
      ((Path)localObject1).lineTo(38.0F, 55.0F);
      ((Path)localObject1).lineTo(2.649662F, 19.649662F);
      ((Path)localObject1).lineTo(1.441139F, 18.441139F);
      ((Path)localObject1).lineTo(0.2326156F, 17.232616F);
      ((Path)localObject1).cubicTo(9.399959F, 6.675522F, 22.920404F, 0.0F, 38.0F, 0.0F);
      ((Path)localObject1).cubicTo(53.079597F, 0.0F, 66.600044F, 6.675522F, 75.767387F, 17.232616F);
      ((Path)localObject1).lineTo(74.558861F, 18.441139F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(73.350342F, 19.649662F);
      ((Path)localObject1).cubicTo(64.805794F, 9.706631F, 52.138332F, 3.409091F, 38.0F, 3.409091F);
      ((Path)localObject1).cubicTo(23.861668F, 3.409091F, 11.194205F, 9.706631F, 2.649662F, 19.649662F);
      ((Path)localObject1).lineTo(38.0F, 55.0F);
      ((Path)localObject1).lineTo(73.350342F, 19.649662F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(64.412086F, 28.587917F);
      ((Path)localObject1).lineTo(38.0F, 55.0F);
      ((Path)localObject1).lineTo(11.587917F, 28.587917F);
      ((Path)localObject1).cubicTo(17.821682F, 20.907948F, 27.337685F, 16.0F, 38.0F, 16.0F);
      ((Path)localObject1).cubicTo(48.662315F, 16.0F, 58.178318F, 20.907948F, 64.412086F, 28.587917F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(61.952404F, 31.047596F);
      ((Path)localObject1).cubicTo(56.358055F, 23.986908F, 47.707962F, 19.457626F, 38.0F, 19.457626F);
      ((Path)localObject1).cubicTo(28.292036F, 19.457626F, 19.641943F, 23.986908F, 14.047595F, 31.047596F);
      ((Path)localObject1).lineTo(38.0F, 55.0F);
      ((Path)localObject1).lineTo(61.952404F, 31.047596F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(24.464458F, 41.464458F);
      ((Path)localObject2).cubicTo(27.298983F, 36.978931F, 32.301609F, 34.0F, 38.0F, 34.0F);
      ((Path)localObject2).cubicTo(43.698391F, 34.0F, 48.701015F, 36.978931F, 51.535542F, 41.464458F);
      ((Path)localObject2).lineTo(38.0F, 55.0F);
      ((Path)localObject2).lineTo(24.464458F, 41.464458F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(26.967703F, 43.967701F);
      ((Path)localObject2).lineTo(38.0F, 55.0F);
      ((Path)localObject2).lineTo(49.032299F, 43.967701F);
      ((Path)localObject2).cubicTo(46.896992F, 40.070786F, 42.757057F, 37.42857F, 38.0F, 37.42857F);
      ((Path)localObject2).cubicTo(33.242943F, 37.42857F, 29.103008F, 40.070786F, 26.967703F, 43.967701F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(41.284134F, 51.715866F);
      ((Path)localObject3).lineTo(38.0F, 55.0F);
      ((Path)localObject3).lineTo(34.715866F, 51.715866F);
      ((Path)localObject3).cubicTo(35.438572F, 50.678699F, 36.640026F, 50.0F, 38.0F, 50.0F);
      ((Path)localObject3).cubicTo(39.359974F, 50.0F, 40.561428F, 50.678699F, 41.284134F, 51.715866F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.akx
 * JD-Core Version:    0.6.2
 */