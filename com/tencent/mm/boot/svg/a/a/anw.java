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

public final class anw extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-13421773);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 48.0F, 0.0F, 1.0F, 48.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(28.1486F, 46.851398F);
      ((Path)localObject2).cubicTo(35.633141F, 54.335941F, 42.724827F, 57.846451F, 45.347363F, 57.640877F);
      ((Path)localObject2).cubicTo(47.969898F, 57.435303F, 54.500744F, 52.944027F, 57.583836F, 53.003807F);
      ((Path)localObject2).cubicTo(59.065594F, 53.032539F, 68.748444F, 59.581047F, 69.920547F, 60.338161F);
      ((Path)localObject2).cubicTo(71.092659F, 61.095276F, 72.179466F, 61.979683F, 71.975105F, 63.098808F);
      ((Path)localObject2).cubicTo(71.770752F, 64.217934F, 67.515251F, 76.545105F, 56.65097F, 74.838074F);
      ((Path)localObject2).cubicTo(45.786686F, 73.131042F, 30.640358F, 61.419163F, 22.009607F, 52.990391F);
      ((Path)localObject2).lineTo(28.1486F, 46.851398F);
      ((Path)localObject2).lineTo(28.1486F, 46.851398F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(28.1486F, 46.851398F);
      ((Path)localObject2).cubicTo(20.664061F, 39.366859F, 17.153549F, 32.275173F, 17.359123F, 29.652639F);
      ((Path)localObject2).cubicTo(17.564697F, 27.030104F, 22.055973F, 20.499258F, 21.996193F, 17.416164F);
      ((Path)localObject2).cubicTo(21.967463F, 15.934404F, 15.418953F, 6.251558F, 14.661838F, 5.079449F);
      ((Path)localObject2).cubicTo(13.904722F, 3.90734F, 13.020318F, 2.820536F, 11.901191F, 3.024891F);
      ((Path)localObject2).cubicTo(10.782063F, 3.229247F, -1.545103F, 7.484747F, 0.1619265F, 18.34903F);
      ((Path)localObject2).cubicTo(1.868956F, 29.213312F, 13.580837F, 44.359642F, 22.009607F, 52.990391F);
      ((Path)localObject2).lineTo(28.1486F, 46.851398F);
      ((Path)localObject2).lineTo(28.1486F, 46.851398F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(36.0F, 2.552895F);
      ((Path)localObject1).cubicTo(36.0F, 1.916169F, 36.537994F, 1.4F, 37.198494F, 1.4F);
      ((Path)localObject1).lineTo(60.001503F, 1.4F);
      ((Path)localObject1).cubicTo(60.663414F, 1.4F, 61.200001F, 1.914178F, 61.200001F, 2.552895F);
      ((Path)localObject1).lineTo(61.200001F, 19.847105F);
      ((Path)localObject1).cubicTo(61.200001F, 20.483831F, 60.662003F, 21.0F, 60.001503F, 21.0F);
      ((Path)localObject1).lineTo(37.198494F, 21.0F);
      ((Path)localObject1).cubicTo(36.536583F, 21.0F, 36.0F, 20.485823F, 36.0F, 19.847105F);
      ((Path)localObject1).lineTo(36.0F, 2.552895F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(71.962502F, 22.315844F);
      ((Path)localObject1).cubicTo(71.603096F, 21.929012F, 67.161896F, 17.713648F, 64.0F, 14.820552F);
      ((Path)localObject1).lineTo(64.0F, 7.490361F);
      ((Path)localObject1).cubicTo(67.086624F, 4.636303F, 71.430885F, 0.5419411F, 71.962502F, 0.07080274F);
      ((Path)localObject1).cubicTo(72.858719F, -0.1871373F, 73.800003F, 0.2648844F, 73.800003F, 1.341948F);
      ((Path)localObject1).lineTo(73.800003F, 21.044699F);
      ((Path)localObject1).cubicTo(73.800003F, 22.006937F, 72.948807F, 22.635838F, 71.962502F, 22.315844F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anw
 * JD-Core Version:    0.6.2
 */