package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bumptech.glide.c.b.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class p
{
  private static final Paint aFE;
  private static final Paint aFF;
  private static final Paint aFG;
  private static final Set<String> aFH;
  private static final Lock aFI;

  static
  {
    AppMethodBeat.i(92267);
    aFE = new Paint(6);
    aFF = new Paint(7);
    Object localObject = new HashSet(Arrays.asList(new String[] { "XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079" }));
    aFH = (Set)localObject;
    if (((Set)localObject).contains(Build.MODEL));
    for (localObject = new ReentrantLock(); ; localObject = new p.a())
    {
      aFI = (Lock)localObject;
      localObject = new Paint(7);
      aFG = (Paint)localObject;
      ((Paint)localObject).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      AppMethodBeat.o(92267);
      return;
    }
  }

  public static Bitmap a(e parame, Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(92266);
    if (!dj(paramInt))
      AppMethodBeat.o(92266);
    while (true)
    {
      return paramBitmap;
      Matrix localMatrix = new Matrix();
      label72: Object localObject;
      switch (paramInt)
      {
      default:
        RectF localRectF = new RectF(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
        localMatrix.mapRect(localRectF);
        paramInt = Math.round(localRectF.width());
        int i = Math.round(localRectF.height());
        if (paramBitmap.getConfig() != null)
        {
          localObject = paramBitmap.getConfig();
          parame = parame.c(paramInt, i, (Bitmap.Config)localObject);
          localMatrix.postTranslate(-localRectF.left, -localRectF.top);
          aFI.lock();
        }
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      }
      try
      {
        localObject = new android/graphics/Canvas;
        ((Canvas)localObject).<init>(parame);
        ((Canvas)localObject).drawBitmap(paramBitmap, localMatrix, aFE);
        ((Canvas)localObject).setBitmap(null);
        aFI.unlock();
        AppMethodBeat.o(92266);
        paramBitmap = parame;
        continue;
        localMatrix.setScale(-1.0F, 1.0F);
        break label72;
        localMatrix.setRotate(180.0F);
        break label72;
        localMatrix.setRotate(180.0F);
        localMatrix.postScale(-1.0F, 1.0F);
        break label72;
        localMatrix.setRotate(90.0F);
        localMatrix.postScale(-1.0F, 1.0F);
        break label72;
        localMatrix.setRotate(90.0F);
        break label72;
        localMatrix.setRotate(-90.0F);
        localMatrix.postScale(-1.0F, 1.0F);
        break label72;
        localMatrix.setRotate(-90.0F);
        break label72;
        localObject = Bitmap.Config.ARGB_8888;
      }
      finally
      {
        aFI.unlock();
        AppMethodBeat.o(92266);
      }
    }
  }

  public static int di(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 0;
    case 5:
    case 6:
    case 3:
    case 4:
    case 7:
    case 8:
    }
    while (true)
    {
      return paramInt;
      paramInt = 90;
      continue;
      paramInt = 180;
      continue;
      paramInt = 270;
    }
  }

  public static boolean dj(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static Lock nx()
  {
    return aFI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.p
 * JD-Core Version:    0.6.2
 */