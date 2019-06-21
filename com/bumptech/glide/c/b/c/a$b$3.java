package com.bumptech.glide.c.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b$3
  implements a.b
{
  public final void d(Throwable paramThrowable)
  {
    AppMethodBeat.i(92005);
    paramThrowable = new RuntimeException("Request threw uncaught throwable", paramThrowable);
    AppMethodBeat.o(92005);
    throw paramThrowable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c.a.b.3
 * JD-Core Version:    0.6.2
 */