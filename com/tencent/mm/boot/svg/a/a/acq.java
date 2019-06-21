package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class acq extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-436207616);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(14.8F, 9.0F);
      ((Path)localObject).lineTo(14.8F, 6.0F);
      ((Path)localObject).cubicTo(14.8F, 3.790861F, 16.59086F, 2.0F, 18.799999F, 2.0F);
      ((Path)localObject).cubicTo(21.009138F, 2.0F, 22.799999F, 3.790861F, 22.799999F, 6.0F);
      ((Path)localObject).lineTo(22.799999F, 9.0F);
      ((Path)localObject).lineTo(21.599998F, 9.0F);
      ((Path)localObject).lineTo(21.599998F, 6.0F);
      ((Path)localObject).cubicTo(21.599997F, 4.4536F, 20.346394F, 3.199997F, 18.799995F, 3.199997F);
      ((Path)localObject).cubicTo(17.253597F, 3.199997F, 15.999995F, 4.4536F, 15.999995F, 5.999997F);
      ((Path)localObject).lineTo(15.999998F, 9.0F);
      ((Path)localObject).lineTo(18.999126F, 9.0F);
      ((Path)localObject).cubicTo(19.551893F, 9.0F, 19.999998F, 9.44749F, 19.999998F, 9.998503F);
      ((Path)localObject).lineTo(19.999998F, 21.001499F);
      ((Path)localObject).cubicTo(19.999998F, 21.552958F, 19.555367F, 22.000002F, 18.999126F, 22.000002F);
      ((Path)localObject).lineTo(5.00087F, 22.000002F);
      ((Path)localObject).cubicTo(4.448103F, 22.000002F, 3.999998F, 21.552513F, 3.999998F, 21.001499F);
      ((Path)localObject).lineTo(3.999998F, 9.998504F);
      ((Path)localObject).cubicTo(3.999998F, 9.447046F, 4.444629F, 9.000001F, 5.00087F, 9.000001F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(5.2F, 10.2F);
      ((Path)localObject).lineTo(5.2F, 20.799999F);
      ((Path)localObject).lineTo(18.799999F, 20.799999F);
      ((Path)localObject).lineTo(18.799999F, 10.199999F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(11.4F, 15.875187F);
      ((Path)localObject).cubicTo(10.870229F, 15.64372F, 10.5F, 15.115096F, 10.5F, 14.5F);
      ((Path)localObject).cubicTo(10.5F, 13.671573F, 11.171573F, 13.0F, 12.0F, 13.0F);
      ((Path)localObject).cubicTo(12.828427F, 13.0F, 13.5F, 13.671573F, 13.5F, 14.5F);
      ((Path)localObject).cubicTo(13.5F, 15.115096F, 13.129771F, 15.643721F, 12.599999F, 15.875187F);
      ((Path)localObject).lineTo(12.599999F, 18.0F);
      ((Path)localObject).lineTo(11.4F, 18.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.acq
 * JD-Core Version:    0.6.2
 */