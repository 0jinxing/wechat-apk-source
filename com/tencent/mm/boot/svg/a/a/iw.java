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

public final class iw extends c
{
  private final int height = 48;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 48;
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
      localCanvas.save();
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-36352);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(15.346995F, 0.57833F);
      ((Path)localObject2).cubicTo(22.18465F, -1.173255F, 29.903292F, 1.138837F, 34.658615F, 6.363563F);
      ((Path)localObject2).cubicTo(39.944534F, 11.888561F, 41.47625F, 20.57642F, 38.492908F, 27.612785F);
      ((Path)localObject2).cubicTo(35.00901F, 36.751053F, 24.086781F, 42.075871F, 14.7263F, 39.233299F);
      ((Path)localObject2).cubicTo(7.257939F, 37.361607F, 1.38136F, 30.705584F, 0.2901382F, 23.098701F);
      ((Path)localObject2).cubicTo(-1.531902F, 13.179729F, 5.435899F, 2.640195F, 15.346995F, 0.57833F);
      ((Path)localObject2).lineTo(15.346995F, 0.57833F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-70474);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(13.42649F, 0.627618F);
      ((Path)localObject3).cubicTo(22.175201F, -1.891849F, 32.143734F, 3.427025F, 34.983315F, 12.055199F);
      ((Path)localObject3).cubicTo(37.472946F, 18.893751F, 35.273273F, 27.092016F, 29.664099F, 31.721035F);
      ((Path)localObject3).cubicTo(23.984934F, 36.70998F, 15.086246F, 37.41983F, 8.687188F, 33.410679F);
      ((Path)localObject3).cubicTo(2.728066F, 29.891422F, -0.7814165F, 22.712942F, 0.148447F, 15.854395F);
      ((Path)localObject3).cubicTo(0.9183331F, 8.685912F, 6.447518F, 2.377248F, 13.42649F, 0.627618F);
      ((Path)localObject3).lineTo(13.42649F, 0.627618F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-36352);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.025599F, 27.656855F);
      ((Path)localObject1).lineTo(15.003011F, 27.679443F);
      ((Path)localObject1).lineTo(17.831438F, 30.50787F);
      ((Path)localObject1).lineTo(31.450668F, 16.888639F);
      ((Path)localObject1).lineTo(28.622242F, 14.060212F);
      ((Path)localObject1).lineTo(17.854027F, 24.828426F);
      ((Path)localObject1).lineTo(11.996721F, 18.971123F);
      ((Path)localObject1).lineTo(9.168295F, 21.799549F);
      ((Path)localObject1).lineTo(15.025599F, 27.656855F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.iw
 * JD-Core Version:    0.6.2
 */