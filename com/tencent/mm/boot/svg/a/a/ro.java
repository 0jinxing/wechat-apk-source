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

public final class ro extends c
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
      ((Paint)localObject3).setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 10.5F, 0.0F, 1.0F, 10.5F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(13.207434F, 11.899989F);
      ((Path)localObject2).lineTo(16.050671F, 59.66637F);
      ((Path)localObject2).cubicTo(16.138716F, 61.145535F, 17.363943F, 62.299999F, 18.845724F, 62.299999F);
      ((Path)localObject2).lineTo(44.154278F, 62.299999F);
      ((Path)localObject2).cubicTo(45.636055F, 62.299999F, 46.861286F, 61.145535F, 46.949329F, 59.66637F);
      ((Path)localObject2).lineTo(49.792564F, 11.899989F);
      ((Path)localObject2).lineTo(13.207434F, 11.899989F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(8.75F, 7.699989F);
      ((Path)localObject2).lineTo(54.25F, 7.699989F);
      ((Path)localObject2).lineTo(51.141911F, 59.915932F);
      ((Path)localObject2).cubicTo(50.921795F, 63.613834F, 47.858727F, 66.5F, 44.154278F, 66.5F);
      ((Path)localObject2).lineTo(18.845724F, 66.5F);
      ((Path)localObject2).cubicTo(15.141274F, 66.5F, 12.078204F, 63.613834F, 11.858091F, 59.915932F);
      ((Path)localObject2).lineTo(8.75F, 7.699989F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(3.5F, 7.699989F);
      ((Path)localObject2).lineTo(59.5F, 7.699989F);
      ((Path)localObject2).cubicTo(60.466499F, 7.699989F, 61.25F, 8.483491F, 61.25F, 9.449989F);
      ((Path)localObject2).lineTo(61.25F, 11.899989F);
      ((Path)localObject2).lineTo(1.75F, 11.899989F);
      ((Path)localObject2).lineTo(1.75F, 9.449989F);
      ((Path)localObject2).cubicTo(1.75F, 8.483491F, 2.533502F, 7.699989F, 3.5F, 7.699989F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(38.5F, 9.549949E-005F);
      ((Path)localObject2).cubicTo(39.466499F, 9.549949E-005F, 40.25F, 0.7835972F, 40.25F, 1.750096F);
      ((Path)localObject2).lineTo(40.25F, 4.200085F);
      ((Path)localObject2).lineTo(22.75F, 4.200085F);
      ((Path)localObject2).lineTo(22.75F, 1.750096F);
      ((Path)localObject2).cubicTo(22.75F, 0.7835972F, 23.533503F, 9.549949E-005F, 24.5F, 9.549949E-005F);
      ((Path)localObject2).lineTo(38.5F, 9.549949E-005F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(22.75F, 21.0F);
      ((Path)localObject2).lineTo(26.950043F, 21.0F);
      ((Path)localObject2).lineTo(28.700043F, 52.5F);
      ((Path)localObject2).lineTo(24.5F, 52.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(36.049957F, 21.0F);
      ((Path)localObject3).lineTo(40.25F, 21.0F);
      ((Path)localObject3).lineTo(38.5F, 52.5F);
      ((Path)localObject3).lineTo(34.299957F, 52.5F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ro
 * JD-Core Version:    0.6.2
 */