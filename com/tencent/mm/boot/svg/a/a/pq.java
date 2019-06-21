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

public final class pq extends c
{
  private final int height = 292;
  private final int width = 378;

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
        paramInt = 378;
        continue;
        paramInt = 292;
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
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-13158344);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(14.0F, 226.0F);
      ((Path)localObject3).lineTo(360.0F, 226.0F);
      ((Path)localObject3).lineTo(360.0F, 14.0F);
      ((Path)localObject3).lineTo(14.0F, 14.0F);
      ((Path)localObject3).lineTo(14.0F, 226.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(13.0F, 227.0F);
      ((Path)localObject3).lineTo(361.0F, 227.0F);
      ((Path)localObject3).lineTo(361.0F, 13.0F);
      ((Path)localObject3).lineTo(13.0F, 13.0F);
      ((Path)localObject3).lineTo(13.0F, 227.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(371.00021F, 225.99319F);
      ((Path)localObject3).cubicTo(371.00021F, 232.06219F, 366.0632F, 237.0002F, 359.99319F, 237.0002F);
      ((Path)localObject3).lineTo(206.0002F, 237.0002F);
      ((Path)localObject3).lineTo(206.0002F, 237.0002F);
      ((Path)localObject3).lineTo(168.0002F, 237.0002F);
      ((Path)localObject3).lineTo(168.0002F, 237.0002F);
      ((Path)localObject3).lineTo(14.0062F, 237.0002F);
      ((Path)localObject3).cubicTo(7.9382F, 237.0002F, 3.0002F, 232.06219F, 3.0002F, 225.99319F);
      ((Path)localObject3).lineTo(3.0002F, 14.0072F);
      ((Path)localObject3).cubicTo(3.0002F, 7.9372F, 7.9382F, 3.0002F, 14.0062F, 3.0002F);
      ((Path)localObject3).lineTo(359.99319F, 3.0002F);
      ((Path)localObject3).cubicTo(366.0632F, 3.0002F, 371.00021F, 7.9372F, 371.00021F, 14.0072F);
      ((Path)localObject3).lineTo(371.00021F, 225.99319F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(256.00021F, 278.73019F);
      ((Path)localObject3).lineTo(256.00021F, 284.00021F);
      ((Path)localObject3).lineTo(118.0002F, 284.00021F);
      ((Path)localObject3).lineTo(118.0002F, 278.73019F);
      ((Path)localObject3).lineTo(171.0002F, 273.73019F);
      ((Path)localObject3).lineTo(171.0002F, 240.0002F);
      ((Path)localObject3).lineTo(203.0002F, 240.0002F);
      ((Path)localObject3).lineTo(203.0002F, 273.73019F);
      ((Path)localObject3).lineTo(256.00021F, 278.73019F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(359.99319F, 0.0002F);
      ((Path)localObject3).lineTo(14.0072F, 0.0002F);
      ((Path)localObject3).cubicTo(6.2762F, 0.0002F, 0.0002F, 6.2712F, 0.0002F, 14.0072F);
      ((Path)localObject3).lineTo(0.0002F, 225.99319F);
      ((Path)localObject3).cubicTo(0.0002F, 233.73421F, 6.2712F, 240.0002F, 14.0072F, 240.0002F);
      ((Path)localObject3).lineTo(168.0002F, 240.0002F);
      ((Path)localObject3).lineTo(168.0002F, 271.00021F);
      ((Path)localObject3).lineTo(115.0002F, 276.00021F);
      ((Path)localObject3).lineTo(115.0002F, 287.00021F);
      ((Path)localObject3).lineTo(259.00021F, 287.00021F);
      ((Path)localObject3).lineTo(259.00021F, 276.00021F);
      ((Path)localObject3).lineTo(206.0002F, 271.00021F);
      ((Path)localObject3).lineTo(206.0002F, 240.0002F);
      ((Path)localObject3).lineTo(359.99319F, 240.0002F);
      ((Path)localObject3).cubicTo(367.72421F, 240.0002F, 374.00021F, 233.7292F, 374.00021F, 225.99319F);
      ((Path)localObject3).lineTo(374.00021F, 14.0072F);
      ((Path)localObject3).cubicTo(374.00021F, 6.2652F, 367.72919F, 0.0002F, 359.99319F, 0.0002F);
      ((Path)localObject3).lineTo(359.99319F, 0.0002F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 166.0F, 0.0F, 1.0F, 93.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(43.0895F, 21.969101F);
      ((Path)localObject2).lineTo(43.0895F, 49.967098F);
      ((Path)localObject2).lineTo(3.0895F, 49.965099F);
      ((Path)localObject2).lineTo(3.0895F, 21.969101F);
      ((Path)localObject2).lineTo(3.0905F, 21.9671F);
      ((Path)localObject2).lineTo(8.9995F, 21.9671F);
      ((Path)localObject2).lineTo(8.9995F, 18.9671F);
      ((Path)localObject2).lineTo(3.0905F, 18.9671F);
      ((Path)localObject2).cubicTo(1.4415F, 18.9671F, 0.0895F, 20.3111F, 0.0895F, 21.969101F);
      ((Path)localObject2).lineTo(0.0895F, 49.965099F);
      ((Path)localObject2).cubicTo(0.0895F, 51.6241F, 1.4335F, 52.967098F, 3.0905F, 52.967098F);
      ((Path)localObject2).lineTo(43.0895F, 52.967098F);
      ((Path)localObject2).cubicTo(44.738499F, 52.967098F, 46.0895F, 51.6231F, 46.0895F, 49.965099F);
      ((Path)localObject2).lineTo(46.0895F, 21.969101F);
      ((Path)localObject2).cubicTo(46.0895F, 20.310101F, 44.746498F, 18.9671F, 43.0895F, 18.9671F);
      ((Path)localObject2).lineTo(36.9995F, 18.9671F);
      ((Path)localObject2).lineTo(36.9995F, 21.969101F);
      ((Path)localObject2).lineTo(43.0895F, 21.969101F);
      ((Path)localObject2).lineTo(43.0895F, 21.969101F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(12.0F, 19.0F);
      ((Path)localObject2).lineTo(34.0F, 19.0F);
      ((Path)localObject2).lineTo(34.0F, 18.966999F);
      ((Path)localObject2).lineTo(12.0F, 18.966999F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(9.0F, 13.4978F);
      ((Path)localObject2).lineTo(9.0F, 18.966801F);
      ((Path)localObject2).lineTo(12.0F, 18.966801F);
      ((Path)localObject2).lineTo(12.0F, 13.4978F);
      ((Path)localObject2).cubicTo(12.0F, 7.7088F, 16.714001F, 3.0008F, 22.507999F, 3.0008F);
      ((Path)localObject2).lineTo(23.492001F, 3.0008F);
      ((Path)localObject2).cubicTo(29.285999F, 3.0008F, 34.0F, 7.7088F, 34.0F, 13.4978F);
      ((Path)localObject2).lineTo(34.0F, 18.966801F);
      ((Path)localObject2).lineTo(37.0F, 18.966801F);
      ((Path)localObject2).lineTo(37.0F, 13.4978F);
      ((Path)localObject2).cubicTo(37.0F, 6.0438F, 30.952F, -0.0002F, 23.492001F, -0.0002F);
      ((Path)localObject2).lineTo(22.507999F, -0.0002F);
      ((Path)localObject2).cubicTo(15.041F, -0.0002F, 9.0F, 6.0428F, 9.0F, 13.4978F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(37.0F, 22.0F);
      ((Path)localObject2).lineTo(37.0F, 21.969F);
      ((Path)localObject2).lineTo(9.0F, 21.966999F);
      ((Path)localObject2).lineTo(9.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(33.999699F, 19.000299F);
      ((Path)localObject4).lineTo(11.9997F, 19.000299F);
      ((Path)localObject4).lineTo(11.9997F, 18.9673F);
      ((Path)localObject4).lineTo(8.9997F, 18.9673F);
      ((Path)localObject4).lineTo(8.9997F, 21.9673F);
      ((Path)localObject4).lineTo(36.999699F, 21.9683F);
      ((Path)localObject4).lineTo(36.999699F, 18.9673F);
      ((Path)localObject4).lineTo(33.999699F, 18.9673F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.pq
 * JD-Core Version:    0.6.2
 */