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

public final class cr extends c
{
  private final int height = 71;
  private final int width = 80;

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
        paramInt = 80;
        continue;
        paramInt = 71;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject4, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(19.357758F, 25.260746F);
      localPath.lineTo(28.450821F, 25.260746F);
      localPath.cubicTo(34.515049F, 25.260746F, 39.44799F, 20.333082F, 39.44799F, 14.254499F);
      localPath.lineTo(39.44799F, 11.006248F);
      localPath.cubicTo(39.44799F, 4.930493F, 34.524391F, 1.272676E-007F, 28.450821F, 1.046543E-007F);
      localPath.lineTo(11.339516F, 4.094504E-008F);
      localPath.cubicTo(5.27529F, 1.836656E-008F, 0.3423465F, 4.927665F, 0.3423465F, 11.006247F);
      localPath.lineTo(0.3423465F, 14.160372F);
      localPath.lineTo(4.420356F, 14.160372F);
      localPath.cubicTo(4.375393F, 13.817222F, 4.352197F, 13.467262F, 4.352197F, 13.111929F);
      localPath.lineTo(4.352197F, 12.010028F);
      localPath.cubicTo(4.352197F, 7.590427F, 7.932285F, 4.007634F, 12.355284F, 4.007634F);
      localPath.lineTo(27.42606F, 4.007634F);
      localPath.cubicTo(31.846043F, 4.007634F, 35.429146F, 7.593756F, 35.429146F, 12.010028F);
      localPath.lineTo(35.429146F, 13.111929F);
      localPath.cubicTo(35.429146F, 17.531528F, 31.849058F, 21.114323F, 27.42606F, 21.114323F);
      localPath.lineTo(19.357758F, 21.114323F);
      localPath.lineTo(19.357758F, 25.260746F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject3, -1.0F, 0.0F, 40.0F, 0.0F, -1.0F, 26.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(19.357758F, 25.260746F);
      ((Path)localObject4).lineTo(28.450821F, 25.260746F);
      ((Path)localObject4).cubicTo(34.515049F, 25.260746F, 39.44799F, 20.333082F, 39.44799F, 14.254499F);
      ((Path)localObject4).lineTo(39.44799F, 11.006248F);
      ((Path)localObject4).cubicTo(39.44799F, 4.930493F, 34.524391F, 1.272676E-007F, 28.450821F, 1.046543E-007F);
      ((Path)localObject4).lineTo(11.339516F, 4.094504E-008F);
      ((Path)localObject4).cubicTo(5.27529F, 1.836656E-008F, 0.3423465F, 4.927665F, 0.3423465F, 11.006247F);
      ((Path)localObject4).lineTo(0.3423465F, 14.160372F);
      ((Path)localObject4).lineTo(4.420356F, 14.160372F);
      ((Path)localObject4).cubicTo(4.375393F, 13.817222F, 4.352197F, 13.467262F, 4.352197F, 13.111929F);
      ((Path)localObject4).lineTo(4.352197F, 12.010028F);
      ((Path)localObject4).cubicTo(4.352197F, 7.590427F, 7.932285F, 4.007634F, 12.355284F, 4.007634F);
      ((Path)localObject4).lineTo(27.42606F, 4.007634F);
      ((Path)localObject4).cubicTo(31.846043F, 4.007634F, 35.429146F, 7.593756F, 35.429146F, 12.010028F);
      ((Path)localObject4).lineTo(35.429146F, 13.111929F);
      ((Path)localObject4).cubicTo(35.429146F, 17.531528F, 31.849058F, 21.114323F, 27.42606F, 21.114323F);
      ((Path)localObject4).lineTo(19.357758F, 21.114323F);
      ((Path)localObject4).lineTo(19.357758F, 25.260746F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.cr
 * JD-Core Version:    0.6.2
 */