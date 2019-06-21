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

public final class ahf extends c
{
  private final int height = 46;
  private final int width = 46;

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
        paramInt = 46;
        continue;
        paramInt = 46;
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
      localCanvas.saveLayerAlpha(null, 64, 4);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -996.0F, 0.0F, 1.0F, -265.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1.0F, 0.0F, 1.0F, 216.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, -0.7071068F, 350.08917F, 0.7071068F, 0.7071068F, -700.33722F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(1018.4283F, 70.428261F);
      ((Path)localObject).lineTo(990.42639F, 70.428261F);
      ((Path)localObject).lineTo(990.42639F, 74.424553F);
      ((Path)localObject).lineTo(1018.4283F, 74.424553F);
      ((Path)localObject).lineTo(1018.4283F, 102.42641F);
      ((Path)localObject).lineTo(1022.4246F, 102.42641F);
      ((Path)localObject).lineTo(1022.4246F, 74.424553F);
      ((Path)localObject).lineTo(1050.4264F, 74.424553F);
      ((Path)localObject).lineTo(1050.4264F, 70.428261F);
      ((Path)localObject).lineTo(1022.4246F, 70.428261F);
      ((Path)localObject).lineTo(1022.4246F, 42.426407F);
      ((Path)localObject).lineTo(1018.4283F, 42.426407F);
      ((Path)localObject).lineTo(1018.4283F, 70.428261F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ahf
 * JD-Core Version:    0.6.2
 */