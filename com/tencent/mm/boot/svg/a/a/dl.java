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

public final class dl extends c
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -275.0F, 0.0F, 1.0F, -1626.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 126.0F, 0.0F, 1.0F, 1626.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 149.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject2).setColor(-70474);
      ((Paint)localObject1).setColor(-36352);
      ((Paint)localObject1).setStrokeWidth(5.4F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramArrayOfObject);
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(42.0F, 21.25926F);
      ((Path)localObject1).cubicTo(42.0F, 9.401778F, 32.598221F, 0.0F, 20.74074F, 0.0F);
      ((Path)localObject1).cubicTo(9.401778F, 0.0F, 0.0F, 9.401778F, 0.0F, 21.25926F);
      ((Path)localObject1).cubicTo(0.0F, 32.598221F, 9.401778F, 42.0F, 20.74074F, 42.0F);
      ((Path)localObject1).cubicTo(32.598221F, 42.0F, 42.0F, 32.598221F, 42.0F, 21.25926F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-36352);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(7.193202F, 22.069902F);
      ((Path)localObject3).cubicTo(7.020972F, 21.90468F, 7.001341F, 21.619408F, 7.147708F, 21.434807F);
      ((Path)localObject3).lineTo(8.144134F, 20.17808F);
      ((Path)localObject3).cubicTo(8.291237F, 19.992548F, 8.567782F, 19.95389F, 8.763619F, 20.093018F);
      ((Path)localObject3).lineTo(15.588285F, 24.941442F);
      ((Path)localObject3).cubicTo(15.783314F, 25.079996F, 16.094162F, 25.074368F, 16.278591F, 24.931952F);
      ((Path)localObject3).lineTo(33.272747F, 11.809155F);
      ((Path)localObject3).cubicTo(33.458961F, 11.665359F, 33.751038F, 11.677971F, 33.934212F, 11.845651F);
      ((Path)localObject3).lineTo(34.814766F, 12.651727F);
      ((Path)localObject3).cubicTo(34.993866F, 12.815679F, 34.995564F, 13.079486F, 34.821854F, 13.237947F);
      ((Path)localObject3).lineTo(16.258057F, 30.172258F);
      ((Path)localObject3).cubicTo(16.08287F, 30.332067F, 15.798551F, 30.325104F, 15.629005F, 30.162458F);
      ((Path)localObject3).lineTo(7.193202F, 22.069902F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dl
 * JD-Core Version:    0.6.2
 */