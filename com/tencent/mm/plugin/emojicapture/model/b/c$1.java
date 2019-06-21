package com.tencent.mm.plugin.emojicapture.model.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.d;
import com.tencent.mm.plugin.gif.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$1
  implements Runnable
{
  c$1(c paramc, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2664);
    boolean bool = c.a(this.liu).EK();
    ab.i(c.b(this.liu), "init encoder, outputGif: " + this.liv + " ret: " + bool);
    d locald;
    if (!bool)
    {
      if (!this.liv)
        break label92;
      locald = d.lhz;
      d.bng();
    }
    while (true)
    {
      c.a(this.liu, bo.yz());
      AppMethodBeat.o(2664);
      return;
      label92: locald = d.lhz;
      d.bnf();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.c.1
 * JD-Core Version:    0.6.2
 */