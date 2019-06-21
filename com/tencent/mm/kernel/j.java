package com.tencent.mm.kernel;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class j
{
  private static long eKJ;
  private static long eKK;
  private static volatile a eKL = null;

  public static void RU()
  {
  }

  public static void a(a parama)
  {
    eKL = parama;
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123271);
    if (eKL != null)
      eKL.d(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(123271);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123268);
    if (eKL != null)
      eKL.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(123268);
  }

  public static void h(String paramString, long paramLong)
  {
    AppMethodBeat.i(123266);
    ab.i("Blink-LOG", "since the %s : %s", new Object[] { paramString, Long.valueOf(System.nanoTime() - paramLong) });
    AppMethodBeat.o(123266);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123270);
    if (eKL != null)
      eKL.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(123270);
  }

  public static void jD(String paramString)
  {
    AppMethodBeat.i(123267);
    long l = SystemClock.elapsedRealtime() - eKK;
    ab.i("Blink-LOG", "since startup %s : %s", new Object[] { paramString, Long.valueOf(l) });
    String.format("since startup %s : %s", new Object[] { paramString, Long.valueOf(l) });
    AppMethodBeat.o(123267);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123272);
    if (eKL != null)
      eKL.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(123272);
  }

  public static void q(long paramLong1, long paramLong2)
  {
    eKJ = paramLong1;
    eKK = paramLong2;
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123269);
    if (eKL != null)
      eKL.w(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(123269);
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
 * Qualified Name:     com.tencent.mm.kernel.j
 * JD-Core Version:    0.6.2
 */