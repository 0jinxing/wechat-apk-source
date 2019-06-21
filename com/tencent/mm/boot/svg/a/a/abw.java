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

public final class abw extends c
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
      ((Paint)localObject3).setColor(-16777216);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-436207616);
      localObject4 = c.a((float[])localObject4, 1.0F, 0.0F, 0.666667F, 0.0F, 1.0F, 0.666667F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(15.042786F, 26.556795F);
      ((Path)localObject2).cubicTo(14.482807F, 26.629278F, 13.912225F, 26.666666F, 13.333333F, 26.666666F);
      ((Path)localObject2).cubicTo(6.0F, 26.666666F, 3.055334E-013F, 20.666666F, 3.055334E-013F, 13.333333F);
      ((Path)localObject2).cubicTo(3.055334E-013F, 6.0F, 6.0F, 7.81597E-014F, 13.333333F, 7.81597E-014F);
      ((Path)localObject2).cubicTo(20.666666F, 7.81597E-014F, 26.666666F, 6.0F, 26.666666F, 13.333333F);
      ((Path)localObject2).cubicTo(26.666666F, 13.912228F, 26.629278F, 14.482814F, 26.556795F, 15.042795F);
      ((Path)localObject2).cubicTo(26.14332F, 14.557369F, 25.674034F, 14.120941F, 25.158861F, 13.743438F);
      ((Path)localObject2).cubicTo(25.173752F, 13.607915F, 25.187466F, 13.471213F, 25.200001F, 13.333333F);
      ((Path)localObject2).cubicTo(25.200001F, 12.133333F, 24.933332F, 11.066667F, 24.666666F, 10.0F);
      ((Path)localObject2).lineTo(22.268461F, 12.398205F);
      ((Path)localObject2).cubicTo(21.648937F, 12.247915F, 21.001806F, 12.168266F, 20.336073F, 12.168266F);
      ((Path)localObject2).cubicTo(20.266241F, 12.168266F, 20.196613F, 12.169143F, 20.127199F, 12.170885F);
      ((Path)localObject2).lineTo(24.0F, 8.4F);
      ((Path)localObject2).cubicTo(22.933332F, 6.133333F, 21.066668F, 4.266667F, 18.933332F, 3.066667F);
      ((Path)localObject2).lineTo(18.933332F, 12.28827F);
      ((Path)localObject2).cubicTo(18.364773F, 12.386687F, 17.816366F, 12.543894F, 17.294598F, 12.753404F);
      ((Path)localObject2).cubicTo(17.027021F, 10.777587F, 15.40237F, 9.333333F, 13.333333F, 9.333333F);
      ((Path)localObject2).cubicTo(11.066667F, 9.333333F, 9.333333F, 11.066667F, 9.333333F, 13.333333F);
      ((Path)localObject2).cubicTo(9.333333F, 14.4F, 9.733334F, 15.466667F, 10.533333F, 16.133333F);
      ((Path)localObject2).cubicTo(11.078894F, 16.788006F, 11.892327F, 17.174807F, 12.754421F, 17.293734F);
      ((Path)localObject2).cubicTo(12.396258F, 18.185688F, 12.190891F, 19.155483F, 12.170711F, 20.17071F);
      ((Path)localObject2).lineTo(9.333333F, 17.333334F);
      ((Path)localObject2).lineTo(9.333333F, 24.4F);
      ((Path)localObject2).cubicTo(10.533333F, 24.799999F, 11.866667F, 25.066668F, 13.333333F, 25.200001F);
      ((Path)localObject2).cubicTo(13.479334F, 25.200001F, 13.623361F, 25.196053F, 13.765654F, 25.188639F);
      ((Path)localObject2).cubicTo(14.138001F, 25.692125F, 14.566832F, 26.151299F, 15.042786F, 26.556795F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(17.333334F, 2.266667F);
      ((Path)localObject2).cubicTo(16.133333F, 1.866667F, 14.8F, 1.6F, 13.333333F, 1.6F);
      ((Path)localObject2).cubicTo(12.133333F, 1.6F, 11.066667F, 1.866667F, 10.0F, 2.133333F);
      ((Path)localObject2).lineTo(17.333334F, 9.333333F);
      ((Path)localObject2).lineTo(17.333334F, 2.266667F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(8.4F, 2.666667F);
      ((Path)localObject2).cubicTo(6.133333F, 3.733333F, 4.266667F, 5.6F, 3.066667F, 7.733333F);
      ((Path)localObject2).lineTo(13.333333F, 7.733333F);
      ((Path)localObject2).lineTo(8.4F, 2.666667F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2.266667F, 9.333333F);
      ((Path)localObject2).cubicTo(1.866667F, 10.533333F, 1.6F, 11.866667F, 1.466667F, 13.333333F);
      ((Path)localObject2).cubicTo(1.466667F, 14.533333F, 1.733333F, 15.6F, 2.0F, 16.666666F);
      ((Path)localObject2).lineTo(9.333333F, 9.333333F);
      ((Path)localObject2).lineTo(2.266667F, 9.333333F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2.666667F, 18.266666F);
      ((Path)localObject2).cubicTo(3.733333F, 20.533333F, 5.6F, 22.4F, 7.733333F, 23.6F);
      ((Path)localObject2).lineTo(7.733333F, 13.333333F);
      ((Path)localObject2).lineTo(2.666667F, 18.266666F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(15.835732F, 21.002941F);
      ((Path)localObject1).cubicTo(15.835732F, 23.85733F, 18.14887F, 26.170948F, 21.002741F, 26.170948F);
      ((Path)localObject1).cubicTo(23.856871F, 26.170948F, 26.170748F, 23.857071F, 26.170748F, 21.002941F);
      ((Path)localObject1).cubicTo(26.170748F, 18.148811F, 23.856871F, 15.834932F, 21.002741F, 15.834932F);
      ((Path)localObject1).cubicTo(18.14887F, 15.834932F, 15.835732F, 18.14855F, 15.835732F, 21.002941F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(14.335732F, 21.002941F);
      ((Path)localObject1).cubicTo(14.335732F, 17.320383F, 17.320185F, 14.334932F, 21.002741F, 14.334932F);
      ((Path)localObject1).cubicTo(24.685297F, 14.334932F, 27.670748F, 17.320383F, 27.670748F, 21.002941F);
      ((Path)localObject1).cubicTo(27.670748F, 24.685497F, 24.685297F, 27.670948F, 21.002741F, 27.670948F);
      ((Path)localObject1).cubicTo(17.320185F, 27.670948F, 14.335732F, 24.685497F, 14.335732F, 21.002941F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(21.785858F, 21.002941F);
      ((Path)localObject3).lineTo(24.003195F, 18.785604F);
      ((Path)localObject3).lineTo(23.221075F, 18.002487F);
      ((Path)localObject3).lineTo(21.002741F, 20.219822F);
      ((Path)localObject3).lineTo(18.785406F, 18.002487F);
      ((Path)localObject3).lineTo(18.002287F, 18.785604F);
      ((Path)localObject3).lineTo(20.220623F, 21.002941F);
      ((Path)localObject3).lineTo(18.002287F, 23.220276F);
      ((Path)localObject3).lineTo(18.785406F, 24.003393F);
      ((Path)localObject3).lineTo(21.002741F, 21.786058F);
      ((Path)localObject3).lineTo(23.221075F, 24.003393F);
      ((Path)localObject3).lineTo(24.003195F, 23.220276F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abw
 * JD-Core Version:    0.6.2
 */