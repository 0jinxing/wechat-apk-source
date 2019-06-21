package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ak
{
  public static int J(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(112491);
    int i = ax(paramContext, paramInt);
    if (i > 0)
    {
      paramInt = ay(paramContext, i);
      AppMethodBeat.o(112491);
      return paramInt;
    }
    if (i <= 0)
      ai.i("WeUIToolHelper", "[getStatusBarHeight] return default!!!", new Object[0]);
    while (true)
    {
      AppMethodBeat.o(112491);
      break;
      paramInt = i;
    }
  }

  private static int ax(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(112492);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int i = al.la(localClass.getField("status_bar_height").get(localObject).toString());
      i = paramContext.getResources().getDimensionPixelSize(i);
      paramInt = i;
      ai.i("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(112492);
      return paramInt;
    }
    catch (Exception paramContext)
    {
      while (true)
        ai.printErrStackTrace("WeUIToolHelper", paramContext, "getStatusBarHeightFromSysR", new Object[0]);
    }
  }

  private static int ay(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(112493);
    if ((paramContext instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = ((Activity)paramContext).getResources().getDisplayMetrics();
      Rect localRect = new Rect();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      if ((localDisplayMetrics != null) && (localRect.height() > 0))
      {
        int i = localDisplayMetrics.heightPixels - localRect.height();
        ai.i("WeUIToolHelper", "[fixStatusBarHeight] new statusBar:%s ", new Object[] { Integer.valueOf(i) });
        if ((i > paramInt) && (i - paramInt < 100))
        {
          ai.i("WeUIToolHelper", "[fixStatusBarHeight] return new statusBar:%s ", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(112493);
          paramInt = i;
        }
      }
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(112493);
    }
  }

  public static int de(Context paramContext)
  {
    AppMethodBeat.i(112488);
    if (paramContext == null)
      ai.w("WeUIToolHelper", "[getActionBarHeight] context is null!", new Object[0]);
    int i = paramContext.getResources().getDimensionPixelSize(2131427562);
    int j;
    if ((paramContext instanceof AppCompatActivity))
    {
      if (((AppCompatActivity)paramContext).getSupportActionBar() == null)
        break label129;
      j = ((AppCompatActivity)paramContext).getSupportActionBar().getHeight();
    }
    while (true)
    {
      int k = j;
      if (j <= 0)
        k = i;
      ai.i("WeUIToolHelper", "[getActionBarHeight] real:%s defaultVal:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      AppMethodBeat.o(112488);
      return k;
      if (((paramContext instanceof Activity)) && (((Activity)paramContext).getActionBar() != null))
        j = ((Activity)paramContext).getActionBar().getHeight();
      else
        label129: j = 0;
    }
  }

  public static int fr(Context paramContext)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(112498);
    if (hw(paramContext))
    {
      i = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
      if (i > 0)
        j = Resources.getSystem().getDimensionPixelSize(i);
      int k = hx(paramContext);
      i = j;
      if (k != 0)
      {
        i = j;
        if (k < j)
          i = k;
      }
      AppMethodBeat.o(112498);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(112498);
    }
  }

  public static int getStatusBarHeight(Context paramContext)
  {
    AppMethodBeat.i(112490);
    int i = J(paramContext, aj.fromDPToPix(paramContext, 25));
    AppMethodBeat.o(112490);
    return i;
  }

  public static int hF(Context paramContext)
  {
    AppMethodBeat.i(112489);
    int i = ax(paramContext, aj.fromDPToPix(paramContext, 25));
    AppMethodBeat.o(112489);
    return i;
  }

  public static boolean hG(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(112497);
    if ((paramContext instanceof Activity))
      if ((((Activity)paramContext).getWindow().getAttributes().flags & 0x400) != 1024)
        AppMethodBeat.o(112497);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112497);
      continue;
      AppMethodBeat.o(112497);
    }
  }

  @TargetApi(17)
  public static boolean hw(Context paramContext)
  {
    AppMethodBeat.i(112495);
    boolean bool;
    if (hx(paramContext) > 0)
    {
      bool = true;
      AppMethodBeat.o(112495);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112495);
    }
  }

  public static int hx(Context paramContext)
  {
    AppMethodBeat.i(112496);
    Object localObject1 = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Object localObject2 = new Point();
    ((Display)localObject1).getSize((Point)localObject2);
    localObject1 = hy(paramContext);
    int i = Math.max(((Point)localObject2).y, ((Point)localObject2).x);
    int j = Math.max(((Point)localObject1).y, ((Point)localObject1).x);
    localObject2 = new Rect();
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject2);
      i = Math.max(((Rect)localObject2).bottom, ((Rect)localObject2).right);
    }
    AppMethodBeat.o(112496);
    return j - i;
  }

  public static Point hy(Context paramContext)
  {
    AppMethodBeat.i(112494);
    Point localPoint = new Point();
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17)
      localDisplay.getRealSize(localPoint);
    while (true)
    {
      AppMethodBeat.o(112494);
      return localPoint;
      if (Build.VERSION.SDK_INT >= 14)
        try
        {
          paramContext = Display.class.getMethod("getRawHeight", new Class[0]);
          localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
          localPoint.y = ((Integer)paramContext.invoke(localDisplay, new Object[0])).intValue();
        }
        catch (NoSuchMethodException paramContext)
        {
          ai.printErrStackTrace("WeUIToolHelper", paramContext, "getDisplayRealSize NoSuchMethodException", new Object[0]);
        }
        catch (IllegalAccessException paramContext)
        {
          ai.printErrStackTrace("WeUIToolHelper", paramContext, "getDisplayRealSize IllegalAccessException", new Object[0]);
        }
        catch (InvocationTargetException paramContext)
        {
          ai.printErrStackTrace("WeUIToolHelper", paramContext, "getDisplayRealSize InvocationTargetException", new Object[0]);
        }
      else
        localDisplay.getSize(localPoint);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ak
 * JD-Core Version:    0.6.2
 */