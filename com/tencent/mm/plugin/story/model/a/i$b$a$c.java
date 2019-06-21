package com.tencent.mm.plugin.story.model.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class i$b$a$c
  implements Runnable
{
  i$b$a$c(i.b.a parama, tb paramtb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109241);
    tb localtb = this.rVb;
    j.o(localtb, "item");
    if (!i.e(localtb, (ak)this.rVa))
      this.rVa.sendEmptyMessage(0);
    AppMethodBeat.o(109241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.i.b.a.c
 * JD-Core Version:    0.6.2
 */