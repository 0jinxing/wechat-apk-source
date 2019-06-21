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

public final class dx extends c
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
      localCanvas.saveLayerAlpha(null, 128, 4);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-16777216);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(48.929794F, 46.684208F);
      ((Path)localObject).lineTo(61.272793F, 59.027206F);
      ((Path)localObject).lineTo(58.727207F, 61.572792F);
      ((Path)localObject).lineTo(46.358551F, 49.204136F);
      ((Path)localObject).cubicTo(42.728428F, 52.200203F, 38.074402F, 54.0F, 33.0F, 54.0F);
      ((Path)localObject).cubicTo(21.402F, 54.0F, 12.0F, 44.598F, 12.0F, 33.0F);
      ((Path)localObject).cubicTo(12.0F, 21.402F, 21.402F, 12.0F, 33.0F, 12.0F);
      ((Path)localObject).cubicTo(44.598F, 12.0F, 54.0F, 21.402F, 54.0F, 33.0F);
      ((Path)localObject).cubicTo(54.0F, 38.227451F, 52.089996F, 43.008789F, 48.929794F, 46.684208F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.399994F, 33.000038F);
      ((Path)localObject).cubicTo(50.399994F, 23.390265F, 42.609764F, 15.600037F, 32.999992F, 15.600037F);
      ((Path)localObject).cubicTo(23.390221F, 15.600037F, 15.599991F, 23.390265F, 15.599991F, 33.000038F);
      ((Path)localObject).cubicTo(15.599991F, 42.60981F, 23.390221F, 50.40004F, 32.999992F, 50.40004F);
      ((Path)localObject).cubicTo(42.609764F, 50.40004F, 50.399994F, 42.60981F, 50.399994F, 33.000038F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dx
 * JD-Core Version:    0.6.2
 */