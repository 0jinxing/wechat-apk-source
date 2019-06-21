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

public final class ahw extends c
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
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16726153);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(54.0F, 3.068503F);
      ((Path)localObject1).cubicTo(54.0F, 1.636985F, 52.866337F, 0.657453F, 51.467896F, 0.8516811F);
      ((Path)localObject1).lineTo(2.532104F, 7.648319F);
      ((Path)localObject1).cubicTo(1.127867F, 7.843352F, 0.0F, 9.149959F, 0.0F, 10.568503F);
      ((Path)localObject1).lineTo(3.6F, 11.134557F);
      ((Path)localObject1).lineTo(50.400002F, 4.634556F);
      ((Path)localObject1).lineTo(50.400002F, 14.487597F);
      ((Path)localObject1).lineTo(54.0F, 14.961282F);
      ((Path)localObject1).lineTo(54.0F, 3.068503F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15365900);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(3.6F, 11.738222F);
      ((Path)localObject2).lineTo(3.6F, 41.976162F);
      ((Path)localObject2).lineTo(53.400002F, 48.528793F);
      ((Path)localObject2).lineTo(53.400002F, 18.290854F);
      ((Path)localObject2).lineTo(3.6F, 11.738222F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 10.638901F);
      ((Path)localObject2).cubicTo(0.0F, 8.979069F, 1.352776F, 7.811505F, 2.984314F, 8.026181F);
      ((Path)localObject2).lineTo(54.477234F, 14.801565F);
      ((Path)localObject2).cubicTo(55.870518F, 14.984893F, 57.0F, 16.29693F, 57.0F, 17.711035F);
      ((Path)localObject2).lineTo(57.0F, 49.628117F);
      ((Path)localObject2).cubicTo(57.0F, 51.287949F, 55.647224F, 52.455513F, 54.015686F, 52.240837F);
      ((Path)localObject2).lineTo(2.522766F, 45.46545F);
      ((Path)localObject2).cubicTo(1.129481F, 45.282124F, 0.0F, 43.970085F, 0.0F, 42.555981F);
      ((Path)localObject2).lineTo(0.0F, 10.638901F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ahw
 * JD-Core Version:    0.6.2
 */