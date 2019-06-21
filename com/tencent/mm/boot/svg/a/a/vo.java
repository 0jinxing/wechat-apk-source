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

public final class vo extends c
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
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      Object localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(60.0F, 0.0F);
      ((Path)localObject4).lineTo(90.0F, 30.0F);
      ((Path)localObject4).lineTo(90.0F, 116.0F);
      ((Path)localObject4).cubicTo(90.0F, 118.20914F, 88.209137F, 120.0F, 86.0F, 120.0F);
      ((Path)localObject4).lineTo(4.0F, 120.0F);
      ((Path)localObject4).cubicTo(1.790861F, 120.0F, 2.705415E-016F, 118.20914F, 0.0F, 116.0F);
      ((Path)localObject4).lineTo(0.0F, 4.0F);
      ((Path)localObject4).cubicTo(-2.705415E-016F, 1.790861F, 1.790861F, 4.058122E-016F, 4.0F, 0.0F);
      ((Path)localObject4).lineTo(60.0F, 0.0F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, localPaint2);
      localCanvas.restore();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(201326592);
      localCanvas.save();
      localPaint2 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(60.0F, 0.0F);
      ((Path)localObject4).lineTo(90.0F, 30.0F);
      ((Path)localObject4).lineTo(90.0F, 116.0F);
      ((Path)localObject4).cubicTo(90.0F, 118.20914F, 88.209137F, 120.0F, 86.0F, 120.0F);
      ((Path)localObject4).lineTo(4.0F, 120.0F);
      ((Path)localObject4).cubicTo(1.790861F, 120.0F, 2.705415E-016F, 118.20914F, 0.0F, 116.0F);
      ((Path)localObject4).lineTo(0.0F, 4.0F);
      ((Path)localObject4).cubicTo(-2.705415E-016F, 1.790861F, 1.790861F, 4.058122E-016F, 4.0F, 0.0F);
      ((Path)localObject4).lineTo(60.0F, 0.0F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, localPaint2);
      localCanvas.restore();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(90.0F, 30.0F);
      ((Path)localObject3).lineTo(64.0F, 30.0F);
      ((Path)localObject3).cubicTo(61.790859F, 30.0F, 60.0F, 28.209139F, 60.0F, 26.0F);
      ((Path)localObject3).lineTo(60.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 30.0F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8553091);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 44.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(2.288136F);
      localObject3 = c.a((float[])localObject3, 0.7071068F, -0.7071068F, 22.135817F, 0.7071068F, 0.7071068F, -9.168955F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(14.207197F, 14.207197F);
      ((Path)localObject4).lineTo(7.441169F, 36.830467F);
      ((Path)localObject4).lineTo(30.064438F, 30.064438F);
      ((Path)localObject4).lineTo(36.830467F, 7.441169F);
      ((Path)localObject4).lineTo(14.207197F, 14.207197F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(2.288136F);
      localObject3 = c.a((float[])localObject3, 0.7071068F, -0.7071068F, 22.135817F, 0.7071068F, 0.7071068F, -9.168955F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.207197F, 14.207197F);
      ((Path)localObject1).lineTo(7.441169F, 36.830467F);
      ((Path)localObject1).lineTo(30.064438F, 30.064438F);
      ((Path)localObject1).lineTo(36.830467F, 7.441169F);
      ((Path)localObject1).lineTo(14.207197F, 14.207197F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(2.4F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.525424F, 28.220339F);
      ((Path)localObject1).lineTo(21.624678F, 38.935921F);
      ((Path)localObject1).cubicTo(22.047419F, 39.172733F, 22.447042F, 39.172733F, 22.823547F, 38.935921F);
      ((Path)localObject1).cubicTo(23.200052F, 38.699108F, 29.506357F, 35.127247F, 41.742462F, 28.220339F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(2.4F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.0F, 34.0F);
      ((Path)localObject1).lineTo(22.099253F, 44.71558F);
      ((Path)localObject1).cubicTo(22.521996F, 44.952393F, 22.921618F, 44.952393F, 23.298124F, 44.71558F);
      ((Path)localObject1).cubicTo(23.674629F, 44.478767F, 29.980934F, 40.906906F, 42.217037F, 34.0F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vo
 * JD-Core Version:    0.6.2
 */