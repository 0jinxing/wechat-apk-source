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

public final class kp extends c
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
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-15028967);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(48.0F, 80.0F);
      localPath.cubicTo(65.673111F, 80.0F, 80.0F, 65.673111F, 80.0F, 48.0F);
      localPath.cubicTo(80.0F, 30.326887F, 65.673111F, 16.0F, 48.0F, 16.0F);
      localPath.cubicTo(30.326887F, 16.0F, 16.0F, 30.326887F, 16.0F, 48.0F);
      localPath.cubicTo(16.0F, 65.673111F, 30.326887F, 80.0F, 48.0F, 80.0F);
      localPath.close();
      localPath.moveTo(48.0F, 88.0F);
      localPath.cubicTo(25.908609F, 88.0F, 8.0F, 70.091393F, 8.0F, 48.0F);
      localPath.cubicTo(8.0F, 25.908609F, 25.908609F, 8.0F, 48.0F, 8.0F);
      localPath.cubicTo(70.091393F, 8.0F, 88.0F, 25.908609F, 88.0F, 48.0F);
      localPath.cubicTo(88.0F, 70.091393F, 70.091393F, 88.0F, 48.0F, 88.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(48.0F, 65.0F);
      ((Path)localObject).cubicTo(57.38884F, 65.0F, 65.0F, 57.38884F, 65.0F, 48.0F);
      ((Path)localObject).cubicTo(65.0F, 38.61116F, 57.38884F, 31.0F, 48.0F, 31.0F);
      ((Path)localObject).cubicTo(38.61116F, 31.0F, 31.0F, 38.61116F, 31.0F, 48.0F);
      ((Path)localObject).cubicTo(31.0F, 57.38884F, 38.61116F, 65.0F, 48.0F, 65.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 73.0F);
      ((Path)localObject).cubicTo(34.192883F, 73.0F, 23.0F, 61.807117F, 23.0F, 48.0F);
      ((Path)localObject).cubicTo(23.0F, 34.192883F, 34.192883F, 23.0F, 48.0F, 23.0F);
      ((Path)localObject).cubicTo(61.807117F, 23.0F, 73.0F, 34.192883F, 73.0F, 48.0F);
      ((Path)localObject).cubicTo(73.0F, 61.807117F, 61.807117F, 73.0F, 48.0F, 73.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.kp
 * JD-Core Version:    0.6.2
 */