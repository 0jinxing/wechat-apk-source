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

public final class ji extends c
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
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-8617851);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(81.0F, 60.0F);
      ((Path)localObject).lineTo(72.0F, 60.0F);
      ((Path)localObject).lineTo(72.0F, 68.0F);
      ((Path)localObject).lineTo(64.0F, 68.0F);
      ((Path)localObject).lineTo(64.0F, 77.0F);
      ((Path)localObject).lineTo(72.0F, 77.0F);
      ((Path)localObject).lineTo(72.0F, 85.0F);
      ((Path)localObject).lineTo(81.0F, 85.0F);
      ((Path)localObject).lineTo(81.0F, 77.0F);
      ((Path)localObject).lineTo(89.0F, 77.0F);
      ((Path)localObject).lineTo(89.0F, 68.0F);
      ((Path)localObject).lineTo(81.0F, 68.0F);
      ((Path)localObject).lineTo(81.0F, 60.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(33.0F, 66.0F);
      ((Path)localObject).lineTo(27.0F, 69.0F);
      ((Path)localObject).lineTo(28.0F, 64.0F);
      ((Path)localObject).cubicTo(20.127745F, 59.652744F, 15.2F, 52.282616F, 15.0F, 44.0F);
      ((Path)localObject).cubicTo(15.2F, 30.296667F, 28.315445F, 19.235294F, 48.0F, 19.0F);
      ((Path)localObject).cubicTo(67.684555F, 19.235294F, 80.800003F, 30.296667F, 81.0F, 44.0F);
      ((Path)localObject).cubicTo(80.800003F, 46.829475F, 80.203674F, 49.600197F, 79.0F, 52.0F);
      ((Path)localObject).lineTo(88.0F, 52.0F);
      ((Path)localObject).cubicTo(88.597748F, 49.54438F, 89.0F, 46.784641F, 89.0F, 44.0F);
      ((Path)localObject).cubicTo(89.0F, 25.748039F, 72.605919F, 11.0F, 48.0F, 11.0F);
      ((Path)localObject).cubicTo(23.394077F, 11.0F, 7.0F, 25.748039F, 7.0F, 44.0F);
      ((Path)localObject).cubicTo(7.0F, 53.683987F, 11.725022F, 62.435818F, 20.0F, 68.0F);
      ((Path)localObject).lineTo(15.0F, 81.0F);
      ((Path)localObject).lineTo(31.0F, 74.0F);
      ((Path)localObject).cubicTo(36.047134F, 75.924774F, 41.760712F, 76.882355F, 48.0F, 77.0F);
      ((Path)localObject).cubicTo(50.683678F, 76.882355F, 53.264854F, 76.696144F, 56.0F, 76.0F);
      ((Path)localObject).lineTo(56.0F, 68.0F);
      ((Path)localObject).cubicTo(53.296288F, 68.428825F, 50.712379F, 68.647057F, 48.0F, 69.0F);
      ((Path)localObject).cubicTo(42.516022F, 68.647057F, 37.537712F, 67.782356F, 33.0F, 66.0F);
      ((Path)localObject).lineTo(33.0F, 66.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ji
 * JD-Core Version:    0.6.2
 */