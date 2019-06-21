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

public final class aej extends c
{
  private final int height = 92;
  private final int width = 92;

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
        paramInt = 92;
        continue;
        paramInt = 92;
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
      localPaint1.setColor(-3355444);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 22.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(17.932604F, 2.096915F);
      ((Path)localObject1).cubicTo(25.994081F, -0.5536036F, 35.345798F, 1.716841F, 41.396908F, 7.637999F);
      ((Path)localObject1).cubicTo(47.988117F, 13.789202F, 50.418564F, 23.60112F, 48.198154F, 32.242809F);
      ((Path)localObject1).cubicTo(44.577492F, 46.585617F, 34.955727F, 58.447937F, 24.993898F, 69.0F);
      ((Path)localObject1).cubicTo(17.072445F, 60.688374F, 9.661086F, 51.646606F, 4.860205F, 41.134548F);
      ((Path)localObject1).cubicTo(2.019684F, 34.843319F, 0.07932796F, 27.781939F, 1.449579F, 20.860584F);
      ((Path)localObject1).cubicTo(2.989862F, 12.228896F, 9.511058F, 4.657415F, 17.932604F, 2.096915F);
      ((Path)localObject1).lineTo(17.932604F, 2.096915F);
      ((Path)localObject1).lineTo(17.932604F, 2.096915F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.660744F, 14.37389F);
      ((Path)localObject1).cubicTo(16.35458F, 15.838051F, 12.456952F, 23.040936F, 14.585656F, 29.035152F);
      ((Path)localObject1).cubicTo(16.224659F, 34.636303F, 22.740694F, 38.291794F, 28.477203F, 36.57214F);
      ((Path)localObject1).cubicTo(34.683426F, 35.098152F, 38.491112F, 27.983707F, 36.442356F, 22.068104F);
      ((Path)localObject1).cubicTo(34.853325F, 16.447298F, 28.407246F, 12.781983F, 22.660744F, 14.37389F);
      ((Path)localObject1).lineTo(22.660744F, 14.37389F);
      ((Path)localObject1).lineTo(22.660744F, 14.37389F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aej
 * JD-Core Version:    0.6.2
 */