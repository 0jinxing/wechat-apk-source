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

public final class ark extends c
{
  private final int height = 64;
  private final int width = 38;

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
        paramInt = 38;
        continue;
        paramInt = 64;
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(38.0F, 0.0F);
      localPath.lineTo(38.0F, 3.123067F);
      localPath.lineTo(0.0F, 3.123067F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(3.954272F, 13.915369F);
      localPath.lineTo(5.782609F, 15.157895F);
      localPath.lineTo(0.0F, 15.157895F);
      localPath.lineTo(0.0F, 6.965601F);
      localPath.lineTo(38.0F, 6.965601F);
      localPath.lineTo(38.0F, 15.157895F);
      localPath.lineTo(32.217392F, 15.157895F);
      localPath.lineTo(34.045727F, 13.915369F);
      localPath.lineTo(34.924232F, 13.915369F);
      localPath.lineTo(34.924232F, 10.105263F);
      localPath.lineTo(3.055757F, 10.105263F);
      localPath.lineTo(3.055757F, 13.915369F);
      localPath.lineTo(3.954272F, 13.915369F);
      localPath.close();
      localPath.moveTo(32.217392F, 15.157895F);
      localPath.lineTo(38.0F, 15.157895F);
      localPath.lineTo(28.086956F, 22.37594F);
      localPath.lineTo(28.086956F, 64.0F);
      localPath.lineTo(9.913043F, 64.0F);
      localPath.lineTo(9.913043F, 22.37594F);
      localPath.lineTo(0.0F, 15.157895F);
      localPath.lineTo(5.782609F, 15.157895F);
      localPath.lineTo(13.217391F, 20.210526F);
      localPath.lineTo(24.782608F, 20.210526F);
      localPath.lineTo(32.217392F, 15.157895F);
      localPath.close();
      localPath.moveTo(13.062004F, 20.210526F);
      localPath.lineTo(24.988686F, 20.210526F);
      localPath.lineTo(24.988686F, 60.939548F);
      localPath.lineTo(13.062004F, 60.939548F);
      localPath.lineTo(13.062004F, 20.210526F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(19.0F, 27.022888F);
      ((Path)localObject).cubicTo(20.368706F, 27.022888F, 21.47826F, 25.816298F, 21.47826F, 24.421053F);
      ((Path)localObject).cubicTo(21.47826F, 23.025806F, 20.368706F, 21.894737F, 19.0F, 21.894737F);
      ((Path)localObject).cubicTo(17.631294F, 21.894737F, 16.52174F, 23.025806F, 16.52174F, 24.421053F);
      ((Path)localObject).cubicTo(16.52174F, 25.816298F, 17.631294F, 27.022888F, 19.0F, 27.022888F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ark
 * JD-Core Version:    0.6.2
 */