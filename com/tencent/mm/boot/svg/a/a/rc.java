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

public final class rc extends c
{
  private final int height = 140;
  private final int width = 140;

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
        paramInt = 140;
        continue;
        paramInt = 140;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1118482);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(140.0F, 0.0F);
      ((Path)localObject3).lineTo(140.0F, 140.0F);
      ((Path)localObject3).lineTo(0.0F, 140.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(45.81284F, 48.321449F);
      ((Path)localObject3).cubicTo(43.507927F, 53.372318F, 44.71574F, 59.121929F, 42.853695F, 64.272621F);
      ((Path)localObject3).cubicTo(40.629303F, 70.750908F, 35.747723F, 76.260956F, 35.224339F, 83.308212F);
      ((Path)localObject3).cubicTo(35.05323F, 86.811882F, 34.328541F, 91.203949F, 36.905212F, 93.988914F);
      ((Path)localObject3).cubicTo(40.045528F, 94.218498F, 42.129005F, 91.293785F, 44.363461F, 89.546944F);
      ((Path)localObject3).cubicTo(45.732319F, 92.940804F, 47.825863F, 95.96534F, 49.989861F, 98.910019F);
      ((Path)localObject3).cubicTo(47.785603F, 100.28753F, 44.28294F, 101.15596F, 43.970924F, 104.19048F);
      ((Path)localObject3).cubicTo(43.85014F, 107.11519F, 47.171631F, 108.45277F, 49.49667F, 109.23136F);
      ((Path)localObject3).cubicTo(56.451668F, 110.73864F, 64.433304F, 110.19962F, 69.999313F, 105.34838F);
      ((Path)localObject3).cubicTo(75.726364F, 110.19962F, 83.869041F, 110.87839F, 90.934753F, 109.11158F);
      ((Path)localObject3).cubicTo(93.149078F, 108.30304F, 96.339722F, 107.02535F, 95.987442F, 104.14056F);
      ((Path)localObject3).cubicTo(95.725746F, 101.03618F, 92.062042F, 100.17773F, 89.787331F, 98.860107F);
      ((Path)localObject3).cubicTo(92.333801F, 96.085121F, 94.366959F, 92.8909F, 95.836464F, 89.427155F);
      ((Path)localObject3).cubicTo(98.000465F, 91.293785F, 100.33557F, 94.797447F, 103.63692F, 93.76931F);
      ((Path)localObject3).cubicTo(105.5493F, 90.215729F, 104.99572F, 85.953438F, 104.6535F, 82.100395F);
      ((Path)localObject3).cubicTo(103.76778F, 74.414291F, 97.507271F, 68.644714F, 96.420242F, 61.028484F);
      ((Path)localObject3).cubicTo(95.826401F, 56.67635F, 95.927048F, 52.144539F, 94.13546F, 48.041954F);
      ((Path)localObject3).cubicTo(90.834099F, 39.187954F, 82.49012F, 32.260475F, 72.948387F, 31.21237F);
      ((Path)localObject3).cubicTo(61.272858F, 29.58531F, 49.667778F, 37.501003F, 45.81284F, 48.321449F);
      ((Path)localObject3).lineTo(45.81284F, 48.321449F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-4934220);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 35.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(10.812839F, 18.321447F);
      ((Path)localObject2).cubicTo(14.667778F, 7.501005F, 26.272856F, -0.4146892F, 37.948391F, 1.21237F);
      ((Path)localObject2).cubicTo(47.49012F, 2.260476F, 55.834103F, 9.187956F, 59.13546F, 18.041954F);
      ((Path)localObject2).cubicTo(60.927048F, 22.144539F, 60.826397F, 26.676348F, 61.420238F, 31.028482F);
      ((Path)localObject2).cubicTo(62.507271F, 38.644718F, 68.767776F, 44.414291F, 69.653503F, 52.100399F);
      ((Path)localObject2).cubicTo(69.99572F, 55.953434F, 70.549301F, 60.215733F, 68.636925F, 63.76931F);
      ((Path)localObject2).cubicTo(65.335571F, 64.797447F, 63.000462F, 61.293781F, 60.836464F, 59.427158F);
      ((Path)localObject2).cubicTo(59.366955F, 62.890896F, 57.333805F, 66.085121F, 54.787331F, 68.860107F);
      ((Path)localObject2).cubicTo(57.062046F, 70.177727F, 60.725746F, 71.036179F, 60.987442F, 74.140564F);
      ((Path)localObject2).cubicTo(61.339718F, 77.025352F, 58.149078F, 78.30304F, 55.934753F, 79.11158F);
      ((Path)localObject2).cubicTo(48.869041F, 80.878387F, 40.726364F, 80.199615F, 34.999313F, 75.348381F);
      ((Path)localObject2).cubicTo(29.433302F, 80.199615F, 21.451666F, 80.73864F, 14.496672F, 79.231361F);
      ((Path)localObject2).cubicTo(12.17163F, 78.452774F, 8.850142F, 77.115189F, 8.970923F, 74.190475F);
      ((Path)localObject2).cubicTo(9.282942F, 71.15596F, 12.785602F, 70.287529F, 14.989861F, 68.910019F);
      ((Path)localObject2).cubicTo(12.825862F, 65.96534F, 10.732318F, 62.940807F, 9.363462F, 59.54694F);
      ((Path)localObject2).cubicTo(7.129007F, 61.293781F, 5.045528F, 64.218498F, 1.905212F, 63.988911F);
      ((Path)localObject2).cubicTo(-0.671458F, 61.203945F, 0.05323037F, 56.811882F, 0.2243373F, 53.308216F);
      ((Path)localObject2).cubicTo(0.7477233F, 46.260952F, 5.629304F, 40.750912F, 7.853695F, 34.272617F);
      ((Path)localObject2).cubicTo(9.715741F, 29.121929F, 8.507928F, 23.37232F, 10.812839F, 18.321447F);
      ((Path)localObject2).lineTo(10.812839F, 18.321447F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.rc
 * JD-Core Version:    0.6.2
 */