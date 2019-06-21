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

public final class axl extends c
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
      Paint localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-14046139);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 0.0F);
      ((Path)localObject4).lineTo(96.0F, 0.0F);
      ((Path)localObject4).lineTo(96.0F, 96.0F);
      ((Path)localObject4).lineTo(0.0F, 96.0F);
      ((Path)localObject4).lineTo(0.0F, 0.0F);
      ((Path)localObject4).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject4, c.a(localPaint, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 10.0F, 0.0F, 1.0F, 9.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(10.320658F, 10.199991F);
      ((Path)localObject2).lineTo(12.757717F, 51.142605F);
      ((Path)localObject2).cubicTo(12.833185F, 52.410458F, 13.88338F, 53.400002F, 15.153477F, 53.400002F);
      ((Path)localObject2).lineTo(36.846523F, 53.400002F);
      ((Path)localObject2).cubicTo(38.116619F, 53.400002F, 39.166817F, 52.410458F, 39.242283F, 51.142605F);
      ((Path)localObject2).lineTo(41.679344F, 10.199991F);
      ((Path)localObject2).lineTo(10.320658F, 10.199991F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(45.285713F, 10.199991F);
      ((Path)localObject2).lineTo(42.835922F, 51.35651F);
      ((Path)localObject2).cubicTo(42.647255F, 54.526142F, 40.021767F, 57.0F, 36.846523F, 57.0F);
      ((Path)localObject2).lineTo(15.153477F, 57.0F);
      ((Path)localObject2).cubicTo(11.978235F, 57.0F, 9.352747F, 54.526142F, 9.164078F, 51.35651F);
      ((Path)localObject2).lineTo(6.714286F, 10.199991F);
      ((Path)localObject2).lineTo(0.5F, 10.199991F);
      ((Path)localObject2).lineTo(0.5F, 8.099991F);
      ((Path)localObject2).cubicTo(0.5F, 7.271564F, 1.171573F, 6.599991F, 2.0F, 6.599991F);
      ((Path)localObject2).lineTo(50.0F, 6.599991F);
      ((Path)localObject2).cubicTo(50.828426F, 6.599991F, 51.5F, 7.271564F, 51.5F, 8.099991F);
      ((Path)localObject2).lineTo(51.5F, 10.199991F);
      ((Path)localObject2).lineTo(45.285713F, 10.199991F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(32.0F, 8.185671E-005F);
      ((Path)localObject2).cubicTo(32.828426F, 8.185671E-005F, 33.5F, 0.6716548F, 33.5F, 1.500082F);
      ((Path)localObject2).lineTo(33.5F, 3.600073F);
      ((Path)localObject2).lineTo(18.5F, 3.600073F);
      ((Path)localObject2).lineTo(18.5F, 1.500082F);
      ((Path)localObject2).cubicTo(18.5F, 0.6716548F, 19.171574F, 8.185671E-005F, 20.0F, 8.185671E-005F);
      ((Path)localObject2).lineTo(32.0F, 8.185671E-005F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(18.5F, 18.0F);
      ((Path)localObject3).lineTo(22.100037F, 18.0F);
      ((Path)localObject3).lineTo(23.600037F, 45.0F);
      ((Path)localObject3).lineTo(20.0F, 45.0F);
      ((Path)localObject3).lineTo(18.5F, 18.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(29.899963F, 18.0F);
      ((Path)localObject3).lineTo(33.5F, 18.0F);
      ((Path)localObject3).lineTo(32.0F, 45.0F);
      ((Path)localObject3).lineTo(28.399963F, 45.0F);
      ((Path)localObject3).lineTo(29.899963F, 18.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.axl
 * JD-Core Version:    0.6.2
 */