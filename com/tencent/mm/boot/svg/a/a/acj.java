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

public final class acj extends c
{
  private final int height = 32;
  private final int width = 32;

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
        paramInt = 32;
        continue;
        paramInt = 32;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.870382F, 23.200001F);
      ((Path)localObject1).lineTo(1.818182F, 23.200001F);
      ((Path)localObject1).cubicTo(1.255856F, 23.200001F, 0.8F, 22.744144F, 0.8F, 22.181818F);
      ((Path)localObject1).lineTo(0.8F, 18.120138F);
      ((Path)localObject1).lineTo(2.304771F, 18.120138F);
      ((Path)localObject1).lineTo(2.304771F, 21.799999F);
      ((Path)localObject1).lineTo(4.870382F, 21.799999F);
      ((Path)localObject1).lineTo(21.666151F, 21.784334F);
      ((Path)localObject1).lineTo(21.666151F, 18.11097F);
      ((Path)localObject1).lineTo(23.197655F, 18.11097F);
      ((Path)localObject1).lineTo(23.197655F, 22.181818F);
      ((Path)localObject1).cubicTo(23.197655F, 22.744144F, 22.741798F, 23.200001F, 22.179474F, 23.200001F);
      ((Path)localObject1).lineTo(4.870382F, 23.200001F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1.818182F, 0.8F);
      ((Path)localObject1).lineTo(5.916729F, 0.8F);
      ((Path)localObject1).lineTo(5.916729F, 2.347675F);
      ((Path)localObject1).lineTo(2.322577F, 2.347675F);
      ((Path)localObject1).lineTo(2.322577F, 5.883533F);
      ((Path)localObject1).lineTo(0.8F, 5.883533F);
      ((Path)localObject1).lineTo(0.8F, 1.818182F);
      ((Path)localObject1).cubicTo(0.8F, 1.255856F, 1.255856F, 0.8F, 1.818182F, 0.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.179474F, 0.8F);
      ((Path)localObject1).cubicTo(22.741798F, 0.8F, 23.197655F, 1.255856F, 23.197655F, 1.818182F);
      ((Path)localObject1).lineTo(23.197655F, 5.903216F);
      ((Path)localObject1).lineTo(21.644531F, 5.903216F);
      ((Path)localObject1).lineTo(21.644531F, 2.363103F);
      ((Path)localObject1).lineTo(18.140741F, 2.363103F);
      ((Path)localObject1).lineTo(18.140741F, 0.8F);
      ((Path)localObject1).lineTo(22.179474F, 0.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(8.945455F, 0.8F);
      ((Path)localObject1).lineTo(15.054545F, 0.8F);
      ((Path)localObject1).lineTo(15.054545F, 2.327273F);
      ((Path)localObject1).lineTo(8.945455F, 2.327273F);
      ((Path)localObject1).lineTo(8.945455F, 0.8F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(0.8F, 8.942418F);
      ((Path)localObject1).lineTo(2.327273F, 8.942418F);
      ((Path)localObject1).lineTo(2.327273F, 15.037204F);
      ((Path)localObject1).lineTo(0.8F, 15.037204F);
      ((Path)localObject1).lineTo(0.8F, 8.942418F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(21.672728F, 8.945455F);
      ((Path)localObject1).lineTo(23.200001F, 8.945455F);
      ((Path)localObject1).lineTo(23.200001F, 15.04024F);
      ((Path)localObject1).lineTo(21.672728F, 15.04024F);
      ((Path)localObject1).lineTo(21.672728F, 8.945455F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(19.933332F, 21.803753F);
      ((Path)localObject1).lineTo(21.333334F, 21.803753F);
      ((Path)localObject1).cubicTo(21.333334F, 21.123686F, 20.843287F, 20.341965F, 20.238781F, 20.046276F);
      ((Path)localObject1).lineTo(14.677732F, 17.326132F);
      ((Path)localObject1).cubicTo(13.867833F, 16.929977F, 13.686909F, 16.053707F, 14.266088F, 15.365242F);
      ((Path)localObject1).lineTo(14.621279F, 14.943031F);
      ((Path)localObject1).cubicTo(15.341267F, 14.087189F, 15.929825F, 12.477825F, 15.929825F, 11.35559F);
      ((Path)localObject1).lineTo(15.929825F, 9.670945F);
      ((Path)localObject1).cubicTo(15.929825F, 7.496418F, 14.170382F, 5.73F, 12.0F, 5.73F);
      ((Path)localObject1).cubicTo(9.834034F, 5.73F, 8.070175F, 7.494144F, 8.070175F, 9.670327F);
      ((Path)localObject1).lineTo(8.070175F, 11.354709F);
      ((Path)localObject1).cubicTo(8.070175F, 12.478023F, 8.656032F, 14.082681F, 9.378721F, 14.941617F);
      ((Path)localObject1).lineTo(9.733912F, 15.36377F);
      ((Path)localObject1).cubicTo(10.316324F, 16.055984F, 10.128792F, 16.930117F, 9.322268F, 17.324785F);
      ((Path)localObject1).lineTo(3.761219F, 20.046053F);
      ((Path)localObject1).cubicTo(3.156078F, 20.342176F, 2.666667F, 21.128813F, 2.666667F, 21.803753F);
      ((Path)localObject1).lineTo(4.066667F, 21.803753F);
      ((Path)localObject1).cubicTo(4.066667F, 21.662615F, 4.252345F, 21.364357F, 4.376575F, 21.303566F);
      ((Path)localObject1).lineTo(9.937624F, 18.582296F);
      ((Path)localObject1).cubicTo(11.563402F, 17.786732F, 11.972694F, 15.85007F, 10.805171F, 14.462437F);
      ((Path)localObject1).lineTo(10.449981F, 14.040283F);
      ((Path)localObject1).cubicTo(9.939282F, 13.433305F, 9.470176F, 12.147727F, 9.470176F, 11.354709F);
      ((Path)localObject1).lineTo(9.470176F, 9.670327F);
      ((Path)localObject1).cubicTo(9.470176F, 8.268279F, 10.606301F, 7.13F, 12.0F, 7.13F);
      ((Path)localObject1).cubicTo(13.395499F, 7.13F, 14.529824F, 8.267933F, 14.529824F, 9.670945F);
      ((Path)localObject1).lineTo(14.529824F, 11.35559F);
      ((Path)localObject1).cubicTo(14.529824F, 12.146465F, 14.058701F, 13.437033F, 13.549958F, 14.04177F);
      ((Path)localObject1).lineTo(13.194768F, 14.463981F);
      ((Path)localObject1).cubicTo(12.029636F, 15.848961F, 12.434493F, 17.787378F, 14.062581F, 18.583744F);
      ((Path)localObject1).lineTo(19.623631F, 21.303888F);
      ((Path)localObject1).cubicTo(19.749414F, 21.365414F, 19.933332F, 21.660131F, 19.933332F, 21.803753F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(21.333334F, 21.803753F);
      ((Path)localObject1).cubicTo(21.333334F, 21.123686F, 20.843287F, 20.341965F, 20.238781F, 20.046276F);
      ((Path)localObject1).lineTo(14.677732F, 17.326132F);
      ((Path)localObject1).cubicTo(13.867833F, 16.929977F, 13.686909F, 16.053707F, 14.266088F, 15.365242F);
      ((Path)localObject1).lineTo(14.621279F, 14.943031F);
      ((Path)localObject1).cubicTo(15.341267F, 14.087189F, 15.929825F, 12.477825F, 15.929825F, 11.35559F);
      ((Path)localObject1).lineTo(15.929825F, 9.670945F);
      ((Path)localObject1).cubicTo(15.929825F, 7.496418F, 14.170382F, 5.73F, 12.0F, 5.73F);
      ((Path)localObject1).cubicTo(9.834034F, 5.73F, 8.070175F, 7.494144F, 8.070175F, 9.670327F);
      ((Path)localObject1).lineTo(8.070175F, 11.354709F);
      ((Path)localObject1).cubicTo(8.070175F, 12.478023F, 8.656032F, 14.082681F, 9.378721F, 14.941617F);
      ((Path)localObject1).lineTo(9.733912F, 15.36377F);
      ((Path)localObject1).cubicTo(10.316324F, 16.055984F, 10.128792F, 16.930117F, 9.322268F, 17.324785F);
      ((Path)localObject1).lineTo(3.761219F, 20.046053F);
      ((Path)localObject1).cubicTo(3.156078F, 20.342176F, 2.666667F, 21.128813F, 2.666667F, 21.803753F);
      ((Path)localObject1).lineTo(4.066667F, 21.803753F);
      ((Path)localObject1).cubicTo(4.066667F, 21.662615F, 4.252345F, 21.364357F, 4.376575F, 21.303566F);
      ((Path)localObject1).lineTo(9.937624F, 18.582296F);
      ((Path)localObject1).cubicTo(11.563402F, 17.786732F, 11.972694F, 15.85007F, 10.805171F, 14.462437F);
      ((Path)localObject1).lineTo(10.449981F, 14.040283F);
      ((Path)localObject1).cubicTo(9.939282F, 13.433305F, 9.470176F, 12.147727F, 9.470176F, 11.354709F);
      ((Path)localObject1).lineTo(9.470176F, 9.670327F);
      ((Path)localObject1).cubicTo(9.470176F, 8.268279F, 10.606301F, 7.13F, 12.0F, 7.13F);
      ((Path)localObject1).cubicTo(13.395499F, 7.13F, 14.529824F, 8.267933F, 14.529824F, 9.670945F);
      ((Path)localObject1).lineTo(14.529824F, 11.35559F);
      ((Path)localObject1).cubicTo(14.529824F, 12.146465F, 14.058701F, 13.437033F, 13.549958F, 14.04177F);
      ((Path)localObject1).lineTo(13.194768F, 14.463981F);
      ((Path)localObject1).cubicTo(12.029636F, 15.848961F, 12.434493F, 17.787378F, 14.062581F, 18.583744F);
      ((Path)localObject1).lineTo(19.623631F, 21.303888F);
      ((Path)localObject1).cubicTo(19.749414F, 21.365414F, 19.933332F, 21.660131F, 19.933332F, 21.803753F);
      ((Path)localObject1).lineTo(21.333334F, 21.803753F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.acj
 * JD-Core Version:    0.6.2
 */