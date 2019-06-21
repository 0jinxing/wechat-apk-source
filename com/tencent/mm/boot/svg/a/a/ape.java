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

public final class ape extends c
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
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-789517);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 4.0F);
      localPath.cubicTo(0.0F, 1.790861F, 1.790861F, 0.0F, 4.0F, 0.0F);
      localPath.lineTo(72.0F, 0.0F);
      localPath.cubicTo(74.209137F, 0.0F, 76.0F, 1.790861F, 76.0F, 4.0F);
      localPath.lineTo(76.0F, 72.0F);
      localPath.cubicTo(76.0F, 74.209137F, 74.209137F, 76.0F, 72.0F, 76.0F);
      localPath.lineTo(4.0F, 76.0F);
      localPath.cubicTo(1.790861F, 76.0F, 0.0F, 74.209137F, 0.0F, 72.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-5658199);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(25.5F, 0.0F);
      ((Path)localObject2).cubicTo(27.985281F, 0.0F, 30.0F, 2.014719F, 30.0F, 4.5F);
      ((Path)localObject2).cubicTo(30.0F, 6.985282F, 27.985281F, 9.0F, 25.5F, 9.0F);
      ((Path)localObject2).cubicTo(23.014719F, 9.0F, 21.0F, 6.985282F, 21.0F, 4.5F);
      ((Path)localObject2).cubicTo(21.0F, 2.014719F, 23.014719F, 0.0F, 25.5F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.140231F, 10.026411F);
      ((Path)localObject1).cubicTo(17.423513F, 9.986368F, 30.706797F, 9.996379F, 44.0F, 10.026411F);
      ((Path)localObject1).cubicTo(43.940479F, 11.688178F, 43.910717F, 13.349946F, 43.890877F, 15.011714F);
      ((Path)localObject1).lineTo(10.786833F, 15.011714F);
      ((Path)localObject1).cubicTo(10.608268F, 23.610863F, 11.35229F, 32.330139F, 9.645998F, 40.809158F);
      ((Path)localObject1).cubicTo(8.71349F, 45.454102F, 5.162022F, 48.867733F, 1.154221F, 51.0F);
      ((Path)localObject1).cubicTo(0.191952F, 46.204899F, 4.050949F, 42.450905F, 3.961666F, 37.765923F);
      ((Path)localObject1).cubicTo(4.358478F, 28.526091F, 4.021188F, 19.276251F, 4.140231F, 10.026411F);
      ((Path)localObject1).lineTo(4.140231F, 10.026411F);
      ((Path)localObject1).lineTo(4.140231F, 10.026411F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(22.522583F, 17.0F);
      ((Path)localObject1).cubicTo(24.810589F, 17.040438F, 27.108543F, 17.050549F, 29.396551F, 17.060658F);
      ((Path)localObject1).cubicTo(29.476133F, 18.395117F, 29.545769F, 19.729574F, 29.615402F, 21.074142F);
      ((Path)localObject1).cubicTo(34.410271F, 21.084253F, 39.205135F, 21.074142F, 44.0F, 21.084253F);
      ((Path)localObject1).cubicTo(44.0F, 22.529917F, 44.0F, 23.985689F, 43.990051F, 25.431355F);
      ((Path)localObject1).cubicTo(39.145447F, 25.441463F, 34.310791F, 25.431355F, 29.476133F, 25.441463F);
      ((Path)localObject1).cubicTo(29.505978F, 27.463371F, 29.515924F, 29.485279F, 29.496029F, 31.507185F);
      ((Path)localObject1).cubicTo(33.654232F, 31.486967F, 37.802486F, 31.517296F, 41.950741F, 31.517296F);
      ((Path)localObject1).cubicTo(41.851265F, 36.046368F, 42.139751F, 40.595661F, 41.851265F, 45.124733F);
      ((Path)localObject1).cubicTo(41.920898F, 47.551022F, 39.463779F, 49.158436F, 37.255356F, 48.946136F);
      ((Path)localObject1).cubicTo(29.177698F, 49.027012F, 21.090092F, 49.027012F, 13.002487F, 48.87537F);
      ((Path)localObject1).cubicTo(13.002487F, 43.102825F, 12.992539F, 37.33028F, 13.012435F, 31.557734F);
      ((Path)localObject1).cubicTo(16.175852F, 31.547625F, 19.33927F, 31.466747F, 22.502687F, 31.466747F);
      ((Path)localObject1).cubicTo(22.522583F, 26.644499F, 22.522583F, 21.822248F, 22.522583F, 17.0F);
      ((Path)localObject1).lineTo(22.522583F, 17.0F);
      ((Path)localObject1).lineTo(22.522583F, 17.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(20.007324F, 36.017189F);
      ((Path)localObject1).cubicTo(19.997559F, 39.004719F, 19.997559F, 41.981876F, 20.007324F, 44.959034F);
      ((Path)localObject1).cubicTo(24.939476F, 44.979782F, 29.861862F, 45.104259F, 34.784245F, 44.782684F);
      ((Path)localObject1).cubicTo(34.960045F, 41.857395F, 35.028412F, 38.932106F, 34.989346F, 36.006813F);
      ((Path)localObject1).cubicTo(29.998594F, 35.996441F, 24.998075F, 35.996441F, 20.007324F, 36.017189F);
      ((Path)localObject1).lineTo(20.007324F, 36.017189F);
      ((Path)localObject1).lineTo(20.007324F, 36.017189F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ape
 * JD-Core Version:    0.6.2
 */