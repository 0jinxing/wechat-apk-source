package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.tencent.matrix.trace.core.AppMethodBeat;

class r$c extends r.b
  implements Runnable
{
  final V8Array ciA;
  final long ciy;
  final boolean ciz;

  r$c(r paramr, l paraml, int paramInt, V8Function paramV8Function, V8Array paramV8Array, boolean paramBoolean, long paramLong)
  {
    super(paramr, paraml, paramInt, paramV8Function);
    this.ciy = paramLong;
    this.ciz = paramBoolean;
    this.ciA = paramV8Array;
  }

  final void cleanup()
  {
    AppMethodBeat.i(113881);
    super.cleanup();
    this.ciA.release();
    AppMethodBeat.o(113881);
  }

  public void run()
  {
    AppMethodBeat.i(113880);
    if (!isValid())
      AppMethodBeat.o(113880);
    while (true)
    {
      return;
      a(this.ciA);
      if (!isValid())
      {
        AppMethodBeat.o(113880);
      }
      else if (this.ciz)
      {
        schedule();
        AppMethodBeat.o(113880);
      }
      else
      {
        cleanup();
        AppMethodBeat.o(113880);
      }
    }
  }

  void schedule()
  {
    AppMethodBeat.i(113879);
    this.ciw.chO.f(this, this.ciy);
    AppMethodBeat.o(113879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.r.c
 * JD-Core Version:    0.6.2
 */