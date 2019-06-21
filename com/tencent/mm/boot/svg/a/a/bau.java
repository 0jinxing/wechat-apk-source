package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class bau extends c
{
  private final int height = 102;
  private final int width = 102;

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
        paramInt = 102;
        continue;
        paramInt = 102;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-789517);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(102.0F, 0.0F);
      ((Path)localObject).lineTo(102.0F, 102.0F);
      ((Path)localObject).lineTo(0.0F, 102.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject, c.a(localPaint2, paramArrayOfObject));
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-12354608);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(50.655247F, 48.301735F);
      ((Path)localObject).lineTo(26.15658F, 30.9727F);
      ((Path)localObject).cubicTo(26.750633F, 30.543125F, 35.868839F, 24.124636F, 50.655247F, 23.766985F);
      ((Path)localObject).cubicTo(65.466843F, 24.124636F, 74.612946F, 30.543125F, 75.207001F, 30.9727F);
      ((Path)localObject).lineTo(50.655247F, 48.301735F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.655247F, 76.958328F);
      ((Path)localObject).cubicTo(32.996593F, 65.545547F, 28.063675F, 44.621784F, 26.588911F, 34.826061F);
      ((Path)localObject).lineTo(50.655247F, 58.755859F);
      ((Path)localObject).lineTo(74.774666F, 34.826061F);
      ((Path)localObject).cubicTo(73.299904F, 44.621784F, 68.182053F, 65.545547F, 50.655247F, 76.958328F);
      ((Path)localObject).lineTo(50.655247F, 76.958328F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(80.505829F, 27.418613F);
      ((Path)localObject).cubicTo(78.234055F, 25.462376F, 67.93515F, 18.0F, 50.655247F, 18.0F);
      ((Path)localObject).cubicTo(33.367691F, 18.0F, 23.094215F, 25.462376F, 20.822441F, 27.418613F);
      ((Path)localObject).cubicTo(20.739235F, 27.489798F, 20.0F, 28.147461F, 20.0F, 28.147461F);
      ((Path)localObject).lineTo(20.033085F, 31.721006F);
      ((Path)localObject).cubicTo(20.038271F, 32.076931F, 20.300978F, 40.503387F, 23.987518F, 51.028694F);
      ((Path)localObject).cubicTo(28.894264F, 65.038139F, 37.481873F, 76.144997F, 49.090115F, 83.075333F);
      ((Path)localObject).lineTo(50.655247F, 84.0F);
      ((Path)localObject).lineTo(52.240131F, 83.075333F);
      ((Path)localObject).cubicTo(63.848377F, 76.144997F, 72.402649F, 65.038139F, 77.309395F, 51.028694F);
      ((Path)localObject).cubicTo(80.995941F, 40.503387F, 81.263092F, 32.076931F, 81.268272F, 31.721006F);
      ((Path)localObject).lineTo(81.310005F, 28.147461F);
      ((Path)localObject).cubicTo(81.310005F, 28.147461F, 80.588791F, 27.489798F, 80.505829F, 27.418613F);
      ((Path)localObject).lineTo(80.505829F, 27.418613F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bau
 * JD-Core Version:    0.6.2
 */