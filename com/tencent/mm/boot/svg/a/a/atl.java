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

public final class atl extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-27648);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 11.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(26.41996F, 1.7124F);
      ((Path)localObject1).cubicTo(42.029785F, -1.784037F, 59.069595F, 7.946046F, 64.089539F, 23.090612F);
      ((Path)localObject1).cubicTo(69.899475F, 38.474934F, 61.969563F, 57.265781F, 46.919731F, 63.879044F);
      ((Path)localObject1).cubicTo(32.549892F, 71.011772F, 13.600102F, 65.467422F, 5.210196F, 51.841309F);
      ((Path)localObject1).cubicTo(-2.909714F, 39.703682F, -1.379731F, 22.281437F, 8.690157F, 11.712208F);
      ((Path)localObject1).cubicTo(13.340105F, 6.617401F, 19.670034F, 3.110974F, 26.41996F, 1.7124F);
      ((Path)localObject1).lineTo(26.41996F, 1.7124F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(12.0F, 32.0F);
      ((Path)localObject1).lineTo(12.0F, 36.0F);
      ((Path)localObject1).lineTo(54.0F, 36.0F);
      ((Path)localObject1).lineTo(54.0F, 32.0F);
      ((Path)localObject1).lineTo(12.0F, 32.0F);
      ((Path)localObject1).lineTo(12.0F, 32.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.atl
 * JD-Core Version:    0.6.2
 */