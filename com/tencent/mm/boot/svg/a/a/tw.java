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

public final class tw extends c
{
  private final int height = 66;
  private final int width = 66;

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
        paramInt = 66;
        continue;
        paramInt = 66;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-15028967);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(57.0F, 30.370371F);
      ((Path)localObject1).cubicTo(57.0F, 15.087965F, 44.912033F, 3.0F, 29.629629F, 3.0F);
      ((Path)localObject1).cubicTo(14.985957F, 3.0F, 3.0F, 15.192142F, 3.0F, 30.370371F);
      ((Path)localObject1).cubicTo(3.0F, 44.912033F, 15.087965F, 57.0F, 29.629629F, 57.0F);
      ((Path)localObject1).cubicTo(44.807858F, 57.0F, 57.0F, 45.014042F, 57.0F, 30.370371F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(60.0F, 30.370371F);
      ((Path)localObject1).cubicTo(60.0F, 46.56889F, 46.56889F, 60.0F, 29.629629F, 60.0F);
      ((Path)localObject1).cubicTo(13.431111F, 60.0F, 0.0F, 46.56889F, 0.0F, 30.370371F);
      ((Path)localObject1).cubicTo(0.0F, 13.431111F, 13.431111F, 0.0F, 29.629629F, 0.0F);
      ((Path)localObject1).cubicTo(46.56889F, 0.0F, 60.0F, 13.431111F, 60.0F, 30.370371F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(16.671656F, 32.738823F);
      ((Path)localObject3).cubicTo(16.300711F, 32.33078F, 16.3125F, 31.6875F, 16.710756F, 31.289244F);
      ((Path)localObject3).lineTo(17.289244F, 30.710756F);
      ((Path)localObject3).cubicTo(17.681784F, 30.318216F, 18.34375F, 30.300781F, 18.752621F, 30.658543F);
      ((Path)localObject3).lineTo(25.247379F, 36.341457F);
      ((Path)localObject3).cubicTo(25.66304F, 36.705162F, 26.347137F, 36.704933F, 26.759602F, 36.35434F);
      ((Path)localObject3).lineTo(45.240398F, 20.645662F);
      ((Path)localObject3).cubicTo(45.659916F, 20.289072F, 46.3125F, 20.3125F, 46.710758F, 20.710756F);
      ((Path)localObject3).lineTo(47.289242F, 21.289244F);
      ((Path)localObject3).cubicTo(47.681782F, 21.681784F, 47.671932F, 22.313156F, 47.280529F, 22.686768F);
      ((Path)localObject3).lineTo(26.719471F, 42.313232F);
      ((Path)localObject3).cubicTo(26.322119F, 42.692524F, 25.70072F, 42.670792F, 25.328344F, 42.261177F);
      ((Path)localObject3).lineTo(16.671656F, 32.738823F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tw
 * JD-Core Version:    0.6.2
 */