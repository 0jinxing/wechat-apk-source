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

public final class hp extends c
{
  private final int height = 372;
  private final int width = 438;

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
        paramInt = 438;
        continue;
        paramInt = 372;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 120.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(13.0F, 114.0F);
      ((Path)localObject2).lineTo(13.0F, 39.0F);
      ((Path)localObject2).lineTo(185.0F, 39.0F);
      ((Path)localObject2).lineTo(185.0F, 312.0F);
      ((Path)localObject2).lineTo(13.0F, 312.0F);
      ((Path)localObject2).lineTo(13.0F, 219.46962F);
      ((Path)localObject2).lineTo(14.5F, 219.46962F);
      ((Path)localObject2).lineTo(14.5F, 310.5F);
      ((Path)localObject2).lineTo(183.5F, 310.5F);
      ((Path)localObject2).lineTo(183.5F, 40.5F);
      ((Path)localObject2).lineTo(14.5F, 40.5F);
      ((Path)localObject2).lineTo(14.5F, 114.0F);
      ((Path)localObject2).lineTo(13.0F, 114.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 114.0F);
      ((Path)localObject2).lineTo(0.0F, 15.991757F);
      ((Path)localObject2).cubicTo(0.0F, 7.170866F, 7.160596F, 0.0F, 15.993638F, 0.0F);
      ((Path)localObject2).lineTo(182.00636F, 0.0F);
      ((Path)localObject2).cubicTo(190.83611F, 0.0F, 198.0F, 7.159753F, 198.0F, 15.991757F);
      ((Path)localObject2).lineTo(198.0F, 344.00824F);
      ((Path)localObject2).cubicTo(198.0F, 352.82913F, 190.8394F, 360.0F, 182.00636F, 360.0F);
      ((Path)localObject2).lineTo(15.993638F, 360.0F);
      ((Path)localObject2).cubicTo(7.163899F, 360.0F, 0.0F, 352.84024F, 0.0F, 344.00824F);
      ((Path)localObject2).lineTo(0.0F, 219.46962F);
      ((Path)localObject2).lineTo(3.0F, 219.46962F);
      ((Path)localObject2).lineTo(3.0F, 344.00754F);
      ((Path)localObject2).cubicTo(3.0F, 351.18307F, 8.824723F, 357.0F, 16.008371F, 357.0F);
      ((Path)localObject2).lineTo(181.99162F, 357.0F);
      ((Path)localObject2).cubicTo(189.17595F, 357.0F, 195.0F, 351.18747F, 195.0F, 344.00754F);
      ((Path)localObject2).lineTo(195.0F, 15.992457F);
      ((Path)localObject2).cubicTo(195.0F, 8.816921F, 189.17528F, 3.0F, 181.99162F, 3.0F);
      ((Path)localObject2).lineTo(16.008371F, 3.0F);
      ((Path)localObject2).cubicTo(8.824047F, 3.0F, 3.0F, 8.812543F, 3.0F, 15.992457F);
      ((Path)localObject2).lineTo(3.0F, 114.0F);
      ((Path)localObject2).lineTo(7.105427E-015F, 114.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(86.0F, 18.0F);
      ((Path)localObject1).lineTo(112.0F, 18.0F);
      ((Path)localObject1).lineTo(112.0F, 21.0F);
      ((Path)localObject1).lineTo(86.0F, 21.0F);
      ((Path)localObject1).lineTo(86.0F, 18.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(60.651176F, 249.89926F);
      ((Path)localObject1).lineTo(60.595497F, 225.46962F);
      ((Path)localObject1).lineTo(33.888363F, 225.46962F);
      ((Path)localObject1).cubicTo(27.333059F, 225.46962F, 22.0F, 220.17123F, 22.0F, 213.65854F);
      ((Path)localObject1).lineTo(22.0F, 131.81108F);
      ((Path)localObject1).cubicTo(22.0F, 125.29839F, 27.333059F, 120.0F, 33.888363F, 120.0F);
      ((Path)localObject1).lineTo(160.11163F, 120.0F);
      ((Path)localObject1).cubicTo(166.66695F, 120.0F, 172.0F, 125.29839F, 172.0F, 131.81108F);
      ((Path)localObject1).lineTo(172.0F, 213.65854F);
      ((Path)localObject1).cubicTo(172.0F, 220.17123F, 166.66695F, 225.46962F, 160.11163F, 225.46962F);
      ((Path)localObject1).lineTo(97.138374F, 225.46962F);
      ((Path)localObject1).lineTo(69.358574F, 253.56952F);
      ((Path)localObject1).cubicTo(68.354385F, 254.50647F, 67.109116F, 254.99985F, 65.807869F, 255.0F);
      ((Path)localObject1).cubicTo(62.971363F, 255.00031F, 60.6581F, 252.7121F, 60.651176F, 249.89926F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(63.588531F, 247.54555F);
      ((Path)localObject1).lineTo(63.608063F, 222.6283F);
      ((Path)localObject1).lineTo(36.50444F, 222.48622F);
      ((Path)localObject1).cubicTo(28.854071F, 222.5878F, 25.13076F, 218.84735F, 25.09161F, 211.11259F);
      ((Path)localObject1).lineTo(25.0F, 134.37363F);
      ((Path)localObject1).cubicTo(25.132122F, 125.48259F, 30.013842F, 122.98F, 36.41283F, 123.0F);
      ((Path)localObject1).lineTo(157.58717F, 123.0F);
      ((Path)localObject1).cubicTo(167.20503F, 123.0F, 169.02705F, 128.21953F, 169.0F, 134.37363F);
      ((Path)localObject1).lineTo(169.09161F, 211.11259F);
      ((Path)localObject1).cubicTo(169.11636F, 218.63168F, 166.02811F, 222.59373F, 157.67879F, 222.48622F);
      ((Path)localObject1).lineTo(95.951683F, 222.58171F);
      ((Path)localObject1).lineTo(68.555214F, 250.40294F);
      ((Path)localObject1).cubicTo(67.591187F, 251.30519F, 66.853767F, 251.84087F, 65.631554F, 251.84087F);
      ((Path)localObject1).cubicTo(63.608063F, 251.86566F, 63.595177F, 250.2542F, 63.588531F, 247.54555F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-564640);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(130.0F, 171.40741F);
      ((Path)localObject3).cubicTo(130.0F, 152.77422F, 115.22578F, 138.0F, 96.59259F, 138.0F);
      ((Path)localObject3).cubicTo(78.774223F, 138.0F, 64.0F, 152.77422F, 64.0F, 171.40741F);
      ((Path)localObject3).cubicTo(64.0F, 189.22578F, 78.774223F, 204.0F, 96.59259F, 204.0F);
      ((Path)localObject3).cubicTo(115.22578F, 204.0F, 130.0F, 189.22578F, 130.0F, 171.40741F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(127.0F, 171.37038F);
      ((Path)localObject3).cubicTo(127.0F, 154.43111F, 113.56889F, 141.0F, 96.629631F, 141.0F);
      ((Path)localObject3).cubicTo(80.431114F, 141.0F, 67.0F, 154.43111F, 67.0F, 171.37038F);
      ((Path)localObject3).cubicTo(67.0F, 187.56889F, 80.431114F, 201.0F, 96.629631F, 201.0F);
      ((Path)localObject3).cubicTo(113.56889F, 201.0F, 127.0F, 187.56889F, 127.0F, 171.37038F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(97.076286F, 156.97F);
      ((Path)localObject3).cubicTo(95.419434F, 156.97F, 94.141129F, 158.31671F, 94.220627F, 159.96783F);
      ((Path)localObject3).lineTo(94.931946F, 174.74138F);
      ((Path)localObject3).cubicTo(95.011665F, 176.39705F, 96.419357F, 177.73923F, 98.066917F, 177.73923F);
      ((Path)localObject3).lineTo(96.085655F, 177.73923F);
      ((Path)localObject3).cubicTo(97.737335F, 177.73923F, 99.141129F, 176.3925F, 99.220627F, 174.74138F);
      ((Path)localObject3).lineTo(99.931946F, 159.96783F);
      ((Path)localObject3).cubicTo(100.01167F, 158.31218F, 98.729774F, 156.97F, 97.076286F, 156.97F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(97.076286F, 186.97F);
      ((Path)localObject3).cubicTo(98.733139F, 186.97F, 100.07629F, 185.67851F, 100.07629F, 184.08537F);
      ((Path)localObject3).cubicTo(100.07629F, 182.49225F, 98.733139F, 181.20076F, 97.076286F, 181.20076F);
      ((Path)localObject3).cubicTo(95.419434F, 181.20076F, 94.076286F, 182.49225F, 94.076286F, 184.08537F);
      ((Path)localObject3).cubicTo(94.076286F, 185.67851F, 95.419434F, 186.97F, 97.076286F, 186.97F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.hp
 * JD-Core Version:    0.6.2
 */