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

public final class kb extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
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
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(80.0F, 73.0F);
      ((Path)localObject).lineTo(80.0F, 73.0F);
      ((Path)localObject).lineTo(79.0F, 73.0F);
      ((Path)localObject).cubicTo(79.29834F, 73.198334F, 79.273552F, 73.192024F, 79.0F, 73.0F);
      ((Path)localObject).lineTo(57.0F, 67.0F);
      ((Path)localObject).lineTo(57.0F, 62.0F);
      ((Path)localObject).cubicTo(56.611111F, 60.643684F, 57.962963F, 59.314816F, 58.0F, 59.0F);
      ((Path)localObject).lineTo(58.0F, 59.0F);
      ((Path)localObject).cubicTo(63.88858F, 54.776199F, 67.90448F, 45.981499F, 68.0F, 35.0F);
      ((Path)localObject).cubicTo(67.884201F, 21.389061F, 59.20126F, 12.0F, 49.0F, 12.0F);
      ((Path)localObject).cubicTo(37.79874F, 12.0F, 29.131117F, 21.389061F, 29.0F, 35.0F);
      ((Path)localObject).cubicTo(29.151396F, 45.980148F, 33.179913F, 54.775295F, 39.0F, 59.0F);
      ((Path)localObject).lineTo(39.0F, 59.0F);
      ((Path)localObject).cubicTo(39.037037F, 59.314816F, 40.388889F, 60.643684F, 40.0F, 62.0F);
      ((Path)localObject).lineTo(40.0F, 65.0F);
      ((Path)localObject).cubicTo(40.388889F, 66.18132F, 39.252434F, 66.882484F, 38.0F, 67.0F);
      ((Path)localObject).lineTo(18.0F, 73.0F);
      ((Path)localObject).cubicTo(17.725994F, 73.192024F, 17.70166F, 73.198334F, 18.0F, 73.0F);
      ((Path)localObject).lineTo(17.0F, 73.0F);
      ((Path)localObject).lineTo(17.0F, 73.0F);
      ((Path)localObject).cubicTo(14.258945F, 74.41951F, 12.0F, 77.414307F, 12.0F, 81.0F);
      ((Path)localObject).lineTo(12.0F, 85.0F);
      ((Path)localObject).lineTo(13.0F, 85.0F);
      ((Path)localObject).lineTo(27.0F, 85.0F);
      ((Path)localObject).lineTo(70.0F, 85.0F);
      ((Path)localObject).lineTo(84.0F, 85.0F);
      ((Path)localObject).lineTo(85.0F, 85.0F);
      ((Path)localObject).lineTo(85.0F, 81.0F);
      ((Path)localObject).cubicTo(85.0F, 77.414307F, 82.740608F, 74.41951F, 80.0F, 73.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.kb
 * JD-Core Version:    0.6.2
 */