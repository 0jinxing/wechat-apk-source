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

public final class ch extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
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
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-855310);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 90.0F);
      ((Path)localObject3).lineTo(0.0F, 90.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(44.0F, 21.962822F);
      ((Path)localObject1).lineTo(44.0F, 4.0F);
      ((Path)localObject1).lineTo(4.0F, 4.0F);
      ((Path)localObject1).lineTo(4.0F, 20.913124F);
      ((Path)localObject1).lineTo(14.878189F, 12.518221F);
      ((Path)localObject1).cubicTo(15.988317F, 11.620444F, 17.771101F, 11.663985F, 18.841188F, 12.6042F);
      ((Path)localObject1).lineTo(29.616116F, 22.071421F);
      ((Path)localObject1).lineTo(35.061848F, 17.385994F);
      ((Path)localObject1).cubicTo(36.171162F, 16.44265F, 37.936134F, 16.461815F, 39.013035F, 17.428202F);
      ((Path)localObject1).lineTo(44.0F, 21.962822F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(44.0F, 29.163031F);
      ((Path)localObject1).lineTo(44.0F, 27.369196F);
      ((Path)localObject1).lineTo(36.995003F, 20.999496F);
      ((Path)localObject1).lineTo(32.650444F, 24.737488F);
      ((Path)localObject1).lineTo(34.997852F, 26.799999F);
      ((Path)localObject1).lineTo(28.937702F, 26.799999F);
      ((Path)localObject1).lineTo(16.771114F, 16.110018F);
      ((Path)localObject1).lineTo(4.0F, 25.965727F);
      ((Path)localObject1).lineTo(4.0F, 32.0F);
      ((Path)localObject1).lineTo(44.0F, 32.0F);
      ((Path)localObject1).lineTo(44.0F, 29.163031F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(-2.220446E-015F, 2.4F);
      ((Path)localObject1).cubicTo(-2.382771E-015F, 1.074517F, 1.074517F, 2.434874E-016F, 2.4F, 0.0F);
      ((Path)localObject1).lineTo(45.599998F, -2.220446E-015F);
      ((Path)localObject1).cubicTo(46.925484F, -2.463934E-015F, 48.0F, 1.074517F, 48.0F, 2.4F);
      ((Path)localObject1).lineTo(48.0F, 33.599998F);
      ((Path)localObject1).cubicTo(48.0F, 34.925484F, 46.925484F, 36.0F, 45.599998F, 36.0F);
      ((Path)localObject1).lineTo(2.4F, 36.0F);
      ((Path)localObject1).cubicTo(1.074517F, 36.0F, 1.623249E-016F, 34.925484F, 0.0F, 33.599998F);
      ((Path)localObject1).lineTo(-2.220446E-015F, 2.4F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ch
 * JD-Core Version:    0.6.2
 */