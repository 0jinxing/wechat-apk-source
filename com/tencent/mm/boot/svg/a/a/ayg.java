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

public final class ayg extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -65.0F, 0.0F, 1.0F, -131.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 65.0F, 0.0F, 1.0F, 131.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(12.0F, 24.0F);
      ((Path)localObject2).cubicTo(5.372583F, 24.0F, 0.0F, 18.627417F, 0.0F, 12.0F);
      ((Path)localObject2).cubicTo(0.0F, 5.372583F, 5.372583F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject2).cubicTo(18.627417F, 0.0F, 24.0F, 5.372583F, 24.0F, 12.0F);
      ((Path)localObject2).cubicTo(24.0F, 18.627417F, 18.627417F, 24.0F, 12.0F, 24.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(12.0F, 22.333334F);
      ((Path)localObject2).cubicTo(17.706942F, 22.333334F, 22.333334F, 17.706942F, 22.333334F, 12.0F);
      ((Path)localObject2).cubicTo(22.333334F, 6.293057F, 17.706942F, 1.666667F, 12.0F, 1.666667F);
      ((Path)localObject2).cubicTo(6.293057F, 1.666667F, 1.666667F, 6.293057F, 1.666667F, 12.0F);
      ((Path)localObject2).cubicTo(1.666667F, 17.706942F, 6.293057F, 22.333334F, 12.0F, 22.333334F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(13.666667F, 11.666667F);
      ((Path)localObject3).lineTo(13.666667F, 13.624764F);
      ((Path)localObject3).lineTo(13.666667F, 14.916196F);
      ((Path)localObject3).cubicTo(13.666667F, 15.154654F, 13.482121F, 15.333324F, 13.254474F, 15.333315F);
      ((Path)localObject3).lineTo(6.412193F, 15.333003F);
      ((Path)localObject3).cubicTo(6.189514F, 15.332993F, 6.0F, 15.146587F, 6.0F, 14.916656F);
      ((Path)localObject3).lineTo(6.0F, 9.093866F);
      ((Path)localObject3).cubicTo(6.0F, 8.869545F, 6.184545F, 8.677277F, 6.412193F, 8.676953F);
      ((Path)localObject3).lineTo(13.254474F, 8.667252F);
      ((Path)localObject3).cubicTo(13.477153F, 8.666935F, 13.666667F, 8.853425F, 13.666667F, 9.083804F);
      ((Path)localObject3).lineTo(13.666667F, 11.666667F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(14.666667F, 10.752296F);
      ((Path)localObject3).cubicTo(15.714527F, 9.888178F, 17.115644F, 8.891267F, 17.5F, 8.677538F);
      ((Path)localObject3).cubicTo(17.615805F, 8.618451F, 18.0F, 8.80178F, 18.0F, 9.189495F);
      ((Path)localObject3).lineTo(18.0F, 14.821027F);
      ((Path)localObject3).cubicTo(18.0F, 15.089015F, 17.652575F, 15.344082F, 17.5F, 15.332984F);
      ((Path)localObject3).cubicTo(17.179924F, 15.098051F, 15.743977F, 14.046944F, 14.666667F, 13.185655F);
      ((Path)localObject3).lineTo(14.666667F, 10.752296F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayg
 * JD-Core Version:    0.6.2
 */