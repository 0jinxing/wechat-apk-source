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

public final class de extends c
{
  private final int height = 96;
  private final int width = 130;

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
        paramInt = 130;
        continue;
        paramInt = 96;
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -238.0F, 0.0F, 1.0F, -166.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 238.0F, 0.0F, 1.0F, 166.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, -0.7071068F, 50.781029F, 0.7071068F, 0.7071068F, -41.066437F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(75.899033F, 17.651163F);
      ((Path)localObject).lineTo(92.860985F, 63.180599F);
      ((Path)localObject).lineTo(92.860985F, 63.180599F);
      ((Path)localObject).cubicTo(93.053787F, 63.698135F, 92.790543F, 64.273987F, 92.27301F, 64.466789F);
      ((Path)localObject).cubicTo(91.968353F, 64.580292F, 91.627533F, 64.538605F, 91.359215F, 64.355019F);
      ((Path)localObject).lineTo(74.961952F, 53.135838F);
      ((Path)localObject).lineTo(58.56469F, 64.355019F);
      ((Path)localObject).lineTo(58.56469F, 64.355019F);
      ((Path)localObject).cubicTo(58.108883F, 64.666885F, 57.486565F, 64.550201F, 57.174698F, 64.094391F);
      ((Path)localObject).cubicTo(56.991112F, 63.826077F, 56.949425F, 63.48526F, 57.062923F, 63.180599F);
      ((Path)localObject).lineTo(74.024872F, 17.651163F);
      ((Path)localObject).lineTo(74.024872F, 17.651163F);
      ((Path)localObject).cubicTo(74.217682F, 17.133627F, 74.793526F, 16.870382F, 75.311066F, 17.063189F);
      ((Path)localObject).cubicTo(75.583107F, 17.164541F, 75.797684F, 17.379114F, 75.899033F, 17.651163F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.de
 * JD-Core Version:    0.6.2
 */