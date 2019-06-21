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

public final class bas extends c
{
  private final int height = 52;
  private final int width = 66;

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
        paramInt = 66;
        continue;
        paramInt = 52;
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
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-9139786);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(19.4F, 0.0F);
      ((Path)localObject1).lineTo(45.389999F, 0.0F);
      ((Path)localObject1).cubicTo(45.869999F, 1.968957F, 46.060001F, 3.987888F, 46.119999F, 6.006818F);
      ((Path)localObject1).cubicTo(51.060001F, 6.086776F, 56.02F, 5.75695F, 60.950001F, 6.156739F);
      ((Path)localObject1).cubicTo(63.610001F, 6.266681F, 65.290001F, 8.605442F, 66.0F, 10.944203F);
      ((Path)localObject1).lineTo(66.0F, 43.966709F);
      ((Path)localObject1).cubicTo(65.339996F, 46.72525F, 63.07F, 49.064011F, 60.080002F, 48.904095F);
      ((Path)localObject1).cubicTo(42.369999F, 49.064011F, 24.65F, 48.944073F, 6.93F, 48.964066F);
      ((Path)localObject1).cubicTo(3.74F, 49.293888F, 0.86F, 47.324932F, 0.0F, 44.226574F);
      ((Path)localObject1).lineTo(0.0F, 11.014166F);
      ((Path)localObject1).cubicTo(0.67F, 8.955257F, 1.89F, 6.726437F, 4.23F, 6.296665F);
      ((Path)localObject1).cubicTo(9.06F, 5.627019F, 13.96F, 6.136749F, 18.82F, 6.006818F);
      ((Path)localObject1).cubicTo(19.049999F, 4.007877F, 19.27F, 2.008936F, 19.4F, 0.0F);
      ((Path)localObject1).lineTo(19.4F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(28.390493F, 10.625401F);
      ((Path)localObject1).cubicTo(21.38109F, 12.364714F, 15.771568F, 18.702209F, 15.111625F, 25.929352F);
      ((Path)localObject1).cubicTo(14.381687F, 32.00695F, 17.281441F, 38.294464F, 22.351007F, 41.723106F);
      ((Path)localObject1).cubicTo(29.330412F, 46.681149F, 39.759521F, 45.961433F, 45.879002F, 39.913822F);
      ((Path)localObject1).cubicTo(50.788582F, 35.275658F, 52.328453F, 27.618683F, 49.798668F, 21.391146F);
      ((Path)localObject1).cubicTo(46.728928F, 13.064437F, 36.919765F, 8.196362F, 28.390493F, 10.625401F);
      ((Path)localObject1).lineTo(28.390493F, 10.625401F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(29.357378F, 16.571178F);
      ((Path)localObject3).cubicTo(35.967381F, 14.336706F, 44.025188F, 18.905405F, 44.863918F, 25.967936F);
      ((Path)localObject3).cubicTo(45.942287F, 32.382072F, 40.450596F, 38.576748F, 34.090218F, 38.925884F);
      ((Path)localObject3).cubicTo(27.719856F, 39.68401F, 21.17975F, 34.526764F, 21.019993F, 28.002903F);
      ((Path)localObject3).cubicTo(20.690491F, 22.835684F, 24.474766F, 18.017601F, 29.357378F, 16.571178F);
      ((Path)localObject3).lineTo(29.357378F, 16.571178F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bas
 * JD-Core Version:    0.6.2
 */