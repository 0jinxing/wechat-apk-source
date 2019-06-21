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

public final class avg extends c
{
  private final int height = 42;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 42;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      Paint localPaint2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4737097);
      localPaint2.setColor(-4737097);
      localPaint2.setStrokeWidth(0.5F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(19.597933F, 30.307812F);
      ((Path)localObject2).cubicTo(16.679598F, 30.307812F, 13.962932F, 28.918991F, 12.334599F, 26.680159F);
      ((Path)localObject2).lineTo(26.861265F, 26.680159F);
      ((Path)localObject2).cubicTo(25.232931F, 28.918991F, 22.517099F, 30.307812F, 19.597933F, 30.307812F);
      ((Path)localObject2).moveTo(28.349598F, 25.0F);
      ((Path)localObject2).lineTo(10.845432F, 25.0F);
      ((Path)localObject2).cubicTo(10.553765F, 25.0F, 10.282932F, 25.149807F, 10.128765F, 25.393969F);
      ((Path)localObject2).cubicTo(9.973765F, 25.640612F, 9.957932F, 25.948503F, 10.085432F, 26.208389F);
      ((Path)localObject2).cubicTo(11.809599F, 29.719343F, 15.543765F, 31.98797F, 19.597933F, 31.98797F);
      ((Path)localObject2).cubicTo(23.652931F, 31.98797F, 27.386265F, 29.719343F, 29.109598F, 26.208389F);
      ((Path)localObject2).cubicTo(29.237932F, 25.947676F, 29.221266F, 25.640612F, 29.066265F, 25.393969F);
      ((Path)localObject2).cubicTo(28.912098F, 25.149807F, 28.641266F, 25.0F, 28.349598F, 25.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4210753);
      ((Paint)localObject2).setColor(-4210753);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(19.975F, 38.047897F);
      ((Path)localObject2).cubicTo(9.894167F, 38.047897F, 1.691667F, 29.901197F, 1.691667F, 19.887285F);
      ((Path)localObject2).cubicTo(1.691667F, 9.87503F, 9.894167F, 1.729157F, 19.975F, 1.729157F);
      ((Path)localObject2).cubicTo(30.056667F, 1.729157F, 38.258335F, 9.87503F, 38.258335F, 19.887285F);
      ((Path)localObject2).cubicTo(38.258335F, 29.901197F, 30.056667F, 38.047897F, 19.975F, 38.047897F);
      ((Path)localObject2).moveTo(19.975F, 0.04899773F);
      ((Path)localObject2).cubicTo(8.96F, 0.04899773F, 0.0F, 8.948046F, 0.0F, 19.887285F);
      ((Path)localObject2).cubicTo(0.0F, 30.827354F, 8.96F, 39.728058F, 19.975F, 39.728058F);
      ((Path)localObject2).cubicTo(30.99F, 39.728058F, 39.950001F, 30.827354F, 39.950001F, 19.887285F);
      ((Path)localObject2).cubicTo(39.950001F, 8.948046F, 30.99F, 0.04899773F, 19.975F, 0.04899773F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-4737097);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(12.383333F, 14.045125F);
      ((Path)localObject1).cubicTo(12.845833F, 13.585771F, 13.46F, 13.333333F, 14.113334F, 13.333333F);
      ((Path)localObject1).cubicTo(14.766666F, 13.333333F, 15.381667F, 13.585771F, 15.843333F, 14.045125F);
      ((Path)localObject1).cubicTo(16.797501F, 14.992801F, 16.797501F, 16.534739F, 15.843333F, 17.482414F);
      ((Path)localObject1).cubicTo(14.92F, 18.399467F, 13.308333F, 18.399467F, 12.383333F, 17.482414F);
      ((Path)localObject1).cubicTo(11.920834F, 17.022234F, 11.666667F, 16.412245F, 11.666667F, 15.763356F);
      ((Path)localObject1).cubicTo(11.666667F, 15.114467F, 11.920834F, 14.504478F, 12.383333F, 14.045125F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-4737097);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(27.565332F, 17.653965F);
      ((Path)localObject3).cubicTo(26.642F, 18.571016F, 25.030333F, 18.571016F, 24.105333F, 17.653965F);
      ((Path)localObject3).cubicTo(23.642834F, 17.193783F, 23.388666F, 16.584623F, 23.388666F, 15.934906F);
      ((Path)localObject3).cubicTo(23.388666F, 15.286017F, 23.642834F, 14.676028F, 24.105333F, 14.216675F);
      ((Path)localObject3).cubicTo(24.568666F, 13.757321F, 25.182833F, 13.504884F, 25.836166F, 13.504884F);
      ((Path)localObject3).cubicTo(26.488667F, 13.504884F, 27.103666F, 13.757321F, 27.565332F, 14.216675F);
      ((Path)localObject3).cubicTo(28.519501F, 15.164351F, 28.519501F, 16.706289F, 27.565332F, 17.653965F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.avg
 * JD-Core Version:    0.6.2
 */