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

public final class afd extends c
{
  private final int height = 93;
  private final int width = 93;

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
        paramInt = 93;
        continue;
        paramInt = 93;
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
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.799622F, 0.0F);
      ((Path)localObject1).cubicTo(2.172793F, 0.0F, 0.0F, 2.291559F, 0.0F, 5.020509F);
      ((Path)localObject1).lineTo(0.0F, 61.501232F);
      ((Path)localObject1).cubicTo(0.0F, 64.230179F, 2.172793F, 66.521736F, 3.799622F, 66.521736F);
      ((Path)localObject1).lineTo(83.591682F, 66.521736F);
      ((Path)localObject1).cubicTo(85.217415F, 66.521736F, 87.391304F, 64.230179F, 87.391304F, 61.501232F);
      ((Path)localObject1).lineTo(87.391304F, 5.020509F);
      ((Path)localObject1).cubicTo(87.391304F, 2.291559F, 85.217415F, 0.0F, 83.591682F, 0.0F);
      ((Path)localObject1).lineTo(3.799622F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(10.302137F, 6.521739F);
      ((Path)localObject1).cubicTo(8.370235F, 6.521739F, 6.521739F, 8.363973F, 6.521739F, 10.252781F);
      ((Path)localObject1).lineTo(6.521739F, 56.268959F);
      ((Path)localObject1).cubicTo(6.521739F, 58.157764F, 8.370235F, 60.0F, 10.302137F, 60.0F);
      ((Path)localObject1).lineTo(77.089165F, 60.0F);
      ((Path)localObject1).cubicTo(79.020142F, 60.0F, 80.869568F, 58.157764F, 80.869568F, 56.268959F);
      ((Path)localObject1).lineTo(80.869568F, 10.252781F);
      ((Path)localObject1).cubicTo(80.869568F, 8.363973F, 79.020142F, 6.521739F, 77.089165F, 6.521739F);
      ((Path)localObject1).lineTo(10.302137F, 6.521739F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(13.0F, 18.0F);
      ((Path)localObject3).lineTo(74.304352F, 18.0F);
      ((Path)localObject3).lineTo(74.304352F, 25.826088F);
      ((Path)localObject3).lineTo(13.0F, 25.826088F);
      ((Path)localObject3).lineTo(13.0F, 18.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afd
 * JD-Core Version:    0.6.2
 */