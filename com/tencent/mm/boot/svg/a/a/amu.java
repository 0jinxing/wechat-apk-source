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

public final class amu extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 18.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(23.0F, 7.105427E-015F);
      ((Path)localObject2).cubicTo(25.038055F, -0.4521216F, 27.033388F, 0.8979728F, 27.0F, 3.0F);
      ((Path)localObject2).cubicTo(27.103931F, 7.225281F, 26.91246F, 11.799481F, 27.0F, 16.0F);
      ((Path)localObject2).cubicTo(21.813272F, 17.743927F, 17.741985F, 21.824436F, 16.0F, 27.0F);
      ((Path)localObject2).cubicTo(11.786217F, 26.912477F, 7.211057F, 27.103909F, 3.0F, 27.0F);
      ((Path)localObject2).cubicTo(0.2878531F, 27.073683F, -0.9718273F, 23.718597F, 1.0F, 22.0F);
      ((Path)localObject2).cubicTo(7.190902F, 15.769161F, 13.741241F, 9.502306F, 20.0F, 3.0F);
      ((Path)localObject2).cubicTo(21.117929F, 1.986109F, 22.105518F, 0.8475962F, 23.0F, 7.105427E-015F);
      ((Path)localObject2).lineTo(23.0F, 7.105427E-015F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(33.0F, 3.0F);
      ((Path)localObject2).cubicTo(32.901676F, 0.2672104F, 36.287827F, -0.9631879F, 38.0F, 1.0F);
      ((Path)localObject2).cubicTo(44.894291F, 7.952157F, 51.999157F, 15.062245F, 59.0F, 22.0F);
      ((Path)localObject2).cubicTo(60.988579F, 23.654861F, 59.73893F, 27.093925F, 57.0F, 27.0F);
      ((Path)localObject2).cubicTo(52.77515F, 27.104012F, 48.199818F, 26.912392F, 44.0F, 27.0F);
      ((Path)localObject2).cubicTo(42.253899F, 21.819349F, 38.182457F, 17.724747F, 33.0F, 16.0F);
      ((Path)localObject2).cubicTo(33.083076F, 11.784545F, 32.901676F, 7.215935F, 33.0F, 3.0F);
      ((Path)localObject2).lineTo(33.0F, 3.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.0F, 38.0F);
      ((Path)localObject1).cubicTo(-0.6808487F, 36.524372F, -0.106408F, 33.78191F, 2.0F, 33.0F);
      ((Path)localObject1).cubicTo(6.655866F, 32.803898F, 11.513416F, 33.146706F, 16.0F, 33.0F);
      ((Path)localObject1).cubicTo(17.741562F, 38.187996F, 21.813036F, 42.281525F, 27.0F, 44.0F);
      ((Path)localObject1).cubicTo(26.912455F, 48.230251F, 27.103935F, 52.797661F, 27.0F, 57.0F);
      ((Path)localObject1).cubicTo(27.08378F, 59.724396F, 23.747993F, 60.944389F, 22.0F, 59.0F);
      ((Path)localObject1).cubicTo(15.121306F, 52.061634F, 7.98615F, 44.963493F, 1.0F, 38.0F);
      ((Path)localObject1).lineTo(1.0F, 38.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(44.0F, 33.0F);
      ((Path)localObject3).cubicTo(48.478714F, 33.144409F, 53.314079F, 32.801533F, 58.0F, 33.0F);
      ((Path)localObject3).cubicTo(60.083588F, 33.719231F, 60.688011F, 36.482403F, 59.0F, 38.0F);
      ((Path)localObject3).cubicTo(52.034721F, 44.93327F, 44.902557F, 52.042892F, 38.0F, 59.0F);
      ((Path)localObject3).cubicTo(36.47089F, 60.655113F, 33.73085F, 60.100464F, 33.0F, 58.0F);
      ((Path)localObject3).cubicTo(32.804073F, 53.3438F, 33.146576F, 48.493122F, 33.0F, 44.0F);
      ((Path)localObject3).cubicTo(38.193489F, 42.270943F, 42.273327F, 38.196777F, 44.0F, 33.0F);
      ((Path)localObject3).lineTo(44.0F, 33.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.amu
 * JD-Core Version:    0.6.2
 */