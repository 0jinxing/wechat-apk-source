package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static void D(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(67830);
    paramView = fm(paramView);
    if (paramView != null)
      paramView.qM(paramBoolean);
    AppMethodBeat.o(67830);
  }

  public static int ay(Activity paramActivity)
  {
    int i = 0;
    AppMethodBeat.i(67831);
    if (!c.zzP)
      AppMethodBeat.o(67831);
    while (true)
    {
      return i;
      if (paramActivity == null)
      {
        AppMethodBeat.o(67831);
      }
      else
      {
        i = c.az(paramActivity).zzS;
        AppMethodBeat.o(67831);
      }
    }
  }

  public static void d(View paramView, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(67829);
    if (paramView == null)
      AppMethodBeat.o(67829);
    while (true)
    {
      return;
      if (!c.zzP)
      {
        AppMethodBeat.o(67829);
      }
      else
      {
        b localb = fm(paramView);
        if (localb != null)
        {
          localb.K(paramInt, paramBoolean);
          AppMethodBeat.o(67829);
        }
        else
        {
          paramView = d.cY(paramView.getContext());
          if (paramView != null)
          {
            paramView.getWindow().setStatusBarColor(paramInt);
            d.a(paramView.getWindow(), paramBoolean);
          }
          AppMethodBeat.o(67829);
        }
      }
    }
  }

  private static b fm(View paramView)
  {
    AppMethodBeat.i(67828);
    if (paramView == null)
    {
      AppMethodBeat.o(67828);
      paramView = null;
      return paramView;
      label18: paramView = (View)paramView;
    }
    while (true)
    {
      if ((paramView instanceof b))
      {
        paramView = (b)paramView;
        AppMethodBeat.o(67828);
        break;
      }
      paramView = paramView.getParent();
      if ((paramView != null) && ((paramView instanceof ViewGroup)))
        break label18;
      AppMethodBeat.o(67828);
      paramView = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.statusbar.a
 * JD-Core Version:    0.6.2
 */