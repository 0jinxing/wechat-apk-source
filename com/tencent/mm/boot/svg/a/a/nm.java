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

public final class nm extends c
{
  private final int height = 42;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 42;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-5066062);
      localPaint.setStrokeWidth(3.1752F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.5876F, 2.1752F);
      ((Path)localObject1).cubicTo(1.5876F, 1.298393F, 2.298393F, 0.5875999F, 3.1752F, 0.5875999F);
      ((Path)localObject1).lineTo(38.824799F, 0.5875999F);
      ((Path)localObject1).cubicTo(39.701607F, 0.5875999F, 40.412399F, 1.298393F, 40.412399F, 2.1752F);
      ((Path)localObject1).lineTo(40.412399F, 27.8248F);
      ((Path)localObject1).cubicTo(40.412399F, 28.701607F, 39.701607F, 29.412401F, 38.824799F, 29.412401F);
      ((Path)localObject1).lineTo(3.1752F, 29.412401F);
      ((Path)localObject1).cubicTo(2.298393F, 29.412401F, 1.5876F, 28.701607F, 1.5876F, 27.8248F);
      ((Path)localObject1).lineTo(1.5876F, 2.1752F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-5066062);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(31.32F, 14.56F);
      ((Path)localObject2).lineTo(26.1F, 19.735001F);
      ((Path)localObject2).lineTo(28.188F, 23.875F);
      ((Path)localObject2).lineTo(13.572F, 10.42F);
      ((Path)localObject2).lineTo(0.0F, 22.84F);
      ((Path)localObject2).lineTo(0.0F, 29.049999F);
      ((Path)localObject2).lineTo(40.716F, 29.049999F);
      ((Path)localObject2).lineTo(40.716F, 22.84F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nm
 * JD-Core Version:    0.6.2
 */