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

public final class aag extends c
{
  private final int height = 32;
  private final int width = 32;

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
        paramInt = 32;
        continue;
        paramInt = 32;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.870382F, 23.200001F);
      ((Path)localObject1).lineTo(1.818182F, 23.200001F);
      ((Path)localObject1).cubicTo(1.255856F, 23.200001F, 0.8F, 22.744144F, 0.8F, 22.181818F);
      ((Path)localObject1).lineTo(0.8F, 18.120138F);
      ((Path)localObject1).lineTo(2.304771F, 18.120138F);
      ((Path)localObject1).lineTo(2.304771F, 21.799999F);
      ((Path)localObject1).lineTo(4.870382F, 21.799999F);
      ((Path)localObject1).lineTo(21.666151F, 21.784334F);
      ((Path)localObject1).lineTo(21.666151F, 18.11097F);
      ((Path)localObject1).lineTo(23.197655F, 18.11097F);
      ((Path)localObject1).lineTo(23.197655F, 22.181818F);
      ((Path)localObject1).cubicTo(23.197655F, 22.744144F, 22.741798F, 23.200001F, 22.179474F, 23.200001F);
      ((Path)localObject1).lineTo(4.870382F, 23.200001F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1.818182F, 0.8F);
      ((Path)localObject1).lineTo(5.916729F, 0.8F);
      ((Path)localObject1).lineTo(5.916729F, 2.347675F);
      ((Path)localObject1).lineTo(2.322577F, 2.347675F);
      ((Path)localObject1).lineTo(2.322577F, 5.883533F);
      ((Path)localObject1).lineTo(0.8F, 5.883533F);
      ((Path)localObject1).lineTo(0.8F, 1.818182F);
      ((Path)localObject1).cubicTo(0.8F, 1.255856F, 1.255856F, 0.8F, 1.818182F, 0.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.179474F, 0.8F);
      ((Path)localObject1).cubicTo(22.741798F, 0.8F, 23.197655F, 1.255856F, 23.197655F, 1.818182F);
      ((Path)localObject1).lineTo(23.197655F, 5.903216F);
      ((Path)localObject1).lineTo(21.644531F, 5.903216F);
      ((Path)localObject1).lineTo(21.644531F, 2.363103F);
      ((Path)localObject1).lineTo(18.140741F, 2.363103F);
      ((Path)localObject1).lineTo(18.140741F, 0.8F);
      ((Path)localObject1).lineTo(22.179474F, 0.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(8.945455F, 0.8F);
      ((Path)localObject1).lineTo(15.054545F, 0.8F);
      ((Path)localObject1).lineTo(15.054545F, 2.327273F);
      ((Path)localObject1).lineTo(8.945455F, 2.327273F);
      ((Path)localObject1).lineTo(8.945455F, 0.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.8F, 8.942418F);
      ((Path)localObject1).lineTo(2.327273F, 8.942418F);
      ((Path)localObject1).lineTo(2.327273F, 15.037204F);
      ((Path)localObject1).lineTo(0.8F, 15.037204F);
      ((Path)localObject1).lineTo(0.8F, 8.942418F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(21.672728F, 8.945455F);
      ((Path)localObject1).lineTo(23.200001F, 8.945455F);
      ((Path)localObject1).lineTo(23.200001F, 15.04024F);
      ((Path)localObject1).lineTo(21.672728F, 15.04024F);
      ((Path)localObject1).lineTo(21.672728F, 8.945455F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-100663296);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.4F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(3.612992F, 21.103752F);
      ((Path)localObject3).lineTo(20.387997F, 21.103752F);
      ((Path)localObject3).cubicTo(20.262011F, 20.916302F, 20.099764F, 20.75753F, 19.931206F, 20.675081F);
      ((Path)localObject3).lineTo(14.370157F, 17.954939F);
      ((Path)localObject3).cubicTo(13.151746F, 17.358963F, 12.857854F, 15.951832F, 13.730429F, 14.914611F);
      ((Path)localObject3).lineTo(14.085618F, 14.4924F);
      ((Path)localObject3).cubicTo(14.70045F, 13.761557F, 15.229825F, 12.311421F, 15.229825F, 11.35559F);
      ((Path)localObject3).lineTo(15.229825F, 9.670945F);
      ((Path)localObject3).cubicTo(15.229825F, 7.881831F, 13.782598F, 6.43F, 12.0F, 6.43F);
      ((Path)localObject3).cubicTo(10.219405F, 6.43F, 8.770175F, 7.881976F, 8.770175F, 9.670327F);
      ((Path)localObject3).lineTo(8.770175F, 11.354709F);
      ((Path)localObject3).cubicTo(8.770175F, 12.312657F, 9.297517F, 13.757827F, 9.914352F, 14.490951F);
      ((Path)localObject3).lineTo(10.269541F, 14.913103F);
      ((Path)localObject3).cubicTo(11.143951F, 15.952363F, 10.846876F, 17.358044F, 9.629946F, 17.953541F);
      ((Path)localObject3).lineTo(4.068897F, 20.67481F);
      ((Path)localObject3).cubicTo(3.901136F, 20.756903F, 3.739076F, 20.916063F, 3.612992F, 21.103752F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aag
 * JD-Core Version:    0.6.2
 */