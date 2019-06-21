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

public final class qr extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject1 = c.k(paramArrayOfObject);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject1, paramArrayOfObject);
      localPaint.setColor(-352965);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 12.0F);
      ((Path)localObject2).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject2).lineTo(108.0F, 0.0F);
      ((Path)localObject2).cubicTo(114.62742F, 0.0F, 120.0F, 5.372582F, 120.0F, 12.0F);
      ((Path)localObject2).lineTo(120.0F, 108.0F);
      ((Path)localObject2).cubicTo(120.0F, 114.62742F, 114.62742F, 120.0F, 108.0F, 120.0F);
      ((Path)localObject2).lineTo(12.0F, 120.0F);
      ((Path)localObject2).cubicTo(5.372582F, 120.0F, 0.0F, 114.62742F, 0.0F, 108.0F);
      ((Path)localObject2).lineTo(0.0F, 12.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(84.212898F, 73.166664F);
      ((Path)localObject1).lineTo(77.898056F, 73.166664F);
      ((Path)localObject1).lineTo(77.898056F, 76.333336F);
      ((Path)localObject1).lineTo(84.212898F, 76.333336F);
      ((Path)localObject1).lineTo(84.212898F, 82.666664F);
      ((Path)localObject1).lineTo(87.370316F, 82.666664F);
      ((Path)localObject1).lineTo(87.370316F, 76.333336F);
      ((Path)localObject1).lineTo(93.685158F, 76.333336F);
      ((Path)localObject1).lineTo(93.685158F, 73.166664F);
      ((Path)localObject1).lineTo(87.370316F, 73.166664F);
      ((Path)localObject1).lineTo(87.370316F, 66.833336F);
      ((Path)localObject1).lineTo(84.212898F, 66.833336F);
      ((Path)localObject1).lineTo(84.212898F, 73.166664F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(67.423714F, 70.079285F);
      ((Path)localObject1).cubicTo(67.047142F, 71.573563F, 66.847084F, 73.138344F, 66.847084F, 74.75F);
      ((Path)localObject1).cubicTo(66.847084F, 80.424889F, 69.327522F, 85.518562F, 73.260406F, 89.0F);
      ((Path)localObject1).lineTo(30.74431F, 89.0F);
      ((Path)localObject1).cubicTo(28.998022F, 89.0F, 27.783651F, 87.600479F, 28.032288F, 85.871628F);
      ((Path)localObject1).lineTo(28.33345F, 83.777542F);
      ((Path)localObject1).cubicTo(28.638906F, 81.65361F, 30.436558F, 79.121124F, 32.358017F, 78.116165F);
      ((Path)localObject1).lineTo(49.048275F, 69.386848F);
      ((Path)localObject1).cubicTo(51.598251F, 68.053162F, 52.127117F, 65.226555F, 50.227116F, 63.070702F);
      ((Path)localObject1).lineTo(48.833565F, 61.489502F);
      ((Path)localObject1).cubicTo(46.460281F, 58.796635F, 44.53635F, 53.717762F, 44.53635F, 50.146694F);
      ((Path)localObject1).lineTo(44.53635F, 44.955544F);
      ((Path)localObject1).cubicTo(44.53635F, 37.800396F, 50.373653F, 32.0F, 57.577869F, 32.0F);
      ((Path)localObject1).cubicTo(64.780502F, 32.0F, 70.619392F, 37.801922F, 70.619392F, 44.955544F);
      ((Path)localObject1).lineTo(70.619392F, 50.146694F);
      ((Path)localObject1).cubicTo(70.619392F, 53.718288F, 68.694504F, 58.798832F, 66.322174F, 61.491985F);
      ((Path)localObject1).lineTo(64.928627F, 63.073994F);
      ((Path)localObject1).cubicTo(63.029705F, 65.229713F, 63.560341F, 68.059486F, 66.107468F, 69.391144F);
      ((Path)localObject1).lineTo(67.423714F, 70.079285F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(71.583214F, 74.751289F);
      ((Path)localObject1).cubicTo(71.583214F, 66.880272F, 77.944855F, 60.5F, 85.791611F, 60.5F);
      ((Path)localObject1).cubicTo(93.639648F, 60.5F, 100.0F, 66.880272F, 100.0F, 74.751289F);
      ((Path)localObject1).cubicTo(100.0F, 82.621025F, 93.639648F, 89.0F, 85.791611F, 89.0F);
      ((Path)localObject1).cubicTo(78.662689F, 89.0F, 72.759598F, 83.734764F, 71.739204F, 76.869942F);
      ((Path)localObject1).cubicTo(71.636452F, 76.178696F, 71.583214F, 75.47123F, 71.583214F, 74.751289F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qr
 * JD-Core Version:    0.6.2
 */