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

public final class ahn extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-14046139);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(96.0F, 0.0F);
      localPath.lineTo(96.0F, 96.0F);
      localPath.lineTo(0.0F, 96.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a(localPaint2, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 13.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.6F, 5.1F);
      ((Path)localObject1).lineTo(3.6F, 39.900002F);
      ((Path)localObject1).lineTo(56.400002F, 39.900002F);
      ((Path)localObject1).lineTo(56.400002F, 5.1F);
      ((Path)localObject1).lineTo(3.6F, 5.1F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.0F, 4.5F);
      ((Path)localObject1).cubicTo(-2.029061E-016F, 2.843146F, 1.343146F, 1.5F, 3.0F, 1.5F);
      ((Path)localObject1).lineTo(57.0F, 1.5F);
      ((Path)localObject1).cubicTo(58.656853F, 1.5F, 60.0F, 2.843146F, 60.0F, 4.5F);
      ((Path)localObject1).lineTo(60.0F, 40.5F);
      ((Path)localObject1).cubicTo(60.0F, 42.156853F, 58.656853F, 43.5F, 57.0F, 43.5F);
      ((Path)localObject1).lineTo(3.0F, 43.5F);
      ((Path)localObject1).cubicTo(1.343146F, 43.5F, -2.740258E-015F, 42.156853F, 0.0F, 40.5F);
      ((Path)localObject1).lineTo(0.0F, 4.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(2.512474F, 6.523073F);
      ((Path)localObject1).lineTo(25.253035F, 23.997351F);
      ((Path)localObject1).cubicTo(28.055511F, 26.150826F, 31.955736F, 26.150826F, 34.758213F, 23.997351F);
      ((Path)localObject1).lineTo(57.498775F, 6.523073F);
      ((Path)localObject1).lineTo(55.305271F, 3.668507F);
      ((Path)localObject1).lineTo(32.564709F, 21.142784F);
      ((Path)localObject1).cubicTo(31.055685F, 22.302349F, 28.955564F, 22.302349F, 27.446539F, 21.142784F);
      ((Path)localObject1).lineTo(4.705977F, 3.668507F);
      ((Path)localObject1).lineTo(2.512474F, 6.523073F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ahn
 * JD-Core Version:    0.6.2
 */