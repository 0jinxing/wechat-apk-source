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

public final class rz extends c
{
  private final int height = 270;
  private final int width = 270;

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
        paramInt = 270;
        continue;
        paramInt = 270;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(14211288);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(270.0F, 0.0F);
      localPath.lineTo(270.0F, 270.0F);
      localPath.lineTo(0.0F, 270.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(63.314346F, 140.34763F);
      ((Path)localObject).cubicTo(62.933258F, 139.95532F, 62.893169F, 139.27344F, 63.224213F, 138.82539F);
      ((Path)localObject).lineTo(69.834709F, 129.87872F);
      ((Path)localObject).cubicTo(70.166023F, 129.43033F, 70.790833F, 129.33839F, 71.229179F, 129.67256F);
      ((Path)localObject).lineTo(108.10534F, 157.78488F);
      ((Path)localObject).cubicTo(108.54417F, 158.11943F, 109.24487F, 158.1048F, 109.66647F, 157.75543F);
      ((Path)localObject).lineTo(198.37781F, 84.246925F);
      ((Path)localObject).cubicTo(198.80116F, 83.896118F, 199.46021F, 83.921997F, 199.85126F, 84.306122F);
      ((Path)localObject).lineTo(206.24776F, 90.589508F);
      ((Path)localObject).cubicTo(206.63817F, 90.973007F, 206.63751F, 91.59433F, 206.23552F, 91.987839F);
      ((Path)localObject).lineTo(109.61617F, 186.56723F);
      ((Path)localObject).cubicTo(109.219F, 186.95599F, 108.58932F, 186.95439F, 108.20701F, 186.56084F);
      ((Path)localObject).lineTo(63.314346F, 140.34763F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.rz
 * JD-Core Version:    0.6.2
 */