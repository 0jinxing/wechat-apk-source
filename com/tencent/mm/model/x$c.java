package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.q;

final class x$c
{
  String filename;
  boolean flo;
  String flp;
  int pos;
  String url;

  public x$c(x paramx, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(77802);
    this.flo = false;
    this.url = paramString1;
    if ((q.ahs()) && (paramx.flg))
      this.url = q.sy(this.url);
    this.filename = paramString2;
    this.pos = paramInt;
    this.flo = false;
    this.flp = paramString3;
    AppMethodBeat.o(77802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.x.c
 * JD-Core Version:    0.6.2
 */