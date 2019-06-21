package com.tencent.mm.splash;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
{
  public static final boolean wY;

  static
  {
    AppMethodBeat.i(114827);
    wY = F(System.getProperty("java.vm.version"));
    AppMethodBeat.o(114827);
  }

  private static boolean F(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(114826);
    boolean bool2 = bool1;
    Object localObject;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool2 = bool1;
      if (!((Matcher)localObject).matches());
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool2 = bool1;
        if (i == 2)
        {
          bool2 = bool1;
          if (j <= 0);
        }
      }
      else
      {
        bool2 = true;
      }
      localObject = new StringBuilder("VM with version ").append(paramString);
      if (bool2);
      for (paramString = " has multidex support"; ; paramString = " does not have multidex support")
      {
        ab.i("MicroMsg.MultiDex", paramString);
        AppMethodBeat.o(114826);
        return bool2;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.g
 * JD-Core Version:    0.6.2
 */