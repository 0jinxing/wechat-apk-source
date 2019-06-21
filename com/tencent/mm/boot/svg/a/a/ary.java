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

public final class ary extends c
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
      localPaint.setColor(-1710619);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(144.0F, 0.0F);
      localPath.lineTo(144.0F, 146.0F);
      localPath.lineTo(0.0F, 146.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(67.462845F, 72.000183F);
      ((Path)localObject).lineTo(49.311199F, 53.848534F);
      ((Path)localObject).cubicTo(48.899487F, 53.436821F, 48.894138F, 52.760975F, 49.307991F, 52.347126F);
      ((Path)localObject).lineTo(52.346096F, 49.307949F);
      ((Path)localObject).cubicTo(52.754601F, 48.899445F, 53.432587F, 48.896236F, 53.848576F, 49.312225F);
      ((Path)localObject).lineTo(72.000221F, 67.462807F);
      ((Path)localObject).lineTo(90.150803F, 49.312225F);
      ((Path)localObject).cubicTo(90.563583F, 48.899445F, 91.239426F, 48.895168F, 91.65435F, 49.307949F);
      ((Path)localObject).lineTo(94.691383F, 52.347126F);
      ((Path)localObject).cubicTo(95.099892F, 52.754559F, 95.104164F, 53.433613F, 94.688179F, 53.848534F);
      ((Path)localObject).lineTo(76.53653F, 72.000183F);
      ((Path)localObject).lineTo(94.688179F, 90.151825F);
      ((Path)localObject).cubicTo(95.099892F, 90.563538F, 95.105232F, 91.239388F, 94.691383F, 91.654305F);
      ((Path)localObject).lineTo(91.65435F, 94.692413F);
      ((Path)localObject).cubicTo(91.244774F, 95.100914F, 90.566788F, 95.104126F, 90.150803F, 94.689209F);
      ((Path)localObject).lineTo(72.000221F, 76.536491F);
      ((Path)localObject).lineTo(53.848576F, 94.689209F);
      ((Path)localObject).cubicTo(53.436863F, 95.100914F, 52.759945F, 95.105194F, 52.346096F, 94.692413F);
      ((Path)localObject).lineTo(49.307991F, 91.654305F);
      ((Path)localObject).cubicTo(48.899487F, 91.244736F, 48.896278F, 90.56675F, 49.311199F, 90.151825F);
      ((Path)localObject).lineTo(67.462845F, 72.000183F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ary
 * JD-Core Version:    0.6.2
 */