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

public final class bbg extends c
{
  private final int height = 16;
  private final int width = 12;

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
        paramInt = 12;
        continue;
        paramInt = 16;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-5066062);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -138.0F, 0.0F, 1.0F, -671.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 66.0F, 0.0F, 1.0F, 602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 69.0F, 0.0F, 1.0F, 68.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(6.15F, 2.4F);
      ((Path)localObject2).lineTo(6.15F, 13.35697F);
      ((Path)localObject2).lineTo(13.5F, 13.35697F);
      ((Path)localObject2).cubicTo(13.83137F, 13.35697F, 14.1F, 13.088341F, 14.1F, 12.756969F);
      ((Path)localObject2).lineTo(14.1F, 11.400009F);
      ((Path)localObject2).lineTo(14.1F, 3.0F);
      ((Path)localObject2).cubicTo(14.1F, 2.668629F, 13.83137F, 2.4F, 13.5F, 2.4F);
      ((Path)localObject2).lineTo(6.15F, 2.4F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(5.25F, 2.4F);
      ((Path)localObject2).lineTo(3.9F, 2.4F);
      ((Path)localObject2).lineTo(3.9F, 13.35697F);
      ((Path)localObject2).lineTo(5.25F, 13.35697F);
      ((Path)localObject2).lineTo(5.25F, 2.4F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(14.1F, 14.132156F);
      ((Path)localObject2).cubicTo(13.916262F, 14.212435F, 13.713331F, 14.256969F, 13.5F, 14.256969F);
      ((Path)localObject2).lineTo(3.9F, 14.256969F);
      ((Path)localObject2).lineTo(3.9F, 15.6F);
      ((Path)localObject2).lineTo(13.5F, 15.6F);
      ((Path)localObject2).cubicTo(13.83137F, 15.6F, 14.1F, 15.33137F, 14.1F, 15.0F);
      ((Path)localObject2).lineTo(14.1F, 14.132156F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(3.0F, 1.5F);
      ((Path)localObject2).lineTo(13.5F, 1.5F);
      ((Path)localObject2).cubicTo(14.328427F, 1.5F, 15.0F, 2.171573F, 15.0F, 3.0F);
      ((Path)localObject2).lineTo(15.0F, 15.0F);
      ((Path)localObject2).cubicTo(15.0F, 15.828427F, 14.328427F, 16.5F, 13.5F, 16.5F);
      ((Path)localObject2).lineTo(3.0F, 16.5F);
      ((Path)localObject2).lineTo(3.0F, 1.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbg
 * JD-Core Version:    0.6.2
 */