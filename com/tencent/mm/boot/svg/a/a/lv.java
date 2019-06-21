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

public final class lv extends c
{
  private final int height = 40;
  private final int width = 40;

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
        paramInt = 40;
        continue;
        paramInt = 40;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localCanvas.saveLayerAlpha(null, 12, 4);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(20.0F, 0.0F);
      localPath.cubicTo(31.045696F, 0.0F, 40.0F, 8.954305F, 40.0F, 20.0F);
      localPath.cubicTo(40.0F, 31.045696F, 31.045696F, 40.0F, 20.0F, 40.0F);
      localPath.cubicTo(8.954305F, 40.0F, 0.0F, 31.045696F, 0.0F, 20.0F);
      localPath.cubicTo(0.0F, 8.954305F, 8.954305F, 0.0F, 20.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.5F, 10.5F);
      ((Path)localObject1).lineTo(4.5F, 24.0F);
      ((Path)localObject1).cubicTo(4.5F, 24.276142F, 4.723857F, 24.5F, 5.0F, 24.5F);
      ((Path)localObject1).lineTo(23.0F, 24.5F);
      ((Path)localObject1).cubicTo(23.276142F, 24.5F, 23.5F, 24.276142F, 23.5F, 24.0F);
      ((Path)localObject1).lineTo(23.5F, 10.5F);
      ((Path)localObject1).lineTo(4.5F, 10.5F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-2565928);
      localPaint1.setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(25.499073F, 10.472813F);
      ((Path)localObject2).lineTo(23.211826F, 4.373488F);
      ((Path)localObject2).cubicTo(23.014799F, 3.848079F, 22.51252F, 3.5F, 21.951384F, 3.5F);
      ((Path)localObject2).lineTo(6.048616F, 3.5F);
      ((Path)localObject2).cubicTo(5.487479F, 3.5F, 4.985201F, 3.848079F, 4.788173F, 4.373488F);
      ((Path)localObject2).lineTo(2.500926F, 10.472813F);
      ((Path)localObject2).cubicTo(2.547857F, 12.704954F, 4.371993F, 14.5F, 6.615385F, 14.5F);
      ((Path)localObject2).cubicTo(7.926839F, 14.5F, 9.134812F, 13.882993F, 9.907946F, 12.853959F);
      ((Path)localObject2).lineTo(10.307693F, 12.321898F);
      ((Path)localObject2).lineTo(10.707439F, 12.853959F);
      ((Path)localObject2).cubicTo(11.480572F, 13.882993F, 12.688545F, 14.5F, 14.0F, 14.5F);
      ((Path)localObject2).cubicTo(15.311455F, 14.5F, 16.519428F, 13.882993F, 17.292561F, 12.853959F);
      ((Path)localObject2).lineTo(17.692308F, 12.321898F);
      ((Path)localObject2).lineTo(18.092054F, 12.853959F);
      ((Path)localObject2).cubicTo(18.865187F, 13.882993F, 20.07316F, 14.5F, 21.384615F, 14.5F);
      ((Path)localObject2).cubicTo(23.628008F, 14.5F, 25.452143F, 12.704954F, 25.499073F, 10.472813F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(5.0F, 10.0F);
      ((Path)localObject3).cubicTo(5.0F, 9.723858F, 5.223857F, 9.5F, 5.5F, 9.5F);
      ((Path)localObject3).lineTo(22.5F, 9.5F);
      ((Path)localObject3).cubicTo(22.776142F, 9.5F, 23.0F, 9.723858F, 23.0F, 10.0F);
      ((Path)localObject3).lineTo(23.0F, 10.0F);
      ((Path)localObject3).cubicTo(23.0F, 10.276142F, 22.776142F, 10.5F, 22.5F, 10.5F);
      ((Path)localObject3).lineTo(5.5F, 10.5F);
      ((Path)localObject3).cubicTo(5.223857F, 10.5F, 5.0F, 10.276142F, 5.0F, 10.0F);
      ((Path)localObject3).lineTo(5.0F, 10.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.lv
 * JD-Core Version:    0.6.2
 */