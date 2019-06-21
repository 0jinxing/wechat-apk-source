package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class l$11
  implements Runnable
{
  l$11(l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113845);
    ab.i("MicroMsg.J2V8.V8ContextEngine", "destroy");
    for (int i = 0; i < this.chT.chQ.size(); i++)
      ((n)this.chT.chQ.get(i)).cleanup();
    V8Context localV8Context = this.chT.CB();
    if (localV8Context != null);
    while (true)
    {
      try
      {
        localV8Context.release();
        AppMethodBeat.o(113845);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.J2V8.V8ContextEngine", "destroy :%s", new Object[] { localException });
      }
      AppMethodBeat.o(113845);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.l.11
 * JD-Core Version:    0.6.2
 */