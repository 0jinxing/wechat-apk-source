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

public final class ayt extends c
{
  private final int height = 131;
  private final int width = 131;

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
        paramInt = 131;
        continue;
        paramInt = 131;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 28.0F, 0.0F, 1.0F, 28.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 2.777778F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-14494688);
      localPaint2.setStrokeWidth(4.166667F);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(22.242647F, 9.672728F);
      localPath.lineTo(6.25F, 9.672728F);
      localPath.cubicTo(2.79822F, 9.672728F, -4.227211E-016F, 12.470947F, 0.0F, 15.922728F);
      localPath.lineTo(0.0F, 21.607521F);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint2.setColor(-14494688);
      arrayOfFloat = c.a(arrayOfFloat, -0.7071068F, -0.7071068F, 33.526459F, 0.7071068F, -0.7071068F, 5.469288F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.547169F, 7.605474F);
      ((Path)localObject1).lineTo(13.547169F, 15.896383F);
      ((Path)localObject1).lineTo(9.380502F, 15.896383F);
      ((Path)localObject1).lineTo(9.380502F, 7.605474F);
      ((Path)localObject1).lineTo(9.380502F, 3.460019F);
      ((Path)localObject1).lineTo(21.880503F, 3.460019F);
      ((Path)localObject1).lineTo(21.880503F, 7.605474F);
      ((Path)localObject1).lineTo(13.547169F, 7.605474F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-14494688);
      localPaint1.setStrokeWidth(5.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.127724F, 28.754545F);
      ((Path)localObject1).cubicTo(2.784849F, 28.754545F, 2.5F, 29.040102F, 2.5F, 29.385191F);
      ((Path)localObject1).lineTo(2.5F, 72.869354F);
      ((Path)localObject1).cubicTo(2.5F, 73.223274F, 2.775803F, 73.5F, 3.127724F, 73.5F);
      ((Path)localObject1).lineTo(46.872276F, 73.5F);
      ((Path)localObject1).cubicTo(47.215153F, 73.5F, 47.5F, 73.214447F, 47.5F, 72.869354F);
      ((Path)localObject1).lineTo(47.5F, 29.385191F);
      ((Path)localObject1).cubicTo(47.5F, 29.031269F, 47.224197F, 28.754545F, 46.872276F, 28.754545F);
      ((Path)localObject1).lineTo(3.127724F, 28.754545F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint1.setColor(-14494688);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(50.0F, 42.836365F);
      ((Path)localObject1).lineTo(50.0F, 37.861816F);
      ((Path)localObject1).lineTo(70.0F, 37.861816F);
      ((Path)localObject1).lineTo(70.0F, 6.356364F);
      ((Path)localObject1).lineTo(38.333332F, 6.356364F);
      ((Path)localObject1).lineTo(38.333332F, 26.254545F);
      ((Path)localObject1).lineTo(33.333332F, 26.254545F);
      ((Path)localObject1).lineTo(33.333332F, 4.497647F);
      ((Path)localObject1).cubicTo(33.333332F, 2.761085F, 34.735474F, 1.381818F, 36.465107F, 1.381818F);
      ((Path)localObject1).lineTo(71.868225F, 1.381818F);
      ((Path)localObject1).cubicTo(73.613678F, 1.381818F, 75.0F, 2.776822F, 75.0F, 4.497647F);
      ((Path)localObject1).lineTo(75.0F, 39.720535F);
      ((Path)localObject1).cubicTo(75.0F, 41.457096F, 73.597855F, 42.836365F, 71.868225F, 42.836365F);
      ((Path)localObject1).lineTo(50.0F, 42.836365F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-14494688);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(31.18659F, 60.799999F);
      ((Path)localObject2).lineTo(29.49906F, 55.437435F);
      ((Path)localObject2).lineTo(21.721077F, 55.437435F);
      ((Path)localObject2).lineTo(20.033546F, 60.799999F);
      ((Path)localObject2).lineTo(15.277778F, 60.799999F);
      ((Path)localObject2).lineTo(22.963713F, 38.69091F);
      ((Path)localObject2).lineTo(28.409834F, 38.69091F);
      ((Path)localObject2).lineTo(36.111111F, 60.799999F);
      ((Path)localObject2).lineTo(31.18659F, 60.799999F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(25.556374F, 42.919674F);
      ((Path)localObject2).lineTo(22.718254F, 51.974751F);
      ((Path)localObject2).lineTo(28.501883F, 51.974751F);
      ((Path)localObject2).lineTo(25.663763F, 42.919674F);
      ((Path)localObject2).lineTo(25.556374F, 42.919674F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayt
 * JD-Core Version:    0.6.2
 */