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

public final class alp extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15028967);
      ((Paint)localObject2).setStrokeWidth(3.6F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(21.0F, 11.55F);
      ((Path)localObject1).lineTo(63.0F, 11.55F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15028967);
      ((Paint)localObject2).setStrokeWidth(3.6F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(21.0F, 31.799999F);
      ((Path)localObject1).lineTo(63.0F, 31.799999F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-15028967);
      ((Paint)localObject3).setStrokeWidth(3.6F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(21.0F, 52.049999F);
      ((Path)localObject1).lineTo(63.0F, 52.049999F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15028967);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(5.090625F, 18.0F);
      ((Path)localObject3).lineTo(5.090625F, 7.06875F);
      ((Path)localObject3).lineTo(5.034375F, 7.06875F);
      ((Path)localObject3).lineTo(1.584375F, 9.45F);
      ((Path)localObject3).lineTo(1.584375F, 6.9F);
      ((Path)localObject3).lineTo(5.08125F, 4.471875F);
      ((Path)localObject3).lineTo(7.89375F, 4.471875F);
      ((Path)localObject3).lineTo(7.89375F, 18.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15028967);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(6.375F, 27.75F);
      ((Path)localObject3).cubicTo(8.238961F, 27.75F, 9.75F, 29.26104F, 9.75F, 31.125F);
      ((Path)localObject3).cubicTo(9.75F, 32.98896F, 8.238961F, 34.5F, 6.375F, 34.5F);
      ((Path)localObject3).cubicTo(4.511039F, 34.5F, 3.0F, 32.98896F, 3.0F, 31.125F);
      ((Path)localObject3).cubicTo(3.0F, 29.26104F, 4.511039F, 27.75F, 6.375F, 27.75F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(3.0F, 48.0F);
      ((Path)localObject3).lineTo(9.75F, 48.0F);
      ((Path)localObject3).lineTo(9.75F, 54.75F);
      ((Path)localObject3).lineTo(3.0F, 54.75F);
      ((Path)localObject3).lineTo(3.0F, 48.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alp
 * JD-Core Version:    0.6.2
 */