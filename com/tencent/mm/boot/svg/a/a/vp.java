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

public final class vp extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      Object localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(60.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 30.0F);
      ((Path)localObject3).lineTo(90.0F, 116.0F);
      ((Path)localObject3).cubicTo(90.0F, 118.20914F, 88.209137F, 120.0F, 86.0F, 120.0F);
      ((Path)localObject3).lineTo(4.0F, 120.0F);
      ((Path)localObject3).cubicTo(1.790861F, 120.0F, 2.705415E-016F, 118.20914F, 0.0F, 116.0F);
      ((Path)localObject3).lineTo(0.0F, 4.0F);
      ((Path)localObject3).cubicTo(-2.705415E-016F, 1.790861F, 1.790861F, 4.058122E-016F, 4.0F, 0.0F);
      ((Path)localObject3).lineTo(60.0F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(201326592);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(60.0F, 0.0F);
      ((Path)localObject2).lineTo(90.0F, 30.0F);
      ((Path)localObject2).lineTo(90.0F, 116.0F);
      ((Path)localObject2).cubicTo(90.0F, 118.20914F, 88.209137F, 120.0F, 86.0F, 120.0F);
      ((Path)localObject2).lineTo(4.0F, 120.0F);
      ((Path)localObject2).cubicTo(1.790861F, 120.0F, 2.705415E-016F, 118.20914F, 0.0F, 116.0F);
      ((Path)localObject2).lineTo(0.0F, 4.0F);
      ((Path)localObject2).cubicTo(-2.705415E-016F, 1.790861F, 1.790861F, 4.058122E-016F, 4.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(90.0F, 30.0F);
      ((Path)localObject2).lineTo(64.0F, 30.0F);
      ((Path)localObject2).cubicTo(61.790859F, 30.0F, 60.0F, 28.209139F, 60.0F, 26.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).lineTo(90.0F, 30.0F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-10461088);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 58.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(-3.552714E-015F, 13.20906F);
      ((Path)localObject3).lineTo(13.891402F, 3.941176F);
      ((Path)localObject3).lineTo(13.891402F, 7.12003F);
      ((Path)localObject3).lineTo(3.579186F, 14.0F);
      ((Path)localObject3).lineTo(13.891402F, 20.879971F);
      ((Path)localObject3).lineTo(13.891402F, 24.058823F);
      ((Path)localObject3).lineTo(-1.554312E-015F, 14.79094F);
      ((Path)localObject3).lineTo(0.0F, 13.20906F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 76.235291F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(31.235294F, 13.20906F);
      ((Path)localObject1).lineTo(45.126698F, 3.941176F);
      ((Path)localObject1).lineTo(45.126698F, 7.12003F);
      ((Path)localObject1).lineTo(34.81448F, 14.0F);
      ((Path)localObject1).lineTo(45.126698F, 20.879971F);
      ((Path)localObject1).lineTo(45.126698F, 24.058823F);
      ((Path)localObject1).lineTo(31.235294F, 14.79094F);
      ((Path)localObject1).lineTo(31.235294F, 13.20906F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(26.200712F, 0.0F);
      ((Path)localObject1).lineTo(29.377182F, 0.0F);
      ((Path)localObject1).lineTo(19.588236F, 28.0F);
      ((Path)localObject1).lineTo(16.411764F, 28.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vp
 * JD-Core Version:    0.6.2
 */