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

public final class aky extends c
{
  private final int height = 271;
  private final int width = 152;

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
        paramInt = 152;
        continue;
        paramInt = 271;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1.333333F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(4.0F);
      Object localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(2.0F, 16.0F);
      ((Path)localObject4).cubicTo(2.0F, 8.268013F, 8.268013F, 2.0F, 16.0F, 2.0F);
      ((Path)localObject4).lineTo(133.33333F, 2.0F);
      ((Path)localObject4).cubicTo(141.06531F, 2.0F, 147.33333F, 8.268013F, 147.33333F, 16.0F);
      ((Path)localObject4).lineTo(147.33333F, 250.66666F);
      ((Path)localObject4).cubicTo(147.33333F, 258.39865F, 141.06531F, 264.66666F, 133.33333F, 264.66666F);
      ((Path)localObject4).lineTo(16.0F, 264.66666F);
      ((Path)localObject4).cubicTo(8.268013F, 264.66666F, 2.0F, 258.39865F, 2.0F, 250.66666F);
      ((Path)localObject4).lineTo(2.0F, 16.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject4).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(2.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(11.666667F, 29.0F);
      ((Path)localObject3).lineTo(11.666667F, 232.33333F);
      ((Path)localObject3).lineTo(137.66667F, 232.33333F);
      ((Path)localObject3).lineTo(137.66667F, 29.0F);
      ((Path)localObject3).lineTo(11.666667F, 29.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(65.333336F, 13.333333F);
      ((Path)localObject4).lineTo(85.333336F, 13.333333F);
      ((Path)localObject4).lineTo(85.333336F, 17.333332F);
      ((Path)localObject4).lineTo(65.333336F, 17.333332F);
      ((Path)localObject4).lineTo(65.333336F, 13.333333F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 42.666668F, 0.0F, 1.0F, 91.333336F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15028967);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(66.666664F, 33.744858F);
      ((Path)localObject2).cubicTo(66.666664F, 14.923457F, 51.74321F, 0.0F, 32.92181F, 0.0F);
      ((Path)localObject2).cubicTo(14.923457F, 0.0F, 0.0F, 14.923457F, 0.0F, 33.744858F);
      ((Path)localObject2).cubicTo(0.0F, 51.74321F, 14.923457F, 66.666664F, 32.92181F, 66.666664F);
      ((Path)localObject2).cubicTo(51.74321F, 66.666664F, 66.666664F, 51.74321F, 66.666664F, 33.744858F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(16.874653F, 34.660118F);
      ((Path)localObject1).lineTo(18.06757F, 33.036938F);
      ((Path)localObject1).lineTo(18.06757F, 33.036938F);
      ((Path)localObject1).cubicTo(18.28561F, 32.740253F, 18.702879F, 32.676502F, 18.999563F, 32.894543F);
      ((Path)localObject1).cubicTo(19.003172F, 32.897194F, 19.006756F, 32.899883F, 19.010311F, 32.902611F);
      ((Path)localObject1).lineTo(27.124714F, 39.121834F);
      ((Path)localObject1).lineTo(27.124714F, 39.121834F);
      ((Path)localObject1).cubicTo(27.619293F, 39.5009F, 28.310467F, 39.486851F, 28.789234F, 39.088001F);
      ((Path)localObject1).lineTo(49.794125F, 21.589226F);
      ((Path)localObject1).lineTo(49.794125F, 21.589226F);
      ((Path)localObject1).cubicTo(50.057789F, 21.369574F, 50.445126F, 21.385962F, 50.689293F, 21.6271F);
      ((Path)localObject1).lineTo(51.706726F, 22.631914F);
      ((Path)localObject1).lineTo(51.706726F, 22.631914F);
      ((Path)localObject1).cubicTo(51.968697F, 22.890633F, 51.971329F, 23.312735F, 51.712608F, 23.574705F);
      ((Path)localObject1).cubicTo(51.710388F, 23.576954F, 51.708149F, 23.579187F, 51.705898F, 23.581406F);
      ((Path)localObject1).lineTo(28.928864F, 45.99741F);
      ((Path)localObject1).lineTo(28.928864F, 45.99741F);
      ((Path)localObject1).cubicTo(28.404022F, 46.513931F, 27.559828F, 46.507187F, 27.043306F, 45.982346F);
      ((Path)localObject1).cubicTo(27.040442F, 45.979435F, 27.037592F, 45.976513F, 27.034756F, 45.973576F);
      ((Path)localObject1).lineTo(16.932417F, 35.518158F);
      ((Path)localObject1).lineTo(16.932417F, 35.518158F);
      ((Path)localObject1).cubicTo(16.706604F, 35.284454F, 16.682201F, 34.921982F, 16.874653F, 34.660118F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aky
 * JD-Core Version:    0.6.2
 */