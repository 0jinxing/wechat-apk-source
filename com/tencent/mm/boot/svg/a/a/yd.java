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

public final class yd extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      Paint localPaint3 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint2.setColor(-3355444);
      localPaint3.setColor(-3355444);
      localPaint3.setStrokeWidth(7.2F);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(92.369286F, 78.0F);
      localPath.cubicTo(93.369957F, 78.0F, 94.176552F, 78.0F, 94.744667F, 78.0F);
      localPath.cubicTo(100.38519F, 78.0F, 105.0F, 73.144463F, 105.0F, 67.209633F);
      localPath.lineTo(105.0F, 41.733364F);
      localPath.cubicTo(104.99974F, 21.032589F, 89.9217F, 17.842987F, 89.9217F, 17.842987F);
      localPath.cubicTo(77.424179F, 8.975469F, 60.473461F, 10.228277F, 49.229244F, 21.416538F);
      localPath.cubicTo(42.930489F, 27.68936F, 39.0F, 36.567982F, 39.0F, 46.414097F);
      localPath.cubicTo(39.0F, 53.155041F, 39.0F, 61.260597F, 39.0F, 67.209633F);
      localPath.cubicTo(39.0F, 73.144463F, 43.614807F, 78.0F, 49.255329F, 78.0F);
      localPath.cubicTo(49.823959F, 78.0F, 50.568138F, 78.0F, 51.45837F, 78.0F);
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint3 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint3.setColor(-3355444);
      localPaint3.setStrokeWidth(4.8F);
      localPaint3.setStrokeCap(Paint.Cap.ROUND);
      localPaint3.setStrokeJoin(Paint.Join.MITER);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(121.4364F, 135.0F);
      localPath.cubicTo(120.62577F, 131.00125F, 119.10564F, 123.8438F, 116.2644F, 109.92406F);
      localPath.cubicTo(114.56845F, 101.70597F, 109.70799F, 101.61865F, 91.071503F, 96.256088F);
      localPath.lineTo(84.509262F, 91.926811F);
      localPath.cubicTo(84.509262F, 90.289047F, 84.509262F, 87.918556F, 84.509262F, 86.285713F);
      localPath.moveTo(60.516712F, 86.285713F);
      localPath.cubicTo(60.436764F, 88.272484F, 60.436764F, 89.957146F, 60.436764F, 91.926811F);
      localPath.lineTo(53.874256F, 96.255829F);
      localPath.cubicTo(38.589008F, 100.65403F, 65.34742F, 92.954918F, 37.802261F, 100.88023F);
      localPath.cubicTo(32.92215F, 102.69003F, 29.831207F, 104.25006F, 28.681366F, 109.92381F);
      localPath.cubicTo(28.677187F, 109.944F, 25.258446F, 126.16524F, 23.549999F, 135.0F);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint3 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint3.setColor(-3355444);
      localPaint3.setStrokeWidth(4.8F);
      localPaint3.setStrokeCap(Paint.Cap.ROUND);
      localPaint3.setStrokeJoin(Paint.Join.MITER);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(53.55265F, 96.522469F);
      localPath.cubicTo(51.427998F, 98.403458F, 50.553375F, 109.06194F, 57.912029F, 112.0068F);
      localPath.lineTo(72.0F, 114.85714F);
      localPath.lineTo(59.999092F, 92.0F);
      localPath.cubicTo(57.618565F, 93.317734F, 55.469753F, 94.825226F, 53.55265F, 96.522469F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint3 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint3.setColor(-3355444);
      localPaint3.setStrokeWidth(4.8F);
      localPaint3.setStrokeCap(Paint.Cap.ROUND);
      localPaint3.setStrokeJoin(Paint.Join.MITER);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 165.4158F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(73.502655F, 96.522469F);
      ((Path)localObject1).cubicTo(71.377998F, 98.403458F, 70.50338F, 109.06194F, 77.86203F, 112.0068F);
      ((Path)localObject1).lineTo(93.415794F, 114.85714F);
      ((Path)localObject1).lineTo(79.949089F, 92.0F);
      ((Path)localObject1).cubicTo(77.568565F, 93.317734F, 75.419754F, 94.825226F, 73.502655F, 96.522469F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint1.setColor(-1);
      ((Paint)localObject1).setColor(-3355444);
      ((Paint)localObject1).setStrokeWidth(4.8F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(47.775021F, 46.752438F);
      ((Path)localObject2).cubicTo(47.779369F, 58.125359F, 47.762238F, 64.512611F, 47.802891F, 65.109383F);
      ((Path)localObject2).cubicTo(49.16201F, 83.591377F, 66.038765F, 93.150574F, 80.461891F, 87.548721F);
      ((Path)localObject2).cubicTo(89.740509F, 83.946564F, 96.205788F, 74.660339F, 96.205788F, 63.938461F);
      ((Path)localObject2).lineTo(96.205788F, 46.752438F);
      ((Path)localObject2).cubicTo(96.205788F, 46.752438F, 96.632751F, 39.90889F, 93.461212F, 34.023418F);
      ((Path)localObject2).cubicTo(92.401733F, 32.057518F, 89.972397F, 31.401417F, 88.139786F, 32.602669F);
      ((Path)localObject2).cubicTo(84.686768F, 34.865761F, 78.039711F, 37.801712F, 68.673141F, 35.638126F);
      ((Path)localObject2).cubicTo(54.432304F, 32.34832F, 47.775021F, 46.752438F, 47.775021F, 46.752438F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, localPaint1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.yd
 * JD-Core Version:    0.6.2
 */