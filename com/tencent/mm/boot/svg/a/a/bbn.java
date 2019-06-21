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

public final class bbn extends c
{
  private final int height = 14;
  private final int width = 16;

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
        paramInt = 16;
        continue;
        paramInt = 14;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -201.0F, 0.0F, 1.0F, -672.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 66.0F, 0.0F, 1.0F, 602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 134.0F, 0.0F, 1.0F, 68.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(18.0F, 0.0F);
      ((Path)localObject1).lineTo(18.0F, 18.0F);
      ((Path)localObject1).lineTo(0.0F, 18.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint2.setColor(-5066062);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(0.2F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(6.864254F, 4.997442F);
      ((Path)localObject2).lineTo(6.21267F, 4.997442F);
      ((Path)localObject2).lineTo(6.21267F, 3.063939F);
      ((Path)localObject2).cubicTo(6.21267F, 2.606291F, 6.577325F, 2.235294F, 7.027149F, 2.235294F);
      ((Path)localObject2).lineTo(15.714932F, 2.235294F);
      ((Path)localObject2).cubicTo(16.164757F, 2.235294F, 16.529411F, 2.606291F, 16.529411F, 3.063939F);
      ((Path)localObject2).lineTo(16.529411F, 9.693094F);
      ((Path)localObject2).cubicTo(16.529411F, 10.150743F, 16.164757F, 10.521739F, 15.714932F, 10.521739F);
      ((Path)localObject2).lineTo(14.357466F, 10.521739F);
      ((Path)localObject2).lineTo(14.357466F, 11.397775F);
      ((Path)localObject2).cubicTo(14.357466F, 11.544288F, 14.300259F, 11.684801F, 14.198429F, 11.788402F);
      ((Path)localObject2).cubicTo(13.98638F, 12.004139F, 13.64258F, 12.004139F, 13.430531F, 11.788402F);
      ((Path)localObject2).lineTo(12.728507F, 11.074169F);
      ((Path)localObject2).lineTo(12.728507F, 10.136664F);
      ((Path)localObject2).lineTo(13.705882F, 11.131038F);
      ((Path)localObject2).lineTo(13.705882F, 9.858824F);
      ((Path)localObject2).lineTo(15.714932F, 9.858824F);
      ((Path)localObject2).cubicTo(15.804897F, 9.858824F, 15.877828F, 9.784624F, 15.877828F, 9.693094F);
      ((Path)localObject2).lineTo(15.877828F, 3.063939F);
      ((Path)localObject2).cubicTo(15.877828F, 2.972409F, 15.804897F, 2.89821F, 15.714932F, 2.89821F);
      ((Path)localObject2).lineTo(7.027149F, 2.89821F);
      ((Path)localObject2).cubicTo(6.937184F, 2.89821F, 6.864254F, 2.972409F, 6.864254F, 3.063939F);
      ((Path)localObject2).lineTo(6.864254F, 4.997442F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint1.setColor(-5066062);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(0.2F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(5.544585F, 13.562148F);
      ((Path)localObject3).lineTo(11.914027F, 13.562148F);
      ((Path)localObject3).cubicTo(12.003992F, 13.562148F, 12.076923F, 13.487949F, 12.076923F, 13.39642F);
      ((Path)localObject3).lineTo(12.076923F, 5.826087F);
      ((Path)localObject3).cubicTo(12.076923F, 5.734558F, 12.003992F, 5.660358F, 11.914027F, 5.660358F);
      ((Path)localObject3).lineTo(2.285068F, 5.660358F);
      ((Path)localObject3).cubicTo(2.195103F, 5.660358F, 2.122172F, 5.734558F, 2.122172F, 5.826087F);
      ((Path)localObject3).lineTo(2.122172F, 13.39642F);
      ((Path)localObject3).cubicTo(2.122172F, 13.487949F, 2.195103F, 13.562148F, 2.285068F, 13.562148F);
      ((Path)localObject3).lineTo(4.294118F, 13.562148F);
      ((Path)localObject3).lineTo(4.294118F, 14.834363F);
      ((Path)localObject3).lineTo(5.544585F, 13.562148F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(4.56947F, 15.491726F);
      ((Path)localObject3).cubicTo(4.35742F, 15.707463F, 4.01362F, 15.707463F, 3.801571F, 15.491726F);
      ((Path)localObject3).cubicTo(3.699741F, 15.388125F, 3.642534F, 15.247613F, 3.642534F, 15.101099F);
      ((Path)localObject3).lineTo(3.642534F, 14.225064F);
      ((Path)localObject3).lineTo(2.285068F, 14.225064F);
      ((Path)localObject3).cubicTo(1.835243F, 14.225064F, 1.470588F, 13.854067F, 1.470588F, 13.39642F);
      ((Path)localObject3).lineTo(1.470588F, 5.826087F);
      ((Path)localObject3).cubicTo(1.470588F, 5.368439F, 1.835243F, 4.997442F, 2.285068F, 4.997442F);
      ((Path)localObject3).lineTo(11.914027F, 4.997442F);
      ((Path)localObject3).cubicTo(12.363852F, 4.997442F, 12.728507F, 5.368439F, 12.728507F, 5.826087F);
      ((Path)localObject3).lineTo(12.728507F, 13.39642F);
      ((Path)localObject3).cubicTo(12.728507F, 13.854067F, 12.363852F, 14.225064F, 11.914027F, 14.225064F);
      ((Path)localObject3).lineTo(5.81448F, 14.225064F);
      ((Path)localObject3).lineTo(4.56947F, 15.491726F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbn
 * JD-Core Version:    0.6.2
 */