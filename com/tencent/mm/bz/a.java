package com.tencent.mm.bz;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  private static float density;
  private static float scale;
  private static a xuo;
  private static SparseIntArray xup;

  static
  {
    AppMethodBeat.i(115145);
    xuo = null;
    density = -1.0F;
    xup = new SparseIntArray();
    scale = 0.0F;
    AppMethodBeat.o(115145);
  }

  public static int al(Context paramContext, int paramInt)
  {
    float f1 = 1.625F;
    AppMethodBeat.i(115129);
    float f2 = scale;
    if (f2 > 1.625F)
      f2 = f1;
    while (true)
    {
      if (xuo == null)
        if (paramContext == null)
        {
          ab.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(115129);
          paramInt = 0;
        }
      while (true)
      {
        return paramInt;
        int i = xup.get(paramInt, 0);
        int j = i;
        if (i == 0)
        {
          j = paramContext.getResources().getDimensionPixelSize(paramInt);
          xup.put(paramInt, j);
        }
        paramInt = (int)(f2 * j);
        AppMethodBeat.o(115129);
        continue;
        i = xup.get(paramInt, 0);
        j = i;
        if (i == 0)
        {
          j = xuo.dmI();
          xup.put(paramInt, j);
        }
        paramInt = (int)(f2 * j);
        AppMethodBeat.o(115129);
      }
    }
  }

  public static int am(Context paramContext, int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(115130);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(115130);
      }
    while (true)
    {
      return j;
      try
      {
        j = xup.get(paramInt, 0);
        i = j;
        j = i;
        if (i == 0)
        {
          j = paramContext.getResources().getDimensionPixelSize(paramInt);
          xup.put(paramInt, j);
        }
        AppMethodBeat.o(115130);
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ResourceHelper", localArrayIndexOutOfBoundsException, "[getDPSize] resId:%s", new Object[] { Integer.valueOf(paramInt) });
      }
      i = xup.get(paramInt, 0);
      j = i;
      if (i == 0)
      {
        j = xuo.dmI();
        xup.put(paramInt, j);
      }
      AppMethodBeat.o(115130);
    }
  }

  public static String an(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115131);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get string, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        paramContext = "";
        AppMethodBeat.o(115131);
      }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getResources().getString(paramInt);
      AppMethodBeat.o(115131);
      continue;
      paramContext = xuo.dmJ();
      AppMethodBeat.o(115131);
    }
  }

  public static int ao(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115134);
    paramInt = Math.round(paramInt / getDensity(paramContext));
    AppMethodBeat.o(115134);
    return paramInt;
  }

  public static float dm(Context paramContext)
  {
    AppMethodBeat.i(115135);
    if (scale == 0.0F)
      if (paramContext != null)
        break label32;
    label32: for (scale = 1.0F; ; scale = paramContext.getSharedPreferences(ah.doA(), 0).getFloat("text_size_scale_key", 1.0F))
    {
      float f = scale;
      AppMethodBeat.o(115135);
      return f;
    }
  }

  public static int fX(Context paramContext)
  {
    int i = 2;
    AppMethodBeat.i(115136);
    float f = dm(paramContext);
    if (f == 0.875F)
    {
      i = 1;
      AppMethodBeat.o(115136);
    }
    while (true)
    {
      return i;
      if (f == 1.0F)
      {
        AppMethodBeat.o(115136);
      }
      else if (f == 1.125F)
      {
        i = 3;
        AppMethodBeat.o(115136);
      }
      else if (f == 1.25F)
      {
        i = 4;
        AppMethodBeat.o(115136);
      }
      else if (f == 1.375F)
      {
        i = 5;
        AppMethodBeat.o(115136);
      }
      else if (f == 1.625F)
      {
        i = 6;
        AppMethodBeat.o(115136);
      }
      else if (f == 1.875F)
      {
        i = 7;
        AppMethodBeat.o(115136);
      }
      else if (f == 2.025F)
      {
        i = 8;
        AppMethodBeat.o(115136);
      }
      else
      {
        AppMethodBeat.o(115136);
      }
    }
  }

  public static float fY(Context paramContext)
  {
    AppMethodBeat.i(115137);
    float f = 1.0F;
    if (ga(paramContext))
      f = 1.3F;
    AppMethodBeat.o(115137);
    return f;
  }

  public static float fZ(Context paramContext)
  {
    AppMethodBeat.i(115138);
    float f = 1.0F;
    if (gb(paramContext))
      f = 1.2F;
    while (true)
    {
      AppMethodBeat.o(115138);
      return f;
      if (ga(paramContext))
        f = 1.1F;
    }
  }

  public static int fromDPToPix(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115133);
    paramInt = Math.round(getDensity(paramContext) * paramInt);
    AppMethodBeat.o(115133);
    return paramInt;
  }

  public static Drawable g(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115128);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get drawable, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        paramContext = null;
        AppMethodBeat.o(115128);
      }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getResources().getDrawable(paramInt);
      AppMethodBeat.o(115128);
      continue;
      paramContext = xuo.dmH();
      AppMethodBeat.o(115128);
    }
  }

  public static boolean ga(Context paramContext)
  {
    AppMethodBeat.i(115140);
    float f = dm(paramContext);
    scale = f;
    boolean bool;
    if (Float.compare(f, 1.125F) > 0)
    {
      bool = true;
      AppMethodBeat.o(115140);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115140);
    }
  }

  public static boolean gb(Context paramContext)
  {
    AppMethodBeat.i(115141);
    float f = dm(paramContext);
    scale = f;
    boolean bool;
    if (Float.compare(f, 1.375F) > 0)
    {
      bool = true;
      AppMethodBeat.o(115141);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115141);
    }
  }

  public static boolean gc(Context paramContext)
  {
    AppMethodBeat.i(115142);
    float f = dm(paramContext);
    scale = f;
    boolean bool;
    if (f == 0.875F)
    {
      bool = true;
      AppMethodBeat.o(115142);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115142);
    }
  }

  public static int gd(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(115143);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get widthPixels but context is null");
        AppMethodBeat.o(115143);
      }
    while (true)
    {
      return i;
      i = paramContext.getResources().getDisplayMetrics().widthPixels;
      AppMethodBeat.o(115143);
      continue;
      AppMethodBeat.o(115143);
    }
  }

  public static int ge(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(115144);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get heightPixels but context is null");
        AppMethodBeat.o(115144);
      }
    while (true)
    {
      return i;
      i = paramContext.getResources().getDisplayMetrics().heightPixels;
      AppMethodBeat.o(115144);
      continue;
      AppMethodBeat.o(115144);
    }
  }

  public static float getDensity(Context paramContext)
  {
    AppMethodBeat.i(115132);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    float f = localContext.getResources().getDisplayMetrics().density;
    density = f;
    AppMethodBeat.o(115132);
    return f;
  }

  public static ColorStateList h(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115127);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get color state list, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        paramContext = null;
        AppMethodBeat.o(115127);
      }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getResources().getColorStateList(paramInt);
      AppMethodBeat.o(115127);
      continue;
      paramContext = xuo.dmG();
      AppMethodBeat.o(115127);
    }
  }

  public static void h(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(115139);
    paramContext = paramContext.getSharedPreferences(ah.doA(), 0).edit();
    paramContext.putFloat("text_size_scale_key", paramFloat);
    paramContext.commit();
    scale = paramFloat;
    AppMethodBeat.o(115139);
  }

  public static int i(Context paramContext, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(115126);
    if (xuo == null)
      if (paramContext == null)
      {
        ab.e("MicroMsg.ResourceHelper", "get color, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(115126);
        paramInt = i;
      }
    while (true)
    {
      return paramInt;
      paramInt = paramContext.getResources().getColor(paramInt);
      AppMethodBeat.o(115126);
      continue;
      paramInt = xuo.dmF();
      AppMethodBeat.o(115126);
    }
  }

  public static abstract interface a
  {
    public abstract int dmF();

    public abstract ColorStateList dmG();

    public abstract Drawable dmH();

    public abstract int dmI();

    public abstract String dmJ();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bz.a
 * JD-Core Version:    0.6.2
 */