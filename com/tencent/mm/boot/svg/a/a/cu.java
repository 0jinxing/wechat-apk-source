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

public final class cu extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
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
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-855310);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(90.0F, 0.0F);
      localPath.lineTo(90.0F, 90.0F);
      localPath.lineTo(0.0F, 90.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 23.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(21.213203F, 0.5429667F);
      ((Path)localObject2).cubicTo(26.642136F, 6.0343F, 30.0F, 13.620507F, 30.0F, 22.0F);
      ((Path)localObject2).cubicTo(30.0F, 30.379494F, 26.642136F, 37.965698F, 21.213203F, 43.457035F);
      ((Path)localObject2).lineTo(18.031223F, 40.23848F);
      ((Path)localObject2).cubicTo(22.645815F, 35.570847F, 25.5F, 29.122568F, 25.5F, 22.0F);
      ((Path)localObject2).cubicTo(25.5F, 14.877431F, 22.645815F, 8.429155F, 18.031223F, 3.761522F);
      ((Path)localObject2).lineTo(21.213203F, 0.5429667F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(13.788582F, 8.052928F);
      ((Path)localObject2).cubicTo(17.317389F, 11.622295F, 19.5F, 16.553329F, 19.5F, 22.0F);
      ((Path)localObject2).cubicTo(19.5F, 27.446671F, 17.317389F, 32.377705F, 13.788582F, 35.947071F);
      ((Path)localObject2).lineTo(10.606602F, 32.728516F);
      ((Path)localObject2).cubicTo(13.321068F, 29.982849F, 15.0F, 26.189747F, 15.0F, 22.0F);
      ((Path)localObject2).cubicTo(15.0F, 17.810253F, 13.321068F, 14.01715F, 10.606602F, 11.271483F);
      ((Path)localObject2).lineTo(13.788582F, 8.052928F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(6.363961F, 15.56289F);
      ((Path)localObject2).cubicTo(7.992641F, 17.210291F, 9.0F, 19.486153F, 9.0F, 22.0F);
      ((Path)localObject2).cubicTo(9.0F, 24.513847F, 7.992641F, 26.789709F, 6.363961F, 28.437111F);
      ((Path)localObject2).lineTo(0.0F, 22.0F);
      ((Path)localObject2).lineTo(6.363961F, 15.56289F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cu
 * JD-Core Version:    0.6.2
 */