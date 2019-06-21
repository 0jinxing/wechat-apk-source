package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$1
  implements Runnable
{
  public c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26714);
    ab.i("MicroMsg.Note.NoteDataManager", "NoteDataManager onDestroy");
    this.uPg.den();
    c.a(this.uPg);
    c.b(this.uPg);
    c.c(this.uPg);
    c.dez();
    AppMethodBeat.o(26714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.c.1
 * JD-Core Version:    0.6.2
 */