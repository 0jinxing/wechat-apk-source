package com.tencent.mm.plugin.d.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class a$b
  implements Runnable
{
  private long jFL = 0L;
  private long jFM = 0L;

  public a$b(a parama, long paramLong1, long paramLong2)
  {
    this.jFL = paramLong1;
    this.jFM = paramLong2;
  }

  public final void run()
  {
    AppMethodBeat.i(18477);
    a locala = this.jIB;
    b localb1 = new b(this.jFL);
    long l = localb1.mSessionId;
    b localb2 = (b)locala.jFA.remove(Long.valueOf(l));
    if (localb2 != null)
      localb2.disconnect();
    locala.jFA.put(Long.valueOf(l), localb1);
    if (this.jIB.jIy != null)
      this.jIB.jIy.g(l, this.jFL, this.jFM);
    AppMethodBeat.o(18477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.a.b
 * JD-Core Version:    0.6.2
 */