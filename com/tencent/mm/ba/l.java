package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ci;
import com.tencent.mm.sdk.b.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class l
{
  Map<Integer, Object<?>> fMp;
  public c fMq;
  public c fMr;

  public l()
  {
    AppMethodBeat.i(78479);
    this.fMp = new ConcurrentHashMap();
    this.fMq = new l.1(this);
    this.fMr = new c()
    {
    };
    AppMethodBeat.o(78479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.l
 * JD-Core Version:    0.6.2
 */