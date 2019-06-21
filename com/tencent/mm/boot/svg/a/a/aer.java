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

public final class aer extends c
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
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-2500135);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 21.0F);
      ((Path)localObject1).cubicTo(6.541142F, 9.067516F, 19.195314F, 0.2773516F, 33.0F, -3.552714E-015F);
      ((Path)localObject1).cubicTo(47.47057F, -0.5626642F, 61.090485F, 8.457505F, 68.0F, 21.0F);
      ((Path)localObject1).cubicTo(61.279648F, 33.217968F, 48.147583F, 42.128136F, 34.0F, 42.0F);
      ((Path)localObject1).cubicTo(19.862371F, 42.148136F, 6.740264F, 33.237968F, 0.0F, 21.0F);
      ((Path)localObject1).lineTo(0.0F, 21.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(30.0F, 10.0F);
      ((Path)localObject1).cubicTo(26.510271F, 10.850008F, 23.349888F, 14.148959F, 22.0F, 18.0F);
      ((Path)localObject1).cubicTo(20.448715F, 24.932842F, 25.872211F, 32.447674F, 33.0F, 33.0F);
      ((Path)localObject1).cubicTo(40.05904F, 33.833035F, 46.808502F, 27.08563F, 46.0F, 20.0F);
      ((Path)localObject1).cubicTo(45.492508F, 12.574233F, 37.337322F, 7.132459F, 30.0F, 10.0F);
      ((Path)localObject1).lineTo(30.0F, 10.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aer
 * JD-Core Version:    0.6.2
 */