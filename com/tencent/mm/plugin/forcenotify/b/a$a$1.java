package com.tencent.mm.plugin.forcenotify.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentLinkedQueue;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class a$a$1
  implements Runnable
{
  a$a$1(a.a parama, String paramString)
  {
  }

  public final void run()
  {
    boolean bool = true;
    AppMethodBeat.i(51024);
    a locala = this.msX.msV;
    String str = this.msY;
    j.o(str, "fromUser");
    if (a.b(this.msX.msV).size() == 1);
    while (true)
    {
      locala.aJ(str, bool);
      AppMethodBeat.o(51024);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.b.a.a.1
 * JD-Core Version:    0.6.2
 */