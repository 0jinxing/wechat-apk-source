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

public final class asp extends c
{
  private final int height = 44;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 44;
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
      localPaint1.setColor(-3750202);
      localCanvas.save();
      Object localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(9.666615F, 0.0F);
      ((Path)localObject2).lineTo(11.372898F, 0.0F);
      ((Path)localObject2).cubicTo(19.305622F, 0.02008788F, 24.773712F, 9.732577F, 20.512991F, 16.52228F);
      ((Path)localObject2).cubicTo(16.801077F, 23.834269F, 5.156437F, 23.824224F, 1.464478F, 16.502193F);
      ((Path)localObject2).cubicTo(-2.556764F, 9.973632F, 2.20287F, 0.8738228F, 9.666615F, 0.0F);
      ((Path)localObject2).lineTo(9.666615F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject3, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(6.158603F, 1.137319F);
      ((Path)localObject3).cubicTo(12.047705F, -2.00158F, 20.032927F, 1.687126F, 21.580063F, 8.154857F);
      ((Path)localObject3).cubicTo(23.476555F, 14.432654F, 18.695402F, 21.130304F, 12.34715F, 22.0F);
      ((Path)localObject3).lineTo(9.921639F, 22.0F);
      ((Path)localObject3).cubicTo(4.64141F, 21.400211F, 0.359335F, 16.991756F, 0.0F, 11.673622F);
      ((Path)localObject3).lineTo(0.0F, 9.884251F);
      ((Path)localObject3).cubicTo(0.6188548F, 6.23553F, 2.714976F, 2.736758F, 6.158603F, 1.137319F);
      ((Path)localObject3).lineTo(6.158603F, 1.137319F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 26.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.06973729F, 11.944695F);
      ((Path)localObject1).cubicTo(-0.7299077F, 5.407746F, 5.477336F, -0.7793648F, 12.014434F, 0.08023384F);
      ((Path)localObject1).cubicTo(17.142157F, 0.400085F, 21.220346F, 4.75805F, 22.0F, 9.70574F);
      ((Path)localObject1).lineTo(22.0F, 12.044648F);
      ((Path)localObject1).cubicTo(21.440248F, 17.152264F, 17.332073F, 21.260345F, 12.284314F, 22.0F);
      ((Path)localObject1).lineTo(10.015322F, 22.0F);
      ((Path)localObject1).cubicTo(4.877603F, 21.440262F, 0.3795997F, 17.192245F, 0.06973729F, 11.944695F);
      ((Path)localObject1).lineTo(0.06973729F, 11.944695F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.asp
 * JD-Core Version:    0.6.2
 */