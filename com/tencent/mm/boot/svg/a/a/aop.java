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

public final class aop extends c
{
  private final int height = 34;
  private final int width = 28;

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
        paramInt = 28;
        continue;
        paramInt = 34;
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
      localPaint.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -39.0F, 0.0F, 1.0F, -37.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 33.0F, 0.0F, 1.0F, 34.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject4 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(10.57191F, 29.428091F);
      ((Path)localObject2).cubicTo(8.159051F, 27.015232F, 6.666667F, 23.681898F, 6.666667F, 20.0F);
      ((Path)localObject2).cubicTo(6.666667F, 12.636204F, 12.636204F, 6.666667F, 20.0F, 6.666667F);
      ((Path)localObject2).lineTo(20.0F, 8.666667F);
      ((Path)localObject2).cubicTo(13.740773F, 8.666667F, 8.666667F, 13.740773F, 8.666667F, 20.0F);
      ((Path)localObject2).cubicTo(8.666667F, 23.048483F, 9.87313F, 25.900885F, 11.986123F, 28.013876F);
      ((Path)localObject2).moveTo(20.0F, 31.333334F);
      ((Path)localObject2).cubicTo(26.259228F, 31.333334F, 31.333334F, 26.259228F, 31.333334F, 20.0F);
      ((Path)localObject2).cubicTo(31.333334F, 16.951517F, 30.126869F, 14.099116F, 28.013876F, 11.986123F);
      ((Path)localObject2).lineTo(29.428091F, 10.57191F);
      ((Path)localObject2).cubicTo(31.84095F, 12.984768F, 33.333332F, 16.318102F, 33.333332F, 20.0F);
      ((Path)localObject2).cubicTo(33.333332F, 27.363796F, 27.363796F, 33.333332F, 20.0F, 33.333332F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((float[])localObject3, -0.7071068F, -0.7071068F, 36.499157F, -0.7071068F, 0.7071068F, 15.118446F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(16.714045F, 6.714046F);
      ((Path)localObject4).lineTo(16.714045F, 11.380712F);
      ((Path)localObject4).lineTo(14.714046F, 11.380712F);
      ((Path)localObject4).lineTo(14.714046F, 6.714046F);
      ((Path)localObject4).lineTo(14.714046F, 5.214045F);
      ((Path)localObject4).cubicTo(14.714046F, 4.937903F, 14.937902F, 4.714045F, 15.214046F, 4.714045F);
      ((Path)localObject4).lineTo(21.380713F, 4.714045F);
      ((Path)localObject4).lineTo(21.380713F, 6.714046F);
      ((Path)localObject4).lineTo(16.714045F, 6.714046F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.a((float[])localObject3, 0.7071068F, 0.7071068F, -16.161968F, -0.7071068F, 0.7071068F, 24.876308F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(20.614046F, 30.614046F);
      ((Path)localObject1).lineTo(20.614046F, 35.280712F);
      ((Path)localObject1).lineTo(18.614046F, 35.280712F);
      ((Path)localObject1).lineTo(18.614046F, 30.614046F);
      ((Path)localObject1).lineTo(18.614046F, 29.114046F);
      ((Path)localObject1).cubicTo(18.614046F, 28.837904F, 18.837904F, 28.614046F, 19.114046F, 28.614046F);
      ((Path)localObject1).lineTo(25.280712F, 28.614046F);
      ((Path)localObject1).lineTo(25.280712F, 30.614046F);
      ((Path)localObject1).lineTo(20.614046F, 30.614046F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aop
 * JD-Core Version:    0.6.2
 */