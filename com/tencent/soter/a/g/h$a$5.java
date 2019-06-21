package com.tencent.soter.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.d.b;

final class h$a$5
  implements Runnable
{
  h$a$5(h.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10502);
    if (this.AwP.AwL.AwF != null)
      this.AwP.AwL.AwF.onAuthenticationFailed();
    AppMethodBeat.o(10502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.h.a.5
 * JD-Core Version:    0.6.2
 */