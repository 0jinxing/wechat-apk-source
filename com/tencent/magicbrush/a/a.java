package com.tencent.magicbrush.a;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static a.a bSA;

  static
  {
    AppMethodBeat.i(115854);
    bSA = new a.a()
    {
      public final int n(String paramAnonymousString, int paramAnonymousInt)
      {
        return 0;
      }

      public final Drawable o(String paramAnonymousString, int paramAnonymousInt)
      {
        return null;
      }
    };
    AppMethodBeat.o(115854);
  }

  public static void a(a.a parama)
  {
    bSA = parama;
  }

  public static a.a yA()
  {
    return bSA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.a.a
 * JD-Core Version:    0.6.2
 */