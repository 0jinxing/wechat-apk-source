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

public final class aan extends c
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.333333F, 0.0F, 1.0F, 2.333333F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(11.666667F, 21.933332F);
      ((Path)localObject1).cubicTo(17.33679F, 21.933332F, 21.933332F, 17.33679F, 21.933332F, 11.666667F);
      ((Path)localObject1).cubicTo(21.933332F, 5.996543F, 17.33679F, 1.4F, 11.666667F, 1.4F);
      ((Path)localObject1).cubicTo(5.996543F, 1.4F, 1.4F, 5.996543F, 1.4F, 11.666667F);
      ((Path)localObject1).cubicTo(1.4F, 17.33679F, 5.996543F, 21.933332F, 11.666667F, 21.933332F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(11.666667F, 23.333334F);
      ((Path)localObject1).cubicTo(5.223345F, 23.333334F, 0.0F, 18.109989F, 0.0F, 11.666667F);
      ((Path)localObject1).cubicTo(0.0F, 5.223345F, 5.223345F, 0.0F, 11.666667F, 0.0F);
      ((Path)localObject1).cubicTo(18.109989F, 0.0F, 23.333334F, 5.223345F, 23.333334F, 11.666667F);
      ((Path)localObject1).cubicTo(23.333334F, 18.109989F, 18.109989F, 23.333334F, 11.666667F, 23.333334F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(11.666667F, 17.85F);
      ((Path)localObject1).cubicTo(14.276042F, 17.85F, 16.468582F, 16.065317F, 17.090242F, 13.65F);
      ((Path)localObject1).lineTo(6.243091F, 13.65F);
      ((Path)localObject1).cubicTo(6.864751F, 16.065317F, 9.057291F, 17.85F, 11.666667F, 17.85F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(4.666667F, 12.25F);
      ((Path)localObject1).lineTo(18.666666F, 12.25F);
      ((Path)localObject1).cubicTo(18.666666F, 16.115993F, 15.53266F, 19.25F, 11.666667F, 19.25F);
      ((Path)localObject1).cubicTo(7.800674F, 19.25F, 4.666667F, 16.115993F, 4.666667F, 12.25F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(7.583334F, 9.916667F);
      ((Path)localObject3).cubicTo(6.616835F, 9.916667F, 5.833334F, 9.133165F, 5.833334F, 8.166667F);
      ((Path)localObject3).cubicTo(5.833334F, 7.200168F, 6.616835F, 6.416667F, 7.583334F, 6.416667F);
      ((Path)localObject3).cubicTo(8.549831F, 6.416667F, 9.333333F, 7.200168F, 9.333333F, 8.166667F);
      ((Path)localObject3).cubicTo(9.333333F, 9.133165F, 8.549831F, 9.916667F, 7.583334F, 9.916667F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(15.75F, 9.916667F);
      ((Path)localObject3).cubicTo(14.783502F, 9.916667F, 14.0F, 9.133165F, 14.0F, 8.166667F);
      ((Path)localObject3).cubicTo(14.0F, 7.200168F, 14.783502F, 6.416667F, 15.75F, 6.416667F);
      ((Path)localObject3).cubicTo(16.716497F, 6.416667F, 17.5F, 7.200168F, 17.5F, 8.166667F);
      ((Path)localObject3).cubicTo(17.5F, 9.133165F, 16.716497F, 9.916667F, 15.75F, 9.916667F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aan
 * JD-Core Version:    0.6.2
 */