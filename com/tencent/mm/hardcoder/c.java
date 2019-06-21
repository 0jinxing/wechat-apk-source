package com.tencent.mm.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  private static a eEg = null;

  public static void a(a parama)
  {
    eEg = parama;
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93920);
    if ((HardCoderJNI.isHcDebug()) && (eEg != null))
      eEg.d(paramString1, paramString2);
    AppMethodBeat.o(93920);
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93921);
    if (eEg != null)
      eEg.e(paramString1, paramString2);
    AppMethodBeat.o(93921);
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93919);
    if (eEg != null)
      eEg.i(paramString1, paramString2);
    AppMethodBeat.o(93919);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(93922);
    if (eEg != null)
      eEg.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(93922);
  }

  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2);

    public abstract void e(String paramString1, String paramString2);

    public abstract void i(String paramString1, String paramString2);

    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.c
 * JD-Core Version:    0.6.2
 */