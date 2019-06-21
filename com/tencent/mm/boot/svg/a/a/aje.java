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

public final class aje extends c
{
  private final int height = 180;
  private final int width = 180;

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
        paramInt = 180;
        continue;
        paramInt = 180;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-855310);
      ((Paint)localObject1).setStrokeWidth(4.0F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(6.009757F, 12.0F);
      ((Path)localObject3).cubicTo(3.795167F, 12.0F, 2.0F, 13.792681F, 2.0F, 16.000319F);
      ((Path)localObject3).lineTo(2.0F, 54.999683F);
      ((Path)localObject3).cubicTo(2.0F, 57.20863F, 3.789142F, 59.0F, 5.991014F, 59.0F);
      ((Path)localObject3).lineTo(72.008987F, 59.0F);
      ((Path)localObject3).cubicTo(74.21183F, 59.0F, 76.0F, 57.208717F, 76.0F, 54.999683F);
      ((Path)localObject3).lineTo(76.0F, 16.000319F);
      ((Path)localObject3).cubicTo(76.0F, 13.79181F, 74.205315F, 12.0F, 71.990242F, 12.0F);
      ((Path)localObject3).lineTo(57.5F, 12.0F);
      ((Path)localObject3).lineTo(51.196438F, 3.595249F);
      ((Path)localObject3).cubicTo(50.5825F, 2.776666F, 49.029545F, 2.0F, 48.008911F, 2.0F);
      ((Path)localObject3).lineTo(29.991091F, 2.0F);
      ((Path)localObject3).cubicTo(28.967781F, 2.0F, 27.419127F, 2.774499F, 26.803562F, 3.595249F);
      ((Path)localObject3).lineTo(20.5F, 12.0F);
      ((Path)localObject3).lineTo(6.009757F, 12.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-855310);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(6.0F, 2.0F);
      ((Path)localObject1).lineTo(16.0F, 2.0F);
      ((Path)localObject1).lineTo(16.0F, 6.0F);
      ((Path)localObject1).lineTo(6.0F, 6.0F);
      ((Path)localObject1).lineTo(6.0F, 2.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-855310);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(21.0F, 33.0F);
      ((Path)localObject2).lineTo(15.0F, 33.0F);
      ((Path)localObject2).lineTo(23.25F, 24.75F);
      ((Path)localObject2).lineTo(31.5F, 33.0F);
      ((Path)localObject2).lineTo(25.0F, 33.0F);
      ((Path)localObject2).cubicTo(25.0F, 40.731987F, 31.268013F, 47.0F, 39.0F, 47.0F);
      ((Path)localObject2).cubicTo(42.931446F, 47.0F, 46.484406F, 45.379486F, 49.027344F, 42.769985F);
      ((Path)localObject2).lineTo(51.855957F, 45.598595F);
      ((Path)localObject2).cubicTo(48.588997F, 48.93187F, 44.036018F, 51.0F, 39.0F, 51.0F);
      ((Path)localObject2).cubicTo(29.058874F, 51.0F, 21.0F, 42.941124F, 21.0F, 33.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(57.0F, 33.0F);
      ((Path)localObject2).lineTo(63.0F, 33.0F);
      ((Path)localObject2).lineTo(54.75F, 41.25F);
      ((Path)localObject2).lineTo(46.5F, 33.0F);
      ((Path)localObject2).lineTo(53.0F, 33.0F);
      ((Path)localObject2).cubicTo(53.0F, 25.268013F, 46.731987F, 19.0F, 39.0F, 19.0F);
      ((Path)localObject2).cubicTo(35.068554F, 19.0F, 31.515596F, 20.620514F, 28.972656F, 23.230017F);
      ((Path)localObject2).lineTo(26.144045F, 20.401403F);
      ((Path)localObject2).cubicTo(29.411005F, 17.068129F, 33.963982F, 15.0F, 39.0F, 15.0F);
      ((Path)localObject2).cubicTo(48.941124F, 15.0F, 57.0F, 23.058874F, 57.0F, 33.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aje
 * JD-Core Version:    0.6.2
 */