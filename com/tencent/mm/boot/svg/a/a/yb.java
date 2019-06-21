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

public final class yb extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setColor(-3355444);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 36.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject5 = c.a((Paint)localObject3, paramArrayOfObject);
      Paint localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject5).setColor(-3355444);
      localPaint.setStrokeWidth(4.32F);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(65.768089F, 37.893055F);
      localPath.cubicTo(68.401421F, 25.598955F, 69.143127F, 12.708855F, 66.977585F, 8.937693F);
      localPath.lineTo(66.5504F, 8.193766F);
      localPath.lineTo(67.994026F, 2.16F);
      localPath.cubicTo(67.143425F, 2.16F, 65.937592F, 2.16F, 64.148056F, 2.16F);
      localPath.cubicTo(56.467045F, 2.16F, 56.467045F, 2.16F, 44.396881F, 2.16F);
      localPath.cubicTo(44.342266F, 2.16F, 44.227406F, 2.160768F, 44.056358F, 2.163133F);
      localPath.cubicTo(43.765598F, 2.167153F, 43.426701F, 2.174424F, 43.043732F, 2.185769F);
      localPath.cubicTo(41.943851F, 2.218354F, 40.715954F, 2.277118F, 39.392708F, 2.368589F);
      localPath.cubicTo(35.618073F, 2.629517F, 31.8465F, 3.098806F, 28.345474F, 3.824849F);
      localPath.cubicTo(21.099072F, 5.327609F, 16.074677F, 7.733487F, 14.30328F, 10.884384F);
      localPath.lineTo(14.169576F, 11.122212F);
      localPath.lineTo(12.610786F, 11.977462F);
      localPath.lineTo(12.492328F, 11.984674F);
      localPath.cubicTo(12.47928F, 11.985089F, 12.47928F, 11.985089F, 12.461704F, 11.98548F);
      localPath.cubicTo(12.443822F, 11.985765F, 12.443822F, 11.985765F, 12.437808F, 11.985812F);
      localPath.cubicTo(12.205375F, 11.987832F, 11.85872F, 12.017767F, 11.348712F, 12.122744F);
      localPath.cubicTo(10.493734F, 12.298726F, 9.642155F, 12.616304F, 8.85846F, 13.104166F);
      localPath.cubicTo(6.565922F, 14.531304F, 5.173456F, 17.155987F, 5.173456F, 21.620689F);
      localPath.cubicTo(5.173456F, 23.364813F, 6.362546F, 28.936539F, 8.701701F, 37.968338F);
      localPath.lineTo(65.768089F, 37.893055F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject5);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject5 = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject5).setColor(-1);
      localPaint.setStrokeWidth(4.8F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(62.400002F, 33.234783F);
      ((Path)localObject3).cubicTo(62.400002F, 27.471912F, 58.318142F, 22.799999F, 53.283115F, 22.799999F);
      ((Path)localObject3).lineTo(20.462337F, 22.799999F);
      ((Path)localObject3).cubicTo(15.427311F, 22.799999F, 11.345454F, 27.471912F, 11.345454F, 33.234783F);
      ((Path)localObject3).lineTo(11.345454F, 52.017391F);
      ((Path)localObject3).cubicTo(11.345454F, 57.072262F, 14.000975F, 61.631477F, 18.077816F, 63.576F);
      ((Path)localObject3).lineTo(29.859337F, 69.194611F);
      ((Path)localObject3).cubicTo(32.081577F, 70.254524F, 34.465187F, 70.800003F, 36.872498F, 70.800003F);
      ((Path)localObject3).cubicTo(39.279812F, 70.800003F, 41.663193F, 70.254257F, 43.885433F, 69.194611F);
      ((Path)localObject3).lineTo(55.667637F, 63.575741F);
      ((Path)localObject3).cubicTo(59.74448F, 61.631741F, 62.400002F, 57.072521F, 62.400002F, 52.017391F);
      ((Path)localObject3).lineTo(62.400002F, 33.234783F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject5);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(4.8F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(73.701027F, 117.0F);
      ((Path)localObject5).lineTo(71.320068F, 93.008537F);
      ((Path)localObject5).cubicTo(70.960785F, 89.952194F, 68.98214F, 87.386742F, 66.233437F, 86.412704F);
      ((Path)localObject5).lineTo(57.052197F, 83.159401F);
      ((Path)localObject5).cubicTo(55.453293F, 82.592773F, 53.654526F, 83.197891F, 52.751377F, 84.710571F);
      ((Path)localObject5).cubicTo(49.416721F, 90.295372F, 43.55603F, 94.005325F, 36.872608F, 94.005325F);
      ((Path)localObject5).cubicTo(30.189188F, 94.005325F, 24.328497F, 90.29512F, 20.994076F, 84.710571F);
      ((Path)localObject5).cubicTo(20.090929F, 83.197891F, 18.292162F, 82.592773F, 16.693256F, 83.159401F);
      ((Path)localObject5).lineTo(7.512017F, 86.412704F);
      ((Path)localObject5).cubicTo(4.763077F, 87.386742F, 2.784668F, 89.952194F, 2.425384F, 93.008537F);
      ((Path)localObject5).lineTo(0.0F, 117.0F);
      localCanvas.drawPath((Path)localObject5, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(4.8F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(25.566744F, 69.0F);
      ((Path)localObject5).cubicTo(26.352238F, 77.775337F, 25.393625F, 83.775337F, 22.690908F, 87.0F);
      localCanvas.drawPath((Path)localObject5, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(4.8F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 99.577522F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(51.094017F, 69.0F);
      ((Path)localObject1).cubicTo(51.879509F, 77.775337F, 50.920898F, 83.775337F, 48.218182F, 87.0F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject1).setStrokeWidth(4.8F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(7.090909F, 39.899998F);
      ((Path)localObject2).cubicTo(9.44063F, 39.899998F, 11.345454F, 41.81398F, 11.345454F, 44.174999F);
      ((Path)localObject2).cubicTo(11.345454F, 46.536018F, 9.44063F, 48.450001F, 7.090909F, 48.450001F);
      ((Path)localObject2).cubicTo(4.741189F, 48.450001F, 2.836364F, 46.536018F, 2.836364F, 44.174999F);
      ((Path)localObject2).cubicTo(2.836364F, 41.81398F, 4.741189F, 39.899998F, 7.090909F, 39.899998F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject1).setStrokeWidth(4.8F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(66.654549F, 39.899998F);
      ((Path)localObject4).cubicTo(69.004272F, 39.899998F, 70.909096F, 41.81398F, 70.909096F, 44.174999F);
      ((Path)localObject4).cubicTo(70.909096F, 46.536018F, 69.004272F, 48.450001F, 66.654549F, 48.450001F);
      ((Path)localObject4).cubicTo(64.304825F, 48.450001F, 62.400002F, 46.536018F, 62.400002F, 44.174999F);
      ((Path)localObject4).cubicTo(62.400002F, 41.81398F, 64.304825F, 39.899998F, 66.654549F, 39.899998F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yb
 * JD-Core Version:    0.6.2
 */