package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.x;

@Deprecated
public final class j extends x
{
  public static final int Mv()
  {
    return xyv;
  }

  public static final int Mw()
  {
    AppMethodBeat.i(93100);
    int i = as.amF(ah.doA()).getInt("com.tencent.mm.compatible.util.keybord.height", 0);
    AppMethodBeat.o(93100);
    return i;
  }

  @TargetApi(11)
  public static final void r(Activity paramActivity)
  {
    AppMethodBeat.i(93098);
    if (paramActivity == null)
      AppMethodBeat.o(93098);
    while (true)
    {
      return;
      Rect localRect = new Rect();
      paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      int i = localRect.top;
      int j = a.q(paramActivity);
      xyv = paramActivity.getResources().getDisplayMetrics().heightPixels - j - i;
      AppMethodBeat.o(93098);
    }
  }

  public static final void x(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(93099);
    int i = x.as(paramContext, 0);
    int j = x.gr(paramContext);
    if (paramInt < i)
      paramInt = i;
    while (true)
    {
      if (paramInt > j)
        paramInt = j;
      while (true)
      {
        if ((x.xyu != paramInt) && (x.gt(paramContext)) && (paramInt >= 0))
        {
          x.xyu = paramInt;
          ab.d("MicroMsg.KeyBordUtil", "save keybord: %d", new Object[] { Integer.valueOf(paramInt) });
          ah.doB().edit().putInt("com.tencent.mm.compatible.util.keybord.height", paramInt).commit();
        }
        as.amF(ah.doA()).putInt("com.tencent.mm.compatible.util.keybord.height", paramInt);
        AppMethodBeat.o(93099);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.j
 * JD-Core Version:    0.6.2
 */