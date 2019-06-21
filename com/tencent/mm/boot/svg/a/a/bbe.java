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

public final class bbe extends c
{
  private final int height = 14;
  private final int width = 16;

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
        paramInt = 16;
        continue;
        paramInt = 14;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-5066062);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -265.0F, 0.0F, 1.0F, -604.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 66.0F, 0.0F, 1.0F, 602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 198.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.225F, 14.85F);
      ((Path)localObject1).lineTo(15.225F, 14.486597F);
      ((Path)localObject1).cubicTo(15.225F, 14.314545F, 15.04851F, 14.032515F, 14.894857F, 13.957565F);
      ((Path)localObject1).lineTo(10.649592F, 11.88678F);
      ((Path)localObject1).cubicTo(9.504656F, 11.328295F, 9.22168F, 9.977185F, 10.042003F, 9.004776F);
      ((Path)localObject1).lineTo(10.313152F, 8.683356F);
      ((Path)localObject1).cubicTo(10.726646F, 8.193201F, 11.1F, 7.173293F, 11.1F, 6.532639F);
      ((Path)localObject1).lineTo(11.1F, 5.250155F);
      ((Path)localObject1).cubicTo(11.1F, 4.091186F, 10.159192F, 3.15F, 9.0F, 3.15F);
      ((Path)localObject1).cubicTo(7.842232F, 3.15F, 6.9F, 4.091402F, 6.9F, 5.249685F);
      ((Path)localObject1).lineTo(6.9F, 6.531968F);
      ((Path)localObject1).cubicTo(6.9F, 7.174248F, 7.27181F, 8.190363F, 7.686809F, 8.682234F);
      ((Path)localObject1).lineTo(7.957958F, 9.00361F);
      ((Path)localObject1).cubicTo(8.779977F, 9.977895F, 8.493911F, 11.327738F, 7.35054F, 11.88569F);
      ((Path)localObject1).lineTo(3.105275F, 13.957333F);
      ((Path)localObject1).cubicTo(2.952763F, 14.031756F, 2.775F, 14.316507F, 2.775F, 14.486597F);
      ((Path)localObject1).lineTo(2.775F, 14.85F);
      ((Path)localObject1).lineTo(15.225F, 14.85F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1.875F, 15.0F);
      ((Path)localObject1).lineTo(1.875F, 14.486597F);
      ((Path)localObject1).cubicTo(1.875F, 13.972781F, 2.248613F, 13.373931F, 2.710573F, 13.148499F);
      ((Path)localObject1).lineTo(6.955838F, 11.076858F);
      ((Path)localObject1).cubicTo(7.571533F, 10.776405F, 7.714695F, 10.110947F, 7.270084F, 9.58398F);
      ((Path)localObject1).lineTo(6.998935F, 9.262604F);
      ((Path)localObject1).cubicTo(6.447238F, 8.608714F, 6.0F, 7.387122F, 6.0F, 6.531968F);
      ((Path)localObject1).lineTo(6.0F, 5.249685F);
      ((Path)localObject1).cubicTo(6.0F, 3.593005F, 7.346517F, 2.25F, 9.0F, 2.25F);
      ((Path)localObject1).cubicTo(10.656855F, 2.25F, 12.0F, 3.594735F, 12.0F, 5.250155F);
      ((Path)localObject1).lineTo(12.0F, 6.532639F);
      ((Path)localObject1).cubicTo(12.0F, 7.386972F, 11.550699F, 8.612145F, 11.001065F, 9.26368F);
      ((Path)localObject1).lineTo(10.729916F, 9.585099F);
      ((Path)localObject1).cubicTo(10.287774F, 10.109213F, 10.425891F, 10.776299F, 11.044162F, 11.077883F);
      ((Path)localObject1).lineTo(15.289427F, 13.148668F);
      ((Path)localObject1).cubicTo(15.750901F, 13.37377F, 16.125F, 13.968878F, 16.125F, 14.486597F);
      ((Path)localObject1).lineTo(16.125F, 15.0F);
      ((Path)localObject1).cubicTo(16.125F, 15.414213F, 15.789213F, 15.75F, 15.375F, 15.75F);
      ((Path)localObject1).lineTo(2.625F, 15.75F);
      ((Path)localObject1).cubicTo(2.210786F, 15.75F, 1.875F, 15.414213F, 1.875F, 15.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(8.25F, 13.5F);
      ((Path)localObject1).lineTo(9.0F, 11.25F);
      ((Path)localObject1).lineTo(9.75F, 13.5F);
      ((Path)localObject1).lineTo(9.0F, 14.25F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbe
 * JD-Core Version:    0.6.2
 */