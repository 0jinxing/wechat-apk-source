package com.tencent.mm.vending.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static a zXJ = null;

  public static void a(a parama)
  {
    zXJ = parama;
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126141);
    if (zXJ != null)
      zXJ.d(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(126141);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126138);
    if (zXJ != null)
      zXJ.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(126138);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126140);
    if (zXJ != null)
      zXJ.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(126140);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126142);
    if (zXJ != null)
      zXJ.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(126142);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126139);
    if (zXJ != null)
      zXJ.w(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(126139);
  }

  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void e(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void i(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject);

    public abstract void w(String paramString1, String paramString2, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.f.a
 * JD-Core Version:    0.6.2
 */