package com.tencent.d.d.b;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class c
{
  private static Object Atg;
  private static Method Ath;
  private static boolean Ati;

  static
  {
    AppMethodBeat.i(114521);
    Atg = null;
    Ath = null;
    if (Build.VERSION.SDK_INT >= 14);
    while (true)
    {
      try
      {
        Atg = e.iB("libcore.io.Libcore", "os");
        Ath = e.a("libcore.io.Os", "stat", new Class[] { String.class });
        Ati = true;
        AppMethodBeat.o(114521);
        return;
      }
      catch (Throwable localThrowable)
      {
      }
      Ati = false;
      AppMethodBeat.o(114521);
    }
  }

  public static int atS(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(114520);
    if (!Ati)
      AppMethodBeat.o(114520);
    while (true)
    {
      return i;
      paramString = Ath.invoke(Atg, new Object[] { paramString });
      if (paramString == null)
      {
        AppMethodBeat.o(114520);
      }
      else
      {
        i = ((Integer)e.a(paramString.getClass(), "st_mode", paramString)).intValue();
        AppMethodBeat.o(114520);
      }
    }
  }

  public static boolean isAvailable()
  {
    return Ati;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.c
 * JD-Core Version:    0.6.2
 */