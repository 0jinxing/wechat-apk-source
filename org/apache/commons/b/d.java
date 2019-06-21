package org.apache.commons.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  private static final String BXc = "\"";
  private static final char[] BXd = { 44, 34, 13, 10 };

  public static String awL(String paramString)
  {
    AppMethodBeat.i(116956);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(116956);
    }
    while (true)
    {
      return paramString;
      paramString = b.BWT.unescape(paramString);
      AppMethodBeat.o(116956);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.d
 * JD-Core Version:    0.6.2
 */