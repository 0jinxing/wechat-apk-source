package com.google.android.exoplayer2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class e extends Exception
{
  public final int aMM;
  public final int type;

  private e(int paramInt1, Throwable paramThrowable, int paramInt2)
  {
    super(null, paramThrowable);
    this.type = paramInt1;
    this.aMM = paramInt2;
  }

  public static e a(IOException paramIOException)
  {
    AppMethodBeat.i(94772);
    paramIOException = new e(0, paramIOException, -1);
    AppMethodBeat.o(94772);
    return paramIOException;
  }

  static e a(RuntimeException paramRuntimeException)
  {
    AppMethodBeat.i(94773);
    paramRuntimeException = new e(2, paramRuntimeException, -1);
    AppMethodBeat.o(94773);
    return paramRuntimeException;
  }

  public static e b(Exception paramException, int paramInt)
  {
    AppMethodBeat.i(94771);
    paramException = new e(1, paramException, paramInt);
    AppMethodBeat.o(94771);
    return paramException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e
 * JD-Core Version:    0.6.2
 */