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

public final class mr extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localCanvas.saveLayerAlpha(null, 230, 4);
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, -1.0F, 0.0F, 72.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(42.834522F, 12.0F);
      ((Path)localObject2).cubicTo(48.806351F, 18.142136F, 52.5F, 26.627417F, 52.5F, 36.0F);
      ((Path)localObject2).cubicTo(52.5F, 45.372581F, 48.806351F, 53.857864F, 42.834522F, 60.0F);
      ((Path)localObject2).lineTo(39.334347F, 56.400002F);
      ((Path)localObject2).cubicTo(44.410397F, 51.179184F, 47.549999F, 43.966694F, 47.549999F, 36.0F);
      ((Path)localObject2).cubicTo(47.549999F, 28.033304F, 44.410397F, 20.820816F, 39.334347F, 15.6F);
      ((Path)localObject2).lineTo(42.834522F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(34.667442F, 20.4F);
      ((Path)localObject2).cubicTo(38.549126F, 24.392387F, 40.950001F, 29.907822F, 40.950001F, 36.0F);
      ((Path)localObject2).cubicTo(40.950001F, 42.092178F, 38.549126F, 47.607613F, 34.667442F, 51.599998F);
      ((Path)localObject2).lineTo(31.167261F, 48.0F);
      ((Path)localObject2).cubicTo(34.153175F, 44.928932F, 36.0F, 40.686291F, 36.0F, 36.0F);
      ((Path)localObject2).cubicTo(36.0F, 31.313709F, 34.153175F, 27.071068F, 31.167261F, 24.0F);
      ((Path)localObject2).lineTo(34.667442F, 20.4F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(26.500357F, 28.799999F);
      ((Path)localObject2).cubicTo(28.291904F, 30.642641F, 29.4F, 33.188225F, 29.4F, 36.0F);
      ((Path)localObject2).cubicTo(29.4F, 38.811775F, 28.291904F, 41.357361F, 26.500357F, 43.200001F);
      ((Path)localObject2).lineTo(19.5F, 36.0F);
      ((Path)localObject2).lineTo(26.500357F, 28.799999F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.mr
 * JD-Core Version:    0.6.2
 */