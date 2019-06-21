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

public final class abm extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
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
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.6F, 3.6F);
      ((Path)localObject1).lineTo(3.6F, 41.400002F);
      ((Path)localObject1).lineTo(56.400002F, 41.400002F);
      ((Path)localObject1).lineTo(56.400002F, 3.6F);
      ((Path)localObject1).lineTo(3.6F, 3.6F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.0F, 3.0F);
      ((Path)localObject1).cubicTo(-2.029061E-016F, 1.343146F, 1.343146F, 3.043592E-016F, 3.0F, 0.0F);
      ((Path)localObject1).lineTo(57.0F, 0.0F);
      ((Path)localObject1).cubicTo(58.656853F, -3.043592E-016F, 60.0F, 1.343146F, 60.0F, 3.0F);
      ((Path)localObject1).lineTo(60.0F, 42.0F);
      ((Path)localObject1).cubicTo(60.0F, 43.656853F, 58.656853F, 45.0F, 57.0F, 45.0F);
      ((Path)localObject1).lineTo(3.0F, 45.0F);
      ((Path)localObject1).cubicTo(1.343146F, 45.0F, 2.029061E-016F, 43.656853F, 0.0F, 42.0F);
      ((Path)localObject1).lineTo(0.0F, 3.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(24.333679F, 44.999962F);
      ((Path)localObject1).lineTo(23.016104F, 48.900002F);
      ((Path)localObject1).lineTo(36.983898F, 48.900002F);
      ((Path)localObject1).lineTo(35.666321F, 44.999962F);
      ((Path)localObject1).lineTo(24.333679F, 44.999962F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(38.25F, 41.399963F);
      ((Path)localObject1).lineTo(41.331051F, 50.519901F);
      ((Path)localObject1).cubicTo(41.383305F, 50.674576F, 41.409958F, 50.836739F, 41.409958F, 51.0F);
      ((Path)localObject1).cubicTo(41.409958F, 51.828426F, 40.738384F, 52.5F, 39.909958F, 52.5F);
      ((Path)localObject1).lineTo(20.090042F, 52.5F);
      ((Path)localObject1).cubicTo(19.926783F, 52.5F, 19.764618F, 52.473347F, 19.609945F, 52.421093F);
      ((Path)localObject1).cubicTo(18.825098F, 52.155941F, 18.403799F, 51.304752F, 18.668949F, 50.519901F);
      ((Path)localObject1).lineTo(21.75F, 41.399963F);
      ((Path)localObject1).lineTo(38.25F, 41.399963F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.0F, 33.0F);
      ((Path)localObject1).lineTo(60.0F, 33.0F);
      ((Path)localObject1).lineTo(60.0F, 36.599998F);
      ((Path)localObject1).lineTo(0.0F, 36.599998F);
      ((Path)localObject1).lineTo(0.0F, 33.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abm
 * JD-Core Version:    0.6.2
 */