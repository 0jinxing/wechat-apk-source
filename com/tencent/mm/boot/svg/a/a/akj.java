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

public final class akj extends c
{
  private final int height = 279;
  private final int width = 279;

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
        paramInt = 279;
        continue;
        paramInt = 279;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, -17.0F, 0.0F, 1.0F, -250.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 17.0F, 0.0F, 1.0F, 250.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-15683841);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(279.0F, 141.22223F);
      localPath.cubicTo(279.0F, 62.454666F, 216.54533F, 0.0F, 137.77777F, 0.0F);
      localPath.cubicTo(62.454666F, 0.0F, 0.0F, 62.454666F, 0.0F, 141.22223F);
      localPath.cubicTo(0.0F, 216.54533F, 62.454666F, 279.0F, 137.77777F, 279.0F);
      localPath.cubicTo(216.54533F, 279.0F, 279.0F, 216.54533F, 279.0F, 141.22223F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 279.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(134.99942F, 70.5F);
      ((Path)localObject1).lineTo(144.00058F, 70.5F);
      ((Path)localObject1).cubicTo(145.65565F, 70.5F, 147.03334F, 71.843925F, 147.07448F, 73.501747F);
      ((Path)localObject1).lineTo(149.42552F, 168.25435F);
      ((Path)localObject1).cubicTo(149.46655F, 169.90797F, 148.15945F, 171.2561F, 146.5058F, 171.2561F);
      ((Path)localObject1).lineTo(132.4942F, 171.2561F);
      ((Path)localObject1).cubicTo(130.84331F, 171.2561F, 129.53334F, 169.91217F, 129.57448F, 168.25435F);
      ((Path)localObject1).lineTo(131.92552F, 73.501747F);
      ((Path)localObject1).cubicTo(131.96655F, 71.848129F, 133.34288F, 70.5F, 134.99942F, 70.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(139.5F, 208.5F);
      ((Path)localObject1).cubicTo(132.87259F, 208.5F, 127.5F, 203.12741F, 127.5F, 196.5F);
      ((Path)localObject1).cubicTo(127.5F, 189.87259F, 132.87259F, 184.5F, 139.5F, 184.5F);
      ((Path)localObject1).cubicTo(146.12741F, 184.5F, 151.5F, 189.87259F, 151.5F, 196.5F);
      ((Path)localObject1).cubicTo(151.5F, 203.12741F, 146.12741F, 208.5F, 139.5F, 208.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.akj
 * JD-Core Version:    0.6.2
 */