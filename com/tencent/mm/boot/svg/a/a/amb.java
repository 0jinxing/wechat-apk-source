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

public final class amb extends c
{
  private final int height = 73;
  private final int width = 73;

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
        paramInt = 73;
        continue;
        paramInt = 73;
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint2.setColor(-1);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(38.010899F, 48.0F);
      localPath.lineTo(11.027271F, 48.0F);
      localPath.lineTo(11.025387F, 45.0F);
      localPath.lineTo(38.0F, 45.0F);
      localPath.lineTo(38.0F, 47.725761F);
      localPath.cubicTo(38.0F, 47.817379F, 38.003681F, 47.908848F, 38.010899F, 48.0F);
      localPath.close();
      localPath.moveTo(42.0F, 26.200001F);
      localPath.lineTo(42.0F, 3.280343F);
      localPath.cubicTo(42.0F, 1.462754F, 40.532845F, 0.0F, 38.723015F, 0.0F);
      localPath.lineTo(10.276984F, 0.0F);
      localPath.cubicTo(8.459347F, 0.0F, 7.0F, 1.46866F, 7.0F, 3.280343F);
      localPath.lineTo(7.0F, 25.384615F);
      localPath.lineTo(7.769814F, 25.503048F);
      localPath.cubicTo(8.660358F, 25.640055F, 9.441465F, 26.109541F, 10.0F, 26.769991F);
      localPath.lineTo(10.0F, 3.0F);
      localPath.lineTo(39.0F, 3.0F);
      localPath.lineTo(39.0F, 27.697269F);
      localPath.cubicTo(39.574238F, 27.026283F, 40.350243F, 26.529951F, 41.205326F, 26.358934F);
      localPath.lineTo(42.0F, 26.200001F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localPaint2.setStrokeWidth(3.0F);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(8.0F, 20.0F);
      localPath.cubicTo(8.0F, 20.0F, 0.6497449F, 23.407583F, -8.881784E-014F, 24.0F);
      localPath.cubicTo(4.589579E-013F, 25.344828F, -6.827075E-014F, 49.992012F, -6.827075E-014F, 49.992012F);
      localPath.cubicTo(-7.96186E-014F, 50.54871F, 0.45008F, 51.0F, 0.9926417F, 51.0F);
      localPath.lineTo(6.0F, 51.0F);
      localPath.cubicTo(9.251935F, 51.0F, 12.15733F, 42.483112F, 12.0F, 38.0F);
      localPath.cubicTo(12.904676F, 38.0F, 16.089167F, 36.990547F, 18.0F, 35.0F);
      localPath.cubicTo(19.561045F, 33.172741F, 20.349682F, 30.5F, 20.0F, 29.0F);
      localPath.cubicTo(19.357014F, 26.5F, 12.872799F, 27.450745F, 10.0F, 27.0F);
      localPath.cubicTo(7.241985F, 27.450745F, 7.727435F, 22.480711F, 8.0F, 20.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localPaint1.setStrokeWidth(3.0F);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 78.147736F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(37.0F, 20.0F);
      ((Path)localObject1).cubicTo(37.0F, 20.0F, 29.654545F, 23.407583F, 29.0F, 24.0F);
      ((Path)localObject1).cubicTo(29.0F, 25.344828F, 29.0F, 49.992012F, 29.0F, 49.992012F);
      ((Path)localObject1).cubicTo(29.0F, 50.54871F, 29.452644F, 51.0F, 29.997412F, 51.0F);
      ((Path)localObject1).lineTo(35.0F, 51.0F);
      ((Path)localObject1).cubicTo(38.320278F, 51.0F, 41.247131F, 42.483112F, 41.0F, 38.0F);
      ((Path)localObject1).cubicTo(42.0F, 38.0F, 45.208015F, 36.990547F, 47.0F, 35.0F);
      ((Path)localObject1).cubicTo(48.705536F, 33.172741F, 49.5F, 30.5F, 49.0F, 28.5F);
      ((Path)localObject1).cubicTo(48.5F, 26.5F, 41.967888F, 27.450745F, 39.0F, 27.0F);
      ((Path)localObject1).cubicTo(36.295479F, 27.450745F, 36.784515F, 22.480711F, 37.0F, 20.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(9.0F, 15.403345F);
      ((Path)localObject2).cubicTo(13.294594F, 17.93784F, 18.527863F, 19.69076F, 24.174742F, 19.69076F);
      ((Path)localObject2).cubicTo(30.208483F, 19.69076F, 35.769997F, 17.689432F, 40.21875F, 14.871748F);
      ((Path)localObject2).lineTo(39.116177F, 14.871748F);
      ((Path)localObject2).lineTo(39.116177F, 12.13036F);
      ((Path)localObject2).cubicTo(34.953056F, 14.432558F, 29.780018F, 16.019415F, 24.174742F, 16.019415F);
      ((Path)localObject2).cubicTo(18.464275F, 16.019415F, 13.202425F, 14.372441F, 9.0F, 12.0F);
      ((Path)localObject2).lineTo(9.0F, 15.403345F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.amb
 * JD-Core Version:    0.6.2
 */