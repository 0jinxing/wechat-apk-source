package com.tencent.mm.ui.e.b;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  private static b zxp = null;

  public static void a(b paramb)
  {
    zxp = paramb;
  }

  public static Drawable io(String paramString1, String paramString2)
  {
    AppMethodBeat.i(107322);
    if (zxp != null)
    {
      paramString1 = zxp.dG(paramString1, paramString2);
      if ((paramString1 instanceof Drawable))
      {
        paramString1 = (Drawable)paramString1;
        AppMethodBeat.o(107322);
      }
    }
    while (true)
    {
      return paramString1;
      AppMethodBeat.o(107322);
      paramString1 = null;
      continue;
      AppMethodBeat.o(107322);
      paramString1 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.b.c
 * JD-Core Version:    0.6.2
 */