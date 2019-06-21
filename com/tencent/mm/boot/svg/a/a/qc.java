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

public final class qc extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-12206054);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(28.32F, 0.0F);
      localPath.lineTo(31.73F, 0.0F);
      localPath.cubicTo(46.52F, 0.66F, 59.349998F, 13.49F, 60.0F, 28.280001F);
      localPath.lineTo(60.0F, 31.52F);
      localPath.cubicTo(59.48F, 46.57F, 46.27F, 59.66F, 31.209999F, 60.0F);
      localPath.lineTo(28.74F, 60.0F);
      localPath.cubicTo(13.88F, 59.630001F, 0.87F, 46.880001F, 0.0F, 32.07F);
      localPath.lineTo(0.0F, 28.48F);
      localPath.cubicTo(0.53F, 13.59F, 13.45F, 0.64F, 28.32F, 0.0F);
      localPath.lineTo(28.32F, 0.0F);
      localPath.close();
      localPath.moveTo(28.0F, 12.0F);
      localPath.lineTo(28.0F, 28.0F);
      localPath.lineTo(12.0F, 28.0F);
      localPath.lineTo(12.0F, 32.0F);
      localPath.lineTo(28.0F, 32.0F);
      localPath.lineTo(28.0F, 48.0F);
      localPath.lineTo(32.0F, 48.0F);
      localPath.lineTo(32.0F, 32.0F);
      localPath.lineTo(48.0F, 32.0F);
      localPath.lineTo(48.0F, 28.0F);
      localPath.lineTo(32.0F, 28.0F);
      localPath.lineTo(32.0F, 12.0F);
      localPath.lineTo(28.0F, 12.0F);
      localPath.lineTo(28.0F, 12.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(16.0F, 0.0F);
      ((Path)localObject1).lineTo(20.0F, 0.0F);
      ((Path)localObject1).lineTo(20.0F, 16.0F);
      ((Path)localObject1).lineTo(36.0F, 16.0F);
      ((Path)localObject1).lineTo(36.0F, 20.0F);
      ((Path)localObject1).lineTo(20.0F, 20.0F);
      ((Path)localObject1).lineTo(20.0F, 36.0F);
      ((Path)localObject1).lineTo(16.0F, 36.0F);
      ((Path)localObject1).lineTo(16.0F, 20.0F);
      ((Path)localObject1).lineTo(0.0F, 20.0F);
      ((Path)localObject1).lineTo(0.0F, 16.0F);
      ((Path)localObject1).lineTo(16.0F, 16.0F);
      ((Path)localObject1).lineTo(16.0F, 0.0F);
      ((Path)localObject1).lineTo(16.0F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qc
 * JD-Core Version:    0.6.2
 */