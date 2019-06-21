package com.tencent.mm.svg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  private static a ydv = null;

  public static void b(a parama)
  {
    ydv = parama;
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70130);
    if (ydv != null)
      ydv.d(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(70130);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70128);
    if (ydv != null)
      ydv.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(70128);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70129);
    if (ydv != null)
      ydv.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(70129);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70131);
    if (ydv != null)
      ydv.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(70131);
  }

  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void e(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void i(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.b.c
 * JD-Core Version:    0.6.2
 */