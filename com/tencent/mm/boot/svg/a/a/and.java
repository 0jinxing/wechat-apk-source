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

public final class and extends c
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
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(7.0F, 1.0F);
      ((Path)localObject1).cubicTo(10.526494F, -1.385335F, 15.476821F, 1.576629F, 14.0F, 5.0F);
      ((Path)localObject1).cubicTo(7.392988F, 12.569689F, 5.9232F, 23.522991F, 11.0F, 32.0F);
      ((Path)localObject1).cubicTo(11.93504F, 34.386837F, 14.650065F, 36.63316F, 14.0F, 40.0F);
      ((Path)localObject1).cubicTo(12.914899F, 42.318539F, 8.964845F, 42.795635F, 7.0F, 41.0F);
      ((Path)localObject1).cubicTo(-2.660768F, 29.516495F, -2.181046F, 11.834167F, 7.0F, 1.0F);
      ((Path)localObject1).lineTo(7.0F, 1.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(51.0F, 2.0F);
      ((Path)localObject2).cubicTo(51.817921F, -0.5502939F, 54.604008F, -0.1618704F, 57.0F, 1.0F);
      ((Path)localObject2).cubicTo(66.176994F, 11.769702F, 66.656647F, 29.467869F, 57.0F, 41.0F);
      ((Path)localObject2).cubicTo(55.236748F, 42.504955F, 51.838329F, 42.504955F, 51.0F, 40.0F);
      ((Path)localObject2).cubicTo(49.133884F, 38.062984F, 50.827991F, 35.712524F, 52.0F, 34.0F);
      ((Path)localObject2).cubicTo(57.390099F, 26.250925F, 57.512562F, 15.444786F, 52.0F, 8.0F);
      ((Path)localObject2).cubicTo(50.99128F, 6.013067F, 48.960392F, 3.782122F, 51.0F, 2.0F);
      ((Path)localObject2).lineTo(51.0F, 2.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(18.0F, 7.0F);
      ((Path)localObject2).cubicTo(20.819609F, 5.521191F, 24.681755F, 10.051395F, 22.0F, 13.0F);
      ((Path)localObject2).cubicTo(19.615078F, 16.237059F, 18.668661F, 20.876305F, 20.0F, 25.0F);
      ((Path)localObject2).cubicTo(20.695332F, 26.992579F, 23.085274F, 28.112738F, 23.0F, 30.0F);
      ((Path)localObject2).cubicTo(22.989677F, 33.426064F, 19.060612F, 35.210388F, 17.0F, 33.0F);
      ((Path)localObject2).cubicTo(11.584872F, 25.703897F, 11.508394F, 14.214823F, 18.0F, 7.0F);
      ((Path)localObject2).lineTo(18.0F, 7.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(43.0F, 7.0F);
      ((Path)localObject2).cubicTo(44.48336F, 6.778224F, 45.848652F, 6.9966F, 47.0F, 8.0F);
      ((Path)localObject2).cubicTo(51.157063F, 13.766257F, 52.436428F, 22.223366F, 49.0F, 29.0F);
      ((Path)localObject2).cubicTo(48.130505F, 30.958408F, 47.366707F, 33.916412F, 45.0F, 34.0F);
      ((Path)localObject2).cubicTo(41.762325F, 34.363091F, 39.671421F, 29.975716F, 42.0F, 28.0F);
      ((Path)localObject2).cubicTo(45.820011F, 23.791702F, 45.018021F, 16.972414F, 42.0F, 13.0F);
      ((Path)localObject2).cubicTo(40.206081F, 11.02663F, 41.218117F, 7.979292F, 43.0F, 7.0F);
      ((Path)localObject2).lineTo(43.0F, 7.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(30.0F, 13.0F);
      ((Path)localObject3).cubicTo(35.026703F, 11.379892F, 41.030338F, 16.427767F, 40.0F, 22.0F);
      ((Path)localObject3).cubicTo(39.239254F, 27.1483F, 31.95484F, 29.994547F, 28.0F, 26.0F);
      ((Path)localObject3).cubicTo(23.189528F, 23.102068F, 24.520334F, 15.15836F, 30.0F, 13.0F);
      ((Path)localObject3).lineTo(30.0F, 13.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.and
 * JD-Core Version:    0.6.2
 */