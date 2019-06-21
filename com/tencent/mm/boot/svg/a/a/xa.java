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

public final class xa extends c
{
  private final int height = 16;
  private final int width = 20;

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
        paramInt = 20;
        continue;
        paramInt = 16;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -320.0F, 0.0F, 1.0F, -110.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 108.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 320.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(20.0F, 16.0F);
      ((Path)localObject1).lineTo(0.0F, 16.0F);
      ((Path)localObject1).lineTo(0.0F, 9.25F);
      ((Path)localObject1).lineTo(0.0F, 9.25F);
      ((Path)localObject1).cubicTo(-1.690884E-017F, 9.111929F, 0.1119288F, 9.0F, 0.25F, 9.0F);
      ((Path)localObject1).lineTo(1.75F, 9.0F);
      ((Path)localObject1).lineTo(1.75F, 9.0F);
      ((Path)localObject1).cubicTo(1.888071F, 9.0F, 2.0F, 9.111929F, 2.0F, 9.25F);
      ((Path)localObject1).lineTo(2.0F, 14.0F);
      ((Path)localObject1).lineTo(18.0F, 14.0F);
      ((Path)localObject1).lineTo(18.0F, 9.25F);
      ((Path)localObject1).lineTo(18.0F, 9.25F);
      ((Path)localObject1).cubicTo(18.0F, 9.111929F, 18.111929F, 9.0F, 18.25F, 9.0F);
      ((Path)localObject1).lineTo(19.75F, 9.0F);
      ((Path)localObject1).lineTo(19.75F, 9.0F);
      ((Path)localObject1).cubicTo(19.888071F, 9.0F, 20.0F, 9.111929F, 20.0F, 9.25F);
      ((Path)localObject1).lineTo(20.0F, 16.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(14.0F, 0.0F);
      ((Path)localObject1).lineTo(19.0F, 4.0F);
      ((Path)localObject1).lineTo(14.0F, 8.0F);
      ((Path)localObject1).lineTo(14.0F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(5.0F, 11.0F);
      ((Path)localObject1).cubicTo(4.995516F, 7.91632F, 7.619254F, 2.002248F, 14.0F, 2.0F);
      ((Path)localObject1).cubicTo(13.975887F, 2.0F, 13.975887F, 3.333333F, 14.0F, 6.0F);
      ((Path)localObject1).cubicTo(10.277842F, 6.054565F, 7.277841F, 7.721232F, 5.0F, 11.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xa
 * JD-Core Version:    0.6.2
 */