package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public final q uRP;
  public int uRQ;
  public int uRR;

  public a(q paramq, int paramInt1, int paramInt2)
  {
    this.uRP = paramq;
    this.uRQ = paramInt1;
    this.uRR = paramInt2;
  }

  public final String toString()
  {
    AppMethodBeat.i(26930);
    String str = this.uRP.name() + " - " + this.uRQ + "/" + this.uRR;
    AppMethodBeat.o(26930);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.a
 * JD-Core Version:    0.6.2
 */