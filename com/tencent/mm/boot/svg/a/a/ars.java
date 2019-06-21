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

public final class ars extends c
{
  private final int height = 71;
  private final int width = 71;

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
        paramInt = 71;
        continue;
        paramInt = 71;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(85.5F, 0.0F);
      ((Path)localObject3).cubicTo(132.72035F, 0.0F, 171.0F, 38.279652F, 171.0F, 85.5F);
      ((Path)localObject3).cubicTo(171.0F, 132.72035F, 132.72035F, 171.0F, 85.5F, 171.0F);
      ((Path)localObject3).cubicTo(38.279652F, 171.0F, 0.0F, 132.72035F, 0.0F, 85.5F);
      ((Path)localObject3).cubicTo(0.0F, 38.279652F, 38.279652F, 0.0F, 85.5F, 0.0F);
      ((Path)localObject3).close();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-11119016);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 6.99323F);
      ((Path)localObject4).cubicTo(0.0F, 5.892399F, 0.8977023F, 5.0F, 1.991746F, 5.0F);
      ((Path)localObject4).lineTo(69.008255F, 5.0F);
      ((Path)localObject4).cubicTo(70.108269F, 5.0F, 71.0F, 5.895443F, 71.0F, 6.99323F);
      ((Path)localObject4).lineTo(71.0F, 69.006767F);
      ((Path)localObject4).cubicTo(71.0F, 70.107597F, 70.102295F, 71.0F, 69.008255F, 71.0F);
      ((Path)localObject4).lineTo(1.991746F, 71.0F);
      ((Path)localObject4).cubicTo(0.891735F, 71.0F, 0.0F, 70.104553F, 0.0F, 69.006767F);
      ((Path)localObject4).lineTo(0.0F, 6.99323F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(3.0F, 8.0F);
      ((Path)localObject4).lineTo(68.0F, 8.0F);
      ((Path)localObject4).lineTo(68.0F, 68.0F);
      ((Path)localObject4).lineTo(3.0F, 68.0F);
      ((Path)localObject4).lineTo(3.0F, 8.0F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 26.0F);
      ((Path)localObject4).lineTo(71.0F, 26.0F);
      ((Path)localObject4).lineTo(71.0F, 29.0F);
      ((Path)localObject4).lineTo(0.0F, 29.0F);
      ((Path)localObject4).lineTo(0.0F, 26.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(12.0F, 39.0F);
      ((Path)localObject4).lineTo(23.0F, 39.0F);
      ((Path)localObject4).lineTo(23.0F, 42.0F);
      ((Path)localObject4).lineTo(12.0F, 42.0F);
      ((Path)localObject4).lineTo(12.0F, 39.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      localObject4 = c.a((float[])localObject2, -1.83697E-016F, -1.0F, 22.60606F, 1.0F, -1.83697E-016F, -8.621212F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(8.621212F, 5.606061F);
      ((Path)localObject2).lineTo(22.621212F, 5.606061F);
      ((Path)localObject2).lineTo(22.621212F, 8.60606F);
      ((Path)localObject2).lineTo(8.621212F, 8.60606F);
      ((Path)localObject2).lineTo(8.621212F, 5.606061F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.a((float[])localObject4, -1.83697E-016F, -1.0F, 62.60606F, 1.0F, -1.83697E-016F, -48.621212F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(48.621212F, 5.606061F);
      ((Path)localObject1).lineTo(62.621212F, 5.606061F);
      ((Path)localObject1).lineTo(62.621212F, 8.60606F);
      ((Path)localObject1).lineTo(48.621212F, 8.60606F);
      ((Path)localObject1).lineTo(48.621212F, 5.606061F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(12.0F, 53.0F);
      ((Path)localObject1).lineTo(23.0F, 53.0F);
      ((Path)localObject1).lineTo(23.0F, 56.0F);
      ((Path)localObject1).lineTo(12.0F, 56.0F);
      ((Path)localObject1).lineTo(12.0F, 53.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(30.0F, 39.0F);
      ((Path)localObject2).lineTo(41.0F, 39.0F);
      ((Path)localObject2).lineTo(41.0F, 42.0F);
      ((Path)localObject2).lineTo(30.0F, 42.0F);
      ((Path)localObject2).lineTo(30.0F, 39.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(30.0F, 53.0F);
      ((Path)localObject2).lineTo(41.0F, 53.0F);
      ((Path)localObject2).lineTo(41.0F, 56.0F);
      ((Path)localObject2).lineTo(30.0F, 56.0F);
      ((Path)localObject2).lineTo(30.0F, 53.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(48.0F, 39.0F);
      ((Path)localObject1).lineTo(59.0F, 39.0F);
      ((Path)localObject1).lineTo(59.0F, 42.0F);
      ((Path)localObject1).lineTo(48.0F, 42.0F);
      ((Path)localObject1).lineTo(48.0F, 39.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(48.0F, 53.0F);
      ((Path)localObject1).lineTo(59.0F, 53.0F);
      ((Path)localObject1).lineTo(59.0F, 56.0F);
      ((Path)localObject1).lineTo(48.0F, 56.0F);
      ((Path)localObject1).lineTo(48.0F, 53.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ars
 * JD-Core Version:    0.6.2
 */