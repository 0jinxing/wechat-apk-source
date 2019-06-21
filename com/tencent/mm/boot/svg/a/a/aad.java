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

public final class aad extends c
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
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(28.0F, 0.0F);
      ((Path)localObject2).lineTo(28.0F, 28.0F);
      ((Path)localObject2).lineTo(0.0F, 28.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-436207616);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 1.866667F, 0.0F, 1.0F, 4.2F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(23.299828F, 10.403306F);
      ((Path)localObject3).lineTo(10.333587F, 19.424025F);
      ((Path)localObject3).cubicTo(10.104387F, 19.583481F, 9.789319F, 19.526941F, 9.629864F, 19.297743F);
      ((Path)localObject3).cubicTo(9.570911F, 19.213003F, 9.539311F, 19.112249F, 9.539311F, 19.009022F);
      ((Path)localObject3).lineTo(9.539311F, 0.9675865F);
      ((Path)localObject3).cubicTo(9.539311F, 0.6883758F, 9.765656F, 0.4620309F, 10.044866F, 0.4620309F);
      ((Path)localObject3).cubicTo(10.148094F, 0.4620309F, 10.248848F, 0.4936311F, 10.333587F, 0.5525841F);
      ((Path)localObject3).lineTo(23.299828F, 9.573301F);
      ((Path)localObject3).cubicTo(23.529028F, 9.732758F, 23.585566F, 10.047825F, 23.426109F, 10.277024F);
      ((Path)localObject3).cubicTo(23.391844F, 10.326279F, 23.349083F, 10.36904F, 23.299828F, 10.403306F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(10.894444F, 12.605559F);
      ((Path)localObject1).lineTo(0.7888567F, 19.442877F);
      ((Path)localObject1).cubicTo(0.5576038F, 19.59934F, 0.243298F, 19.538712F, 0.08683508F, 19.307459F);
      ((Path)localObject1).cubicTo(0.03024436F, 19.223816F, 4.564566E-016F, 19.125143F, 4.440892E-016F, 19.024157F);
      ((Path)localObject1).lineTo(0.0F, 0.9634772F);
      ((Path)localObject1).cubicTo(-3.419344E-017F, 0.6842666F, 0.2263449F, 0.4579217F, 0.5055556F, 0.4579217F);
      ((Path)localObject1).cubicTo(0.60818F, 0.4579217F, 0.708375F, 0.489154F, 0.792823F, 0.5474675F);
      ((Path)localObject1).lineTo(10.894444F, 7.522937F);
      ((Path)localObject1).lineTo(10.894444F, 12.605559F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aad
 * JD-Core Version:    0.6.2
 */