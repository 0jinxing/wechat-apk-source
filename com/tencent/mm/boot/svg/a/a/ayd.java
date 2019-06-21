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

public final class ayd extends c
{
  private final int height = 66;
  private final int width = 66;

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
        paramInt = 66;
        continue;
        paramInt = 66;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(arrayOfFloat, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(10.285F, 0.0F);
      ((Path)localObject1).cubicTo(9.692F, 0.139F, 9.13F, 0.44F, 8.668F, 0.902F);
      ((Path)localObject1).lineTo(8.503F, 1.066F);
      ((Path)localObject1).lineTo(0.018F, 9.551F);
      ((Path)localObject1).lineTo(2.732F, 12.268F);
      ((Path)localObject1).lineTo(9.193F, 5.807F);
      ((Path)localObject1).lineTo(9.193F, 34.219002F);
      ((Path)localObject1).lineTo(13.033F, 34.219002F);
      ((Path)localObject1).lineTo(13.033F, 5.702F);
      ((Path)localObject1).lineTo(19.764F, 12.432F);
      ((Path)localObject1).lineTo(22.375F, 9.821F);
      ((Path)localObject1).lineTo(13.455F, 0.902F);
      ((Path)localObject1).cubicTo(12.992F, 0.44F, 12.43F, 0.139F, 11.838F, 0.0F);
      ((Path)localObject1).lineTo(10.285F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(48.0F, 57.09F);
      ((Path)localObject2).lineTo(48.0F, 17.065001F);
      ((Path)localObject2).cubicTo(48.0F, 15.372F, 46.563F, 14.0F, 44.803001F, 14.0F);
      ((Path)localObject2).lineTo(38.400002F, 14.0F);
      ((Path)localObject2).lineTo(38.400002F, 17.9F);
      ((Path)localObject2).lineTo(44.099998F, 17.9F);
      ((Path)localObject2).lineTo(44.099998F, 56.254002F);
      ((Path)localObject2).lineTo(3.9F, 56.254002F);
      ((Path)localObject2).lineTo(3.9F, 17.9F);
      ((Path)localObject2).lineTo(9.6F, 17.9F);
      ((Path)localObject2).lineTo(9.6F, 14.0F);
      ((Path)localObject2).lineTo(3.197F, 14.0F);
      ((Path)localObject2).cubicTo(1.432F, 14.0F, 0.0F, 15.382F, 0.0F, 17.065001F);
      ((Path)localObject2).lineTo(0.0F, 57.09F);
      ((Path)localObject2).cubicTo(0.0F, 58.782001F, 1.437F, 60.153999F, 3.187F, 60.153999F);
      ((Path)localObject2).lineTo(44.813F, 60.153999F);
      ((Path)localObject2).cubicTo(46.573002F, 60.153999F, 48.0F, 58.773998F, 48.0F, 57.09F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayd
 * JD-Core Version:    0.6.2
 */