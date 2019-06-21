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

public final class iq extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-2697514);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(18.307041F, 16.743668F);
      ((Path)localObject2).cubicTo(20.848019F, 11.149101F, 23.42901F, 5.574551F, 25.989996F, 0.0F);
      ((Path)localObject2).cubicTo(28.641016F, 5.554534F, 31.141977F, 11.189134F, 33.752983F, 16.773693F);
      ((Path)localObject2).cubicTo(39.83532F, 17.174019F, 45.91766F, 17.574347F, 52.0F, 17.984682F);
      ((Path)localObject2).cubicTo(47.568295F, 22.037991F, 43.076569F, 26.03125F, 38.664871F, 30.104576F);
      ((Path)localObject2).cubicTo(40.075413F, 36.399715F, 41.475952F, 42.694855F, 42.876492F, 48.98999F);
      ((Path)localObject2).cubicTo(37.25433F, 45.867443F, 31.64217F, 42.724876F, 26.010004F, 39.622345F);
      ((Path)localObject2).cubicTo(20.377838F, 42.734886F, 14.765679F, 45.867443F, 9.143517F, 49.0F);
      ((Path)localObject2).cubicTo(10.544055F, 42.694855F, 11.954597F, 36.399715F, 13.355137F, 30.104576F);
      ((Path)localObject2).cubicTo(9.113505F, 26.241421F, 4.921893F, 22.338236F, 0.5802231F, 18.595181F);
      ((Path)localObject2).cubicTo(0.440169F, 18.595181F, 0.1500577F, 18.585171F, 0.0F, 18.575163F);
      ((Path)localObject2).lineTo(0.0F, 18.324959F);
      ((Path)localObject2).cubicTo(6.03232F, 17.22406F, 12.214698F, 17.354166F, 18.307041F, 16.743668F);
      ((Path)localObject2).lineTo(18.307041F, 16.743668F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-14629309);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, -3.0F);
      ((Path)localObject3).lineTo(26.0F, -3.0F);
      ((Path)localObject3).lineTo(26.0F, 50.0F);
      ((Path)localObject3).lineTo(0.0F, 50.0F);
      ((Path)localObject3).lineTo(0.0F, -3.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.iq
 * JD-Core Version:    0.6.2
 */