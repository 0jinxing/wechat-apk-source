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

public final class nl extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 3.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(18.55476F, 10.685851F);
      ((Path)localObject1).lineTo(18.55476F, 1.956886F);
      ((Path)localObject1).lineTo(1.476108F, 1.956886F);
      ((Path)localObject1).lineTo(1.476108F, 10.368928F);
      ((Path)localObject1).lineTo(6.199246F, 6.549259F);
      ((Path)localObject1).cubicTo(6.661799F, 6.175185F, 7.404625F, 6.193327F, 7.850495F, 6.585084F);
      ((Path)localObject1).lineTo(12.326923F, 10.518227F);
      ((Path)localObject1).lineTo(14.609102F, 8.577498F);
      ((Path)localObject1).cubicTo(15.071318F, 8.184438F, 15.806723F, 8.192423F, 16.255432F, 8.595083F);
      ((Path)localObject1).lineTo(18.55476F, 10.685851F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(18.55476F, 12.52428F);
      ((Path)localObject1).lineTo(15.40987F, 9.694547F);
      ((Path)localObject1).lineTo(13.221663F, 11.555364F);
      ((Path)localObject1).lineTo(14.566126F, 12.736655F);
      ((Path)localObject1).lineTo(12.794854F, 12.736655F);
      ((Path)localObject1).lineTo(6.989743F, 7.676738F);
      ((Path)localObject1).lineTo(1.476108F, 12.135694F);
      ((Path)localObject1).lineTo(1.476108F, 15.028442F);
      ((Path)localObject1).lineTo(18.55476F, 15.028442F);
      ((Path)localObject1).lineTo(18.55476F, 12.52428F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.9918031F, 0.5F);
      ((Path)localObject1).lineTo(19.008198F, 0.5F);
      ((Path)localObject1).cubicTo(19.544695F, 0.5F, 20.0F, 0.981137F, 20.0F, 1.57465F);
      ((Path)localObject1).lineTo(20.0F, 15.42535F);
      ((Path)localObject1).cubicTo(20.0F, 16.021152F, 19.555954F, 16.5F, 19.008198F, 16.5F);
      ((Path)localObject1).lineTo(0.9918031F, 16.5F);
      ((Path)localObject1).cubicTo(0.4553056F, 16.5F, 0.0F, 16.018864F, 0.0F, 15.42535F);
      ((Path)localObject1).lineTo(0.0F, 1.57465F);
      ((Path)localObject1).cubicTo(0.0F, 0.9788482F, 0.4440454F, 0.5F, 0.9918031F, 0.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nl
 * JD-Core Version:    0.6.2
 */