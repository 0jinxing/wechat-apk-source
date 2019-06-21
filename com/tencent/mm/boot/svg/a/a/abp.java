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

public final class abp extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(12.0F, 21.0F);
      ((Path)localObject1).lineTo(12.0F, 12.0F);
      ((Path)localObject1).cubicTo(12.0F, 5.372583F, 17.372583F, 0.0F, 24.0F, 0.0F);
      ((Path)localObject1).cubicTo(30.627417F, 0.0F, 36.0F, 5.372583F, 36.0F, 12.0F);
      ((Path)localObject1).lineTo(36.0F, 21.0F);
      ((Path)localObject1).lineTo(44.997383F, 21.0F);
      ((Path)localObject1).cubicTo(46.655682F, 21.0F, 48.0F, 22.342468F, 48.0F, 23.995506F);
      ((Path)localObject1).lineTo(48.0F, 57.004494F);
      ((Path)localObject1).cubicTo(48.0F, 58.658867F, 46.666107F, 60.0F, 44.997383F, 60.0F);
      ((Path)localObject1).lineTo(3.002615F, 60.0F);
      ((Path)localObject1).cubicTo(1.344317F, 60.0F, 0.0F, 58.657532F, 0.0F, 57.004494F);
      ((Path)localObject1).lineTo(0.0F, 23.995506F);
      ((Path)localObject1).cubicTo(0.0F, 22.341135F, 1.333893F, 21.0F, 3.002615F, 21.0F);
      ((Path)localObject1).lineTo(12.0F, 21.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(15.6F, 21.0F);
      ((Path)localObject1).lineTo(32.399998F, 21.0F);
      ((Path)localObject1).lineTo(32.399998F, 12.0F);
      ((Path)localObject1).cubicTo(32.39999F, 7.360799F, 28.639183F, 3.599991F, 23.99999F, 3.599991F);
      ((Path)localObject1).cubicTo(19.3608F, 3.599991F, 15.599991F, 7.360799F, 15.599991F, 11.99999F);
      ((Path)localObject1).lineTo(15.6F, 21.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(3.6F, 24.6F);
      ((Path)localObject1).lineTo(3.6F, 56.400002F);
      ((Path)localObject1).lineTo(44.400002F, 56.400002F);
      ((Path)localObject1).lineTo(44.400002F, 24.6F);
      ((Path)localObject1).lineTo(3.6F, 24.6F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.199999F, 41.625561F);
      ((Path)localObject1).cubicTo(20.610685F, 40.93116F, 19.5F, 39.345287F, 19.5F, 37.5F);
      ((Path)localObject1).cubicTo(19.5F, 35.014717F, 21.514719F, 33.0F, 24.0F, 33.0F);
      ((Path)localObject1).cubicTo(26.485281F, 33.0F, 28.5F, 35.014717F, 28.5F, 37.5F);
      ((Path)localObject1).cubicTo(28.5F, 39.345287F, 27.389315F, 40.93116F, 25.799999F, 41.625561F);
      ((Path)localObject1).lineTo(25.799999F, 48.0F);
      ((Path)localObject1).lineTo(22.199999F, 48.0F);
      ((Path)localObject1).lineTo(22.199999F, 41.625561F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abp
 * JD-Core Version:    0.6.2
 */