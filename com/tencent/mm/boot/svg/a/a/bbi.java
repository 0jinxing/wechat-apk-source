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

public final class bbi extends c
{
  private final int height = 16;
  private final int width = 16;

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
        paramInt = 16;
        continue;
        paramInt = 16;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-5066062);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -329.0F, 0.0F, 1.0F, -603.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 66.0F, 0.0F, 1.0F, 602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 262.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 16.5F, 0.0F, 1.0F, 1.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(7.5F, 14.1F);
      ((Path)localObject3).cubicTo(11.14508F, 14.1F, 14.1F, 11.14508F, 14.1F, 7.5F);
      ((Path)localObject3).cubicTo(14.1F, 3.854921F, 11.14508F, 0.9F, 7.5F, 0.9F);
      ((Path)localObject3).cubicTo(3.854921F, 0.9F, 0.9F, 3.854921F, 0.9F, 7.5F);
      ((Path)localObject3).cubicTo(0.9F, 11.14508F, 3.854921F, 14.1F, 7.5F, 14.1F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(7.5F, 15.0F);
      ((Path)localObject3).cubicTo(3.357864F, 15.0F, 0.0F, 11.642136F, 0.0F, 7.5F);
      ((Path)localObject3).cubicTo(0.0F, 3.357864F, 3.357864F, 0.0F, 7.5F, 0.0F);
      ((Path)localObject3).cubicTo(11.642136F, 0.0F, 15.0F, 3.357864F, 15.0F, 7.5F);
      ((Path)localObject3).cubicTo(15.0F, 11.642136F, 11.642136F, 15.0F, 7.5F, 15.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(7.500001F, 9.750002F);
      ((Path)localObject4).cubicTo(8.742641F, 9.750002F, 9.750001F, 8.742642F, 9.750001F, 7.500002F);
      ((Path)localObject4).cubicTo(9.750001F, 6.257361F, 8.742641F, 5.250002F, 7.500001F, 5.250002F);
      ((Path)localObject4).cubicTo(6.25736F, 5.250002F, 5.250001F, 6.257361F, 5.250001F, 7.500002F);
      ((Path)localObject4).cubicTo(5.250001F, 8.742642F, 6.25736F, 9.750002F, 7.500001F, 9.750002F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(7.500001F, 10.650002F);
      ((Path)localObject4).cubicTo(5.760304F, 10.650002F, 4.350001F, 9.239699F, 4.350001F, 7.500002F);
      ((Path)localObject4).cubicTo(4.350001F, 5.760305F, 5.760304F, 4.350002F, 7.500001F, 4.350002F);
      ((Path)localObject4).cubicTo(9.239698F, 4.350002F, 10.650001F, 5.760305F, 10.650001F, 7.500002F);
      ((Path)localObject4).cubicTo(10.650001F, 9.239699F, 9.239698F, 10.650002F, 7.500001F, 10.650002F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 1);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(4.35F, 0.75F);
      ((Path)localObject3).lineTo(5.25F, 0.75F);
      ((Path)localObject3).lineTo(5.25F, 7.5F);
      ((Path)localObject3).lineTo(4.35F, 7.5F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(9.75F, 7.5F);
      ((Path)localObject3).lineTo(10.65F, 7.5F);
      ((Path)localObject3).lineTo(10.65F, 14.25F);
      ((Path)localObject3).lineTo(9.75F, 14.25F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(7.5F, 4.350002F);
      ((Path)localObject3).lineTo(14.25F, 4.350002F);
      ((Path)localObject3).lineTo(14.25F, 5.350002F);
      ((Path)localObject3).lineTo(7.5F, 5.350002F);
      ((Path)localObject3).lineTo(7.5F, 4.350002F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.75F, 9.75F);
      ((Path)localObject3).lineTo(7.5F, 9.75F);
      ((Path)localObject3).lineTo(7.5F, 10.75F);
      ((Path)localObject3).lineTo(0.75F, 10.75F);
      ((Path)localObject3).lineTo(0.75F, 9.75F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((float[])localObject2, 0.7071068F, -0.7071068F, 4.602297F, 0.7071068F, 0.7071068F, -4.702275F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(7.527297F, -0.1706737F);
      ((Path)localObject4).lineTo(8.427297F, -0.1706737F);
      ((Path)localObject4).lineTo(8.427297F, 6.579326F);
      ((Path)localObject4).lineTo(7.527297F, 6.579326F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      localObject4 = c.a((float[])localObject2, 0.7071068F, -0.7071068F, 10.397703F, 0.7071068F, 0.7071068F, -1.510928F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(6.572703F, 8.420673F);
      ((Path)localObject2).lineTo(7.472703F, 8.420673F);
      ((Path)localObject2).lineTo(7.472703F, 15.170673F);
      ((Path)localObject2).lineTo(6.572703F, 15.170673F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((float[])localObject4, 0.7071068F, -0.7071068F, 9.095675F, 0.7071068F, 0.7071068F, -6.004304F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(8.420672F, 7.527299F);
      ((Path)localObject4).lineTo(15.170672F, 7.527299F);
      ((Path)localObject4).lineTo(15.170672F, 8.427299F);
      ((Path)localObject4).lineTo(8.420672F, 8.427299F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((float[])localObject3, 0.7071068F, -0.7071068F, 5.904326F, 0.7071068F, 0.7071068F, -0.2088981F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(-0.1706737F, 6.572703F);
      ((Path)localObject1).lineTo(6.579326F, 6.572703F);
      ((Path)localObject1).lineTo(6.579326F, 7.472703F);
      ((Path)localObject1).lineTo(-0.1706737F, 7.472703F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbi
 * JD-Core Version:    0.6.2
 */