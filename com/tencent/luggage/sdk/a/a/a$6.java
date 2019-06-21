package com.tencent.luggage.sdk.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class a$6
  implements Runnable
{
  a$6(a parama, Map paramMap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101638);
    if (this.bRa != null)
      a.c(this.bQU).putAll(this.bRa);
    a.a(this.bQU, this.bRb);
    AppMethodBeat.o(101638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.a.a.a.6
 * JD-Core Version:    0.6.2
 */