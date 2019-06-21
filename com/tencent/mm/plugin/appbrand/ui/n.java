package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.h.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.statusbar.d;

public enum n
{
  public static void H(View paramView, int paramInt)
  {
    AppMethodBeat.i(87382);
    if ((paramView != null) && (paramView.getVisibility() != paramInt))
      paramView.setVisibility(paramInt);
    AppMethodBeat.o(87382);
  }

  public static void a(Window paramWindow)
  {
    AppMethodBeat.i(87384);
    if (paramWindow == null)
      AppMethodBeat.o(87384);
    while (true)
    {
      return;
      if ((Build.VERSION.SDK_INT >= 21) && (((paramWindow.getAttributes().flags & 0x80000000) == 0) || (paramWindow.getStatusBarColor() != 0)))
      {
        paramWindow.addFlags(-2147483648);
        paramWindow.setStatusBarColor(0);
      }
      AppMethodBeat.o(87384);
    }
  }

  public static boolean a(Window paramWindow, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(87385);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
    {
      AppMethodBeat.o(87385);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ((Build.VERSION.SDK_INT >= 23) && ((!b.Ms()) || (!b.Mt())))
      {
        paramWindow = paramWindow.getDecorView();
        int i = paramWindow.getSystemUiVisibility();
        if (paramBoolean)
          i |= 8192;
        while (true)
        {
          paramWindow.setSystemUiVisibility(i);
          paramBoolean = true;
          AppMethodBeat.o(87385);
          break;
          i &= -8193;
        }
      }
      AppMethodBeat.o(87385);
      paramBoolean = bool;
    }
  }

  public static int[] aMw()
  {
    AppMethodBeat.i(87383);
    Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    AppMethodBeat.o(87383);
    return new int[] { i, j };
  }

  private static int b(Window paramWindow, boolean paramBoolean)
  {
    AppMethodBeat.i(87390);
    int i = paramWindow.getDecorView().getSystemUiVisibility();
    int j;
    if (paramBoolean)
    {
      j = i | 0x400 | 0x100;
      i = j;
      if (Build.VERSION.SDK_INT >= 20)
        i = j | 0x200 | 0x2;
      j = i | 0x4;
      i = j;
      if (Build.VERSION.SDK_INT >= 19)
        i = j | 0x1000;
    }
    while (true)
    {
      ab.i("MicroMsg.AppBrandUIUtil", "hy: setting ui visibility: %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(87390);
      return i;
      j = i & 0xFFFFFBFF & 0xFFFFFEFF;
      i = j;
      if (Build.VERSION.SDK_INT >= 20)
        i = j & 0xFFFFFDFF & 0xFFFFFFFD;
      j = i & 0xFFFFFFFB;
      i = j;
      if (Build.VERSION.SDK_INT >= 19)
        i = j & 0xFFFFEFFF;
    }
  }

  public static boolean b(Window paramWindow)
  {
    boolean bool = false;
    AppMethodBeat.i(87386);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
      AppMethodBeat.o(87386);
    while (true)
    {
      return bool;
      if ((Build.VERSION.SDK_INT >= 23) && ((paramWindow.getDecorView().getSystemUiVisibility() & 0x2000) != 0))
      {
        bool = true;
        AppMethodBeat.o(87386);
      }
      else
      {
        AppMethodBeat.o(87386);
      }
    }
  }

  public static void c(Window paramWindow, boolean paramBoolean)
  {
    AppMethodBeat.i(87392);
    int i;
    if (paramBoolean)
    {
      i = b(paramWindow, true);
      paramWindow.getDecorView().setSystemUiVisibility(i);
      paramWindow.getDecorView().setOnSystemUiVisibilityChangeListener(new n.1(paramWindow));
      paramWindow.addFlags(1024);
      AppMethodBeat.o(87392);
    }
    while (true)
    {
      return;
      i = b(paramWindow, false);
      paramWindow.getDecorView().setSystemUiVisibility(i);
      paramWindow.getDecorView().setOnSystemUiVisibilityChangeListener(null);
      paramWindow.clearFlags(1024);
      AppMethodBeat.o(87392);
    }
  }

  @Deprecated
  public static Activity cY(Context paramContext)
  {
    AppMethodBeat.i(87388);
    paramContext = d.cY(paramContext);
    AppMethodBeat.o(87388);
    return paramContext;
  }

  public static boolean ct(View paramView)
  {
    AppMethodBeat.i(87389);
    boolean bool;
    if (Build.VERSION.SDK_INT < 24)
    {
      AppMethodBeat.o(87389);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramView == null)
      {
        AppMethodBeat.o(87389);
        bool = false;
      }
      else
      {
        Context localContext = paramView.getContext();
        paramView = localContext;
        if ((localContext instanceof ContextWrapper))
        {
          paramView = localContext;
          if (!(localContext instanceof Activity))
            paramView = ((ContextWrapper)localContext).getBaseContext();
        }
        if (((paramView instanceof Activity)) && (u((Activity)paramView)))
        {
          bool = true;
          AppMethodBeat.o(87389);
        }
        else
        {
          AppMethodBeat.o(87389);
          bool = false;
        }
      }
    }
  }

  public static void q(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(87391);
    Activity localActivity = d.cY(paramContext);
    if ((localActivity != null) && (localActivity.getWindow() != null))
    {
      c(localActivity.getWindow(), paramBoolean);
      AppMethodBeat.o(87391);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.AppBrandUIUtil", "configFullScreen with context(%s), get NULL activity", new Object[] { paramContext });
      AppMethodBeat.o(87391);
    }
  }

  public static boolean u(Activity paramActivity)
  {
    AppMethodBeat.i(87387);
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 24) && (paramActivity != null) && (paramActivity.isInMultiWindowMode()))
    {
      bool = true;
      AppMethodBeat.o(87387);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87387);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.n
 * JD-Core Version:    0.6.2
 */