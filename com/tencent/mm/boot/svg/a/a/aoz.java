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

public final class aoz extends c
{
  private final int height = 76;
  private final int width = 76;

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
        paramInt = 76;
        continue;
        paramInt = 76;
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
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-789517);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 4.0F);
      ((Path)localObject3).cubicTo(0.0F, 1.790861F, 1.790861F, 0.0F, 4.0F, 0.0F);
      ((Path)localObject3).lineTo(72.0F, 0.0F);
      ((Path)localObject3).cubicTo(74.209137F, 0.0F, 76.0F, 1.790861F, 76.0F, 4.0F);
      ((Path)localObject3).lineTo(76.0F, 72.0F);
      ((Path)localObject3).cubicTo(76.0F, 74.209137F, 74.209137F, 76.0F, 72.0F, 76.0F);
      ((Path)localObject3).lineTo(4.0F, 76.0F);
      ((Path)localObject3).cubicTo(1.790861F, 76.0F, 0.0F, 74.209137F, 0.0F, 72.0F);
      ((Path)localObject3).lineTo(0.0F, 4.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-5658199);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(11.048801F, 4.034698F);
      ((Path)localObject1).cubicTo(16.060522F, -0.743125F, 23.669407F, 1.700647F, 29.878258F, 1.132096F);
      ((Path)localObject1).cubicTo(29.898548F, 4.144418F, 29.898548F, 7.146766F, 29.878258F, 10.159089F);
      ((Path)localObject1).cubicTo(26.469477F, 10.288758F, 22.959244F, 9.760106F, 19.631624F, 10.607945F);
      ((Path)localObject1).cubicTo(16.557634F, 12.134055F, 17.521427F, 15.994218F, 17.318523F, 18.737226F);
      ((Path)localObject1).cubicTo(21.549065F, 18.737226F, 25.769459F, 18.737226F, 30.0F, 18.757175F);
      ((Path)localObject1).cubicTo(29.513031F, 21.789448F, 29.005772F, 24.811745F, 28.468079F, 27.834042F);
      ((Path)localObject1).cubicTo(24.765087F, 27.844017F, 21.072241F, 27.853991F, 17.379395F, 27.863966F);
      ((Path)localObject1).cubicTo(17.328669F, 35.564339F, 17.38954F, 43.274689F, 17.348959F, 50.985039F);
      ((Path)localObject1).cubicTo(14.234388F, 51.004986F, 11.109673F, 51.004986F, 7.995102F, 50.985039F);
      ((Path)localObject1).cubicTo(7.954522F, 43.274689F, 8.015392F, 35.574314F, 7.964667F, 27.863966F);
      ((Path)localObject1).cubicTo(5.651566F, 27.863966F, 3.338464F, 27.844017F, 1.015218F, 27.844017F);
      ((Path)localObject1).cubicTo(0.9949274F, 24.811745F, 0.9949274F, 21.779472F, 1.015218F, 18.747202F);
      ((Path)localObject1).cubicTo(3.338464F, 18.747202F, 5.661711F, 18.737226F, 7.984957F, 18.727251F);
      ((Path)localObject1).cubicTo(8.14728F, 13.779861F, 6.889278F, 7.805089F, 11.048801F, 4.034698F);
      ((Path)localObject1).lineTo(11.048801F, 4.034698F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aoz
 * JD-Core Version:    0.6.2
 */