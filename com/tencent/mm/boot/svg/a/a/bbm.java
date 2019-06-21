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

public final class bbm extends c
{
  private final int height = 16;
  private final int width = 12;

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
        paramInt = 12;
        continue;
        paramInt = 16;
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
      ((Paint)localObject3).setColor(-5066062);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -396.0F, 0.0F, 1.0F, -671.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 66.0F, 0.0F, 1.0F, 602.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 327.0F, 0.0F, 1.0F, 68.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 1.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.9F, 4.65F);
      ((Path)localObject2).lineTo(0.9F, 13.506087F);
      ((Path)localObject2).cubicTo(0.9F, 13.833202F, 1.166941F, 14.1F, 1.495545F, 14.1F);
      ((Path)localObject2).lineTo(10.504455F, 14.1F);
      ((Path)localObject2).cubicTo(10.832851F, 14.1F, 11.1F, 13.833303F, 11.1F, 13.506087F);
      ((Path)localObject2).lineTo(11.1F, 4.65F);
      ((Path)localObject2).lineTo(0.9F, 4.65F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 4.505613F);
      ((Path)localObject2).cubicTo(0.0F, 4.088299F, 0.3334732F, 3.75F, 0.7506537F, 3.75F);
      ((Path)localObject2).lineTo(11.249347F, 3.75F);
      ((Path)localObject2).cubicTo(11.663921F, 3.75F, 12.0F, 4.08669F, 12.0F, 4.505613F);
      ((Path)localObject2).lineTo(12.0F, 13.506087F);
      ((Path)localObject2).cubicTo(12.0F, 14.331152F, 11.329115F, 15.0F, 10.504455F, 15.0F);
      ((Path)localObject2).lineTo(1.495545F, 15.0F);
      ((Path)localObject2).cubicTo(0.6695784F, 15.0F, 0.0F, 14.329952F, 0.0F, 13.506087F);
      ((Path)localObject2).lineTo(0.0F, 4.505613F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(3.0F, 3.0F);
      ((Path)localObject3).cubicTo(3.0F, 1.343146F, 4.343146F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject3).cubicTo(7.656854F, 0.0F, 9.0F, 1.343146F, 9.0F, 3.0F);
      ((Path)localObject3).lineTo(8.999999F, 6.75F);
      ((Path)localObject3).lineTo(8.099999F, 6.75F);
      ((Path)localObject3).lineTo(8.099999F, 3.0F);
      ((Path)localObject3).cubicTo(8.099998F, 1.8402F, 7.159796F, 0.8999977F, 5.999998F, 0.8999977F);
      ((Path)localObject3).cubicTo(4.8402F, 0.8999977F, 3.899998F, 1.8402F, 3.899998F, 2.999998F);
      ((Path)localObject3).lineTo(3.9F, 6.75F);
      ((Path)localObject3).lineTo(3.0F, 6.75F);
      ((Path)localObject3).lineTo(3.0F, 3.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bbm
 * JD-Core Version:    0.6.2
 */