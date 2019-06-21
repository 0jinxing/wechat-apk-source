package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class x
{
  public static int xyu = -1;
  public static int xyv = -1;
  private static boolean xyw = false;
  private static int xyx = -1;
  private static int xyy = -1;

  public static int al(Activity paramActivity)
  {
    AppMethodBeat.i(115203);
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    AppMethodBeat.o(115203);
    return i;
  }

  public static final int as(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115195);
    if (paramInt > 0)
    {
      paramInt += 230;
      if (!gt(paramContext))
      {
        paramInt *= 3;
        AppMethodBeat.o(115195);
      }
    }
    while (true)
    {
      return paramInt;
      paramInt = a.fromDPToPix(paramContext, paramInt);
      xyy = paramInt;
      AppMethodBeat.o(115195);
      continue;
      if (xyy > 0)
      {
        paramInt = xyy;
        AppMethodBeat.o(115195);
      }
      else if (!gt(paramContext))
      {
        paramInt = 690;
        AppMethodBeat.o(115195);
      }
      else
      {
        paramInt = a.fromDPToPix(paramContext, 230);
        xyy = paramInt;
        AppMethodBeat.o(115195);
      }
    }
  }

  public static final int at(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115196);
    paramInt = e(paramContext, paramInt, 0);
    AppMethodBeat.o(115196);
    return paramInt;
  }

  public static int[] db(Context paramContext)
  {
    AppMethodBeat.i(115202);
    if (paramContext == null)
      paramContext = ah.getContext();
    while (true)
    {
      int[] arrayOfInt = new int[2];
      if ((paramContext instanceof Activity))
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        arrayOfInt[0] = localDisplayMetrics.widthPixels;
        arrayOfInt[1] = localDisplayMetrics.heightPixels;
      }
      while (true)
      {
        AppMethodBeat.o(115202);
        return arrayOfInt;
        paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
        arrayOfInt[0] = paramContext.getWidth();
        arrayOfInt[1] = paramContext.getHeight();
      }
    }
  }

  public static void dod()
  {
    xyw = false;
  }

  public static final int e(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115197);
    int i = as(paramContext, paramInt2);
    ab.e("MicroMsg.KeyBordUtil", "getValidPanelHeight(): minPanelHeight= %d, isOpenIm=%b", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
    if (!gu(paramContext))
    {
      paramInt2 = (int)(i / 1.5D);
      i = db(paramContext)[0];
      paramInt1 = paramInt2;
      if (paramInt2 > i / 2)
        paramInt1 = i / 2;
      AppMethodBeat.o(115197);
    }
    while (true)
    {
      return paramInt1;
      paramInt2 = paramInt1;
      if (paramInt1 <= 0)
        paramInt2 = gq(paramContext);
      paramInt1 = gr(paramContext);
      if (paramInt2 > paramInt1)
      {
        AppMethodBeat.o(115197);
      }
      else if (paramInt2 < i)
      {
        AppMethodBeat.o(115197);
        paramInt1 = i;
      }
      else
      {
        AppMethodBeat.o(115197);
        paramInt1 = paramInt2;
      }
    }
  }

  public static final int gp(Context paramContext)
  {
    AppMethodBeat.i(115192);
    int i;
    if (!xyw)
      if (!gt(paramContext))
      {
        i = ah.doB().getInt("com.tencent.mm.compatible.util.keybord.height", 690);
        AppMethodBeat.o(115192);
      }
    while (true)
    {
      return i;
      i = ah.doB().getInt("com.tencent.mm.compatible.util.keybord.height", a.fromDPToPix(paramContext, 230));
      xyu = i;
      AppMethodBeat.o(115192);
      continue;
      i = as(paramContext, 0);
      AppMethodBeat.o(115192);
    }
  }

  public static final int gq(Context paramContext)
  {
    AppMethodBeat.i(115193);
    int i;
    if (!xyw)
      if (xyu > 0)
      {
        i = xyu;
        AppMethodBeat.o(115193);
      }
    while (true)
    {
      return i;
      i = gp(paramContext);
      AppMethodBeat.o(115193);
      continue;
      i = as(paramContext, 0);
      AppMethodBeat.o(115193);
    }
  }

  public static final int gr(Context paramContext)
  {
    AppMethodBeat.i(115194);
    int i;
    if (!xyw)
      if (xyx > 0)
      {
        i = xyx;
        AppMethodBeat.o(115194);
      }
    while (true)
    {
      return i;
      if (!gt(paramContext))
      {
        i = 1140;
        AppMethodBeat.o(115194);
      }
      else
      {
        i = a.fromDPToPix(paramContext, 380);
        xyx = i;
        AppMethodBeat.o(115194);
        continue;
        i = as(paramContext, 0);
        AppMethodBeat.o(115194);
      }
    }
  }

  public static final int gs(Context paramContext)
  {
    AppMethodBeat.i(115198);
    int i = e(paramContext, -1, 0);
    AppMethodBeat.o(115198);
    return i;
  }

  public static final boolean gt(Context paramContext)
  {
    AppMethodBeat.i(115199);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    boolean bool;
    if (localContext != null)
    {
      bool = true;
      AppMethodBeat.o(115199);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115199);
    }
  }

  public static boolean gu(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(115200);
    if (gv(paramContext) == 1)
      AppMethodBeat.o(115200);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115200);
    }
  }

  private static int gv(Context paramContext)
  {
    int i = 1;
    AppMethodBeat.i(115201);
    paramContext = db(paramContext);
    if (paramContext[0] < paramContext[1]);
    while (true)
    {
      AppMethodBeat.o(115201);
      return i;
      i = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.x
 * JD-Core Version:    0.6.2
 */