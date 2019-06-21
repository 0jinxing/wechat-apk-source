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

public final class bp extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 51, 4);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(15.75F, 18.0F);
      ((Path)localObject2).lineTo(2.25F, 18.0F);
      ((Path)localObject2).cubicTo(1.008F, 18.0F, 0.0F, 16.992001F, 0.0F, 15.75F);
      ((Path)localObject2).lineTo(0.0F, 2.25F);
      ((Path)localObject2).cubicTo(0.0F, 1.008F, 1.008F, 0.0F, 2.25F, 0.0F);
      ((Path)localObject2).lineTo(15.75F, 0.0F);
      ((Path)localObject2).cubicTo(16.992001F, 0.0F, 18.0F, 1.008F, 18.0F, 2.25F);
      ((Path)localObject2).lineTo(18.0F, 15.75F);
      ((Path)localObject2).cubicTo(18.0F, 16.992001F, 16.992001F, 18.0F, 15.75F, 18.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3.375F, 0.0F, 1.0F, 4.41F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.537F, 9.162F);
      ((Path)localObject1).cubicTo(7.7805F, 9.162F, 10.1025F, 5.643F, 10.1025F, 2.5965F);
      ((Path)localObject1).cubicTo(10.1025F, 2.4975F, 10.1025F, 2.3985F, 10.098F, 2.2995F);
      ((Path)localObject1).cubicTo(10.548F, 1.9755F, 10.9395F, 1.566F, 11.25F, 1.1025F);
      ((Path)localObject1).cubicTo(10.836F, 1.287F, 10.3905F, 1.4085F, 9.9225F, 1.467F);
      ((Path)localObject1).cubicTo(10.3995F, 1.1835F, 10.764F, 0.729F, 10.9395F, 0.189F);
      ((Path)localObject1).cubicTo(10.494F, 0.4545F, 9.999F, 0.6435F, 9.4725F, 0.747F);
      ((Path)localObject1).cubicTo(9.049501F, 0.297F, 8.451F, 0.018F, 7.7895F, 0.018F);
      ((Path)localObject1).cubicTo(6.516F, 0.018F, 5.481F, 1.053F, 5.481F, 2.3265F);
      ((Path)localObject1).cubicTo(5.481F, 2.5065F, 5.5035F, 2.682F, 5.5395F, 2.853F);
      ((Path)localObject1).cubicTo(3.6225F, 2.7585F, 1.9215F, 1.836F, 0.783F, 0.441F);
      ((Path)localObject1).cubicTo(0.585F, 0.783F, 0.4725F, 1.179F, 0.4725F, 1.602F);
      ((Path)localObject1).cubicTo(0.4725F, 2.403F, 0.882F, 3.1095F, 1.4985F, 3.5235F);
      ((Path)localObject1).cubicTo(1.1205F, 3.51F, 0.765F, 3.4065F, 0.4545F, 3.2355F);
      ((Path)localObject1).cubicTo(0.4545F, 3.2445F, 0.4545F, 3.2535F, 0.4545F, 3.267F);
      ((Path)localObject1).cubicTo(0.4545F, 4.383F, 1.251F, 5.319F, 2.304F, 5.5305F);
      ((Path)localObject1).cubicTo(2.1105F, 5.5845F, 1.908F, 5.6115F, 1.6965F, 5.6115F);
      ((Path)localObject1).cubicTo(1.548F, 5.6115F, 1.404F, 5.598F, 1.2645F, 5.571F);
      ((Path)localObject1).cubicTo(1.557F, 6.489F, 2.412F, 7.155F, 3.42F, 7.173F);
      ((Path)localObject1).cubicTo(2.628F, 7.794F, 1.6335F, 8.163F, 0.5535F, 8.163F);
      ((Path)localObject1).cubicTo(0.369F, 8.163F, 0.1845F, 8.154F, 0.0045F, 8.1315F);
      ((Path)localObject1).cubicTo(1.0215F, 8.7795F, 2.2365F, 9.162F, 3.537F, 9.162F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bp
 * JD-Core Version:    0.6.2
 */