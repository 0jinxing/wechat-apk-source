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

public final class gi extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localPaint.setColor(-1158579);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(28.120001F, 0.0F);
      localPath.lineTo(31.27F, 0.0F);
      localPath.cubicTo(46.169998F, 0.38F, 59.220001F, 13.21F, 60.0F, 28.08F);
      localPath.lineTo(60.0F, 31.41F);
      localPath.cubicTo(59.540001F, 46.48F, 46.34F, 59.630001F, 31.27F, 60.0F);
      localPath.lineTo(28.620001F, 60.0F);
      localPath.cubicTo(13.75F, 59.560001F, 0.77F, 46.740002F, 0.0F, 31.91F);
      localPath.lineTo(0.0F, 28.41F);
      localPath.cubicTo(0.57F, 13.61F, 13.35F, 0.76F, 28.120001F, 0.0F);
      localPath.moveTo(13.33F, 25.52F);
      localPath.cubicTo(11.45F, 26.76F, 12.08F, 29.290001F, 11.98F, 31.17F);
      localPath.cubicTo(11.71F, 32.93F, 12.93F, 35.040001F, 14.88F, 34.939999F);
      localPath.cubicTo(24.959999F, 35.040001F, 35.060001F, 35.049999F, 45.139999F, 34.93F);
      localPath.cubicTo(47.09F, 35.040001F, 48.25F, 32.900002F, 48.02F, 31.17F);
      localPath.cubicTo(48.049999F, 29.08F, 48.459999F, 26.07F, 46.0F, 25.17F);
      localPath.cubicTo(36.68F, 24.75F, 27.32F, 25.15F, 17.99F, 24.969999F);
      localPath.cubicTo(16.459999F, 25.139999F, 14.7F, 24.67F, 13.33F, 25.52F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(13.33F, 25.52F);
      ((Path)localObject).cubicTo(14.7F, 24.67F, 16.459999F, 25.139999F, 17.99F, 24.969999F);
      ((Path)localObject).cubicTo(27.32F, 25.15F, 36.68F, 24.75F, 46.0F, 25.17F);
      ((Path)localObject).cubicTo(48.459999F, 26.07F, 48.049999F, 29.08F, 48.02F, 31.17F);
      ((Path)localObject).cubicTo(48.25F, 32.900002F, 47.09F, 35.040001F, 45.139999F, 34.93F);
      ((Path)localObject).cubicTo(35.060001F, 35.049999F, 24.959999F, 35.040001F, 14.88F, 34.939999F);
      ((Path)localObject).cubicTo(12.93F, 35.040001F, 11.71F, 32.93F, 11.98F, 31.17F);
      ((Path)localObject).cubicTo(12.08F, 29.290001F, 11.45F, 26.76F, 13.33F, 25.52F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.gi
 * JD-Core Version:    0.6.2
 */