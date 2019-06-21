package com.google.android.exoplayer2.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static boolean DEBUG = true;
  private static a bdW = null;

  public static void a(a parama)
  {
    bdW = parama;
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(95229);
    if (bdW != null)
      bdW.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(95229);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(95227);
    if (bdW != null)
      bdW.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(95227);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(95228);
    if (bdW != null)
      bdW.w(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(95228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.d.b
 * JD-Core Version:    0.6.2
 */