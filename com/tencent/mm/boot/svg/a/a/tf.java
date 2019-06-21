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

public final class tf extends c
{
  private final int height = 27;
  private final int width = 27;

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
        paramInt = 27;
        continue;
        paramInt = 27;
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
      localPaint.setColor(-772816);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(27.0F, 13.666667F);
      localPath.cubicTo(27.0F, 6.044F, 20.955999F, 0.0F, 13.333333F, 0.0F);
      localPath.cubicTo(6.044F, 0.0F, 0.0F, 6.044F, 0.0F, 13.666667F);
      localPath.cubicTo(0.0F, 20.955999F, 6.044F, 27.0F, 13.333333F, 27.0F);
      localPath.cubicTo(20.955999F, 27.0F, 27.0F, 20.955999F, 27.0F, 13.666667F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(13.5F, 6.0F);
      ((Path)localObject).cubicTo(14.334203F, 6.0F, 14.962531F, 6.674437F, 14.916311F, 7.506398F);
      ((Path)localObject).lineTo(14.5F, 15.0F);
      ((Path)localObject).lineTo(12.5F, 15.0F);
      ((Path)localObject).lineTo(12.083689F, 7.506398F);
      ((Path)localObject).cubicTo(12.037581F, 6.676463F, 12.671573F, 6.0F, 13.5F, 6.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(13.5F, 20.0F);
      ((Path)localObject).cubicTo(12.671573F, 20.0F, 12.0F, 19.328426F, 12.0F, 18.5F);
      ((Path)localObject).cubicTo(12.0F, 17.671574F, 12.671573F, 17.0F, 13.5F, 17.0F);
      ((Path)localObject).cubicTo(14.328427F, 17.0F, 15.0F, 17.671574F, 15.0F, 18.5F);
      ((Path)localObject).cubicTo(15.0F, 19.328426F, 14.328427F, 20.0F, 13.5F, 20.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.tf
 * JD-Core Version:    0.6.2
 */