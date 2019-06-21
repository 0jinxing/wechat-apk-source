package com.tencent.mm.plugin.emojicapture.ui.b;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
public final class d$b
  implements Runnable
{
  public d$b(d paramd, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3157);
    d.a(this.loZ).onSurfaceCreated(d.b(this.loZ), this.loZ.loS);
    d.a(this.loZ).onSurfaceChanged(d.b(this.loZ), this.loZ.width, this.loZ.height);
    a locala = this.lpa;
    if (locala != null)
    {
      locala.invoke();
      AppMethodBeat.o(3157);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.d.b
 * JD-Core Version:    0.6.2
 */