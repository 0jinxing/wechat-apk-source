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

public final class vr extends c
{
  private final int height = 40;
  private final int width = 40;

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
        paramInt = 40;
        continue;
        paramInt = 40;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setColor(-1);
      ((Paint)localObject2).setStrokeWidth(1.2F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.6F, 5.1F);
      ((Path)localObject1).lineTo(0.6F, 18.9F);
      ((Path)localObject1).cubicTo(0.6F, 19.452284F, 1.047715F, 19.9F, 1.6F, 19.9F);
      ((Path)localObject1).lineTo(24.4F, 19.9F);
      ((Path)localObject1).cubicTo(24.952284F, 19.9F, 25.4F, 19.452284F, 25.4F, 18.9F);
      ((Path)localObject1).lineTo(25.4F, 5.1F);
      ((Path)localObject1).cubicTo(25.4F, 4.547715F, 24.952284F, 4.1F, 24.4F, 4.1F);
      ((Path)localObject1).lineTo(19.191229F, 4.1F);
      ((Path)localObject1).lineTo(16.751053F, 0.6837524F);
      ((Path)localObject1).cubicTo(16.713511F, 0.6311932F, 16.652895F, 0.6F, 16.588306F, 0.6F);
      ((Path)localObject1).lineTo(9.411695F, 0.6F);
      ((Path)localObject1).cubicTo(9.347104F, 0.6F, 9.28649F, 0.6311932F, 9.248947F, 0.6837524F);
      ((Path)localObject1).lineTo(6.808771F, 4.1F);
      ((Path)localObject1).lineTo(1.6F, 4.1F);
      ((Path)localObject1).cubicTo(1.047715F, 4.1F, 0.6F, 4.547715F, 0.6F, 5.1F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(2.0F, 0.5F);
      ((Path)localObject2).lineTo(5.5F, 0.5F);
      ((Path)localObject2).lineTo(5.5F, 2.0F);
      ((Path)localObject2).lineTo(2.0F, 2.0F);
      ((Path)localObject2).lineTo(2.0F, 0.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(7.0F, 11.0F);
      ((Path)localObject1).lineTo(5.0F, 11.0F);
      ((Path)localObject1).lineTo(7.75F, 8.25F);
      ((Path)localObject1).lineTo(10.5F, 11.0F);
      ((Path)localObject1).lineTo(8.5F, 11.0F);
      ((Path)localObject1).cubicTo(8.5F, 13.485281F, 10.514719F, 15.5F, 13.0F, 15.5F);
      ((Path)localObject1).cubicTo(14.264459F, 15.5F, 15.407109F, 14.978478F, 16.224586F, 14.1388F);
      ((Path)localObject1).lineTo(17.285318F, 15.199532F);
      ((Path)localObject1).cubicTo(16.196331F, 16.310623F, 14.678672F, 17.0F, 13.0F, 17.0F);
      ((Path)localObject1).cubicTo(9.686292F, 17.0F, 7.0F, 14.313708F, 7.0F, 11.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(19.0F, 11.0F);
      ((Path)localObject1).lineTo(21.0F, 11.0F);
      ((Path)localObject1).lineTo(18.25F, 13.75F);
      ((Path)localObject1).lineTo(15.5F, 11.0F);
      ((Path)localObject1).lineTo(17.5F, 11.0F);
      ((Path)localObject1).cubicTo(17.5F, 8.514719F, 15.485281F, 6.5F, 13.0F, 6.5F);
      ((Path)localObject1).cubicTo(11.735541F, 6.5F, 10.592891F, 7.021522F, 9.775414F, 7.8612F);
      ((Path)localObject1).lineTo(8.714682F, 6.800468F);
      ((Path)localObject1).cubicTo(9.803668F, 5.689376F, 11.321328F, 5.0F, 13.0F, 5.0F);
      ((Path)localObject1).cubicTo(16.313709F, 5.0F, 19.0F, 7.686292F, 19.0F, 11.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vr
 * JD-Core Version:    0.6.2
 */