package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ae;

public final class d
{
  private static boolean iXe = false;

  private static int a(int paramInt, Context paramContext, float paramFloat)
  {
    int i = 0;
    AppMethodBeat.i(133816);
    if (paramContext == null)
    {
      AppMethodBeat.o(133816);
      return i;
    }
    int j = di(paramContext);
    int k;
    if (b.aPd())
      k = (int)((paramInt - j * paramFloat) / Math.ceil(paramFloat));
    while (true)
    {
      i = k;
      if (k < 0)
        i = 0;
      ab.i("MicroMsg.AppBrandDesktopSizeHelper", "alvinluo itemWidth: %d, itemPadding: %d, viewWidth: %d, countPerPage: %f, leftRightPaddingZero: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt), Float.valueOf(paramFloat), Boolean.valueOf(iXe) });
      AppMethodBeat.o(133816);
      break;
      iXe = false;
      i = dk(paramContext);
      k = (paramInt - i * 2 - (int)paramFloat * j) / (((int)paramFloat - 1) * 2);
      if (k > i)
      {
        k = (paramInt - (int)paramFloat * j) / ((int)paramFloat * 2);
        iXe = true;
      }
      else
      {
        iXe = false;
      }
    }
  }

  public static int c(int paramInt, Context paramContext)
  {
    AppMethodBeat.i(133814);
    paramInt = a(paramInt, paramContext, b.getShowCountPerPage());
    AppMethodBeat.o(133814);
    return paramInt;
  }

  public static int d(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(133817);
    int i;
    if (paramContext == null)
    {
      i = 0;
      AppMethodBeat.o(133817);
    }
    while (true)
    {
      return i;
      i = a(getScreenWidth(paramContext), paramContext, paramFloat);
      AppMethodBeat.o(133817);
    }
  }

  public static int di(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(133812);
    if (paramContext == null)
      AppMethodBeat.o(133812);
    while (true)
    {
      return i;
      i = (int)(a.am(paramContext, 2131427995) * dm(paramContext));
      ab.i("MicroMsg.AppBrandDesktopSizeHelper", "alvinluo itemWidth: %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(133812);
    }
  }

  public static int dj(Context paramContext)
  {
    AppMethodBeat.i(133813);
    int i = d(paramContext, b.getShowCountPerPage());
    AppMethodBeat.o(133813);
    return i;
  }

  public static int dk(Context paramContext)
  {
    AppMethodBeat.i(133818);
    if (iXe)
    {
      AppMethodBeat.o(133818);
      i = 0;
      return i;
    }
    int j = paramContext.getResources().getDimensionPixelOffset(2131427996);
    float f = dm(paramContext);
    int i = j;
    if (f != 1.0F)
    {
      i = j;
      if (f != 0.875F)
        if ((f != 1.125F) && (f != 1.25F) && (f != 1.375F))
          break label109;
    }
    label109: for (i = paramContext.getResources().getDimensionPixelOffset(2131427776); ; i = paramContext.getResources().getDimensionPixelOffset(2131427812))
    {
      ab.d("MicroMsg.AppBrandDesktopSizeHelper", "alvinluo getLeftRightPadding: %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(133818);
      break;
    }
  }

  public static float dl(Context paramContext)
  {
    AppMethodBeat.i(133819);
    float f = a.am(paramContext, 2131427992) * dm(paramContext);
    ab.i("MicroMsg.AppBrandDesktopSizeHelper", "alvinluo iconSize: %f", new Object[] { Float.valueOf(f) });
    AppMethodBeat.o(133819);
    return f;
  }

  public static float dm(Context paramContext)
  {
    AppMethodBeat.i(133820);
    float f1 = a.dm(paramContext);
    float f2;
    if ((f1 != 1.625F) && (f1 != 1.875F))
    {
      f2 = f1;
      if (f1 != 2.025F);
    }
    else
    {
      f2 = 1.375F;
    }
    AppMethodBeat.o(133820);
    return f2;
  }

  public static int getScreenWidth(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(133815);
    try
    {
      int j;
      if ((paramContext.getResources().getConfiguration().orientation == 2) && (ae.hD(paramContext)))
      {
        j = ae.hy(paramContext).x;
        AppMethodBeat.o(133815);
      }
      for (i = j; ; i = j)
      {
        return i;
        j = paramContext.getResources().getDisplayMetrics().widthPixels;
        AppMethodBeat.o(133815);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandDesktopSizeHelper", paramContext, "alvinluo getScreenWidth exception", new Object[0]);
        AppMethodBeat.o(133815);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.d
 * JD-Core Version:    0.6.2
 */