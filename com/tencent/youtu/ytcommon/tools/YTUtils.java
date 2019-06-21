package com.tencent.youtu.ytcommon.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public class YTUtils
{
  private static final String TAG = "ToolUtils";
  private static Map<String, String> mLoadedLibrary;

  static
  {
    AppMethodBeat.i(118118);
    mLoadedLibrary = new HashMap();
    AppMethodBeat.o(118118);
  }

  public static int dip2px(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(118113);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    AppMethodBeat.o(118113);
    return i;
  }

  public static void loadLibrary(String paramString)
  {
    AppMethodBeat.i(118117);
    if (mLoadedLibrary.get(paramString) == null)
    {
      YTLogger.i("ToolUtils", "[YTUtils.loadLibrary] " + System.getProperty("java.library.path"));
      System.loadLibrary(paramString);
      mLoadedLibrary.put(paramString, "loaded");
    }
    AppMethodBeat.o(118117);
  }

  public static void prepareMatrix(Matrix paramMatrix, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(118112);
    YTLogger.e("ToolUtils", "prepareMatrix viewWidth=" + paramInt2 + ",viewHeight=" + paramInt3 + ",displayOrientation=" + paramInt1);
    if (paramBoolean);
    for (float f = -1.0F; ; f = 1.0F)
    {
      paramMatrix.setScale(f, 1.0F);
      paramMatrix.postRotate(paramInt1);
      paramMatrix.postScale(paramInt2 / 2000.0F, paramInt3 / 2000.0F);
      paramMatrix.postTranslate(paramInt2 / 2.0F, paramInt3 / 2.0F);
      AppMethodBeat.o(118112);
      return;
    }
  }

  public static Rect trans2ScreenRect(Context paramContext, int paramInt1, int paramInt2, Rect paramRect)
  {
    AppMethodBeat.i(118114);
    long l = System.currentTimeMillis();
    YTLogger.e("ToolUtils", "trans2ScreenRect srcRect=" + paramRect.toString());
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    YTLogger.e("ToolUtils", "trans2ScreenRect dm.widthPixels=" + localDisplayMetrics.widthPixels);
    YTLogger.e("ToolUtils", "trans2ScreenRect dm.heightPixels=" + localDisplayMetrics.heightPixels);
    YTLogger.e("ToolUtils", "trans2ScreenRect previewWidth=".concat(String.valueOf(paramInt1)));
    YTLogger.e("ToolUtils", "trans2ScreenRect previewHeight=".concat(String.valueOf(paramInt2)));
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    double d = paramInt1 * 1.0F / paramInt2;
    boolean bool;
    int k;
    label164: label173: label195: label200: float f1;
    float f2;
    float f3;
    if (i > j)
    {
      bool = true;
      if (!bool)
        break label607;
      k = i;
      if (!bool)
        break label614;
      i = j;
      if (k >= i * d)
        break label617;
      k = (int)(i * d);
      if (!bool)
        break label629;
      YTLogger.d("ToolUtils", "trans2ScreenRect aspectRatio=".concat(String.valueOf(d)));
      YTLogger.d("ToolUtils", "trans2ScreenRect widthLonger=".concat(String.valueOf(bool)));
      YTLogger.e("ToolUtils", "trans2ScreenRect screenWidth=".concat(String.valueOf(k)));
      YTLogger.e("ToolUtils", "trans2ScreenRect screenHeight=".concat(String.valueOf(i)));
      f1 = 0.0F;
      f2 = 0.0F;
      if (paramInt2 * i <= k * paramInt1)
        break label644;
      f3 = i * 1.0F / paramInt1;
      f1 = (k - paramInt2 * f3) * 0.5F;
    }
    while (true)
    {
      paramContext = new Rect();
      paramContext.set((int)(paramRect.left * f3 - f1), (int)(paramRect.top * f3 - f2), (int)(paramRect.right * f3), (int)(paramRect.bottom * f3));
      YTLogger.d("ToolUtils", "scale=".concat(String.valueOf(f3)));
      YTLogger.d("ToolUtils", "dx=".concat(String.valueOf(f1)));
      YTLogger.d("ToolUtils", "dy=".concat(String.valueOf(f2)));
      YTLogger.d("ToolUtils", "screenWidth=".concat(String.valueOf(k)));
      YTLogger.d("ToolUtils", "screenHeight=".concat(String.valueOf(i)));
      YTLogger.d("ToolUtils", "dWidth=".concat(String.valueOf(paramInt2)));
      YTLogger.d("ToolUtils", "dHeight=".concat(String.valueOf(paramInt1)));
      YTLogger.d("ToolUtils", "dst=" + paramContext.toString());
      paramInt1 = (k - localDisplayMetrics.widthPixels) / 2;
      paramInt2 = (i - localDisplayMetrics.heightPixels) / 2;
      paramRect.set((int)(paramRect.left * f3 - paramInt1), (int)(paramRect.top * f3 - paramInt2), (int)(paramRect.right * f3 - paramInt1), (int)(f3 * paramRect.bottom - paramInt2));
      YTLogger.d("ToolUtils", "target=" + paramRect.toString() + ",time=" + (System.currentTimeMillis() - l));
      AppMethodBeat.o(118114);
      return paramRect;
      bool = false;
      break;
      label607: k = j;
      break label164;
      label614: break label173;
      label617: i = (int)(k / d);
      break label195;
      label629: j = k;
      k = i;
      i = j;
      break label200;
      label644: f3 = k * 1.0F / paramInt2;
      f2 = (i - paramInt1 * f3) * 0.5F;
    }
  }

  public static Rect trans2ScreenRectForYT(Context paramContext, int paramInt1, int paramInt2, Rect paramRect)
  {
    AppMethodBeat.i(118115);
    paramContext = paramContext.getResources().getDisplayMetrics();
    YTLogger.e("ToolUtils", "trans2ScreenRectForYT dm.widthPixels=" + paramContext.widthPixels);
    YTLogger.e("ToolUtils", "trans2ScreenRectForYT dm.heightPixels=" + paramContext.heightPixels);
    YTLogger.e("ToolUtils", "trans2ScreenRectForYT previewHeight=".concat(String.valueOf(paramInt2)));
    float f = paramContext.widthPixels * 1.0F / paramInt2;
    paramRect.set((int)(paramRect.left * f), (int)(paramRect.top * f), (int)((paramRect.left + paramRect.width()) * f), (int)(f * (paramRect.top + paramRect.height())));
    AppMethodBeat.o(118115);
    return paramRect;
  }

  public static Rect translateToMeteringAreaCoordinate(int paramInt1, int paramInt2, Rect paramRect)
  {
    AppMethodBeat.i(118116);
    Rect localRect = new Rect();
    Matrix localMatrix1 = new Matrix();
    prepareMatrix(localMatrix1, true, 90, paramInt1, paramInt2);
    localMatrix1.postRotate(0.0F);
    paramRect = new RectF(paramRect.left * 1.0F, paramRect.top * 1.0F, paramRect.right * 1.0F, paramRect.bottom * 1.0F);
    YTLogger.e("ToolUtils", "translationToMeteringAreaCoordinate old rectF.left=" + paramRect.left + ",rectF.top=" + paramRect.top + ",rectF.right=" + paramRect.right + ",rectF.bottom=" + paramRect.bottom);
    Matrix localMatrix2 = new Matrix();
    localMatrix1.invert(localMatrix2);
    localMatrix2.mapRect(paramRect);
    YTLogger.e("ToolUtils", "translationToMeteringAreaCoordinate new rectF.left=" + paramRect.left + ",rectF.top=" + paramRect.top + ",rectF.right=" + paramRect.right + ",rectF.bottom=" + paramRect.bottom);
    localRect.set(Math.round(paramRect.left), Math.round(paramRect.top), Math.round(paramRect.right), Math.round(paramRect.bottom));
    AppMethodBeat.o(118116);
    return localRect;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTUtils
 * JD-Core Version:    0.6.2
 */