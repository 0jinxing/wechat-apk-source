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

public final class pw extends c
{
  private final int height = 240;
  private final int width = 240;

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
        paramInt = 240;
        continue;
        paramInt = 240;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16139513);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(213.0F, 121.14815F);
      ((Path)localObject).cubicTo(213.0F, 68.636444F, 171.36356F, 27.0F, 118.85185F, 27.0F);
      ((Path)localObject).cubicTo(68.636444F, 27.0F, 27.0F, 68.636444F, 27.0F, 121.14815F);
      ((Path)localObject).cubicTo(27.0F, 171.36356F, 68.636444F, 213.0F, 118.85185F, 213.0F);
      ((Path)localObject).cubicTo(171.36356F, 213.0F, 213.0F, 171.36356F, 213.0F, 121.14815F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(73.845436F, 126.13097F);
      ((Path)localObject).cubicTo(73.461357F, 125.73346F, 73.409508F, 125.05811F, 73.746353F, 124.59977F);
      ((Path)localObject).lineTo(77.934059F, 118.90164F);
      ((Path)localObject).cubicTo(78.26342F, 118.45349F, 78.884964F, 118.36194F, 79.323456F, 118.69801F);
      ((Path)localObject).lineTo(104.23569F, 137.79182F);
      ((Path)localObject).cubicTo(104.67368F, 138.1275F, 105.37836F, 138.10837F, 105.79235F, 137.76349F);
      ((Path)localObject).lineTo(166.43353F, 87.244484F);
      ((Path)localObject).cubicTo(166.85526F, 86.89315F, 167.51759F, 86.924812F, 167.91162F, 87.31395F);
      ((Path)localObject).lineTo(171.86308F, 91.2164F);
      ((Path)localObject).cubicTo(172.25768F, 91.606102F, 172.26135F, 92.233208F, 171.86464F, 92.623634F);
      ((Path)localObject).lineTo(105.73968F, 157.70047F);
      ((Path)localObject).cubicTo(105.34595F, 158.08797F, 104.71127F, 158.07556F, 104.33132F, 157.68234F);
      ((Path)localObject).lineTo(73.845436F, 126.13097F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.pw
 * JD-Core Version:    0.6.2
 */