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

public final class zw extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.09246E-013F, 10.001411F);
      ((Path)localObject1).cubicTo(1.09246E-013F, 11.291607F, 0.244537F, 12.524043F, 0.6886041F, 13.655964F);
      ((Path)localObject1).lineTo(6.844035F, 7.501284F);
      ((Path)localObject1).lineTo(0.3150476F, 7.501284F);
      ((Path)localObject1).cubicTo(0.1095166F, 8.300155F, 1.09246E-013F, 9.138031F, 1.09246E-013F, 10.001411F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(18.618263F, 4.920744F);
      ((Path)localObject2).cubicTo(17.552353F, 3.117471F, 15.936609F, 1.677254F, 14.002067F, 0.8318757F);
      ((Path)localObject2).lineTo(14.002067F, 8.621803F);
      ((Path)localObject2).cubicTo(14.335116F, 8.558794F, 14.677918F, 8.524288F, 15.026721F, 8.512286F);
      ((Path)localObject2).lineTo(18.618263F, 4.920744F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(12.501915F, 0.3150476F);
      ((Path)localObject1).cubicTo(11.703044F, 0.1095166F, 10.865168F, -1.212364E-013F, 10.001787F, -1.212364E-013F);
      ((Path)localObject1).cubicTo(8.711592F, -1.212364E-013F, 7.478406F, 0.2437868F, 6.346484F, 0.6886041F);
      ((Path)localObject1).lineTo(12.501915F, 6.844035F);
      ((Path)localObject1).lineTo(12.501915F, 0.3150476F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(4.920819F, 1.384709F);
      ((Path)localObject2).cubicTo(3.117546F, 2.45062F, 1.677329F, 4.066365F, 0.8319507F, 6.000907F);
      ((Path)localObject2).lineTo(9.537017F, 6.000907F);
      ((Path)localObject2).lineTo(4.920819F, 1.384709F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(6.000907F, 19.170723F);
      ((Path)localObject1).lineTo(6.000907F, 10.465657F);
      ((Path)localObject1).lineTo(1.384709F, 15.081855F);
      ((Path)localObject1).cubicTo(2.45062F, 16.885878F, 4.066365F, 18.325344F, 6.000907F, 19.170723F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(20.003048F, 10.001411F);
      ((Path)localObject1).cubicTo(20.003048F, 8.711217F, 19.758511F, 7.47878F, 19.314444F, 6.34686F);
      ((Path)localObject1).lineTo(16.938835F, 8.721718F);
      ((Path)localObject1).cubicTo(18.101511F, 9.021764F, 19.144169F, 9.617353F, 19.976044F, 10.432727F);
      ((Path)localObject1).cubicTo(19.982046F, 10.287955F, 20.003048F, 10.147684F, 20.003048F, 10.001411F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(8.584898F, 14.242553F);
      ((Path)localObject2).lineTo(7.500984F, 13.158639F);
      ((Path)localObject2).lineTo(7.500984F, 19.687626F);
      ((Path)localObject2).cubicTo(8.300605F, 19.893908F, 9.138481F, 20.002674F, 10.001862F, 20.002674F);
      ((Path)localObject2).cubicTo(10.148884F, 20.002674F, 10.292906F, 19.98842F, 10.439178F, 19.98242F);
      ((Path)localObject2).cubicTo(9.241997F, 18.764236F, 8.501635F, 17.095234F, 8.501635F, 15.252206F);
      ((Path)localObject2).cubicTo(8.501635F, 14.907904F, 8.53539F, 14.572602F, 8.584898F, 14.242553F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(15.839395F, 15.252206F);
      ((Path)localObject3).lineTo(17.502396F, 13.589204F);
      ((Path)localObject3).lineTo(16.915808F, 13.001865F);
      ((Path)localObject3).lineTo(15.252055F, 14.664866F);
      ((Path)localObject3).lineTo(13.589054F, 13.001865F);
      ((Path)localObject3).lineTo(13.001716F, 13.589204F);
      ((Path)localObject3).lineTo(14.665466F, 15.252206F);
      ((Path)localObject3).lineTo(13.001716F, 16.915207F);
      ((Path)localObject3).lineTo(13.589054F, 17.502546F);
      ((Path)localObject3).lineTo(15.252055F, 15.839544F);
      ((Path)localObject3).lineTo(16.915808F, 17.502546F);
      ((Path)localObject3).lineTo(17.502396F, 16.915207F);
      ((Path)localObject3).lineTo(15.839395F, 15.252206F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(15.252055F, 20.253212F);
      ((Path)localObject3).cubicTo(12.490138F, 20.253212F, 10.2518F, 18.014122F, 10.2518F, 15.252206F);
      ((Path)localObject3).cubicTo(10.2518F, 12.490288F, 12.490138F, 10.2512F, 15.252055F, 10.2512F);
      ((Path)localObject3).cubicTo(18.013973F, 10.2512F, 20.253061F, 12.490288F, 20.253061F, 15.252206F);
      ((Path)localObject3).cubicTo(20.253061F, 18.014122F, 18.013973F, 20.253212F, 15.252055F, 20.253212F);
      ((Path)localObject3).lineTo(15.252055F, 20.253212F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zw
 * JD-Core Version:    0.6.2
 */