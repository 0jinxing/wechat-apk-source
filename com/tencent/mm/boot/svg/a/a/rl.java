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

public final class rl extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-12206054);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(192.0F, 0.0F);
      ((Path)localObject).lineTo(192.0F, 192.0F);
      ((Path)localObject).lineTo(0.0F, 192.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(125.05173F, 106.30443F);
      ((Path)localObject).cubicTo(134.37202F, 117.3619F, 151.40338F, 137.34488F, 152.32759F, 139.00922F);
      ((Path)localObject).cubicTo(156.1268F, 140.24745F, 158.94827F, 137.81317F, 158.94827F, 135.69887F);
      ((Path)localObject).lineTo(158.94827F, 56.250595F);
      ((Path)localObject).cubicTo(158.94827F, 53.690529F, 155.8298F, 51.942085F, 152.32759F, 52.94025F);
      ((Path)localObject).cubicTo(150.75885F, 54.967968F, 134.14519F, 74.351326F, 125.05173F, 85.322044F);
      ((Path)localObject).lineTo(125.05173F, 106.30443F);
      ((Path)localObject).lineTo(125.05173F, 106.30443F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(33.051723F, 67.973175F);
      ((Path)localObject).cubicTo(33.051723F, 61.346619F, 38.431973F, 55.974731F, 45.052055F, 55.974731F);
      ((Path)localObject).lineTo(103.05139F, 55.974731F);
      ((Path)localObject).cubicTo(109.67899F, 55.974731F, 115.05173F, 61.34798F, 115.05173F, 67.973175F);
      ((Path)localObject).lineTo(115.05173F, 123.9763F);
      ((Path)localObject).cubicTo(115.05173F, 130.60284F, 109.67148F, 135.97473F, 103.05139F, 135.97473F);
      ((Path)localObject).lineTo(45.052055F, 135.97473F);
      ((Path)localObject).cubicTo(38.424454F, 135.97473F, 33.051723F, 130.60149F, 33.051723F, 123.9763F);
      ((Path)localObject).lineTo(33.051723F, 67.973175F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.rl
 * JD-Core Version:    0.6.2
 */