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

public final class aee extends c
{
  private final int height = 55;
  private final int width = 55;

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
        paramInt = 55;
        continue;
        paramInt = 55;
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
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.0F, -3.552714E-015F);
      ((Path)localObject1).cubicTo(6.066657F, -0.02062163F, 10.031018F, -0.1703468F, 14.0F, -3.552714E-015F);
      ((Path)localObject1).cubicTo(16.641615F, 1.77608F, 15.303518F, 5.678915F, 16.0F, 8.0F);
      ((Path)localObject1).cubicTo(16.01251F, 10.619844F, 18.548903F, 12.885685F, 17.0F, 15.0F);
      ((Path)localObject1).cubicTo(15.363433F, 18.066174F, 12.717196F, 20.302071F, 10.0F, 23.0F);
      ((Path)localObject1).cubicTo(15.303518F, 30.902609F, 22.143789F, 37.620277F, 30.0F, 43.0F);
      ((Path)localObject1).cubicTo(32.638859F, 40.285385F, 34.845722F, 37.720093F, 38.0F, 36.0F);
      ((Path)localObject1).cubicTo(38.879982F, 34.635757F, 40.467724F, 35.633923F, 42.0F, 36.0F);
      ((Path)localObject1).cubicTo(44.901417F, 37.300861F, 48.286602F, 36.941525F, 51.0F, 38.0F);
      ((Path)localObject1).cubicTo(53.119728F, 38.408829F, 52.929996F, 40.494999F, 53.0F, 42.0F);
      ((Path)localObject1).cubicTo(52.929996F, 44.936844F, 53.159672F, 47.891422F, 53.0F, 51.0F);
      ((Path)localObject1).cubicTo(51.422142F, 53.810555F, 47.587597F, 52.832352F, 45.0F, 53.0F);
      ((Path)localObject1).cubicTo(22.583164F, 49.648197F, 3.370492F, 30.523306F, 3.552714E-015F, 8.0F);
      ((Path)localObject1).cubicTo(0.1950087F, 5.509227F, -0.873472F, 1.546501F, 2.0F, -3.552714E-015F);
      ((Path)localObject1).lineTo(2.0F, -3.552714E-015F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aee
 * JD-Core Version:    0.6.2
 */