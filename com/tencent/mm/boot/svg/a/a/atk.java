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

public final class atk extends c
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
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject3).setColor(-2565928);
      localCanvas.save();
      Paint localPaint1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(45.0F, 12.0F);
      ((Path)localObject3).cubicTo(63.225395F, 12.0F, 78.0F, 26.774603F, 78.0F, 45.0F);
      ((Path)localObject3).cubicTo(78.0F, 63.225395F, 63.225395F, 78.0F, 45.0F, 78.0F);
      ((Path)localObject3).cubicTo(26.774603F, 78.0F, 12.0F, 63.225395F, 12.0F, 45.0F);
      ((Path)localObject3).cubicTo(12.0F, 26.774603F, 26.774603F, 12.0F, 45.0F, 12.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(45.0F, 12.0F);
      ((Path)localObject3).cubicTo(63.225395F, 12.0F, 78.0F, 26.774603F, 78.0F, 45.0F);
      ((Path)localObject3).cubicTo(78.0F, 63.225395F, 63.225395F, 78.0F, 45.0F, 78.0F);
      ((Path)localObject3).cubicTo(26.774603F, 78.0F, 12.0F, 63.225395F, 12.0F, 45.0F);
      ((Path)localObject3).cubicTo(12.0F, 26.774603F, 26.774603F, 12.0F, 45.0F, 12.0F);
      ((Path)localObject3).close();
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.FILL);
      Paint localPaint3 = c.k(paramArrayOfObject);
      localPaint3.setFlags(385);
      localPaint3.setStyle(Paint.Style.STROKE);
      localPaint2.setColor(-16777216);
      localPaint3.setStrokeWidth(1.0F);
      localPaint3.setStrokeCap(Paint.Cap.BUTT);
      localPaint3.setStrokeJoin(Paint.Join.MITER);
      localPaint3.setStrokeMiter(4.0F);
      localPaint3.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 66.0F, 0.0F, 12.0F, 0.0F, 66.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint1, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -10560163, -5768183 }, new float[] { 0.0F, 1.0F }, (Matrix)localObject1, 0);
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(38.250305F, 53.508274F);
      ((Path)localObject2).lineTo(29.742029F, 45.0F);
      ((Path)localObject2).lineTo(25.49939F, 49.242641F);
      ((Path)localObject2).lineTo(38.22731F, 61.970562F);
      ((Path)localObject2).lineTo(38.283035F, 61.914837F);
      ((Path)localObject2).lineTo(38.30603F, 61.937832F);
      ((Path)localObject2).lineTo(64.621933F, 35.621929F);
      ((Path)localObject2).lineTo(60.379292F, 31.37929F);
      ((Path)localObject2).lineTo(38.250305F, 53.508274F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.atk
 * JD-Core Version:    0.6.2
 */