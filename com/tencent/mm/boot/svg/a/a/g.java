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

public final class g extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(16.0F, 3.0F);
      ((Path)localObject2).cubicTo(27.571133F, -2.860914F, 43.519093F, -0.1351836F, 52.0F, 10.0F);
      ((Path)localObject2).cubicTo(55.015995F, 12.687686F, 56.702606F, 16.060032F, 58.0F, 20.0F);
      ((Path)localObject2).cubicTo(53.848339F, 22.386908F, 54.956116F, 27.709045F, 55.0F, 32.0F);
      ((Path)localObject2).cubicTo(51.892269F, 32.106026F, 48.828426F, 31.668318F, 46.0F, 32.0F);
      ((Path)localObject2).cubicTo(40.425308F, 34.334362F, 40.385387F, 43.516293F, 46.0F, 46.0F);
      ((Path)localObject2).cubicTo(47.032036F, 45.804314F, 48.239609F, 46.003273F, 49.0F, 46.0F);
      ((Path)localObject2).cubicTo(42.640858F, 51.186138F, 33.958302F, 53.921818F, 25.0F, 53.0F);
      ((Path)localObject2).cubicTo(21.613102F, 52.42963F, 18.130098F, 50.758377F, 15.0F, 50.0F);
      ((Path)localObject2).cubicTo(10.964495F, 49.703899F, 7.611231F, 51.295567F, 4.0F, 52.0F);
      ((Path)localObject2).cubicTo(4.427628F, 48.201763F, 7.431593F, 44.073376F, 5.0F, 41.0F);
      ((Path)localObject2).cubicTo(0.834845F, 35.28936F, -0.8717262F, 28.425297F, 3.552714E-015F, 22.0F);
      ((Path)localObject2).cubicTo(1.96258F, 13.652635F, 8.11023F, 6.758725F, 16.0F, 3.0F);
      ((Path)localObject2).lineTo(16.0F, 3.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(59.0F, 25.0F);
      ((Path)localObject1).cubicTo(60.022385F, 23.507645F, 63.989056F, 23.527437F, 65.0F, 25.0F);
      ((Path)localObject1).cubicTo(65.397224F, 28.960669F, 65.11956F, 32.513546F, 65.0F, 36.0F);
      ((Path)localObject1).cubicTo(68.620148F, 36.086216F, 72.041405F, 35.957561F, 75.0F, 36.0F);
      ((Path)localObject1).cubicTo(78.407913F, 35.710144F, 78.487251F, 39.896404F, 77.0F, 42.0F);
      ((Path)localObject1).cubicTo(73.340492F, 42.5289F, 69.185402F, 41.727276F, 65.0F, 42.0F);
      ((Path)localObject1).cubicTo(65.169144F, 45.200981F, 65.298058F, 48.427269F, 65.0F, 52.0F);
      ((Path)localObject1).cubicTo(65.268311F, 54.563156F, 60.756218F, 54.444397F, 59.0F, 53.0F);
      ((Path)localObject1).cubicTo(58.336548F, 49.476307F, 59.080299F, 45.646328F, 59.0F, 42.0F);
      ((Path)localObject1).cubicTo(55.440876F, 41.945F, 52.019619F, 42.063759F, 49.0F, 42.0F);
      ((Path)localObject1).cubicTo(45.167191F, 42.509106F, 45.117607F, 35.621075F, 49.0F, 36.0F);
      ((Path)localObject1).cubicTo(51.970036F, 35.957561F, 55.411125F, 36.086216F, 59.0F, 36.0F);
      ((Path)localObject1).cubicTo(58.931549F, 32.513546F, 58.643967F, 28.970564F, 59.0F, 25.0F);
      ((Path)localObject1).lineTo(59.0F, 25.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.g
 * JD-Core Version:    0.6.2
 */