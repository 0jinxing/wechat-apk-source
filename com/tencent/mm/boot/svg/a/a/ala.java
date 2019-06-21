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

public final class ala extends c
{
  private final int height = 48;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 48;
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -120.0F, 0.0F, 1.0F, -426.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 120.0F, 0.0F, 1.0F, 426.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-70474);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(44.0F, 22.271605F);
      ((Path)localObject2).cubicTo(44.0F, 9.849482F, 34.15052F, 0.0F, 21.728395F, 0.0F);
      ((Path)localObject2).cubicTo(9.849482F, 0.0F, 0.0F, 9.849482F, 0.0F, 22.271605F);
      ((Path)localObject2).cubicTo(0.0F, 34.15052F, 9.849482F, 44.0F, 21.728395F, 44.0F);
      ((Path)localObject2).cubicTo(34.15052F, 44.0F, 44.0F, 34.15052F, 44.0F, 22.271605F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-36352);
      ((Paint)localObject3).setStrokeWidth(3.0F);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(42.5F, 22.271605F);
      ((Path)localObject1).cubicTo(42.5F, 10.677909F, 33.32209F, 1.5F, 21.728395F, 1.5F);
      ((Path)localObject1).cubicTo(10.600406F, 1.5F, 1.5F, 10.756952F, 1.5F, 22.271605F);
      ((Path)localObject1).cubicTo(1.5F, 33.32209F, 10.677909F, 42.5F, 21.728395F, 42.5F);
      ((Path)localObject1).cubicTo(33.243046F, 42.5F, 42.5F, 33.399593F, 42.5F, 22.271605F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-36352);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(8.37882F, 23.270937F);
      ((Path)localObject3).cubicTo(8.197487F, 23.075033F, 8.176818F, 22.736786F, 8.330922F, 22.517902F);
      ((Path)localObject3).lineTo(9.380023F, 21.027798F);
      ((Path)localObject3).cubicTo(9.534904F, 20.80781F, 9.826069F, 20.761974F, 10.042893F, 20.935448F);
      ((Path)localObject3).lineTo(17.207075F, 26.667225F);
      ((Path)localObject3).cubicTo(17.418287F, 26.836208F, 17.750328F, 26.833344F, 17.961102F, 26.650051F);
      ((Path)localObject3).lineTo(35.820465F, 11.119163F);
      ((Path)localObject3).cubicTo(36.025688F, 10.940694F, 36.340633F, 10.949186F, 36.533489F, 11.148006F);
      ((Path)localObject3).lineTo(37.460594F, 12.103773F);
      ((Path)localObject3).cubicTo(37.649166F, 12.298171F, 37.650951F, 12.610968F, 37.46806F, 12.798857F);
      ((Path)localObject3).lineTo(17.922888F, 32.87793F);
      ((Path)localObject3).cubicTo(17.738441F, 33.067417F, 17.439091F, 33.059162F, 17.260582F, 32.86631F);
      ((Path)localObject3).lineTo(8.37882F, 23.270937F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ala
 * JD-Core Version:    0.6.2
 */