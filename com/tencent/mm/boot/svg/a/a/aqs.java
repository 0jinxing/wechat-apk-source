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

public final class aqs extends c
{
  private final int height = 186;
  private final int width = 186;

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
        paramInt = 186;
        continue;
        paramInt = 186;
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
      localPaint.setColor(-16896);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(186.0F, 94.148148F);
      localPath.cubicTo(186.0F, 41.636444F, 144.36356F, 0.0F, 91.851852F, 0.0F);
      localPath.cubicTo(41.636444F, 0.0F, 0.0F, 41.636444F, 0.0F, 94.148148F);
      localPath.cubicTo(0.0F, 144.36356F, 41.636444F, 186.0F, 91.851852F, 186.0F);
      localPath.cubicTo(144.36356F, 186.0F, 186.0F, 144.36356F, 186.0F, 94.148148F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(107.5779F, 70.849312F);
      ((Path)localObject).cubicTo(122.7227F, 70.849312F, 135.0F, 83.191872F, 135.0F, 98.42466F);
      ((Path)localObject).cubicTo(135.0F, 113.6541F, 122.72481F, 126.0F, 107.5779F, 126.0F);
      ((Path)localObject).lineTo(55.890526F, 126.0F);
      ((Path)localObject).cubicTo(55.398701F, 126.0F, 55.0F, 125.58803F, 55.0F, 125.10005F);
      ((Path)localObject).lineTo(55.0F, 117.85886F);
      ((Path)localObject).cubicTo(55.0F, 117.36182F, 55.393009F, 116.9589F, 55.890583F, 116.9589F);
      ((Path)localObject).lineTo(107.58115F, 116.9589F);
      ((Path)localObject).cubicTo(117.75454F, 116.9589F, 126.01124F, 108.66084F, 126.01124F, 98.42466F);
      ((Path)localObject).cubicTo(126.01124F, 88.186226F, 117.7598F, 79.890411F, 107.58115F, 79.890411F);
      ((Path)localObject).lineTo(75.558434F, 79.890411F);
      ((Path)localObject).lineTo(75.558434F, 89.567261F);
      ((Path)localObject).cubicTo(75.558434F, 90.565697F, 74.914932F, 90.893188F, 74.12114F, 90.296753F);
      ((Path)localObject).lineTo(55.596493F, 76.377876F);
      ((Path)localObject).cubicTo(54.799637F, 75.779144F, 54.8027F, 74.81443F, 55.596493F, 74.217995F);
      ((Path)localObject).lineTo(74.12114F, 60.299118F);
      ((Path)localObject).cubicTo(74.917999F, 59.700382F, 75.558434F, 60.029289F, 75.558434F, 61.02861F);
      ((Path)localObject).lineTo(75.558434F, 70.849312F);
      ((Path)localObject).lineTo(107.5779F, 70.849312F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aqs
 * JD-Core Version:    0.6.2
 */