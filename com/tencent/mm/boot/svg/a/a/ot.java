package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class ot extends c
{
  private final int height = 62;
  private final int width = 62;

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
        paramInt = 62;
        continue;
        paramInt = 62;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(3.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 9.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(11.007507F, 11.458933F);
      ((Path)localObject2).cubicTo(12.887484F, 9.443707F, 15.622662F, 7.924733F, 18.017488F, 7.399972F);
      ((Path)localObject2).lineTo(20.244202F, 6.912049F);
      ((Path)localObject2).lineTo(18.915043F, 5.060115F);
      ((Path)localObject2).cubicTo(18.642044F, 4.679744F, 18.492981F, 4.223123F, 18.492981F, 3.739131F);
      ((Path)localObject2).cubicTo(18.492981F, 2.498301F, 19.479156F, 1.5F, 20.686369F, 1.5F);
      ((Path)localObject2).cubicTo(21.893581F, 1.5F, 22.879757F, 2.498301F, 22.879757F, 3.739131F);
      ((Path)localObject2).cubicTo(22.879757F, 4.223123F, 22.730694F, 4.679744F, 22.457695F, 5.060115F);
      ((Path)localObject2).lineTo(21.128536F, 6.912049F);
      ((Path)localObject2).lineTo(23.355251F, 7.399972F);
      ((Path)localObject2).cubicTo(29.377106F, 8.719497F, 33.488411F, 13.843313F, 33.958382F, 24.302568F);
      ((Path)localObject2).cubicTo(33.769905F, 28.412003F, 34.089592F, 31.934727F, 34.821133F, 34.914059F);
      ((Path)localObject2).lineTo(28.334389F, 28.619492F);
      ((Path)localObject2).cubicTo(28.294184F, 28.580555F, 28.294184F, 28.580555F, 28.10701F, 28.399086F);
      ((Path)localObject2).cubicTo(27.850748F, 28.150501F, 27.707758F, 28.011713F, 27.466179F, 27.777033F);
      ((Path)localObject2).cubicTo(26.775806F, 27.106375F, 26.006472F, 26.357574F, 25.177935F, 25.549345F);
      ((Path)localObject2).cubicTo(22.810862F, 23.240292F, 20.443871F, 20.917908F, 18.235228F, 18.732124F);
      ((Path)localObject2).cubicTo(18.065439F, 18.564066F, 18.065439F, 18.564066F, 17.895714F, 18.39596F);
      ((Path)localObject2).cubicTo(15.029206F, 15.556324F, 12.680043F, 13.193508F, 11.007507F, 11.458933F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1.5F, 42.5F);
      ((Path)localObject2).lineTo(1.5F, 41.82444F);
      ((Path)localObject2).cubicTo(1.6039F, 41.747021F, 1.712385F, 41.662033F, 1.824915F, 41.569111F);
      ((Path)localObject2).cubicTo(2.597934F, 40.930805F, 3.355864F, 40.077148F, 4.050289F, 38.981941F);
      ((Path)localObject2).cubicTo(6.195145F, 35.59919F, 7.333091F, 30.618256F, 7.015051F, 23.757542F);
      ((Path)localObject2).cubicTo(7.107518F, 21.681265F, 7.245246F, 20.084749F, 7.466496F, 18.886692F);
      ((Path)localObject2).cubicTo(14.170897F, 26.232531F, 20.274372F, 32.613899F, 25.684317F, 38.023556F);
      ((Path)localObject2).cubicTo(27.371628F, 39.710777F, 28.891684F, 41.203136F, 30.23632F, 42.5F);
      ((Path)localObject2).lineTo(1.5F, 42.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11776948);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.ROUND);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(5.345455F, 6.345455F);
      ((Path)localObject3).lineTo(42.115005F, 43.115005F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ot
 * JD-Core Version:    0.6.2
 */