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

public final class im extends c
{
  private final int height = 102;
  private final int width = 102;

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
        paramInt = 102;
        continue;
        paramInt = 102;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      c.a(localPaint1, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint1.setColor(-1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(64.103157F, 2.0F);
      ((Path)localObject2).lineTo(103.0F, 40.826099F);
      ((Path)localObject2).lineTo(102.95464F, 104.0F);
      ((Path)localObject2).lineTo(1.0F, 2.0F);
      ((Path)localObject2).lineTo(64.103157F, 2.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(42.299107F, 26.234137F);
      ((Path)localObject2).lineTo(51.097515F, 17.435728F);
      ((Path)localObject2).lineTo(51.180771F, 17.518986F);
      ((Path)localObject2).lineTo(48.626644F, 32.561672F);
      ((Path)localObject2).lineTo(50.939339F, 34.874371F);
      ((Path)localObject2).lineTo(64.374367F, 21.439341F);
      ((Path)localObject2).lineTo(61.700893F, 18.765863F);
      ((Path)localObject2).lineTo(52.949036F, 27.517719F);
      ((Path)localObject2).lineTo(52.875031F, 27.443712F);
      ((Path)localObject2).lineTo(55.391857F, 12.456829F);
      ((Path)localObject2).lineTo(53.060661F, 10.125631F);
      ((Path)localObject2).lineTo(39.625629F, 23.560659F);
      ((Path)localObject2).lineTo(42.299107F, 26.234137F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(64.706299F, 43.486088F);
      ((Path)localObject2).lineTo(58.417786F, 37.197571F);
      ((Path)localObject2).lineTo(61.806801F, 33.808556F);
      ((Path)localObject2).lineTo(67.739548F, 39.741299F);
      ((Path)localObject2).lineTo(69.899574F, 37.581264F);
      ((Path)localObject2).lineTo(63.966831F, 31.648521F);
      ((Path)localObject2).lineTo(67.206879F, 28.408474F);
      ((Path)localObject2).lineTo(73.495399F, 34.696991F);
      ((Path)localObject2).lineTo(75.813705F, 32.378681F);
      ((Path)localObject2).lineTo(66.621323F, 23.186291F);
      ((Path)localObject2).lineTo(53.186291F, 36.621319F);
      ((Path)localObject2).lineTo(62.378681F, 45.813709F);
      ((Path)localObject2).lineTo(64.706299F, 43.486088F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(81.915909F, 46.990662F);
      ((Path)localObject2).lineTo(82.0F, 47.074749F);
      ((Path)localObject2).lineTo(75.379944F, 58.814972F);
      ((Path)localObject2).lineTo(78.042809F, 61.477837F);
      ((Path)localObject2).lineTo(95.056351F, 51.621319F);
      ((Path)localObject2).lineTo(92.131874F, 48.696842F);
      ((Path)localObject2).lineTo(80.272125F, 56.296009F);
      ((Path)localObject2).lineTo(80.19738F, 56.221264F);
      ((Path)localObject2).lineTo(87.404121F, 43.969093F);
      ((Path)localObject2).lineTo(85.021561F, 41.586533F);
      ((Path)localObject2).lineTo(72.769394F, 48.793278F);
      ((Path)localObject2).lineTo(72.694649F, 48.718529F);
      ((Path)localObject2).lineTo(80.303154F, 36.86813F);
      ((Path)localObject2).lineTo(77.378677F, 33.943649F);
      ((Path)localObject2).lineTo(67.512817F, 50.947849F);
      ((Path)localObject2).lineTo(70.175682F, 53.610714F);
      ((Path)localObject2).lineTo(81.915909F, 46.990662F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, -0.7071068F, 46.286797F, 0.7071068F, 0.7071068F, -36.746208F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(41.780869F, 47.0F);
      ((Path)localObject1).lineTo(41.780869F, 34.557171F);
      ((Path)localObject1).lineTo(41.898609F, 34.557171F);
      ((Path)localObject1).lineTo(50.729355F, 47.0F);
      ((Path)localObject1).lineTo(54.0F, 47.0F);
      ((Path)localObject1).lineTo(54.0F, 28.0F);
      ((Path)localObject1).lineTo(50.219131F, 28.0F);
      ((Path)localObject1).lineTo(50.219131F, 40.376991F);
      ((Path)localObject1).lineTo(50.114471F, 40.376991F);
      ((Path)localObject1).lineTo(41.29681F, 28.0F);
      ((Path)localObject1).lineTo(38.0F, 28.0F);
      ((Path)localObject1).lineTo(38.0F, 47.0F);
      ((Path)localObject1).lineTo(41.780869F, 47.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(70.0F, 43.708248F);
      ((Path)localObject1).lineTo(61.106693F, 43.708248F);
      ((Path)localObject1).lineTo(61.106693F, 38.915455F);
      ((Path)localObject1).lineTo(69.496864F, 38.915455F);
      ((Path)localObject1).lineTo(69.496864F, 35.860706F);
      ((Path)localObject1).lineTo(61.106693F, 35.860706F);
      ((Path)localObject1).lineTo(61.106693F, 31.278585F);
      ((Path)localObject1).lineTo(70.0F, 31.278585F);
      ((Path)localObject1).lineTo(70.0F, 28.0F);
      ((Path)localObject1).lineTo(57.0F, 28.0F);
      ((Path)localObject1).lineTo(57.0F, 47.0F);
      ((Path)localObject1).lineTo(70.0F, 47.0F);
      ((Path)localObject1).lineTo(70.0F, 43.708248F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(84.433929F, 34.017326F);
      ((Path)localObject1).lineTo(84.552856F, 34.017326F);
      ((Path)localObject1).lineTo(88.173363F, 47.0F);
      ((Path)localObject1).lineTo(91.939217F, 47.0F);
      ((Path)localObject1).lineTo(97.0F, 28.0F);
      ((Path)localObject1).lineTo(92.864166F, 28.0F);
      ((Path)localObject1).lineTo(89.851479F, 41.759529F);
      ((Path)localObject1).lineTo(89.745773F, 41.759529F);
      ((Path)localObject1).lineTo(86.178116F, 28.0F);
      ((Path)localObject1).lineTo(82.80867F, 28.0F);
      ((Path)localObject1).lineTo(79.241013F, 41.759529F);
      ((Path)localObject1).lineTo(79.135307F, 41.759529F);
      ((Path)localObject1).lineTo(76.135834F, 28.0F);
      ((Path)localObject1).lineTo(72.0F, 28.0F);
      ((Path)localObject1).lineTo(77.047569F, 47.0F);
      ((Path)localObject1).lineTo(80.813423F, 47.0F);
      ((Path)localObject1).lineTo(84.433929F, 34.017326F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.im
 * JD-Core Version:    0.6.2
 */