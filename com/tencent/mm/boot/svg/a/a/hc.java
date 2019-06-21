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

public final class hc extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
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
      localPaint2.setColor(-15432210);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(0.0F, 12.0F);
      ((Path)localObject3).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject3).lineTo(108.0F, 0.0F);
      ((Path)localObject3).cubicTo(114.62742F, 0.0F, 120.0F, 5.372582F, 120.0F, 12.0F);
      ((Path)localObject3).lineTo(120.0F, 108.0F);
      ((Path)localObject3).cubicTo(120.0F, 114.62742F, 114.62742F, 120.0F, 108.0F, 120.0F);
      ((Path)localObject3).lineTo(12.0F, 120.0F);
      ((Path)localObject3).cubicTo(5.372582F, 120.0F, 0.0F, 114.62742F, 0.0F, 108.0F);
      ((Path)localObject3).lineTo(0.0F, 12.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(35.788731F, 51.0F);
      ((Path)localObject1).lineTo(24.0F, 51.0F);
      ((Path)localObject1).cubicTo(22.343145F, 51.0F, 21.0F, 49.656853F, 21.0F, 48.0F);
      ((Path)localObject1).cubicTo(21.0F, 46.343147F, 22.343145F, 45.0F, 24.0F, 45.0F);
      ((Path)localObject1).lineTo(52.901409F, 45.0F);
      ((Path)localObject1).cubicTo(54.591549F, 45.0F, 56.070423F, 43.943661F, 56.281689F, 42.253521F);
      ((Path)localObject1).lineTo(56.281689F, 41.619717F);
      ((Path)localObject1).lineTo(56.281689F, 36.338028F);
      ((Path)localObject1).cubicTo(56.281689F, 34.647888F, 56.915493F, 32.957745F, 58.183098F, 31.690142F);
      ((Path)localObject1).cubicTo(58.816902F, 30.84507F, 60.084507F, 30.0F, 61.140846F, 30.0F);
      ((Path)localObject1).cubicTo(62.619717F, 30.0F, 63.676056F, 31.267605F, 63.46479F, 32.746479F);
      ((Path)localObject1).cubicTo(63.46479F, 32.746479F, 63.253521F, 34.859154F, 63.253521F, 35.915493F);
      ((Path)localObject1).cubicTo(63.253521F, 38.239437F, 63.46479F, 40.774647F, 64.098595F, 43.098591F);
      ((Path)localObject1).cubicTo(64.30986F, 43.943661F, 64.521126F, 44.577465F, 64.732391F, 45.211269F);
      ((Path)localObject1).cubicTo(65.577461F, 47.957745F, 66.0F, 50.704224F, 66.0F, 53.661972F);
      ((Path)localObject1).lineTo(66.0F, 55.985916F);
      ((Path)localObject1).cubicTo(65.788734F, 57.887325F, 64.943665F, 59.788731F, 63.887325F, 61.267605F);
      ((Path)localObject1).cubicTo(61.985916F, 64.014084F, 58.816902F, 65.704224F, 55.225353F, 66.0F);
      ((Path)localObject1).lineTo(49.732395F, 66.0F);
      ((Path)localObject1).cubicTo(46.563381F, 65.915489F, 43.605633F, 64.436623F, 41.492958F, 62.323944F);
      ((Path)localObject1).cubicTo(41.070423F, 61.901409F, 40.647888F, 61.267605F, 40.225353F, 60.633804F);
      ((Path)localObject1).cubicTo(38.112675F, 58.098591F, 36.633804F, 54.929577F, 35.788731F, 51.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(36.211269F, 21.0F);
      ((Path)localObject1).lineTo(48.0F, 21.0F);
      ((Path)localObject1).cubicTo(49.656853F, 21.0F, 51.0F, 22.343145F, 51.0F, 24.0F);
      ((Path)localObject1).cubicTo(51.0F, 25.656855F, 49.656853F, 27.0F, 48.0F, 27.0F);
      ((Path)localObject1).lineTo(19.098591F, 27.0F);
      ((Path)localObject1).cubicTo(17.408451F, 27.0F, 15.929578F, 28.056337F, 15.71831F, 29.746479F);
      ((Path)localObject1).lineTo(15.71831F, 30.380281F);
      ((Path)localObject1).lineTo(15.71831F, 35.661972F);
      ((Path)localObject1).cubicTo(15.71831F, 37.352112F, 15.084507F, 39.042255F, 13.816901F, 40.30986F);
      ((Path)localObject1).cubicTo(13.183099F, 41.15493F, 11.915493F, 42.0F, 10.859155F, 42.0F);
      ((Path)localObject1).cubicTo(9.380281F, 42.0F, 8.323944F, 40.732395F, 8.535212F, 39.253521F);
      ((Path)localObject1).cubicTo(8.535212F, 39.253521F, 8.746479F, 37.140846F, 8.746479F, 36.084507F);
      ((Path)localObject1).cubicTo(8.746479F, 33.760563F, 8.535212F, 31.225351F, 7.901409F, 28.901409F);
      ((Path)localObject1).cubicTo(7.690141F, 28.056337F, 7.478873F, 27.422535F, 7.267606F, 26.788733F);
      ((Path)localObject1).cubicTo(6.422535F, 24.042253F, 6.0F, 21.295774F, 6.0F, 18.338028F);
      ((Path)localObject1).lineTo(6.0F, 16.014084F);
      ((Path)localObject1).cubicTo(6.211268F, 14.112676F, 7.056338F, 12.211267F, 8.112676F, 10.732394F);
      ((Path)localObject1).cubicTo(10.014085F, 7.985916F, 13.183099F, 6.295775F, 16.774649F, 6.0F);
      ((Path)localObject1).lineTo(22.267605F, 6.0F);
      ((Path)localObject1).cubicTo(25.436619F, 6.084507F, 28.394365F, 7.56338F, 30.507042F, 9.676056F);
      ((Path)localObject1).cubicTo(30.929577F, 10.098592F, 31.352112F, 10.732394F, 31.774649F, 11.366198F);
      ((Path)localObject1).cubicTo(33.887325F, 13.901408F, 35.366196F, 17.070423F, 36.211269F, 21.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.hc
 * JD-Core Version:    0.6.2
 */