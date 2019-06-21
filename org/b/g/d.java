package org.b.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Pattern;

public final class d
{
  private static final Pattern BZq;

  static
  {
    AppMethodBeat.i(77307);
    BZq = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+");
    AppMethodBeat.o(77307);
  }

  private static void A(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(77310);
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.trim().length() > 0);
    }
    else
    {
      str = "Received an invalid parameter";
    }
    if (!paramBoolean)
    {
      paramString = new IllegalArgumentException(str);
      AppMethodBeat.o(77310);
      throw paramString;
    }
    AppMethodBeat.o(77310);
  }

  public static void jn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77309);
    if ((paramString1 != null) && (!paramString1.trim().equals("")));
    for (boolean bool = true; ; bool = false)
    {
      A(bool, paramString2);
      AppMethodBeat.o(77309);
      return;
    }
  }

  public static void r(Object paramObject, String paramString)
  {
    AppMethodBeat.i(77308);
    if (paramObject != null);
    for (boolean bool = true; ; bool = false)
    {
      A(bool, paramString);
      AppMethodBeat.o(77308);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.b.g.d
 * JD-Core Version:    0.6.2
 */