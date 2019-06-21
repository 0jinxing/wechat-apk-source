package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a$a$a extends Throwable
{
  private a$a$a$a(a.a.a parama, a parama1)
  {
    super(parama.name, parama1);
  }

  public final Throwable fillInStackTrace()
  {
    AppMethodBeat.i(15351);
    setStackTrace(this.cdQ.cdP);
    AppMethodBeat.o(15351);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.a.a.a.a
 * JD-Core Version:    0.6.2
 */