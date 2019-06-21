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

public final class sd extends c
{
  private final int height = 480;
  private final int width = 480;

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
        paramInt = 480;
        continue;
        paramInt = 480;
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
      localPaint.setColor(-2565928);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(480.0F, 0.0F);
      localPath.lineTo(480.0F, 480.0F);
      localPath.lineTo(0.0F, 480.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(377.60001F, 272.91428F);
      ((Path)localObject).lineTo(377.60001F, 137.60001F);
      ((Path)localObject).lineTo(102.4F, 137.60001F);
      ((Path)localObject).lineTo(102.4F, 269.62579F);
      ((Path)localObject).lineTo(188.8F, 188.8F);
      ((Path)localObject).lineTo(288.0F, 278.39999F);
      ((Path)localObject).lineTo(278.39999F, 252.8F);
      ((Path)localObject).lineTo(320.0F, 220.8F);
      ((Path)localObject).lineTo(377.60001F, 272.91428F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(86.400002F, 124.59402F);
      ((Path)localObject).cubicTo(86.400002F, 122.94048F, 87.736046F, 121.6F, 89.391014F, 121.6F);
      ((Path)localObject).lineTo(390.60898F, 121.6F);
      ((Path)localObject).cubicTo(392.26086F, 121.6F, 393.60001F, 122.94633F, 393.60001F, 124.59402F);
      ((Path)localObject).lineTo(393.60001F, 355.40598F);
      ((Path)localObject).cubicTo(393.60001F, 357.05954F, 392.26395F, 358.39999F, 390.60898F, 358.39999F);
      ((Path)localObject).lineTo(89.391014F, 358.39999F);
      ((Path)localObject).cubicTo(87.73912F, 358.39999F, 86.400002F, 357.05365F, 86.400002F, 355.40598F);
      ((Path)localObject).lineTo(86.400002F, 124.59402F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.sd
 * JD-Core Version:    0.6.2
 */