package com.tencent.mm.ui.chatting.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;

final class e$a
  implements Runnable
{
  boolean cNi;
  d.a yYA;
  AtomicBoolean yYF;
  d.c yYJ;

  e$a(e parame, d.a parama, boolean paramBoolean, d.c paramc, AtomicBoolean paramAtomicBoolean)
  {
    this.yYA = parama;
    this.cNi = paramBoolean;
    this.yYJ = paramc;
    this.yYF = paramAtomicBoolean;
  }

  public final void run()
  {
    AppMethodBeat.i(32487);
    long l = System.currentTimeMillis();
    d.d locald = new d.d(this.yYA);
    com.tencent.mm.ui.chatting.l.e locale = this.yYJ.b(locald);
    e.b(this.yYI).a(this.yYA, locale, locald, new e.a.1(this, locald));
    ab.d("MicroMsg.ChattingLoader.ListDataLoader", "[LoadTask.run] cost:%dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(32487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.e.a
 * JD-Core Version:    0.6.2
 */