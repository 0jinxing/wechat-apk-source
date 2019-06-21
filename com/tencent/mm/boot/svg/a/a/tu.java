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

public final class tu extends c
{
  private final int height = 414;
  private final int width = 690;

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
        paramInt = 690;
        continue;
        paramInt = 414;
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
      localPaint1.setColor(-1315861);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 225.0F, 0.0F, 1.0F, 114.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(228.0F, 119.82288F);
      ((Path)localObject1).lineTo(228.0F, 12.0F);
      ((Path)localObject1).lineTo(12.0F, 12.0F);
      ((Path)localObject1).lineTo(12.0F, 119.51874F);
      ((Path)localObject1).lineTo(80.738312F, 55.335876F);
      ((Path)localObject1).lineTo(162.56027F, 130.40851F);
      ((Path)localObject1).lineTo(150.84477F, 106.32146F);
      ((Path)localObject1).lineTo(184.2155F, 80.511948F);
      ((Path)localObject1).lineTo(228.0F, 119.82288F);
      ((Path)localObject1).lineTo(228.0F, 119.82288F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(5.992495F, 0.0F);
      ((Path)localObject1).cubicTo(2.682931F, 0.0F, 0.0F, 2.683043F, 0.0F, 6.004041F);
      ((Path)localObject1).lineTo(0.0F, 179.99596F);
      ((Path)localObject1).cubicTo(0.0F, 183.3119F, 2.695313F, 186.0F, 5.992495F, 186.0F);
      ((Path)localObject1).lineTo(234.00751F, 186.0F);
      ((Path)localObject1).cubicTo(237.31706F, 186.0F, 240.0F, 183.31696F, 240.0F, 179.99596F);
      ((Path)localObject1).lineTo(240.0F, 6.004041F);
      ((Path)localObject1).cubicTo(240.0F, 2.688101F, 237.30469F, 0.0F, 234.00751F, 0.0F);
      ((Path)localObject1).lineTo(5.992495F, 0.0F);
      ((Path)localObject1).lineTo(5.992495F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tu
 * JD-Core Version:    0.6.2
 */