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

public final class np extends c
{
  private final int height = 117;
  private final int width = 117;

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
        paramInt = 117;
        continue;
        paramInt = 117;
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1265.0F, 0.0F, 1.0F, -201.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16139513);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1268.0F, 259.5F);
      ((Path)localObject2).cubicTo(1268.0F, 228.84819F, 1292.8481F, 204.0F, 1323.5F, 204.0F);
      ((Path)localObject2).lineTo(1323.5F, 204.0F);
      ((Path)localObject2).cubicTo(1354.1519F, 204.0F, 1379.0F, 228.84819F, 1379.0F, 259.5F);
      ((Path)localObject2).lineTo(1379.0F, 259.5F);
      ((Path)localObject2).cubicTo(1379.0F, 290.15179F, 1354.1519F, 315.0F, 1323.5F, 315.0F);
      ((Path)localObject2).lineTo(1323.5F, 315.0F);
      ((Path)localObject2).cubicTo(1292.8481F, 315.0F, 1268.0F, 290.15179F, 1268.0F, 259.5F);
      ((Path)localObject2).lineTo(1268.0F, 259.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16139513);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1309.1147F, 266.15973F);
      ((Path)localObject1).cubicTo(1310.8816F, 264.54208F, 1312.0F, 262.14874F, 1312.0F, 259.47821F);
      ((Path)localObject1).cubicTo(1312.0F, 257.09238F, 1311.1073F, 254.92775F, 1309.6571F, 253.33984F);
      ((Path)localObject1).lineTo(1302.976F, 260.02097F);
      ((Path)localObject1).lineTo(1309.1147F, 266.15973F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.np
 * JD-Core Version:    0.6.2
 */