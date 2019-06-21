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

public final class bd extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      localPaint2.setColor(-16777216);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 15.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 7.5F, 0.0F, 1.0F, 13.125F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(70.5F, 40.908176F);
      ((Path)localObject).lineTo(70.5F, 6.375F);
      ((Path)localObject).lineTo(4.5F, 6.375F);
      ((Path)localObject).lineTo(4.5F, 39.720825F);
      ((Path)localObject).lineTo(23.247171F, 24.559719F);
      ((Path)localObject).cubicTo(24.981747F, 23.156944F, 27.767345F, 23.224977F, 29.439358F, 24.694063F);
      ((Path)localObject).lineTo(46.22596F, 39.443348F);
      ((Path)localObject).lineTo(54.784134F, 32.165615F);
      ((Path)localObject).cubicTo(56.517441F, 30.691641F, 59.275211F, 30.721584F, 60.957867F, 32.231564F);
      ((Path)localObject).lineTo(70.5F, 40.908176F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.5F, 46.851036F);
      ((Path)localObject).lineTo(57.84819F, 35.467094F);
      ((Path)localObject).lineTo(49.64241F, 42.445156F);
      ((Path)localObject).lineTo(54.684147F, 46.875F);
      ((Path)localObject).lineTo(48.041878F, 46.875F);
      ((Path)localObject).lineTo(26.272711F, 27.900312F);
      ((Path)localObject).lineTo(4.5F, 45.508213F);
      ((Path)localObject).lineTo(4.5F, 57.375F);
      ((Path)localObject).lineTo(70.5F, 57.375F);
      ((Path)localObject).lineTo(70.5F, 46.851036F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.719262F, 1.875F);
      ((Path)localObject).lineTo(71.280739F, 1.875F);
      ((Path)localObject).cubicTo(73.292603F, 1.875F, 75.0F, 3.679264F, 75.0F, 5.904936F);
      ((Path)localObject).lineTo(75.0F, 57.845062F);
      ((Path)localObject).cubicTo(75.0F, 60.079319F, 73.334831F, 61.875F, 71.280739F, 61.875F);
      ((Path)localObject).lineTo(3.719262F, 61.875F);
      ((Path)localObject).cubicTo(1.707396F, 61.875F, 0.0F, 60.070736F, 0.0F, 57.845062F);
      ((Path)localObject).lineTo(0.0F, 5.904936F);
      ((Path)localObject).cubicTo(0.0F, 3.670681F, 1.66517F, 1.875F, 3.719262F, 1.875F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bd
 * JD-Core Version:    0.6.2
 */