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

public final class rv extends c
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localCanvas.saveLayerAlpha(null, 51, 4);
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(29.73F, 4.822F);
      localPath.cubicTo(15.804F, 4.822F, 4.514F, 16.111F, 4.514F, 30.038F);
      localPath.cubicTo(4.514F, 43.965F, 15.804F, 55.252998F, 29.73F, 55.252998F);
      localPath.cubicTo(43.655998F, 55.252998F, 54.945999F, 43.963997F, 54.945999F, 30.036999F);
      localPath.cubicTo(54.945999F, 16.110001F, 43.655998F, 4.822F, 29.73F, 4.822F);
      localPath.close();
      localPath.moveTo(29.73F, 53.27F);
      localPath.cubicTo(16.898998F, 53.27F, 6.497F, 42.868F, 6.497F, 30.037001F);
      localPath.cubicTo(6.497F, 17.206001F, 16.899F, 6.805F, 29.73F, 6.805F);
      localPath.cubicTo(42.561001F, 6.805F, 52.962997F, 17.207001F, 52.962997F, 30.038F);
      localPath.cubicTo(52.962997F, 42.868999F, 42.561001F, 53.27F, 29.73F, 53.27F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(31.23F, 15.037F);
      ((Path)localObject).lineTo(28.23F, 15.037F);
      ((Path)localObject).lineTo(28.23F, 28.537001F);
      ((Path)localObject).lineTo(14.73F, 28.537001F);
      ((Path)localObject).lineTo(14.73F, 31.537001F);
      ((Path)localObject).lineTo(28.23F, 31.537001F);
      ((Path)localObject).lineTo(28.23F, 45.036999F);
      ((Path)localObject).lineTo(31.23F, 45.036999F);
      ((Path)localObject).lineTo(31.23F, 31.537001F);
      ((Path)localObject).lineTo(44.73F, 31.537001F);
      ((Path)localObject).lineTo(44.73F, 28.537001F);
      ((Path)localObject).lineTo(31.23F, 28.537001F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.rv
 * JD-Core Version:    0.6.2
 */