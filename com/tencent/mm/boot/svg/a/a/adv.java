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

public final class adv extends c
{
  private final int height = 384;
  private final int width = 442;

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
        paramInt = 442;
        continue;
        paramInt = 384;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -638.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(1080.0F, 0.0F);
      ((Path)localObject1).lineTo(1080.0F, 384.0F);
      ((Path)localObject1).lineTo(0.0F, 384.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(700.67981F, 213.73169F);
      ((Path)localObject3).cubicTo(697.97302F, 173.42755F, 710.40881F, 134.17123F, 738.70874F, 105.26089F);
      ((Path)localObject3).cubicTo(796.09906F, 46.632671F, 896.99811F, 52.753529F, 964.07306F, 118.93221F);
      ((Path)localObject3).cubicTo(1031.1481F, 185.11089F, 1038.999F, 286.28687F, 981.6087F, 344.91507F);
      ((Path)localObject3).cubicTo(950.71912F, 376.47092F, 907.22516F, 389.26904F, 863.185F, 384.04095F);
      ((Path)localObject3).cubicTo(858.70081F, 393.61981F, 852.6391F, 402.50076F, 844.97217F, 410.33347F);
      ((Path)localObject3).cubicTo(803.24408F, 452.96371F, 729.76733F, 448.40085F, 680.8573F, 400.142F);
      ((Path)localObject3).cubicTo(631.94727F, 351.88315F, 626.12512F, 278.20294F, 667.85321F, 235.57269F);
      ((Path)localObject3).cubicTo(677.36743F, 225.85278F, 688.53217F, 218.58626F, 700.67981F, 213.73169F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(700.67981F, 213.73169F);
      ((Path)localObject3).cubicTo(703.46228F, 255.16158F, 722.245F, 297.69867F, 756.24438F, 331.24374F);
      ((Path)localObject3).cubicTo(787.21716F, 361.80264F, 825.4021F, 379.55566F, 863.185F, 384.04095F);
      ((Path)localObject3).cubicTo(883.1062F, 341.48599F, 871.8916F, 285.15613F, 831.96808F, 245.76416F);
      ((Path)localObject3).cubicTo(794.20978F, 208.50858F, 741.8103F, 197.29474F, 700.67981F, 213.73169F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 7, 4);
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.adv
 * JD-Core Version:    0.6.2
 */