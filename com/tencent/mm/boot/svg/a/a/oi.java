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

public final class oi extends c
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
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 0.0F);
      ((Path)localObject2).lineTo(60.0F, 60.0F);
      ((Path)localObject2).lineTo(0.0F, 60.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(9.0F, 14.380721F);
      localPath.cubicTo(9.0F, 11.409031F, 11.404006F, 9.0F, 14.380721F, 9.0F);
      localPath.lineTo(46.619278F, 9.0F);
      localPath.cubicTo(49.590969F, 9.0F, 52.0F, 11.404006F, 52.0F, 14.380721F);
      localPath.lineTo(52.0F, 46.619278F);
      localPath.cubicTo(52.0F, 49.590969F, 49.595993F, 52.0F, 46.619278F, 52.0F);
      localPath.lineTo(14.380721F, 52.0F);
      localPath.cubicTo(11.409031F, 52.0F, 9.0F, 49.595993F, 9.0F, 46.619278F);
      localPath.lineTo(9.0F, 14.380721F);
      localPath.lineTo(9.0F, 14.380721F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-964550);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(6.0F, 12.006387F);
      ((Path)localObject1).cubicTo(6.0F, 8.689151F, 8.683541F, 6.0F, 12.006387F, 6.0F);
      ((Path)localObject1).lineTo(47.993614F, 6.0F);
      ((Path)localObject1).cubicTo(51.310848F, 6.0F, 54.0F, 8.683541F, 54.0F, 12.006387F);
      ((Path)localObject1).lineTo(54.0F, 47.993614F);
      ((Path)localObject1).cubicTo(54.0F, 51.310848F, 51.31646F, 54.0F, 47.993614F, 54.0F);
      ((Path)localObject1).lineTo(12.006387F, 54.0F);
      ((Path)localObject1).cubicTo(8.689151F, 54.0F, 6.0F, 51.31646F, 6.0F, 47.993614F);
      ((Path)localObject1).lineTo(6.0F, 12.006387F);
      ((Path)localObject1).lineTo(6.0F, 12.006387F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(12.0F, 32.576923F);
      ((Path)localObject1).lineTo(16.200001F, 28.538462F);
      ((Path)localObject1).lineTo(25.0F, 36.923077F);
      ((Path)localObject1).lineTo(43.799999F, 19.0F);
      ((Path)localObject1).lineTo(48.0F, 23.038462F);
      ((Path)localObject1).lineTo(25.0F, 45.0F);
      ((Path)localObject1).lineTo(12.0F, 32.576923F);
      ((Path)localObject1).lineTo(12.0F, 32.576923F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.oi
 * JD-Core Version:    0.6.2
 */