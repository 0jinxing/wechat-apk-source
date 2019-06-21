package com.tencent.luggage.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51137);
    if ((a.a(this.bRx) != null) && (a.a(this.bRx).size() > 0))
      a.a(a.a(this.bRx), -1, "timeout", null);
    if ((a.a(this.bRx) != null) && (a.a(this.bRx).size() > 0))
      a.a(a.a(this.bRx), -1, "timeout", null);
    AppMethodBeat.o(51137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.f.a.a.3
 * JD-Core Version:    0.6.2
 */