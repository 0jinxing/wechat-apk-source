package com.google.android.exoplayer2.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class s$f extends IOException
{
  public s$f(Throwable paramThrowable)
  {
    super("Unexpected " + paramThrowable.getClass().getSimpleName() + ": " + paramThrowable.getMessage(), paramThrowable);
    AppMethodBeat.i(95851);
    AppMethodBeat.o(95851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.s.f
 * JD-Core Version:    0.6.2
 */