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

public final class qo extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      Paint localPaint = c.a((Paint)localObject3, paramArrayOfObject);
      localPaint.setColor(-13786557);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(0.0F, 0.0F);
      ((Path)localObject4).lineTo(192.0F, 0.0F);
      ((Path)localObject4).lineTo(192.0F, 192.0F);
      ((Path)localObject4).lineTo(0.0F, 192.0F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 1);
      localCanvas.drawPath((Path)localObject4, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 42.666668F, 0.0F, 1.0F, 48.375F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      localObject4 = c.a((float[])localObject4, -1.0F, 0.0F, 106.5F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(88.101395F, 78.85144F);
      ((Path)localObject1).cubicTo(99.326584F, 70.617073F, 106.5F, 58.437584F, 106.5F, 44.908268F);
      ((Path)localObject1).cubicTo(106.5F, 20.105265F, 82.658813F, 0.0F, 53.25F, 0.0F);
      ((Path)localObject1).cubicTo(23.841188F, 0.0F, 0.0F, 20.105265F, 0.0F, 44.908268F);
      ((Path)localObject1).cubicTo(0.0F, 69.709053F, 23.841188F, 89.816536F, 53.25F, 89.816536F);
      ((Path)localObject1).cubicTo(59.326565F, 89.816536F, 65.192528F, 88.937378F, 70.63073F, 87.352219F);
      ((Path)localObject1).cubicTo(71.126503F, 87.201256F, 71.652992F, 87.11689F, 72.197029F, 87.11689F);
      ((Path)localObject1).cubicTo(73.219299F, 87.11689F, 74.149429F, 87.432144F, 75.024719F, 87.944992F);
      ((Path)localObject1).lineTo(86.679871F, 94.756271F);
      ((Path)localObject1).cubicTo(87.006737F, 94.944977F, 87.322632F, 95.089287F, 87.708725F, 95.089287F);
      ((Path)localObject1).cubicTo(88.689308F, 95.089287F, 89.481232F, 94.285606F, 89.481232F, 93.295441F);
      ((Path)localObject1).cubicTo(89.481232F, 92.849197F, 89.30793F, 92.405182F, 89.196053F, 91.98114F);
      ((Path)localObject1).cubicTo(89.128052F, 91.72805F, 87.693367F, 86.306557F, 86.796143F, 82.923111F);
      ((Path)localObject1).cubicTo(86.695229F, 82.54126F, 86.609673F, 82.174942F, 86.609673F, 81.777542F);
      ((Path)localObject1).cubicTo(86.609673F, 80.572021F, 87.199783F, 79.50193F, 88.101395F, 78.85144F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-13786557);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(49.501553F, 52.715603F);
      ((Path)localObject3).lineTo(49.501553F, 27.0F);
      ((Path)localObject3).lineTo(57.24297F, 27.0F);
      ((Path)localObject3).lineTo(57.24297F, 52.62429F);
      ((Path)localObject3).lineTo(69.242264F, 40.625F);
      ((Path)localObject3).lineTo(74.403206F, 45.785946F);
      ((Path)localObject3).lineTo(53.348446F, 66.840706F);
      ((Path)localObject3).lineTo(53.326603F, 66.818863F);
      ((Path)localObject3).lineTo(53.30476F, 66.840706F);
      ((Path)localObject3).lineTo(32.25F, 45.785946F);
      ((Path)localObject3).lineTo(37.410946F, 40.625F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qo
 * JD-Core Version:    0.6.2
 */