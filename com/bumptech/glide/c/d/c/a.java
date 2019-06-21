package com.bumptech.glide.c.d.c;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v7.view.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static volatile boolean aFO = true;

  public static Drawable a(Context paramContext, int paramInt, Resources.Theme paramTheme)
  {
    AppMethodBeat.i(92285);
    paramContext = a(paramContext, paramContext, paramInt, paramTheme);
    AppMethodBeat.o(92285);
    return paramContext;
  }

  private static Drawable a(Context paramContext1, Context paramContext2, int paramInt, Resources.Theme paramTheme)
  {
    AppMethodBeat.i(92286);
    try
    {
      if (aFO)
      {
        Object localObject;
        if (paramTheme != null)
        {
          localObject = new android/support/v7/view/d;
          ((d)localObject).<init>(paramContext2, paramTheme);
        }
        while (true)
        {
          localObject = android.support.v7.c.a.b.g((Context)localObject, paramInt);
          paramContext1 = (Context)localObject;
          AppMethodBeat.o(92286);
          return paramContext1;
          localObject = paramContext2;
        }
      }
    }
    catch (NoClassDefFoundError paramContext1)
    {
      while (true)
      {
        aFO = false;
        if (paramTheme == null)
          break;
        paramContext1 = android.support.v4.content.a.b.b(paramContext2.getResources(), paramInt, paramTheme);
        AppMethodBeat.o(92286);
      }
    }
    catch (IllegalStateException paramTheme)
    {
      while (true)
      {
        if (paramContext1.getPackageName().equals(paramContext2.getPackageName()))
        {
          AppMethodBeat.o(92286);
          throw paramTheme;
        }
        paramContext1 = android.support.v4.content.b.g(paramContext2, paramInt);
        AppMethodBeat.o(92286);
        continue;
        paramTheme = paramContext2.getTheme();
      }
    }
    catch (Resources.NotFoundException paramContext1)
    {
      label56: break label56;
    }
  }

  public static Drawable b(Context paramContext1, Context paramContext2, int paramInt)
  {
    AppMethodBeat.i(92284);
    paramContext1 = a(paramContext1, paramContext2, paramInt, null);
    AppMethodBeat.o(92284);
    return paramContext1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.c.a
 * JD-Core Version:    0.6.2
 */