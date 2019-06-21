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

public final class azx extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-15028967);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(29.278912F, 21.516287F);
      localPath.lineTo(52.241261F, 35.468605F);
      localPath.cubicTo(52.949238F, 35.898785F, 53.174438F, 36.821449F, 52.744259F, 37.52943F);
      localPath.cubicTo(52.61935F, 37.735001F, 52.446831F, 37.90752F, 52.241261F, 38.032429F);
      localPath.lineTo(29.278912F, 51.984749F);
      localPath.cubicTo(28.57093F, 52.414928F, 27.64827F, 52.189728F, 27.218088F, 51.481747F);
      localPath.cubicTo(27.075439F, 51.246979F, 27.0F, 50.977547F, 27.0F, 50.702835F);
      localPath.lineTo(27.0F, 22.798197F);
      localPath.cubicTo(27.0F, 21.96977F, 27.671574F, 21.298197F, 28.5F, 21.298197F);
      localPath.cubicTo(28.77471F, 21.298197F, 29.044144F, 21.373636F, 29.278912F, 21.516287F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localPaint.setStrokeWidth(3.6F);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 1.799999F);
      ((Path)localObject).cubicTo(54.888138F, 1.799999F, 70.199997F, 17.11186F, 70.199997F, 36.0F);
      ((Path)localObject).cubicTo(70.199997F, 54.888138F, 54.888138F, 70.199997F, 36.0F, 70.199997F);
      ((Path)localObject).cubicTo(17.11186F, 70.199997F, 1.799999F, 54.888138F, 1.799999F, 36.0F);
      ((Path)localObject).cubicTo(1.799999F, 17.11186F, 17.11186F, 1.799999F, 36.0F, 1.799999F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azx
 * JD-Core Version:    0.6.2
 */