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

public final class afb extends c
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 31.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(78.991554F, 14.00827F);
      ((Path)localObject3).cubicTo(97.669479F, 31.740889F, 97.669479F, 61.25771F, 78.991554F, 78.991447F);
      ((Path)localObject3).cubicTo(61.258163F, 97.669518F, 31.741741F, 97.669518F, 14.008727F, 78.991447F);
      ((Path)localObject3).cubicTo(-4.669576F, 61.25771F, -4.669576F, 31.740889F, 14.008727F, 14.00827F);
      ((Path)localObject3).cubicTo(31.740246F, -4.669423F, 61.258163F, -4.669423F, 78.991554F, 14.00827F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(86.384529F, 48.423794F);
      ((Path)localObject3).cubicTo(86.384529F, 25.276369F, 68.759476F, 7.65122F, 48.424061F, 7.65122F);
      ((Path)localObject3).cubicTo(25.275711F, 7.65122F, 7.651712F, 25.276369F, 7.651712F, 48.423794F);
      ((Path)localObject3).cubicTo(7.651712F, 68.759315F, 25.276764F, 86.38446F, 45.612175F, 86.38446F);
      ((Path)localObject3).cubicTo(68.759476F, 86.38446F, 86.384529F, 68.759315F, 86.384529F, 48.423794F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(48.44434F, 43.142254F);
      ((Path)localObject2).lineTo(55.190773F, 29.0F);
      ((Path)localObject2).lineTo(61.51553F, 29.0F);
      ((Path)localObject2).lineTo(54.769096F, 43.142254F);
      ((Path)localObject2).lineTo(61.51553F, 43.142254F);
      ((Path)localObject2).lineTo(61.51553F, 48.44558F);
      ((Path)localObject2).lineTo(49.287769F, 48.44558F);
      ((Path)localObject2).lineTo(49.287769F, 53.306904F);
      ((Path)localObject2).lineTo(61.51553F, 53.306904F);
      ((Path)localObject2).lineTo(61.51553F, 58.610229F);
      ((Path)localObject2).lineTo(49.287769F, 58.610229F);
      ((Path)localObject2).lineTo(49.287769F, 66.565216F);
      ((Path)localObject2).lineTo(44.227966F, 66.565216F);
      ((Path)localObject2).lineTo(44.227966F, 58.610229F);
      ((Path)localObject2).lineTo(32.0F, 58.610229F);
      ((Path)localObject2).lineTo(32.0F, 53.306904F);
      ((Path)localObject2).lineTo(44.227966F, 53.306904F);
      ((Path)localObject2).lineTo(44.227966F, 48.44558F);
      ((Path)localObject2).lineTo(32.0F, 48.44558F);
      ((Path)localObject2).lineTo(32.0F, 43.142254F);
      ((Path)localObject2).lineTo(38.746433F, 43.142254F);
      ((Path)localObject2).lineTo(32.0F, 29.0F);
      ((Path)localObject2).lineTo(38.324757F, 29.0F);
      ((Path)localObject2).lineTo(45.07119F, 43.142254F);
      ((Path)localObject2).lineTo(48.44434F, 43.142254F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afb
 * JD-Core Version:    0.6.2
 */