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

public final class axh extends c
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
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Object localObject5 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject5).setColor(0);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 0.0F);
      ((Path)localObject4).lineTo(96.0F, 0.0F);
      ((Path)localObject4).lineTo(96.0F, 96.0F);
      ((Path)localObject4).lineTo(0.0F, 96.0F);
      ((Path)localObject4).lineTo(0.0F, 0.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject5);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-499359);
      localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(27.0F, 0.0F);
      ((Path)localObject5).cubicTo(41.91169F, 0.0F, 54.0F, 12.088311F, 54.0F, 27.0F);
      ((Path)localObject5).cubicTo(54.0F, 41.91169F, 41.91169F, 54.0F, 27.0F, 54.0F);
      ((Path)localObject5).cubicTo(12.088311F, 54.0F, 0.0F, 41.91169F, 0.0F, 27.0F);
      ((Path)localObject5).cubicTo(0.0F, 12.088311F, 12.088311F, 0.0F, 27.0F, 0.0F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.0F, 24.0F);
      ((Path)localObject1).cubicTo(4.656855F, 24.0F, 6.0F, 25.343145F, 6.0F, 27.0F);
      ((Path)localObject1).cubicTo(6.0F, 28.656855F, 4.656855F, 30.0F, 3.0F, 30.0F);
      ((Path)localObject1).cubicTo(1.343146F, 30.0F, 0.0F, 28.656855F, 0.0F, 27.0F);
      ((Path)localObject1).cubicTo(0.0F, 25.343145F, 1.343146F, 24.0F, 3.0F, 24.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.4947526F, 0.0F);
      ((Path)localObject3).lineTo(5.494752F, 0.0F);
      ((Path)localObject3).lineTo(4.709599F, 20.212122F);
      ((Path)localObject3).lineTo(1.32902F, 20.212122F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.axh
 * JD-Core Version:    0.6.2
 */