package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class p
{
  private static final Set<String> cfe;

  static
  {
    AppMethodBeat.i(137979);
    HashSet localHashSet = new HashSet();
    cfe = localHashSet;
    localHashSet.add(":nospace");
    cfe.add(":cuploader");
    cfe.add(":dexopt");
    cfe.add(":recovery");
    cfe.add(":fallback");
    AppMethodBeat.o(137979);
  }

  public static boolean By()
  {
    return false;
  }

  public static boolean cX(String paramString)
  {
    AppMethodBeat.i(137978);
    int i = paramString.indexOf(':');
    if (i != -1);
    for (paramString = paramString.substring(i); ; paramString = "")
    {
      boolean bool = cfe.contains(paramString);
      AppMethodBeat.o(137978);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.p
 * JD-Core Version:    0.6.2
 */