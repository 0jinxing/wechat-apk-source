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

public final class azl extends c
{
  private final int height = 80;
  private final int width = 80;

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
        paramInt = 80;
        continue;
        paramInt = 80;
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 5.0F, 0.0F, 1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.6294041F);
      localPath.lineTo(44.081802F, 0.6294054F);
      localPath.lineTo(44.081802F, 41.746845F);
      localPath.lineTo(0.0F, 41.746841F);
      localPath.lineTo(0.0F, 0.6294041F);
      localPath.close();
      localPath.moveTo(5.0F, 5.629404F);
      localPath.lineTo(39.0F, 5.629405F);
      localPath.lineTo(39.0F, 36.629406F);
      localPath.lineTo(5.0F, 36.629402F);
      localPath.lineTo(5.0F, 5.629404F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 47.882759F, 0.0F, 1.0F, 1.922839F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(17.238659F, 3.845678F);
      ((Path)localObject1).lineTo(21.276552F, 3.845677F);
      ((Path)localObject1).lineTo(21.276552F, 34.611103F);
      ((Path)localObject1).lineTo(17.238659F, 34.611107F);
      ((Path)localObject1).lineTo(17.238659F, 3.845678F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.2687733F, 13.459874F);
      ((Path)localObject2).lineTo(4.221509F, 13.459874F);
      ((Path)localObject2).lineTo(4.221509F, 24.99691F);
      ((Path)localObject2).lineTo(0.2687733F, 24.99691F);
      ((Path)localObject2).lineTo(0.2687733F, 13.459874F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 13.459874F);
      ((Path)localObject1).lineTo(21.388449F, 0.0F);
      ((Path)localObject1).lineTo(21.388449F, 5.171436F);
      ((Path)localObject1).lineTo(0.0F, 18.63131F);
      ((Path)localObject1).lineTo(0.0F, 13.459874F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(21.388449F, 33.285347F);
      ((Path)localObject1).lineTo(0.0F, 19.825474F);
      ((Path)localObject1).lineTo(0.0F, 24.99691F);
      ((Path)localObject1).lineTo(21.388449F, 38.456783F);
      ((Path)localObject1).lineTo(21.388449F, 33.285347F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azl
 * JD-Core Version:    0.6.2
 */