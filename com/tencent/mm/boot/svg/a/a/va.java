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

public final class va extends c
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
      localPaint2.setColor(-11615450);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 18.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.111219F, 10.565054F);
      ((Path)localObject1).cubicTo(4.587666F, 6.591597F, 8.452122F, 3.606513F, 12.426419F, 1.250393F);
      ((Path)localObject1).cubicTo(14.263783F, 0.2121026F, 15.352221F, 2.668058F, 16.330818F, 3.776233F);
      ((Path)localObject1).cubicTo(18.937078F, 7.849526F, 22.262306F, 11.45359F, 24.489111F, 15.746521F);
      ((Path)localObject1).cubicTo(22.951319F, 19.690027F, 17.718826F, 20.53863F, 14.313711F, 22.535341F);
      ((Path)localObject1).cubicTo(15.721691F, 27.826628F, 19.156763F, 32.249344F, 22.871433F, 36.152916F);
      ((Path)localObject1).cubicTo(27.245157F, 40.695438F, 32.267952F, 44.898514F, 38.409138F, 46.755459F);
      ((Path)localObject1).cubicTo(40.096718F, 43.281178F, 41.464756F, 39.487427F, 44.190845F, 36.662079F);
      ((Path)localObject1).cubicTo(45.838482F, 36.172886F, 47.176559F, 37.660435F, 48.494671F, 38.419186F);
      ((Path)localObject1).cubicTo(52.089512F, 41.23455F, 56.063808F, 43.560719F, 59.528839F, 46.53582F);
      ((Path)localObject1).cubicTo(60.647232F, 47.713879F, 59.508865F, 49.141529F, 58.849812F, 50.199787F);
      ((Path)localObject1).cubicTo(56.333424F, 53.624146F, 53.677235F, 57.22821F, 49.812778F, 59.224922F);
      ((Path)localObject1).cubicTo(46.797104F, 60.812309F, 43.34206F, 59.654217F, 40.39629F, 58.486141F);
      ((Path)localObject1).cubicTo(23.520502F, 51.367863F, 9.690345F, 37.480732F, 2.520632F, 20.638466F);
      ((Path)localObject1).cubicTo(1.172566F, 17.503628F, 0.1040992F, 13.679925F, 2.111219F, 10.565054F);
      ((Path)localObject1).lineTo(2.111219F, 10.565054F);
      ((Path)localObject1).lineTo(2.111219F, 10.565054F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.va
 * JD-Core Version:    0.6.2
 */