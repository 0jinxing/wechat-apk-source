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

public final class art extends c
{
  private final int height = 71;
  private final int width = 71;

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
        paramInt = 71;
        continue;
        paramInt = 71;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(85.5F, 0.0F);
      ((Path)localObject4).cubicTo(132.72035F, 0.0F, 171.0F, 38.279652F, 171.0F, 85.5F);
      ((Path)localObject4).cubicTo(171.0F, 132.72035F, 132.72035F, 171.0F, 85.5F, 171.0F);
      ((Path)localObject4).cubicTo(38.279652F, 171.0F, 0.0F, 132.72035F, 0.0F, 85.5F);
      ((Path)localObject4).cubicTo(0.0F, 38.279652F, 38.279652F, 0.0F, 85.5F, 0.0F);
      ((Path)localObject4).close();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-11119016);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 6.99323F);
      localPath.cubicTo(0.0F, 5.892399F, 0.8977023F, 5.0F, 1.991746F, 5.0F);
      localPath.lineTo(69.008255F, 5.0F);
      localPath.cubicTo(70.108269F, 5.0F, 71.0F, 5.895443F, 71.0F, 6.99323F);
      localPath.lineTo(71.0F, 69.006767F);
      localPath.cubicTo(71.0F, 70.107597F, 70.102295F, 71.0F, 69.008255F, 71.0F);
      localPath.lineTo(1.991746F, 71.0F);
      localPath.cubicTo(0.891735F, 71.0F, 0.0F, 70.104553F, 0.0F, 69.006767F);
      localPath.lineTo(0.0F, 6.99323F);
      localPath.close();
      localPath.moveTo(3.0F, 8.0F);
      localPath.lineTo(68.0F, 8.0F);
      localPath.lineTo(68.0F, 68.0F);
      localPath.lineTo(3.0F, 68.0F);
      localPath.lineTo(3.0F, 8.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 26.0F);
      localPath.lineTo(71.0F, 26.0F);
      localPath.lineTo(71.0F, 29.0F);
      localPath.lineTo(0.0F, 29.0F);
      localPath.lineTo(0.0F, 26.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(12.0F, 39.0F);
      localPath.lineTo(23.0F, 39.0F);
      localPath.lineTo(23.0F, 42.0F);
      localPath.lineTo(12.0F, 42.0F);
      localPath.lineTo(12.0F, 39.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.a((float[])localObject2, -1.83697E-016F, -1.0F, 22.60606F, 1.0F, -1.83697E-016F, -8.621212F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(8.621212F, 5.606061F);
      localPath.lineTo(22.621212F, 5.606061F);
      localPath.lineTo(22.621212F, 8.60606F);
      localPath.lineTo(8.621212F, 8.60606F);
      localPath.lineTo(8.621212F, 5.606061F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.a((float[])localObject2, -1.83697E-016F, -1.0F, 62.60606F, 1.0F, -1.83697E-016F, -48.621212F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(48.621212F, 5.606061F);
      ((Path)localObject1).lineTo(62.621212F, 5.606061F);
      ((Path)localObject1).lineTo(62.621212F, 8.60606F);
      ((Path)localObject1).lineTo(48.621212F, 8.60606F);
      ((Path)localObject1).lineTo(48.621212F, 5.606061F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(12.0F, 53.0F);
      ((Path)localObject1).lineTo(23.0F, 53.0F);
      ((Path)localObject1).lineTo(23.0F, 56.0F);
      ((Path)localObject1).lineTo(12.0F, 56.0F);
      ((Path)localObject1).lineTo(12.0F, 53.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(30.0F, 39.0F);
      ((Path)localObject1).lineTo(41.0F, 39.0F);
      ((Path)localObject1).lineTo(41.0F, 42.0F);
      ((Path)localObject1).lineTo(30.0F, 42.0F);
      ((Path)localObject1).lineTo(30.0F, 39.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(30.0F, 53.0F);
      ((Path)localObject2).lineTo(41.0F, 53.0F);
      ((Path)localObject2).lineTo(41.0F, 56.0F);
      ((Path)localObject2).lineTo(30.0F, 56.0F);
      ((Path)localObject2).lineTo(30.0F, 53.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(48.0F, 39.0F);
      ((Path)localObject2).lineTo(59.0F, 39.0F);
      ((Path)localObject2).lineTo(59.0F, 42.0F);
      ((Path)localObject2).lineTo(48.0F, 42.0F);
      ((Path)localObject2).lineTo(48.0F, 39.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(48.0F, 53.0F);
      ((Path)localObject3).lineTo(59.0F, 53.0F);
      ((Path)localObject3).lineTo(59.0F, 56.0F);
      ((Path)localObject3).lineTo(48.0F, 56.0F);
      ((Path)localObject3).lineTo(48.0F, 53.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.art
 * JD-Core Version:    0.6.2
 */