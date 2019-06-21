package com.tencent.mm.plugin.wenote.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

final class j$1
  implements Runnable
{
  j$1(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26649);
    j.a(this.uNK);
    this.uNK.ef(this.uNK.uMP.pJZ);
    if (k.deT() != null)
      k.deX();
    AppMethodBeat.o(26649);
  }

  public final String toString()
  {
    AppMethodBeat.i(26650);
    String str = super.toString() + "|dealWNoteInfo";
    AppMethodBeat.o(26650);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.j.1
 * JD-Core Version:    0.6.2
 */