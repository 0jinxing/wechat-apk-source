package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ah
{
  public static boolean Nw(int paramInt)
  {
    AppMethodBeat.i(112474);
    boolean bool;
    if (1.0D - (0.299D * Color.red(paramInt) + 0.587D * Color.green(paramInt) + 0.114D * Color.blue(paramInt)) / 255.0D >= 0.3D)
    {
      bool = true;
      AppMethodBeat.o(112474);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112474);
    }
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0);
    for (paramInt1 = 0; ; paramInt1 = (paramInt1 * 255 * paramInt2 + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255))
      return paramInt1;
  }

  public static int dJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112470);
    if ((paramInt2 < 0) || (paramInt2 > 100))
    {
      ai.e("alphaColor", "alpha must be between 0 and 100", new Object[0]);
      AppMethodBeat.o(112470);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = 0xFFFFFF & paramInt1 | (int)(paramInt2 * 0.01D * 255.0D) << 24;
      AppMethodBeat.o(112470);
    }
  }

  public static Drawable e(Drawable paramDrawable, int paramInt)
  {
    AppMethodBeat.i(112473);
    if (paramDrawable != null)
      paramDrawable.setColorFilter(new PorterDuffColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP));
    AppMethodBeat.o(112473);
    return paramDrawable;
  }

  public static Drawable f(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112472);
    paramContext = paramContext.getResources().getDrawable(paramInt1);
    if (paramContext != null)
      paramContext.setColorFilter(new PorterDuffColorFilter(paramInt2, PorterDuff.Mode.SRC_ATOP));
    AppMethodBeat.o(112472);
    return paramContext;
  }

  private static int hd(int paramInt1, int paramInt2)
  {
    return 255 - (255 - paramInt2) * (255 - paramInt1) / 255;
  }

  public static int s(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112471);
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = hd(j, i);
    paramInt1 = Color.argb(k, b(Color.red(paramInt1), j, Color.red(paramInt2), i, k), b(Color.green(paramInt1), j, Color.green(paramInt2), i, k), b(Color.blue(paramInt1), j, Color.blue(paramInt2), i, k));
    AppMethodBeat.o(112471);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ah
 * JD-Core Version:    0.6.2
 */