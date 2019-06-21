package com.tencent.ttpic.device;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import java.lang.reflect.Method;

public class NotchInScreenUtils
{
  public static final int NOTCH_IN_SCREEN_VIVO = 32;
  public static final int ROUNDED_IN_SCREEN_VIVO = 8;

  public static int getNotchHeightHw(Context paramContext)
  {
    AppMethodBeat.i(49931);
    int[] arrayOfInt = new int[2];
    int[] tmp10_9 = arrayOfInt;
    tmp10_9[0] = 0;
    int[] tmp14_10 = tmp10_9;
    tmp14_10[1] = 0;
    tmp14_10;
    paramContext = paramContext.getClassLoader();
    try
    {
      paramContext = paramContext.loadClass("com.huawei.android.util.HwNotchSizeUtil");
      paramContext = (int[])paramContext.getMethod("getNotchSize", new Class[0]).invoke(paramContext, new Object[0]);
      int i = paramContext[1];
      AppMethodBeat.o(49931);
      return i;
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        paramContext = arrayOfInt;
      }
    }
    catch (NoSuchMethodException paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        paramContext = arrayOfInt;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        paramContext = arrayOfInt;
      }
    }
  }

  public static int getStatusBarHeight(Context paramContext)
  {
    AppMethodBeat.i(49932);
    int i = 0;
    int j = paramContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (j > 0)
      i = paramContext.getResources().getDimensionPixelSize(j);
    AppMethodBeat.o(49932);
    return i;
  }

  public static boolean hasNotchInScreen(Context paramContext)
  {
    AppMethodBeat.i(49929);
    boolean bool;
    if ((hasNotchInScreenHw(paramContext)) || (hasNotchInScreenAtOppo(paramContext)) || (hasNotchInScreenAtVivo(paramContext)) || (hasNotchInScreenAtXM()))
    {
      bool = true;
      AppMethodBeat.o(49929);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49929);
    }
  }

  public static boolean hasNotchInScreenAtOppo(Context paramContext)
  {
    AppMethodBeat.i(49933);
    boolean bool = paramContext.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    AppMethodBeat.o(49933);
    return bool;
  }

  public static boolean hasNotchInScreenAtVivo(Context paramContext)
  {
    AppMethodBeat.i(49934);
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.util.FtFeature");
      bool = ((Boolean)paramContext.getMethod("isFeatureSupport", new Class[] { Integer.TYPE }).invoke(paramContext, new Object[] { Integer.valueOf(32) })).booleanValue();
      AppMethodBeat.o(49934);
      return bool;
    }
    catch (ClassNotFoundException paramContext)
    {
      LogUtils.e(paramContext);
    }
    catch (NoSuchMethodException paramContext)
    {
      LogUtils.e(paramContext);
    }
    catch (Exception paramContext)
    {
      LogUtils.e(paramContext);
    }
    finally
    {
      while (true)
      {
        AppMethodBeat.o(49934);
        boolean bool = false;
      }
    }
  }

  public static boolean hasNotchInScreenAtXM()
  {
    boolean bool = false;
    AppMethodBeat.i(49935);
    String str = System.getProperty("ro.miui.notch");
    if (TextUtils.isEmpty(str))
      AppMethodBeat.o(49935);
    while (true)
    {
      return bool;
      try
      {
        i = Integer.parseInt(str);
        if (i == 1)
        {
          AppMethodBeat.o(49935);
          bool = true;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          LogUtils.e(localNumberFormatException);
          int i = 0;
        }
        AppMethodBeat.o(49935);
      }
    }
  }

  public static boolean hasNotchInScreenHw(Context paramContext)
  {
    AppMethodBeat.i(49930);
    paramContext = paramContext.getClassLoader();
    try
    {
      paramContext = paramContext.loadClass("com.huawei.android.util.HwNotchSizeUtil");
      bool = ((Boolean)paramContext.getMethod("hasNotchInScreen", new Class[0]).invoke(paramContext, new Object[0])).booleanValue();
      AppMethodBeat.o(49930);
      return bool;
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        bool = false;
      }
    }
    catch (NoSuchMethodException paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        bool = false;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.NotchInScreenUtils
 * JD-Core Version:    0.6.2
 */