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

public final class afh extends c
{
  private final int height = 93;
  private final int width = 93;

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
        paramInt = 93;
        continue;
        paramInt = 93;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(79.564964F, 14.00827F);
      ((Path)localObject4).cubicTo(98.378479F, 31.740889F, 98.378479F, 61.25771F, 79.564964F, 78.991447F);
      ((Path)localObject4).cubicTo(61.702847F, 97.669518F, 31.972158F, 97.669518F, 14.110418F, 78.991447F);
      ((Path)localObject4).cubicTo(-4.703473F, 61.25771F, -4.703473F, 31.740889F, 14.110418F, 14.00827F);
      ((Path)localObject4).cubicTo(31.970652F, -4.669423F, 61.702847F, -4.669423F, 79.564964F, 14.00827F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(87.011604F, 47.88731F);
      ((Path)localObject4).cubicTo(87.011604F, 25.044458F, 69.258606F, 7.65122F, 48.775578F, 7.65122F);
      ((Path)localObject4).cubicTo(25.459192F, 7.65122F, 7.707256F, 25.044458F, 7.707256F, 47.88731F);
      ((Path)localObject4).cubicTo(7.707256F, 67.955261F, 25.460253F, 85.348503F, 45.943279F, 85.348503F);
      ((Path)localObject4).cubicTo(69.258606F, 85.348503F, 87.011604F, 67.955261F, 87.011604F, 47.88731F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 29.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1.020108F, 10.956513F);
      ((Path)localObject2).lineTo(10.898551F, 10.956513F);
      ((Path)localObject2).lineTo(23.47826F, 41.739132F);
      ((Path)localObject2).lineTo(0.6186433F, 11.767624F);
      ((Path)localObject2).cubicTo(0.449533F, 11.545901F, 0.4921835F, 11.229069F, 0.7139061F, 11.059958F);
      ((Path)localObject2).cubicTo(0.801882F, 10.992858F, 0.9094632F, 10.956513F, 1.020108F, 10.956513F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(45.936413F, 10.956513F);
      ((Path)localObject2).lineTo(36.289856F, 10.956513F);
      ((Path)localObject2).lineTo(23.47826F, 41.739132F);
      ((Path)localObject2).lineTo(46.337879F, 11.767624F);
      ((Path)localObject2).cubicTo(46.506989F, 11.545901F, 46.464336F, 11.229069F, 46.242615F, 11.059958F);
      ((Path)localObject2).cubicTo(46.15464F, 10.992858F, 46.047058F, 10.956513F, 45.936413F, 10.956513F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(14.347826F, 10.956513F);
      ((Path)localObject2).lineTo(32.608696F, 10.956513F);
      ((Path)localObject2).lineTo(23.47826F, 41.739132F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(11.146245F, 7.826087F);
      ((Path)localObject2).lineTo(18.26087F, 0.0F);
      ((Path)localObject2).lineTo(10.837229F, -9.992007E-016F);
      ((Path)localObject2).cubicTo(10.729838F, -1.361002E-015F, 10.625245F, 0.03424085F, 10.538644F, 0.09774783F);
      ((Path)localObject2).lineTo(1.243732F, 6.914017F);
      ((Path)localObject2).cubicTo(1.018863F, 7.078921F, 0.9702516F, 7.394894F, 1.135155F, 7.619763F);
      ((Path)localObject2).cubicTo(1.230268F, 7.749461F, 1.381481F, 7.826087F, 1.542316F, 7.826087F);
      ((Path)localObject2).lineTo(11.146245F, 7.826087F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(20.869566F, 0.0F);
      ((Path)localObject2).lineTo(26.086956F, 0.0F);
      ((Path)localObject2).lineTo(32.608696F, 7.826087F);
      ((Path)localObject2).lineTo(14.347826F, 7.826087F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(36.323608F, 7.826087F);
      ((Path)localObject3).lineTo(28.695652F, 0.0F);
      ((Path)localObject3).lineTo(36.386032F, 1.221245E-015F);
      ((Path)localObject3).cubicTo(36.495541F, 1.241362E-015F, 36.602081F, 0.035604F, 36.68959F, 0.1014433F);
      ((Path)localObject3).lineTo(45.749187F, 6.917713F);
      ((Path)localObject3).cubicTo(45.972015F, 7.085364F, 46.016747F, 7.40191F, 45.849094F, 7.624738F);
      ((Path)localObject3).cubicTo(45.753708F, 7.751515F, 45.604282F, 7.826087F, 45.445629F, 7.826087F);
      ((Path)localObject3).lineTo(36.323608F, 7.826087F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afh
 * JD-Core Version:    0.6.2
 */