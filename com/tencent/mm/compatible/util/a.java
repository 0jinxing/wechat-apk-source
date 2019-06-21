package com.tencent.mm.compatible.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static int bG(Context paramContext)
  {
    AppMethodBeat.i(93058);
    TypedValue localTypedValue = new TypedValue();
    int i;
    if (paramContext.getTheme().resolveAttribute(2130772139, localTypedValue, true))
    {
      i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramContext.getResources().getDisplayMetrics());
      AppMethodBeat.o(93058);
    }
    while (true)
    {
      return i;
      if (paramContext.getTheme().resolveAttribute(16843499, localTypedValue, true))
      {
        i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramContext.getResources().getDisplayMetrics());
        AppMethodBeat.o(93058);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(93058);
      }
    }
  }

  public static int q(Activity paramActivity)
  {
    AppMethodBeat.i(93057);
    int i;
    if ((paramActivity instanceof AppCompatActivity))
    {
      if (((AppCompatActivity)paramActivity).getSupportActionBar() == null)
        break label63;
      i = ((AppCompatActivity)paramActivity).getSupportActionBar().getHeight();
      AppMethodBeat.o(93057);
    }
    while (true)
    {
      return i;
      if (paramActivity.getActionBar() != null)
      {
        i = paramActivity.getActionBar().getHeight();
        AppMethodBeat.o(93057);
      }
      else
      {
        label63: i = bG(paramActivity);
        AppMethodBeat.o(93057);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.a
 * JD-Core Version:    0.6.2
 */