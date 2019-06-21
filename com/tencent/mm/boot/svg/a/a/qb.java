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

public final class qb extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      localPaint1.setColor(-9473160);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(45.0513F, 58.846001F);
      localPath.lineTo(48.513302F, 60.0F);
      localPath.lineTo(32.486301F, 60.0F);
      localPath.lineTo(35.948299F, 58.846001F);
      localPath.lineTo(38.000301F, 58.161999F);
      localPath.lineTo(38.000301F, 56.0F);
      localPath.lineTo(38.000301F, 52.0F);
      localPath.lineTo(43.000301F, 52.0F);
      localPath.lineTo(43.000301F, 56.0F);
      localPath.lineTo(43.000301F, 58.161999F);
      localPath.lineTo(45.0513F, 58.846001F);
      localPath.close();
      localPath.moveTo(35.000301F, 49.0F);
      localPath.lineTo(3.0003F, 49.0F);
      localPath.lineTo(3.0003F, 3.0F);
      localPath.lineTo(77.000298F, 3.0F);
      localPath.lineTo(77.000298F, 29.0F);
      localPath.lineTo(80.000298F, 29.0F);
      localPath.lineTo(80.000298F, 2.87F);
      localPath.cubicTo(80.000298F, 1.285F, 78.714302F, 0.0F, 77.129303F, 0.0F);
      localPath.lineTo(2.8713F, 0.0F);
      localPath.cubicTo(1.2893F, 0.0F, 0.0003F, 1.285F, 0.0003F, 2.87F);
      localPath.lineTo(0.0003F, 49.130001F);
      localPath.cubicTo(0.0003F, 50.715F, 1.2853F, 52.0F, 2.8713F, 52.0F);
      localPath.lineTo(35.000301F, 52.0F);
      localPath.lineTo(35.000301F, 56.0F);
      localPath.lineTo(23.000299F, 60.0F);
      localPath.lineTo(23.000299F, 63.0F);
      localPath.lineTo(58.000301F, 63.0F);
      localPath.lineTo(58.000301F, 60.0F);
      localPath.lineTo(46.000301F, 56.0F);
      localPath.lineTo(46.000301F, 52.0F);
      localPath.lineTo(59.000301F, 52.0F);
      localPath.lineTo(59.000301F, 49.0F);
      localPath.lineTo(46.000301F, 49.0F);
      localPath.lineTo(35.000301F, 49.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 60.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(25.5F, 28.613199F);
      ((Path)localObject).cubicTo(25.5F, 29.378201F, 24.881001F, 30.0002F, 24.132F, 30.0002F);
      ((Path)localObject).lineTo(4.868F, 30.0002F);
      ((Path)localObject).cubicTo(4.11F, 30.0002F, 3.5F, 29.387199F, 3.5F, 28.613199F);
      ((Path)localObject).lineTo(3.5F, 14.3872F);
      ((Path)localObject).cubicTo(3.5F, 13.6222F, 4.119F, 13.0002F, 4.868F, 13.0002F);
      ((Path)localObject).lineTo(24.132F, 13.0002F);
      ((Path)localObject).cubicTo(24.889999F, 13.0002F, 25.5F, 13.6122F, 25.5F, 14.3872F);
      ((Path)localObject).lineTo(25.5F, 28.613199F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(9.0F, 5.4992F);
      ((Path)localObject).cubicTo(9.0F, 4.3952F, 9.9F, 3.5002F, 10.992F, 3.5002F);
      ((Path)localObject).lineTo(18.007999F, 3.5002F);
      ((Path)localObject).cubicTo(19.108F, 3.5002F, 20.0F, 4.3872F, 20.0F, 5.4992F);
      ((Path)localObject).lineTo(20.0F, 10.0002F);
      ((Path)localObject).lineTo(9.0F, 10.0002F);
      ((Path)localObject).lineTo(9.0F, 5.4992F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.132F, 10.0002F);
      ((Path)localObject).lineTo(23.0F, 10.0002F);
      ((Path)localObject).lineTo(23.0F, 6.2542F);
      ((Path)localObject).cubicTo(23.0F, 3.0742F, 20.423F, 0.5002F, 17.245001F, 0.5002F);
      ((Path)localObject).lineTo(11.755F, 0.5002F);
      ((Path)localObject).cubicTo(8.582F, 0.5002F, 6.0F, 3.0762F, 6.0F, 6.2542F);
      ((Path)localObject).lineTo(6.0F, 10.0002F);
      ((Path)localObject).lineTo(4.868F, 10.0002F);
      ((Path)localObject).cubicTo(2.459F, 10.0002F, 0.5F, 11.9682F, 0.5F, 14.3872F);
      ((Path)localObject).lineTo(0.5F, 28.613199F);
      ((Path)localObject).cubicTo(0.5F, 31.0422F, 2.45F, 33.000198F, 4.868F, 33.000198F);
      ((Path)localObject).lineTo(24.132F, 33.000198F);
      ((Path)localObject).cubicTo(26.541F, 33.000198F, 28.5F, 31.0322F, 28.5F, 28.613199F);
      ((Path)localObject).lineTo(28.5F, 14.3872F);
      ((Path)localObject).cubicTo(28.5F, 11.9582F, 26.549999F, 10.0002F, 24.132F, 10.0002F);
      ((Path)localObject).lineTo(24.132F, 10.0002F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qb
 * JD-Core Version:    0.6.2
 */