package com.tencent.mm.i;

import com.tencent.mars.cdn.CdnLogic.BatchSnsReqImageData;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends e
{
  public String cFc;
  public int counter = 0;
  public CdnLogic.BatchSnsReqImageData[] egb;
  public int egj;
  public volatile boolean egk = false;

  public final boolean Jo()
  {
    if (this.egj == this.counter);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(128596);
    String str = String.format("feedId: %s, count:%d", new Object[] { this.cFc, Integer.valueOf(this.egj) });
    AppMethodBeat.o(128596);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.i.f
 * JD-Core Version:    0.6.2
 */