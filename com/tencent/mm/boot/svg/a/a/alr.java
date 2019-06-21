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

public final class alr extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      Paint localPaint2 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint2.setColor(-855638017);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 28.799999F);
      localPath.cubicTo(0.0F, 12.894198F, 12.894198F, 0.0F, 28.799999F, 0.0F);
      localPath.lineTo(115.2F, 0.0F);
      localPath.cubicTo(131.1058F, 0.0F, 144.0F, 12.894198F, 144.0F, 28.799999F);
      localPath.lineTo(144.0F, 115.2F);
      localPath.cubicTo(144.0F, 131.1058F, 131.1058F, 144.0F, 115.2F, 144.0F);
      localPath.lineTo(28.799999F, 144.0F);
      localPath.cubicTo(12.894198F, 144.0F, 0.0F, 131.1058F, 0.0F, 115.2F);
      localPath.lineTo(0.0F, 28.799999F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a((Paint)localObject, paramArrayOfObject);
      localPaint2.setColor(-14477034);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(94.199997F, 67.734596F);
      ((Path)localObject).lineTo(94.199997F, 89.8806F);
      ((Path)localObject).cubicTo(94.199997F, 92.265602F, 92.264999F, 94.2006F, 89.879997F, 94.2006F);
      ((Path)localObject).lineTo(55.32F, 94.2006F);
      ((Path)localObject).cubicTo(52.935001F, 94.2006F, 51.0F, 92.265602F, 51.0F, 89.8806F);
      ((Path)localObject).lineTo(51.0F, 55.320599F);
      ((Path)localObject).cubicTo(51.0F, 52.932598F, 52.935001F, 51.000599F, 55.32F, 51.000599F);
      ((Path)localObject).lineTo(89.879997F, 51.000599F);
      ((Path)localObject).cubicTo(90.219002F, 51.000599F, 90.552002F, 51.0396F, 90.866997F, 51.114601F);
      ((Path)localObject).lineTo(87.599998F, 54.600601F);
      ((Path)localObject).lineTo(55.32F, 54.600601F);
      ((Path)localObject).cubicTo(54.921001F, 54.600601F, 54.599998F, 54.9216F, 54.599998F, 55.320599F);
      ((Path)localObject).lineTo(54.599998F, 89.8806F);
      ((Path)localObject).cubicTo(54.599998F, 90.276604F, 54.921001F, 90.600601F, 55.32F, 90.600601F);
      ((Path)localObject).lineTo(89.879997F, 90.600601F);
      ((Path)localObject).cubicTo(90.278999F, 90.600601F, 90.599998F, 90.276604F, 90.599998F, 89.8806F);
      ((Path)localObject).lineTo(90.599998F, 71.5746F);
      ((Path)localObject).lineTo(94.199997F, 67.734596F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localPaint1.setStrokeWidth(3.6F);
      localPaint1.setStrokeCap(Paint.Cap.SQUARE);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(63.647999F, 67.407082F);
      ((Path)localObject).lineTo(73.500633F, 78.480003F);
      ((Path)localObject).lineTo(96.0F, 54.48867F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alr
 * JD-Core Version:    0.6.2
 */