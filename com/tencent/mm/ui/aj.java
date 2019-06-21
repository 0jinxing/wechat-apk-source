package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.util.TypedValue;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aj
{
  private static float density;
  private static float scale;
  private static SparseIntArray xup;

  static
  {
    AppMethodBeat.i(112487);
    density = -1.0F;
    scale = 0.0F;
    xup = new SparseIntArray();
    AppMethodBeat.o(112487);
  }

  public static int am(Context paramContext, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(112483);
    if (paramContext == null)
    {
      ai.e("WeUIResHelper", "get dimension pixel size, resId %d, but context is null".concat(String.valueOf(paramInt)), new Object[0]);
      AppMethodBeat.o(112483);
    }
    while (true)
    {
      return i;
      int j = xup.get(paramInt, 0);
      i = j;
      if (j == 0)
      {
        i = paramContext.getResources().getDimensionPixelSize(paramInt);
        xup.put(paramInt, i);
      }
      AppMethodBeat.o(112483);
    }
  }

  public static float dm(Context paramContext)
  {
    AppMethodBeat.i(112485);
    if (scale == 0.0F)
      if (paramContext != null)
        break label32;
    label32: for (scale = 1.0F; ; scale = paramContext.getSharedPreferences("com.tencent.mm_preferences", 0).getFloat("text_size_scale_key", 1.0F))
    {
      float f = scale;
      AppMethodBeat.o(112485);
      return f;
    }
  }

  public static int fromDPToPix(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(112482);
    paramInt = Math.round(getDensity(paramContext) * paramInt);
    AppMethodBeat.o(112482);
    return paramInt;
  }

  public static float getDensity(Context paramContext)
  {
    AppMethodBeat.i(112484);
    if ((paramContext != null) && (density < 0.0F))
      density = paramContext.getResources().getDisplayMetrics().density;
    float f = density;
    AppMethodBeat.o(112484);
    return f;
  }

  public static int hE(Context paramContext)
  {
    AppMethodBeat.i(112486);
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(2130771970, localTypedValue, true);
    int i = localTypedValue.data;
    AppMethodBeat.o(112486);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aj
 * JD-Core Version:    0.6.2
 */