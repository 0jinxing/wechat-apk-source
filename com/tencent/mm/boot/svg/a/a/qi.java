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

public final class qi extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-14187817);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 0.0F);
      ((Path)localObject4).lineTo(144.0F, 0.0F);
      ((Path)localObject4).lineTo(144.0F, 144.0F);
      ((Path)localObject4).lineTo(0.0F, 144.0F);
      ((Path)localObject4).lineTo(0.0F, 0.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(61.621193F, 73.147293F);
      ((Path)localObject3).cubicTo(66.188721F, 80.180099F, 59.140778F, 83.233414F, 55.739967F, 85.172226F);
      ((Path)localObject3).cubicTo(43.533539F, 92.134026F, 38.0F, 94.832306F, 38.0F, 98.453674F);
      ((Path)localObject3).lineTo(38.0F, 102.98167F);
      ((Path)localObject3).cubicTo(38.0F, 104.6663F, 39.151512F, 106.0F, 40.956829F, 106.0F);
      ((Path)localObject3).lineTo(103.04317F, 106.0F);
      ((Path)localObject3).cubicTo(104.84849F, 106.0F, 106.0F, 104.6663F, 106.0F, 102.98167F);
      ((Path)localObject3).lineTo(106.0F, 98.453674F);
      ((Path)localObject3).cubicTo(106.0F, 94.832306F, 100.46646F, 92.134026F, 88.260033F, 85.172226F);
      ((Path)localObject3).cubicTo(84.859222F, 83.233414F, 77.811279F, 80.180099F, 82.378807F, 73.147293F);
      ((Path)localObject3).cubicTo(85.826248F, 67.838211F, 88.767876F, 65.557747F, 88.767876F, 56.603626F);
      ((Path)localObject3).cubicTo(88.767876F, 47.310932F, 82.19635F, 38.0F, 72.0F, 38.0F);
      ((Path)localObject3).cubicTo(61.80365F, 38.0F, 55.232128F, 47.310932F, 55.232128F, 56.603626F);
      ((Path)localObject3).cubicTo(55.232128F, 65.557747F, 58.173752F, 67.838211F, 61.621193F, 73.147293F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(66.0F, 97.856636F);
      ((Path)localObject3).lineTo(71.5F, 105.0F);
      ((Path)localObject3).lineTo(77.0F, 97.856636F);
      ((Path)localObject3).lineTo(71.5F, 80.0F);
      ((Path)localObject3).lineTo(66.0F, 97.856636F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16608256);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(144.0F, 0.0F);
      ((Path)localObject3).lineTo(144.0F, 144.0F);
      ((Path)localObject3).lineTo(0.0F, 144.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-328966);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(32.0F, 44.0F);
      ((Path)localObject1).lineTo(32.0F, 53.677307F);
      ((Path)localObject1).cubicTo(32.0F, 56.064663F, 33.925228F, 58.0F, 36.31028F, 58.0F);
      ((Path)localObject1).lineTo(61.0F, 58.0F);
      ((Path)localObject1).lineTo(69.314941F, 64.651955F);
      ((Path)localObject1).cubicTo(70.245575F, 65.396461F, 71.0F, 65.035011F, 71.0F, 63.835083F);
      ((Path)localObject1).lineTo(71.0F, 58.0F);
      ((Path)localObject1).lineTo(77.684082F, 58.0F);
      ((Path)localObject1).cubicTo(80.067696F, 58.0F, 82.0F, 56.065983F, 82.0F, 53.677307F);
      ((Path)localObject1).lineTo(82.0F, 23.322693F);
      ((Path)localObject1).cubicTo(82.0F, 20.935335F, 80.07058F, 19.0F, 77.67205F, 19.0F);
      ((Path)localObject1).lineTo(57.0F, 19.0F);
      ((Path)localObject1).lineTo(57.0F, 39.672432F);
      ((Path)localObject1).cubicTo(57.0F, 42.062481F, 55.062813F, 44.0F, 52.683216F, 44.0F);
      ((Path)localObject1).lineTo(32.0F, 44.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(49.672234F, 0.0F);
      ((Path)localObject1).cubicTo(52.062393F, 0.0F, 54.0F, 1.936207F, 54.0F, 4.310226F);
      ((Path)localObject1).lineTo(54.0F, 36.689774F);
      ((Path)localObject1).cubicTo(54.0F, 39.070248F, 52.06081F, 41.0F, 49.689583F, 41.0F);
      ((Path)localObject1).lineTo(23.0F, 41.0F);
      ((Path)localObject1).lineTo(13.670663F, 48.633095F);
      ((Path)localObject1).cubicTo(12.747981F, 49.388016F, 12.0F, 49.036842F, 12.0F, 47.844276F);
      ((Path)localObject1).lineTo(12.0F, 41.0F);
      ((Path)localObject1).lineTo(4.315322F, 41.0F);
      ((Path)localObject1).cubicTo(1.932035F, 41.0F, 0.0F, 39.063793F, 0.0F, 36.689774F);
      ((Path)localObject1).lineTo(0.0F, 4.310226F);
      ((Path)localObject1).cubicTo(0.0F, 1.929754F, 1.93781F, 0.0F, 4.327765F, 0.0F);
      ((Path)localObject1).lineTo(49.672234F, 0.0F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qi
 * JD-Core Version:    0.6.2
 */