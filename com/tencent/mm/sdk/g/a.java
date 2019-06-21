package com.tencent.mm.sdk.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  static final ThreadLocal<String> xDy;

  static
  {
    AppMethodBeat.i(52522);
    xDy = new ThreadLocal();
    AppMethodBeat.o(52522);
  }

  public static String getTag()
  {
    AppMethodBeat.i(52521);
    String str = (String)xDy.get();
    AppMethodBeat.o(52521);
    return str;
  }

  protected static void setTag(String paramString)
  {
    AppMethodBeat.i(52520);
    xDy.set(paramString);
    AppMethodBeat.o(52520);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.a
 * JD-Core Version:    0.6.2
 */