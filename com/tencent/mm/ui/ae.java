package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.h.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class ae
{
  public static String yqJ;
  private static Rect yqK;
  private static boolean yqL;
  private static SparseArray<WindowInsets> yqM;
  private static SparseArray<Rect> yqN;
  private static final Object yqO;

  static
  {
    AppMethodBeat.i(65415);
    yqJ = "has_cutout";
    yqK = new Rect(0, 0, 0, 0);
    yqL = false;
    yqM = new SparseArray(4);
    yqN = new SparseArray(4);
    yqO = new Object();
    AppMethodBeat.o(65415);
  }

  private static boolean A(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(65405);
    if ((e.hb(paramContext)) || (com.tencent.mm.sdk.h.d.ha(paramContext)) || (com.tencent.mm.sdk.h.a.gZ(paramContext)) || (B(paramContext, paramBoolean)));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      ab.i("MicroMsg.UIUtils", "hasCutOut:%s", new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(65405);
      return paramBoolean;
    }
  }

  @TargetApi(28)
  private static boolean B(Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(65407);
    if (paramContext == null)
    {
      AppMethodBeat.o(65407);
      paramBoolean = bool;
      return paramBoolean;
    }
    View localView;
    int i;
    if (Build.VERSION.SDK_INT >= 28)
    {
      yqL = as.amF(ah.doA()).getBoolean(yqJ, false);
      localView = ((Activity)paramContext).getWindow().getDecorView();
      i = ((Activity)paramContext).getWindowManager().getDefaultDisplay().getRotation();
    }
    while (true)
    {
      synchronized (yqO)
      {
        Object localObject2 = (WindowInsets)yqM.get(i);
        paramContext = (Context)localObject2;
        if (localObject2 == null)
        {
          if ((al.isMainThread()) && (localView.isAttachedToWindow()))
          {
            paramContext = localView.getRootWindowInsets();
            yqM.put(i, localView.getRootWindowInsets());
          }
        }
        else
        {
          if (paramContext != null)
          {
            paramContext = paramContext.getDisplayCutout();
            if (paramContext != null)
            {
              paramContext = paramContext.getBoundingRects();
              if ((paramContext != null) && (paramContext.size() > 0))
              {
                yqL = true;
                as.amF(ah.doA()).putBoolean(yqJ, yqL);
              }
            }
          }
          paramBoolean = yqL;
          AppMethodBeat.o(65407);
          break;
        }
        if ((paramBoolean) && (!al.isMainThread()) && (localView.isAttachedToWindow()))
        {
          paramContext = new com/tencent/mm/ui/ae$2;
          paramContext.<init>(localView);
          localObject2 = new com/tencent/mm/sdk/platformtools/ak;
          ((ak)localObject2).<init>(Looper.getMainLooper());
          paramContext = (WindowInsets)paramContext.b((ak)localObject2);
          yqM.put(i, paramContext);
        }
      }
      paramContext = new com/tencent/mm/ui/ae$3;
      paramContext.<init>(i, localView);
      localView.setOnApplyWindowInsetsListener(paramContext);
      paramBoolean = yqL;
      AppMethodBeat.o(65407);
      break;
      yqL = paramContext.getPackageManager().hasSystemFeature("android.hardware.notch_support");
    }
  }

  public static void J(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(65391);
    yqK.set(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(65391);
  }

  public static int Jj(int paramInt)
  {
    return ((int)((paramInt >> 24 & 0xFF) * 0.78F + 56.100006F) & 0xFF) << 24 | ((int)((paramInt >> 16 & 0xFF) * 0.78F + 0.0F) & 0xFF) << 16 | ((int)((paramInt >> 8 & 0xFF) * 0.78F + 0.0F) & 0xFF) << 8 | ((int)((paramInt & 0xFF) * 0.78F + 0.0F) & 0xFF) << 0;
  }

  @TargetApi(21)
  public static ViewGroup a(Window paramWindow, View paramView)
  {
    View localView = null;
    Object localObject = null;
    AppMethodBeat.i(65388);
    if (paramWindow == null)
      AppMethodBeat.o(65388);
    for (paramWindow = (Window)localObject; ; paramWindow = (Window)localObject)
    {
      return paramWindow;
      localObject = e(paramWindow);
      if (localObject == null)
        break;
      AppMethodBeat.o(65388);
    }
    if (paramView != null)
      for (paramView = paramView.getParent(); (paramView != paramWindow.getDecorView()) && (paramView != null); paramView = (View)localObject)
      {
        localObject = paramView.getParent();
        localView = paramView;
      }
    for (paramView = localView; ; paramView = null)
    {
      if (paramView == null)
      {
        localView = ((ViewGroup)paramWindow.getDecorView()).getChildAt(0);
        if ((localView instanceof ViewGroup))
        {
          paramWindow = (ViewGroup)localView;
          AppMethodBeat.o(65388);
          break;
        }
        if (Build.VERSION.SDK_INT >= 21)
          paramWindow.clearFlags(-2147483648);
      }
      paramWindow = (ViewGroup)paramView;
      AppMethodBeat.o(65388);
      break;
    }
  }

  public static void a(Window paramWindow)
  {
    AppMethodBeat.i(65396);
    if (paramWindow == null)
      AppMethodBeat.o(65396);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramWindow.addFlags(-2147483648);
        paramWindow.setStatusBarColor(0);
      }
      AppMethodBeat.o(65396);
    }
  }

  public static int[] ao(Bitmap paramBitmap)
  {
    AppMethodBeat.i(65412);
    paramBitmap = f(paramBitmap, 4, 4);
    AppMethodBeat.o(65412);
    return paramBitmap;
  }

  private static List<float[]> b(float[][] paramArrayOfFloat)
  {
    int i = 1;
    AppMethodBeat.i(65409);
    int[] arrayOfInt = new int[8];
    SparseArray localSparseArray = new SparseArray();
    int j = 0;
    if (j < paramArrayOfFloat.length)
      for (k = 1; ; k++)
        if (k <= 7)
        {
          if (paramArrayOfFloat[j][0] < 360.0F * (k / 7.0F))
          {
            arrayOfInt[k] += 1;
            List localList = (List)localSparseArray.get(k);
            Object localObject = localList;
            if (localList == null)
              localObject = new ArrayList();
            ((List)localObject).add(paramArrayOfFloat[j]);
            localSparseArray.put(k, localObject);
          }
        }
        else
        {
          j++;
          break;
        }
    int k = -1;
    int m = 0;
    j = i;
    i = k;
    while (j <= 7)
    {
      k = m;
      if (arrayOfInt[j] > m)
      {
        k = arrayOfInt[j];
        i = j;
      }
      j++;
      m = k;
    }
    paramArrayOfFloat = (List)localSparseArray.get(i, new ArrayList());
    AppMethodBeat.o(65409);
    return paramArrayOfFloat;
  }

  public static Rect d(Activity paramActivity, int paramInt1, int paramInt2)
  {
    int i = 1;
    while (true)
    {
      try
      {
        AppMethodBeat.i(65406);
        int j = paramActivity.getWindowManager().getDefaultDisplay().getRotation();
        if (yqN.get(j) != null)
        {
          localRect = (Rect)yqN.get(j);
          AppMethodBeat.o(65406);
          return localRect;
        }
        if (paramActivity.getWindow() == null)
        {
          AppMethodBeat.o(65406);
          localRect = null;
          continue;
        }
        if (!A(paramActivity, true))
          break label315;
        if (Build.VERSION.SDK_INT < 28)
          break label331;
        WindowInsets localWindowInsets = (WindowInsets)yqM.get(j);
        if ((localWindowInsets == null) || (localWindowInsets.getDisplayCutout() == null))
          break label331;
        localRect = new android/graphics/Rect;
        localRect.<init>(localWindowInsets.getDisplayCutout().getSafeInsetLeft(), localWindowInsets.getDisplayCutout().getSafeInsetTop(), paramInt1 - localWindowInsets.getDisplayCutout().getSafeInsetRight(), paramInt2 - localWindowInsets.getDisplayCutout().getSafeInsetBottom());
        if (i == 0)
          i = hB(paramActivity);
        switch (j)
        {
        default:
          localRect = new android/graphics/Rect;
          localRect.<init>(0, 0, paramInt1, paramInt2);
          yqN.put(j, localRect);
          AppMethodBeat.o(65406);
          continue;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      finally
      {
      }
      Rect localRect = new Rect(0, i, paramInt1, paramInt2);
      continue;
      localRect = new Rect(i, 0, paramInt1, paramInt2);
      continue;
      localRect = new Rect(0, 0, paramInt1, paramInt2 - i);
      continue;
      localRect = new Rect(0, 0, paramInt1 - i, paramInt2);
      continue;
      label315: localRect = new Rect(0, 0, paramInt1, paramInt2);
      continue;
      label331: i = 0;
      localRect = null;
    }
  }

  public static Rect dze()
  {
    return yqK;
  }

  public static boolean dzf()
  {
    boolean bool = false;
    AppMethodBeat.i(65414);
    if (dzh() != 0)
      if (Math.round(getDeviceWidth() / (dzh() / 160.0F)) >= 650)
      {
        bool = true;
        AppMethodBeat.o(65414);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(65414);
      continue;
      AppMethodBeat.o(65414);
    }
  }

  public static boolean dzg()
  {
    boolean bool = false;
    AppMethodBeat.i(138425);
    if (dzh() != 0)
      if (Math.round(getDeviceWidth() / (dzh() / 160.0F)) >= 550)
      {
        bool = true;
        AppMethodBeat.o(138425);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(138425);
      continue;
      AppMethodBeat.o(138425);
    }
  }

  public static int dzh()
  {
    AppMethodBeat.i(138253);
    try
    {
      Object localObject1 = Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new Class[0]);
      ((Method)localObject1).setAccessible(true);
      Object localObject2 = ((Method)localObject1).invoke(null, new Object[0]);
      localObject1 = localObject2.getClass().getDeclaredMethod("getInitialDisplayDensity", new Class[] { Integer.TYPE });
      ((Method)localObject1).setAccessible(true);
      localObject1 = (Integer)((Method)localObject1).invoke(localObject2, new Object[] { Integer.valueOf(0) });
      int i = ((Integer)localObject1).intValue();
      AppMethodBeat.o(138253);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.UIUtils", "Exception:%s", new Object[] { localException });
        Integer localInteger = Integer.valueOf(0);
      }
    }
  }

  private static ViewGroup e(Window paramWindow)
  {
    AppMethodBeat.i(65389);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramWindow = new c(paramWindow, "mContentRoot", null);
      if (!paramWindow.Mg());
    }
    try
    {
      paramWindow = (ViewGroup)paramWindow.get();
      AppMethodBeat.o(65389);
      return paramWindow;
    }
    catch (NoSuchFieldException paramWindow)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.UIUtils", paramWindow, "", new Object[0]);
        AppMethodBeat.o(65389);
        paramWindow = null;
      }
    }
    catch (IllegalAccessException paramWindow)
    {
      break label51;
    }
    catch (IllegalArgumentException paramWindow)
    {
      label51: break label51;
    }
  }

  private static int[] e(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65408);
    Bitmap localBitmap = Bitmap.createScaledBitmap(paramBitmap, paramInt1, paramInt2, false);
    paramBitmap = new int[paramInt1 * paramInt2];
    localBitmap.getPixels(paramBitmap, 0, paramInt1, 0, 0, paramInt1, paramInt2);
    AppMethodBeat.o(65408);
    return paramBitmap;
  }

  public static void f(Window paramWindow)
  {
    AppMethodBeat.i(65399);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
      AppMethodBeat.o(65399);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 23)
      {
        paramWindow = paramWindow.getDecorView();
        paramWindow.setSystemUiVisibility(paramWindow.getSystemUiVisibility() | 0x2000);
      }
      AppMethodBeat.o(65399);
    }
  }

  private static float[] f(List<float[]> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65410);
    float[] arrayOfFloat;
    if (paramList.size() > Math.max(paramInt1, paramInt2))
    {
      arrayOfFloat = null;
      paramInt1 = 0;
      if (paramInt1 < paramList.size())
      {
        if (((float[])paramList.get(paramInt1))[2] >= 3.4028235E+38F)
          break label159;
        arrayOfFloat = (float[])paramList.get(paramInt1);
      }
    }
    label159: 
    while (true)
    {
      paramInt1++;
      break;
      if (arrayOfFloat[2] <= 0.15D)
      {
        AppMethodBeat.o(65410);
        paramList = arrayOfFloat;
      }
      while (true)
      {
        return paramList;
        if (arrayOfFloat[1] > 0.5D)
          arrayOfFloat[1] -= 0.1F;
        arrayOfFloat[2] -= 0.1F;
        AppMethodBeat.o(65410);
        paramList = arrayOfFloat;
        continue;
        paramList = (float[])paramList.get(0);
        paramList[2] = 0.15F;
        AppMethodBeat.o(65410);
      }
    }
  }

  public static int[] f(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65413);
    float[] arrayOfFloat = f(b(g(e(paramBitmap, paramInt1, paramInt2), paramInt1, paramInt2)), paramInt1, paramInt2);
    paramBitmap = new float[3];
    if (arrayOfFloat[2] <= 0.15D)
    {
      paramBitmap[0] = arrayOfFloat[0];
      paramBitmap[1] = arrayOfFloat[1];
      arrayOfFloat[2] += 0.7F;
    }
    while (true)
    {
      if (paramBitmap[1] > 0.5F)
        paramBitmap[1] -= 0.1F;
      paramInt2 = Color.HSVToColor(arrayOfFloat);
      paramInt1 = Color.HSVToColor(paramBitmap);
      AppMethodBeat.o(65413);
      return new int[] { paramInt2, paramInt1 };
      paramBitmap[0] = arrayOfFloat[0];
      paramBitmap[1] = arrayOfFloat[1];
      if (arrayOfFloat[2] + 0.5D >= 1.0D)
        arrayOfFloat[2] -= 0.5F;
      else
        arrayOfFloat[2] += 0.5F;
    }
  }

  public static int fr(Context paramContext)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(65392);
    if (hw(paramContext))
    {
      i = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
      if (i > 0)
        j = Resources.getSystem().getDimensionPixelSize(i);
      AppMethodBeat.o(65392);
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(65392);
      j = i;
    }
  }

  private static float[][] g(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65411);
    float[][] arrayOfFloat = new float[paramInt1 * paramInt2][];
    for (int i = 0; i < paramInt1 * paramInt2; i++)
    {
      float[] arrayOfFloat1 = new float[3];
      Color.colorToHSV(paramArrayOfInt[i], arrayOfFloat1);
      arrayOfFloat[i] = arrayOfFloat1;
    }
    AppMethodBeat.o(65411);
    return arrayOfFloat;
  }

  public static int getDeviceWidth()
  {
    int i = 0;
    AppMethodBeat.i(138254);
    try
    {
      Object localObject1 = Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new Class[0]);
      ((Method)localObject1).setAccessible(true);
      Object localObject2 = ((Method)localObject1).invoke(null, new Object[0]);
      Method localMethod = localObject2.getClass().getDeclaredMethod("getInitialDisplaySize", new Class[] { Integer.TYPE, Point.class });
      localMethod.setAccessible(true);
      localObject1 = new android/graphics/Point;
      ((Point)localObject1).<init>();
      localMethod.invoke(localObject2, new Object[] { Integer.valueOf(0), localObject1 });
      int j = Math.min(((Point)localObject1).x, ((Point)localObject1).y);
      i = j;
      AppMethodBeat.o(138254);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.UIUtils", "Exception:%s", new Object[] { localException });
    }
  }

  public static int getStatusBarHeight(Context paramContext)
  {
    AppMethodBeat.i(65400);
    int i = hB(paramContext);
    AppMethodBeat.o(65400);
    return i;
  }

  @TargetApi(20)
  public static boolean h(View paramView1, final View paramView2)
  {
    boolean bool = true;
    AppMethodBeat.i(65390);
    if (!com.tencent.mm.compatible.util.d.iW(21))
      AppMethodBeat.o(65390);
    while (true)
    {
      return bool;
      if ((paramView1 != null) && ((paramView1 instanceof ViewGroup)) && (paramView2 != null) && ((paramView1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
      {
        paramView1.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
        {
          public final WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
          {
            AppMethodBeat.i(65385);
            paramAnonymousView = (ViewGroup.MarginLayoutParams)this.yqP.getLayoutParams();
            ae.J(paramAnonymousView.leftMargin, paramAnonymousView.topMargin, paramAnonymousView.rightMargin, paramAnonymousView.bottomMargin);
            paramView2.setPadding(paramView2.getPaddingLeft(), paramView2.getPaddingTop(), paramAnonymousView.rightMargin, paramAnonymousView.bottomMargin);
            paramAnonymousView = this.yqP.onApplyWindowInsets(paramAnonymousWindowInsets);
            AppMethodBeat.o(65385);
            return paramAnonymousView;
          }
        });
        AppMethodBeat.o(65390);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(65390);
      }
    }
  }

  public static int hA(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(65401);
    int j = hB(paramContext);
    Object localObject;
    if (j > 0)
    {
      localObject = new Rect();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
      if (((Rect)localObject).top > j)
      {
        ab.w("MicroMsg.UIUtils", "[fixStatusBarHeight] top:%s statusHeight:%s", new Object[] { Integer.valueOf(((Rect)localObject).top), Integer.valueOf(j) });
        AppMethodBeat.o(65401);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(65401);
      i = j;
      continue;
      if ((paramContext instanceof Activity))
      {
        Rect localRect = new Rect();
        ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
        i = ((Activity)paramContext).getWindow().getDecorView().getHeight();
        localObject = new int[2];
        ((Activity)paramContext).getWindow().getDecorView().getLocationOnScreen((int[])localObject);
        if ((i - localRect.height() >= 0) && (localObject[1] > 200))
        {
          i -= localRect.height();
          AppMethodBeat.o(65401);
        }
        else
        {
          i = localRect.top;
          AppMethodBeat.o(65401);
        }
      }
      else
      {
        i = com.tencent.mm.bz.a.fromDPToPix(paramContext, 20);
        AppMethodBeat.o(65401);
      }
    }
  }

  public static int hB(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(65402);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int j = bo.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      j = paramContext.getResources().getDimensionPixelSize(j);
      i = j;
      label54: AppMethodBeat.o(65402);
      return i;
    }
    catch (Exception paramContext)
    {
      break label54;
    }
  }

  public static int hC(Context paramContext)
  {
    AppMethodBeat.i(65403);
    int i = hB(paramContext);
    AppMethodBeat.o(65403);
    return i;
  }

  public static boolean hD(Context paramContext)
  {
    AppMethodBeat.i(65404);
    boolean bool = A(paramContext, false);
    AppMethodBeat.o(65404);
    return bool;
  }

  @TargetApi(17)
  public static boolean hw(Context paramContext)
  {
    AppMethodBeat.i(65393);
    boolean bool;
    if (hx(paramContext) > 0)
    {
      bool = true;
      AppMethodBeat.o(65393);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65393);
    }
  }

  private static int hx(Context paramContext)
  {
    AppMethodBeat.i(65394);
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(65394);
      i = 0;
    }
    while (true)
    {
      return i;
      Object localObject1 = (WindowManager)paramContext.getSystemService("window");
      if (localObject1 == null)
      {
        ab.e("MicroMsg.UIUtils", "getRealBottomHeight, get NULL windowManager");
        AppMethodBeat.o(65394);
        i = 0;
      }
      else
      {
        Object localObject2 = ((WindowManager)localObject1).getDefaultDisplay();
        localObject1 = new Point();
        ((Display)localObject2).getSize((Point)localObject1);
        localObject2 = hy(paramContext);
        i = Math.max(((Point)localObject1).y, ((Point)localObject1).x);
        int j = Math.max(((Point)localObject2).y, ((Point)localObject2).x);
        localObject1 = new Rect();
        if ((paramContext instanceof Activity))
        {
          ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
          i = Math.max(((Rect)localObject1).bottom - ((Rect)localObject1).top, ((Rect)localObject1).right - ((Rect)localObject1).left);
        }
        i = j - i;
        AppMethodBeat.o(65394);
      }
    }
  }

  public static Point hy(Context paramContext)
  {
    AppMethodBeat.i(65395);
    Point localPoint = new Point();
    if (paramContext == null)
    {
      AppMethodBeat.o(65395);
      return localPoint;
    }
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17)
      paramContext.getRealSize(localPoint);
    while (true)
    {
      AppMethodBeat.o(65395);
      break;
      if (Build.VERSION.SDK_INT >= 14)
        try
        {
          Method localMethod = Display.class.getMethod("getRawHeight", new Class[0]);
          localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramContext, new Object[0])).intValue();
          localPoint.y = ((Integer)localMethod.invoke(paramContext, new Object[0])).intValue();
        }
        catch (Exception localException)
        {
        }
      else
        paramContext.getSize(localPoint);
    }
  }

  public static void hz(Context paramContext)
  {
    AppMethodBeat.i(65398);
    if ((paramContext instanceof Activity))
      m((Activity)paramContext, -1);
    AppMethodBeat.o(65398);
  }

  public static void m(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(65397);
    if (paramActivity == null)
      AppMethodBeat.o(65397);
    while (true)
    {
      return;
      try
      {
        Window localWindow = paramActivity.getWindow();
        if (localWindow == null)
        {
          AppMethodBeat.o(65397);
        }
        else
        {
          if (Build.VERSION.SDK_INT >= 21)
          {
            paramActivity.getWindow().addFlags(-2147483648);
            paramActivity.getWindow().setStatusBarColor(paramInt);
          }
          AppMethodBeat.o(65397);
        }
      }
      catch (Throwable paramActivity)
      {
        ab.printErrStackTrace("MicroMsg.UIUtils", paramActivity, "", new Object[0]);
        AppMethodBeat.o(65397);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ae
 * JD-Core Version:    0.6.2
 */