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

public final class an extends c
{
  private final int height = 36;
  private final int width = 36;

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
        paramInt = 36;
        continue;
        paramInt = 36;
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
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(11.324318F, 1.44F);
      ((Path)localObject1).lineTo(10.550886F, 4.533727F);
      ((Path)localObject1).lineTo(9.774231F, 4.772571F);
      ((Path)localObject1).cubicTo(9.32088F, 4.911989F, 8.882618F, 5.093915F, 8.464506F, 5.315609F);
      ((Path)localObject1).lineTo(7.746217F, 5.696465F);
      ((Path)localObject1).lineTo(5.010732F, 4.055173F);
      ((Path)localObject1).lineTo(4.055173F, 5.010732F);
      ((Path)localObject1).lineTo(5.696465F, 7.746217F);
      ((Path)localObject1).lineTo(5.315609F, 8.464506F);
      ((Path)localObject1).cubicTo(5.093915F, 8.882618F, 4.911989F, 9.32088F, 4.772571F, 9.774231F);
      ((Path)localObject1).lineTo(4.533727F, 10.550886F);
      ((Path)localObject1).lineTo(1.44F, 11.324318F);
      ((Path)localObject1).lineTo(1.44F, 12.675682F);
      ((Path)localObject1).lineTo(4.533727F, 13.449114F);
      ((Path)localObject1).lineTo(4.772571F, 14.225769F);
      ((Path)localObject1).cubicTo(4.911989F, 14.67912F, 5.093915F, 15.117382F, 5.315609F, 15.535494F);
      ((Path)localObject1).lineTo(5.696465F, 16.253782F);
      ((Path)localObject1).lineTo(4.055173F, 18.989267F);
      ((Path)localObject1).lineTo(5.010732F, 19.944826F);
      ((Path)localObject1).lineTo(7.746217F, 18.303535F);
      ((Path)localObject1).lineTo(8.464506F, 18.684391F);
      ((Path)localObject1).cubicTo(8.882618F, 18.906086F, 9.32088F, 19.088011F, 9.774231F, 19.227428F);
      ((Path)localObject1).lineTo(10.550886F, 19.466272F);
      ((Path)localObject1).lineTo(11.324318F, 22.559999F);
      ((Path)localObject1).lineTo(12.675682F, 22.559999F);
      ((Path)localObject1).lineTo(13.449114F, 19.466272F);
      ((Path)localObject1).lineTo(14.225769F, 19.227428F);
      ((Path)localObject1).cubicTo(14.67912F, 19.088011F, 15.117382F, 18.906086F, 15.535494F, 18.684391F);
      ((Path)localObject1).lineTo(16.253782F, 18.303535F);
      ((Path)localObject1).lineTo(18.989267F, 19.944826F);
      ((Path)localObject1).lineTo(19.944826F, 18.989267F);
      ((Path)localObject1).lineTo(18.303535F, 16.253782F);
      ((Path)localObject1).lineTo(18.684391F, 15.535494F);
      ((Path)localObject1).cubicTo(18.906086F, 15.117382F, 19.088011F, 14.67912F, 19.227428F, 14.225769F);
      ((Path)localObject1).lineTo(19.466272F, 13.449114F);
      ((Path)localObject1).lineTo(22.559999F, 12.675682F);
      ((Path)localObject1).lineTo(22.559999F, 11.324318F);
      ((Path)localObject1).lineTo(19.466272F, 10.550886F);
      ((Path)localObject1).lineTo(19.227428F, 9.774231F);
      ((Path)localObject1).cubicTo(19.088011F, 9.32088F, 18.906086F, 8.882618F, 18.684391F, 8.464506F);
      ((Path)localObject1).lineTo(18.303535F, 7.746217F);
      ((Path)localObject1).lineTo(19.944826F, 5.010732F);
      ((Path)localObject1).lineTo(18.989267F, 4.055173F);
      ((Path)localObject1).lineTo(16.253782F, 5.696465F);
      ((Path)localObject1).lineTo(15.535494F, 5.315609F);
      ((Path)localObject1).cubicTo(15.117382F, 5.093915F, 14.67912F, 4.911989F, 14.225769F, 4.772571F);
      ((Path)localObject1).lineTo(13.449114F, 4.533727F);
      ((Path)localObject1).lineTo(12.675682F, 1.44F);
      ((Path)localObject1).lineTo(11.324318F, 1.44F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(16.210062F, 4.043383F);
      ((Path)localObject1).lineTo(18.409077F, 2.723974F);
      ((Path)localObject1).cubicTo(18.881248F, 2.440671F, 19.485638F, 2.515075F, 19.875F, 2.904437F);
      ((Path)localObject1).lineTo(21.095562F, 4.125F);
      ((Path)localObject1).cubicTo(21.484924F, 4.514362F, 21.559328F, 5.118752F, 21.276026F, 5.590923F);
      ((Path)localObject1).lineTo(19.956617F, 7.789938F);
      ((Path)localObject1).cubicTo(20.218946F, 8.284686F, 20.43648F, 8.806827F, 20.603815F, 9.350954F);
      ((Path)localObject1).lineTo(23.091043F, 9.972761F);
      ((Path)localObject1).cubicTo(23.625244F, 10.106311F, 24.0F, 10.58629F, 24.0F, 11.136931F);
      ((Path)localObject1).lineTo(24.0F, 12.863069F);
      ((Path)localObject1).cubicTo(24.0F, 13.41371F, 23.625244F, 13.893689F, 23.091043F, 14.027239F);
      ((Path)localObject1).lineTo(20.603815F, 14.649046F);
      ((Path)localObject1).cubicTo(20.43648F, 15.193173F, 20.218946F, 15.715314F, 19.956617F, 16.210062F);
      ((Path)localObject1).lineTo(21.276026F, 18.409077F);
      ((Path)localObject1).cubicTo(21.559328F, 18.881248F, 21.484924F, 19.485638F, 21.095562F, 19.875F);
      ((Path)localObject1).lineTo(19.875F, 21.095562F);
      ((Path)localObject1).cubicTo(19.485638F, 21.484924F, 18.881248F, 21.559328F, 18.409077F, 21.276026F);
      ((Path)localObject1).lineTo(16.210062F, 19.956617F);
      ((Path)localObject1).cubicTo(15.715314F, 20.218946F, 15.193173F, 20.43648F, 14.649046F, 20.603815F);
      ((Path)localObject1).lineTo(14.027239F, 23.091043F);
      ((Path)localObject1).cubicTo(13.893689F, 23.625244F, 13.41371F, 24.0F, 12.863069F, 24.0F);
      ((Path)localObject1).lineTo(11.136931F, 24.0F);
      ((Path)localObject1).cubicTo(10.58629F, 24.0F, 10.106311F, 23.625244F, 9.972761F, 23.091043F);
      ((Path)localObject1).lineTo(9.350954F, 20.603815F);
      ((Path)localObject1).cubicTo(8.806827F, 20.43648F, 8.284686F, 20.218946F, 7.789938F, 19.956617F);
      ((Path)localObject1).lineTo(5.590923F, 21.276026F);
      ((Path)localObject1).cubicTo(5.118752F, 21.559328F, 4.514362F, 21.484924F, 4.125F, 21.095562F);
      ((Path)localObject1).lineTo(2.904437F, 19.875F);
      ((Path)localObject1).cubicTo(2.515075F, 19.485638F, 2.440671F, 18.881248F, 2.723974F, 18.409077F);
      ((Path)localObject1).lineTo(4.043383F, 16.210062F);
      ((Path)localObject1).cubicTo(3.781054F, 15.715314F, 3.56352F, 15.193173F, 3.396186F, 14.649046F);
      ((Path)localObject1).lineTo(0.9089572F, 14.027239F);
      ((Path)localObject1).cubicTo(0.3747568F, 13.893689F, 0.0F, 13.41371F, 0.0F, 12.863069F);
      ((Path)localObject1).lineTo(0.0F, 11.136931F);
      ((Path)localObject1).cubicTo(0.0F, 10.58629F, 0.3747568F, 10.106311F, 0.9089572F, 9.972761F);
      ((Path)localObject1).lineTo(3.396186F, 9.350954F);
      ((Path)localObject1).cubicTo(3.56352F, 8.806827F, 3.781054F, 8.284686F, 4.043383F, 7.789938F);
      ((Path)localObject1).lineTo(2.723974F, 5.590923F);
      ((Path)localObject1).cubicTo(2.440671F, 5.118752F, 2.515075F, 4.514362F, 2.904437F, 4.125F);
      ((Path)localObject1).lineTo(4.125F, 2.904437F);
      ((Path)localObject1).cubicTo(4.514362F, 2.515075F, 5.118752F, 2.440671F, 5.590923F, 2.723974F);
      ((Path)localObject1).lineTo(7.789938F, 4.043383F);
      ((Path)localObject1).cubicTo(8.284686F, 3.781054F, 8.806827F, 3.56352F, 9.350954F, 3.396186F);
      ((Path)localObject1).lineTo(9.972761F, 0.9089572F);
      ((Path)localObject1).cubicTo(10.106311F, 0.3747568F, 10.58629F, 0.0F, 11.136931F, 0.0F);
      ((Path)localObject1).lineTo(12.863069F, 0.0F);
      ((Path)localObject1).cubicTo(13.41371F, 0.0F, 13.893689F, 0.3747568F, 14.027239F, 0.9089572F);
      ((Path)localObject1).lineTo(14.649046F, 3.396186F);
      ((Path)localObject1).cubicTo(15.193173F, 3.56352F, 15.715314F, 3.781054F, 16.210062F, 4.043383F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(12.0F, 15.6F);
      ((Path)localObject1).cubicTo(13.988225F, 15.6F, 15.6F, 13.988225F, 15.6F, 12.0F);
      ((Path)localObject1).cubicTo(15.6F, 10.011775F, 13.988225F, 8.4F, 12.0F, 8.4F);
      ((Path)localObject1).cubicTo(10.011775F, 8.4F, 8.4F, 10.011775F, 8.4F, 12.0F);
      ((Path)localObject1).cubicTo(8.4F, 13.988225F, 10.011775F, 15.6F, 12.0F, 15.6F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(12.0F, 17.040001F);
      ((Path)localObject1).cubicTo(9.216485F, 17.040001F, 6.96F, 14.783515F, 6.96F, 12.0F);
      ((Path)localObject1).cubicTo(6.96F, 9.216485F, 9.216485F, 6.96F, 12.0F, 6.96F);
      ((Path)localObject1).cubicTo(14.783515F, 6.96F, 17.040001F, 9.216485F, 17.040001F, 12.0F);
      ((Path)localObject1).cubicTo(17.040001F, 14.783515F, 14.783515F, 17.040001F, 12.0F, 17.040001F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.an
 * JD-Core Version:    0.6.2
 */