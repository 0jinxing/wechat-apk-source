package com.tinkerboots.sdk.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

public final class d
{
  private static String AUh;
  private static HashSet<String> AUi;

  static
  {
    AppMethodBeat.i(65559);
    AUi = new HashSet();
    AppMethodBeat.o(65559);
  }

  public static String dWm()
  {
    if (AUh == null);
    for (String str = ""; ; str = AUh)
      return str;
  }

  public static boolean dWn()
  {
    AppMethodBeat.i(65558);
    boolean bool;
    if (AUh == null)
    {
      bool = false;
      AppMethodBeat.o(65558);
    }
    while (true)
    {
      return bool;
      bool = AUi.contains(AUh);
      AppMethodBeat.o(65558);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.b.d
 * JD-Core Version:    0.6.2
 */