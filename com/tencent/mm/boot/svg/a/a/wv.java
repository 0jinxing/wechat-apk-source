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

public final class wv extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(41.623169F, 65.789192F);
      ((Path)localObject1).lineTo(41.977798F, 65.992409F);
      ((Path)localObject1).cubicTo(51.303997F, 69.16349F, 62.08437F, 65.164299F, 67.361F, 56.093422F);
      ((Path)localObject1).lineTo(68.911209F, 53.428516F);
      ((Path)localObject1).lineTo(65.566063F, 51.511677F);
      ((Path)localObject1).lineTo(64.015854F, 54.176582F);
      ((Path)localObject1).cubicTo(59.03817F, 62.733551F, 48.512413F, 65.723717F, 40.710613F, 61.253113F);
      ((Path)localObject1).cubicTo(32.254654F, 56.407665F, 29.600893F, 45.865349F, 34.578579F, 37.30838F);
      ((Path)localObject1).lineTo(36.128788F, 34.643475F);
      ((Path)localObject1).lineTo(36.274845F, 34.194435F);
      ((Path)localObject1).lineTo(32.783642F, 32.726635F);
      ((Path)localObject1).lineTo(31.233435F, 35.391541F);
      ((Path)localObject1).cubicTo(26.03302F, 44.331394F, 27.804018F, 55.403114F, 34.969021F, 61.877071F);
      ((Path)localObject1).lineTo(29.981249F, 70.516144F);
      ((Path)localObject1).lineTo(30.39813F, 75.444328F);
      ((Path)localObject1).cubicTo(30.483181F, 76.449745F, 31.284433F, 76.90377F, 32.189484F, 76.478569F);
      ((Path)localObject1).lineTo(36.665859F, 74.375504F);
      ((Path)localObject1).lineTo(41.623169F, 65.789192F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(63.940453F, 21.108919F);
      ((Path)localObject1).cubicTo(58.015858F, 17.731424F, 50.436932F, 19.741205F, 47.023098F, 25.579679F);
      ((Path)localObject1).lineTo(38.818642F, 39.611271F);
      ((Path)localObject1).cubicTo(35.400043F, 45.457897F, 37.430252F, 52.934784F, 43.356152F, 56.313019F);
      ((Path)localObject1).cubicTo(49.280746F, 59.690514F, 56.859673F, 57.680733F, 60.273506F, 51.842258F);
      ((Path)localObject1).lineTo(68.477959F, 37.810669F);
      ((Path)localObject1).cubicTo(71.896561F, 31.964041F, 69.866356F, 24.487156F, 63.940453F, 21.108919F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localPaint.setStrokeWidth(3.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(94.5F, 48.0F);
      ((Path)localObject2).cubicTo(94.5F, 22.317848F, 73.681755F, 1.5F, 48.0F, 1.5F);
      ((Path)localObject2).cubicTo(22.318247F, 1.5F, 1.5F, 22.317848F, 1.5F, 48.0F);
      ((Path)localObject2).cubicTo(1.5F, 73.682152F, 22.318247F, 94.5F, 48.0F, 94.5F);
      ((Path)localObject2).cubicTo(73.681755F, 94.5F, 94.5F, 73.682152F, 94.5F, 48.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wv
 * JD-Core Version:    0.6.2
 */